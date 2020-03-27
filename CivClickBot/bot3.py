from selenium import webdriver
from datetime import datetime
import time


def startGame(saveFile): #Instruction for starting game and loading save file
    
    
    browser.get("https://edwin-marino.com/single/blogs/blog2/civclicker/civclicker.html") #Goes to webpage
    popup = browser.switch_to.alert #Handles Pop up questions and sets local variable
    popup.send_keys("The Robot Civilization")
    popup.accept()
    popup.send_keys("CivClickBot3000")
    popup.accept()
    if saveFile != "": #Loads save file if they added any
        print("Bot is now loading your save file")#feedback to user (Takes a little bit)
        browser.find_element_by_css_selector("#stripInner > a:nth-child(3)").click()#open menu
        browser.find_element_by_css_selector("#impexpField").send_keys(saveFile)#load file
        browser.find_element_by_css_selector("#impButton").click()#click import
        browser.find_element_by_css_selector("#impexpClose").click()#close menu



class Bot: #Instruction only relating to bot actions for the bot to perform (including counting)
    #Local class attributes
    lastTimeSaved = int(datetime.now().strftime("%M")) #Reads the current minute hand on clock as integers 00-59
    saveInterval = 1 #change save interval from here #counted in minutes
    currentMenu = ""
    nextUpgrade = "Skinning"
    #UPGRADES
    def gotNextUpgrade(self): #return true if an ugrades
        
        if (self.nextUpgrade == "Skinning") and (skins > 10):
            try:
                self.openUpgradesMenu()
                browser.find_element_by_css_selector("#skinning").click()
                self.nextUpgrade = "Harvesting"
                return True
            except:
                self.nextUpgrade = "Harvesting"
                return False
        elif (self.nextUpgrade == "Harvesting") and (herbs > 10):
            try:
                self.openUpgradesMenu()
                browser.find_element_by_css_selector("#harvesting").click()
                self.nextUpgrade = "Prospecting"
                return True
            except:
                self.nextUpgrade = "Prospecting"
                return False
        elif (self.nextUpgrade == "Prospecting") and (ore > 10):
            try:
                self.openUpgradesMenu()
                browser.find_element_by_css_selector("#prospecting").click()
                self.nextUpgrade = "Masonry"
                return True
            except:
                self.nextUpgrade = "Masonry"
                return False
        elif (self.nextUpgrade == "Masonry") and ((wood > 100) and (stone > 100)):
            try:
                self.openUpgradesMenu()
                browser.find_element_by_css_selector("#masonry").click()
                self.nextUpgrade = "Domestication"
                return True
            except:
                self.nextUpgrade = "Domestication"
                return False
        elif (self.nextUpgrade == "Domestication") and (leather > 20):
            try:
                self.openUpgradesMenu()
                browser.find_element_by_css_selector("#domestication").click()
                self.nextUpgrade = "Ploughshares"
                return True
            except:
                self.nextUpgrade = "Ploughshores"
                return False
        elif (self.nextUpgrade == "Ploughshares") and (metal > 20):
            try:
                self.openUpgradesMenu()
                browser.find_element_by_css_selector("#ploughshares").click()
                self.nextUpgrade = "Irrigation"
                return True
            except:
                self.nextUpgrade = "Irrigation"
                return False
        elif (self.nextUpgrade == "Irrigation") and ((wood > 500) and (stone > 200)):
            try:
                self.openUpgradesMenu()
                browser.find_element_by_css_selector("#irrigation").click()
                self.nextUpgrade = "Construction"
                return True
            except:
                self.nextUpgrade = "Construction"
                return False
        elif (self.nextUpgrade == "Construction") and ((wood > 1000) and (stone > 1000)):
            try:
                self.openUpgradesMenu()
                browser.find_element_by_css_selector("#construction").click()
                self.nextUpgrade = "Granaries"
                return True
            except:
                self.nextUpgrade = "Granaries"
                return False
        elif (self.nextUpgrade == "Granaries") and ((wood > 1000) and (stone > 1000)):
            try:
                self.openUpgradesMenu()
                browser.find_element_by_css_selector("#granaries").click()
                self.nextUpgrade = "Basic Weaponry"
                return True
            except:
                self.nextUpgrade = "Basic Weaponry"
                return False
        elif (self.nextUpgrade == "Basic Weaponry") and ((wood > 500) and (metal > 500)):
            try:
                self.openUpgradesMenu()
                browser.find_element_by_css_selector("#weaponry").click()
                self.nextUpgrade = "Basic Sheilds"
                return True
            except:
                self.nextUpgrade = "Basic SHeilds"
                return False
        elif (self.nextUpgrade == "Basic Sheilds") and ((wood > 500) and (leather > 500)):
            try:
                self.openUpgradesMenu()
                browser.find_element_by_css_selector("#sheilds").click()
                self.nextUpgrade = "Horseback Riding"
                return True
            except:
                self.nextUpgrade = "Horseback Riding"
                return False
        elif (self.nextUpgrade == "Horseback Riding") and ((food > 500) and (wood > 500)):
            try:
                self.openUpgradesMenu()
                browser.find_element_by_css_selector("#horseback").click()
                self.nextUpgrade = "The Wheel"
                return True
            except:
                self.nextUpgrade = "The Wheel"
                return False
        elif (self.nextUpgrade == "The Wheel") and ((food > 500) and (wood > 500)):
            try:
                self.openUpgradesMenu()
                browser.find_element_by_css_selector("#wheel").click()
                self.nextUpgrade = "Writing"
                return True
            except:
                self.nextUpgrade = "Writing"
                return False
        elif (self.nextUpgrade == "Writing") and (skins > 500):
            try:
                self.openUpgradesMenu()
                browser.find_element_by_css_selector("#writing").click()
                self.nextUpgrade = "none"
                return True
            except:
                self.nextUpGrade = "NotListeD^^^"
                return False
        else:
            return False
    #COUNTING DATA
    def countAllData(self): #Always use after action to limit resource differences (BUGS)
        self.countMaxResources()
        self.countBasicResources()
        self.countBasicResourcesRate()
        self.countWorkers()
        self.countSpecialResources()
    
    def countBasicResourcesRate(self): #Calculates Increments in Resource values over time
        global foodRate, woodRate, stoneRate
        foodRate = float(browser.find_element_by_css_selector("#netFood").text)
        woodRate = float(browser.find_element_by_css_selector("#netWood").text)
        stoneRate = float(browser.find_element_by_css_selector("#netStone").text)
    def countMaxResources(self):
        global maxFood, maxWood, maxStone
        maxFood = int((browser.find_element_by_css_selector("#maxfood").text).replace("\u202f",""))#Replace stupid unicode
        maxWood = int((browser.find_element_by_css_selector("#maxwood").text).replace("\u202f",""))
        maxStone = int((browser.find_element_by_css_selector("#maxstone").text).replace("\u202f",""))
    def countSpecialResources(self):
        global skins, herbs, ore, leather, piety, metal
        skins = int((browser.find_element_by_css_selector("#skins").text).replace("\u202f",""))
        herbs = int((browser.find_element_by_css_selector("#herbs").text).replace("\u202f",""))
        ore = int((browser.find_element_by_css_selector("#ore").text).replace("\u202f",""))
        leather = int((browser.find_element_by_css_selector("#leather").text).replace("\u202f",""))
        piety = int((browser.find_element_by_css_selector("#piety").text).replace("\u202f",""))
        metal = int((browser.find_element_by_css_selector("#metal").text).replace("\u202f",""))
    
    def countBasicResources(self):  #count the amount of current basic resources (food,wood and stone)
        global food, wood, stone
        food = int(browser.find_element_by_css_selector("#food").text.replace("\u202f",""))
        wood = int(browser.find_element_by_css_selector("#wood").text.replace("\u202f",""))
        stone = int(browser.find_element_by_css_selector("#stone").text.replace("\u202f",""))
    def countWorkers(self):
        global unemployed, maxPop, curPop, workerCost
        maxPop = int(browser.find_element_by_css_selector("#popcap").text)
        curPop = int(browser.find_element_by_css_selector("#popcurrent").text)
        unemployed = int(browser.find_element_by_css_selector("#unemployed").text)
        workerCost = int(browser.find_element_by_css_selector("#workerCost").text)
    #Feedback
    def printStats(self): #Value Checker #Delete Later
        print("Food: " + str(food) \
            + ", Wood: " + str(wood) \
            + ", Stone: " + str(stone) \
            + ", maxFood: "+ str(maxFood))

    #Gather Basic Resoures
    def collectFood(self):
        browser.find_element_by_css_selector("#basicResources > tbody > tr:nth-child(1) > td:nth-child(1) > button").click() #Gather Food
     
    def collectWood(self):
        browser.find_element_by_css_selector("#basicResources > tbody > tr:nth-child(2) > td:nth-child(1) > button").click() #Cut Wood
    
    def collectStone(self):
        browser.find_element_by_css_selector("#basicResources > tbody > tr:nth-child(3) > td:nth-child(1) > button").click() #Cut Stone
    #MENUS
    def openUpgradesMenu(self):
        if self.currentMenu != "UpgradesMenu":
            self.currentMenu = "UpgradesMenu"
            browser.find_element_by_css_selector("#selectUpgrades").click()
       
    def openBuildingsMenu(self):
        if self.currentMenu != "BuildingsMenu":
            self.currentMenu = "BuildingsMenu"
        browser.find_element_by_css_selector("#selectBuildings").click()

    #WORKERS
    def createWorker(self):
        browser.find_element_by_css_selector("#spawn1").click() #Clicks on Create Worker
       
    
    def employFarmers(self):
        browser.find_element_by_css_selector("#farmergroup > td:nth-child(8) > button").click()
    
    def employWoodcutters(self):
        browser.find_element_by_css_selector("#woodcuttergroup > td:nth-child(8) > button").click()
    
    def employMiners(self):
        browser.find_element_by_css_selector("#minergroup > td:nth-child(8) > button").click()


    #BUILDINGS
    def houseingBuilt(self):
            while True:
                self.countBasicResources()
                self.countWorkers()
                x = None
                try:#cottage
                    if(wood > 10) and (stone>30):
                        self.openBuildingsMenu()
                        browser.find_element_by_css_selector("#cottageRow > td:nth-child(1) > button").click()
                        x = True
                    else:
                        if x == True: return True
                        else: return False

                except:
                    #wooden hut
                    if(stone > 20) and (skins > 1):
                        self.openBuildingsMenu()
                        browser.find_element_by_css_selector("#whutRow > td:nth-child(1) > button").click()
                        x = True
                    else:
                        if x == True: return True
                        else: return False

    def buildBarn(self): 
        self.openBuildingsMenu()
        browser.find_element_by_css_selector("#barnRow > td:nth-child(1) > button").click()
      

    def buildWoodStockpile(self):
        self.openBuildingsMenu()
        browser.find_element_by_css_selector("#woodstockRow > td:nth-child(1) > button").click()
           

    def buildStoneStockpile(self):
        self.openBuildingsMenu()
        browser.find_element_by_css_selector("#stonestockRow > td:nth-child(1) > button").click()
           

        
    #SAVE GAME
    def saveGame(self):
        global saveFile
        #lastTimeSaved class variable
        #currentTime function local variable
        currentTime = int(datetime.now().strftime("%M")) #Current minute hand in integers
        
        if currentTime > self.lastTimeSaved: #35 > 30
            if currentTime >= (self.lastTimeSaved + self.saveInterval): #Saves game in intervals of 2 minutes
                browser.find_element_by_css_selector("#stripInner > a:nth-child(3)").click()#click on import/export
                browser.find_element_by_css_selector("#expButton").click()#click's on export button to get save content
                saveFile = str(browser.find_element_by_css_selector("#impexpField").get_attribute("value"))#Saves save text content to save file
                browser.find_element_by_css_selector("#impexpClose").click()#closes content
                print("Game Saved")
                self.lastTimeSaved = currentTime
        elif currentTime < self.lastTimeSaved: #10 < 50
            if currentTime >= (self.lastTimeSaved - 60 + self.saveInterval): #Means 20 minutes has passed since last save(ITS TIME TO SAVE) (Saves every 2 minutes)
                browser.find_element_by_css_selector("#stripInner > a:nth-child(3)").click()#click on import/export
                browser.find_element_by_css_selector("#expButton").click()#click's on export button to get save content
                saveFile = str(browser.find_element_by_css_selector("#impexpField").get_attribute("value"))#Saves save text content to save file
                browser.find_element_by_css_selector("#impexpClose").click()#closes content
                print("Game Saved")
                self.lastTimeSaved = currentTime

