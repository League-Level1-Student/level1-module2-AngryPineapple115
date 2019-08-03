package _99_extra;

public class PixelRunner {

	public static void main(String[] args) {
		
		PixelParty pixel = new PixelParty();
		
		pixel.setColor(66, 135, 245);
		pixel.drawCircle(256, 256, 10);
		pixel.drawRectangle(256, 256, 50, 70);
		pixel.drawTriangle(401, 306, 401, 478, 306, 478);
		pixel.drawLine (30, 68, 40, 20);
		pixel.saveImage();
		pixel.displayImage();
		
	}

}