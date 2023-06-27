# Swim Simulator

The Swim Simulator is a course project aimed at learning. It simulates a swimmer in a pool.

## Example Output

```
****>+o**
012345678
    ^
    
*****>+o*
012345678
     ^
     
******>+o
012345678
      ^
    
******o+<
012345678
      ^
      
*****o+<*
012345678
     ^
```

## Features

- The swimmer moves within the pool with a customizable path length.
- The pool size can be customized during initialization.
- The swimmer changes direction when reaching the pool boundaries.
- The simulation displays the state of the pool after each movement of the swimmer.

## Prerequisites

Before running the Swim Simulator, make sure you have the following installed on your machine:

- Java Development Kit (JDK) version 8 or higher

## Installation

1. Clone this code repository to your machine:
    ```shell
    git clone https://github.com/dandan-eg/swimmer-exercice.git
    ```
2. Navigate to the project directory:
    ```shell
    cd swimmer-exercice
    ```
## Usage

1. Customize the swimmer's path and the pool size:


   - Open the `Main.java` file in a text editor.
   - Locate the line `Swimmer s = new Swimmer(1);` and modify the number in parentheses to specify the desired swimmer's path length.
   - Similarly, locate the line `Pool p = new Pool(s, 12);` and modify the number in parentheses to set the desired pool size.

       ```java
       public static void main(String[] args) {
           Swimmer s = new Swimmer(1); // Customize the swimmer's path length here
           Pool p = new Pool(s, 12); // Customize the pool size here

           for (int i = 0; i < 50; i++) {
               System.out.println(p.toString()); 
               s.swim();
           }
       }
       ```
  
2. Compile the source code :
    ```shell
   javac Main.java
    ```
   
3. Run the program : 
    ```shell
    java Main
    ```
## Conclusion

In conclusion, the Swim Simulator is a simple course project aimed at learning. Despite its simplicity, an effort has been made to encapsulate the logic into separate classes, resulting in a well-structured code. By simulating a swimmer in a pool and providing visual representation, this project serves as a practical exercise in applying coding principles and best practices. Feel free to explore and customize the code according to your needs. If you have any further questions or suggestions, please don't hesitate to reach out!