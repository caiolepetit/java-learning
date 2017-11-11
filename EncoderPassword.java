import java.security.MessageDigest;
import javax.xml.bind.DatatypeConverter;

public class EncoderPassword {
	public static String encodePassword (String password){
		String passwordEncoded = "";
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.update(password.getBytes());
			byte [] digestedBytes = messageDigest.digest();
			passwordEncoded = DatatypeConverter.printHexBinary(digestedBytes).toLowerCase();
		} catch (Exception e){

		}
		return passwordEncoded;
	}

	public static void main (String[] args){
		String password = "TESTE01";
		System.out.println(encodePassword(password));
	}
}