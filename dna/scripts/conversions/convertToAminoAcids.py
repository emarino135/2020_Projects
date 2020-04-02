
def getAminoAcid(RNA):
    return{
        "UUU": "Phe",
        "UUC": "Phe",
        "UUA": "Leu",
        "UUG": "Leu",

        "UCU": "Ser",
        "UCC": "Ser",
        "UCA": "Ser",
        "UCG": "Ser",

        "UAU": "Tyr",
        "UAC": "Tyr",
        "UAA": "STOP",
        "UAG": "STOP",

        "UGU": "Cys",
        "UGC": "Cys",
        "UGA": "STOP",
        "UGG": "Trp",

        
        "CUU": "Leu",
        "CUC": "Leu",
        "CUA": "Leu",
        "CUG": "Leu",

        "CCU": "Pro",
        "CCC": "Pro",
        "CCA": "Pro",
        "CCG": "Pro",

        "CAU": "His",
        "CAC": "his",
        "CAA": "Gln",
        "CAG": "Gln",

        "CGU": "Arg",
        "CGC": "Arg",
        "CGA": "Arg",
        "CGG": "Arg",


        "AUU": "Ile",
        "AUC": "Ile",
        "AUA": "Ile",
        "AUG": "Met",

        "ACU": "Thr",
        "ACC": "Thr",
        "ACA": "Thr",
        "ACG": "Thr",

        "AAU": "Asn",
        "AAC": "Asn",
        "AAA": "Lys",
        "AAG": "Lys",

        "AGU": "Ser",
        "AGC": "Ser",
        "AGA": "Arg",
        "AGG": "Arg",


        "GUU": "Val",
        "GUC": "Val",
        "GUA": "Val",
        "GUG": "Val",

        "GCU": "Ala",
        "GCC": "Ala",
        "GCA": "Ala",
        "GCG": "Ala",

        "GAU": "Asp",
        "GAC": "Asp",
        "GAA": "Glu",
        "GAG": "Glu",

        "GGU": "Gly",
        "GGC": "Gly",
        "GGA": "Gly",
        "GGG": "Gly",

        "Default": "Error"
    }.get(RNA, "Default")



virusName = input("What's the virus name you want the amino acids list for?\n")
with open("dna/Virus/"+virusName+"/mRNA_3Sequence","r",encoding="utf-8-sig") as readFile:
    mylist = readFile.read().splitlines() 
    with open("dna/Virus/"+virusName+"/AminoAcidList","w") as writeFile:
        for x in mylist:
            rna = x
            writeFile.write(getAminoAcid(rna.upper())+"\n")
