//==~ matches the entire sring with the regex provided in the slashy string
assert "ababababab" ==~ /(ab)+/

//Note that it matches the entire String
assert !("ababa" ==~ /(ab)+/)

//The next line gives us a Pattern. The pattern operator ~ can be applied to 
//any String but the slashy String is most commonly used
def pattern = ~/([a-zA-Z])+\s+(\d)+/

//We can get a matcher from the Pattern
def matcher = pattern.matcher('hello 123')
assert matcher.matches()

//We can also get a matcher using Groovy's special syntax
matcher = "hello hello  123 testing    456" =~ /([a-zA-Z])+\s+(\d)+/

assert matcher

/*
//If the find ~= operator is used without an assignment then it returns the
//first match
println "hello 123 ___" =~ /([a-zA-Z])+\s+(\d)+/ 
*/

