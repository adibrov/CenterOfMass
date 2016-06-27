package centom;

public class CenterOfMass
{
	// --- com of a 2d array--- //
	public static int[] com(int[][] imageArray) {
		
	// exception handling        
    if (imageArray == null) {
        throw new java.lang.NullPointerException("Array is null.");
    }
    
    int height = imageArray.length;
    
    if (height == 0) {
        throw new java.lang.IllegalArgumentException("Array is empty.");
    }
         
    int width = imageArray[0].length;
    
    if (width == 0) {
        throw new java.lang.IllegalArgumentException("first string of the input array is empty.");
    }
    
    int mass = 0;
    // check
    System.out.println("height is: " + height + " width is : " + width);
		
		int[]comVector = new int[2];
		
		for (int i = 0; i < height; i++)
		{
			for (int j = 0; j < width; j++)
			{
				mass += imageArray[i][j];
				comVector[0] += i * imageArray[i][j];
				comVector[1] += j * imageArray[i][j];
			}
		}
		comVector[0] /= mass;
		comVector[1] /= mass;
		return comVector;
	}
	
	public static void main(String[] args) {
	
	}
	
}
