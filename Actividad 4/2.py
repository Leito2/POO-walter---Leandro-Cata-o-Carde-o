# Clase padre
class Inmueble:
    def __init__(self, identificador, area, direccion, precio_venta):
        self.identificador = identificador
        self.area = area
        self.direccion = direccion
        self.precio_venta = precio_venta

    def calcular_precio_venta(self, nuevo_precio):
        self.precio_venta = nuevo_precio
        print(f"El nuevo precio de venta es: {self.precio_venta}")

    def imprimir(self):
        print(f"Inmueble ID: {self.identificador}, Área: {self.area}, Dirección: {self.direccion}, Precio de Venta: {self.precio_venta}")


# Clase hija InmuebleVivienda
class InmuebleVivienda(Inmueble):
    def __init__(self, identificador, area, direccion, precio_venta, num_habitaciones, num_banos):
        super().__init__(identificador, area, direccion, precio_venta)
        self.num_habitaciones = num_habitaciones
        self.num_banos = num_banos

    def imprimir(self):
        super().imprimir()
        print(f"Habitaciones: {self.num_habitaciones}, Baños: {self.num_banos}")


# Clase Casa
class Casa(InmuebleVivienda):
    def __init__(self, identificador, area, direccion, precio_venta, num_habitaciones, num_banos, num_pisos):
        super().__init__(identificador, area, direccion, precio_venta, num_habitaciones, num_banos)
        self.num_pisos = num_pisos

    def imprimir(self):
        super().imprimir()
        print(f"Número de pisos: {self.num_pisos}")


# Subclases de Casa: CasaRural y CasaUrbana
class CasaRural(Casa):
    def __init__(self, identificador, area, direccion, precio_venta, num_habitaciones, num_banos, num_pisos, valor_area, altitud):
        super().__init__(identificador, area, direccion, precio_venta, num_habitaciones, num_banos, num_pisos)
        self.valor_area = valor_area
        self.altitud = altitud

    def imprimir(self):
        super().imprimir()
        print(f"Valor área: {self.valor_area}, Altitud: {self.altitud}")


class CasaUrbana(Casa):
    def __init__(self, identificador, area, direccion, precio_venta, num_habitaciones, num_banos, num_pisos):
        super().__init__(identificador, area, direccion, precio_venta, num_habitaciones, num_banos, num_pisos)


# Subclases de CasaUrbana: CasaConjuntoCerrado y CasaIndependiente
class CasaConjuntoCerrado(CasaUrbana):
    def __init__(self, identificador, area, direccion, precio_venta, num_habitaciones, num_banos, num_pisos, valor_area, valor_administrativo, piscina, campos_deportivos):
        super().__init__(identificador, area, direccion, precio_venta, num_habitaciones, num_banos, num_pisos)
        self.valor_area = valor_area
        self.valor_administrativo = valor_administrativo
        self.piscina = piscina
        self.campos_deportivos = campos_deportivos

    def imprimir(self):
        super().imprimir()
        print(f"Valor área: {self.valor_area}, Valor administrativo: {self.valor_administrativo}, Piscina: {self.piscina}, Campos deportivos: {self.campos_deportivos}")


class CasaIndependiente(CasaUrbana):
    def __init__(self, identificador, area, direccion, precio_venta, num_habitaciones, num_banos, num_pisos, valor_area):
        super().__init__(identificador, area, direccion, precio_venta, num_habitaciones, num_banos, num_pisos)
        self.valor_area = valor_area

    def imprimir(self):
        super().imprimir()
        print(f"Valor área: {self.valor_area}")


# Clase Apartamento
class Apartamento(InmuebleVivienda):
    def __init__(self, identificador, area, direccion, precio_venta, num_habitaciones, num_banos):
        super().__init__(identificador, area, direccion, precio_venta, num_habitaciones, num_banos)


# Subclases de Apartamento: ApartamentoFamiliar y ApartaEstudio
class ApartamentoFamiliar(Apartamento):
    def __init__(self, identificador, area, direccion, precio_venta, num_habitaciones, num_banos, valor_area, valor_administracion):
        super().__init__(identificador, area, direccion, precio_venta, num_habitaciones, num_banos)
        self.valor_area = valor_area
        self.valor_administracion = valor_administracion

    def imprimir(self):
        super().imprimir()
        print(f"Valor área: {self.valor_area}, Valor administración: {self.valor_administracion}")


class ApartaEstudio(Apartamento):
    def __init__(self, identificador, area, direccion, precio_venta, num_habitaciones, num_banos, valor_area):
        super().__init__(identificador, area, direccion, precio_venta, num_habitaciones, num_banos)
        self.valor_area = valor_area

    def imprimir(self):
        super().imprimir()
        print(f"Valor área: {self.valor_area}")


# Clase hija InmuebleLocal
class Local(Inmueble):
    def __init__(self, identificador, area, direccion, precio_venta):
        super().__init__(identificador, area, direccion, precio_venta)


# Subclases de Local: LocalComercial y Oficina
class LocalComercial(Local):
    def __init__(self, identificador, area, direccion, precio_venta, valor_area, nombre_centro_comercial):
        super().__init__(identificador, area, direccion, precio_venta)
        self.valor_area = valor_area
        self.nombre_centro_comercial = nombre_centro_comercial

    def imprimir(self):
        super().imprimir()
        print(f"Valor área: {self.valor_area}, Centro comercial: {self.nombre_centro_comercial}")


class Oficina(Local):
    def __init__(self, identificador, area, direccion, precio_venta, valor_area, es_gobierno):
        super().__init__(identificador, area, direccion, precio_venta)
        self.valor_area = valor_area
        self.es_gobierno = es_gobierno

    def imprimir(self):
        super().imprimir()
        tipo = "de gobierno" if self.es_gobierno else "privada"
        print(f"Valor área: {self.valor_area}, Tipo de oficina: {tipo}")


# Crear una Casa Conjunto Cerrado
casa_conjunto = CasaConjuntoCerrado(identificador="001", area=200, direccion="Calle 123", precio_venta=100000, num_habitaciones=4, num_banos=3, num_pisos=2, valor_area=500, valor_administrativo=300, piscina=True, campos_deportivos=True)

# Imprimir detalles
casa_conjunto.imprimir()

# Crear un ApartaEstudio
apartaestudio = ApartaEstudio(identificador="002", area=40, direccion="Calle 456", precio_venta=50000, num_habitaciones=1, num_banos=1, valor_area=700)

# Imprimir detalles
apartaestudio.imprimir()

# Crear una Oficina
oficina = Oficina(identificador="003", area=150, direccion="Av. Central", precio_venta=120000, valor_area=800, es_gobierno=False)

# Imprimir detalles
oficina.imprimir()