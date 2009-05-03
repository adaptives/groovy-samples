/**(BSD Style License)
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
 * This file explains how to use Groovy Ranges. 
 * A Range is something that has a left border and a right border. It is 
 * used for iteration logic and for classification. Any object which implements
 * Comparable and has the next and the previous method can be used as a range.
 */

//A simple Groovy Range
def inclusiveRange = 1..10
println 'The size of the inclusive range is: ' + inclusiveRange.size()

//This range does not include the right border element
def exclusiveRange = 1..<10

//We cannot exclude the left border element. This will give a compile error
//def doubleExclusiveRange = 1<..10

//Ranges can be from negative to positive
def negativePositiveRange = -5..5

//Ranges can also be purely negative
def negativeRange = -1..-10

def out = new StringBuffer()
inclusiveRange.each {
  out << it + ','
}
println """inclusiveRange: ${out.toString()}"""

//Notice how we can iterate without a for loop
out = new StringBuffer()
exclusiveRange.each {
  out << it + ','
}
println """exclusiveRange: ${out.toString()}"""

//But we can also use a for loop if we want to
out = new StringBuffer()
for(i in negativeRange) {
  out << i + ','
}
println """negativeRange: ${out.toString()}"""

//We can use Ranges to create sublists
def list = [0,1,2,3,4,5,6,7,8,9]
println """Sublist of first 4 elements of the list: ${list[0..3]}"""
println """Sublist of last 2 elements of the list: ${list[-1..-2]}"""

//We can also grep a Range by using another range as as the match
println """Get all elements in negativePositiveRange in the Range -5..-3: ${negativeRange.grep(-5..-3)}"""

//The call to grep can also contain an expression, such that all the elements which cause true evaluations of the expressions are included in the result

println """Trying to match all positive values in negativePositiveRange: ${negativePositiveRange.grep{it > 0}}"""

