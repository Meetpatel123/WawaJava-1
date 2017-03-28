"use strict";

function calculate() {
  var mass   = parseFloat(document.getElementById("mass").value);
  var height = parseFloat(document.getElementById("height").value);
  $.ajax({
    url:      "http://localhost/webtrain/bmi-service.php",
    async:    true,
    type:     "post",
    data:     JSON.stringify({"mass": mass, "height": height}),
    headers:  {"Content-type": "application/json"},
    dataType: "json",
    success:  function (result) {
      document.getElementById("bmi").innerHTML        = result.bmi;
      document.getElementById("suggestion").innerHTML = result.suggestion;
    },
    error: function (xhr, status, error) {
      console.log(status);
      console.log(xhr);
      console.log(error);
    }
  });
}
