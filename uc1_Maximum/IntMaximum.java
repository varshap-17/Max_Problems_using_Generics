package examples.bridgelabz;

public class IntMaximum <T extends Comparable<T>> {
	T x, y, z;
	
	public IntMaximum(T x, T y, T z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public T maximum() {
		return IntMaximum.maximum(x, y, z);
	}
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max=x;  //x is initially largest
		if(y.compareTo(max)>0) {
			max=y; //y is largest now
		}
		if(z.compareTo(max)>0) {
			max=z; //z is largest now
		}
		printMax(x,y,z,max);
		return max;
	}
	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.printf("Max of %s,%s and %s is %s \n",x, y, z, max);
	}
	public static void main(String[] args) {
		Integer xInt=3, yInt=4, zInt=5;
		new IntMaximum<Integer>(xInt,yInt,zInt).maximum();
	}
}
