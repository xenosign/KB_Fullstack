function displayA() {
  console.log('A');
}
function displayB() {
  setTimeout(function () {
    console.log('B');
  }, 1000);
}

function displayC() {
  console.log('C');
}

displayA();
displayB();
displayC();
