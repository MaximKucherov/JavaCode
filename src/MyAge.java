public class MyAge {

    public void youngOrOld(int myAge) {
//        if (myAge > 50) {
//            System.out.println("You are old");
//            return;
//        }
//        System.out.println("You are young");
        String result = (myAge > 50) ? "You are old" : "You are young";
        System.out.println(result);
    }

}
