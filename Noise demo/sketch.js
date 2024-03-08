let x, y, z;
let time = 0
let time2= 2
let color,color2,color3;
function setup() {
  createCanvas(windowWidth, windowHeight);
  x = width/2
  y = height/2
  z = 10
  color1=0
  color2=0
  color3=0
}

function draw() {
  background(0);
  x = noise(time+4) * width;
  y = noise(time2 + 2) * height;
  z = noise(y-x) * width;
  color = noise(time)*width;
  color2 = noise(time)*width;
  color3 = noise(time)*width;
  fill (noise(x)*255,noise(y)*255,noise(z)*255);
  circle(x,y,z);
  time += 0.01;
  time2 -= 0.02
}
