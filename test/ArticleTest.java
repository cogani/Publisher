import static org.junit.Assert.*;

import org.junit.Test;


public class ArticleTest {

	@Test
	public void creatingArticle() {
		IUser articleUser = new User();
		
		Article article = new Article(articleUser,"title","body");
		
		/* Los test solo deben de comprobar una cosa cada vez. Pero realmente solo está comprobando que
		 * que la instancia ha almacenado correctamente sus estados de inicializacion, lo cual puede ser
		 * considerado una sola cosa
		 */
		
		assertEquals(articleUser, article.getUser());
		assertEquals("title", article.getTitle());
		assertEquals("body", article.getBody());
	}

}
