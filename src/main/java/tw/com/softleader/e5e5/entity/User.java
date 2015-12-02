package tw.com.softleader.e5e5.entity;
// Generated 2015/12/2 �U�� 07:16:55 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", schema = "dbo", catalog = "EEIT82DB")
public class User implements java.io.Serializable {

	private int id;
	private String password;
	private String name;
	private String nickname;
	private String account;
	private Integer age;
	private Character sex;
	private Date birthday;
	private String address;
	private String phone;
	private String cellphone;
	private String email;
	private String picture;
	private String schoolEmail;
	private String focusItemList;
	private Integer gameScore;
	private Integer onlineDatetime;
	private Set<AdminQuestionAndAnswer> adminQuestionAndAnswers = new HashSet<AdminQuestionAndAnswer>(0);
	private Set<UserBanList> userBanListsForUserBId = new HashSet<UserBanList>(0);
	private Set<Thread> threads = new HashSet<Thread>(0);
	private Set<UserBanList> userBanListsForUserAId = new HashSet<UserBanList>(0);
	private Set<UserOwner> userOwners = new HashSet<UserOwner>(0);
	private Set<FocusUserList> focusUserListsForUserAId = new HashSet<FocusUserList>(0);
	private Set<Broadcast> broadcasts = new HashSet<Broadcast>(0);
	private Set<FocusUserList> focusUserListsForUserBId = new HashSet<FocusUserList>(0);
	private Set<School> schools = new HashSet<School>(0);
	private Set<Messages> messageses = new HashSet<Messages>(0);
	private Set<Product> productsForItemOwnerId = new HashSet<Product>(0);
	private Set<Chat> chats = new HashSet<Chat>(0);
	private Set<Report> reports = new HashSet<Report>(0);
	private Set<Product> productsForUserId = new HashSet<Product>(0);

	public User() {
	}

	public User(int id) {
		this.id = id;
	}

