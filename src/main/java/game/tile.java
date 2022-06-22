package game;

public class Tile{
    
    //Display {hidden, empty, flagged, bomb};
    //Role {empty, bomb};
    //Value {0,1-8, flagged, bomb}

    private String display = "hidden";
    private String role = "empty";
    private String value = "0";

    public void setRole(String role){
        this.role = role;
    }

	public void setDisplay(String string) {
        this.display = string;
	}

    public String getRole(){
        return this.role;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value){
        this.value = value;
    }
}