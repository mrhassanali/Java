class A{
	public void f1(int x){
		System.out.println("Parent Class");
		}
	}
class B extends A{
	public void f1(int x){
		System.out.println("Child Class");
		}
	}
	class overriding{
		public static void main(String [] args){
			B sub = new B();
			sub.f1(10); // call its a child class
			}
		}
