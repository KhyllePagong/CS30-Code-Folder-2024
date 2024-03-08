// Project Title
// Your Name
// Date
//
// Extra for Experts:
// - describe what you did to take this project "above and beyond"

let angle=0
function setup() {
  createCanvas(windowWidth, windowHeight);
  angleMode(DEGREES);
}

function draw() {
  background(220);
  noStroke();
  fill(0,255,150)
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
  //--------------------------//
  fill('yellow');
  translate(width/1.39,height/1.5);
  rotate(angle);
  line(0,0,50,50);
  rect(0,0,50,50);
  angle = angle + 10;
}
