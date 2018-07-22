package com.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;

import org.apache.commons.io.output.ByteArrayOutputStream;



public class CodeUtil {

	public static BufferedImage codeImg(String code) {
		BufferedImage image = new BufferedImage(100, 30, BufferedImage.TYPE_INT_RGB);
		Graphics g = image.getGraphics();
		String str = code;
		g.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
		g.fillRect(0, 0, 100, 33);
		g.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
		g.setFont(new Font("微软雅黑", Font.BOLD, 22));
		g.drawString(str, 20, 20);
		return image;
	}

	public static String number() {
		StringBuffer str = new StringBuffer();
		int b = 0;
		while (b < 4) {
			int a = (int) (48 + Math.random() * 74);
			if (a >= 48 && a <= 57) {
				str.append((char) a);
				b++;
			} else if (a >= 65 && a <= 90) {
				str.append((char) a);
				b++;
			} else if (a > 97 && a <= 122) {
				str.append((char) a);
				b++;
			}

		}

		return str.toString();

	}

	public static OutputStream handCode(BufferedImage image) {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		ByteArrayInputStream input = null;
		ImageOutputStream imageOut =null;
		try {
			 ImageOutputStream iamgeOut = ImageIO.createImageOutputStream(output);
			ImageIO.write(image, "jpeg", output);
			
		/*	imageOut.close();
			input = new ByteArrayInputStream(output.toByteArray());
*/
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(" image error");

		}
		return (OutputStream) output;

	}

}
