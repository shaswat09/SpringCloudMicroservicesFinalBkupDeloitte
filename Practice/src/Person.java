
public class Person implements Comparable<Person>{

	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	@Override
	public int compareTo(Person arg0) {
		// TODO Auto-generated method stub
		int result=name.compareTo(arg0.getName());
		if (result!=0) return result;
		else {
			if(id<arg0.getId()) return 1;
			if(id>arg0.getId()) return -1;
			else return 0;
		}
	}
	
	
}
