// ! GIVEN TWO ARRAYS, CHECK IF ARR2 CONTAINS SQUARED ELEMENTS FROM ARRAY 1

//? NAIVE SOLUTION

const same = (arr1, arr2) => {
  if (arr1.length !== arr2.length) return false;

  arr1 = arr1.sort((a, b) => a - b);
  arr2 = arr2.sort((a, b) => a - b);
  for (let i = 0; i < arr1.length; i++) {
    if ((arr2[i] == arr1[i]) * arr1[i]) {
      return true;
    }
    return false;
  }
};

console.log(same([1, 1, 2, 3], [1, 1, 9, 4]));
