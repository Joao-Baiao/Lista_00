void main() {
    Scanner input = new Scanner(System.in);
    double[][] vendas = new double[12][4];
    String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril","Maio", "Junho", "Julho", "Agosto","Setembro", "Outubro", "Novembro", "Dezembro"};
    double[] totalSemanas = new double[4];
    double totalAno = 0;
    for (int i = 0; i < vendas.length; i++) {
        System.out.println("\nVendas de " + meses[i] + ":");
        for (int j = 0; j < vendas[i].length; j++) {
            System.out.println("Digite o valor vendido na semana " + (j + 1) + ":");
            vendas[i][j] = input.nextDouble();
        }
    }
    System.out.println("RELATÓRIO DE VENDAS");
    System.out.println("Total vendido em cada mês:");
    for (int i = 0; i < vendas.length; i++) {
        double totalMes = 0;
        for (int j = 0; j < vendas[i].length; j++) {
            totalMes += vendas[i][j];
        }
        System.out.printf("%s: R$ %.2f%n",meses[i],totalMes);
        totalAno += totalMes;
    }
    for (int j = 0; j < vendas[0].length; j++) {
        for (int i = 0; i < vendas.length; i++) {
            totalSemanas[j] += vendas[i][j];
        }
    }
    System.out.println("Total vendido em cada semana durante o ano:");
    for (int i = 0; i < totalSemanas.length; i++) {
        System.out.printf("Semana %d: R$ %.2f%n",i + 1,totalSemanas[i]);
    }
    System.out.printf("%nTotal vendido pela loja no ano: R$ %.2f%n",totalAno);
}