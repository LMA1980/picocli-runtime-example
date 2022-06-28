# picocli-runtime-example

This is a simple project to show how picocli application can be bundle.

## Producing the bundle

```
./gradlew runtime
```
## Confirming the bundle was properly assembled

```
ls ./build/image/bin
```

Confirm the presence of the (1) bash file `helloword` or the Windows batch script `helloword.bat` and the (2) java binaries: `java`, `keytool`.

## Test execution

### Linux or MacOS
```
./build/image/helloworld
```

### Windows
```
.\build\image\helloword.bat
```
