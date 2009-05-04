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
 * @author pshah
 * This example very briefly explains the type system in Groovy
 */

//In Groovy variables can be dynamically typed which means they can take values
//of any type in their lifetime. This is done with the def keyword
def str = "Right now I am a String but soon I will be assigned a number"
str = 8

//Variables can also be statically typed like in Java
String staticStr = new String("I am a String and will always remain one");
//The next line will result in a compile error if uncommented
staticStr = 90

println """The value of str is: ${str}"""
println """The value of staticStr is: ${staticStr}"""

def duckLikeObject = getMeADuckLikeObject()
duckLikeObject.quack()

def getMeADuckLikeObject() {
  return new Bus()
}


class Bus {
  def quack() {
    println "quack quack"
  }
}
