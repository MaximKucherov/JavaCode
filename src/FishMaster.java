public class FishMaster {

    public static void main(String[] args) {
        Fish myFish = new Fish();

        myFish.dive(2);
        myFish.dive(3);

        myFish.sleep();

        String trySpeakFish = myFish.say("Привет!");
        System.out.println(trySpeakFish);

        myFish.sleep();
    }

}
