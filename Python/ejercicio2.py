consumo = float(input("Ingrese consumo en kWh: "))
tarifa = int(input("Tipo de tarifa (1=Básica, 2=Intermedia, 3=Alta): "))

costo_kwh = 0.0
recargo_pct = 0.0

if tarifa == 1:
    costo_kwh = 0.85
    if consumo > 250: recargo_pct = 0.12
elif tarifa == 2:
    costo_kwh = 1.25
    if consumo > 500: 
        recargo_pct = 0.18
    elif consumo >= 300: 
        recargo_pct = 0.10
elif tarifa == 3:
    costo_kwh = 2.10
    if consumo > 400: recargo_pct = 0.25

subtotal = consumo * costo_kwh
monto_recargo = subtotal * recargo_pct
total = subtotal + monto_recargo

mensaje = ""
if total > 1500: mensaje = "Consumo elevado: se recomienda ahorro de energía" 
if consumo < 100: mensaje = "Usuario con consumo eficiente"

print(f"--- Factura ---\nCosto por kWh: ${costo_kwh}")
print(f"Recargo aplicado: ${monto_recargo:.2f}")
print(f"Total a pagar: ${total:.2f}")
if mensaje: print(mensaje)