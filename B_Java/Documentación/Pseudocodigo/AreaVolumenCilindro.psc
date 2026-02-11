Algoritmo AreaVolumenCilindro
	r <- 0.0
	h <- 0.0
	volumen <- 0.0
	area <- 0.0
	
	Escribir 'Introduce el radio: '
	Leer r
	Escribir 'Introduce la altura: '
	Leer h
	
	area <- 2 * PI * r * (h + r)
	
	Escribir 'El area es: ', area
	
	volumen <- PI * r^2 * h
	
	Escribir 'El volumen es: ', volumen
	
FinAlgoritmo
