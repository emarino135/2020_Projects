virusName = input("What virus do you want me to check for?\n")
with open("dna/Virus/"+virusName+"/DNA_Sequence") as Sequence:
    count = 0
    countA = 0
    countT = 0
    countG = 0 
    countC = 0
    countU = 0
    other = 0
    for line in Sequence:
        for char in line:
            if (not char.isspace()) and (not char.isdigit()):
                count+=1
                if char == "a":
                    countA+=1
                elif char == "t":
                    countT+=1
                elif char == "g":
                    countG+=1
                elif char == "c":
                    countC+=1
                elif char == "u":
                    countU+=1
                else:
                    other +=1

print("There are " + str(count) + " characters")
print(str(countA) + " of which are Adenine(A): %" + str(int(10000*countA/count)/100))
if countT>0 and countU== 0:
    print(str(countT) + " of which are Thymine(T): %" + str(int(10000*countT/count)/100))
elif countU>0 and countT == 0:
    print(str(countU) + " of which are Uracil(U): %" + str(int(10000*countU/count)/100))
else:
    print("I think there is a mix up between DNA and mRNA here. There are both t's and u's in this sequence.")
print(str(countG) + " of which are Guanine(G): %" + str(int(10000*countG/count)/100))
print(str(countC) + " of which are Cytonsine(C): %" + str(int(10000*countC/count)/100))
if other > 0:
    print(str(other)+" invalid data was improperly counted? Please check data for corruption")