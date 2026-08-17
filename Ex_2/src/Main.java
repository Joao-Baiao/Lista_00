void main() {
    Scanner input=new Scanner(System.in);
    int x, maior=-999999999, menor=999999999;
    boolean dentro,divisivel;
    int [] array = new int[3];
    for (int i=0;i<3;i++) {
        System.out.println("Digite um valor");
        x = input.nextInt();
        array[i]=x;
    }
    for (int i=0;i< array.length;i++){
        if (array[i]>maior){
            maior = array[i];
        }
        if (array[i]<menor){
            menor = array[i];
        }
    }
    if (array[0]>array[2]&&array[0]<array[1]){
        dentro = true;
    }
    else{
        dentro=false;
    }
    if (array[0]%array[1]==0&&array[0]%array[2]==0){
        divisivel=true;
    }
    else{
        divisivel=false;
    }
    System.out.println("O resultado das verificações é: Maior: "+maior+", Menor: "+menor+", Está dentro do intervalo: "+dentro+", É divisível: "+divisivel);
}
