package tp1_Ejercicio3;

public class Test {
	public static void main(String[] args) {
		 Estudiante [] estu = new Estudiante[2];
		 Profesor [] profe = new Profesor[3];
		 
		 estu[0] = new Estudiante();
		 estu[0].setApellido("Lopez");
		 estu[0].setNombre("Pepe");
		 estu[0].setComision(1);
		 estu[0].setDireccion("AAA 131");
		 estu[0].setEmail("aaaaa@example.com");
		 
		 estu[1] = new Estudiante();
		 estu[1].setApellido("Garcia");
		 estu[1].setNombre("Ezequiel");
		 estu[1].setComision(5);
		 estu[1].setDireccion("BBB 567");
		 estu[1].setEmail("bbb@example.com");
		 
		 profe[0] = new Profesor();
		 profe[0].setApellido("Gonzalez");
		 profe[0].setNombre("Mario");
		 profe[0].setCatedra("CADP");
		 profe[0].setFacultad("Infromatica");
		 profe[0].setEmail("cccc@example.com");
		 
		 profe[1] = new Profesor();
	     profe[1].setNombre("Marta");
         profe[1].setApellido("Rodríguez");
         profe[1].setEmail("marta.rodriguez@example.com");
         profe[1].setCatedra("Física");
         profe[1].setFacultad("Ingeniería");

         profe[2] = new Profesor();
         profe[2].setNombre("Luis");
         profe[2].setApellido("Gómez");
         profe[2].setEmail("luis.gomez@example.com");
         profe[2].setCatedra("Química");
         profe[2].setFacultad("Ciencias Naturales");
         
         // Imprimo 
         for (int i=0; i<2; i++) {
        	 System.out.println(estu[i].tusDatos());
         }
         for (int i=0; i<3; i++) {
        	 System.out.println(profe[i].tusDatos()); 
         }
	}
}

