import java.util.Scanner;

public class sot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int TestMass[] = {8,3,5,7,6,1,2,0,4,9};
		int n=TestMass.length;
		int choose = 0;
		for (int i=0; i<n; i++)
			System.out.print(TestMass[i] + " ");
		System.out.println("\n 1 - глупая сортировка с обходом до конца \n 2 - Сортировка пузырьком \n 3 - С обходом до первой не отсортированной пары \n 4- Шейкерный обход");
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
			default: System.out.println("Введенно не правильное число");
			break;
		}
	}
	
	public static void StupidSort(int TestMass[], int n) {		// Глупая сортировка с обходом до конца
		System.out.println("\n Глупая сортировка с обходом до конца:");
		boolean flag = true;
		while(flag){
			int x = TestMass[0];// Обозначим первый элемент массива переменной x
			flag=false; //Меняем значение флага, чтобы проверить, есть ли числа, которые нужно сортировать
			for (int i=1; i<n; i++){
				if(x>TestMass[i])
				{
					int y = TestMass[i];
					TestMass[i]=x;
					TestMass[i-1]=y;
					flag=true;//Если хоть одно число пришлось переставлять, то выполнить обход массива снова
				}
				x=TestMass[i];
			}
		}
		for (int i=0; i<n; i++)
			System.out.print(TestMass[i] + " ");
	}	
		
	public static void BubbleSort(int TestMass[], int n) { //Сортировка пузырем
		System.out.println("\n Сортировка пузырькем:");
		boolean flag = true;
		int m=n; //Сохраняем переменную m для печати всего массива
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
	
	public static void StupidSort1(int TestMass[], int n) {		// Глупая сортировка
			System.out.println("\n Глупая сортировка с обходом до первого не отсортированного элемента");
			boolean flag = true;
			while(flag){
				int x = TestMass[0];// Обозначим первый элемент массива переменной x
				flag=false; //Меняем значение флага, чтобы проверить, есть ли числа, которые нужно сортировать
				for (int i=1; i<n; i++){
					if(x>TestMass[i])
					{
						int y = TestMass[i];
						TestMass[i]=x;
						TestMass[i-1]=y;
						flag=true;
						break;//Если хоть одно число пришлось переставлять, то выполнить обход массива снова
					}
				x=TestMass[i];
				}
			}
			for (int i=0; i<n; i++)
				System.out.print(TestMass[i] + " ");
	}		
	public static void ShakeSort(int TestMass[], int n) {		// шейкерная сортировка
			System.out.println("\n Шейкерная сортировка");
			boolean flag = true;
			int start = 1; //Переменная с которой начинается обход массива. Увеличивается походу отсеивания минимальных чисел в начало массива
			int m=n; //Сохраняем переменную m для печати всего массива
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
