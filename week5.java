/* 
=======================
PART 1: Variables, Data Types, Operators, Conditionals
=======================
*/

// Example variable and conditional
let age = 20;
if (age >= 18) {
    console.log("You are eligible to vote.");
} else {
    console.log("You are not eligible to vote.");
}

/* 
=======================
PART 2: Functions
=======================
*/

// Function 1: Greeting user
function greetUser() {
    let name = document.getElementById("username").value;
    if (name.trim() !== "") {
        document.getElementById("greeting").innerText = "Hello, " + name + "!";
    } else {
        document.getElementById("greeting").innerText = "Please enter your name.";
    }
}

// Function 2: Calculate total
function calculateTotal(price, quantity) {
    return price * quantity;
}
console.log("Total cost:", calculateTotal(500, 3));

/* 
=======================
PART 3: Loops
=======================
*/

// Loop Example 1: Countdown
function startCountdown() {
    let list = document.getElementById("countdown-list");
    list.innerHTML = ""; // Clear previous countdown
    for (let i = 5; i >= 1; i--) {
        let li = document.createElement("li");
        li.textContent = i;
        list.appendChild(li);
    }
}

// Loop Example 2: Array iteration
let fruits = ["Apple", "Banana", "Mango"];
fruits.forEach(function(fruit) {
    console.log("I like", fruit);
});

/* 
=======================
PART 4: DOM Manipulation
=======================
*/

// DOM Example 1: Change text
document.getElementById("greeting").innerText = "Welcome to the page!";

// DOM Example 2: Toggle visibility
function toggleBox() {
    let box = document.getElementById("box");
    if (box.style.display === "none") {
        box.style.display = "block";
    } else {
        box.style.display = "none";
    }
}

// DOM Example 3: Create a new element
let newPara = document.createElement("p");
newPara.textContent = "This paragraph was created with JavaScript.";
document.body.appendChild(newPara);
