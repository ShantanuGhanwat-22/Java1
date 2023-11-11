package com.demo.Beans;

public class Person implements Comparable<Person>{
	

	private int Pid;
	    private String Name;
	    private String Mobile;
	    private String email;
	    
	    

	    public Person() {
			super();
		}

	    public boolean equals(Object ob) {
	    	return this.Pid==((Person)ob).Pid;
		}
//		public Person(){
//	        this(0,null,null,null);
//	    }

	     public Person(int pid, String name, String mobile, String email) {
	        Pid = pid;
	        Name = name;
	        Mobile = mobile;
	        this.email = email;

	    
	}
	    public Person(int id) {
			// TODO Auto-generated constructor stub
	    	this.Pid= id;
		}

		public String getEmail() {
	        return email;
	    }

	    public void setName(String name) {
	        Name = name;
	    }

	    public void setMobile(String mobile) {
	        Mobile = mobile;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }
	    public void setPid(int pid) {
	        Pid = pid;
	    }

	    public int getPid() {
	        return Pid;
	    }

	    public String getName() {
	        return Name;
	    }

	    public String getMobile() {
	        return Mobile;
	    }

	    @Override
	    public String toString() {
	        return "Person [Pid=" + Pid + ", Name=" + Name + ", Mobile=" + Mobile + ", email=" + email + "]";
	    }

		@Override
		public int compareTo(Person O) {
			// TODO Auto-generated method stub
			System.out.println("In Person compareTo Method "+this.Name+"----"+O.Name);
			return this.Name.compareTo(O.Name);
					}
	    
	}

