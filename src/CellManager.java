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
        //TODO: complete the next generation function
    }

    //Checks the cells and determines what it's new state will be
    void newState(Cell a, int numNeighbors){
        //TODO: complete next state function. 
    }
    
    //Checks to see how many live neighbors a cell has
    int neighbors(int row, int column){
        int liveNeighbors = 0;
        
        //The top row
        
        //top row if everything is normal
        if(grid[row-1][column-1].getState()){
            liveNeighbors++;
        }
        if(grid[row-1][column].getState()){
            liveNeighbors++;
        }
        if(grid[row-1][column+1].getState()){
            liveNeighbors++;
        }

        //The middle row

        //The bottom row


        return liveNeighbors;
    }

    //Getters 
    public int getGridHeight(){
        return this.gridHeight;
    }

    public int getGridWidth(){
        return this.gridWidth;
    }
    
    public CellManager(int gridHeight, int gridWidth){
        this.gridHeight = gridHeight; 
        this.gridWidth = gridWidth;
        populateGrid();
    }
}
