package project.portfolio.board.controller;

public class ExeService {

	public static Object execute(Service service, Object obj) throws Exception {
		System.out.println(service.getClass().getSimpleName() + ".service()");
		System.out.println("전달되는 데이터 : " + obj);

		Object result = service.service(obj);
		System.out.println("실행 결과: " + result);
		return result;
	}

}
