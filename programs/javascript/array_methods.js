const fruits = ["Banana", "Orange", "Apple", "Mango"];
// The pop() method removes the last element from an array:
fruits.pop();

// The push() method adds a new element to an array (at the end):
fruits.push("Kiwi");

// The shift() method removes the first array element and "shifts" all other elements to a lower index.
fruits.shift();

// The unshift() method adds a new element to an array (at the beginning), and "unshifts" older elements:
fruits.unshift("Lemon");

// final array
console.log(fruits);