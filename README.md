Elaborar um programa de conversão de moeda de acordo com as
seguintes especificações (sempre usando OOP):
a. O programa deve ter apresentar para a pessoa usuária “Boas
vindas ao conversor de moedas”
b. O programa deve perguntar qual a moeda que a pessoa quer
converter, sendo que o programa só pode aceitar as seguintes
opções de moeda:
i. Dólar americano
ii. Dólar canadense
iii. Euro
iv. Libra Esterlina

c. Caso a pessoa digite qualquer outra moeda fora das
mencionadas acima, o programa deve estourar uma exception
do tipo IllegalArgumentException com a mensagem “Tipo de
moeda inválido”.
d. Após escolher qual o tipo de moeda a ser convertida, o
programa deve informar a pessoa usuária que ele só sabe
converter dinheiro para Real (R$).
e. Após informar o tipo de moeda válida a ser convertida, o
sistema deve pedir o valor a ser convertido no formato BigDecimal.
i. Caso a pessoa digite qualquer texto ou valor vazio, o
programa deve estourar uma exception do tipo
NumberFormatException com a mensagem “Para
moeda, o valor monetário deve ser um número decimal”.
ii. Caso a pessoa digite um valor menor ou igual a zero, o
programa deve mostrar a seguinte mensagem para a
pessoa: “Valor inválido, por favor, tente novamente” E
permitir que a pessoa insira o valor a ser convertido de
novo.

f. Após as entradas, o sistema deve fazer a devida conversão da
moeda escolhida para Real (R$) de acordo com a cotação do
dia. Você pode pegar o valor do dia
g. Após a conversão o sistema deve mostrar a mensagem: “A
[MOEDA] na cotação de hoje [DIA ATUAL] está em [VALOR DA
COTAÇÃO], o valor que pediu para converter de [VALOR
INSERIDO] em reais é R$[VALOR CONVERTIDO]”.
h. Por fim, o programa deve perguntar se a pessoa deseja fazer
outra conversão.
i. Se sim, o programa reinicia.
ii. Se não, o programa encerra.

Valores a serem utilizados

COTACAO_DOLAR_AMERICANO - 5.25
COTACAO_DOLAR_CANADENSE - 4.15
COTACAO_EURO - 6.15
COTACAO_LIBRA_ESTERLINA - 7.50
