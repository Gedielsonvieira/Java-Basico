# Java Exceções

## Pilha de execução
A JVM usa uma stack para organizar a execução dos métodos e para entendermos o rastro de exceção.<br>
A JVM sabe exatamente  qual método está sendo executado que é sempre o método no topo da pilha e também sabe quais outros precisam ser executados que são os métodos abaixo.

## Tratamento de exceções
`-` Uma exceção em Java é um objeto da classe java.lang.Exception, ou de uma de suas subclasses.<br>
`-` Exceção é um evento não esperado que ocorre no sistema quando está em tempo de execução<br>
`-` Exceções servem para: 
* impedir a parada de execução prematura do código, 
* capturar o erro/exceção e 
* delegar o tratamento deste erro para alguma parte específica do código (classe)

#### Try Catch
> Utilizamos try catch para lidarmos com exceções e voltar para uma execução normal

Com o try alertamos a maquina virtual e com o catch definimos qual exceção pode acontecer

## Lançamento de exceções
### throw 
o Java pega esse objeto que esta no HEAP (memória de objetos), transforma em uma exceção e "joga" na pilha de execução.<br>
> O Java reconhece que, quando jogamos uma exceção, saímos abruptamente do código pos isso se houver código abaixo o compilador acusa-rá erro.

## Checked e Unchecked



