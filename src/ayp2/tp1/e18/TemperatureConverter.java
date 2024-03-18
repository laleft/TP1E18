package ayp2.tp1.e18;

/**
 * Clase para convertir unidades fahrenheit a centígrados
 * y centígrados a fahrenheit.
 * 
 * - fahrToCent: convierte grados fahrenheit a centígrados
 *   Fórmula: (°C - 32) * 5/9
 * 
 * - centToFahr: convierte grados centígrados a fahrenheit
 *   Fórmula: F° / (5/9) + 32
 * 
 * @author sdebernardez
 * @version 1.1
 */

public class TemperatureConverter {
	
	private final static float FAHR_ZERO = 32.0f; // 0 grados celsius
	private final static float SCALE = 5.0f/9; // Corrección de escala
	
	/**
	 * @param temperature Temperatura en grados fahrenheit
	 * @return Grados centígrados
	 */
	public static float fahrToCent(float temperature) {
        return (temperature - FAHR_ZERO) * SCALE;
    }
	
	/**
	 * @param temperature Temperatura en grados centígrados
	 * @return Grados fahreinheit
	 */
	public static float centToFahr(float temperature) {
		return temperature / SCALE + FAHR_ZERO;
	}
	
}
