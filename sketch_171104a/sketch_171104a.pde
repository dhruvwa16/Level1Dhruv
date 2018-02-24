
float x;
float y;

void setup(){
  size(1000, 1000); 
  background(0, 0, 0);
  noStroke();
}
void draw(){

  for(int a = 10; a < 5000; a++){
  float red = random(255);
 float green = random(255);
  float blue = random(255);
   //x = random(1000);
   //y = random(1000);
  ellipse(x,y,5,5);
  fill(red,  green, blue);
  x= getWormX(a);
   y= getWormY(a);
   
  }
  makeMagical();
}
float frequency = 0.01;
float noiseInterval = PI/5; 

void makeMagical() {
  fill( 0, 0, 0, 10 );rect(0, 0, width, height);noStroke();
}

float getWormX(int i) {
  return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
  return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}