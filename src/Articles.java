
public class Articles{
	IUsers usersMock;
	IArticlesRepository articlesRepository;

	/**
	 * @param users
	 * @param articlesRepository
	 */
	public Articles(IUsers users, IArticlesRepository articlesRepository) {
		super();
		this.usersMock = users;
		this.articlesRepository = articlesRepository;
	}

	public void save(Article article) {
		usersMock.validate(article.getUser());
		articlesRepository.save(article);
	}

}
