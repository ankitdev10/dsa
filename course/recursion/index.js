// ! RECURSION

// function countDown(val) {
//   if (val <= 0) {
//     console.log("complete");
//     return;
//   }

//   console.log(val);
//   countDown(val - 1);
// }

// countDown(5);

// ? Write a function called power which accepts a base and an exponent. The function should return the power of the base to the exponent. This function should mimic the functionality of Math.pow()  - do not worry about negative bases and exponents.

// function power(base, exponential) {
//   if (exponential == 0) return 1;

//   return base * power(base, exponential - 1);
// }

// console.log(power(2, 10));

//  ? productOfArray: Write a function called productOfArray which takes in an array of numbers and returns the product of them all.

// const productOfArray = (arr) => {
//   let i = arr.length;
//   if (i == 0) return 1;
//   return arr[i - 1] * productOfArray(arr.slice(0, i - 1));
// };

// console.log(productOfArray([1, 2, 3]));

// console.log([1, 4, 5]);

// ! Write a recursive function called reverse which accepts a string and returns a new string in reverse.

// const reverse = (str) => {
//   if (str.length == 0) {
//     return str;
//   }
//   return str[str.length - 1] + reverse(str.slice(0, str.length - 1));
// };

// console.log(reverse("cat"));

// ! isPalindrome
// Write a recursive function called isPalindrome which returns true if the string passed to it is a palindrome (reads the same forward and backward). Otherwise it returns false.\

// const isPal = (str) => {
//   if (str.length == 0) return true;
//   if (str[0] !== str[str.length - 1]) return false;

//   return isPal(str.slice(1, str.length - 1));
// };

const linearSearchHelper = function (arr, key, index) {
  if (key === arr[index]) return index;

  if (index === arr.length - 1) return -1;

  return linearSearchHelper(arr, key, (index = index + 1));
};

const linearSearch = (arr, key) => {
  return linearSearchHelper(arr, key, 0);
};

console.log(linearSearch([1, 2, 3, 5, 6, 7], 7));
