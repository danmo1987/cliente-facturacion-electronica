Taller de Facturaci�n Electr�nica para Programadores Java

Instalaci�n de librer�as que no se encuentran en repositorios maven p�blicos. Ubicarse en la carpeta lib

mvn install:install-file -DgroupId=com.paic.maven -DartifactId=tplconfig-maven-plugin -Dversion=1.0 -Dpackaging=jar -Dfile=tplconfig-maven-plugin-1.0.jar -DgeneratePom=true