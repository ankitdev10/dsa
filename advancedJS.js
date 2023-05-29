// ! REST AND SPREAD OPERAOTRs
//  ! local and global scope
// ! CLOSURES
// ! EVENT LOOP
// ! DEBOUNCING

//  ? REST AND SPREAD OPERATOR
//  when you dont know the exact number of args that could be in our function, we can use rest operator

// const myFunc = (...args) => {
//   let obj = {};
//   for (let el of args) {
//     obj[el] = el;
//     console.log(obj);
//   }
// };

// myFunc("a", "b", "c");

//  ! local and global scope

// The main differences between var, let, and const in JavaScript are related to their scope, hoisting behavior, and reassignment capabilities:

// Scope:
// var variables are function-scoped. They are accessible throughout the entire function in which they are declared, and if declared outside of any function, they become globally scoped.
// let and const variables are block-scoped. They are limited to the block (enclosed within curly braces) in which they are declared, such as within loops or if statements.
// Hoisting:
// var declarations are hoisted to the top of their function or global scope. This means you can access and assign a value to a var variable before it is declared in the code. However, the initial value will be undefined until it is assigned a value.
// let and const declarations are also hoisted, but they are not initialized. This means you cannot access or assign a value to a let or const variable before it is declared in the code. It will result in a ReferenceError if you try to access it before the declaration.
// Reassignment:
// var and let variables can be reassigned with a new value after declaration.
// const variables, as the name suggests, are constants and cannot be reassigned once they have been assigned a value. However, it's important to note that if a const variable holds a reference to an object, the properties of the object can still be modified.

//  ! CLOSURES

// // It is a combination of functions which allows inner function to access variable of outer function

// const outerFunc = () => {
//   const name = "ankit";

//   const innerFunction = () => {
//     console.log(name);
//   };

//   //   here  the main(outer function returns inner function)
//   return innerFunction;
// };

// let val = outerFunc();
// val();
// function func1() {
//   setTimeout(() => {
//     console.log(x);
//     console.log(y);
//   }, 3000);

//   var x = 2;
//   let y = 12;
// }
// func1();
