Algoritmo NominaTabajadores
	Definir nombreTraba Como Caracter
	Definir precioHora, precioHoraExtra, sueldoTotal Como Real
	Definir horasExtras, horasTraba Como Entero
	
	Escribir "Introduce el nombre del Trabajador: "
	Leer nombreTraba
	
	Escribir "Escribir las horas trabajadas: "
	Leer horasTraba
	
	Escribir "Introduce el precio por hora: "
	Leer precioHora
	
	Si horasTraba <= 40 Entonces
		horasTraba = 0
		sueldoTotal = horasTraba * precioHora
	SiNo
		Escribir "Introduce el presio de las horas extra: "
		Leer precioHoraExtra
		horasExtras = horasTraba - 40
		sueldoTotal = 40 * precioHora + horasExtras * precioHoraExtra
	Fin Si
	Escribir "Nombre del trabajador: ", nombreTraba
	Escribir "Horas trabajadas: ", horasTraba
	Escribir "horas extras: ", horasExtras
	Escribir "Total a pagar: ", sueldoTotal
FinAlgoritmo
