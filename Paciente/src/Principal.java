public class Principal {
    public static void main (String [] args) {
        Paciente p1 = new Paciente(105.0, 1.9);
        Paciente p2 = new Paciente(105.0, 1.6);
        Paciente p3 = new Paciente(60.0, 1.9);
        
        System.out.println(
		"Paciente 1: " +
		"Peso: " + p1.peso + " kg - " +
		"Altura: " + p1.altura + " m - " +
		"Diagnóstico: " + p1.diagnostico()
	);

        System.out.println(
		"Paciente 2: " +
		"Peso: " + p2.peso + " kg - " +
		"Altura: " + p2.altura + " m - " +
		"Diagnóstico: " + p2.diagnostico()
	);

        System.out.println(
		"Paciente 3: " +
		"Peso: " + p3.peso + " kg - " +
		"Altura: " + p3.altura + " m - " +
		"Diagnóstico: " + p3.diagnostico()
	);

    }
}
