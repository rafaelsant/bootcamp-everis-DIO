function Pessoa(customProperties){
    return{
        name: 'Rafael',
        lastname: 'Santiago',
        ...customProperties
    }
}

const p = Pessoa({name: "Custom name",age:25,message:"Factory"});
console.log(p);