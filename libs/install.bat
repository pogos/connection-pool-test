
rem install ojdbc7
call mvn install:install-file -DgroupId=com.oracle -DartifactId=ojdbc7 -Dversion=12.1.0.2 -Dpackaging=jar -Dfile=ojdbc7.jar -DgeneratePom=true

rem install ucp 
call mvn install:install-file -DgroupId=com.oracle -DartifactId=ucp -Dversion=12.1.0.2 -Dpackaging=jar -Dfile=ucp.jar -DgeneratePom=true
