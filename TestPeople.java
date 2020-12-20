package chetvurtoPaketche;

public class TestPeople {

	public static void main(String[] args) {
		Person person = new Person( "Mirela", 
									"Zhk. Krasno selo", 
									"59696223",
									"mimeca@mimec.bg");
		
		Student student = new Student("Karlos",
										"Kv. Borovo",
										"484597522",
										"kremche@krqkrq.ch",
										Student.SENIOR);
		
		Employee employee = new Employee("Alexa",
											"Kv. Manastirski Livadi",
											"125465005",
											"alexaplay@despacito.ru",
											"Robotika inc",
											12500);
		
		Staff staff = new Staff("Tsukki",
								"Rio",
								"222333333222",
								"tsukki@zliukki.ru",
								"VolleyIsMyLife",
								564100,
								"director");
		
		Faculty faculty = new Faculty("Rori",
										"Mexico City",
										"22658562",
										"rori@tikuda.ua",
										"NeznaiuGdeq",
										62230,
										"13.20 - 23.50",
										"Master of doing nothing");
		
		System.out.println(person.toString() + "\n");
		System.out.println(student.toString() + "\n");
		System.out.println(employee.toString() + "\n");
		System.out.println(staff.toString() + "\n");
		System.out.println(faculty.toString() + "\n");

	}

}
