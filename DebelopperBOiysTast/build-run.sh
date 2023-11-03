cd auth/auth/
mvn clean install
nohup java -jar ./target/auth-0.0.1-SNAPSHOT.jar > auth.out &

cd ../../show/show
mvn clean install
nohup java -jar ./target/show-0.0.1-SNAPSHOT.jar > show.out &

cd ../../misdirection/misdirection
mvn clean install
nohup java -jar ./target/misdirection-0.0.1-SNAPSHOT.jar > misdirection.out &

cd ../../reveal/reveal
mvn clean install
nohup java -jar ./target/reveal-0.0.1-SNAPSHOT.jar > reveal.out &

cd ../../prestige/prestige
mvn clean install
nohup java -jar ./target/prestige-0.0.1-SNAPSHOT.jar > prestige.out &