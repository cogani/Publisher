
public class Publisher {
	private Articles articles;
	private IPublishSite twitterPub;
	/**
	 * @param articles
	 * @param twitterPub
	 */
	public Publisher(Articles articles, IPublishSite publishSite) {
		super();
		this.articles = articles;
		this.twitterPub = publishSite;
	}
	public void publish(Article article) {
		articles.save(article);
		twitterPub.twitt(article);
		
	}

}
