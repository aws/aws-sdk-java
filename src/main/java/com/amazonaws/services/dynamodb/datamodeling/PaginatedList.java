/*
 * Copyright 2011-2012 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.dynamodb.datamodeling;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import com.amazonaws.services.dynamodb.AmazonDynamoDB;

/**
 * Unmodifiable list supporting paginated result sets from Amazon DynamoDB.
 * <p>
 * Pages of results are fetched lazily from DynamoDB as they are needed. Some
 * methods, such as {@link PaginatedList#size()} and
 * {@link PaginatedList#toArray()}, require fetching the entire result set
 * eagerly. See the javadoc of individual methods for details on which are lazy.
 * 
 * @param <T>
 *            The domain object type stored in this list.
 */
public abstract class PaginatedList<T> implements List<T> {

    private static final String UNMODIFIABLE_MESSAGE = "This is an unmodifiable list";

    /**
     * Reference to the DynamoDB mapper for marshalling DynamoDB attributes back
     * into objects
     */
    protected final DynamoDBMapper mapper;

    /**
     * The class annotated with DynamoDB tags declaring how to load/store
     * objects into DynamoDB
     */
    protected final Class<T> clazz;

    /** The client for working with DynamoDB */
    protected final AmazonDynamoDB dynamo;

    /** Tracks if all results have been loaded yet or not */
    protected boolean allResultsLoaded = false;    

    /** All currently loaded results for this list */
    protected final List<T> allResults;
    
    /** Lazily loaded next results waiting to be added into allResults */
    protected final List<T> nextResults = new LinkedList<T>();

    public PaginatedList(DynamoDBMapper mapper, Class<T> clazz, AmazonDynamoDB dynamo) {
        this.mapper = mapper;
        this.clazz = clazz;
        this.dynamo = dynamo;

        this.allResults = new ArrayList<T>();
    }

    /**
     * Eagerly loads all results for this list.
     */
    public synchronized void loadAllResults() {
        if ( allResultsLoaded )
            return;

        while ( nextResultsAvailable() ) {
            moveNextResults();
        }

        allResultsLoaded = true;
    }
    
    /**
     * Returns whether there are more results available not yet included in the
     * allResults member field. These could already have been fetched and are
     * sitting in the nextResults buffer, or they could be fetched from the
     * service opportunistically at the time this method is called. A return
     * value of true guarantees that nextResults is non-empty.
     */
    private boolean nextResultsAvailable() {
        return !nextResults.isEmpty() || loadNextResults();
    }

    /**
     * Attempts to load the next batch of results, if there are any, into the
     * nextResults buffer. Returns whether there were any results to load. A
     * return value of true guarantees that nextResults had items added to it.
     */
    private synchronized boolean loadNextResults() {
        if ( atEndOfResults() )
            return false;

        do {
            nextResults.addAll(fetchNextPage());
        } while ( !atEndOfResults() && nextResults.isEmpty() );

        return !nextResults.isEmpty();
    }

    /**
     * Moves the contents of the nextResults buffer into allResults and resets
     * the buffer.
     */
    private void moveNextResults() {
        allResults.addAll(nextResults);
        nextResults.clear();
    }
    
    /**
     * Fetches the next page of results (which may be empty) and returns any
     * items found.
     */
    protected abstract List<T> fetchNextPage();
    
    /**
     * Returns whether we have reached the end of the result set.
     */
    protected abstract boolean atEndOfResults();

    /**
     * Returns an iterator over this list that lazily initializes results as
     * necessary.
     */
    @Override
    public Iterator<T> iterator() {
        
        /*
         * We make a copy of the allResults list to iterate over in order to
         * avoid ConcurrentModificationExceptions caused by other methods
         * loading more results into the list while someone iterates over it.
         * This is a more severe problem than it might seem, because even
         * innocuous-seeming operations such as contains() can modify the
         * underlying result set.
         */
        final List<T> allResultsCopy = new ArrayList<T>();
        allResultsCopy.addAll(allResults);        
        final Iterator<T> iter = allResultsCopy.iterator();
        
        return new Iterator<T>() {
    
            Iterator<T> iterator = iter;
            int pos = 0;
            
            @Override
            public boolean hasNext() {
                return iterator.hasNext() || nextResultsAvailable();
            }
    
            @Override
            public T next() {
                if ( !iterator.hasNext() ) {
                    /*
                     * Our private copy of the result list may be out of date
                     * with the full one. If it is, we just need to update our
                     * private copy to get more results. If it's not, we need to
                     * fetch more results from the service.
                     */
                    if ( allResults.size() == allResultsCopy.size() ) {
                        if ( !nextResultsAvailable() ) {
                            throw new NoSuchElementException();
                        }
                        moveNextResults();
                    } 
                    
                    if ( allResults.size() > allResultsCopy.size() )
                        allResultsCopy.addAll(allResults.subList(allResultsCopy.size(), allResults.size()));
                    
                    iterator = allResultsCopy.listIterator(pos);
                }
                
                pos++;
                return iterator.next();
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException(UNMODIFIABLE_MESSAGE);
            }            
        };
    }

