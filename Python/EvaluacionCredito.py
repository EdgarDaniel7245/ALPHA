import tkinter as tk
from tkinter import simpledialog, messagebox

# Configuración inicial para ocultar la ventana principal vacía
root = tk.Tk()
root.withdraw()

# --- Entrada de datos ---
input_salario = simpledialog.askstring("Entrada", "Ingrese su salario mensual:")
salario_mensual = float(input_salario)

input_deudas = simpledialog.askstring("Entrada", "¿Tiene deudas pendientes? (Si/No)")

historial_crediticio = simpledialog.askstring("Entrada", "¿Su historial crediticio es Bueno? (Si/No)")

# --- Lógica de negocio ---
estado_solicitud = ""

if salario_mensual >= 15000:
    if input_deudas.lower() == "no":
        estado_solicitud = "Aprobado"
        
        # Bonificación si tiene buen historial
        if historial_crediticio.lower() == "si":
            estado_solicitud = "Aprobado con Tasa Preferencial"
            
    else:
        # Tiene salario pero tiene deudas
        if historial_crediticio.lower() == "si":
            estado_solicitud = "Aprobado Condicionado (Requiere Aval)"
        else:
            estado_solicitud = "Rechazado por Deudas"
else:
    estado_solicitud = "Rechazado por Ingresos Insuficientes"

# --- Salida ---
mensaje_salida = (f"--- Resultados de Crédito ---\n"
                  f"Salario: ${salario_mensual}\n"
                  f"Tiene Deudas: {input_deudas}\n"
                  f"Historial: {historial_crediticio}\n\n"
                  f"Dictamen Final: {estado_solicitud}")

messagebox.showinfo("Resultado", mensaje_salida)