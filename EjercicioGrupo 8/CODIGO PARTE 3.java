double subtotal = tarifaBaseMes * meses;
            
            
            double descuento = 0;
            if (meses >= 12) {
                descuento = subtotal * 0.20; 
            } else if (meses >= 6) {
                descuento = subtotal * 0.10; 
            }
            
            
            double costoEntrenador = 0;
            if (incluyeEntrenador) {
                costoEntrenador = 15.0 * meses;
            }
            
            double totalSocio = (subtotal - descuento) + costoEntrenador;
            recaudoTotal += totalSocio; 
            System.out.println("Total a pagar para " + nombre + ": $" + totalSocio);





