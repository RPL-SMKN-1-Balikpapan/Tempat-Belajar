import json

x = '{ "nama":"Gletzer", "umur":17, "Kota":"Manchaster"}'

y = json.loads(x)
 
print(y["Kota"])