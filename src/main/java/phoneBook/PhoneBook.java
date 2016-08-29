package phoneBook;
import java.util.*;
public class PhoneBook {
	public static void main(String args[]){
		Scanner in;
		HashMap<String, ArrayList<String>> phoneBook = new HashMap<String, ArrayList<String>>();
		ArrayList<String> phoneNum1 = new ArrayList<String>(2);
		ArrayList<String> phoneNum2 = new ArrayList<String>(1);
		ArrayList<String> phoneNum3 = new ArrayList<String>(3);
		// �������� ������ � ���������� �����
		phoneBook.put("������ �.�.",phoneNum1);
		phoneBook.put("������ �.�.",phoneNum2);
		phoneBook.put("������� �.�.", phoneNum3);
		
		phoneNum1.add("+8 800 2000 500");
		phoneNum1.add("+8 800 2000 600");
		
		phoneNum2.add("+8 800 2000 700");
		
		phoneNum3.add("+8 800 2000 800");
		phoneNum3.add("+8 800 2000 900");
		phoneNum3.add("+8 800 2000 000");
		System.out.println("������ ���������:");
		// �������� ����� ���������
		Set<Map.Entry<String, ArrayList<String>>> set = phoneBook.entrySet();
		// ��������� ����������
		for (Map.Entry<String, ArrayList<String>> me : set) {
			System.out.println("\t"+me.getKey());
		}
		System.out.println("��� ����������� ����������� ������ "
				+ "������������� ��� ��������,\n���������� ������� ��� ���.\n"
				+ "��� ������ �� ��������� ������� 0");
		for(;;){
			String fio="";
			in = new Scanner(System.in);
			fio = in.nextLine();
			
			if(fio.equals("0"))
				break;
			else if(phoneBook.containsKey(fio))
				System.out.println(phoneBook.get(fio));
			else
				System.out.println("������� � ����� ��� ������������");
		}
		in.close();
	}
}
