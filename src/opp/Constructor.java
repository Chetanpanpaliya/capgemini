package opp;
class comp{
	String name;
	String lang;
	String city;
	String state;
	comp(){
		name="chetan";
		lang="python";
		city="nagpur";
		state="maharashtra";
	}
}

public class Constructor {

	public static void main(String[] args) {
		comp object=new comp();
		System.out.println(object.name);
		System.out.println(object.lang);
		System.out.println(object.city);
		System.out.println(object.state);
	}

}
