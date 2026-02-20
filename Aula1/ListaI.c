#include <stdio.h>
#include <string.h>

void atividade1(){
// Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.
    float base, altura;
    printf("\nEscreva a Base do seu retangulo: ");
        scanf("%f", &base);
        printf("\n");
    printf("Escreva a Altura do seu retangulo: ");
        scanf("%f", &altura);
        printf("\n");
    float area = base*altura;
    printf("A Area deste retangulo eh: %.2f\n", area);
}

void atividade2(){
//Escreva um algoritmo que armazene valores em duas variáveis (A e B), e a seguir (utilizando apenas atribuições entre variáveis) 
//troque os seus conteúdos fazendo com que o valor que está em A passe para B e vice-versa. Ao final, escrever os valores que ficaram armazenados nas variáveis.
    int a, b;
    printf("\nEscreva o valor de A: ");
        scanf("%d", &a);
        printf("\n");
    printf("Escreva o valor de B: ");
        scanf("%d", &b);
        printf("\n");
    printf("O Valor de A eh: %d\nE o Valor de B eh: %d\n", a,b);
    printf("\nRealizando a troca...\n");
    int temp = a;
    a = b;
    b = temp;
    printf("\nAgora o Valor de A eh: %d\n E o Valor de B eh: %d\n", a,b);
}

void atividade3(){
//Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus Celsius
    float C, F, K;
    printf("\nDigite a temperatura em Fahrenheit: ");
        scanf("%f", &F);
    C = 5*((F-32)/9);
    K = (F-32)*5/9+273;
    printf("\nA temperatura em Celsius eh: %.2fºC", C);
    printf("\nA temperatura em Kelvin eh: %.2fK", K);
} 

void atividade4(){
//Escreva um algoritmo que converta metros para centímetros.
    float cm, m;
    printf("\nDigite a medida em Metros: ");
        scanf("%f", &m);
        cm = m*100;
    printf("A medida em cm eh: %.2f cm", cm);
}

void atividade5(){
//Escreva um algoritmo que leia 2 números e exiba qual dos dois é o maior.
    int a, b;
    printf("\nEscreva o valor de A: ");
        scanf("%d", &a);
        printf("\n");
    printf("Escreva o valor de B: ");
        scanf("%d", &b);
    if (a > b){
        printf("A eh maior que B\n");
    } else if (b > a){
        printf("B eh maior que A\n");
    } else {
        printf("Os dois valores sao iguais\n");
    }

}

void atividade6(){
// A biblioteca de uma universidade deseja fazer um algoritmo que leia:
// nome do usuário, tipo de usuário (professor ou aluno) e nome do livro.
// Ao final exiba confirmação e prazo de devolução.
// Professor: 10 dias | Aluno: 3 dias

    char nome[50];
    char tipo[20];
    char livro[50];
    int prazo;

    printf("\nDigite o nome do usuario: ");
    scanf(" %[^\n]", nome);

    printf("Digite o tipo de usuario (professor ou aluno): ");
    scanf(" %[^\n]", tipo);

    printf("Digite o nome do livro: ");
    scanf(" %[^\n]", livro);

    if (strcmp(tipo, "professor") == 0){
        prazo = 10;
    } else if (strcmp(tipo, "aluno") == 0){
        prazo = 3;
    } else {
        printf("\nTipo de usuario invalido!\n");
        return;
    }

    printf("\nConfirmacao de Emprestimo:\n");
    printf("Usuario: %s\n", nome);
    printf("Livro: %s\n", livro);
    printf("Prazo de devolucao: %d dias\n", prazo);
}

void atividade7(){
// As bananas custam R$1,00 até 11 unidades.
// Acima de 11 unidades custam R$0,90 cada.
// Calcular o valor total.

    int quantidade;
    float total;

    printf("\nDigite a quantidade de bananas compradas: ");
    scanf("%d", &quantidade);

    if (quantidade <= 11){
        total = quantidade * 1.0;
    } else {
        total = quantidade * 0.9;
    }

    printf("O valor total da compra eh: R$ %.2f\n", total);
    
}

void atividade8(){
// Receber tres inteiros e mostrar qual o maior e o menor

    int a, b, c;
    int maior, menor;

    printf("\nDigite o primeiro numero: ");
    scanf("%d", &a);

    printf("Digite o segundo numero: ");
    scanf("%d", &b);

    printf("Digite o terceiro numero: ");
    scanf("%d", &c);

    maior = a;
    menor = a;

    if (b > maior) maior = b;
    if (c > maior) maior = c;

    if (b < menor) menor = b;
    if (c < menor) menor = c;

    printf("\nO maior numero eh: %d\n", maior);
    printf("O menor numero eh: %d\n", menor);
    
}

void atividade9(){
// Construir um algoritmo que leia 2 números e efetue a adição.
// Se o resultado for > 20, somar 8.
// Se for <= 20, subtrair 5.

    int a, b, soma, resultado;

    printf("\nDigite o primeiro numero: ");
    scanf("%d", &a);

    printf("Digite o segundo numero: ");
    scanf("%d", &b);

    soma = a + b;

    if (soma > 20){
        resultado = soma + 8;
    } else {
        resultado = soma - 5;
    }

    printf("\nResultado final: %d\n", resultado); 
}

void atividade10(){
// Calcular salário bruto, descontos e salário líquido

    float valorHora, horasMes;
    float salarioBruto;
    float ir, inss, sindicato, fgts;
    float salarioLiquido;

    printf("\nDigite o valor da hora trabalhada: ");
    scanf("%f", &valorHora);

    printf("Digite o numero de horas trabalhadas no mes: ");
    scanf("%f", &horasMes);

    salarioBruto = valorHora * horasMes;

    ir = salarioBruto * 0.11;
    inss = salarioBruto * 0.08;
    sindicato = salarioBruto * 0.05;
    fgts = salarioBruto * 0.08;

    salarioLiquido = salarioBruto - ir - inss - sindicato;

    printf("\n(+) Salario Bruto: R$ %.2f\n", salarioBruto);
    printf("(-) IR (11%%): R$ %.2f\n", ir);
    printf("(-) INSS (8%%): R$ %.2f\n", inss);
    printf("(-) Sindicato (5%%): R$ %.2f\n", sindicato);
    printf("(=) Salario Liquido: R$ %.2f\n", salarioLiquido);
    printf("FGTS (8%%): R$ %.2f\n", fgts);
    
}

void atividade11(){
// Faça um algoritmo que mostre os 10 primeiros números da sequencia de Fibonacci iniciando com o número 1
int a = 1, b = 1, proximo;
    int i;

    printf("\nSequencia de Fibonacci:\n");

    printf("%d, %d", a, b);

    for (i = 3; i <= 10; i++){
        proximo = a + b;
        printf(", %d", proximo);

        a = b;
        b = proximo;
    }

    printf("\n");
}

int main() {
    atividade10();
    return 0;
}
 //clang nomedoarquivo.c -o out
 // ./out 

