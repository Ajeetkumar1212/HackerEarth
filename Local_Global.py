num1=100  #Global variable
def add1():
    num1=10  #Loacal Var
    num2=20
    print(num1+num2)
add1()
print('Outside var--------------------')
print(num1)
#Instance Method
class student:
    def __init__(self,name,college):
        self.name=name
        self.college=college
    def msg(self):
            print(self.name+" "+self.college)
s1=student("Ajeet","sharda")
print(s1.name+" "+s1.college)
s1.msg()

