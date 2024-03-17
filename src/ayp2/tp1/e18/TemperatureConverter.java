package ayp2.tp1.e18;

public class TemperatureConverter {
	
	private final static float FAHR_ZERO = 32f; 
	private final static float SCALE = 5.0f/9;
	
	public static float fahrToCent(float temperature) {
        return (temperature - FAHR_ZERO) * SCALE;
    }
	
	public static float centToFahr(float temperature) {
		return temperature / SCALE + FAHR_ZERO;
	}
	
}
