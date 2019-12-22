package com.view;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

public class FontSet
{
	//need to put apache license 2.0
		
	private static final int FONT_SIZE_SMALL = 24;
	private static final int FONT_SIZE_REGULAR = 28;
	private static final int FONT_SIZE_BIG = 44;

	public static Font getBaseSmallFont(){
		try {
			File fontname = new File("src/resource/font/Roboto-Medium.ttf");
			Font f = Font.createFont(Font.TRUETYPE_FONT, fontname);
			f = f.deriveFont((float)FONT_SIZE_SMALL);
			return f;
		}
		catch (IOException ex) {
			Font df = getDefaultfont(FONT_SIZE_SMALL);
			return df;
		}
		catch (FontFormatException ex) {
			Font df = getDefaultfont(FONT_SIZE_SMALL);
			return df;
		}
//			Font f = new Font("Roboto", 0, FONT_SIZE_SMALL);
	}
	
	public static Font getBaseRegularFont(){
		try {
			File fontname = new File("src/resource/font/Roboto-Medium.ttf");
			Font f = Font.createFont(Font.TRUETYPE_FONT, fontname);
			f = f.deriveFont((float)FONT_SIZE_REGULAR);
			return f;
		}
		catch (IOException ex) {
			Font df = getDefaultfont(FONT_SIZE_REGULAR);
			return df;
		}
		catch (FontFormatException ex) {
			Font df = getDefaultfont(FONT_SIZE_REGULAR);
			return df;
		}
	}
	
	public static Font getBaseBigFont(){
		try {
			File fontname = new File("src/resource/font/Roboto-Medium.ttf");
			Font f = Font.createFont(Font.TRUETYPE_FONT, fontname);
			f = f.deriveFont((float)FONT_SIZE_BIG);
			return f;
		}
		catch (IOException ex) {
			Font df = getDefaultfont(FONT_SIZE_BIG);
			return df;
		}
		catch (FontFormatException ex) {
			Font df = getDefaultfont(FONT_SIZE_BIG);
			return df;
		}
	}
	
	private static Font getDefaultfont(int size) {
		return new Font("Serif", 0, size);
	}
}
