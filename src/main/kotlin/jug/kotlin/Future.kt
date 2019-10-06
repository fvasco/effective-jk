package jug.kotlin

import java.util.concurrent.locks.ReentrantLock
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

inline class UserName(val name: String)

inline class Password(val secret: String)

inline class UserId(val value: UInt)

inline class TcpPort(val n: UShort)

val lock = ReentrantLock()

@ExperimentalContracts
fun withLock(block: () -> Unit) {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }

    lock.lock()
    try {
        block()
    } finally {
        lock.unlock()
    }
}

@ExperimentalContracts
fun main() {
    val n: Int
    withLock {
        n = 42
    }
    println(n)
}