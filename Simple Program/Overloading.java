class A{
	int y;
	public void f1(int x){
		y=x;
		System.out.println("Parent Class= "+y);
		}
	}
	class B extends A{
		int a, b;
		public void f1(int w,int z){
			a=w;
			b=z;
			System.out.println("Child Class="+(a+z));
			}
		}
		class Overloading{
			public static void main(String [] args){
				B sub=new B();
				sub.f1(10);    // call parent class
				sub.f1(10,10); // call by child class
				}
			}
