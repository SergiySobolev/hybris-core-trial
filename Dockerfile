FROM plaguedocktor/hybris-base-image:1.0

COPY /bin/custom /home/hybris/bin/custom
COPY config /home/hybris/config
RUN curl -L -o /home/hybris/bin/platform/lib/dbdriver/mysql-connector-java-5.1.34.jar https://repo1.maven.org/maven2/mysql/mysql-connector-java/5.1.34/mysql-connector-java-5.1.34.jar

RUN  ant -f /home/hybris/bin/platform/build.xml clean all
entrypoint  ant -f /home/hybris/bin/platform/build.xml initialize
entrypoint cd /home/hybris/bin/platform && ./hybrisserver.sh


