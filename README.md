# javabook
Data Analytics Using Java


# Building the Project:

#### Prerequisits: 
  * Apache Maven 3.x <br>
  * Java 8 <br>
  * Git (Optional)<br>

#### Steps 
  <p>Clone the Project to directory whose path doesn't contain blank spaces.</p>
1. clone the javabook repository on your machine.<br/>
     ``git clone https://github.com/uMklami/javabook.git``<br/>
2. OR, Download from the following link. <br/>
   ``https://github.com/uMklami/javabook``
   </br>
   
  * Go to Project root directory (Directory containing src, pom.xml) <br>
  * To add dependencies run the following commands in project root directory using command line.</br>
     `mvn install:install-file -Dfile=src/lib/weka.jar -DgroupId=weka-toolkit -DartifactId=weka -Dversion=4.0 -Dpackaging=jar`</br></br>
      `mvn install:install-file -Dfile=src/lib/gephi-cw.jar -DgroupId=ajt-toolkit -DartifactId=ajt -Dversion=2.11 -Dpackaging=jar`</br></br>
     
# Importing to Eclipse
1. Open Eclipse
2. Click File > Import
3. Type Maven in the search box under Select an import source:
4. Select Existing Maven Projects
5. Click Next
6. Click Browse and select the folder that is the project root directory (probably contains the pom.xml file)
7. Click Next
8. Click Finish
