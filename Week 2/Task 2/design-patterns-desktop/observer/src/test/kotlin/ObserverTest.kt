package observer

import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.times
import org.mockito.Mockito.verify
import org.mockito.Mockito.never

class EventManagerTest {

    @Test
    fun `should notify subscribed listeners`() {
        val eventManager = EventManager("testEvent")
        val listener1 = mock(EventListener::class.java)
        val listener2 = mock(EventListener::class.java)

        eventManager.subscribe("testEvent", listener1)
        eventManager.subscribe("testEvent", listener2)

        eventManager.notify("testEvent", "some data")

        verify(listener1, times(1)).update("testEvent", "some data")
        verify(listener2, times(1)).update("testEvent", "some data")
    }

    @Test
    fun `should not notify unsubscribed listeners`() {
        val eventManager = EventManager("testEvent")
        val listener1 = mock(EventListener::class.java)
        val listener2 = mock(EventListener::class.java)

        eventManager.subscribe("testEvent", listener1)
        eventManager.subscribe("testEvent", listener2)

        eventManager.unsubscribe("testEvent", listener2)

        eventManager.notify("testEvent", "some data")

        verify(listener1, times(1)).update("testEvent", "some data")
        verify(listener2, never()).update("testEvent", "some data")
    }

    @Test
    fun `should not notify listeners of other events`() {
        val eventManager = EventManager("event1", "event2")
        val listener = mock(EventListener::class.java)

        eventManager.subscribe("event1", listener)
        eventManager.notify("event2", "some data")

        verify(listener, never()).update("event2", "some data")
    }
} 