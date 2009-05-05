import java.awt.Color

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
 * This example explains cosures in Groovy
 */

//A closure is a function which has access to it's lexical scope when it is
//executed

def i = 10
//let's use a closure to loop 6 times. The function defined in curly braces is
//a closure and will be invoked by the each method in Integer. Even though this
//function is invoked by the 'times' method, it still has access to it's lexical scope
6.times {
  println "I have access to i even though riht now I am being invoked from the times method in class Integer: " + i
}

//Let's see some more examples of closures. In the code below we will compare
//using regular list iteration vs. using closures to find certain items in a 
//list

def toys = [new Toy("doll", Color.PINK), 
            new Toy("car", Color.BLUE), 
            new Toy("house", Color.WHITE), 
            new Toy("ball", Color.GREEN), 
            new Toy("bat", Color.BLUE), 
            new Toy("hoop", Color.YELLOW), 
            new Toy("plane", Color.WHITE)]

//Now we will find all toys which are blue in color

//Here's how we would do it with simple iteration without closures
List toysIWant = new ArrayList()
Iterator iter = toys.iterator();
  while(iter.hasNext()) {
    Toy toy = (Toy)iter.next();
    if(toy.getColor().equals(Color.BLUE)) {
      toysIWant.add(toy);
  }
}


//Her's how we would do it with closures
def toysMySisterWants = toys.grep() {
  it.getColor() == Color.PINK
}

println "Toys I want: ${toysIWant}"
println "Toys my sister wants: ${toysMySisterWants}"

class Toy {
  private Color color;
  private String name;
  Toy(String name, Color color) {
    this.name = name;
    this.color = color;
  }
  Color getColor() {
    return this.color;
  }
  public String toString() {
    return name;
  }
}

