int x;
int y;
void setup() {
  PImage face = loadImage("pennywise.jpg");
  face.resize(width, height);
    background(face);
  size(1950,1200);
}


void draw() {
  x = mouseX;
  y = mouseY;
  if(mouseX < 720){
    x = 720;
  }
  fill(#FFFFFF);
  ellipse(x,y,200,90);
  fill(#000000);
  ellipse(725,420,100,90);
  fill(#FFFFFF);
  ellipse(1150, 400,220,110);
  fill(#000000);
  ellipse(1150,400,110,110);
}
