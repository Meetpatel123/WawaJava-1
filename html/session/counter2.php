<?php
session_start();
$counter = NULL;

if (isset($_SESSION["counter"])) {
  $counter = $_SESSION["counter"];
} else {
  $counter = 0;
}

$counter += 1;
$_SESSION["counter"] = $counter;
?>
<!doctype html>
<html>
  <head>
    <title>Counter</title>
    <meta charset="utf-8">
  </head>
  <body>
    <h1>You clicked <?= $counter ?> times</h1>
  </body>
</html>
