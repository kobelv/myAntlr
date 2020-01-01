input a
input b

if a<b then goto swap;

start:
c = a%b
if c = 0 then goto finish;
print a
print b
print c
a = b
b = c
print "---"

goto start;


swap:
c = a
a = b
b = c
goto start; 

finish:

print b