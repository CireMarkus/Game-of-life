public class Cell {
    // Cell status
    private boolean isAlive = false;

   //method to change the state of the current cell
    public void changeState(){
        this.isAlive = !isAlive;
    }

   //method to return the current state of the cell
    public boolean getState() {
        return this.isAlive;       
    }
}
