#I want them formatted like this per row
###
#Groups into three nine's per row for easier human amino acid readibility
virusName = input("What Virus data do you want to order?\n")
with open("dna/Virus/"+virusName+"/mRNA_3Sequence","w") as new:
    with open("dna/Virus/"+virusName+"/mRNA_Sequence","r") as original:
        i = 0
        for line in original: #read each line
            charlist = ""
            newrow = ""
            for char in line:#Get all characters
                if not char.isdigit() and not char.isspace():
                    charlist+=char
            group3 = [(charlist[i:i+3]) for i in range(0,len(charlist),3)]
            print(group3)
            result = "\n".join(group3)
            
            if i == 0:#Just execute one the first time
                i = 1
                new.write(result)
            else:
                new.write("\n"+result)
        
        