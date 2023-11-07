package com.demo.Beans;

import java.time.LocalDate;

abstract public class Emp extends Person{
	private String dept;
    private String Designtn;
    private LocalDate DOJ;

    public Emp(){
        
    }

        public Emp(int pid, String name, String mobile, String email, String dept, String designtn) {
        super(pid, name, mobile, email);
        this.dept = dept;
        Designtn = designtn;
     //   DOJ = DOJ;
    }


        public Emp(int id) {
			// TODO Auto-generated constructor stub
        	super(id);
		}

		public String getDept() {
            return dept;
        }


        public void setDept(String dept) {
            this.dept = dept;
        }


        public String getDesigntn() {
            return Designtn;
        }


        public void setDesigntn(String designtn) {
            Designtn = designtn;
        }


        // public LocalDate getDOJ() {
        //     return DOJ;
        // }


        public void setDOJ(LocalDate DOJ) {
            DOJ = DOJ;
        }
        public double CalSal(){
                return 0;
        }

        @Override
        public String toString() {
            return super.toString()+"Emp [dept=" + dept + ", Designtn=" + Designtn + ", DOJ=" + "]";
        }

    

}
