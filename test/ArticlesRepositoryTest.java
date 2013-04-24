import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import org.junit.Test;


public class ArticlesRepositoryTest {

	@Test
	public void canIRecoverPreviousSavedArticle() {

		ArticlesRepository articlesRespository = new ArticlesRepository();
		Article articleDummy = mock(Article.class);
		articlesRespository.save(articleDummy);
		
		assertEquals(articleDummy, articlesRespository.getArticle(articleDummy));
	}
	
	@Test(expected = ArticlesRespositoryException.class)
	public void canNotIRecoverNotPreviousSavedArticle() {

		ArticlesRepository articlesRespository = new ArticlesRepository();
		Article articleDummy = mock(Article.class);
		
		assertEquals(null, articlesRespository.getArticle(articleDummy));
	}

}
