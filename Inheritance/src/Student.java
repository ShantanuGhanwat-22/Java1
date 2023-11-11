class Student{
    private int id,m1,m2,m3;
    private String name;
    public Student()
    {
        id=0;name=null;m1=0;m2=0;m3=0;
    }
    public Student(int id,String name,int m1,int m2,int m3)
    {
        this.id=id;
        this.name=name;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    public void setid(int id)
    {
        this.id=id;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public void setmarks1(int m1)
    {
        this.m1=m1;
    }
    public void setmarks2(int m2)
    {
        this.m2=m2;
    }
    public void setmarks3(int m3)
    {
        this.m3=m3;
    }
    public int getsid()
    {
        return id;
    }
    public String getname()
    {
        return name;
    }
    public int getmarks1()
    {
        return m1;
    }
    public int getmarks2()
    {
        return m2;
    }
    public int getmarks3()
    {
        return m3;
    }
    public String toString;
    {
        return ("id"+this.id);
    }
}