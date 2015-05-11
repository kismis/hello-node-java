JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	com/kismis/hello/A.java \
	com/kismis/hello/B.java \
	com/kismis/hello/C.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) com/kismis/hello/*.class