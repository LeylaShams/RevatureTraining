package day6;

//1st way
//interface Rectangle{
// public void draw();
//}
//
//class Test implements Rectangle{
//
// @Override
// public void draw() {
//     System.out.println("drawing....");
// }
//}

//2nd way
interface Rectangle {
	void draw();
}

public class Lambda1 {

	public static void main(String[] args) {
        // 1st way
//      Test test = new Test();
//      test.draw();
		
        // 2nd way (without using lambda we have to declare anonymous class)
//      Rectangle rectangle = new Rectangle() {
//          @Override
//          public void draw() {
//              System.out.println("drawing");
//          }
//      };
//      rectangle.draw();
		
		//3rd way using lambda
		Rectangle rec = () -> {
			System.out.println("drawing...");
		};
		rec.draw();

	}

}