public class Wolves {
    static String wolfNames = "";
    static int wolfCount = 0;

    public static void main(String[] args) {
        addWolf(new Wolf("Alaska", 10, "Female", "Arctic Wolf", "White", 75));
        addWolf(new Wolf("Alpha", 5, "Male", "Red Wolf", "Brown", 56));
        addWolf(new Wolf("TeamJacob",2 , "Male", "Gray Wolf", "Gray", 69));
        addWolf(new Wolf("AlphaJR", 1, "Female", "Eurasian Wolf", "Cream", 98));
        addWolf(new Wolf("SigmaBeta", 6, "Male", "Mexican Wolf", "Rust", 80));

        System.out.println("The wolves that are in the enclosure are: " + getWolves());
        System.out.println("Currently, there are " + numWolves() + " wolves in the enclosure.");
    }

    public static void addWolf(Wolf w) {
        if (wolfNames.isEmpty()) {
            wolfNames = w.getName();
        } else {
            wolfNames += ", " + w.getName();
        }
        wolfCount++;
    }

    public static String getWolves() {
        return wolfNames;
    }

    public static int numWolves() {
        return wolfCount;
    }
}
