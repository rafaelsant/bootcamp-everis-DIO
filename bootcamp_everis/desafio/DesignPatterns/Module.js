//Módule: é um pattern que possibilita organizarmos
//melhor o nosso código, sem a necessidade de expor
//variáveis globais.

let name = 'default'
function getName(){
    return name;
}
function setName(newName){
    name = newName;
}

module.exports = {
    getName,
    setName
};