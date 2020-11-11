//declaração de função da forma antiga
function fn(){
    return(
    "code1"
    )
}
const fn2 =()=> console.log("code2")
const fn3 =()=>{
    return(
        console.log("code3")
    )
} 
console.log(fn());
fn2();
fn3();
//é possível criar propriedades para funções
fn.prop = 'Posso criar propriedades';
//console.log(fn.prop);

//Receber parametros
const logValue = value => console.log(value);
const logFnResult = fnParam => console.log(fnParam());
logFnResult(fn);

// Receber e retornar funções
const controlFnExec = fnParam => allowed => {
    if (allowed){
        fnParam();
    }
}
const handleFunctionExecution = controlFnExec(fn);
handleFunctionExecution(true); //Executará a função Fn
handleFunctionExecution(); //não retornará a função

const person =
[
    {
        name: 'Rafael',
        age: 25
    },
    {
        name: 'Laura',
        age: 21
    },
    {
        name:'Daniel',
        age:21
    }
]
const totalAgeEven = person.filter(person=>person.age%1===0)
                    .reduce((age,person)=>{
                        age += person.age;
                        return age;
                    },0)
console.log(totalAgeEven);