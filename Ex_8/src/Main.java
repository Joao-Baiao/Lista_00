void main(){
    Scanner input=new Scanner(System.in);
    int [] quantidade=new int[10];
    double[] valor_unitario=new double[10];
    int maior=0;
    double total=0;
    for (int i=0;i< quantidade.length;i++){
        System.out.println("Digite o valor do item "+(i+1)+": ");
        valor_unitario[i]=input.nextDouble();
        System.out.println("Digite a quantidade vendida: ");
        quantidade[i]=input.nextInt();
    }
    System.out.println("Relatório de vendas: ");
    for (int i=0;i< quantidade.length;i++){
        System.out.println("Quantidade vendida: "+quantidade[i]+". Valor unitário: "+valor_unitario[i]+". Total de vendas: "+(quantidade[i]*valor_unitario[i]));
        total+=quantidade[i]*valor_unitario[i];
        if (quantidade[i]>quantidade[maior]){
            maior=i;
        }
    }
    System.out.printf("Valor total das vendas: R$ %.2f%n" + "Valor da comissão do vendedor: R$ %.2f%n" + "Objeto mais vendido: %d. Valor: R$ %.2f%n",total,total * 0.05,maior + 1,valor_unitario[maior]);
}