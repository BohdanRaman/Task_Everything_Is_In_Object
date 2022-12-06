package task_16; /**
 * In the Initialization & Cleanup chapter, locate the Overloading.java
 * example and add Javadoc documentation. Extract this comment documentation into an
 * HTML file using Javadoc and view it with your Web browser.
 * <p>
 * Class Tree with parameters "height" for creating tall
 *
 * @author Raman Bohdan
 * @version 1.0
 * @since 26.09.2022
 */

import static java.sql.DriverManager.println;

public class JavadocDocumentationClass {
    static class Tree {
        int height;  // field height

        Tree() {
            println("Planting a seedling");
            height = 0;
        }

        /** tree height creating function
         *@param initialHeight */
        Tree(int initialHeight) {
            height = initialHeight;
            println("Creating new Tree that is " +
                    height + " feet tall");
        }

        /* tree height information function about tree */
        void info() {
            println("Tree is " + height + " feet tall");
        }

        /** tree height description function
         *@param s  */
        void info(String s) {
            println(s + ": Tree is " + height + " feet tall");
        }

        public class Overloading {
            /** Entry point to class & application.
             * @param args array of string arguments
             * This class description new tree and information.
             */
            public static void main(String[] args) {
                for (int i = 0; i < 5; i++) {
                    Tree t = new Tree(i);
                    t.info();
                    t.info("overloaded method");
                }
                // Overloaded constructor:
                new Tree();
            }
        }
    }
}

