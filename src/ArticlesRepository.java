import java.util.ArrayList;


public class ArticlesRepository{
	ArrayList articlesList = new ArrayList();

	public void save(Article article) {
		articlesList.add(article);
		
	}

	public Object getArticle(Article articleDummy) {
		int posFoundArticle = getArticlePosition(articleDummy);
		if(posFoundArticle < 0) throw new ArticlesRespositoryException("Not saved article");
		
		return articlesList.get(posFoundArticle);
	}

	private int getArticlePosition(Article articleDummy) {
		return articlesList.indexOf(articleDummy);
	}

}
