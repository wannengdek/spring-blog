package dk.coding.blog.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * User. 
 * @author <a href="https://waylau.com">Way Lau</a>
 * @date 2017年2月24日
 */
@Entity
@XmlRootElement // mediatype 转为xml
public class User {


	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY) // 自增长策略
	private long id; // 用户的唯一标识
 	private String name;
	private int age;

	public User() {
	}

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
