import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    private String dataSource;
    private String[] aux;
    private Commands[] commands;

    public CSVReader() {
        this.commands = null;
        this.dataSource = null;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
        if (dataSource == null) {
            aux = null;
        } else
            readCSV();
        commands = new Commands[aux.length];
        for (int i = 0; i < aux.length; i++) {
            if(aux[i].length() == 1) {
                commands[i] = new Promotion(aux[i]);
            } else {
                commands[i] = new Movement(aux[i]);
            }
        }
    }


    public Commands[] requestCommands() {
        return commands;
    }

    private void readCSV() {
        try {
            BufferedReader file = new BufferedReader(new FileReader(dataSource));

            String line = file.readLine();
            if (line != null) {
                aux = line.split(",");
                line = file.readLine();
            }
            file.close();
        } catch (IOException erro) {
            erro.printStackTrace();
        }
    }

}