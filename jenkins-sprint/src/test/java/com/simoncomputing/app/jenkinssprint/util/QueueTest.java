package com.simoncomputing.app.jenkinssprint.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.simoncomputing.app.jenkinssprint.domain.Entry;

public class QueueTest {
	private Queue<Entry> q;

	@Before
	public void setUp() throws Exception {
		//Adding this comment to test pushing!!
		q = new Queue<Entry>();
		q.push(new Entry("nick","4"));
		q.push(new Entry("ross","2"));
		q.push(new Entry("jane","8"));
	}

	@Test
	public void testPush() {
		// OMG COMMENTS TO ADD
		assertTrue(q.getSize() == 3);
		q.push(new Entry("test", "8"));
		assertTrue(q.getSize() == 4);
		assertEquals(q.pop().getPartyName(), "nick");
		assertEquals(q.pop().getPartyName(), "ross");
		assertEquals(q.pop().getPartyName(), "jane");
		assertEquals(q.pop().getPartyName(), "test");
	}

	@Test
	public void testPeek() {
		assertEquals(q.peek().getPartyName(), "nick");
		q.pop();
		assertEquals(q.peek().getPartyName(), "ross");
		q.pop();
		assertEquals(q.peek().getPartyName(), "jane");
	}

	@Test
	public void testPop() {
		assertEquals(q.pop().getPartyName(), "nick");
		assertTrue(q.getSize() == 2);
		assertEquals(q.pop().getPartyName(), "ross");
		assertTrue(q.getSize() == 1);
		assertEquals(q.pop().getPartyName(), "jane");
		assertTrue(q.getSize() == 0);
	}

}
