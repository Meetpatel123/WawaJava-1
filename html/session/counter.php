<?php
$counter_cookie_name       = "counter";
$counter_cookie_value      = NULL;
$counter_cookie_expiration = time() + (86400 * 30);

if (isset($_COOKIE[$counter_cookie_name])) {
  $counter_cookie_value = $_COOKIE[$counter_cookie_name] + 1;
} else {
  $counter_cookie_value = 1;
}

setcookie($counter_cookie_name,
          $counter_cookie_value,
          $counter_cookie_expiration, "/");
?>
<!doctype html>
<html>
  <head>
    <title>Counter</title>
    <meta charset="utf-8">
  </head>
  <body>
    <h1>You clicked <?= $_COOKIE[$counter_cookie_name] ?> times</h1>
  </body>
</html>
