import MODEL.Demon;
import MODEL.DemonList;
import Statics.Constants;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.*;


public class Main {
    public static void main(String[] args) {

        System.out.println("Iniciando......");
        generateUsersFile();
        generateOpinionsFile();
        generateDemonsFile();
    }

    private static void generateUsersFile() {
        File usersFile = new File(Constants.DATA_PATH + Constants.USERS_FILENAME);

        if (!usersFile.exists()) {
            try {
                usersFile.createNewFile();
                System.out.println("Users file generated correctly");
            } catch (IOException e) {
                System.out.println("Error: Unable to generate users file");
            }
        }
    }

    private static void generateOpinionsFile() {
        File opinionsFile = new File(Constants.DATA_PATH + Constants.OPINIONS_FILENAME);

        if (!opinionsFile.exists()) {
            try {
                opinionsFile.createNewFile();
                System.out.println("Opinions file generated correctly");
            } catch (IOException e) {
                System.out.println("Error: Unable to generate opinions file");
            }
        }
    }

    private static void generateDemonsFile() {
        File demonsFile = new File(Constants.DATA_PATH + Constants.DEMONS_FILENAME);
        if (!demonsFile.exists()) {
            DemonList demonList = new DemonList();
            demonList.getDemonList().add(new Demon("Rey Bael", "El primer Rey del Infierno, se le suele representar con tres cabezas (hombre, sapo y gato). Comanda sobre 66 legiones de demonios y enseña el arte de la invisibilidad."));

            try {
                XStream xstream = new XStream(new DomDriver());
                xstream.alias("DemonList", DemonList.class);
                xstream.alias("Demon", Demon.class);
                xstream.addImplicitCollection(DemonList.class, "demonList"); //

                xstream.toXML(demonList, new FileOutputStream(Constants.DATA_PATH + Constants.DEMONS_FILENAME));
                System.out.println("Demons file generated correctly");
            } catch (Exception e) {
                System.out.println("Error: Unable to generate demons file");
            }
        }
    }



}