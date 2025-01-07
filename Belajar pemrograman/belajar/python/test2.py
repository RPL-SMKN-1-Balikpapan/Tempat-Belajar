import pandas as pd

data = {
    'Nama' : ['Gletzer', 'Julio', 'Ivanees'],
    'Usia' : [17, 12, 30],
    'Pekerjaan' : ['Mahasiswa', 'Programmer', 'Peternak']
}

df = pd.DataFrame(data)

print(df)