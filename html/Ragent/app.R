library(data.table)
library(ggplot2)
library(shiny)

# DATA PART
dt <- fread("offers.csv")

m1 <- lm(formula = price~area, data = dt)

suggest <- function(area) {
  predict(m1, data.table(area = area))[[1]]
}

generatePlot <- function(area) {
  a1 <- aes(x = area, y = price)
  s  <- suggest(area)
  ggplot(data = dt) + geom_point(a1, shape = 19, alpha = 0.25) +
    geom_smooth(a1, method = "lm") +
    geom_vline(xintercept = area, linetype = "dotted") +
    geom_hline(yintercept = s, linetype = "dotted") +
    ggtitle(paste("Suggested price is", s, "PLN"))
}

# WEB PART
ui <- fluidPage(
  sliderInput(inputId = "area",
              label   = "Area [m^2]",
              min     = 10,
              max     = 500,
              value   = 55),

  plotOutput(outputId = "resultPlot"))

server <- function(input, output) {
  output$resultPlot <- renderPlot({ generatePlot(input$area) })
}

shinyApp(ui = ui, server = server)
