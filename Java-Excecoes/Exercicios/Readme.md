# Questionário para Estudo:
1- O que é uma Exceção no contexto de programação com Java ?<br>
R: Uma exceção é algo que pode vir a acontencer fugindo do fluxo normal da aplicação

2- O que significa Tratamento de Exceções ?<br>
R: É tratar algo que pode vir acontecer quebrando o fluxo da aplicação

3- Cite alguns exemplos de Classes de Exceções do Java ? <br>
R: NullPointerException; ArithmeticException; RuntimeException; Exception...

4- Quais os tipos e diferenças de Exceções do Java ?<br>
R: 
* Unchecked - não são verificadas pelo compilador nem obrigado a tratar ou relançar.
* Checked - verificadas pelo compilador e o dev é obrigado a tratar ou relançar (throws) caso não saiba como tratar. 

5- Explique o bloco de Tratamento de Exceções (try...catch...finally...).<br>
R: Com o try alertamos a maquina virtual, com o catch definimos qual exceções pode acontecer e o finnaly é usado para executar tarefas que são obrigatórias Ex: fechar uma conexão.

6- Explique a forma de lançamento de uma Exceção (throw new...).<br>
R: O java pega esse obejto que esta na memória de objetos e transforma em uma exceção e joga na pilha de execução.

7- Explique o funcionamento da Propagação de Exceções (throws).<br>
R: Quando um método lança uma exceção, duas coisas podem acontecer:
* O método pode tratar a exceção, usando try/catch
* O método pode não tratar a exceção, e sim propagá-la para o método que o chamou,
esse método pode tratar ou propagar a exceção, e assim sucessivamente
   * Em último caso, se o método main propagar a exceção, ela é exibida para o usuário final e o programa encerra