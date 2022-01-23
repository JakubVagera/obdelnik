public class test {
    char[][] pole = new char[17][17];

    public void pridejZnak(char znak, int x, int y) {
        pole[x][y] = znak;
    }

    public void vytiskni() {
        for (int y = 0; y < pole.length; y++) {
            for (int x = 0; x < pole.length; x++) {
                System.out.print(pole[x][y] == 0 ? " " : pole[x][y]);
            }
            System.out.println();
        }
    }
}