	public User(int id, String password, String name, String nickname, String account, Integer age, Character sex,
			Date birthday, String address, String phone, String cellphone, String email, String picture,
			String schoolEmail, String focusItemList, Integer gameScore, Integer onlineDatetime,
			Set<AdminQuestionAndAnswer> adminQuestionAndAnswers, Set<UserBanList> userBanListsForUserBId,
			Set<Thread> threads, Set<UserBanList> userBanListsForUserAId, Set<UserOwner> userOwners,
			Set<FocusUserList> focusUserListsForUserAId, Set<Broadcast> broadcasts,
			Set<FocusUserList> focusUserListsForUserBId, Set<School> schools, Set<Messages> messageses,
			Set<Product> productsForItemOwnerId, Set<Chat> chats, Set<Report> reports, Set<Product> productsForUserId) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.nickname = nickname;
		this.account = account;
		this.age = age;
		this.sex = sex;
		this.birthday = birthday;
		this.address = address;
		this.phone = phone;
		this.cellphone = cellphone;
		this.email = email;
		this.picture = picture;
		this.schoolEmail = schoolEmail;
		this.focusItemList = focusItemList;
		this.gameScore = gameScore;
		this.onlineDatetime = onlineDatetime;
		this.adminQuestionAndAnswers = adminQuestionAndAnswers;
		this.userBanListsForUserBId = userBanListsForUserBId;
		this.threads = threads;
		this.userBanListsForUserAId = userBanListsForUserAId;
		this.userOwners = userOwners;
		this.focusUserListsForUserAId = focusUserListsForUserAId;
		this.broadcasts = broadcasts;
		this.focusUserListsForUserBId = focusUserListsForUserBId;
		this.schools = schools;
		this.messageses = messageses;
		this.productsForItemOwnerId = productsForItemOwnerId;
		this.chats = chats;
		this.reports = reports;
		this.productsForUserId = productsForUserId;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "password", length = 20)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "name", length = 30)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "nickname", length = 30)
	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Column(name = "account", length = 25)
	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	@Column(name = "age")
	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Column(name = "sex", length = 1)
	public Character getSex() {
		return this.sex;
	}

	public void setSex(Character sex) {
		this.sex = sex;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "birthday", length = 23)
	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Column(name = "address", length = 50)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "phone", length = 20)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "cellphone", length = 30)
	public String getCellphone() {
		return this.cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	@Column(name = "email", length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "picture")
	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	@Column(name = "school_email", length = 50)
	public String getSchoolEmail() {
		return this.schoolEmail;
	}

	public void setSchoolEmail(String schoolEmail) {
		this.schoolEmail = schoolEmail;
	}

	@Column(name = "focus_item_list", length = 30)
	public String getFocusItemList() {
		return this.focusItemList;
	}

	public void setFocusItemList(String focusItemList) {
		this.focusItemList = focusItemList;
	}

	@Column(name = "game_score")
	public Integer getGameScore() {
		return this.gameScore;
	}

	public void setGameScore(Integer gameScore) {
		this.gameScore = gameScore;
	}

	@Column(name = "online_datetime")
	public Integer getOnlineDatetime() {
		return this.onlineDatetime;
	}

	public void setOnlineDatetime(Integer onlineDatetime) {
		this.onlineDatetime = onlineDatetime;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<AdminQuestionAndAnswer> getAdminQuestionAndAnswers() {
		return this.adminQuestionAndAnswers;
	}

	public void setAdminQuestionAndAnswers(Set<AdminQuestionAndAnswer> adminQuestionAndAnswers) {
		this.adminQuestionAndAnswers = adminQuestionAndAnswers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userByUserBId")
	public Set<UserBanList> getUserBanListsForUserBId() {
		return this.userBanListsForUserBId;
	}

	public void setUserBanListsForUserBId(Set<UserBanList> userBanListsForUserBId) {
		this.userBanListsForUserBId = userBanListsForUserBId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Thread> getThreads() {
		return this.threads;
	}

	public void setThreads(Set<Thread> threads) {
		this.threads = threads;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userByUserAId")
	public Set<UserBanList> getUserBanListsForUserAId() {
		return this.userBanListsForUserAId;
	}

	public void setUserBanListsForUserAId(Set<UserBanList> userBanListsForUserAId) {
		this.userBanListsForUserAId = userBanListsForUserAId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<UserOwner> getUserOwners() {
		return this.userOwners;
	}

	public void setUserOwners(Set<UserOwner> userOwners) {
		this.userOwners = userOwners;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userByUserAId")
	public Set<FocusUserList> getFocusUserListsForUserAId() {
		return this.focusUserListsForUserAId;
	}

	public void setFocusUserListsForUserAId(Set<FocusUserList> focusUserListsForUserAId) {
		this.focusUserListsForUserAId = focusUserListsForUserAId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Broadcast> getBroadcasts() {
		return this.broadcasts;
	}

	public void setBroadcasts(Set<Broadcast> broadcasts) {
		this.broadcasts = broadcasts;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userByUserBId")
	public Set<FocusUserList> getFocusUserListsForUserBId() {
		return this.focusUserListsForUserBId;
	}

	public void setFocusUserListsForUserBId(Set<FocusUserList> focusUserListsForUserBId) {
		this.focusUserListsForUserBId = focusUserListsForUserBId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<School> getSchools() {
		return this.schools;
	}

	public void setSchools(Set<School> schools) {
		this.schools = schools;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Messages> getMessageses() {
		return this.messageses;
	}

	public void setMessageses(Set<Messages> messageses) {
		this.messageses = messageses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userByItemOwnerId")
	public Set<Product> getProductsForItemOwnerId() {
		return this.productsForItemOwnerId;
	}

	public void setProductsForItemOwnerId(Set<Product> productsForItemOwnerId) {
		this.productsForItemOwnerId = productsForItemOwnerId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Chat> getChats() {
		return this.chats;
	}

	public void setChats(Set<Chat> chats) {
		this.chats = chats;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Report> getReports() {
		return this.reports;
	}

	public void setReports(Set<Report> reports) {
		this.reports = reports;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userByUserId")
	public Set<Product> getProductsForUserId() {
		return this.productsForUserId;
	}

	public void setProductsForUserId(Set<Product> productsForUserId) {
		this.productsForUserId = productsForUserId;
	}

}
