#from ...Constants_And_Methods.Names import *

# Problem Number: 1.2
# Problem Name: Check Permutation
# Description: Given two strings, write a method to decide if one is a permutation of the other.
# Link: https://www.geeksforgeeks.org/check-if-two-strings-are-permutation-of-each-other/

def method1():
    class Solution:
        def areAnagrams(self, s1, s2):
         if len(s1) != len(s2):
            return False
        return sorted(s1) == sorted(s2)

s1 = "silent"
s2 = "listen"
sol = Solution()

if sol.areAnagrams(s1, s2):
    print("They are anagrams.")
else:
    print("They are not anagrams.")
    return ""

def method2():
    return ""

def method3():
    return ""

def print_ascii_art():
    print("""   ________              __  
  / ____/ /_  ___  _____/ /__
 / /   / __ \\/ _ \\/ ___/ //_/
/ /___/ / / /  __/ /__/ ,<   
\\____/_/ /_/\\___/\\___/_/|_|  
                             
    ____                            __        __  _           
   / __ \\___  _________ ___  __  __/ /_____ _/ /_(_)___  ____ 
  / /_/ / _ \\/ ___/ __ `__ \\/ / / / __/ __ `/ __/ / __ \\/ __ \\
 / ____/  __/ /  / / / / / / /_/ / /_/ /_/ / /_/ / /_/ / / / /
/_/    \\___/_/  /_/ /_/ /_/\\__,_/\\__/\\__,_/\\__/_/\\____/_/ /_/""")

def print_question():
    print("Given two strings, write a method to decide if one is a permutation of the other.")

def print_spaces():
    print("\n" * 3)

def run_all_mehrab_siddique_solutions():
    printMehrabSiddique()
    print_ascii_art()
    print_spaces()
    print_question()
    print_spaces()
    method1()
    method2()
    method3()
