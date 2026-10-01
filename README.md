# FitGym Control – Gimnasio (Grupo 8)

## Integrantes
- Integrante 1: Betancourt Steven 
- Integrante 2: Ogonaga Isaac 
- Integrante 3: Terán Julio 

## Ejercicio asignado
Registrar socios de un gimnasio: nombre, plan (1 Básico, 2 VIP, 3 Black), meses contratados y si incluye entrenador. Se calcula el pago de cada socio y al final se muestra el recaudo total, la cantidad de planes VIP/Black y el promedio pagado.

## Reglas de negocio
| Plan | Tarifa mensual |
|------|----------------|
| 1 Básico | $20 |
| 2 VIP | $35 |
| 3 Black | $50 |

- **Descuento por meses:** 3–5 meses = 5 % | 6–11 meses = 10 % | 12 o más = 15 %
- **Entrenador:** adicional de $10 por mes.
- **Total = (tarifa × meses) − descuento + entrenador**

## Estructuras utilizadas
- `Scanner`: lectura de datos.
- `switch`: tarifa según el plan.
- `if / else-if`: descuento por meses y adicional del entrenador.
- `for`: procesa los N socios.
- `do-while`: validación de entradas (repite hasta que el dato sea válido).
- **Contadores:** planes VIP/Black y Básico.
- **Acumulador:** recaudo total.
- **Máximo:** socio que más pagó.
- **Validaciones:** N entre 1–100, plan 1–3, meses 1–24, entrenador 1–2, nombre no vacío, solo números enteros.

## Instrucciones para ejecutar
```bash
javac FitGymControl.java
java FitGymControl
```
Requiere JDK 8 o superior (probado en VS Code).

## Casos de prueba

### Caso 1 – Normal
Entradas: `N=2` | Ana, plan 2, 6 meses, entrenador Sí | Luis, plan 3, 12 meses, entrenador No

| Socio | Subtotal | Descuento | Entrenador | Total |
|-------|----------|-----------|------------|-------|
| Ana | $210.00 | −$21.00 (10 %) | +$60.00 | **$249.00** |
| Luis | $600.00 | −$90.00 (15 %) | $0.00 | **$510.00** |

Reporte: recaudo **$759.00**, VIP/Black **2**, promedio **$379.50**, mayor pago **Luis ($510.00)**.

### Caso 2 – Límite
Entradas: `N=1` | Carlos, plan 1, **3 meses** (mínimo para descuento), entrenador No

Resultado: subtotal $60.00 − 5 % ($3.00) = **$57.00**. Recaudo $57.00, VIP/Black 0, promedio $57.00.

### Caso 3 – Dato inválido
- `N = 0` → "Ingrese un valor entre 1 y 100" y vuelve a preguntar.
- Plan `5` → "Ingrese un valor entre 1 y 3" y vuelve a preguntar.
- Meses `abc` → "Debe ingresar un numero entero" y vuelve a preguntar.

El programa no continúa hasta recibir datos válidos.
