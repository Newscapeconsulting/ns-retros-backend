/**
 * 
 */
package prd0001.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author mahesh.kharote
 * POJO for USER
 *
 */
@Entity
@Table(name = "user")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty(value="uid")
	private long id;
	@JsonProperty(value="ufn")
	private String first_name;
	@JsonProperty(value="uln")
	private String last_name;
	@JsonProperty(value="eml")
	private String email_id;
	@JsonProperty(value="mob")
	private String mobile_no;
	@JsonProperty(value="typ")
	private int type;
	@JsonProperty(value="ref")
	private int ref;
	@JsonProperty(value="sts")
	private int status;
	@JsonProperty(value="uaa")
	private Date added_at;
	@JsonProperty(value="uua")
	private Date updated_at;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getAdded_at() {
		return added_at;
	}
	public void setAdded_at(Date added_at) {
		this.added_at = added_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

}
