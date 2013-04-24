import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.stub;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.never;

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
	
	@Test
	public void onlyCanSavingArticleWithValidUser() {

		articles.save(articleDummy);
		ArticlesRepository repositoryArticlesMock = mock(ArticlesRepository.class);
		Users usersStub = mock(Users.class);
		stub(usersStub.validate(articleDummy.getUser())).toReturn(false);

		/* Verificacion de behavior, para asegurar que nunca repositoryArticlesMock.save()
		 * fue llamado
		 */
		verify(repositoryArticlesMock, never()).save(articleDummy);
		
		/* Tambien podria verificar que no hay mas iteraciones con este mock
		 *  - verifyNoMoreInteractions(repositoryArticlesMock);
		 *  Requiere importar verifyNoMoreInteractions
		 */
	}	
}
 