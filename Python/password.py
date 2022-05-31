def findK_th(k_th, common_char, answers, current_password, column=0): #Method to find the k-th password starting at column 0 by default
	if column == 5: #when it is in the last column, 
		answers.append(current_password) #the new password found is added to the answers array
		return

	for char in common_char[column]: #Search for common characters
		if  k_th == len(answers): #It ends when the given k_th equals the length of he asnwers array
			break
		findK_th(k_th, common_char, answers, current_password + char,  column + 1) #the next column is evaluated and the character found is added to it



def getGrid():
	grid = [set(), set(), set(), set(), set()] #character set without repeating any
	for _ in range(6):	
		row = list(input()) #String is received and converted to character
		for i, column in enumerate(grid):
			column.add(row[i]) #It iterates through each column of the grid and the character found is added
	return grid



def main():
	T_test_cases, = map(int, input().split()) #number of times to call the findK function (Number of tests cases)
	for _ in range(T_test_cases):  
		k_th, = list(map(int, input().split())) #get de k-th password to find 
		firts_grid = getGrid() #First grid of letters
		second_grid = getGrid() #Second grid of letters
		common_char = [] #Array where the characters in common will be accumulated 
		for letters_firtsGrid, letters_secondGrid in zip(firts_grid, second_grid): #the characters of the two grids are joined in a single tuple
			common_char.append(sorted(list(letters_firtsGrid & letters_secondGrid))) #Characters are added in lexicographic order

		answers = []
		findK_th(k_th, common_char, answers, "")
		if k_th > len(answers): #if k is greater than all possible passwords, "no" is printed
			print("NO")
		else:
			print(answers[-1])



main()





