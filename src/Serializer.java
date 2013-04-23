import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


public class Serializer {

	public static byte[] toByteArray(Object article) throws IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutput out = null;

		byte[] bytesOutput = null;
		try {
			out = new ObjectOutputStream(bos);
			out.writeObject(article);
			bytesOutput = bos.toByteArray();

		} finally {
			out.close();
			bos.close();
		}
		return bytesOutput;
	}
}
