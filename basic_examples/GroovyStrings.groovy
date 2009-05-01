/**
 * (BSD Style License)
 *
 * Copyright (c) 2001-2008, Adaptive Software Solutions
 * 
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 * Redistributions of source code must retain the above copyright notice, this 
 * list of conditions and the following disclaimer. Redistributions in binary 
 * form must reproduce the above copyright notice, this list of conditions and 
 * the following disclaimer in the documentation and/or other materials provided 
 * with the distribution.
 * 
 * Neither the name of Adaptive Software Solutions nor the names of its 
 * contributors may be used to endorse or promote products derived from this 
 * software without specific prior written permission.

 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE 
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE 
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL 
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR 
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER 
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, 
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE 
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/**
 * @author pshah (at) adaptivesoftware (dot) biz
 * This example shows different types of Strings in Groovy and how to use them
 */
//Groovy strings can be single quoted
def str1 = 'Hello World'
println str1

//Groovy Strings can be double quoted
def str2 = "Hello World"
println str2

//Groovy Strings can also be triple quoted. These strings can contain single
//and double quotes and can be multiline
def str3 = """This is a multiline Hello World and
Namaste"""
println str3

//Groovy has special type of Strings called GStrings which are surrounded by 
//triple quotes. These strings can contain ${replacement} where $replacement 
//can be resolved to an expression. When the program is run all the replacement 
//variables in the String will be replaced with their values
def gstr1 = """ ${str2} is so outdated now"""
println gstr1
println """(2 + 2) = ${2+2}"""

//Strings can also be enclosed within // We usually use these slashy strings in
//regular expressions to avoid escaping the \ character
def slashyStr = / \n is the newline character in Groovy /
println slashyStr
/* println \ However slashy strings cannot be used directly with println \ */


//Groovy strings can be single quoted
//String comparisons can be done using the == operator. Also note in the line
//below that a double quoted string can contain single quotes
println "Is 'str1' equal to 'str2' : " + (str1 == str2)

//Groovy supports operator overloading
//Strings can be concatanted using the + operator
println "Hello " + "World"

//strings can be appended using the << operator
def appHelloWorld = "Hello " << "World"
println  "The string " + appHelloWorld + " is of type " + appHelloWorld.getClass().getName()

//Strings can be repeated with the * operator
println "Hello"*4 + " World"

//Strings can be removed using - operator
println "Hello"*4 + " World" - "Hello"

//Characters in a string can be accessed with the [] operator
println "HelloWorld"[1]

//Strings can be tokenized with the tokenize keyword. tokenize returns a list
println "one:two:three:four".tokenize()

//We can derive ranges from strings
println "HelloWorld"[0..4]
println "HelloWorld"[-5..-1] 

//Strings can be centered for printing
def paddedStr = "Hello World".center(25)
//print the padded string with single quotes at both ends to see the pads
println """'${paddedStr}'"""
