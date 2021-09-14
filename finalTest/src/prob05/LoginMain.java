package prob05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<User> joinUsers = new ArrayList<User>();
		joinUsers.add( new User( "둘리", "1234") );
		joinUsers.add( new User( "마이콜", "5678") );
		joinUsers.add( new User( "또치", "4321") );
		joinUsers.add( new User( "도우너", "8765") );
		
		System.out.print("아이디를 입력하시오 : ");
		String id = scanner.nextLine();
		
		System.out.print("비밀번호를 입력하시오 : ");
		String password = scanner.nextLine();

		try {
			login(joinUsers, new User( id, password) );
			System.out.println("로그인 성공");
		} catch (UserNotFoundException ex) {
			System.out.println("사용자를 찾을 수 없습니다.");
			return;
		} catch( PasswordDismatchException ex ){
			System.out.println("비밀번호가 틀렸습니다.");
			return;
		} finally {
			scanner.close();
		}
		
	}
	
	public static void login(List<User> users, User user){
		//users. size = 4
		int i = 0;
		
		while(i < 4) {
			
			String str1 = users.get(i).getId();
			String str2 = user.getId();
			String str3 = users.get(i).getPassword();
			String str4 = user.getPassword();
			
			if(str1 == str2) {
				System.out.println("1단계");
				if(str3 == str4) {
					System.out.println("2단계");
					break;
				}
			}
			
			if(users.get(i).getId() != user.getId()) {
				System.out.println("3단계");
				i++;
				continue;
			}
			
			if(users.get(i).getPassword() != user.getPassword()) {
				System.out.println("4단계");
				i++;
				continue;
			}
			
			if(i == 3) {
				throw new UserNotFoundException();
			}
			
		}
		
	}
	
}
