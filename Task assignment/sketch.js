// Project Title
// Your Name
// Date
//
// Extra for Experts:
// - describe what you did to take this project "above and beyond"
let button = {r:0,x:0,y:0,color:""}
let buttonpressed = false

function setup() {
  createCanvas(windowWidth, windowHeight);
  button.r=100;
  button.x=width/2-button.r/2;
  button.y=height/2-button.r/2;
  button.color="red";
}

function draw() {
  background(30);
  fill(255,0,0);
  mousepressed();
  if (buttonpressed===false){
    drawButton();
  }
  else if (buttonpressed===true){
    rect(200,200,50)
  }
  mousepressed();

}
function mousepressed(){
  if ((mouseX>button.r && mouseX < (button.r+button.x)) && (mouseY>button.r&&mouseY < (button.r+button.y))){
      buttonpressed = true;
  }
}
function drawButton() {
  fill(button.color);
  circle(button.x,button.y,button.r);
  rect(100,100,100)
}
