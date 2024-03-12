// Project Title
// Your Name
// Date
//
// Extra for Experts:
// - describe what you did to take this project "above and beyond"
let ballsArray=[];
function setup() {
  createCanvas(windowWidth, windowHeight);
  createBall();
}
function draw() {
  let r = random(0,255);
  let g = random (0,255);
  let b = random (0,255)
  background(30);
  fill(r,g,b);
  for (let i=0; i<ballsArray.length;i++){
    circle(ballsArray[i].x, ballsArray[i].y, ballsArray[i].diameter);
    ballsArray[i].x+=ballsArray[i].dx;
    ballsArray[i].y+=ballsArray[i].dy;
  }

}
function createBall(){
 let newBall={
    x:random(width),
    y:random(height),
    diameter:random(25,100),
    dx:random(-2,2),
    dy:random(-2,2),
 };
 ballsArray.push(newBall);
}
function mousePressed(){

  createBall();
  ballsArray[ballsArray.length-1].x=mouseX
  ballsArray[ballsArray.length-1].y=mouseY
}
