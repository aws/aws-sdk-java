/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.datamodeling;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.PaginationLoadingStrategy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

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
    
    private static final String ITERATION_ONLY_UNSUPPORTED_OPERATION_MESSAGE = " is not supported when using ITERATION_ONLY configuration.";

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

    /**
     * All currently loaded results for this list.
     * 
     * In ITERATION_ONLY mode, this list will at most keep one page of the
     * loaded results, and all previous results will be cleared from the memory.
     */
    protected final List<T> allResults;
    
    /** Lazily loaded next results waiting to be added into allResults */
    protected final List<T> nextResults = new LinkedList<T>();
    
    /** The pagination loading strategy for this paginated list **/
    private final PaginationLoadingStrategy paginationLoadingStrategy;
    
    /** 
     * Keeps track on whether an iterator of the list has been retrieved.
     * Only updated and checked when the list is in ITERATION_ONLY mode.
     */
    private boolean iterationStarted = false;

    /**
     * Constructs a PaginatedList instance using the default PaginationLoadingStrategy
     */
    public PaginatedList(DynamoDBMapper mapper, Class<T> clazz, AmazonDynamoDB dynamo) {
        this(mapper, clazz, dynamo, null);
    }
    
    /**
     * Constructs a PaginatedList instance.
     * 
     * @param mapper
     *            The mapper for marshalling DynamoDB attributes into objects.
     * @param clazz
     *            The class of the annotated model.
     * @param dynamo
     *            The DynamoDB client for making low-level request calls.
     * @param paginationLoadingStrategy
     *            The strategy used for loading paginated results. Caller has to
     *            explicitly set this parameter, since the DynamoDBMapperConfig
     *            set in the mapper is not accessible here. If null value is
     *            provided, LAZY_LOADING will be set by default.
     */
    public PaginatedList(DynamoDBMapper mapper, Class<T> clazz, AmazonDynamoDB dynamo, PaginationLoadingStrategy paginationLoadingStrategy) {
        this.mapper = mapper;
        this.clazz = clazz;
        this.dynamo = dynamo;
        this.paginationLoadingStrategy = paginationLoadingStrategy == null ?
                PaginationLoadingStrategy.LAZY_LOADING : paginationLoadingStrategy;

        this.allResults = new ArrayList<T>();
        
        // Ideally, we should eagerly load all results here as soon as EAGER_LOADING is configured.
        // But the implementation of loadAllResults() relies on a fully initialized sub-class object.
        // So we have to do this in each sub-class constructor.
    }

    /**
     * Eagerly loads all results for this list.
     * <p>
     * Not supported in ITERATION_ONLY mode.
     * </p>
     */
    public synchronized void loadAllResults() {
        checkUnsupportedOperationForIterationOnlyMode("loadAllResults()");
        
        if ( allResultsLoaded )
            return;

        while ( nextResultsAvailable() ) {
            // Keep all loaded results
            moveNextResults(false);
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
     * 
     * @param clearPreviousResults
     *            Whether it should clear previous results in allResults field.
     */
    private void moveNextResults(boolean clearPreviousResults) {
        if (clearPreviousResults) {
            allResults.clear();
        }
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
     * <p>
     * If it configured with ITERARTION_ONLY mode, then the iterator
     * could be only retrieved once, and any previously loaded results will be
     * cleared in the memory during the iteration.
     * </p>
     */
    @Override
    public Iterator<T> iterator() {
        return new PaginatedListIterator(paginationLoadingStrategy == PaginationLoadingStrategy.ITERATION_ONLY);
    }
    
    private class PaginatedListIterator implements Iterator<T> {
        /**
         * Whether this iterator is constructed by a PaginatedList in
         * ITERATION_ONLY mode.
         */
        private final boolean iterationOnly;
        
        /**
         * A hard copy of the allResults list to prevent
         * ConcurrentModificationExceptions.
         * Only needed when the list is not in ITERNATION_ONLY mode.
         */
        private final List<T> allResultsCopy;
        
        private Iterator<T> innerIterator;
        
        private int pos = 0;
        
        public PaginatedListIterator(boolean iterationOnly) {
            this.iterationOnly = iterationOnly;
            
            if (iterationOnly) {
                synchronized (PaginatedList.this) {
                    if (iterationStarted) {
                        throw new UnsupportedOperationException("The list could only be iterated once in ITERATION_ONLY mode.");
                    }
                    iterationStarted = true;
                }
                
                allResultsCopy = null; // not needed for ITERATION_ONLY mode
                innerIterator = allResults.iterator();
            }
            else {
                /*
                 * We make a copy of the allResults list to iterate over in order to
                 * avoid ConcurrentModificationExceptions caused by other methods
                 * loading more results into the list while someone iterates over it.
                 * This is a more severe problem than it might seem, because even
                 * innocuous-seeming operations such as contains() can modify the
                 * underlying result set.
                 */
                allResultsCopy = new ArrayList<T>();
                allResultsCopy.addAll(allResults);        
                innerIterator = allResultsCopy.iterator();
            }
        }
        
        @Override
        public boolean hasNext() {
            return innerIterator.hasNext() || shouldSyncWithAllResultsList() ||
                   nextResultsAvailable();
        }

        /**
         * If we aren't in ITERATION_ONLY mode then allResults is the authoriative source of
         * results. If it's size has increased since this iterator was last synched with it then we
         * have more results to process and need to re-sync allResultsCopy with allResults.
         *
         * @return True if more results are available in allResults then what we have currently
         * snapshoted in the iterator, false otherwise.
         */
        private boolean shouldSyncWithAllResultsList() {
            return !iterationOnly && allResults.size() > allResultsCopy.size();
        }

        @Override
        public T next() {
            if ( !innerIterator.hasNext() ) {
                /*
                 * We need to immediately fetch more results from the service,
                 * if 
                 *   -- it's in ITERATION_ONLY mode (which means innerIterator
                 *      is always pointing at the "real" list of loaded results)
                 *   OR it's not in ITERATION_ONLY and our private copy of the
                 *      result list is already up to date with the full one.
                 */
                if ( iterationOnly
                        || allResults.size() == allResultsCopy.size() ) {
                    if ( !nextResultsAvailable() ) {
                        throw new NoSuchElementException();
                    }
                    /* Clear previous results if it's in ITERATION_ONLY mode */
                    boolean clearPreviousResults = iterationOnly;
                    moveNextResults(clearPreviousResults);
                } 
                
                if ( iterationOnly ) {
                    /*
                     * allResults has been replaced with the latest page of results.
                     */
                    innerIterator = allResults.iterator();
                } else {
                    /*
                     * Update our private results copy, and then update the inner iterator
                     */
                    if (allResults.size() > allResultsCopy.size()) {
                        allResultsCopy.addAll(allResults.subList(allResultsCopy.size(),
                                                                 allResults.size()));
                    }
                    
                    innerIterator = allResultsCopy.listIterator(pos);
                }
            }
            
            pos++;
            return innerIterator.next();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException(UNMODIFIABLE_MESSAGE);
        }
        
    }

    /**
     * Returns whether the collection is empty. At most one (non-empty) page of
     * results is loaded to make the check.
     * <p>
     * Not supported in ITERATION_ONLY mode.
     * </p>
     */
    @Override
    public boolean isEmpty() {
        checkUnsupportedOperationForIterationOnlyMode("isEmpty()");
        
        return !iterator().hasNext();
    }

    /**
     * Returns the Nth element of the list. Results are loaded until N elements
     * are present, if necessary.
     * <p>
     * Not supported in ITERATION_ONLY mode.
     * </p>
     */
    @Override
    public T get(int n) {
        checkUnsupportedOperationForIterationOnlyMode("get(int n)");
        
        while ( allResults.size() <= n && nextResultsAvailable() ) {
            moveNextResults(false);
        }

        return allResults.get(n);
    }
    
    /**
     * Returns whether the collection contains the given element. Results are
     * loaded and checked incrementally until a match is found or the end of the
     * result set is reached.
     * <p>
     * Not supported in ITERATION_ONLY mode.
     * </p>
     */
    @Override
    public boolean contains(Object arg0) {
        checkUnsupportedOperationForIterationOnlyMode("contains(Object arg0)");
        
        if ( allResults.contains(arg0) )
            return true;
        
        while ( nextResultsAvailable() ) {
            boolean found = nextResults.contains(arg0);
            moveNextResults(false);
            if ( found )
                return true;
        }

        return false;
    }

    /**
     * Returns a sub-list in the range specified, loading more results as
     * necessary.
     * <p>
     * Not supported in ITERATION_ONLY mode.
     * </p>
     */
    @Override
    public List<T> subList(int arg0, int arg1) {
        checkUnsupportedOperationForIterationOnlyMode("subList(int arg0, int arg1)");
        
        while ( allResults.size() < arg1 && nextResultsAvailable() ) {
            moveNextResults(false);
        }
        
        return Collections.unmodifiableList(allResults.subList(arg0, arg1));
    }

    /**
     * Returns the first index of the object given in the list. Additional
     * results are loaded incrementally as necessary.
     * <p>
     * Not supported in ITERATION_ONLY mode.
     * </p>
     */
    @Override
    public int indexOf(Object arg0) {
        checkUnsupportedOperationForIterationOnlyMode("indexOf(Object org0)");
        
        int indexOf = allResults.indexOf(arg0);
        if ( indexOf >= 0 )
            return indexOf;

        while ( nextResultsAvailable() ) {
            indexOf = nextResults.indexOf(arg0);
            int size = allResults.size();
            moveNextResults(false);
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
    
    private void checkUnsupportedOperationForIterationOnlyMode(String methodSignature) {
        if (this.paginationLoadingStrategy == PaginationLoadingStrategy.ITERATION_ONLY) {
            throw new UnsupportedOperationException(methodSignature + ITERATION_ONLY_UNSUPPORTED_OPERATION_MESSAGE);
        }
    };
}
