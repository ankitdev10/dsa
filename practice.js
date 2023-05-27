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

// There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

// Example

// There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .

// Function Description

// Complete the sockMerchant function in the editor below.

// sockMerchant has the following parameter(s):

// int n: the number of socks in the pile
// int ar[n]: the colors of each sock
// Returns

// int: the number of pairs

// function sockMerchant(n, ar) {
//   let obj = {};
//   let pairs = 0;
//   for (let el of ar) {
//     obj[el] = (obj[el] || 0) + 1;
//   }
//   for (let el in obj) {
//     pairs += Math.floor(obj[el] / 2);
//   }
//   console.log(pairs);
// }

// sockMerchant(7, [1, 2, 1, 2, 1, 3, 2]);
