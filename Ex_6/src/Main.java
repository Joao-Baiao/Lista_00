void main(){
    Scanner input=new Scanner(System.in);
    String[] gabarito=new String[8];
    int[] nota=new int[10];
    double aprovacao=0;
    for (int i=0;i< gabarito.length;i++){
        System.out.println("Digite o gabarito: ");
        gabarito[i]=input.next();
    }
    int[] numero_aluno={1,2,3,4,5,6,7,8,9,10};
    String[][] respostas= new String[10][8];
    for (int i=0;i< respostas.length;i++){
        for (int j=0;j<respostas[i].length;j++){
            System.out.println("Digite a "+(j+1)+"° resposta do aluno "+numero_aluno[i]);
            respostas[i][j]=input.next();
        }
    }
    for (int i=0;i< respostas.length;i++){
        int soma=0;
        for (int j=0;j<respostas[i].length;j++){
            if (respostas[i][j].equalsIgnoreCase(gabarito[j])){
                soma+=1;
            }
        }
        nota[i]=soma;
    }
    for (int i=0;i<nota.length;i++){
        if (nota[i]>=6){
            aprovacao+=1;
        }
    }
    aprovacao=(aprovacao/10)*100;
    for (int i=0;i< respostas.length;i++){
        System.out.println("O aluno "+numero_aluno[i]+" teve a seguinte nota: "+nota[i]);
    }
    System.out.println("A porcentagem de aprovação foi de: "+aprovacao+"%");
}
