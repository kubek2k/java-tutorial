## Printing out things (package print)

### Printing class

Make `main()` print s1 on stdout and s2 to stderr

### Printing2 class

Without modifying `main()` method make program print out "abcd" on stdout.

## Equality tests (package equality)

## Object equality

Task: Fix the `equals()` method to let the `main()` pass

## Integer equality

Task: Change two assertion conditions to let `main()` pass

## String equality

Task: Change three assertion conditions to let `main()` pass

## Maven (directory emptyproject)

 * Fulfill directory `/emptyproject` with proper pom.xml that should contain:
   * groupId
   * projectId
   * version
   * dependency to the latest slf4j-api

 * Create proper directory structure for java source files and test files.
 * Create a class with `main()` method that prints out its own class name (hint: look at `Object` documentation) to stdout.
 * Verify that project builds with `mvn package`
 * Verify that class works by invoking `.class` file directly from `/target` subdirectory

 ### Evil hashing (EXTRA) (hashing package)

 1. Make the code run successfully (so that it finds Evil with x == 0)
 2. Note down the time needed to find the Evil
 3. Read carefully the documentation of java.util.HashSet, and think how you can improve the performance of used Set
 4. Compare the time needed to invoke the code