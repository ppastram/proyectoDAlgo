import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Programa para calcular el mínimo número de pasos que el protagonista de "Trampolines y tablones" debe realizar para ir del origen al final del camino, devuelve -1 si no es posible llegar al final
 * @author Pablo Pastrana
 * @author Sebastián Baquero
 * nota: la lectura de datos se adaptó del problema de ejemplo Z
 */

public class ProblemaC 
{
	public static void main(String[] args) throws Exception 
	{
		ProblemaC instancia = new ProblemaC();
		//lectura de datos
		try ( 
			InputStreamReader is= new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);
		) { 
			String line = br.readLine();
				
			while(line!=null && line.length()>0 && !"0 0".equals(line)) {
				String [] dataStr = line.split(" ");
				final int[] nym = Arrays.stream(dataStr).mapToInt(f->Integer.parseInt(f)).toArray();
				
				line = br.readLine();
				dataStr = line.split(" ");
				final int[] numeros = Arrays.stream(dataStr).mapToInt(f->Integer.parseInt(f)).toArray();
				
				int respuesta = instancia.buscarCamino(nym, numeros);
				System.out.println(respuesta);
				line = br.readLine();
			}
		}
	}
	/**
	 * Calcula la cantidad de pares y la suma de pares de una lista de numeros
	 * @param numeros a procesar 
	 * @return int [] arreglo de dos posiciones. La primera tiene la cantidad de numeros pares
	 * y la segunda la suma de los numeros 
	 */
	public int buscarCamino(int[] nym, int[] tablero) 
	{
		int n = nym[0];
		int m = nym[1];
		int res = 0;
		
		return res+n+m+tablero[0];
	}

}
