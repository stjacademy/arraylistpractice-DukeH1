import java.util.ArrayList;

public class Notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] grades = new int[2];
		
		grades[0] = 200;
		grades[1] = 100;
		
		for(int i=0; i<grades.length; i++)
			
		System.out.println(grades[i]);
		*/
		
		ArrayList<Integer> grades = new ArrayList<Integer>();
		// make a new array list. 
		
		grades.add(92);
		grades.add(100);
		grades.add(2222);
		grades.add(10);

		System.out.println(grades);
		
		System.out.println("I removed the " +grades.remove(1));
		//remove 就是直接去掉
		System.out.println(grades);
		
		grades.add(1,233);
		System.out.println(grades);
		
		grades.set(2,43);
		System.out.println(grades);
		//set就是替换
		
		
		grades.set(0,grades.get(2));
		System.out.println(grades);
		//get类似于定位数字，然后重新print出来。
		
		for(int i=0; i<grades.size(); i++)
			System.out.println(grades.get(i));
		//get类似于定位数字，然后重新print出来。

		
		
		for(Integer num : grades) {
			System.out.println(num);
		grades.remove(grades.get(0));
		//和前面的一样，注意格式的使用
		}
	}

}
