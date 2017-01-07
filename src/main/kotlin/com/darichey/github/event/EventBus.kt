package com.darichey.github.event

import kotlin.reflect.KType
import kotlin.reflect.isSubtypeOf
import kotlin.reflect.starProjectedType

interface Event

typealias Listener = Event.() -> Unit

class EventBus {

	val listeners = mutableMapOf<KType, MutableList<Listener>>()

	inline fun <reified T : Event> on(noinline block: T.() -> Unit) =
			listeners.getOrPut(T::class.starProjectedType) { mutableListOf() }.add(block as Listener)

	fun post(event: Event) {
		listeners
				.filter { event::class.starProjectedType.isSubtypeOf(it.key) }
				.map { it.value }
				.forEach { it.forEach { it(event) } }
	}
}