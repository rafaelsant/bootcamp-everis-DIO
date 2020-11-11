let alunos = gets();
let entrada= "1000 10";
let flag = [];
let indice = 0;
let notas=[];
let matricula=[]
let max;
let i = 0;
var j = 0;
while(i<alunos){
    entrada= gets();
    flag = entrada.split(" ");
    matricula.push(flag.slice(0,1));
    notas.push(flag.slice(1,2));
    i++;
}
indice = Math.max.apply(null, notas);
notas = Object.values(notas);
while(notas[j]!=indice){
  j++;
}
if(notas[j]>=8 && notas[j]<=10){
    console.log(matricula[j]);
}
else{
    console.log("Minimum note not reached");
}