package game;

public class tile{
    
    private enum DisplayState {hidden, empty, one, two, three, four, five, six, seven, eight, flagged, bomb};
    private enum Role {empty, bomb};

    private DisplayState displayState;
    private Role role;
    
    public void setRole(Role role) {
        this.role = role;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}