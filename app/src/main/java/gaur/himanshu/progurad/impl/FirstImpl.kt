package gaur.himanshu.progurad.impl

import gaur.himanshu.progurad.inter.FakeInterface

class FirstImpl : FakeInterface {
    override fun getCustomMessage(): String {
        return "first impl"
    }
}