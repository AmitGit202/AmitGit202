'''
Created on 27-Apr-2020

@author: Amitava
'''


import pandas as pd

df =pd.DataFrame({"Day":[1,2,3,4,5,6],"Visitor":[1000,2000,3000,4000,5000,6000],"Bounce_rate":[20,30,40,50,60,70]})
df.set_index("Day",inplace=True)
print(df)

