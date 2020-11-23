var entradas =5;
var respostas = [4,1,5,4,3,1,2];
var cont = respostas.filter(valor=> valor === entradas).length
entradas>=1 && entradas<=4?console.log(cont) : console.log(0)