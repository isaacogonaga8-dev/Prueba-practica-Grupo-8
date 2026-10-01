// Usar switch para definir la tarifa base por mes
            double tarifaBaseMes = 0;
            switch (plan) {
                case 1:
                    tarifaBaseMes = 30.0; // Tarifa Plan Básico
                    break;
                case 2:
                    tarifaBaseMes = 50.0; // Tarifa Plan VIP
                    cantidadVipBlack++; // Conteo de plan VIP
                    break;
                case 3:
                    tarifaBaseMes = 80.0; // Tarifa Plan Black
                    cantidadVipBlack++; // Conteo de plan Black[cite: 1]
                    break;
                default:
                    System.out.println("Plan no válido. Se asignará Básico.");
                    tarifaBaseMes = 30.0;
                    break;
            }
