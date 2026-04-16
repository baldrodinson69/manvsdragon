public class Dungeon {

        // # = Wall, . = Path, H = Hero, R = Ignis, B = Banshee, Y = Venom, E = Exit
        private char[][] grid = {
                {'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'},
                {'#','H','.', '.', '.', '#','.', '.', '.', '.', '.', '.', '.', 'B','#'},
                {'#','#','#','#','.', '#','.', '#','#','#','#','#','#','.','#'},
                {'#','.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.','#'},
                {'#','.', '#','#','#','#','#','#','#','#','#','.', '#','#','#'},
                {'#','R','.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', 'E','#'},
                {'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'}
        };

        private int pRow = 1;
        private int pCol = 1;

        public void printDungeon() {
            for (char[] row : grid) {
                for (char tile : row) {
                    switch (tile) {
                        case 'H' -> System.out.print(Art.GREEN + "H " + Art.RESET);
                        case 'R' -> System.out.print(Art.RED + "D " + Art.RESET);
                        case 'B' -> System.out.print(Art.CYAN + "D " + Art.RESET);
                        case 'Y' -> System.out.print(Art.YELLOW + "D " + Art.RESET);
                        case '#' -> System.out.print("█ ");
                        default -> System.out.print(tile + " ");
                    }
                }
                System.out.println();
            }
        }

        public char movePlayer(String input) {
            int nextRow = pRow;
            int nextCol = pCol;

            if (input.equalsIgnoreCase("w")) nextRow--;
            else if (input.equalsIgnoreCase("s")) nextRow++;
            else if (input.equalsIgnoreCase("a")) nextCol--;
            else if (input.equalsIgnoreCase("d")) nextCol++;

            char tile = grid[nextRow][nextCol];

            if (tile != '#') {
                grid[pRow][pCol] = '.'; // Clear old position
                pRow = nextRow;
                pCol = nextCol;
                grid[pRow][pCol] = 'H'; // Update new position
            } else {
                System.out.println("You hit a wall!");
            }
            return tile;
        }

}
