void main(){
    Scanner input = new Scanner(System.in);
    String[] mes={"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
    int[] temperatura=new int[12];
    int maior=0,menor=0;
    for (int i=0;i< temperatura.length;i++){
        System.out.println("Digite a temperatura do "+(i+1)+"º mês");
        temperatura[i]=input.nextInt();
    }
    for (int i=1;i<temperatura.length;i++){
        if (temperatura[i]>temperatura[maior]){
            maior=i;
        }
        if (temperatura[i]<temperatura[menor]){
            menor=i;
        }
    }
    System.out.println("A maior temperatura registrada foi: "+mes[maior]+": "+temperatura[maior]);
    System.out.println("A menor temperatura registrada foi: "+mes[menor]+": "+temperatura[menor]);
}