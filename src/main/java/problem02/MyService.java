package problem02;

public class MyService extends BaseService {

	public String afternoon() {
		return "오후서비스시작";
	}

	@Override
	public void service(String state) {
		String result = state.equals("낮") ? day() : state.equals("오후") ? afternoon() : night() ;
		System.out.println(result);
	}

	@Override
	public String day() {
		// TODO Auto-generated method stub
		return "낮서비스시작";
	}

	@Override
	public String night() {
		// TODO Auto-generated method stub
		return "밤서비스시작";
	}
	
	
}
