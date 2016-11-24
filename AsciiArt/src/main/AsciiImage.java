package main;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class AsciiImage {

	private BufferedImage image;

	public static AsciiImage loadImage(String fileName) {
		return new AsciiImage(fileName);
	}

	public int getHeight() {
		return image.getHeight();
	}

	public int getWidth() {
		return image.getWidth();
	}

	public int getRed(int x, int y) {
		int rgb = getRgb(x, y);
		return (rgb >> 16) & 0xFF;
	}

	public int getGreen(int x, int y) {
		int rgb = getRgb(x, y);
		return (rgb >> 8) & 0xFF;
	}

	public int getBlue(int x, int y) {
		int rgb = getRgb(x, y);
		return rgb & 0xFF;
	}

	private int getRgb(int x, int y) {
		if (x < 0 || x > image.getWidth()) {
			throw new RuntimeException("Coordinate x out of range: 0.." + image.getWidth());
		} else if (y < 0 || y > image.getHeight()) {
			throw new RuntimeException("Coordinate y out of range: 0.." + image.getHeight());
		}
		int rgb = image.getRGB(x, y);
		return rgb;
	}

	private AsciiImage(String fileName) {
		this.image = loadFile(fileName);
	}

	private BufferedImage loadFile(String fileName) {
		try {
			return ImageIO.read(new File(fileName));
		} catch (IOException e) {
			throw new RuntimeException("File not found!", e);
		}
	}

}
