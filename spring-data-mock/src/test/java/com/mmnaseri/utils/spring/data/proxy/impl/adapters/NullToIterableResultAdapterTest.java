package com.mmnaseri.utils.spring.data.proxy.impl.adapters;

import com.mmnaseri.utils.spring.data.domain.impl.ImmutableInvocation;
import com.mmnaseri.utils.spring.data.proxy.ResultAdapter;
import com.mmnaseri.utils.spring.data.sample.usecases.proxy.ReturnTypeSampleRepository;
import org.testng.annotations.Test;

import java.util.Iterator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

/**
 * @author Milad Naseri (mmnaseri@programmer.net)
 * @since 1.0 (10/5/15)
 */
public class NullToIterableResultAdapterTest {

    @Test
    public void testAcceptance() throws Exception {
        final ResultAdapter<Iterable> adapter = new NullToIterableResultAdapter();
        assertThat(adapter.accepts(new ImmutableInvocation(ReturnTypeSampleRepository.class.getMethod("findIterable"), new Object[]{}), null), is(true));
        assertThat(adapter.accepts(new ImmutableInvocation(ReturnTypeSampleRepository.class.getMethod("findOther"), new Object[]{}), null), is(false));
    }

    @Test
    public void testAdaptingToIterable() throws Exception {
        final ResultAdapter<Iterable> adapter = new NullToIterableResultAdapter();
        final Iterable value = adapter.adapt(new ImmutableInvocation(ReturnTypeSampleRepository.class.getMethod("findIterable"), new Object[]{}), null);
        assertThat(value, is(notNullValue()));
        assertThat(value.iterator(), is(notNullValue()));
        final Iterator iterator = value.iterator();
        assertThat(iterator.hasNext(), is(false));
    }
    
}