<?php
$data   = file_get_contents('php://input') or die("No data sent!!!");
$data   = json_decode($data, true);
$mass   = $data["mass"];
$height = $data["height"];
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

$json = array("bmi"        => $bmi,
              "suggestion" => $suggestion);

header('Content-type: application/json');
echo json_encode($json);
?>
