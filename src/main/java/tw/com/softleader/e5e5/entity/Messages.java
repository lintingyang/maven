package tw.com.softleader.e5e5.entity;
// Generated 2015/12/2 �U�� 09:36:37 by Hibernate Tools 4.3.1.Final

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.transaction.Transactional;

/**
 * Messages generated by hbm2java
 */
@Entity
@Table(name = "messages", schema = "dbo", catalog = "EEIT82DB")
public class Messages implements java.io.Serializable {

	private int id;
	private User user;
	private String article;
	private Date deliverTime;
	private Date readTime;
	private String receiverId;
	private String senderId;
	private Date time;

	public Messages() {
	}

	public Messages(int id) {
		this.id = id;
	}

	public Messages(int id, User user, String article, Date deliverTime, Date readTime, String receiverId,
			String senderId, Date time) {
		this.id = id;
		this.user = user;
		this.article = article;
		this.deliverTime = deliverTime;
		this.readTime = readTime;
		this.receiverId = receiverId;
		this.senderId = senderId;
		this.time = time;
	}

	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Messages [id=" + id + ", user=" + user + ", article=" + article + ", deliverTime=" + deliverTime
				+ ", readTime=" + readTime + ", receiverId=" + receiverId + ", senderId=" + senderId + ", time=" + time
				+ "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "article")
	public String getArticle() {
		return this.article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "deliver_time", length = 23)
	public Date getDeliverTime() {
		return this.deliverTime;
	}

	public void setDeliverTime(Date deliverTime) {
		this.deliverTime = deliverTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "read_time", length = 23)
	public Date getReadTime() {
		return this.readTime;
	}

	public void setReadTime(Date readTime) {
		this.readTime = readTime;
	}

	@Column(name = "receiver_id", length = 30)
	public String getReceiverId() {
		return this.receiverId;
	}

	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}

	@Column(name = "sender_id", length = 30)
	public String getSenderId() {
		return this.senderId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "time", length = 23)
	@Transactional
	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}
