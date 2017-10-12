# Reflection by Till

This lab was simple and I have plans to replace my static generators with
string lengths so that the program will be able to work with strings of any
given length. The problem that I ran into was deleting a letter from the
string. Where being able to use the replace method with the string to replace a
character with nothing would have been ideal, I ended up deleting it through
seperation into substrings. The idea behind this is that substrings are not
inclusive of their end index, which made this an easy solution.

Using string length in my next iteration of the program will be easily
replacable, and result in the program likely containing no static int values. I
could also use the scanner method with a prompt, which I find more fun to test
a program with than from a static input file.
