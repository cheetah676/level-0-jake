 void setup() {
  size(800, 800);
}

void draw() {
  background (90, 80, 40);
   //2. make it a nice color
    fill(200, 50, 30);
   //3. if the mouse is pressed, fill the circle with a different color          
  if (mousePressed){
  fill (random (255), random (255), random (255));} 
   //1. draw an ellipse
    ellipse(100, 500, 100, 300);

// Copyright Wintriss Technical Schools 2013
}



