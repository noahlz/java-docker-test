FROM openjdk:8u242-jre-slim

COPY Main.class /app/Main.class

ENV PROCS=2

CMD java \
  -XX:+UnlockExperimentalVMOptions \
  -XX:ActiveProcessorCount=${PROCS} \
  -cp /app Main

