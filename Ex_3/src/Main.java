void main() {
    Scanner input = new Scanner(System.in);
    int [] pm, c;
    System.out.println("Qual o número de alunos: ");
    pm=new int[input.nextInt()];
    c=new int[pm.length];
    for (int i=0;i<pm.length;i++){
        System.out.println("Digite a matrícula do aluno de Programação Modular: ");
        pm[i]=input.nextInt();
    }
    for (int i=0;i<c.length;i++) {
        System.out.println("Digite a matrícula do aluno de Cálculo: ");
        c[i] = input.nextInt();
    }
    for (int i=0;i<pm.length;i++){
        for (int j=0;j<c.length;j++) {
            if (pm[i]==c[j]){
                System.out.println("Matrícula simultânea: "+c[j]);
            }
        }
    }
}
