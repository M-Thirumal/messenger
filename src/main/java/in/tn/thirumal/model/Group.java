/**
 * 
 */
package in.tn.thirumal.model;

import java.io.Serializable;

/**
 * @author Thirumal
 *
 */
public class Group implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3080449235886543706L;
	private String subject;
    private String name;
    private String description;
    
	public Group(String subject, String name, String description) {
		super();
		this.subject = subject;
		this.name = name;
		this.description = description;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Group [subject=" + subject + ", name=" + name + ", description=" + description + "]";
	}
}
