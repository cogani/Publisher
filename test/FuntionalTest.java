import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import org.junit.Test;


public class FuntionalTest {
	
	private Publisher publisher;
	private Articles articles;
	private IPublishSite publishSite;
	private Article article;

	@Test
	public void testing() {
		Users users = new Users();
		
		/*
		 * En este test funcional dejo fuera los limites marcados por:
		 *  - el reposiotorio de articulos
		 *  - la conexion a Internet.
		 * Por eso los siguo considerando como mock
		 */
		ArticlesRepository repositoryArticles = mock(ArticlesRepository.class);
		INetConection internetConection = mock(INetConection.class);
		
		publishSite = new TwitterPub(internetConection);
		article = new Article(new User(),"titulo", "body");

		articles = new Articles(users, repositoryArticles);
	    publisher = new Publisher(articles, publishSite);
		publisher.publish(article);
		
	}

}
