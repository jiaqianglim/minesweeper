package game;

public class tile{
    
    private enum DisplayState {hidden, empty, one, two, three, four, five, six, seven, eight, flagged, bomb};
    private enum Role {empty, bomb};

    private DisplayState displayState;

    private Role role;
    private String position;
    
    public tile(String positiona, Role rolea){
        this.position = positiona;
        this.role = rolea;

        this.displayState = DisplayState.hidden;
    }

    public DisplayState getDisplayState() {
        return displayState;
    }

    public void setDisplayState(DisplayState displayStatea){
        this.displayState = displayStatea;
    }

    public Role getRole() {
        return role;
    }

    public String getName() {
        return position;
    }

}