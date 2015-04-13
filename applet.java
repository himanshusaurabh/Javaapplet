import java.applet.*;
import java.awt.*;
public class doodler extends Applet
{Point lineStart=newPoint(0,0);
int circleSize=16;
Graphics g=getGraphics();
public void init()
{setBackground(Color.cyan);}
public void paint(Graphics g)
{g.setColor(Color.blue);
g.drawString("Left button draws...",1,10);
g.drawString("Right button or shift-left button erases ...",1,20);
g.drawString("Double click clears screen ...",1,30);
}
}
