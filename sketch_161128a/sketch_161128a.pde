void setup(){
  size (400, 400);
  background (20, 130, 60);
  for(int i=110; i>=1; i-=11){
    if ((i % 2)==0){
  fill (255, 0, 0);
  }
  else{
    fill(255, 255, 255);
    
    
  }
  ellipse (200, 200, i, i);
  triangle(200, 200, 230, 225, 170, 225);
 line (200, 200, 200, 350);
  
  }
  }
  


