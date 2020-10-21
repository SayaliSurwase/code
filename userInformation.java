

public class userInformation {
	
	
	 private String name;
	 private int number;
	 private int dob;
	 private String gender;
	 
	  userInformation()
	  { 
		  String name=" ";
		  int number=0;
		  int dob=0;
		  String gender=" ";
	  }
	 
	  
	  userInformation(String name,int number,int dob,String gender)
	  { 
		  this.name=name;
		  this.number=number;
		  this.dob=dob;
		  this.gender=gender;
	  }


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public int getDob() {
		return dob;
	}


	public void setDob(int dob) {
		this.dob = dob;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}
	 
	public String showDetails()
	{
		String details="Details:["+name+","+number+","+dob+","+gender+"]";
		return details;
	}

	


}