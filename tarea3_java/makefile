JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
		$(JC) $(JFLAGS) $*.java

CLASSES = \
        Persona.java \
        Edificio.java \
        Atraccion.java \
        Feria.java \
		Javapato.java \
		Museo.java \
		Cientifico.java \
		Granjero.java \
		Herrero.java \
		Laboratio.java \
		Herrería.java \
		Granero.java \
		ZonaComun.java \
		Jugador.java \
		Javation.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
		$(RM) *.class