package co.nz.arm.wamp

import co.nz.arm.wamp.messages.Hello
import co.nz.arm.wamp.messages.Message
import co.nz.arm.wamp.messages.MessageType
import io.kotlintest.matchers.beOfType
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import kotlinx.coroutines.experimental.*
import kotlinx.coroutines.experimental.channels.Channel

class ConnectionTest : StringSpec({
    "Can send hello" {
//        val incoming = Channel<String>()
//        val outgoing = Channel<String>()
//
//        val connection = Connection(incoming, outgoing, {_ -> null})
//        launch {
//            connection.send(Hello("default", ""))
//            println("Message sent!")
//        }
//
//        runBlocking {
////            val test: Deferred<Message> = async {
//                connection.onNextMessage {
//                    it shouldBe beOfType<Hello>()
//                    it.messageType shouldBe MessageType.HELLO
//                }
////            }
//            println("Verified!")
//        }
//        println("hello")
    }
})