import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Seeker.readFile();
        Seeker.parseFileInfo();
        for(Verb verb : Seeker.findFormsByVerb("see")) {
            System.out.println("infinitive: " + verb.getInfinitive() + " : pastsimple: " + verb.getPastSimple());
        }

    }
}
