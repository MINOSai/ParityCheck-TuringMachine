public class Main {

    public static void main(String[] args) {
        TuringMachine TM1 = MachineLibrary.ParityCheck();

        boolean done = TM1.Run("01110110@", false);
        if (done)
        {
            System.out.println("The input was evaluated.");
        }
        else
        {
            System.out.println("The input was not evaluated.");
        }
    }
}