    /**
     * Returns whether the collection is empty. At most one (non-empty) page of
     * results is loaded to make the check.
     */
    @Override
    public boolean isEmpty() {
        return !iterator().hasNext();
    }

    /**
     * Returns the Nth element of the list. Results are loaded until N elements
     * are present, if necessary.
     */
    @Override
    public T get(int n) {
        while ( allResults.size() <= n && nextResultsAvailable() ) {
            moveNextResults();
        }

        return allResults.get(n);
    }
    
    /**
     * Returns whether the collection contains the given element. Results are
     * loaded and checked incrementally until a match is found or the end of the
     * result set is reached.
     */
    @Override
    public boolean contains(Object arg0) {
        if ( allResults.contains(arg0) )
            return true;
        
        while ( nextResultsAvailable() ) {
            boolean found = nextResults.contains(arg0);
            moveNextResults();
            if ( found )
                return true;
        }

        return false;
    }

    /**
     * Returns a sub-list in the range specified, loading more results as
     * necessary.
     */
    @Override
    public List<T> subList(int arg0, int arg1) {
        while ( allResults.size() < arg1 && nextResultsAvailable() ) {
            moveNextResults();
        }
        
        return Collections.unmodifiableList(allResults.subList(arg0, arg1));
    }

    /**
     * Returns the first index of the object given in the list. Additional
     * results are loaded incrementally as necessary.
     */
    @Override
    public int indexOf(Object arg0) {
        int indexOf = allResults.indexOf(arg0);
        if ( indexOf >= 0 )
            return indexOf;

        while ( nextResultsAvailable() ) {
            indexOf = nextResults.indexOf(arg0);
            int size = allResults.size();
            moveNextResults();
            if ( indexOf >= 0 )
                return indexOf + size;
        }

        return -1;
    }

    // Operations requiring the entire result set
    
    @Override
    public int size() {
        loadAllResults();
        return allResults.size();
    }
    
    @Override
    public boolean containsAll(Collection<?> arg0) {
        loadAllResults();
        return allResults.containsAll(arg0);
    }

    @Override
    public int lastIndexOf(Object arg0) {
        loadAllResults();
        return allResults.lastIndexOf(arg0);
    }

    @Override
    public Object[] toArray() {
        loadAllResults();
        return allResults.toArray();
    }

    @Override
    public <X> X[] toArray(X[] a) {
        loadAllResults();
        return allResults.toArray(a);
    }

    // Unsupported Operations

    @Override
    public ListIterator<T> listIterator() {
        throw new UnsupportedOperationException("ListIterators are not supported for this list");
    }

    @Override
    public ListIterator<T> listIterator(int arg0) {
        throw new UnsupportedOperationException("ListIterators are not supported for this list");
    }

    @Override
    public boolean remove(Object arg0) {
        throw new UnsupportedOperationException(UNMODIFIABLE_MESSAGE);
    }

    @Override
    public T remove(int arg0) {
        throw new UnsupportedOperationException(UNMODIFIABLE_MESSAGE);
    }

    @Override
    public boolean removeAll(Collection<?> arg0) {
        throw new UnsupportedOperationException(UNMODIFIABLE_MESSAGE);
    }

    @Override
    public boolean retainAll(Collection<?> arg0) {
        throw new UnsupportedOperationException(UNMODIFIABLE_MESSAGE);
    }

    @Override
    public T set(int arg0, T arg1) {
        throw new UnsupportedOperationException(UNMODIFIABLE_MESSAGE);
    }

    @Override
    public boolean add(T arg0) {
        throw new UnsupportedOperationException(UNMODIFIABLE_MESSAGE);
    }

    @Override
    public void add(int arg0, T arg1) {
        throw new UnsupportedOperationException(UNMODIFIABLE_MESSAGE);
    }

    @Override
    public boolean addAll(Collection<? extends T> arg0) {
        throw new UnsupportedOperationException(UNMODIFIABLE_MESSAGE);
    }

    @Override
    public boolean addAll(int arg0, Collection<? extends T> arg1) {
        throw new UnsupportedOperationException(UNMODIFIABLE_MESSAGE);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException(UNMODIFIABLE_MESSAGE);
    }
}
