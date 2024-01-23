package testbench;

import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.Random;

@State(Scope.Thread)
@BenchmarkMode(Mode.SingleShotTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class BenchmarkBasic1 {
    public boolean randomMathBoolean;
    public boolean randomNewRandomBoolean;

    public static void main(String[] args) throws RunnerException {
        System.err.close();
        System.setErr(System.out);
        var opt = new OptionsBuilder()
                .include(BenchmarkBasic1.class.getSimpleName()).forks(1).build();
        new Runner(opt).run();
    }


        @Setup
        public void setup () {
            randomMathBoolean = randomMathBoolean();
            randomNewRandomBoolean = randomNewRandomBoolean();
        }


        @Benchmark
        public static boolean randomMathBoolean () {
            return Math.random() > 0.5;
        }

        @Benchmark
        public static boolean randomNewRandomBoolean () {
            Random random = new Random();
            return random.nextBoolean();
        }

}
