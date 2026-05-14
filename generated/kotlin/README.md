# Usage

Similar to implementing Java class.


## Add Kaitai Structs Library

[Repo](https://github.com/kaitai-io/kaitai_struct_java_runtime)

I am using Gradle so importing the library is straight forward.

```libs.versions.toml
[versions]
kaitai = "0.11"

[libraries]
kaitai-structs = { module = "io.kaitai:kaitai-struct-runtime", version.ref = "kaitai" }
```

```build.gradle.kts
dependencies {
    implementation(libs.kaitai.structs)
}
```

## Construct Object

```kotlin
import io.kaitai.struct.ByteBufferKaitaiStream

class ReadToStruct {
    fun readEvtFile(filename: String): Evt {
        val bytes = ReadToStruct::class.java.getResourceAsStream(filename)
                .readAllBytes()
        return Evt(ByteBufferKaitaiStream(bytes))
    }
}
```