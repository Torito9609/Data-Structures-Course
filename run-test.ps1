$ErrorActionPreference = "Stop"

$jar = "lib\junit-platform-console-standalone-6.0.3.jar"

# Compilar
$files = (Get-ChildItem -Recurse src,test -Filter *.java).FullName
javac -cp $jar -d out $files

# Ejecutar
java -jar $jar execute --class-path out --scan-class-path