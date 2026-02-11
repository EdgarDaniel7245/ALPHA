Algoritmo OperacionesNumeros
	Definir num1, num2, resut Como Real
	Escribir 'Introduce el número 1'
	Leer num1
	Escribir 'Escribir el número 2'
	Leer num2
	Si num1==num2 Entonces
		result <- num1*num2
	SiNo
		Si num1>num2 Entonces
			result <- num1-num2
		SiNo
			result <- num1+num2
		FinSi
	FinSi
	Escribir 'El resultado de la operación es: ', result
FinAlgoritmo
