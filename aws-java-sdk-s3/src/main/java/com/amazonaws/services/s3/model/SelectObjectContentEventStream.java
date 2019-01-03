/*
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.s3.model;

import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.internal.ReleasableInputStream;
import com.amazonaws.internal.SdkFilterInputStream;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.internal.eventstreaming.Message;
import com.amazonaws.services.s3.internal.eventstreaming.MessageDecoder;
import com.amazonaws.services.s3.model.SelectObjectContentEvent.RecordsEvent;
import com.amazonaws.services.s3.model.transform.SelectObjectContentEventUnmarshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.ValidationUtils;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * A stream of {@link SelectObjectContentEvent}s, generated as the result of a call
 * to {@link AmazonS3#selectObjectContent(SelectObjectContentRequest)}.
 *
 * This stream is usually read by one of {@link #getEventsIterator()}, {@link #visitAllEvents(SelectObjectContentEventVisitor)},
 * {@link #getRecordsInputStream()} or (for smaller results) {@link #getAllEvents()}.
 *
 * @see SelectObjectContentResult#getPayload()
 */
@NotThreadSafe
public class SelectObjectContentEventStream implements Closeable {
    private static final InputStream EMPTY_INPUT_STREAM = new ByteArrayInputStream(new byte[0]);

    private final SdkFilterInputStream inputStream;

    private boolean readOptionChosen = false;

    public SelectObjectContentEventStream(SdkFilterInputStream inputStream) {
        this.inputStream = ValidationUtils.assertNotNull(inputStream, "inputStream");
    }

    /**
     * Read all of the {@link SelectObjectContentEvent}s from this stream into memory. For large objects, lazy-loading using
     * {@link #getEventsIterator()}, {@link #getRecordsInputStream()} or {@link #visitAllEvents(SelectObjectContentEventVisitor)}
     * should be used instead.
     *
     * This will raise a runtime exception if {@link #visitAllEvents(SelectObjectContentEventVisitor)},
     * {@link #getRecordsInputStream()} or {@link #getEventsIterator()} have already been used.
     *
     * After using this method, you still must {@link #close()} this object to release the connection to S3.
     */
    public List<SelectObjectContentEvent> getAllEvents() throws SelectObjectContentEventException {
        List<SelectObjectContentEvent> events = new ArrayList<SelectObjectContentEvent>();
        Iterator<SelectObjectContentEvent> eventsIterator = getEventsIterator();
        while (eventsIterator.hasNext()) {
            events.add(eventsIterator.next());
        }
        return events;
    }

    /**
     * Apply the provided {@link SelectObjectContentEventVisitor} to each {@link SelectObjectContentEvent} in this stream
     * in the order they are returned by S3. This will lazily-load the events from S3, minimizing the amount of memory used.
     *
     * This will raise a runtime exception if {@link #getAllEvents()}, {@link #getRecordsInputStream()} or {@link #getEventsIterator()}
     * have already been used.
     *
     * After using this method, you still must {@link #close()} this object to release the connection to S3.
     *
     * @param visitor The visitor that should be applied to each event in this stream.
     */
    public void visitAllEvents(SelectObjectContentEventVisitor visitor) throws SelectObjectContentEventException {
        Iterator<SelectObjectContentEvent> eventsIterator = getEventsIterator();
        while (eventsIterator.hasNext()) {
            eventsIterator.next().visit(visitor);
        }
    }

    /**
     * Retrieve an iterator over the {@link SelectObjectContentEvent}s in this stream, in the order they are returned by S3. This
     * will lazily-load the events from S3, minimizing the amount of memory used.
     *
     * This will raise a runtime exception if {@link #getAllEvents()}, {@link #visitAllEvents(SelectObjectContentEventVisitor)}
     * or {@link #getRecordsInputStream()} have already been used.
     *
     * After using this method, you still must {@link #close()} this object to release the connection to S3.
     */
    public Iterator<SelectObjectContentEvent> getEventsIterator() throws SelectObjectContentEventException {
        readOptionChosen();
        return new SelectEventIterator();
    }

