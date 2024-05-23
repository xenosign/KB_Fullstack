function displayA() {
  console.log('A');
}

function displayB(cb) {
  setTimeout(function () {
    console.log('B');
    cb();
  }, 3000);
}

function displayC() {
  console.log('C');
}

displayA();
displayB(displayC);
