import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set s=new HashSet<>();
		s.add("Shaswat");
		s.add("Talati");
		
		Map<String,String> map=new HashMap<String,String>();
		map.put("Shaswat", "ST");
		map.put("Kinjal", "KT");
		map.put("Talati", "TT");
		
		TreeMap<String, String> t = new TreeMap<>(map);
Set<Entry<String, String>> es=	t.entrySet();
for(Entry<String, String> mapping : es){
System.out.println(mapping.getKey() + " ==> " + mapping.getValue()); }

Parent p=new Child();
//p.override();
p.dummy();
Latte l=new Latte("java.latte");
System.out.println(l.name);
int i=9;
//i++;
Runnable r=()->{
	System.out.println(i);
};

List<Person> persons=new ArrayList<>();
Person pp=new Person();
pp.setId(1);
pp.setName("Shaswat");

Person pp1=new Person();
pp1.setId(2);
pp1.setName("Kinjal");

Person pps=new Person();
pps.setId(3);
pps.setName("Mandar");

Person ppss=new Person();
ppss.setId(4);
ppss.setName("Arkesha");

persons.add(pp);
persons.add(pp1);
persons.add(pps);
persons.add(ppss);
//Collections.sort(persons);   

//Collections.sort(persons, (p1,p2)->p1.getName().compareToIgnoreCase(p2.getName()));

//persons.stream().sorted().forEach(ppp->System.out.println(ppp.getName()));

persons.stream().sorted((p1,p2)->p1.getName().compareTo(p2.getName())).forEach(pppp->System.out.println(pppp.getName()));

/*for(Person person: persons){
	System.out.println(person.getName());
}*/

IntegerMath sum=(a,b)->a+b;

IntegerMath sub=(a,b)->a-b;

System.out.println(sum.operation(5, 6));
System.out.println(sub.operation(11, 1));
Map<Person,String> hasMap=new HashMap<>();
	Map<Person,String> treeMap=new TreeMap<>((p3,p4)->p3.getName().compareTo(p4.getName()));
	
	// Sort Map by value
	Comparator<Entry<Person,String>> c=new Comparator<Entry<Person,String>>() {
		@Override
		public int compare(Entry<Person, String> o1, Entry<Person, String> o2) {
			// TODO Auto-generated method stub
			return o1.getValue().compareTo(o2.getValue());
		}		
	};
Set<Map.Entry<Person,String>> entries=	hasMap.entrySet();
List<Entry<Person,String>> lists=new ArrayList<>(entries);
Collections.sort(lists, c);
//Collections.sort(lists, (e1,e2)->e1.getValue().compareTo(e2.getValue()));

	HashSet<Person> ps=new HashSet<>();
	TreeSet<Person> tp=new TreeSet<>((p3,p1)->p3.getName().compareTo(p1.getName()));
	
	}
	
	

}
