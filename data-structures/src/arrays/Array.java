package arrays;

@SuppressWarnings("unchecked")
public class Array<T> {
	
	private T[] data;
	private int count;
		
	public Array(int capacity) 
	{
		if(capacity < 0) throw new IllegalArgumentException("capacity "+ capacity);
		else
			data = (T[]) new Object[capacity];
	}
	
	public void insert(T value) 
	{
		if(data.length == count)
		{
			T[] newData = (T[]) new Object[count*2];
			for(int i = 0; i < count; i++)
				newData[i] = data[i];
			data = newData;
		}
		data[count++] = value;
	}
	
	public void delete(T value) 
	{
		for(int i = 0; i < count; i++)
			if(data[i].equals(value))
				deleteAt(i);
	}
	
	public void deleteAt(int index) 
	{
		for(int i = index; i < count; i++)
			data[i] = data[i+1];
		count--;
	}
	
	public void print() 
	{
		StringBuilder builder = new StringBuilder(count).append("[ ");				
		for(int i = 0; i < count -1; i++)
			builder.append(data[i]+ ",");
		builder.append(data[count - 1] + " ]");
		System.out.println(builder);
	}

}
