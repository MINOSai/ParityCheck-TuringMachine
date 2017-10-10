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
        newTM.addTransition("q1", '0', "q2", 'x', true);
        newTM.addTransition("q2", '1', "q2", 'y', true);
        newTM.addTransition("q2", '0', "q3", 'x', true);
        newTM.addTransition("q3", '_', "qa", '_', true);
        return newTM;
    }
}
