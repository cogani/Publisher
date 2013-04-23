
public class Publisher {
	private Articles articles;
	private PublishSite twitterPub;
	/**
	 * @param articles
	 * @param twitterPub
	 */
	public Publisher(Articles articles, PublishSite publishSite) {
		super();
		this.articles = articles;
		this.twitterPub = publishSite;
	}
	public void publish(Article article) {
		articles.save(article);
		twitterPub.twitt(article);
		
	}

}
