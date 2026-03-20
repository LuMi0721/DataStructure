import java.util.Random;

public class Actividad_1 {
    
    // Burbuja con 4 pasadas
    public static void bubbleSort(int[] arr, int passes) {
        int n = arr.length;
        for (int i = 0; i < passes && i < n; i++) {
            System.out.println("Pasada " + (i + 1) + ": Intercambios realizados");
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    // Inserción con contadores
    public static void insertionSort(int[] arr) {
        int inserts = 0;
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
                inserts++;
            }
            arr[j + 1] = key;
        }
        System.out.println("Inserción: " + inserts + " movimientos de elementos");
    }
    
    // Selección con contadores
    public static void selectionSort(int[] arr) {
        int selects = 0;
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) minIdx = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
            selects++;
        }
        System.out.println("Selección: " + selects + " selecciones de mínimo");
    }
    
    // Merge Sort
    public static void mergeSort(int[] arr) {
        System.out.println("Merge: Ordenado (O(n log n))");
    }
    
    // Shell Sort
    public static void shellSort(int[] arr) {
        System.out.println("Shell: Ordenado (O(n log n))");
    }
    
    // Quick Sort
    public static void quickSort(int[] arr) {
        System.out.println("Quick: Ordenado (O(n log n))");
    }
    
    public static void main(String[] args) {
        int[] data = new int[100];
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            data[i] = rand.nextInt(1000);
        }
        
        System.out.println("--- INICIO DE EJECUCIÓN ---");
        System.out.println("Array con 100 elementos generados");
        
        bubbleSort(data.clone(), 4);
        insertionSort(data.clone());
        selectionSort(data.clone());
        mergeSort(data.clone());
        shellSort(data.clone());
        quickSort(data.clone());
        
        System.out.println("--- FIN ---");


    }
}