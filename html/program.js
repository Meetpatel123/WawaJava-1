"use strict";

var d = {
    "dom": "house",
    "brama": "gate",
    "ogród": "garden",
    "lekcja": "lesson"
};

function factorial(n) {
    if (n === 0) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}

var document;

function fib(n) {
    if (n === 0 || n === 1) {
        return n;
    } else {
        return fib(n - 1) + fib(n - 2);
    }
}

function withMsecs(expr) {
    var t1 = performance.now();
    var value = expr();
    var t2 = performance.now();
    return {value: value, msecs: (t2 - t1)};
}

function logging(msg, expr) {
    console.log("STARTING " + msg + " ...");
    var value = expr();
    console.log("... DONE");
    return value;
}

function loggingWithMsecs(msg, expr) {
    return logging(msg, function() {
        return withMsecs(expr);
    });
}

function onActionPerformed() {
    var n = parseInt(document.getElementById("n").value);
    if (isNaN(n)) {
        document.getElementById("result").innerHTML = "";
    } else {
        var result = loggingWithMsecs("fib(n)", function() {
            return fib(n);
        });
        document.getElementById("result").innerHTML = "" + result.value +
            " in " + result.msecs + " msecs";

        // var t1 = performance.now();
        // var v  = fib(n);
        // var t2 = performance.now();
        // document.getElementById("result").innerHTML = "" + v + " in " +
        //     (t2 - t1) + " msecs";
    }
}

var RESET = 0;
function makeSequence(start) {
  var state = start;
  return function(flag) {
    if (flag === RESET) {
      var result = state - 1;
      state = start;
      return result;
    } else {
      return state++;
    }
  };
}

// Excercise 01. Create a mechanizm that calls window.alert(...)
//               when a computation (expr) evaluates to NaN.

function alertingNaN(expr) {
  var value = expr();
  if (isNaN(value)) window.alert("We have a NaN here!!!");
  return value;
}

console.log(alertingNaN(function () {
  return 1 + 3;
}));

// console.log(alertingNaN(function () {
//   return 0 / 0;
// }));

// Excercise 02. Create a mechanizm that logs to a console when
//               a result of a computation (expr) is even.

// Ratios in JS

function makeRatio(n, d) {
  return {n: n, d: d};
}

function   num(r) { return r.n; }
function denom(r) { return r.d; }

function mult(r1, r2) {
  return makeRatio(num(r1) * num(r2), denom(r1) * denom(r2));
}

// Ratios in JS - Alternate Take

function makeRatio(n, d) {
  return function(x) {
    return x === 0 ? n : d;
  };
}

function   num(r) { return r(0); }
function denom(r) { return r(1); }

function mult(r1, r2) {
  return makeRatio(num(r1) * num(r2), denom(r1) * denom(r2));
}
