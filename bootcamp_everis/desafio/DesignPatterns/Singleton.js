//O objetivo dess patter é criar uma única isntância de uma Função contrutora e retorna-la toda vez que for for necessário a sua utilização.
function Pessoa(){
    if(!Pessoa.instance){
        Pessoa.instance = this;
    }
    return Pessoa.instance;
}
const p = Pessoa.call({name:'Rafael'});

const p2 = Pessoa.call({name:"Custom name"});

console.log(p);
console.log(p2);