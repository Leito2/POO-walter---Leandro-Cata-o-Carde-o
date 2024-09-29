class Cuenta:
    def __init__(self, saldo, num_retiros, num_consignaciones, tasa_anual, comision_mensual):
        self.saldo = saldo
        self.num_retiros = num_retiros
        self.num_consignaciones = num_consignaciones
        self.tasa_anual = tasa_anual
        self.comision_mensual = comision_mensual

    def consignar(self, cantidad):
        if cantidad > 0:
            self.saldo += cantidad
            self.num_consignaciones += 1
            print(f"Consignación exitosa. Nuevo saldo: {self.saldo}")
        else:
            print("La cantidad a consignar debe ser positiva.")

    def retirar(self, cantidad):
        if cantidad > 0 and cantidad <= self.saldo:
            self.saldo -= cantidad
            self.num_retiros += 1
            print(f"Retiro exitoso. Nuevo saldo: {self.saldo}")
        else:
            print("Fondos insuficientes o cantidad inválida para retirar.")

    def calcular_interes_mensual(self):
        interes_mensual = (self.tasa_anual / 12) / 100 * self.saldo
        self.saldo += interes_mensual
        print(f"Interés mensual añadido. Nuevo saldo: {self.saldo}")

    def aplicar_comision_mensual(self):
        self.saldo -= self.comision_mensual
        print(f"Comisión mensual aplicada. Nuevo saldo: {self.saldo}")

class CuentaAhorro(Cuenta):
    def __init__(self, saldo, num_retiros, num_consignaciones, tasa_anual, comision_mensual):
        super().__init__(saldo, num_retiros, num_consignaciones, tasa_anual, comision_mensual)
        self.limite_retiros_gratis = 4  # Los primeros 4 retiros son gratuitos.

    def retirar(self, cantidad):
        if self.num_retiros < self.limite_retiros_gratis:
            super().retirar(cantidad)
        else:
            comision_por_retiro = 1.0  # Cobro adicional después del límite de retiros gratis
            if self.saldo >= cantidad + comision_por_retiro:
                self.saldo -= comision_por_retiro
                super().retirar(cantidad)
                print(f"Comisión de retiro aplicada: {comision_por_retiro}. Nuevo saldo: {self.saldo}")
            else:
                print("Fondos insuficientes para realizar el retiro más la comisión.")

class CuentaCorriente(Cuenta):
    def __init__(self, saldo, num_retiros, num_consignaciones, tasa_anual, comision_mensual, sobregiro):
        super().__init__(saldo, num_retiros, num_consignaciones, tasa_anual, comision_mensual)
        self.sobregiro = sobregiro

    def retirar(self, cantidad):
        if cantidad <= self.saldo + self.sobregiro:
            self.saldo -= cantidad
            if self.saldo < 0:
                self.sobregiro += self.saldo  # Actualiza el sobregiro si se usa.
                self.saldo = 0
            self.num_retiros += 1
            print(f"Retiro exitoso. Saldo: {self.saldo}, Sobregiro disponible: {self.sobregiro}")
        else:
            print("No hay suficientes fondos ni sobregiro disponible para realizar el retiro.")

# Ejemplo

# Crear una cuenta de ahorro con saldo inicial de 1000
cuenta_ahorro = CuentaAhorro(saldo=1000, num_retiros=0, num_consignaciones=0, tasa_anual=5, comision_mensual=10)

# Hacer una consignación
cuenta_ahorro.consignar(200)

# Retirar dinero
cuenta_ahorro.retirar(100)

# Aplicar comisiones e intereses mensuales
cuenta_ahorro.aplicar_comision_mensual()
cuenta_ahorro.calcular_interes_mensual()

# Crear una cuenta corriente con sobregiro de 500
cuenta_corriente = CuentaCorriente(saldo=500, num_retiros=0, num_consignaciones=0, tasa_anual=4, comision_mensual=10, sobregiro=500)

# Retirar más del saldo disponible (con sobregiro)
cuenta_corriente.retirar(800)