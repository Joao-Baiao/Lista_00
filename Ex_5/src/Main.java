void main(){
    Scanner input=new Scanner(System.in);
    int [] idade=new int[1000], cor_olhos=new int[idade.length], cor_cabelo=new int[idade.length], sexo=new int[idade.length];
    int i=0;
    while (i<idade.length){
        System.out.println("Digite a idade do habitante(-1 para parar): ");
        int num=input.nextInt();
        if (num==-1){
            break;
        }
        idade[i]=num;
        System.out.println("Digite a cor dos olhos do habitante(1-azul, 2-verde, 3-castanho): ");
        cor_olhos[i]=input.nextInt();
        System.out.println("Digite a cor do cabelo do habitante(1-louro, 2-castanho, 3-preto): ");
        cor_cabelo[i]=input.nextInt();
        System.out.println("Digite o sexo do habitante(1-masculino, 2-feminino): ");
        sexo[i]=input.nextInt();
        i++;
    }
    idade=Arrays.copyOf(idade,i);
    cor_olhos=Arrays.copyOf(cor_olhos,i);
    cor_cabelo=Arrays.copyOf(cor_cabelo,i);
    sexo=Arrays.copyOf(sexo,i);
    int maior=0,menor=200,quantidade=0;
    for (int j=0;j<idade.length;j++){
        if (idade[j]>maior){
            maior=idade[j];
        }
        if (idade[j]<menor){
            menor=idade[j];
        }
        if (idade[j]>=18&&idade[j]<=35&&cor_olhos[j]==2&&cor_cabelo[j]==1&&sexo[j]==2){
            quantidade++;
        }
    }
    System.out.println("A maior idade registrada foi: "+maior+"\nA menor idade registrada foi: "+menor+"\nA quantidade de mulheres de 18 à 35 anos com olhos verdes e cabeloloiro registrada foi: "+quantidade);
}