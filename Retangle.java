import javax.swing.JOptionPane;

public class Retangle
{
	public static void main(String [] args)
	{
		String inputheight=JOptionPane.showInputDialog("Enter the height of the retangle in meters");	
		double height=Double.parseDouble(inputheight);
		String inputwidth=JOptionPane.showInputDialog("Enter the width of the retangle in meters");
		double width=Double.parseDouble(inputwidth);
		double perimeter=2*(height+width);
		double area=height*width;
		JOptionPane.showMessageDialog(null,"The perimeter of the retangle is "+perimeter+" meters."+"\n"+"The area of the retangle is "+area+" square meters.");
	}	

}

