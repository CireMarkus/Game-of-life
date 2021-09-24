public class CellManager{
    private int gridHeight = 0;  //Number of rows int he grid
    private int gridWidth = 0; //Number of columns in the grid

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
        
    }
    
    //Checks to see how many live neighbors a cell has
    int neighbors(int row, int column){
        int liveNeighbors = 0;
        
        //The top row
        //checks grid[row-1][column]
        try {
            if(this.grid[row-1][column].getState()){
                liveNeighbors++;
            }

            //checks grid[row-1][column-1]
            try {
                if(this.grid[row-1][column-1].getState())
                    liveNeighbors++;
            } catch (ArrayIndexOutOfBoundsException e) {
                if(this.grid[row-1][gridWidth-1].getState())
                    liveNeighbors++;
            }

            //check grid[row-1][column+1]
            try {
                if(this.grid[row-1][column+1].getState())
                    liveNeighbors++;
            } catch (ArrayIndexOutOfBoundsException e) {
                if(this.grid[row-1][0].getState())
                    liveNeighbors++;
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            if(this.grid[gridHeight-1][column].getState())
                liveNeighbors++;
        }

        //The middle row
        try {
            
        } catch (ArrayIndexOutOfBoundsException e) {
            //TODO: handle exception
        }

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
