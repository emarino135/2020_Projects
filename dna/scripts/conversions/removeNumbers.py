
#Clears those numbers so we have something clear to work with
virusName = input("What Virus data do you want to clean?\n")
with open("Virus/"+virusName+"/DNA_Sequence","w") as new:
    with open("Virus/"+virusName+"/OriginalSequence","r") as original:
        for line in original: #read each line
            newline = ""
            for char in line:
                if not char.isdigit():
                    newline+=char
            newline = newline.lstrip(" ")
            new.write(newline)

