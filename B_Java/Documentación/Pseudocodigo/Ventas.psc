Algoritmo Ventas
	Definir sueldoBase, v1, v2, v3, comsion, sueldoTotal Como Real
	Definir PORCENTAJE Como Real
	PORCENTAJE <- 0.10
	
	Escribir 'Introduce el suedo base: '
	Leer sueldoBase
	Escribir 'Introduce la venta 1: '
	Leer v1
	Escribir 'Introduce la venta 2: '
	Leer v2
	Escribir 'Introduce la venta 3: '
	Leer v3
	
	comsion <- (v1 + v2 + v3) * PORCENTAJE
	sueldoTotal <- sueldoBase + comsion
	
	Escribir 'La comsion es de: ', comsion
	Escribir 'El sueldo total es de: ', sueldoTotal
	
FinAlgoritmo
