import java.util.Scanner;

public class sot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int TestMass[] = {8,3,5,7,6,1,2,0,4,9};
		int n=TestMass.length;
		int choose = 0;
		for (int i=0; i<n; i++)
			System.out.print(TestMass[i] + " ");
		System.out.println("\n 1 - ������ ���������� � ������� �� ����� \n 2 - ���������� ��������� \n 3 - � ������� �� ������ �� ��������������� ���� \n 4- ��������� �����");
		Scanner in = new Scanner(System.in);
		choose=in.nextInt();
		switch(choose){	
			
			case 1: StupidSort(TestMass, n);
			break;
			case 2: BubbleSort(TestMass, n);
			break;
			case 3: StupidSort1(TestMass, n);
		    break;
		    case 4: ShakeSort(TestMass,  n);
		    break;
			default: System.out.println("�������� �� ���������� �����");
			break;
		}
	}
	
	public static void StupidSort(int TestMass[], int n) {		// ������ ���������� � ������� �� �����
		System.out.println("\n ������ ���������� � ������� �� �����:");
		boolean flag = true;
		while(flag){
			int x = TestMass[0];// ��������� ������ ������� ������� ���������� x
			flag=false; //������ �������� �����, ����� ���������, ���� �� �����, ������� ����� �����������
			for (int i=1; i<n; i++){
				if(x>TestMass[i])
				{
					int y = TestMass[i];
					TestMass[i]=x;
					TestMass[i-1]=y;
					flag=true;//���� ���� ���� ����� �������� ������������, �� ��������� ����� ������� �����
				}
				x=TestMass[i];
			}
		}
		for (int i=0; i<n; i++)
			System.out.print(TestMass[i] + " ");
	}	
		
	public static void BubbleSort(int TestMass[], int n) { //���������� �������
		System.out.println("\n ���������� ���������:");
		boolean flag = true;
		int m=n; //��������� ���������� m ��� ������ ����� �������
		while(flag){
			int x = TestMass[0];
			flag=false;
			for (int i=1; i<m; i++){
				if(x>TestMass[i])
				{
					int y = TestMass[i];
					TestMass[i]=x;
					TestMass[i-1]=y;
					flag=true;
				}
			x=TestMass[i];
			}
		m--;
		}
		for (int i=0; i<n; i++)
			System.out.print(TestMass[i] + " ");
	}
	
	public static void StupidSort1(int TestMass[], int n) {		// ������ ����������
			System.out.println("\n ������ ���������� � ������� �� ������� �� ���������������� ��������");
			boolean flag = true;
			while(flag){
				int x = TestMass[0];// ��������� ������ ������� ������� ���������� x
				flag=false; //������ �������� �����, ����� ���������, ���� �� �����, ������� ����� �����������
				for (int i=1; i<n; i++){
					if(x>TestMass[i])
					{
						int y = TestMass[i];
						TestMass[i]=x;
						TestMass[i-1]=y;
						flag=true;
						break;//���� ���� ���� ����� �������� ������������, �� ��������� ����� ������� �����
					}
				x=TestMass[i];
				}
			}
			for (int i=0; i<n; i++)
				System.out.print(TestMass[i] + " ");
	}		
	public static void ShakeSort(int TestMass[], int n) {		// ��������� ����������
			System.out.println("\n ��������� ����������");
			boolean flag = true;
			int start = 1; //���������� � ������� ���������� ����� �������. ������������� ������ ���������� ����������� ����� � ������ �������
			int m=n; //��������� ���������� m ��� ������ ����� �������
			while(flag){
				System.out.println(start);
				int x = TestMass[start-1];
				flag=false;
				for (int i=start; i<m; i++){
					if(x>TestMass[i])
					{
						int y = TestMass[i];
						TestMass[i]=x;
						TestMass[i-1]=y;
						flag=true;
					}
				x=TestMass[i];
				}
				m--;
				for (int i=m; i>start-1; i--){
					if(TestMass[i]<TestMass[i-1])
					{
						int y = TestMass[i];
						TestMass[i]=TestMass[i-1];
						TestMass[i-1]=y;
					}
				}
				start++;
			}
			for (int i=0; i<n; i++)
				System.out.print(TestMass[i] + " ");
	}	
}
