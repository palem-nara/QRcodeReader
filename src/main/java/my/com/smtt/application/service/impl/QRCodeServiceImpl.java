package my.com.smtt.application.service.impl;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import my.com.smtt.application.service.QRCodeService;
import net.glxn.qrgen.javase.QRCode;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Service
public class QRCodeServiceImpl implements QRCodeService {

	@Override
	  public byte[] generate(String text, int width, int height) {

	    try (ByteArrayOutputStream bos = QRCode.from(text).withSize(width, height).stream(); ) {
	      return bos.toByteArray();

	    } catch (IOException e) {
	      e.printStackTrace();
	      return null;
	    }
	  }
}
