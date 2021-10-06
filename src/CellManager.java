

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

    //Checks to see how many live neighbors a cell has
    private int neighbors(int row, int column){
        int liveNeighbors = 0;
        
        //The top row
        //checks grid[i-1][j]
        try {
            if(this.grid[row-1][column].getState()){
                liveNeighbors++;
            }

            //checks grid[i-1][j-1]
            try {
                if(this.grid[row-1][column-1].getState())
                    liveNeighbors++;
            } catch (ArrayIndexOutOfBoundsException e) {
                if(this.grid[row-1][gridWidth-1].getState())
                    liveNeighbors++;
            }

            //check grid[i-1][j+1]
            try {
                if(this.grid[row-1][column+1].getState())
                    liveNeighbors++;
            } catch (ArrayIndexOutOfBoundsException e) {
                if(this.grid[row-1][0].getState())
                    liveNeighbors++;
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            //grid[i-1][j]
            if(this.grid[gridHeight-1][column].getState())
                liveNeighbors++;
            
            //grid[i-1][j-1]
            try {
                if(this.grid[gridHeight-1][column-1].getState())
                    liveNeighbors++;
            } catch (ArrayIndexOutOfBoundsException f) {
                if(this.grid[gridHeight-1][gridWidth-1].getState())
                    liveNeighbors++;
            }
            //grid[i-1][j+1]
            try {
                if(this.grid[gridHeight-1][column+1].getState())
                    liveNeighbors++;
            } catch (ArrayIndexOutOfBoundsException f) {
                if(this.grid[gridHeight-1][0].getState())
                    liveNeighbors++;
            }
        }

        //The middle row
        //grid[i][j-1]
        try {
            if(this.grid[row][column-1].getState())
                liveNeighbors++;
        } catch (ArrayIndexOutOfBoundsException e) {
            if(this.grid[row][gridWidth-1].getState())
                liveNeighbors++;
        }

        //grid[i][j+1]
        try {
            if(this.grid[row][column+1].getState())
                liveNeighbors++;
        } catch (ArrayIndexOutOfBoundsException e) {
            if(this.grid[row][0].getState())
                liveNeighbors++;
        }

        //The bottom row
        //grid[i+1][j]
        try {
            if(grid[row+1][column].getState())
                liveNeighbors++;
            //grid[i+1][j-1]
            try {
                if(grid[row+1][column-1].getState())
                    liveNeighbors++;
            } catch (ArrayIndexOutOfBoundsException e) {
                if(grid[row+1][gridWidth-1].getState())
                    liveNeighbors++;
            }
            //grid[i+1][j+1]
            try {
                if(grid[row+1][column+1].getState())
                    liveNeighbors++;
            } catch (ArrayIndexOutOfBoundsException e) {
                if(grid[row+1][0].getState())
                    liveNeighbors++;
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            //grid[i+1][j]
            if(grid[0][column].getState())
                liveNeighbors++;
            //grid[i+1][j-1]
            try {
                if(grid[0][column-1].getState())
                    liveNeighbors++;
            } catch (ArrayIndexOutOfBoundsException f) {
                if(grid[0][gridWidth-1].getState())
                    liveNeighbors++;
            }
            //grid[i+1][j+1]
            try {
                if(grid[0][column+1].getState())
                    liveNeighbors++;
            } catch (ArrayIndexOutOfBoundsException f) {
                if(grid[0][0].getState())
                    liveNeighbors++;
            }
        }

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
