package ayp2.tp1.e18;

/**
 * Clase para probar la funcionalidad 
 * de TemperatureConverter
 * 
 * @author sdebernardez
 */
public class TemperatureConverterTest {

	public static void main(String[] args) {
		
		float fahr = 32.0f;
		float cent = 0.0f;
		
		// Test fahrToCent		
		System.out.printf("%.1f grados fahrenheit son %.1f centígrados\n", fahr, TemperatureConverter.fahrToCent(fahr));
		
		// Test centToFahr
		System.out.printf("%.1f grados centígrados son %.1f fahrenheit\n", cent, TemperatureConverter.centToFahr(cent));
	
	}
}
