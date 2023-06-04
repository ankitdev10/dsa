class Node {
  constructor(val) {
    this.val = val;
    this.next = null;
  }
}

class SinglyLinkedList {
  constructor() {
    this.length = 0;
    this.head = null;
    this.tail = null;
  }
  push(val) {
    let newNode = new Node(val);
    if (!this.head) {
      this.head = newNode;
      this.tail = this.head;
    } else {
      // aile ko tail node le naya node point garxaa
      this.tail.next = newNode;
      // aaba naya tail bhaneko chai yei naya node hunxa
      this.tail = newNode;
    }
    this.length++;
    return this;
  }
  traverse() {
    let current = this.head;
    //  suru ma euta head xaaa

    //  aaba head bhaneko node ho, taba samma traverse garne jaba samma head.next le null didaina. null dinu ko matlab last element ma pugyo
    while (current) {
      console.log(current.val);
      current = current.next;
    }
  }

  pop() {
    if (!this.head) return "Empty list";
    // pop bhanesi last ko hatxa, so gotta track last node(using current) and also the second last node(newTaill), kinaki aaba tail bhaneko ta second last node hunxa
    let current = this.head;
    let newTail;
    while (current.next) {
      newTail = current; // second last ma pugyo
      current = current.next; // yo chai aaba last ma bhayo ani yellai hataune
    }
    this.tail = newTail;
    this.tail.next = null;
  }

  insertAtFirst(val) {
    //  yo aba first ma halna aateko node
    let newNode = new Node(val);

    // yo chai aile first ma bhako node
    let firstNode = this.head;
    // firstNode nai xaina bhane list khali xa kinaki head nai xainaa, teso bhaye naya node nai head ho naya node nai tail ho
    if (!firstNode) {
      this.head = newNode;
      this.tail = newNode;
    } else {
      // aaba chai naya head bhaneko bhakar banako nodeee
      this.head = newNode;

      //  aaba head bhaneko maile bhakar banako node bhaisakyo, aaba naya head ko next le chai yo bhanda aagadi ko node llai point garxa
      this.head.next = firstNode;
    }

    this.length++;
  }
}

module.exports = SinglyLinkedList;
