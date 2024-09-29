from abc import ABC, abstractmethod

# Clase abstracta Ciclista
class Ciclista(ABC):
    def __init__(self, identificador, nombre):
        self.__identificador = identificador
        self.__nombre = nombre
        self.__tiempo_acumulado = 0  # Tiempo en minutos, inicializado a cero

    # Métodos get y set
    def get_identificador(self):
        return self.__identificador

    def set_identificador(self, identificador):
        self.__identificador = identificador

    def get_nombre(self):
        return self.__nombre

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def get_tiempo_acumulado(self):
        return self.__tiempo_acumulado

    def set_tiempo_acumulado(self, tiempo):
        self.__tiempo_acumulado = tiempo

    # Método protegido
    def _imprimir_tipo(self):
        pass  # Esto será implementado por las subclases

    @abstractmethod
    def imprimir_datos(self):
        pass

# Subclase Velocista
class Velocista(Ciclista):
    def __init__(self, identificador, nombre, potencia_promedio, grado_rampa):
        super().__init__(identificador, nombre)
        self.__potencia_promedio = potencia_promedio
        self.__grado_rampa = grado_rampa

    # Métodos get y set
    def get_potencia_promedio(self):
        return self.__potencia_promedio

    def set_potencia_promedio(self, potencia):
        self.__potencia_promedio = potencia

    def get_grado_rampa(self):
        return self.__grado_rampa

    def set_grado_rampa(self, grado):
        self.__grado_rampa = grado

    # Implementación del método protegido
    def _imprimir_tipo(self):
        return "Es un velocista."

    def imprimir_datos(self):
        tipo = self._imprimir_tipo()
        print(f"{tipo} Nombre: {self.get_nombre()}, Identificador: {self.get_identificador()}, "
              f"Tiempo acumulado: {self.get_tiempo_acumulado()} minutos, "
              f"Potencia promedio: {self.__potencia_promedio}, Grado de rampa: {self.__grado_rampa}")

# Subclase Escalador
class Escalador(Ciclista):
    def __init__(self, identificador, nombre, aceleracion_promedio, grados_rampa):
        super().__init__(identificador, nombre)
        self.__aceleracion_promedio = aceleracion_promedio
        self.__grados_rampa = grados_rampa

    # Métodos get y set
    def get_aceleracion_promedio(self):
        return self.__aceleracion_promedio

    def set_aceleracion_promedio(self, aceleracion):
        self.__aceleracion_promedio = aceleracion

    def get_grados_rampa(self):
        return self.__grados_rampa

    def set_grados_rampa(self, grados):
        self.__grados_rampa = grados

    # Implementación del método protegido
    def _imprimir_tipo(self):
        return "Es un escalador."

    def imprimir_datos(self):
        tipo = self._imprimir_tipo()
        print(f"{tipo} Nombre: {self.get_nombre()}, Identificador: {self.get_identificador()}, "
              f"Tiempo acumulado: {self.get_tiempo_acumulado()} minutos, "
              f"Aceleración promedio: {self.__aceleracion_promedio}, Grados de rampa: {self.__grados_rampa}")

# Subclase Contrarrelojista
class Contrarrelojista(Ciclista):
    def __init__(self, identificador, nombre, velocidad_maxima):
        super().__init__(identificador, nombre)
        self.__velocidad_maxima = velocidad_maxima

    # Métodos get y set
    def get_velocidad_maxima(self):
        return self.__velocidad_maxima

    def set_velocidad_maxima(self, velocidad):
        self.__velocidad_maxima = velocidad

    # Implementación del método protegido
    def _imprimir_tipo(self):
        return "Es un contrarrelojista."

    def imprimir_datos(self):
        tipo = self._imprimir_tipo()
        print(f"{tipo} Nombre: {self.get_nombre()}, Identificador: {self.get_identificador()}, "
              f"Tiempo acumulado: {self.get_tiempo_acumulado()} minutos, "
              f"Velocidad máxima: {self.__velocidad_maxima}")

# Clase Equipo
class Equipo:
    def __init__(self, nombre_equipo, pais):
        self.__nombre_equipo = nombre_equipo
        self.__pais = pais
        self.__ciclistas = []
        self.__suma_tiempos = 0

    # Métodos get y set
    def get_nombre_equipo(self):
        return self.__nombre_equipo

    def set_nombre_equipo(self, nombre):
        self.__nombre_equipo = nombre

    def get_pais(self):
        return self.__pais

    def set_pais(self, pais):
        self.__pais = pais

    def get_suma_tiempos(self):
        return self.__suma_tiempos

    def set_suma_tiempos(self, suma_tiempos):
        self.__suma_tiempos = suma_tiempos

    def agregar_ciclista(self, ciclista):
        if isinstance(ciclista, Ciclista):
            self.__ciclistas.append(ciclista)
            self.__suma_tiempos += ciclista.get_tiempo_acumulado()

    def calcular_total_tiempo(self):
        return self.__suma_tiempos

    def listar_nombres_ciclistas(self):
        nombres = [ciclista.get_nombre() for ciclista in self.__ciclistas]
        return nombres

# Crear instancias y probar
velocista = Velocista("001", "Carlos", 500, 8)
escalador = Escalador("002", "Luis", 10, 12)
contrarrelojista = Contrarrelojista("003", "Ana", 55)

# Crear equipo y agregar ciclistas
equipo = Equipo("Patiflacos", "España")
equipo.agregar_ciclista(velocista)
equipo.agregar_ciclista(escalador)
equipo.agregar_ciclista(contrarrelojista)

# Imprimir datos de ciclistas
velocista.imprimir_datos()
escalador.imprimir_datos()
contrarrelojista.imprimir_datos()

# Imprimir información del equipo
print(f"Nombre del equipo: {equipo.get_nombre_equipo()}")
print(f"País: {equipo.get_pais()}")
print(f"Suma total de tiempos: {equipo.calcular_total_tiempo()} minutos")
print(f"Nombres de los ciclistas: {', '.join(equipo.listar_nombres_ciclistas())}")
