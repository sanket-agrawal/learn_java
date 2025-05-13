package Methods;

public class EligibilityToVote {

    public static boolean isElgibile(int age){
        return age > 18;
    }

    public static void main(String[] args) {
        int age = 8;
        boolean eligibility = isElgibile(age);
        if(eligibility){
            System.out.println("Elgibile to vote");
        }else{
            System.out.println("Not elgibile");
        }
    }
}
