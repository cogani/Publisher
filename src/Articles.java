
public class Articles{
	Users users;
	ArticlesRepository articlesRepository;

	/**
	 * @param users
	 * @param articlesRepository
	 */
	public Articles(Users users, ArticlesRepository articlesRepository) {
		super();
		this.users = users;
		this.articlesRepository = articlesRepository;
	}

	public void save(Article article) {
		if(users.validate(article.getUser()));
			articlesRepository.save(article);
	}
}
