void main() {
    Scanner input = new Scanner(System.in);
    System.out.println("Digite o tamanho do vetor X:");
    int[] x = new int[input.nextInt()];
    for (int i = 0; i < x.length; i++) {
        System.out.println("Digite o elemento " + (i + 1) + " do vetor X:");
        x[i] = input.nextInt();
    }
    System.out.println("Digite o tamanho do vetor Y:");
    int[] y = new int[input.nextInt()];

    for (int i = 0; i < y.length; i++) {
        System.out.println("Digite o elemento " + (i + 1) + " do vetor Y:");
        y[i] = input.nextInt();
    }
    int[] z = new int[x.length + y.length];
    int tamanhoZ = 0;
    for (int i = 0; i < x.length; i++) {
        boolean encontrado = false;
        for (int j = 0; j < tamanhoZ; j++) {
            if (x[i] == z[j]) {
                encontrado = true;
                break;
            }
        }
        if (encontrado==false) {
            z[tamanhoZ] = x[i];
            tamanhoZ++;
        }
    }
    for (int i = 0; i < y.length; i++) {
        boolean encontrado = false;
        for (int j = 0; j < tamanhoZ; j++) {
            if (y[i] == z[j]) {
                encontrado = true;
                break;
            }
        }
        if (encontrado==false) {
            z[tamanhoZ] = y[i];
            tamanhoZ++;
        }
    }
    z = Arrays.copyOf(z, tamanhoZ);

    System.out.println("Vetor X: " + Arrays.toString(x));
    System.out.println("Vetor Y: " + Arrays.toString(y));
    System.out.println("União: " + Arrays.toString(z));
}