a = input("Enter A: ")
b = input("Enter B: ")
c = input("Enter C: ")

d = b**2 - 4*a*c
x1 = (-b + d**0.5)/(2*a)
x2 = (-b - d**0.5)/(2*a)

if d < 0:
    print("The equation has no real roots")
else:
    print("x1 = ", x1)
    print("x2 = ", x2)