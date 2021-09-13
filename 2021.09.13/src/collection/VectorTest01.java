package collection;

import java.util.Vector;

public class VectorTest01 {

	public static void main(String[] args) {
		String s = null;
		Vector<String> v = new Vector<>();
		
		v.addElement("둘리");
		v.addElement("마이콜");
		v.addElement("도우너");
		
		//순회1
		for(int i = 0; i < v.size(); i++) {
			s = v.elementAt(i);
			System.out.println(s);
		}
		
		//삭제
		v.removeElement(2);
		System.out.println(s);
		

	}

}
