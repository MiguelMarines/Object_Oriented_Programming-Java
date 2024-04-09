/* =============================================================
   Object Oriented Programming
   Author: Miguel Marines
   Activity: Central Tendency
   =========================================================== */
   
public class CentralTendency
{
	private int[] data;

	public CentralTendency(int[] data)
	{
       this.data = data;
	}

	public float mean()
	{
		float sum = 0;
    	float mean;
		for(int i = 0; i < data.length; i++)
    	{
    		sum = sum + data[i];
		}
		mean = sum / data.length;
    	return mean;
	}

	public int median()
	{
		int median = 0,i;
		if(data.length%2 != 0)
		{
			i = (data.length + 1) / 2;
			median = data[i-1];
		}
		else
		{
			median = (data.length / 2) + 1;
		}
		return median;
	}

	public int mode()
	{
		int mode = 0;
		for(int i = 0; i<data.length; i++)
		{
			int maxCount = 0, count = 0;
			for(int j = 0; j < data.length; j++)
			{
				if(data[i] == data[j])
				{
					count++;
				}
			}
			if(count >= maxCount)
			{
				maxCount = count;
				mode = data[i];
			}
		}
		return mode;
	}
}