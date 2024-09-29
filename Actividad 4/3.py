from abc import ABC, abstractmethod

# Clase abstracta Animal
class Animal(ABC):
    def __init__(self, sonido, alimento, habitat, nombre_cientifico):
        self._sonido = sonido
        self._alimento = alimento
        self._habitat = habitat
        self._nombre_cientifico = nombre_cientifico

    # Métodos get para los atributos
    def get_sonido(self):
        return self._sonido

    def get_alimento(self):
        return self._alimento

    def get_habitat(self):
        return self._habitat

    def get_nombre_cientifico(self):
        return self._nombre_cientifico

    # Método abstracto que debe ser implementado por las subclases
    @abstractmethod
    def imprimir_informacion(self):
        pass

# Subclase abstracta Canidos
class Canidos(Animal, ABC):
    def __init__(self, sonido, alimento, habitat, nombre_cientifico):
        super().__init__(sonido, alimento, habitat, nombre_cientifico)

# Subclase abstracta Felinos
class Felinos(Animal, ABC):
    def __init__(self, sonido, alimento, habitat, nombre_cientifico):
        super().__init__(sonido, alimento, habitat, nombre_cientifico)

# Clase concreta Perros que hereda de Canidos
class Perros(Canidos):
    def __init__(self, nombre):
        super().__init__("Ladrido", "Carnívoro", "Doméstico", "Canis lupus familiaris")
        self.nombre = nombre  # Nombre del perro

    def imprimir_informacion(self):
        print(f"Perro '{self.nombre}': {self.get_sonido()}, {self.get_alimento()}, {self.get_habitat()}, {self.get_nombre_cientifico()}")

# Clase concreta Lobos que hereda de Canidos
class Lobos(Canidos):
    def __init__(self):
        super().__init__("Aullido", "Carnívoro", "Bosque", "Canis lupus")

    def imprimir_informacion(self):
        print(f"Lobo: {self.get_sonido()}, {self.get_alimento()}, {self.get_habitat()}, {self.get_nombre_cientifico()}")

# Clase concreta Leones que hereda de Felinos
class Leones(Felinos):
    def __init__(self):
        super().__init__("Rugido", "Carnívoro", "Pradera", "Panthera leo")

    def imprimir_informacion(self):
        print(f"León: {self.get_sonido()}, {self.get_alimento()}, {self.get_habitat()}, {self.get_nombre_cientifico()}")

# Clase concreta Gatos que hereda de Felinos
class Gatos(Felinos):
    def __init__(self, nombre):
        super().__init__("Maullido", "Ratones", "Doméstico", "Felis silvestris catus")
        self.nombre = nombre  # Nombre del gato

    def imprimir_informacion(self):
        print(f"Gato '{self.nombre}': {self.get_sonido()}, {self.get_alimento()}, {self.get_habitat()}, {self.get_nombre_cientifico()}")

# Crear un perro y un gato
perro = Perros("Firulais")
gato = Gatos("Michi")

# Imprimir la información de los animales
perro.imprimir_informacion()
gato.imprimir_informacion()
