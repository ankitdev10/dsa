// ! MULTIPLE POITERS PATTERN

// ? WRITE A FUNCTION CALLED sumZero which accepts a sorted array of integres. THe functiona shlould find the first two pairs wwhose sum is the given 'goal'

// const sumZero = (arr, goal) => {
//   for (let i = 0; i < arr.length; i++) {
//     let num = arr[i];
//     let complement = Math.abs(num - goal);
//     console.log(complement);
//     if (arr.indexOf(complement) !== -1) {
//       return [num, complement];
//     }
//     return false;
//   }
// };

// console.log(sumZero([1, 2, 3, 4, 5], 6));
// ! GIVEN TWO ARRAYS, CHECK IF ARR2 CONTAINS SQUARED ELEMENTS FROM ARRAY 1

//? NAIVE SOLUTION

// const same = (arr1, arr2) => {
//   if (arr1.length !== arr2.length) return false;

//   arr1 = arr1.sort((a, b) => a - b);
//   arr2 = arr2.sort((a, b) => a - b);
//   for (let i = 0; i < arr1.length; i++) {
//     if ((arr2[i] == arr1[i]) * arr1[i]) {
//       return true;
//     }
//     return false;
//   }
// };

// console.log(same([1, 1, 2, 3], [1, 1, 9, 4]));

// ! Frequency Counter - sameFrequency

// Write a function called sameFrequency. Given two positive integers, find out if the two numbers have the same frequency of digits.

// Your solution MUST have the following complexities:

// Time: O(N)

// Sample Input:

// sameFrequency(182,281) // true
// sameFrequency(34,14) // false
// sameFrequency(3589578, 5879385) // true
// sameFrequency(22,222) // false

// const sameFrequency = (num1, num2) => {
//   const strnum1 = num1.toString();
//   const strnum2 = num2.toString();
//   let freqCount = {};

//   if (strnum1.length !== strnum2.length) return false;

//   for (let el of strnum1) {
//     freqCount[el] = (freqCount[el] || 0) + 1;
//   }

//   for (let el of strnum2) {
//     console.log(freqCount);
//     if (!freqCount[el]) {
//       return false;
//     }
//     freqCount[el]--;
//   }
//   return true;
// };

// console.log(sameFrequency(18, 81));

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
