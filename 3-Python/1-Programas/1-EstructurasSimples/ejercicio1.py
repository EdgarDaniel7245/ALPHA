parcial1 = float(input("Calificación Primer Parcial: "))
parcial2 = float(input("Calificación Segundo Parcial: "))
proyecto = float(input("Calificación Proyecto Final: "))

promedio = (parcial1 + parcial2) / 2

if promedio >= 70 and proyecto >= 60:
    estatus = "Aprobado"
elif 50 <= promedio <= 69:
    estatus = "Extraordinario"
else:
    estatus = "Reprobado"

mensaje_extra = ""
if promedio >= 95:
    mensaje_extra = "Alumno con excelencia académica"

print(f"--- Resultados ---\nPromedio Final: {promedio}")
print(f"Estatus: {estatus}")
if mensaje_extra:
    print(mensaje_extra)