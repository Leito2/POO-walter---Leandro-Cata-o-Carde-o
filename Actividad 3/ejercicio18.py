employee_code = input("Enter your employee code: ")
name = input("Enter your name: ")
job_hours = input("Enter your job hours: ")
Value_per_hour = input("Enter your Value per hour: ")
retention_rate = input("Enter your retention rate(0-1): ")

print("Employee code: " + employee_code)
print("Name: " + name)

grass_salary = float(job_hours) * float(Value_per_hour)
print("Grass salary: " + str(grass_salary))

net_salary = float(job_hours) * float(Value_per_hour) * (1 - float(retention_rate))
print("Net salary: " + str(net_salary))