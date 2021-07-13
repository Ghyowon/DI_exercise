package ex1_xml3_list;

public class MemberBean {

	private String name;
	private int age;
	private String message;
	
	/* 멤버변수에 값을 지정하는 방법
	* 1) setter를 이용
	* 2) 생성자 이용하기
	*/ 
	
	public void output() {
		System.out.println(name + "[" + age + "]" + message);
	}


	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	//생성자함수 만들어줌
	//인자를 받지않는 기본 생성자도 만들어준다
	public MemberBean() {
		
	}
	public MemberBean(String name, int age, String message) {
		super();
		this.name = name;
		this.age = age;
		this.message = message;
	}
}
