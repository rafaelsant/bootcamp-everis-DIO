let H = "7 3"
let J = H.split(" ");
let quociente = 0;
let resto = 0;
if(parseInt(J[0])!=0 && parseInt(J[1])){
    resto = parseInt(J[0])%parseInt(J[1]);
    if(resto<0){
        resto = Math.abs(Math.abs(resto)-Math.abs(parseInt(J[1]))); 
        quociente = ((parseInt(J[0])-resto)/parseInt(J[1]));
    }else
        quociente = (parseInt(J[0])/parseInt(J[1]));
    
}

console.log(parseInt(quociente)+" "+parseInt(resto));
