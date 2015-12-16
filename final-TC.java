//Final Tara Cusumano

float ricky,nicky,dicky;
float surface;
float shipX=0,shipDX=5;
float moonX=0,moonY=100;

void setup(){
  size(640,480);
  background(50,150,200);
  reset();
  }
  void reset(){
    surface= random(height/4,height/4);
    moonY=surface/2;
    moonY=random(100,surface+100);
    ricky=width/4;
    nicky=width/4;
    dicky=width/4;
  }
  void draw(){
    scene();
    
  }
  void scene(){
    if(moonX>width+50){
      moonX=-100;
      moonY=random(50,surface+25);
    }
    moonX+=1;
    fill(200,150,50);
    ellipse(moonX,moonY-50,40,40);
    //water
    fill(0,100,50);
    rect(0,surface,width,height-surface);
  }
