package Assign_2;
import java.util.*;

public class Collection_class {
	    @SuppressWarnings("resource")
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Which Collection class do you want to use?");
	        System.out.println("1) ArrayList");
	        System.out.println("2) LinkedList");
	        System.out.println("3) Vector");
	        System.out.println("4) Stack");
	        System.out.println("5) HashSet");
	        System.out.println("6) Priority Queue");
	        System.out.println("7) ArrayDeque");

	        int collectionChoice = scanner.nextInt();
	        Collection<String> collection = null;

	        switch (collectionChoice) {
	            case 1:
	                collection = new ArrayList<>();
	                break;
	            case 2:
	                collection = new LinkedList<>();
	                break;
	            case 3:
	                collection = new Vector<>();
	                break;
	            case 4:
	                collection = new Stack<>();
	                break;
	            case 5:
	                collection = new HashSet<>();
	                break;
	            case 6:
	                collection = new PriorityQueue<>();
	                break;
	            case 7:
	                collection = new ArrayDeque<>();
	                break;
	            default:
	                System.out.println("Invalid choice!");
	                return;
	        }

	        boolean exit = false;

	        while (!exit) {
	            System.out.println("What operation do you want to perform on the collection?");
	            System.out.println("1) Add elements");
	            System.out.println("2) Remove elements");
	            System.out.println("3) Display data");
	            System.out.println("4) Sort data");
	            System.out.println("5) Search element");
	            System.out.println("6) Exit");

	            int operationChoice = scanner.nextInt();

	            switch (operationChoice) {
	                case 1:
	                    System.out.println("Enter the elements to add (separated by spaces):");
	                    scanner.nextLine();
	                    String elements = scanner.nextLine();
	                    String[] elementArray = elements.split(" ");
	                    for (String element : elementArray) {
	                        collection.add(element);
	                    }
	                    System.out.println("Elements added successfully.");
	                    break;
	                case 2:
	                    System.out.println("Enter the element to remove:");
	                    scanner.nextLine(); 
	                    String elementToRemove = scanner.nextLine();
	                    boolean removed = collection.remove(elementToRemove);
	                    if (removed) {
	                        System.out.println("Element removed successfully.");
	                    } else {
	                        System.out.println("Element not found in the collection.");
	                    }
	                    break;
	                case 3:
	                    System.out.println("Collection data:");
	                    for (String element : collection) {
	                        System.out.println(element);
	                    }
	                    break;
	                case 4:
	                    if (collection instanceof List) {
	                        Collections.sort((List<String>) collection);
	                        System.out.println("Collection sorted successfully.");
	                    } else {
	                        System.out.println("Sorting is not supported for the selected collection.");
	                    }
	                    break;
	                case 5:
	                    System.out.println("Enter the element to search:");
	                    scanner.nextLine(); 
	                    String elementToSearch = scanner.nextLine();
	                    boolean found = collection.contains(elementToSearch);
	                    if (found) {
	                        System.out.println("Element found in the collection.");
	                    } else {
	                        System.out.println("Element not found in the collection.");
	                    }
	                    break;
	                case 6:
	                    exit = true;
	                    break;
	                default:
	                    System.out.println("Invalid choice!");
	            }
	        }

	        System.out.println("Exiting the program. Thank you!");

	        scanner.close();
	    }
	}
