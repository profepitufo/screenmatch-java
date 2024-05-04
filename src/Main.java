import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Bienvenidos a la inmersión JAVA");
        // System.out.println("Película Matrix");

        // Tipos de datos Primitivos: int, double, boolean.
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        double mediaEvaluacion = (4.5 + 4.8 + 3.0) / 3;
        double mediaEvaluacionUsuario = 0;
        // Clase String para textos.
        String nombre = "Matrix";
        String sinopsis = """
                La mejor película del fin del milenio
                """;

        System.out.println("Película: "+nombre);
        System.out.println("Breve Sinopsis: "+sinopsis);

        System.out.println("Se lanzó en: "+fechaDeLanzamiento);
        System.out.println("YO la evalué: "+evaluacion);
        System.out.println("Es plan Básico?: "+incluidoEnElPlanBasico);
        System.out.println("El público la evaluó: " + mediaEvaluacion);
        // Película Retro o Actual
        if (fechaDeLanzamiento >= 2023)
        {
            System.out.println("Película popular en el momento");
        } else
        {
            System.out.println("Película Retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresar la Nota para Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("La media de la película " +
                "Matrix calculada por el Usuario es: " + mediaEvaluacionUsuario / 3);

    }
}