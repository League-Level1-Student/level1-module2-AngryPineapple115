package _99_extra;

public class PixelRunner {

	public static void main(String[] args) {
		
		PixelParty pixel = new PixelParty();

		pixel.setRainbow(true);
		
		pixel.drawRectangle(40, 37, 187, 93);
		pixel.drawCircle(400, 300, 14);
		pixel.drawTriangle(500, 407, 508, 379, 379, 407);
		
		pixel.drawRectangle(200, 200, 30, 60);
		
		pixel.drawLine(209, 230, 60, 105);
		
		pixel.saveImage();
		pixel.displayImage();
		
	}

}