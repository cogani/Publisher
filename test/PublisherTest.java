import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.stub;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;


public class PublisherTest {
	
	private Publisher publisher;
	private Articles articlesMock;
	private PublishSite publishSiteMock;
	private Article articleDummy;
	
	@Before
	public void setup() {
		
		// Creacion gestor articulos como mock
		articlesMock = mock(Articles.class);
		
		// Creacion del site de publicacion como 'mock'
		publishSiteMock = mock(PublishSite.class);		
		
		// Creacion del publicador
		publisher = new Publisher(articlesMock, publishSiteMock);
		
		// Creacion de un articulo dummy
		articleDummy = mock(Article.class);
	}

	@Test
	public void publishArticleNeedsSaveArticle() {
		
		publisher.publish(articleDummy);
		
		verify(articlesMock).save(articleDummy);
	}
	
	@Test
	public void publishArticleNeedsTwittArticle() {
		
		publisher.publish(articleDummy);
		
		verify(publishSiteMock).twitt(articleDummy);
	}
}
