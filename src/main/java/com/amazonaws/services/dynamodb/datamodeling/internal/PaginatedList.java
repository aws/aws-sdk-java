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
package com.amazonaws.services.dynamodb.datamodeling.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import com.amazonaws.services.dynamodb.AmazonDynamoDB;
import com.amazonaws.services.dynamodb.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodb.model.AttributeValue;

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

    /**
     * The total size of the results from the DynamoDB operation providing the data
     * in this list
     */
    private final int size;

    /** Tracks if all results have been loaded yet or not */
    protected boolean allResultsLoaded = false;    

    /** All currently loaded results for this list */
    protected List<T> allResults;


    public PaginatedList(DynamoDBMapper mapper, Class<T> clazz, AmazonDynamoDB dynamo, int size) {
        this.mapper = mapper;
        this.clazz = clazz;
        this.dynamo = dynamo;
        this.size = size;

        this.allResults = new ArrayList<T>();
    }

    protected synchronized void loadAllResults() {
        if (allResultsLoaded) return;

        while ( hasMoreResults() ) {
            loadNextResult();
        }

        allResultsLoaded = true;
    }
    
    protected abstract boolean hasMoreResults();
    
    protected abstract void loadNextResult();

    // List Interface

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return allResults.isEmpty();
    }

    // Operations requiring the entire result set

    @Override
    public boolean contains(Object arg0) {
        loadAllResults();
        return allResults.contains(arg0);
    }

    @Override
    public boolean containsAll(Collection<?> arg0) {
        loadAllResults();
        return allResults.containsAll(arg0);
    }

    @Override
    public T get(int arg0) {
        loadAllResults();
        return allResults.get(arg0);
    }

    @Override
    public int indexOf(Object arg0) {
        loadAllResults();
        return allResults.indexOf(arg0);
    }

    @Override
    public int lastIndexOf(Object arg0) {
        loadAllResults();
        return allResults.lastIndexOf(arg0);
    }

    @Override
    public List<T> subList(int arg0, int arg1) {
        loadAllResults();
        return allResults.subList(arg0, arg1);
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

    // Iterator Operations

    /**
     * Returns an iterator over this list that lazily initializes results as
     * necessary.
     */
    @Override
    public Iterator<T> iterator() {
        final UnmodifiableIterator<T> iter = new UnmodifiableIterator<T>(allResults.iterator());
        return new Iterator<T>() {

            Iterator<T> iterator = iter;
            int pos = 0;
            
            @Override
            public boolean hasNext() {
                return iterator.hasNext() || hasMoreResults();
            }

            @Override
            public T next() {
                if ( !iterator.hasNext() && hasMoreResults() ) {
                    loadNextResult();
                    iterator = new UnmodifiableIterator<T>(allResults.listIterator(pos));
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

    @Override
    public ListIterator<T> listIterator() {
        throw new UnsupportedOperationException("ListIterators are not supported for this list");
    }

    @Override
    public ListIterator<T> listIterator(int arg0) {
        throw new UnsupportedOperationException("ListIterators are not supported for this list");
    }

    // Unsupported Operations

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


    // Private Interface

    protected void unmarshallResults(List<Map<String, AttributeValue>> items) {
        for (Map<String, AttributeValue> attributeMap : items) {
            try {
                allResults.add(mapper.marshallIntoObject(clazz, attributeMap));
            } catch (Exception e) {
                throw new RuntimeException("Unable to marshall attributes into object", e);
            }
        }
    }

}
