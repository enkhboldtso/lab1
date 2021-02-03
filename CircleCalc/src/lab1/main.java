package lab1;
import java.lang.*;
import lab1.Queue;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue daraalal = new Queue();
		System.out.println(daraalal.isEmpty());
		daraalal.add(55);
		daraalal.add(34);
		daraalal.add(66);
		System.out.println(daraalal.isEmpty());
		System.out.println(daraalal.getHeadData());
	}

}
