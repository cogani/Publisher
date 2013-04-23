import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class TwitterPub implements PublishSite {

	NetConection netConection;

	public TwitterPub(NetConection netConection) {
		this.netConection = netConection;
	}

	@Override
	public void twitt(Article article) {
		try {
			netConection.send(Serializer.toByteArray(article));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


}
