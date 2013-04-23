
public class Articles{
	Users usersMock;
	IArticlesRepository articlesRepository;

	/**
	 * @param users
	 * @param articlesRepository
	 */
	public Articles(Users users, IArticlesRepository articlesRepository) {
		super();
		this.usersMock = users;
		this.articlesRepository = articlesRepository;
	}

	public void save(Article article) {
		usersMock.validate(article.getUser());
		articlesRepository.save(article);
	}

}
