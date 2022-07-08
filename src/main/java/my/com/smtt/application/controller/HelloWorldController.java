package my.com.smtt.application.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import my.com.smtt.application.service.QRCodeService;


@Controller
public class HelloWorldController {

	private final int WIDTH = 250;
	  private final int HEIGHT = 250;
	  private final String QR_TEXT = "Welcome to Spring boot smart tag application.....Palem";

	  @Autowired private QRCodeService qrCodeService;

	  @GetMapping("qr-code")
	  public ResponseEntity<byte[]> getQrCode() {

	    byte[] qrImage = qrCodeService.generate(QR_TEXT, WIDTH, HEIGHT);

	    return ResponseEntity.ok().contentType(MediaType.IMAGE_PNG).body(qrImage);
	  }
}
