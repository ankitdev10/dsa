const SinglyLinkedList = require("./index");

const list = new SinglyLinkedList();
list.push(1);
list.push(2);
list.push(3);

console.log(list);

list.shift();

console.log("after shiftinh");
console.log(list);
