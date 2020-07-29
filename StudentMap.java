package Collection;

import java.util.*;

public class StudentMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Student> stdList=new HashMap<String,Student>();
		stdList.put("Ma Ma",new Student("Ma Ma","09-3445587","5CS-4","Yangon"));
		stdList.put("Su Su",new Student("Su Su","09-347564687","5CS-6","Mandalay"));
		stdList.put("Aye Aye",new Student("Aye Aye","09-345987887","5CS-3","Sagaing"));
		stdList.put("Ko Ko",new Student("Ko Ko","09-3454757367","5CS-7","Shwebo"));
		stdList.put("Mg Mg",new Student("Mg Mg","09-24985587","5CS-2","Monywa"));
		Scanner sc=new Scanner(System.in);
		Student std=new Student();
		
		String result;
		
		Set set=stdList.entrySet();
		Iterator i=set.iterator();
		
	do{
		System.out.print("Enter key name:");
		String kname=sc.nextLine();
		if(stdList.containsKey(kname)){
			
			Student st=stdList.get(kname);
			System.out.println(st.toString());
			System.out.println();
		}
			else {
			System.out.println("The key name does not have");
			String name = sc.nextLine();
			if(name.equals("yes")) {
				while(i.hasNext()) {
					Map.Entry me = (Map.Entry)i.next();
					std=(Student)me.getValue();
					System.out.println(std.toString());
					System.out.println();
		}
		System.out.println();
		}
	
	}
		System.out.print("Do you want to continue?:");
		result=sc.nextLine();
	}
	while(result.equals("yes"));
		sc.close();
	}
}
	

