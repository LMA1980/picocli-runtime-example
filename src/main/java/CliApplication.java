import picocli.CommandLine;

public class CliApplication {
    public static void main(String... args) {
        try {
            new CommandLine(new commands.HelloWord()).execute(args);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
