public final class Singleton implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private Singleton() {
	}

	private static final class Holder {
		private static final Singleton INSTANCE = new Singleton();
	}

	public static Singleton getInstance() {
		return Holder.INSTANCE;
	}

	private Object readResolve() {
		return getInstance();
	}

	public void print() {
		System.out.println("works");
	}
}