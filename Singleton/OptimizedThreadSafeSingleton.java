public class OptimizedThreadSafeSingleton {
	
	private volatile static OptimizedThreadSafeSingleton uniqueInstance;

	private OptimizedThreadSafeSingleton() {}

	public static OptimizedThreadSafeSingleton getInstance() {
	    if (uniqueSingleton == null) {
        	synchronized (OptimizedThreadSafeSingleton.class) {
				if (uniqueSingleton == null) {
					uniqueSingleton = new OptimizedThreadSafeSingleton();
				}
			} 
        }
		return uniqueInstance;
	}
}