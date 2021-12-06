/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author Sumit
 */
public class modela {
    private String std_name;
private int id;
private double std_marks;

public void setstdName(String s_name)
{
this.std_name=s_name;
}

public String getStdName()
{
return std_name;
}
//

public void setid(int stdid)
{
this.id=stdid;
}
public int getstdid()
{
return id;
}
//


public void setstdMarks(double s_marks)
{
this.std_marks=s_marks;
}

public double getStdMarks()
{
return std_marks;
}

}