#GLOBAL VARIABLES
saveFile = input("""
    Thank you for choosing Cyberocracy as your new form of Government

    Paste any save content in the command line to continue
    from a previous civilization and hit (ENTER)
    
    Tips: 
        -You can click export on the top of the webpage 
        to save your own civilization's progress to your 
        clipboard to use with the bot
        
        -Don't worry about saving the bot's progress. 
        It auto saves and returns the save to the terminal
        when it is terminated.
        
        -Copy the save to your clipboard and store 
        it in a text file so you don't lose it!

    Press (ENTER) to accept the AI as your new overlords  
    """) #Feedback. Before bot and game starts. In this order the user
        #Ends up clicking around windows less and it makes the program feel more responsive
        #This file is overwritten with new save progress and given back to the user when to bot ends if it crashes(FAIL-SAFE MEASURE)
#Basic RESOURCES
food = 0
wood = 0
stone = 0
maxFood = 0
maxWood = 0
maxStone = 0
foodRate = 0
woodRate = 0
stoneRate = 0
#Special Resources
skins = 0
herbs = 0
ore = 0
leather = 0
piety = 0
metal = 0
#population
maxPop = 0
curPop = 0
#workers
unemployed = 0
workerCost = 0
#Initialzes game and bot
print("Created by Edwin Marino")
print("edwin-marino.com\n")
print("Bot is now loading...")#Starting chrome is a bit slow so I want to reasure the user with feedback

