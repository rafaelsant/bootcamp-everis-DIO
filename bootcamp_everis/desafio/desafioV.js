// a função gets é implementada dentro do sistema para ler as entradas(inputs) dos dados
let R = parseInt(gets());
let V = 0;
let soma= 0;
let count=0;
while(R>V || !Number.isInteger(V)){
  V = parseInt(gets());
}
const calculo = (V,R)=>{
  while(soma<V){
    soma += R;
    R++;
    count++;
  }
  return count;
}
console.log(calculo(V,R))