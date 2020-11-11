const { setupMaster } = require("cluster");

//Uma dunção decorator recebe outra função como parâmetro e estende os eu comportamento sem modificá-la explicitamente.
let loggedIn = false;

function callIfAuthenticated(fn){
    return !!loggedIn && fn();
}
function sum(a,b){
    return a+b;
}
console.log(callIfAuthenticated(()=>sum(2,3)));
loggedIn = true;
console.log(callIfAuthenticated(()=>sum(2,3)));
loggedIn = false;
console.log(callIfAuthenticated(()=>sum(2,3)));