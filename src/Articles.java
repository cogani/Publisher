
public class Articles{
	Users usersMock;
	ArticlesRepository articlesRepository;

	/**
	 * @param users
	 * @param articlesRepository
	 */
	public Articles(Users users, ArticlesRepository articlesRepository) {
		super();
		this.usersMock = users;
		this.articlesRepository = articlesRepository;
	}

	public void save(Article article) {
		usersMock.validate(article.getUser());
		articlesRepository.save(article);
	}

}
