FROM plaguedocktor/hybris-base-image:1.0

COPY /bin/custom /home/hybris/bin/custom
COPY config /home/hybris/config

RUN  ant -f /home/hybris/bin/platform/build.xml clean all
RUN  ant -f /home/hybris/bin/platform/build.xml initialize
entrypoint cd /home/hybris/bin/platform && ./hybrisserver.sh


