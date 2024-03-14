let buttonPressed = false;
let myButton = {x: 0, y: 0, w: 0, h: 0, color: ""}

function setup() {
  createCanvas(windowWidth, windowHeight);

  myButton.w = 120;
  myButton.h = 40;
  myButton.x = width/2 - myButton.w/2;
  myButton.y = height/2 - myButton.h/2;
  myButton.color = "red";
}

function draw() {
  background(220);

  if (buttonPressed===false) {
    drawButton();
  }
}


function mousePressed() {

  if (mouseX > myButton.x && mouseX < (myButton.x + myButton.w)) {
    if(true) {
      buttonPressed = true;
    }
    
  }

}
function drawButton() {
  fill(myButton.color);
  rect(myButton.x, myButton.y, myButton.w, myButton.h);
}