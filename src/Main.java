public class Main {

    public static void main(String[] args) {
        TuringMachine TM1 = MachineLibrary.EqualBinaryWords();

        boolean done = TM1.Run("01111110", false);
        if (done)
        {
            System.out.println("The input was accepted.");
        }
        else
        {
            System.out.println("The input was rejected.");
        }
    }
}