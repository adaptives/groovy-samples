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

 * This file explains the basics of using Lists in Groovy
 */

//There is direct syntactic support for creating lists in Groovy with []
def aList = [] //is am empty list
println 'aList is of size ' + aList.size

//Did we get an ArrayList or a LinkedList?
println 'The list we just created is of type ' + aList.class.getName()

//What if I want to create a LinkedList?
def lList1 = new LinkedList()
//Along with creating a LinkedList we are also instantiating the list
def lList2 = ['bat'] as LinkedList
assert lList1.class == LinkedList.class
assert lList2.class == LinkedList.class

//Let's push the limits of the 'as' operator
println lList1 as String

//We can append elements to the list using the << operator
aList << 'Cat' << new Date()
println aList

//We can also use push and pop to add/remove elements from the list
aList.push('Bat')
println aList
aList.pop()
println aList

//Groovy truth with lists
println 'Groovy truth for aList is ' + (aList ? true : false)
println 'Groovy truth for lList1 is ' + (lList1 ? true : false)

//Get an element of the list using the [] operator
aList << 'Elephant' << 'Rhino'
println 'aList is ' + aList
println 'The 2nd element in aList is ' + aList[1]
println 'The 5th element in aList is ' + aList[5]
println 'The second last element in aList is ' + aList[-2]
println 'The sublist of elements 2..3 is ' + aList[1..2]
println 'The sublist of the last two elements is ' + aList[-2..-1]

//Sorting lists is a simple API call
def unsortedList = [1,3,2,6,4]
println 'unsorted list ' + unsortedList
println 'sorted list ' + unsortedList.sort()

//The sort method of list also tales a closure. We will look at that in the 
//closures example - GroovyClosures.groovy
