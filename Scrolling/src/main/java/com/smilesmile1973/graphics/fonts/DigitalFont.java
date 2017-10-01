package com.smilesmile1973.graphics.fonts;

import java.awt.image.BufferedImage;

import com.smilesmile1973.graphics.BufferedImageUtils;
import com.smilesmile1973.graphics.PixelArray;

public class DigitalFont extends BitmapFont {

	@Override
	protected void buildMap() {
		try {
			final BufferedImage bufferedImage = BufferedImageUtils.loadBufferedImage("/fonts/digital_16x16.png");
			final PixelArray pixelArray = BufferedImageUtils.convertToPixelArray(bufferedImage, true);
			pixelArray.setTransparentForColor(0x000000);
			int c = 0;
			setWidth(16);
			setHeight(16);
			getFontsMap().put(" ", pixelArray.getRect(c, 0, getWidth(), getHeight()));
			getFontsMap().put("!", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("\"", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("�", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put(" ", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("%", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put(" ", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("'", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("(", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put(")", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put(" ", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("+", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put(",", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("-", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put(".", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("/", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("0", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("1", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("2", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("3", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("4", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("5", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("6", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("7", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("8", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("9", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put(":", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put(";", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("<", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("=", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put(">", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("?", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("@", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("A", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("B", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("C", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("D", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("E", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("F", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("G", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("H", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("I", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("J", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("K", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("L", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("M", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("N", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("O", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("P", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("Q", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("R", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("S", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("T", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("U", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("V", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("W", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("X", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("Y", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
			getFontsMap().put("Z", pixelArray.getRect(c += getWidth(), 0, getWidth(), getHeight()));
		} catch (final Exception e) {
		}

	}

}