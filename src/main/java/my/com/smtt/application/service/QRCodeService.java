package my.com.smtt.application.service;

public interface QRCodeService {

	 byte[] generate(String text, int width, int height);

}
