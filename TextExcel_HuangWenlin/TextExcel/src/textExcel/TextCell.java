package textExcel;

public class TextCell implements Cell
{
	// data field
	public String str;
	
	public TextCell(String input) {
		this.str = input;
	}
	
	@Override
	public String abbreviatedCellText()
	{
		// TODO Auto-generated method stub
		return str.substring(0, 9);
	}

	@Override
	public String fullCellText()
	{
		// TODO Auto-generated method stub
		return str;
	}

}
