package usc.sibi.contactsdatabase;

public class Contact {
	private long id;
	private String contactid;
	private String name;
	private String number;
	
	
	public Contact(){}
	public Contact(String contactid, String name, String number) {
		this.contactid = contactid;
		this.name = name;
		this.number = number;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getContactid() {
		return contactid;
	}
	public void setContactid(String contactid) {
		this.contactid = contactid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	
}