browser = webdriver.Chrome() #Starts browser #Needs to stay global 
startGame(saveFile) #Starts game
bot = Bot() #Starts bot

#GAME NOW RUNNING
print("Commencing World Domination")
bot.countAllData()


#TWEAK CONSTANTS FOR PERFORMANCE AND GAMEPLAY OPIMIZATION
resourceClick = 20 #[1-infitity)
woodPercent = 0.05 #(0-100]
stonePercent = 0.05 #(0-100]
try:     
    
    while True:
       
       
        #Collect Data
        bot.countAllData() #VERY RESOURCE HEAVY
        bot.saveGame()

        #Should Only perform one action per iteration
        #Prioritzed List
        #Storage Upgrades
        if bot.gotNextUpgrade():
            pass
        elif food == maxFood:
            bot.buildBarn()
        elif wood == maxWood:
            bot.buildWoodStockpile()  
        elif stone == maxStone:
            bot.buildStoneStockpile()
        
        #Hiring Workers
       
      
        elif(maxPop>curPop):#This will mostly run in earlier stages
                for x in range(maxPop - curPop):
                    bot.createWorker()
                    bot.employFarmers()
        #Housing
        elif (bot.houseingBuilt()):
            bot.countWorkers()
            for x in range(maxPop - curPop):
                bot.createWorker()
                #It costs nothing to hire a worker except for soldiers
                if (woodRate < (foodRate*woodPercent)):
                    bot.employWoodcutters()
                elif stoneRate < (foodRate*stonePercent):
                    bot.employMiners()
                else:
                    bot.employFarmers()
        
        
            #Collecting RESOURCES
        for x in range(resourceClick): #Can be performd multiple times per iteration #Less click resourceful though
            if (foodRate <= 100):
                bot.collectFood()
            if (woodRate <= 100):
                bot.collectWood()
            if (stoneRate <= 100):
                bot.collectStone()
        
        #Final  
        

finally:
    if(saveFile != ""):
        print("COPY FROM HERE:\n")
        print(saveFile + "\n")
        print("^^^^^^^^^^^^COPY THIS^^^^^^^^^^^^")
        print("BOT: Oops something happened while I was playing")
        print("BOT: It's a good thing I hung on to this for you")
        