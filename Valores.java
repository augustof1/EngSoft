package atividade1;
public class Valores implements ValoresITF{

int [] valores = new int[10];


@Override
public boolean ins(int v) {
boolean var = false;
for (int i=0;i < valores.length; i++) {
if(this.valores[i] ==0) {
if(var == false)
valores[i] = v;
var = true;
break;
}
}
return false;
}
@Override
public int del(int i) {
int Valor = 0;
Valor = valores[i];
valores[i] = 0;
return Valor;
}
@Override
public int size() {
int Cont = 0;
for ( int i = 0 ; i < valores.length; i++) {
if (valores [i] != 0) {
Cont ++;
}
}
return Cont ;
}
@Override
public double mean() {
int media = 0;
int soma = 0;
int cont = 0;
for (int i = 0; i < valores.length; i++) {
soma += valores[i];
if (valores[i] > 0) {
cont++;
}
}

media = soma / cont;
return media;
}
@Override
public int greater() {
int maior = valores[0];
for (int i = 0; i < valores.length - 1; i++)
if (maior < valores[i] && maior > 0)
maior = valores[i];
return maior;
}

@Override
public int lower() {
	int menor = valores[0];
	for (int i = 0; i < valores.length - 1; i++)
		if (menor > valores[i] )
			menor = valores[i];
	return menor;
}

}