public class Principal {
    public static void main (String [] args) {
        Paciente p1 = new Paciente(105.0, 1.9);
        Paciente p2 = new Paciente(105.0, 1.6);
        Paciente p3 = new Paciente(60.0, 1.9);
        
        System.out.println(p1.diagnostico());
        System.out.println(p2.diagnostico());
        System.out.println(p3.diagnostico());
    }
}
