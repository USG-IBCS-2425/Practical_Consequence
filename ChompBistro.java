import java.util.*;

class ChompBistro {
    String[] employees = new String[5];
    String[] menuItems = new String[6]; 
    int days;

    public ChompBistro(String[] emp, String[] menu) {
        for (int i = 0; i < emp.length; i++) {
            employees[i] = emp[i]; 
        }
        for (int i = 0; i < menu.length; i++) {
            menuItems[i] = menu[i]; 
        }
        days = 1; 
    }

    public String getEmployees() {
        String employeeList = "";
        for (int i = 0; i < employees.length; i++) {
            employeeList = employeeList + employees[i];
            if (i < employees.length - 1) {
                employeeList = employeeList + ", "; 
            }
        }
        return employeeList;
    }

    public String getMenuItems() {
        String menuList = "";
        for (int i = 0; i < menuItems.length; i++) {
            menuList = menuList + menuItems[i];
            if (i < menuItems.length - 1) {
                menuList = menuList + ", "; 
            }
        }
        return menuList;
    }

    public int getDay() {
        return days;
    }
	
	public void setDay(int day) {
	    if (day >= 1) {
	        if (day <= 5) {
	            days = day; 
	        } else {
	            System.out.println("Invalid day. Please enter a number between 1 and 5.");
	        }
	    } else {
	        System.out.println("Invalid day. Please enter a number between 1 and 5.");
	    }
	}

    public String generateMenu() {
        Random random = new Random();
        String menu = "";
        for (int i = 0; i < 3; i++) {
            int randomIndex = random.nextInt(menuItems.length);
            menu += menuItems[randomIndex];
            if (i < 2) {
                menu = menu + ", "; 
            }
        }
        return menu;
    }

 
    public String workers() {
        String emp1 = "";
        String emp2 = "";
        if (days == 1) {
            emp1 = employees[0];
            emp2 = employees[1];
        } 
        if (days == 2) { 
            emp1 = employees[1];
            emp2 = employees[2];
        } 
        if (days == 3) {
            emp1 = employees[2];
            emp2 = employees[3];
        } 
        if (days == 4) { 
            emp1 = employees[3];
            emp2 = employees[4];
        }
        if (days == 5) {
            emp1 = employees[4];
            emp2 = employees[0];
        } 
        return emp1 + " and " + emp2 + " are working today.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        String[] employees = {"Lyzane", "Di", "Hannah", "Alex", "Miles"};
        String[] menuItems = {"Grilled Cheese", "Ham Sandwich", "Rice Krispy", "Brownie", "Egg Sandwich"};

        ChompBistro bistro = new ChompBistro(employees, menuItems);

        System.out.println("Choose an option:");
        System.out.println("1. See the Menu of the Day");
        System.out.println("2. See who is working today");
        System.out.println("3. Change day");
        System.out.println("4. Exit");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Menu of the Day: " + bistro.generateMenu());
        } 
        if (choice == 2) {
            System.out.println("Who is working today: " + bistro.workers());
        } 
        if (choice == 3) {
            System.out.println("Enter a day (1-5): ");
            int newDay = scanner.nextInt();
            bistro.setDay(newDay);
            System.out.println("Day has been set to: " + bistro.getDay());
        } 

       
    }
}
