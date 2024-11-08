package course;

public class Scope {
    int x = 42; // Instanzvariable "x"

    void classLevelScope() {
        System.out.println(x);
        // auch wenn an dieser Stelle nur die Instanzvariable gemeint sein kann,
        // wäre es sauberer mit "this" auf sie zuzugreifen
    }

    void methodLevelScope() {
        // Lokale Variable x trotz gleichnamiger Instanzvariable möglich
        int x = 1;
        System.out.println(x);

        // Auf Instanzvariable "x" kann via "this" zugegriffen werden.
        System.out.println(this.x);
    }

    void methodLevelScope(int x) {
        System.out.println(x);
    }

    /**
     * Bei einer Instanzvariable und einer lokalen Variable mit gleichem Namen
     * hat die lokale Variable Vorrang, die Instanzvariable muss in diesem Fall
     * über "this" referenziert werden.
     **/
    void classLevelScope(int x) {
        // Auf Instanzvariable "x" kann via "this" zugegriffen werden.
        System.out.println(this.x);
    }

    void blockLevelScope(int zahl) {
        String nachricht  = "Mir ist die Zahl egal.";

        if (zahl < 100) {
            //Führt zum Fehler: "Variable 'nachricht' is already defined in the scope"
            //String nachricht = "Die Zahl war kleiner als 100!";
            nachricht = "Die Zahl war kleiner als 100!";
        }

        System.out.println(nachricht);
    }

    public static void main(String[] args) {
        Scope scope = new Scope();
        // Beispiele können auf 's' aufgerufen werden.

        //Beispiel 1
        //Ausgabe:
        //      42
        scope.classLevelScope();

        //Beispiel 2
        //Ausgabe:
        //      1
        //      42
        scope.methodLevelScope();

        //Beispiel 3a
        //Ausgabe:
        //      5
        scope.methodLevelScope(5);

        //Beispiel 3b
        //Ausgabe:
        //      42
        scope.classLevelScope(5);

        //Beispiel 4a
        //Ausgabe:
        //      Die Zahl war kleiner als 100!
        scope.blockLevelScope(5);

        //Beispiel 4b
        //Ausgabe:
        //      Mir ist die Zahl egal.
        scope.blockLevelScope(500);
    }
}