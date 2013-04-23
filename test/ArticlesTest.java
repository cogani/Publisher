import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;


public class ArticlesTest {
	Articles articles;
	Users usersMock;
	ArticlesRepository repositoryArticles;
	Article articleDummy;
	
	@Before
	public void setup(){
		// Creacion gestor de usuario como mock
		usersMock = mock(Users.class);
		// Creacion del respositorio de articulo
		repositoryArticles = mock(ArticlesRepository.class);
		
		// Creacion de un articulo dummy
		articleDummy = mock(Article.class);
		
		articles = new Articles(usersMock, repositoryArticles);
		
	}

	@Test
	public void savingArticleNeedsUserValidation() {

		articles.save(articleDummy);
		
		verify(usersMock).validate(articleDummy.getUser());
	}
	
	@Test
	public void savingArticleNeedsRepositorySaving() {

		articles.save(articleDummy);
		
		verify(repositoryArticles).save(articleDummy);
	}
}
