package Lab2.ProblemA;

import java.util.HashSet;

public class BotTester {
    public static void main(String[] args) 
    {
        HashSet<Bot> botSet = new HashSet<>();

        WorkerBot WorkerBot1 = new WorkerBot("A", "Mining", "Electric Drill");
        WorkerBot WorkerBot2 = new WorkerBot("A", "Mining", "Electric Drill");
        WorkerBot WorkerBot3 = new WorkerBot("B", "Mining", "Electric Drill");
        DissasemblyBot DissasemblyBot1 = new DissasemblyBot("N", "General dissasembly", "Plasmacutter");
        DissasemblyBot DissasemblyBot2 = new DissasemblyBot("V", "Biological disposal", "Flamethrower");

        botSet.add(WorkerBot1);
        botSet.add(WorkerBot2); 
        botSet.add(WorkerBot3);
        botSet.add(DissasemblyBot1);
        botSet.add(DissasemblyBot2); 

        System.out.println("Bots in the HashSet:");
        for (Bot bot : botSet) 
        {
            System.out.println(bot);
        }

        System.out.println("\nNumber of unique bots: " + botSet.size());
    }
}
