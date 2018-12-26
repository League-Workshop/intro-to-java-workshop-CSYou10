PImage rainbow;
PImage unicorn;
void setup () {
rainbow = loadImage ("RAINBOWS.jpeg");
size (800, 600);
rainbow.resize (width, height);
unicorn = loadImage("unicorn.png");
}

void draw () {
rainbow = loadImage ("RAINBOWS.jpeg");
size (800, 600);
rainbow.resize(width,height);
background(rainbow);
image(unicorn, mouseX, mouseY);
}