# makefile sin uso de macros
friendTest: main.o A.o
	g++ -o main main.o A.o

friendTest.o: main.cpp A.h 
	g++ -c main.cpp

A.o: A.cpp A.h
	g++ -c A.cpp

clean: 
	rm -rf *.o friendTest

