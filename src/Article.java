import java.io.Serializable;

public class Article implements Serializable{

	private User user;
	private String title;
	private String body;

	/**
	 * @param user
	 * @param title
	 * @param body
	 */
	public Article(User user, String title, String body) {
		super();
		this.user = user;
		this.title = title;
		this.body = body;
	}

	public final User getUser() {
		return user;
	}

	public final String getTitle() {
		return title;
	}

	public final String getBody() {
		return body;
	}

}