    /**
     * Retrieve an input stream to the subset of the S3 object that matched the query. This is equivalent to loading the content
     * of all {@link SelectObjectContentEvent.RecordsEvent}s into an {@link InputStream}. This will lazily-load the content from
     * S3, minimizing the amount of memory used.
     *
     * This will raise a runtime exception if {@link #getAllEvents()}, {@link #visitAllEvents(SelectObjectContentEventVisitor)}
     * or {@link #getEventsIterator()} have already been used.
     *
     * Like all streams, you should {@link SelectRecordsInputStream#close()} it after the content has been read. This
     * is equivalent to calling {@link #close()} on this {@link SelectObjectContentEventStream}.
     *
     * @see #getRecordsInputStream(SelectObjectContentEventVisitor) to also process non-record events while reading the response.
     */
    public SelectRecordsInputStream getRecordsInputStream() throws SelectObjectContentEventException {
        return getRecordsInputStream(new SelectObjectContentEventVisitor() {});
    }

    /**
     * Retrieve an input stream to the subset of the S3 object that matched the query. This is equivalent to loading the content
     * of all {@link SelectObjectContentEvent.RecordsEvent}s into an {@link InputStream}. This will lazily-load the content from
     * S3, minimizing the amount of memory used.
     *
     * Unlike {@link #getRecordsInputStream()}, this allows you to provide a "listener" {@link SelectObjectContentEventVisitor}
     * that intercepts the events returned by S3 while the thread that called {@link SelectRecordsInputStream#read()} blocks
     * waiting for S3 to return a response.
     *
     * This will raise a runtime exception if {@link #getAllEvents()}, {@link #visitAllEvents(SelectObjectContentEventVisitor)}
     * or {@link #getEventsIterator()} have already been used.
     *
     * Like all streams, you should {@link SelectRecordsInputStream#close()} it after the content has been read. This
     * is equivalent to calling {@link #close()} on this {@link SelectObjectContentEventStream}.
     *
     * @param listener A visitor for monitoring the progress of the query between {@link RecordsEvent}s.
     * @see #getRecordsInputStream()
     */
    public SelectRecordsInputStream getRecordsInputStream(SelectObjectContentEventVisitor listener)
            throws SelectObjectContentEventException {
        InputStream recordInputStream = new SequenceInputStream(new EventStreamEnumeration(getEventsIterator(), listener));

        // Ignore close() calls to the record stream. The sequence input stream would read the whole stream to close all of the
        // streams in the enum, and the streams in the enum aren't needed because they're byte array input streams.
        recordInputStream = ReleasableInputStream.wrap(recordInputStream).disableClose();

        return new SelectRecordsInputStream(recordInputStream, inputStream);
    }

    /**
     * Abort this stream, potentially before all events have been read. This should be used before {@link #close()} if there are
     * still events pending on the stream. Using this method has a performance impact, because it will forcibly close the active
     * connection to S3, whereas reading to end of the stream before calling {@link #close()} will still allow the connection to
     * be reused.
     */
    public void abort() {
        inputStream.abort();
    }

    /**
     * Close this stream, after all events have been read. If there are still pending events, an error will be logged. To prevent
     * error logging on incomplete reads, you can call {@link #abort()} to signal an intent to only partially read events in the
     * stream.
     */
    public void close() throws IOException {
        inputStream.close();
    }

    private void readOptionChosen() {
        if (readOptionChosen) {
            throw new IllegalStateException("Reading of the select event stream was already started by another method.");
        }
        readOptionChosen = true;
    }

    /**
     * An implementation of {@link LazyLoadedIterator} that returns events one-by-one from the underlying event stream.
     */
    private class SelectEventIterator extends LazyLoadedIterator<SelectObjectContentEvent> {
        private final MessageDecoder decoder = new MessageDecoder();

