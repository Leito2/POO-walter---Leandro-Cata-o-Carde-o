name = input("Enter your name: ")
job_hours = input("Enter your job hours: ")
Value_per_hour = input("Enter your Value per hour: ")

print("Name: " + name)

grass_salary = float(job_hours) * float(Value_per_hour)
if grass_salary <= 450000:
    print("Grass salary: " + str(grass_salary))