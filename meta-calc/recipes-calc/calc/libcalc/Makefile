TARGET=libcalc.so
SRCS=libcalc.c

all:
	${CC} ${SRCS} -shared -o ${TARGET}

install:
	sudo cp ${TARGET} /usr/local/lib;
	sudo ldconfig;

clean:
	rm -f ${TARGET}
