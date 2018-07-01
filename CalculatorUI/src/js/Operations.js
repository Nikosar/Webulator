
function addNumber(number) {
    var output = document.getElementById("output");
    if (output.innerText === "0") {
        output.innerHTML = '';
    }
    output.innerHTML += number;
}

function clearOutput() {
    var output = document.getElementById("output");
    output.innerHTML = '0';
}

function addDot() {
    var output = document.getElementById("output");
    if (output.innerText.search(".") !== 1) {
        output.innerHTML += '.';
    }
}

function invert() {
    var output = document.getElementById("output");
    output.innerHTML = (-parseFloat(output.innerHTML)).toString();
}

function percent() {
    var output = document.getElementById("output");
    output.innerHTML = (parseFloat(output.innerHTML)/100).toString();
}