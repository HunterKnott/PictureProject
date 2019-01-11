package pixLab.classes;

import java.awt.Color;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    //beach.zeroBlue();
    //beach.zeroRed();
    //beach.zeroGreen();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("trump2.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testGlitchify()
  {
	  Picture fruitbowl = new Picture("FruitBowl.jpg");
	  fruitbowl.explore();
	  fruitbowl.glitchify();
	  fruitbowl.explore();
  }
  
  public static void testChromakey()
  {
	Picture source = new Picture("Papyrus2.jpg");
	Picture background = new Picture("Underworld2.jpg");
	source.explore();
	background.explore();
	source.chromakey(background, Color.WHITE);
	source.explore();
  }
	
	public static void testShiftLeftRight()
	{
		Picture fruitbowl = new Picture("Fruitbowl.jpg");
		fruitbowl.explore();
		int amount = (int)(Math.random() * (fruitbowl.getWidth()));
		fruitbowl.shiftLeftRight(amount);
		fruitbowl.explore();
	}
	
	public static void testShiftUpDown()
	{
		Picture fruitbowl = new Picture("Fruitbowl.jpg");
		fruitbowl.explore();
		int amount = (int)(Math.random() * (fruitbowl.getHeight()));
		fruitbowl.shiftUpDown(amount);
		fruitbowl.explore();
	}
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
    testGlitchify();
	//testChromakey();
    //testShiftLeftRight();
    //testShiftUpDown();
  }
}