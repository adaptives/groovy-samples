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
 * This examples explains how to use Java Beans in Groovy
 */

//An instance variable in Groovy without an access modifier is considered to be
//a private property. Getters/Setters for that property are injected in the 
//bytecode automatically
class Customer implements java.io.Serializable {
  String firstName //will be a private attribute in the bytecode
  String lastName //will be a private attribute
  def middleInitial //beans can even contain dynamic properties

  //even though getters/setters are automatically inserted, we can create our
  //own to override the default ones
  public String getFirstName() {
    println('method getFirstName() called')
    return firstName
  }

  public String toString() {
    return this.@firstName + ' ' + this.@middleInitial + ' ' + this.@lastName
  }
}

def customer = new Customer()
//Even though this looks like we are accessing public fields
//the bytecode actually invokes the setter methods of these properties
customer.firstName = "John"
customer.lastName = "Gardner"
customer.middleInitial = "U"

def customer1 = new Customer(firstName: "Bob", lastName: "Steele", middleInitial: "z")

//Here even though it seems like we are accessing a field, actually it's getter
//method is called
println "Customers' firstName is ${customer.firstName}"
println "Customers' lastName is ${customer.lastName}"
println "Full customer details: " + customer
//Construction and initialization. Under the hoods a Person object
//is created and it's setters are invoked for the specified properties
def anotherCustomer = new Customer(firstName: "John", lastName:"Doe")
