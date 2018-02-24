class Car {
  int size;
  int carx;
  int cary;
  int speed;

  Car(int size, int carx, int cary, int speed) {
    this.size= size;
    this.carx  = carx;
    this.cary = cary;
    this.speed = speed;
  }
  void carmove() {
    carx = carx - speed;
    if (carx<0) {
      carx = 400;
    }
  }
  void right() {
    carx = carx + speed;
    if (carx>400) {
      carx = 0;
    }
  }
  int getX() {
    return carx;
  }  
  int getY() {
    return cary;
  }   
  int getSize() {
    return size;
  }   
  void display() 
  {
    fill(255, 0, 0);
    rect(carx, cary, size, 50);
  }
} 

void setup() {
  size(400, 400);
}
int x = 200;
int y = 350;
int a = 20;

Car b = new Car(100, 400, 100, 20);
Car c = new Car(100, 100, 150, 20);

Car d = new Car(100, 100, 200, 20);

void draw() {
  background(0, 0, 0);
  fill(0, 255, 0);
  ellipse(x, y, 50, 50);
  b.carmove();
  b.display();
  c.carmove();
  c.display();
  d.carmove();
  d.display();
  if(intersects(b)){
    y=400;
  }
    if(intersects(c)){
    y=400;
  }
    if(intersects(d)){
    y=400;
  }


 }
 
} 
void keyPressed()
{
  if (key == CODED) {
    if (keyCode == UP)
    {
      y = y - a;
      //Frog Y position goes up
    } else if (keyCode == DOWN)
    {
      y = y + a;
      //Frog Y position goes down
    } else if (keyCode == RIGHT)
    {
      x = x + a;
      //Frog X position goes right
    } else if (keyCode == LEFT)
    {
      x = x - a;
      //Frog X position goes left
    }
  }

  if (x>375) {
    x=375;
  }
  if (x<25) {
    x=25;
  }
  if (y>375) {
    y=375;
  }
  if (y<25) {
    y=25;
  }
}
boolean intersects(Car car) {
  if ((y > car.getY() && y < car.getY()+50) && (x > car.getX() && x < car.getX()+car.getSize()))
    return true;
  else 
    return false;
}



















