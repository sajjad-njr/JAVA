class SeriesPrinter {

    void printSeries(int n) {
        for (int i = 0; i <= n; i++) {
            
        }
    }

    void printSeries(int startIndex, int endIndex) {
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(" " + i);
        }          
    }

    void printSeries(int startIndex, int endIndex, int interVal) {
        for (int i = startIndex; i <= endIndex; i += interVal) {
            System.out.print(" " + i);
        }          
    }
}

class Task_2 {

    public static void main(String[] args) {
        SeriesPrinter ob = new SeriesPrinter();

        ob.printSeries(5);    
        ob.printSeries(5, 10);        
        ob.printSeries(5, 15, 3);
        
    }
}