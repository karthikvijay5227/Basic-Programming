name=input("Enter the name:")
vowels=["a","A","E","e","i","I","O","o","U","u"]
for i in name:
    if i in vowels:
        name=name.replace(i,"")
print(name)        
