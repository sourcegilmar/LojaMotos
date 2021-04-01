# LojaMotos
Exemplo de refatoração de extração de super classe usando o Eclipse As refatorações feitas aqui foram as seguintes: 
1 - Extração de superclasse "Moto" com base nos campos redundantes nas classes concretas (Honda, Yamaha e Syzuki) 
2 - Foi alterado a super classe Moto para abstract 
3 - Após a alteração foi modificado manualmente a criação dos objetos de, por exemplo: Honda moto = new Honda() para Moto moto = new Honda(); 
4 - Extração do método "imprimeDadosMoto" para mostrar os dados da moto 
5 - Extração do método "fabrica" para a criação dos objetos
