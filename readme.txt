Build:

    javac Main.java

    docker build -t java-docker-test .

Run with 2 cpus but tricking the JVM into thinking it has 32 cpus:

    docker run --cpus 2 -e PROCS=32 -it --rm java-docker-test
