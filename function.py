def user():
    """" Hello here function worked """
    print("Hello - function")
user()
def function():
   # pass
    print("Hello-function1")
    print("Hello -function2")
function()
#print("I'm outside the function")

print("-----------------------------------------")
def function2(username,school='XYZ'):
    print('Hello'+' '+username+' '+school)

print("-----------------------------------------")
function2('Ajeet',school="Amity")
def function3(*student,**college):
    print(student)
    print(college)
function3('ajeet','sharda university')

print('------------------------------------------')
def function3(x):
     return 2*x
a=function3(2)
print(a)

