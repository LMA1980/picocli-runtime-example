package commands;

import picocli.CommandLine;

import java.util.concurrent.Callable;

@CommandLine.Command(name = "HelloWord", mixinStandardHelpOptions = true, version = "1.0")
public class HelloWord implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("Hello world!");
        return 0;
    }
}
