package com.sunbeam;

import java.util.Arrays;

public class EmployeeSalDesc {
	public static void Employeesaldesc (Employee arr[],int N)
	{int flag;
		for(int i=1;i<N;i++) {
			flag=0;
			for(int j=0;j<N-1;j++)
			{
				if(arr[j].getSalary()>arr[j+1].getSalary())
				{
					Employee temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					flag=1;
				
				}
				
			
				if(flag==0);
				break;
			}
		}
	}

	public static void main(String[] args) {
		
		Employee[] arr=new Employee[3];
		arr[0]=new Employee(16,"Jhon",3000.44);
		arr[1]=new Employee(35,"Mike",2000.23);
		arr[2]=new Employee(22,"Herry",3000.33);
		
		System.out.println("Arrays Before Sort:"+Arrays.toString(arr));
		
		Employeesaldesc(arr,arr.length);
		
		System.out.println("Arrays After Sort:"+Arrays.toString(arr));

	}

}
