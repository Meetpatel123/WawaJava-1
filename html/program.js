var d = {
  "dom": "house",
  "brama": "gate",
  "ogród": "garden",
  "lekcja": "lesson"
};

function factorial(n) {
  if (n == 0) return 1;
  else return n * factorial(n-1);
}

function onActionPerformed() {
  var n = parseInt(document.getElementById("n").value);
  if (isNaN(n)) {
    document.getElementById("result").innerHTML = "";
  }
  else {
    document.getElementById("result").innerHTML = factorial(n);
  }
}
