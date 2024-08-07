registration_number = input("Enter your registration number: ")
name = input("Enter your name: ")
patrimony = int(input("Enter your patrimony: "))
social_stratum = int(input("Enter your social stratum: "))

payment_of_tuition = 50000

if social_stratum > 3 and patrimony > 2000000:
    payment_of_tuition = 50000 + patrimony * 0.03
print("Registration number: ", registration_number)
print("Name: ", name)
print("Payment of tuitionition: ", payment_of_tuition)