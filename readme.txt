Build:

    javac Main.java

    docker build -t java-docker-test .

Run with 2 cpus but tricking the JVM into thinking it has 32 cpus:

    docker run --cpus 2 -e PROCS=32 -it --rm java-docker-test

Example output:

    $ docker run --cpus 2 -e PROCS=32 -it --rm java-docker-test
    Runtime.getRuntime.availableProcessors() = 32
    java.util.concurrent.ForkJoinPool.getCommonPoolParallelism() = 31


LICENSE: Public Domain
