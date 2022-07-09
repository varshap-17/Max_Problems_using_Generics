package examples.bridgelabz;

	public class Max_method <T extends Comparable<T>> {
		T x, y, z, p, q, r;
	
		public Max_method(T x, T y, T z,T p,T q,T r) {
			this.x=x;
			this.y=y;
			this.z=z;
			this.p=p;
			this.q=q;
			this.r=r;
		}
		public T maximum() {
			return Max_method.maximum(x, y, z, p, q, r);
        }
		public static <T extends Comparable<T>> T maximum(T x, T y, T z,T p,T q,T r) {
			T max=x;  //x is initially largest
			if(y.compareTo(max)>0) {
				max=y; //y is largest now
			}
			if(z.compareTo(max)>0) {
				max=z; //z is largest now
			}
			if(p.compareTo(max)>0) {
				max=p;
			}
			if(q.compareTo(max)>0) {
				max=q;
			}
			if(r.compareTo(max)>0) {
				max=r;
			}
			printMax(x,y,z,p,q,r,max);
			return max;
		}
		public static String testMaximum(String x,String y,String z,String p,String q,String r) {
			String max=x;
			if(y.compareTo(max)>0) {
				max=y;
			}
			if(z.compareTo(max)>0) {
				max=z;
			}
			if(p.compareTo(max)>0) {
				max=p;
			}
			if(q.compareTo(max)>0) {
				max=q;
			}
			if(r.compareTo(max)>0) {
				max=r;
			}
			printMax(x,y,z,p,q,r,max);
			return max;
		}
		public static <T> void printMax(T x, T y, T z,T p,T q,T r,T max) {
			System.out.printf("Max of %s,%s,%s,%s,%s and %s is %s \n",x, y, z,p,q,r, max);
		}
		public static void main(String[] args) {
			Integer xInt=3, yInt=4, zInt=5, pInt=1, qInt=10, rInt=6;
			Float xFl=5.5f, yFl=8.8f, zFl=7.7f, pFl=1.1f, qFl=4.8f, rFl=8.2f;
			String xStr="pear",yStr="apple",zStr="pineapple",qStr="gauvaa", pStr="Mango", rStr="Bannana";
	
		//	Max_method.testMaximum(xStr, yStr, zStr,pStr,qStr,rStr);
			new Max_method<String>(xStr,yStr,zStr,pStr,qStr,rStr).maximum();
			new Max_method<Float>(xFl,yFl,zFl,pFl,qFl,rFl).maximum();
			new Max_method<Integer>(xInt,yInt,zInt,pInt,qInt,rInt).maximum();
		}
}
