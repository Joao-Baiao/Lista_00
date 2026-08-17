void main() {
    Scanner input = new Scanner(System.in);
    System.out.println("Digite o valor: ");
    int num = input.nextInt(),resultado=1;
    for (int i=num;i>1;i--){
        resultado*=i;
    }
    System.out.println("O resultado é: "+ resultado);
}
