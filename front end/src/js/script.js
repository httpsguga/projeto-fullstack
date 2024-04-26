const formulario = document.querySelector("form")
const Idocumento = document.querySelector(".documento");
const Inome = document.querySelector(".nome");
const Isexo = document.querySelector(".sexo");
const Iemail = document.querySelector(".email");
const Itelefone = document.querySelector(".telefone");
const Iuf = document.querySelector(".uf");

function cadastrar() {
    fetch("http://localhost:8080/clientes",
     {
        headers: {
            'accept': 'application/json',
            'Content-Type': 'application/json'
        },
        method : "POST",
        body: JSON.stringify({
            documento: Idocumento.value,
            nome: Inome.value,
            sexo: Isexo.value,
            email: Iemail.value,
            telefone: Itelefone.value,
            UF: Iuf.value
        })
    })
    .then (function (res) {console.log(res) }) 
    .catch (function(resp){console.log(resp) })
};

function limpar (){
    
        Idocumento.value = "";
        Inome.value = "";
        Isexo.value = "";
        Iemail.value = "";
        Itelefone.value = "";
        Iuf.value = "";
    
}

formulario.addEventListener('submit', function (event) {
    event.preventDefault();

    cadastrar();
    limpar();
});