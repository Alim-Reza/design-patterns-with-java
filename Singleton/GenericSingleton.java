public class GenericSingleton {
	
	private static GenericSingleton uniqueInstance;

	private GenericSingleton() {}

	public static GenericSingleton getInstance() {
	    if (uniqueSingleton == null) {
        	uniqueSingleton = new GenericSingleton();
            return uniqueSingleton;
        } else {
	        return uniqueInstance;
        }
}
