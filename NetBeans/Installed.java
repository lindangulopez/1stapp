/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test_project;

/**
 *
 * @author lindangulopez
 */
public class test {
    
        public static void main(String[] args) {
        System.out.println("Testing NetBeans"); // Display the string.
    }
}

/*

cd /home/lindangulopez/NetBeansProjects/test_project; JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64 /snap/netbeans/35/netbeans/java/maven/bin/mvn "-Dexec.args=-classpath %classpath com.mycompany.test_project.test" -Dexec.executable=/usr/lib/jvm/java-11-openjdk-amd64/bin/java org.codehaus.mojo:exec-maven-plugin:1.5.0:exec
Running NetBeans Compile On Save execution. Phase execution is skipped and output directories of dependency projects (with Compile on Save turned on) will be used instead of their jar artifacts.
Scanning for projects...

---------------------< com.mycompany:test_project >---------------------
Building test_project 1.0-SNAPSHOT
--------------------------------[ jar ]---------------------------------

--- exec-maven-plugin:1.5.0:exec (default-cli) @ test_project ---
Testing NetBeans
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  0.816 s
Finished at: 2020-12-02T10:12:58+01:00
------------------------------------------------------------------------


*/
