PS C:\Users\ilyav\Desktop\Labs\Тестирование ПО\Лабораторная_работа_2> mvn clean compile
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::staticFieldBase has been called by com.google.inject.internal.aop.HiddenClassDefiner (file:/C:/Program%20Files/apache-maven/lib/guice-5.1.0-classes.jar)
WARNING: Please consider reporting this to the maintainers of class com.google.inject.internal.aop.HiddenClassDefiner
WARNING: sun.misc.Unsafe::staticFieldBase will be removed in a future release
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------------< ru.miet:calculator >-------------------------
[INFO] Building calculator 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.2.0:clean (default-clean) @ calculator ---
[INFO] Deleting C:\Users\ilyav\Desktop\Labs\Тестирование ПО\Лабораторная_работа_2\target
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ calculator ---
[INFO] skip non existing resourceDirectory C:\Users\ilyav\Desktop\Labs\Тестирование ПО\Лабораторная_работа_2\src\main\resources
[INFO]
[INFO] --- compiler:3.11.0:compile (default-compile) @ calculator ---
[INFO] Changes detected - recompiling the module! :source
[INFO] Compiling 6 source files with javac [debug release 11] to target\classes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.569 s
[INFO] Finished at: 2025-09-14T17:55:34+03:00
[INFO] ------------------------------------------------------------------------

PS C:\Users\ilyav\Desktop\Labs\Тестирование ПО\Лабораторная_работа_2> mvn test
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::staticFieldBase has been called by com.google.inject.internal.aop.HiddenClassDefiner (file:/C:/Program%20Files/apache-maven/lib/guice-5.1.0-classes.jar)
WARNING: Please consider reporting this to the maintainers of class com.google.inject.internal.aop.HiddenClassDefiner
WARNING: sun.misc.Unsafe::staticFieldBase will be removed in a future release
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------------< ru.miet:calculator >-------------------------
[INFO] Building calculator 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ calculator ---
[INFO] skip non existing resourceDirectory C:\Users\ilyav\Desktop\Labs\Тестирование ПО\Лабораторная_работа_2\src\main\resources
[INFO]
[INFO] --- compiler:3.11.0:compile (default-compile) @ calculator ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- resources:3.3.1:testResources (default-testResources) @ calculator ---
[INFO] skip non existing resourceDirectory C:\Users\ilyav\Desktop\Labs\Тестирование ПО\Лабораторная_работа_2\src\test\resources
[INFO]
[INFO] --- compiler:3.11.0:testCompile (default-testCompile) @ calculator ---
[INFO] Changes detected - recompiling the module! :source
[INFO] Compiling 1 source file with javac [debug release 11] to target\test-classes
[INFO] 
[INFO] --- surefire:3.0.0-M9:test (default-test) @ calculator ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running ru.miet.testing.CalculatorPresenterImplTest
WARNING: A Java agent has been loaded dynamically (C:\Users\ilyav\.m2\repository\net\bytebuddy\byte-buddy-agent\1.14.4\byte-buddy-agent-1.14.4.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
[INFO] Tests run: 20, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.176 s - in ru.miet.testing.CalculatorPresenterImplTest
[INFO] 
[INFO] Results:
[INFO]
[INFO] Tests run: 20, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.232 s
[INFO] Finished at: 2025-09-14T17:55:45+03:00
[INFO] -------------------------------------------------------------------