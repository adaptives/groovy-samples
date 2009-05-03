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
 *
 * This example shows how to create and use maps in Groovy
 */

def emptyMap = [:]

//Populating a Map
//Notice that the keys are are not enclosed within quotes. The keys will
//however be strings and the quotes will find their way into the compiled
//bytecode
def population = [Estonia:1299371,
                  Finland:5250275,
                  Honduras:7792854,
                  HongKong:7055071]

//Non string keys must be enclosed in ()
def numbers = [(Integer.valueOf("1")):"One",
               (Integer.valueOf("2")):"Two"]

//Accessing Map elements
//Maps can be accessed using bean style and
//array style notations respectively
println "Estonia population: " + population.Estonia
println "Finland population: " + population['Finland']
//Use default values in case key does not exist (if key does not exist, then
//it will be added with the default value)
println "Spain population: " + population.get("Spain", 40525002)

//We use closures to iterate across all Map entries
println "Population stats"
population.each { key, value ->
	println key + " : " + value
}

//or use the default it parameter of the closure
println "Numbers as words"
numbers.each() {
	println it.key + ":" + it.value
}

//Search within a Map. All values where the expression in the closaure evaluates
//to a true will be selected
println 'Countries with a population greater than 1 million'
result = population.findAll {key, value ->
	value > 5000000
}
println 'population > 5000000 ' + result.keySet()
