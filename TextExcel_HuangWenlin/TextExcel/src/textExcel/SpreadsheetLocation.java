package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location 
{
	// data field
	int r;
	int c;
	
    @Override
    public int getRow()
    {
        // TODO Auto-generated method stub
        return this.r;
    }

    @Override
    public int getCol()
    {
        // TODO Auto-generated method stub
        return this.c;
    }
    
    public SpreadsheetLocation(String cellName)
    {
        // TODO: Fill this out with your own code
    	// cell name is like "A1" which is a length = 2 string
    	// and the first char is the col#, the second is the row#
    	// String str, str.charAt(0) -> the first char in this string
    	// str.charAt(1) -> the second char in this string
    	// A1
    	c = getColumnNumberFromColumnLetter(cellName);
    	r = Character.getNumericValue(cellName.charAt(1));
    }

	// You are free to use this helper method.  It takes a column letter (starting at "A")
	// and returns the column number corresponding to that letter (0 for "A", 1 for "B", etc.)  
	// WARNING!!  If the parameter is not a single, capital letter in the range of your Spreadsheet,
	// bad things might happen!
	public static int getColumnNumberFromColumnLetter(String columnLetter)
	{
		return Character.toUpperCase(columnLetter.charAt(0)) - 'A';
	}


}
