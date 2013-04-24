import static org.mockito.Mockito.mock;

import org.junit.Test;


public class FuntionalTest {
	
	private Publisher publisher;
	private Articles articles;
	private PublishSite publishSite;
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
		NetConection internetConection = mock(NetConection.class);
		
		publishSite = new TwitterPub(internetConection);
		article = new Article(new User(),"titulo", "body");

		articles = new Articles(users, repositoryArticles);
	    publisher = new Publisher(articles, publishSite);
		publisher.publish(article);
		
	}

}
