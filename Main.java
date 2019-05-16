import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Queue<Order> ordersQueue = new LinkedList<Order>();
		
		System.out.println("Welcome to the ordering system!");
		
		while (true) {
			System.out.print("Please select an action: (a/r)  ");
			String input = in.nextLine();
			
			System.out.println("----------------------------");
			
			if (input.equals("a")) {
				Order order = new Order();	
				
				// get entree
				System.out.print("Enter entree:  ");
				String typedInEntree = in.nextLine(); 
				order.setEntree(typedInEntree);
				
				// get side
				System.out.print("Enter side:  ");
				String typedInSide = in.nextLine();
				order.setSide(typedInSide);
				
				// get notes
				System.out.print("Enter notes:  ");
				String typedInNotes = in.nextLine();
				order.setNotes(typedInNotes);
				
				
				// add order to queue
				ordersQueue.add(order);
							
				int time = 7 + (ordersQueue.size()*3);
				System.out.println("The estimated preparation time is " + time + " minutes.");
				
			} else {	
				
				if (ordersQueue.isEmpty()) {
					System.out.println("No orders need to be cooked.");
				
				} else {
				Order removedOrder = ordersQueue.remove();
				System.out.println("Entree: " + removedOrder.getEntree());
				System.out.println("Side: " + removedOrder.getSide());
				System.out.println("Notes: " + removedOrder.getNotes());
				} System.out.println();
				
				int remainingOrders = ordersQueue.size();
				
				if (remainingOrders == 1) {
					System.out.println("There is 1 order left.");
				}
				else {
					System.out.println("There are " + remainingOrders + " orders left.");
				}
			}
			
			System.out.println("----------------------------");
			System.out.println();
				
		}

	}

}
