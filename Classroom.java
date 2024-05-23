public class Classroom {
    public static void main(String[] args) {
        Wilder lily = new Wilder("Lily", true);
        System.out.println(lily.whoAmI());

        Wilder yacine = new Wilder("Yacine");
        System.out.println(yacine.whoAmI());
    }
}