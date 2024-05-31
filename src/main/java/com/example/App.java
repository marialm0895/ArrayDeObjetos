package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
	private static int SIZE;
    public static void main( String[] args )
    {
    	if(args.length != 0)
    		SIZE = Integer.parseInt(args[0]);
    	
      // para crear un array de persona
    	Persona[] personas = {
    			Persona.builder()
    			.nombre("Ivan")
    			.primerApellido("Santiago")
    			.genero(Genero.HOMBRE)
    			.build(),
    	Persona.builder()
    		.nombre("Maria José")
    		.primerApellido("Rodriguez")
    		.salario(2500.50)
    		.genero(Genero.MUJER)
    		.build(),
    	Persona.builder()
    		.nombre("Tamara")
    		.primerApellido("Sanchez")
    		.genero(Genero.MUJER)
    		.salario(2800.90)
    		.build(),
    	Persona.builder()
    		.nombre("Adrian")
    		.primerApellido("Santos")
    		.segundoApellido("Gil")
    		.genero(Genero.HOMBRE)
    		.salario(3000.00)
    		.build()
    	};
    	
    	/*¿Qué podemos hacer con los array de objetos?
    	 * 
    	 * 1.Recorrerlos y mostrar los elementos por consola
    	 * ¿Cómo podemos recorrer el array de personas?
    	 * Rta. Con un for mejorado*/
    	System.out.println("Recorriendo el array de personas-----------------");
    	for(Persona persona : personas)
    		System.out.println(persona);
    	
    	/*Agregar una nueva persona al array de personas NO ES POSIBLE*/
    
    	// personas[4] = Persona.builder()
    	//		.nombre("Marly")
    	//		.build(); esto no funciona
    	//Para agregar un elemento a un array, por ejemplo, si fuese de enteros
    	int[] arrayDeNumeros = {
    		1, 2, 3, 4
    	};
    	
    	// arrayDeNumeros.push(5); esto no deja
    	
    	// arrayDeNumeros[4] = 5; 
    	// esta operación genera un array inmutable, porque 4 esta fuera de rango y no se puede agregar un elemento
   
    	/*Recorrer el array de personas y almacenar las personas del genero MUJER
    	 * en un nuevo array que podemos llamar arrayDeMujeres*/
    	Persona[] arrayDeMujeres = new Persona[SIZE];
    	
    	int indice = 0;
    	
    	for(Persona p: personas) {
    		if(p.getGenero().equals(Genero.MUJER))
    			arrayDeMujeres[indice++] = p;
    	}
    	System.out.println("Personas del genero mujer .......");
    	for(Persona mujer : arrayDeMujeres) {
    		if (mujer != null)
    			System.out.println(mujer);
    		else
    			break; // palabra reserbada que rompe el bucle 
    	}
    	
    	/*
    	 * Ejercicio # 1. Crear una rama nueva
    	 * 
    	 * Recorrer el array de personas y recuperar el salario promedio
    	 * de todas las personas */
    	
    	double sumatoriaDeLosSalarios = 0.0;
    	int totalDePersonas = personas.length;
    	double salarioPromedio = 0.0;
    	
    	for(Persona persona : personas) {
    		sumatoriaDeLosSalarios = sumatoriaDeLosSalarios + persona.getSalario();
    	}
    	
    	salarioPromedio = sumatoriaDeLosSalarios / totalDePersonas;
    	System.out.println("El salario promedio de todas las personas es:" + salarioPromedio);
    	
    	/*
    	 * Ejercicio # 2.
    	 * 
    	 * Recorrer el array de perssonas y calcular el salario promedio por genero*/
    	
    	double sumatoriaSalariosHombre = 0.0;
      	double sumatoriaSalariosMujer = 0.0;
      	double sumatoriaSalariosOtro = 0.0;
      	
      	int totalGeneroHombre = 0;
      	int totalGeneroMujer = 0;
      	int totalGeneroOtro = 0;
      	
      	double salarioPromedioHombres = 0.0;
      	double salarioPromedioMujeres = 0.0;
      	double salarioPromedioOtros = 0.0;
      	for(Persona p : personas) {
      		if(p.getGenero().equals(Genero.HOMBRE)) {
      			sumatoriaSalariosHombre += p.getSalario();
      			totalGeneroHombre++;
      		} else if(p.getGenero().equals(Genero.MUJER)) {
      			sumatoriaSalariosMujer += p.getSalario();
      			totalGeneroMujer++;
      		} else {
      			sumatoriaSalariosOtro += p.getSalario();
      			totalGeneroOtro++;
      		}
      	}
      	
      	salarioPromedioHombres = sumatoriaSalariosHombre / totalGeneroHombre;
      	salarioPromedioMujeres = sumatoriaSalariosMujer / totalGeneroMujer;
      	salarioPromedioOtros = sumatoriaSalariosOtro / totalGeneroOtro;
      	
      	System.out.println("Salario promedio de los Hombres: " + salarioPromedioHombres);
      	System.out.println("Salario promedio de las Mujeres: " + salarioPromedioMujeres);
      	System.out.println("Salario promedio de Otros Generos: " + salarioPromedioOtros);
    }
    
    
}
