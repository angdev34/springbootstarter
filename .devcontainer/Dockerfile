# İlk olarak bir Java JDK 17 taban görüntüsü kullanın
FROM openjdk:17-jdk-slim

# Maven'ı yükleyin
RUN apt-get update && apt-get install -y maven

# Lombok jar dosyasını Maven yerel deposuna yükleyin
RUN mvn org.apache.maven.plugins:maven-dependency-plugin:3.2.0:get -Dartifact=org.projectlombok:lombok:1.18.22 -DremoteRepositories=https://repo1.maven.org/maven2

# Özel settings.xml dosyasını kopyalayın
#COPY settings.xml /usr/share/maven/ref/

# Visual Studio Code için SonarLint eklentisini yükleyin
#RUN code --install-extension sonarsource.sonarlint

# Uygulamanızın kaynak kodlarını çalışma dizinine kopyalayın
COPY . /app

# Uygulamayı derleyin ve başlatın
WORKDIR /app
CMD ["mvn", "spring-boot:run"]
