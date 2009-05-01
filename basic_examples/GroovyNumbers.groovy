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
 */

//It is very natural to do high precision calculations in Groovy because
//in Groovy numbers can be directly represented with BigDecimal and BigInteger
//and we can use regular arithmatic operators with them

//Numbers in Groovy are first class objects and not primitives 
def i = 5
println '5 is of type ' + i.getClass().getName()

def bd = 5.4
println """${bd.toString()} is of type """ + bd.getClass().getName()

//It is possible to explicitly create different types
def l = 8999999999999999999L
println """${l.toString()}L is of type """ + l.getClass().getName()

def f = 1.2F
println """${f.toString()}F is of type """ + f.getClass().getName()

def d = 1.2D
println """${d.toString()}D is of type """ + d.getClass().getName()

def g = 3G
println """${g.toString()}G is of type """ + g.getClass().getName()

def g1 = 3.5G
println """${g1.toString()}G is of type """ + g1.getClass().getName()

//Type conversions can happen in a arithmatic operation
//Usually the result is what you expect
println 'Adding Integers results in a ' + (3+3).class.getName()
def bigInt = Integer.MAX_VALUE + Integer.MAX_VALUE
println """ ${Integer.MAX_VALUE.toString()} + ${Integer.MAX_VALUE.toString()} = """ + bigInt
println 'Adding large integers reulsts in a ' + bigInt.getClass().getName() + " which goes against Groovy's notion of automatic sensible type conversio which goes against Groovy's notion of automatic sensible type conversion"
println 'Subtraction of Integers results in a ' + (5-8).class.getName()
println 'Subtraction involving an Integer and a float results in a ' + (4.3-3).class.getName()
println '4/3 = ' + (4/3)
println 'Division of an Integer with an Integer results in an ' + (4/3).class.getName()
println 'Integer division can be forced with the intdiv() method. So 4.initdiv(3) is of type ' + 4.intdiv(3).class.getName()

//Numbers can also be used for iteration because they have a times() method
5.times {
  print 'Hello '
}
