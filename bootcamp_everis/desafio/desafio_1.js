let H = parseFloat(4520.00).toFixed(2);
let imp1 = parseFloat(H-2000).toFixed(2);
let imp2 = parseFloat(H-3000).toFixed(2);
let imp3 = parseFloat(H-4500).toFixed(2);
let resp=0.00;
let flag=0.00;
if(imp1>0.00){
  if(H>3000.00){
    imp1 = 1000.00;
  }
  resp =(imp1*0.08);
}
if(imp2>0.00){
  if(H>4500.00){
    imp2 = 1500.00;
  }
  flag = (imp2*0.18);
  resp =resp+flag;
}
if(imp3>0.00){
    resp +=(imp3*0.28);
}
if(imp1<=0){
    console.log("Isento")
  }else{
    console.log("R$"+parseFloat(resp).toFixed(2))
  }