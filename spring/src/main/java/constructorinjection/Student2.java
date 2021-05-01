package constructorinjection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student2 {
	private int id;
	private List<String> parents;
	private Set<String> phones;
	private Map<String, String> subject;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getParents() {
		return parents;
	}

	public void setParents(List<String> parents) {
		this.parents = parents;
	}

	public Set<String> getPhones() {
		return phones;
	}

	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}

	public Map<String, String> getSubject() {
		return subject;
	}

	public void setSubject(Map<String, String> subject) {
		this.subject = subject;
	}

	public Student2(int id, List<String> parents, Set<String> phones, Map<String, String> subject) {
		super();
		this.id = id;
		this.parents = parents;
		this.phones = phones;
		this.subject = subject;
	}

	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student2 [id=" + id + ", parents=" + parents + ", phones=" + phones + ", subject=" + subject + "]";
	}
}

