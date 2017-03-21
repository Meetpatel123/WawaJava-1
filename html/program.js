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
