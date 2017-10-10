public class MachineLibrary {
    private void MachinesLibrary() {}

    public static TuringMachine EqualBinaryWords()
    {
        TuringMachine newTM = new TuringMachine();
        newTM.addState("q1");
        newTM.addState("q2");
        newTM.addState("q3");
        newTM.addState("qa");
        newTM.addState("qr");
        newTM.setStartState("q1");
        newTM.setAcceptState("qa");
        newTM.setRejectState("qr");
        newTM.addTransition("q1", '0', "q1", '0', true);
        newTM.addTransition("q1", '1', "q2", '0', true);
        newTM.addTransition("q1", '@', "q3", '0', true);
        newTM.addTransition("q2", '0', "q2", '0', true);
        newTM.addTransition("q2", '1', "q1", '0', true);
        newTM.addTransition("q2", '@', "q3", '1', true);
        newTM.addTransition("q3", '_', "qa", '_', true);
        return newTM;
    }
}
