package co.nz.arm.wamp.serialization

import co.nz.arm.wamp.messages.Message

interface MessageSerializer {
    fun deserialize(rawMessage: String): Message
    fun serialize(message: Message): String
}