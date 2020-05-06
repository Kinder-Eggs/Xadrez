public class main {
    public static void main(String[] args) {
        CSVReader csv = new CSVReader();
        csv.setDataSource("C:/Users/Gasni/IdeaProjects/Chess/src/db/arq001.csv");
        Commands[] commands = csv.requestCommands();
        Table table = new Table();
        table.setupTable();
        table.printTable();
        for (int i = 0; i < commands.length; i++){  // Game loop
            if (commands[i].getCommand().length() == 1) {  // Promotion Routine

            } else {  // Movement routine
                table.pieces[csvToPos(commands[i].getCommand().substring(0,2))].move(csvToPos(commands[i].getCommand().substring(3,5)), table);
                System.out.println("Source: " + commands[i].getCommand().substring(0,2));
                System.out.println("Target: " + commands[i].getCommand().substring(3,5));
            }
            table.printTable();
        }
    }

    private static int csvToPos(String coord) {  // Converts coordinate (a1-h8) to integer
        char col = coord.charAt(0);
        int lin = Integer.parseInt((coord.substring(1,2)));
        return (8-lin)*8 + (int) col - 97;
    }
}
