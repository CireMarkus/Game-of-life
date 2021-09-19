public class CellManager{
    private int gridHeight = 0; 
    private int gridWidth = 0;

    Cell[][] grid = new Cell [gridHeight][gridWidth];

    //Used to populate the grid with dead cells
    public void populateGrid() {
        for(int i = 0; i < gridHeight; i++){
            for(int j = 0; j < gridWidth; j++){
                grid[i][j] = new Cell();
            }
        }
    }

    //Updates the grid for the next generation of cells.
    public void nextGeneration() {
        //TODO
    }


    //Getters 
    public int getGridHeight(){
        return this.gridHeight;
    }

    public int getGridWidth(){
        return this.gridWidth;
    }
    
    public CellManager(int gridHeight, int gridWidth){

    }
}