        @Override
        protected Collection<SelectObjectContentEvent> getNext() throws IOException {
            List<SelectObjectContentEvent> next = new ArrayList<SelectObjectContentEvent>();
            byte[] payload = new byte[256];
            while (next.isEmpty()) {
                int read = inputStream.read(payload);
                if (read == -1) {
                    if (decoder.hasPendingContent()) {
                        throw new SelectObjectContentEventException("Service stream ended before an event could be entirely decoded.");
                    }
                    break;
                }

                List<Message> messages = decoder.feed(payload, 0, read);

                for (Message message : messages) {
                    next.add(SelectObjectContentEventUnmarshaller.unmarshalMessage(message));
                }
            }
            return next;
        }

    }

    /**
     * An implementation of {@link LazyLoadedIterator} that returns an input stream to any {@link RecordsEvent} content from the
     * underlying event stream. Also implements {@link Enumeration} for use in a {@link SequenceInputStream}.
     */
    private class EventStreamEnumeration extends LazyLoadedIterator<InputStream> implements Enumeration<InputStream> {
        private final Iterator<SelectObjectContentEvent> selectEventIterator;
        private final SelectObjectContentEventVisitor additionalVisitor;
        private boolean initialized = false;

        private EventStreamEnumeration(Iterator<SelectObjectContentEvent> selectEventIterator,
                                       SelectObjectContentEventVisitor additionalVisitor) {
            this.selectEventIterator = selectEventIterator;
            this.additionalVisitor = additionalVisitor;
        }

        @Override
        protected Collection<? extends InputStream> getNext() {
            // Always return a single empty input stream at first. This allows the user to wrap this in a sequence input stream
            // without taking forever to initialize (sequence input streams are not lazily loaded).
            if (!initialized) {
                initialized = true;
                return Collections.singleton(EMPTY_INPUT_STREAM);
            }

            final Collection<InputStream> result = new ArrayList<InputStream>();

            while (selectEventIterator.hasNext()) {
                SelectObjectContentEvent event = selectEventIterator.next();

                // If they have an additional visitor interested in events as they are encountered, notify them of this event.
                event.visit(additionalVisitor);

                // Create an input stream to the content of any records events we find.
                event.visit(new SelectObjectContentEventVisitor() {
                    @Override
                    public void visit(RecordsEvent event) {
                        ByteBuffer records = event.getPayload();
                        if (records != null) {
                            result.add(new ByteArrayInputStream(BinaryUtils.copyBytesFrom(records)));
                        }
                    }
                });

                // Don't load all results in memory. Stop if we've found one.
                if (!result.isEmpty()) {
                    return result;
                }
            }

            // Couldn't find anything - no results.
            return result;
        }

        @Override
        public boolean hasMoreElements() {
            return super.hasNext();
        }

        @Override
        public InputStream nextElement() {
            return super.next();
        }
    }

    /**
     * An implementation of {@link Iterator} that maps the Iterator contract into a lazily-loaded, simpler-to-implement
     * {@link #getNext()} method.
     */
    private abstract class LazyLoadedIterator<T> implements Iterator<T> {
        private final Queue<T> next = new ArrayDeque<T>();
        private boolean isDone = false;

        @Override
        public boolean hasNext() {
            advanceIfNeeded();
            return !isDone;
        }

        @Override
        public T next() {
            advanceIfNeeded();

            if (isDone) {
                throw new NoSuchElementException();
            }

            return next.poll();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private void advanceIfNeeded() {
            if (!isDone && next.isEmpty()) {
                try {
                    this.next.addAll(getNext());
                    this.isDone = this.next.isEmpty();
                } catch (IOException e) {
                    throw new SelectObjectContentEventException("Failed to read S3 select event.", e);
                }
            }
        }

        /**
         * Load any newly-available events. This can return any number of events, in the order they should be encountered by the
         * user of the iterator. This should return an empty collection if there are no remaining events in the stream.
         */
        protected abstract Collection<? extends T> getNext() throws IOException;
    }
}
