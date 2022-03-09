import java.util.*;
public class Match
{
Scanner sc=new Scanner(System.in);
private String teamname;
private String inningsname;
private int runs;
public void setTeamname(String teamname)
{
this.teamname=teamname;
}

public void setInningsname(String inningsname)
{
this.inningsname=inningsname;
}
public void setRuns(int runs)
{
this.runs=runs;
}
public String getTeamname()
{
return this.teamname;
}

public String getInningsname()
{
return this.inningsname;
}
public int getRuns()
{
return this.runs;
}
void Values()
{
System.out.println("Enter the team name:");
teamname=sc.next();
System.out.println("Enter session:(First-1 or Second-2)");
inningsname=sc.next();
System.out.println("Enter runs:");
runs=sc.nextInt();
}
void displayValues()
{
System.out.println("Name:"+this.teamname);
System.out.println("Scored:"+this.runs);
if(this.inningsname.equalsIgnoreCase("First") || this.inningsname.equals("1"))
{ 
runs=runs+1;
System.out.printf("Need %d to win",runs);
}
else
{
System.out.println("Match Ended");
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Match cr= new Match();
cr.Values();
cr.displayValues();
}
}