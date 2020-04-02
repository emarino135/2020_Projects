virusName = input("What Virus do you want to get mRNA sequence for?\n")
with open("Virus/"+virusName+"/DNA_Sequence","r") as DNA:
    with open("Virus/"+virusName+"/mRNA_Sequence","w") as mRNA:
        for line in DNA:
            translatedLine = ""
            for char in line:
                if char == "t":
                    translatedLine+="u"
                else:
                    translatedLine+=char
            mRNA.write(translatedLine)
