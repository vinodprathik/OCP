package InterfaceInheritance;

public class ShapeCalculate extends Calculate implements Size{
		int a =3;
			@Override
			public void calculate() {
				// TODO Auto-generated method stub
				int x =a*a;
				System.out.println("square = "+x);
			}
		public static void main(String[] args) {
			Size s = new ShapeCalculate();
			s.calculate();
			ShapeCalculate c1 = new ShapeCalculate();
			c1.calculate();
			c1.play();
			c1.run();
		}
		@Override
		public void play() {
			// TODO Auto-generated method stub
		System.out.println("override method from calculate");
		}
		}

