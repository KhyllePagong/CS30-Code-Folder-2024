let buttonPressed = false;
let myButton = {x: 0, y: 0, w: 0, h: 0, color: ""}
let x = 0;
let y = 0;
let z = 0;
let timer = 5;
function setup() {
  createCanvas(windowWidth, windowHeight);

  myButton.w = 120;
  myButton.h = 40;
  myButton.x = width/2 - myButton.w/2;
  myButton.y = height/9 - myButton.h/2;
  myButton.color = "red";
}

function draw() {
  background(0);
  if (buttonPressed===false) {
    drawButton();
  }
  else {
    character();
    myButton.color=(0,255,150);
    drawButton();
    if (frameCount % 60 === 0 && timer > 0){
      timer--;
    }
    if (timer===0){
      myButton.color="red";
      buttonPressed=false;
      timer=5;
    }
    }
}
function mousePressed() {

  if (mouseX > myButton.x && mouseX < (myButton.x + myButton.w)) {
    if(mouseY > myButton.y && mouseY < (myButton.y + myButton.h)) {
      buttonPressed = true;
    }
    
  }

}
function drawButton() {
  fill(myButton.color);
  rect(myButton.x, myButton.y, myButton.w, myButton.h);
}
function character() {
  let a = 0;
  background(220);
  noStroke();
  rotate(a);
  fill(0,255,150);
  rect(width/4,height/4,300,300);
  fill(0);
  rect(width/4,height/3,100,100);
  rect(width/1.96,height/3,100,100);
  fill(255);
  rect(width/4,height/3,50,50);
  rect(width/1.96,height/3,50,50);
  fill(255,0,0);
  rect(width/3.2,height/2,200,45);
  fill(0,255,150);
  rect(width/2,height/1.2,50,100);
  rect(width/3.1,height/1.2,50,100);
  rect(width/1.7,height/1.5,100,50);
  rect(width/5.5,height/1.5,100,50);
  circle(width/2.25,height/1.36,250); 
}