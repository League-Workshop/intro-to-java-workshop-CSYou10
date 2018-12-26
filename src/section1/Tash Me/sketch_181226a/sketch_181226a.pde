PImage mustache;
PImage trump;
void setup () {
trump = loadImage("trump.jpg");
size(800, 600);
trump.resize (width,height);
mustache = loadImage("mustache.png");

}

void draw (){
background (trump);
image (mustache, 400, 300);
}