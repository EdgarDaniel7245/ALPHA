anio = int(input("Año del vehículo: "))
tipo = int(input("Tipo (1=Particular, 2=Carga, 3=Público): "))
emisiones = int(input("Nivel de emisiones: "))

resultado = "Verificación rechazada" # [cite: 61]

# Reglas [cite: 58-60]
if tipo == 1 and emisiones <= 50:
    resultado = "Verificación aprobada"
elif tipo == 2 and emisiones <= 70:
    resultado = "Verificación aprobada"
elif tipo == 3 and emisiones <= 60:
    resultado = "Verificación aprobada"

print(f"Resultado: {resultado}")
if anio < 2005:
    print("Vehículo antiguo, requiere revisión especial") # [cite: 64]