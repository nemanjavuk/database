package com.bigdata.relation.rule.eval.pipeline;

import com.bigdata.bop.IBindingSet;
import com.bigdata.relation.accesspath.AbstractUnsynchronizedArrayBuffer;

/**
 * Abstract base class that keeps track of the chunks of binding sets that
 * are generated by a {@link JoinTask}. This information is updated on the
 * {@link JoinStats}s for that {@link JoinTask}.
 * 
 * @author <a href="mailto:thompsonbry@users.sourceforge.net">Bryan Thompson</a>
 * @version $Id$
 * @param <E>
 */
abstract class UnsynchronizedOutputBuffer<E extends IBindingSet>
        extends AbstractUnsynchronizedArrayBuffer<E> {

    protected final JoinTask joinTask;

    protected UnsynchronizedOutputBuffer(final JoinTask joinTask,
            final int capacity) {

        super(capacity);

        if (joinTask == null)
            throw new IllegalArgumentException();

        this.joinTask = joinTask;

    }
    
}