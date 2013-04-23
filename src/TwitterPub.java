import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class TwitterPub implements IPublishSite {

	INetConection netConection;

	public TwitterPub(INetConection netConection) {
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
