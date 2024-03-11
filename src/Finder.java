
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Finder {

    public static void main(String[] args) {
        //tryWithResources();

        locateFile();


    }

    public static void locateFile() {

        /*//initialize Path object
        Path path = Paths.get("D:file.txt");
        //create file
        try {
            Path createdFilePath = Files.createFile(path);
            System.out.println("Created a file at : "+createdFilePath);
        }
        catch (IOException e) {
            e.printStackTrace();
        }*/

        String fileNameToFind = "test.txt";
        File rootDirectory = new File("c:/Users/youssef");

        /*final List<File> foundFiles = new ArrayList<>();

        try (Stream<Path> walkStream = Files.walk(rootDirectory.toPath())) {
            walkStream.filter(p -> p.toFile().isFile())
                    .forEach(f -> {
                        System.out.println("array[i] = "+f);
                        if (f.toString().endsWith(fileNameToFind)) {
                            foundFiles.add(f.toFile());
                        }
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        try (Stream<Path> stream = Files.walk(Paths.get("c:/Users/youssef/AppData/Local/Mozilla"))) {

            //System.out.println("stream.count() = "+stream.count());
            Path pathRetour = stream//.filter(Files::isRegularFile)
                    .filter(file -> file.toFile().getName().equals("base-email-track-digest256.sbstore"))
                    .findAny().get();
                    //.forEach(System.out::println);
            System.out.println("pathRetourj = "+pathRetour.toString());
            System.out.println("pathRetour.toFile().getName() = "+pathRetour.toFile().getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*Files.find(Paths.get("c:/Users/youssef"),
                        Integer.MAX_VALUE,
                        (filePath, fileAttr) -> fileAttr.isRegularFile())
                .forEach(System.out::println);*/


    }

    public static void tryWithResources(){
        try{
            File myFile = new File("C:\\Windows");
            File[] array = myFile.listFiles();
            System.out.println("array.length = "+array.length);
            for (int i = 0; i < array.length; i++) {
                System.out.println("array[i] = "+array[i]);
            }
        } catch(Exception e){

        }
    }
}
