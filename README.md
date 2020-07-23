# longestPalindromicString
- create a funciton that take random input, which return a out put as a longest Palindromic string
- can assume that only one longest palindromic string
# solution
- iterate all  string by each time add the substring is the next index of the current string
- the second index will increase while the first index of substring frozen. until and of string
- the first indext also  increase each time until end of string
- each time call the check palindromic function if the current is palindromic && longer current palindromic replace the longest and continuse

