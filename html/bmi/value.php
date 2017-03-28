<!doctype html>
<html>
  <head>
    <title>BMI Value</title>
    <meta charset="utf-8">
  </head>
  <body>
    <?php
      $mass   = $_GET["mass"]      or die("No mass passed!!!");
      $height = $_GET["height"]    or die("No height passed!!!");
      $mass   = doubleval($mass)   or die("Illegal mass!!!");
      $height = doubleval($height) or die("Illegal height!!!");

      $bmi = $mass / ($height * $height);

      $suggestion = NULL;
      if ($bmi < 18.5) {
        $suggestion = "UNDERWEIGHT";
      } elseif ($bmi <= 25) {
        $suggestion = "NORMAL";
      } elseif ($bmi <= 30) {
        $suggestion = "OVERWEIGHT";
      } else {
        $suggestion = "OBESE";
      }
    ?>
    Your BMI is <?= $bmi ?><br>
    You are <?= $suggestion ?>
  </body>
</html>
