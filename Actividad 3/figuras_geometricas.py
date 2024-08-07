import math

# Circle class
class Circle:
    def __init__(self, radius):
        self.radius = radius

    def area(self):
        return math.pi * self.radius ** 2

    def perimeter(self):
        return 2 * math.pi * self.radius

# Rectangle class
class Rectangle:
    def __init__(self, width, height):
        self.width = width
        self.height = height

    def area(self):
        return self.width * self.height

    def perimeter(self):
        return 2 * (self.width + self.height)

# Square class
class Square:
    def __init__(self, side):
        self.side = side

    def area(self):
        return self.side ** 2

    def perimeter(self):
        return 4 * self.side

# Right-Angled Triangle class
class RightAngledTriangle:
    def __init__(self, base, height):
        self.base = base
        self.height = height

    def area(self):
        return 0.5 * self.base * self.height

    def perimeter(self):
        return self.base + self.height + self.hypotenuse()

    def hypotenuse(self):
        return math.sqrt(self.base ** 2 + self.height ** 2)

    def type_of_triangle(self):
        if self.base == self.height:
            return "Isosceles Triangle"
        else:
            return "Scalene Triangle"

# Test class with main method
class TestShapes:
    def main():
        # Taking inputs from user
        radius = input("Enter the radius of the circle: ")

        width = input("Enter the width of the rectangle: ")
        height = input("Enter the height of the rectangle: ")

        side = input("Enter the side of the square: ")

        triangle_base = input("Enter the base of the right-angled triangle: ")
        triangle_height = input("Enter the height of the right-angled triangle: ")

        # Initializing objects
        circle = Circle(float(radius))
        rectangle = Rectangle(float(width), float(height))
        square = Square(float(side))
        triangle = RightAngledTriangle(float(triangle_base), float(triangle_height))

        # Showing results
        print("Circle Area:", circle.area())
        print("Circle Perimeter:", circle.perimeter())

        print("Rectangle Area:", rectangle.area())
        print("Rectangle Perimeter:", rectangle.perimeter())

        print("Square Area:", square.area())
        print("Square Perimeter:", square.perimeter())

        print("Triangle Area:", triangle.area())
        print("Triangle Perimeter:", triangle.perimeter())
        print("Triangle Hypotenuse:", triangle.hypotenuse())
        print("Triangle Type:", triangle.type_of_triangle())

if __name__ == "__main__":
    TestShapes.main()