public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton uniqueInstance;

	private ThreadSafeSingleton() {}

	public static synchronized ThreadSafeSingleton getInstance() {
	    if (uniqueSingleton == null) {
        	uniqueSingleton = new ThreadSafeSingleton();
            return uniqueSingleton;
        } else {
	        return uniqueInstance;
        }
}
