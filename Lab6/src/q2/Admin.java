package q2;


public class Admin {
	Department[] departments;

    public Admin(Department[] depts) {
        this.departments=depts;
    }

    public String format(String name, String msg){
	    return name+": "+msg;
    }
    public String hourlyCompanyMessage(){
        StringBuilder sb=new StringBuilder();
	    for(int i=0;i<departments.length;i++){
	        String name=departments[i].getName();
	        String message=departments[i].nextMessage();
	        sb.append(this.format(name,message) + "\n");
        }
	    return sb.toString();
    }
	
}
