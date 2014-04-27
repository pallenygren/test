
public class countdown {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i=10; i >= 0; i--)
		{
			System.out.print(Integer.toString(i));
			if ( i==3)
			{
				System.out.print("...Ignition!\n");
			}
			else if ( i==0)
			{
				System.out.print("...Houston, we have liftoff!");
			}
			else
			{
				System.out.print("\n");
			}
		}
		// TODO Auto-generated method stub

	}

}
