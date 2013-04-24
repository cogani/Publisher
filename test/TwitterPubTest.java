import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import java.io.IOException;

import org.junit.Test;

public class TwitterPubTest {
	@Test
	public void twittPushArticleToInternet() {

		//Creacion de la conexion a Internet como mock
		NetConection netConectionMock = mock(NetConection.class);
		
		PublishSite twitterPub = new TwitterPub(netConectionMock);
		
		// Creacion de un articulo dummy
		Article articleDummy = mock(Article.class);
		
		twitterPub.twitt(articleDummy);
		
		try {
			verify(netConectionMock).send(Serializer.toByteArray(articleDummy));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
