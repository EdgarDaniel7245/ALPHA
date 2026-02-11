Algoritmo EvaluacionCalificaion
	Definir grade Como Real
	Definir message Como Caracter
	
	Escribir 'Enter a grade: '
	Leer grade
	
	Si grade >=7.0 Entonces
		message = 'You Passed'
	SiNo
		message = 'You Failed'
	Fin Si
	
	Escribir message
	
FinAlgoritmo
