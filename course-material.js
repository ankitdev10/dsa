// ! RECURSION

function countDown(val) {
  if (val <= 0) {
    console.log("complete");
    return;
  }

  console.log(val);
  countDown(val - 1);
}

countDown(5);
