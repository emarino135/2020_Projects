
def count(aminoAcid):
    return{
        "UUU": "Phe+=1",
        "UUC": "Phe+=1",
        "UUA": "Leu+=1",
        "UUG": "Leu+=1",

        "UCU": "Ser+=1",
        "UCC": "Ser+=1",
        "UCA": "Ser+=1",
        "UCG": "Ser+=1",

        "UAU": "Tyr+=1",
        "UAC": "Tyr+=1",
        "UAA": "Stop+=1",
        "UAG": "Stop+=1",

        "UGU": "Cys+=1",
        "UGC": "Cys+=1",
        "UGA": "Stop+=1",
        "UGG": "Trp+=1",
       
        
        "CUU": "Leu+=1",
        "CUC": "Leu+=1",
        "CUA": "Leu+=1",
        "CUG": "Leu+=1",

        "CCU": "Pro+=1",
        "CCC": "Pro+=1",
        "CCA": "Pro+=1",
        "CCG": "Pro+=1",

        "CAU": "His+=1",
        "CAC": "His+=1",
        "CAA": "Gln+=1",
        "CAG": "Gln+=1",

        "CGU": "Arg+=1",
        "CGC": "Arg+=1",
        "CGA": "Arg+=1",
        "CGG": "Arg+=1",
       
        
        "AUU": "Ile+=1",
        "AUC": "Ile+=1",
        "AUA": "Ile+=1",
        "AUG": "Met+=1",

        "ACU": "Thr+=1",
        "ACC": "Thr+=1",
        "ACA": "Thr+=1",
        "ACG": "Thr+=1",

        "AAU": "Asn+=1",
        "AAC": "Asn+=1",
        "AAA": "Lys+=1",
        "AAG": "Lys+=1",

        "AGU": "Ser+=1",
        "AGC": "Ser+=1",
        "AGA": "Arg+=1",
        "AGG": "Arg+=1",
       
        
        "GUU": "Val+=1",
        "GUC": "Val+=1",
        "GUA": "Val+=1",
        "GUG": "Val+=1",

        "GCU": "Ala+=1",
        "GCC": "Ala+=1",
        "GCA": "Ala+=1",
        "GCG": "Ala+=1",

        "GAU": "Asp+=1",
        "GAC": "Asp+=1",
        "GAA": "Glu+=1",
        "GAG": "Glu+=1",

        "GGU": "Gly+=1",
        "GGC": "Gly+=1",
        "GGA": "Gly+=1",
        "GGG": "Gly+=1", 

        "Default": "Default+=1"#Catch any exception
    }.get(aminoAcid,"Default")

Phe, Leu, Ser, Tyr, Stop, Cys, Trp,\
Pro, His, Gln, Arg, Ile, Met, Thr,\
Asn, Lys, Val, Ala, Asp, Glu, Gly,Default = (0,)*22
default = 0
#get list
virusName = input("What virus do you need want amino acid count for?\n")
aminoFile = open("dna/Virus/"+virusName+"/mRNA_3Sequence","r")
aminoAcidList = aminoFile.read().splitlines() #Get every amino acid into an item on list
for aminoAcid in aminoAcidList:
    exec(count(aminoAcid.upper()),globals())
total = Phe + Leu + Ser + Tyr + Stop + Cys + Trp + Pro + His + Gln + Arg + Ile + Met + Thr + Asn + Lys + Val + Ala + Asp + Glu + Gly

#feedback
print("There are a total of "+str(total)+" Amino Acids and codons")
print("There are " + str(Phe) + " Phenylalanine Amino Acids which make up : %" + str(int(Phe*100000/total)/1000))
print("There are " + str(Leu) + " Leucine Acids which make up : %" + str(int(Leu*100000/total)/1000))
print("There are " + str(Ser) + " Serine Acids which make up : %" + str(int(Ser*100000/total)/1000))
print("There are " + str(Tyr) + " Tyrosine Acids which make up : %" + str(int(Tyr*100000/total)/1000))
print("There are " + str(Stop) + " Stop Codons which make up : %" + str(int(Stop*100000/total)/1000))
print("There are " + str(Cys) + " Cysteine Amino Acids which make up : %" + str(int(Cys*100000/total)/1000))
print("There are " + str(Trp) + " Tryptopha Amino Acids which make up : %" + str(int(Trp*100000/total)/1000))
print("There are " + str(Pro) + " Proline Amino Acids which make up : %" + str(int(Pro*100000/total)/1000))
print("There are " + str(His) + " Histidine Amino Acids which make up : %" + str(int(His*100000/total)/1000))
print("There are " + str(Gln) + " Glutamine Amino Acids which make up : %" + str(int(Gln*100000/total)/1000))
print("There are " + str(Arg) + " Arginine Amino Acids which make up : %" + str(int(Arg*100000/total)/1000))
print("There are " + str(Ile) + " Isoleucine Amino Acids which make up : %" + str(int(Ile*100000/total)/1000))
print("There are " + str(Met) + " Methoinine Amino Acids which make up : %" + str(int(Met*100000/total)/1000))
print("There are " + str(Thr) + " Threonine Amino Acids which make up : %" + str(int(Thr*100000/total)/1000))
print("There are " + str(Asn) + " Asparagine Amino Acids which make up : %" + str(int(Asn*100000/total)/1000))
print("There are " + str(Lys) + " Lysine Amino Acids which make up : %" + str(int(Lys*100000/total)/1000))
print("There are " + str(Val) + " Valine Amino Acids which make up : %" + str(int(Val*100000/total)/1000))
print("There are " + str(Ala) + " Alanine Amino Acids which make up : %" + str(int(Ala*100000/total)/1000))
print("There are " + str(Asp) + " Aspartic Amino Acids which make up : %" + str(int(Asp*100000/total)/1000))
print("There are " + str(Glu) + " Glutamic Amino Acids which make up : %" + str(int(Glu*100000/total)/1000))
print("There are " + str(Gly) + " Glycine Amino Acids which make up : %" + str(int(Gly*100000/total)/1000))
if Default > 1:#we can skip only up to two necleotides(one group less than 3)
    print("There is more than three nucleotides that weren't counted for. Please review data for corruption")

