package adapter

import java.util.Properties
import java.io.FileInputStream
import java.io.FileOutputStream

class FileProperties() : FileIO {

    private val properties = Properties()

    override fun readFromFile(filename : String) {
        this.properties.load(FileInputStream(filename))
    }

    override fun writeToFile(filename : String) {
        this.properties.store(FileOutputStream(filename), "written by FileProperties")
    }

    override fun setValue(key : String, value : String) {
        this.properties.setProperty(key, value)
    }

    override fun getValue(key : String) : String {
        return this.properties.getProperty(key)
    }

}
