package examples.bridgelabz;

public class StringMaximum <T extends Comparable<T>>{
	T x, y, z;
	
	public StringMaximum(T x, T y, T z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	@SuppressWarnings("rawtypes")
	public static Comparable maximum() {
	return StringMaximum.maximum();
	}
	public static String testMaximum(String x,String y,String z) {
	     String max=x;
	     if(y.compareTo(max)>0) {
	    	 max=y;
	     }
	     if(z.compareTo(max)>0) {
	    	 max=z;
	     }
	     printMax(x,y,z,max);
	     return max;
	}
	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.printf("Max of %s,%s and %s is %s \n",x, y, z, max);
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		String xStr="pear",yStr="apple",zStr="pineapple";
		StringMaximum.testMaximum(xStr, yStr, zStr);
		new StringMaximum<String>(xStr,yStr,zStr).maximum();
	}
}

