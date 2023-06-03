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

// ! leet code qn no 13. ROMAN TO INTEGER

// var romanToInt = function (s) {
//   let sum = 0;
//   let obj = {
//     I: 1,
//     V: 5,
//     X: 10,
//     L: 50,
//     C: 100,
//     D: 500,
//     M: 1000,
//   };
//   let arr = Object.keys(obj);
//   for (let el = 0; el < s.length; el++) {
//     let currentEl = s[el];
//     let preecedingEl = s[el + 1];
//     if (arr.indexOf(currentEl) < arr.indexOf(preecedingEl)) {
//       sum -= obj[currentEl];
//     } else {
//       sum += obj[currentEl];
//     }
//   }
//   return sum;
// };

// console.log(romanToInt("VI"));

//! LEET CODE valid parentheses
// var isValid = function (s) {
//   let mapping = { ")": "(", "}": "{", "]": "[" };
//   let stack = [];
//   for (let el of s) {
//     if (el in mapping) {
//       if (stack[stack.length - 1] === mapping[el]) {
//         stack.pop();
//       } else {
//         return false;
//       }
//     } else {
//       stack.push(el);
//       console.log(stack);
//     }
//   }
//   if (stack.length == 0) {
//     return true;
//   } else return false;
// };

// console.log(isValid("({{{{}}}))"));

// ! FIBONACCI WITHOUT RECURSION

// function fib(n) {
//   if (n == 1) return 0;
//   if (n < 3) return 1;

//   let first = 0;
//   let second = 1;
//   let third = 0;
//   for (let i = 0; i < n - 1; i++) {
//     third = first + second;
//     first = second;
//     second = third;
//   }
//   return third;
// }

// console.log(fib(35));

// ! 347. Top K Frequent Elements

// var topKFrequent = function (nums, k) {
//   var count = {};

//   nums.forEach((num) => {
//     if (count[num]) {
//       count[num] += 1;
//     } else {
//       count[num] = 1;
//     }
//   });

//   let array = Object.entries(count).sort((a, b) => {
//     return b[1] - a[1];
//   });
//   console.log(array);
//   let tests = [];
//   for (let i = 0; i < k; i++) {
//     tests.push(array[i][0]);
//   }
//   return tests;
// };

// ! BUBBLE SORT

// const sort = (arr) => {
//   let temp;
//   for (let i = 0; i < arr.length - 1; i++) {
//     for (let j = 0; j < arr.length - 1; j++) {
//       if (arr[j] > arr[j + 1]) {
//         temp = arr[j + 1];
//         arr[j + 1] = arr[j];
//         arr[j] = temp;
//       }
//     }
//   }
//   return arr;
// };

// console.log(sort([100, 1, 121, 12, 2, 6, 7, 1]));

//  ! 14. Longest Common Prefix
// var longestCommonPrefix = function (strs) {
//   let prefix = strs[0];
//   for (let i = 1; i < strs.length; i++) {
//     while (strs[i].indexOf(prefix) !== 0) {
//       console.log({ i: strs[i].indexOf(prefix), prefix });
//       prefix = prefix.slice(0, prefix.length - 1);
//       console.log({ prefix });
//       console.log(strs[i].indexOf(prefix));
//       if (prefix == "") {
//         return "";
//       }
//     }
//   }
//   let endTime = new Date().getTime();
//   return prefix;
// };

// console.log(longestCommonPrefix(["flower", "flow", "flArida"]));

// ! 976. Largest Perimeter Triangle

// var largestPerimeter = function(arr) {
//   //  sort the array in descending order.
//  const sort = arr.sort((a,b) => b - a)
//   for(let i = 0; i < sort.length; i++){
//       if(arr[i] < arr[i +1] + arr[i + 2])
//       return arr[i] + arr[i+1] + arr[i + 2]
//   }
//   return 0

// };
