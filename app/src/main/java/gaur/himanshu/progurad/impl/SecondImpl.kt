package gaur.himanshu.progurad.impl

import gaur.himanshu.progurad.inter.FakeInterface

class SecondImpl : FakeInterface {
    override fun getCustomMessage(): String {
        return "second impl"
    }
}