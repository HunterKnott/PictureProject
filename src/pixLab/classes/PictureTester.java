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
  
  public static void  testMirrorHorizontal()
  {
	  Picture sample = new Picture("Fruitbowl.jpg");
	  sample.explore();
	  sample.mirrorHorizontal();
	  sample.explore();
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
  
  public static void testGlitchify1()
  {
	  Picture fruitbowl = new Picture("FruitBowl.jpg");
	  fruitbowl.explore();
	  fruitbowl.glitchify1();
	  fruitbowl.explore();
  }
  
  public static void testGlitchify2()
  {
	  Picture fruitbowl = new Picture("FruitBowl.jpg");
	  fruitbowl.explore();
	  fruitbowl.glitchify2();
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
	
	public static void testSteganography()
	{
		Picture source = new Picture("");
		
		Picture message = new Picture("");
		source.explore();
		message.explore();
		source.hidePicture(message);
		source.explore();
		source.revealPicture();
		source.explore();
	}
	
	public static void testMultipleFilters()
	{
		Picture sample = new Picture("fruitbowl.jpg");
		sample.explore();
		int amount = (int)(Math.random() * (sample.getHeight()));
		sample.shiftUpDown(amount);
		sample.explore();
		sample.glitchify1();
		sample.explore();
		Picture background = new Picture("fruitbowl.jpg");
		background.explore();
		sample.chromakey(background, Color.WHITE);
		sample.explore();
		int amount2 = (int)(Math.random() * (sample.getWidth()));
		sample.shiftLeftRight(amount2);
		sample.explore();
		sample.mirrorVertical();
		sample.explore();
		sample.glitchify2();
		sample.explore();
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
    //testGlitchify();
	//testChromakey();
    //testShiftLeftRight();
    //testShiftUpDown();
    testMultipleFilters();
  }
}