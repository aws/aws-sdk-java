/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpledb.model;

/**
 * Select Result
 */
public class SelectResult {

    /**
     * A list of items that match the select expression.
     */
    private java.util.List<Item> items;

    /**
     * An opaque token indicating that more items than
     * <code>MaxNumberOfItems</code> were matched, the response size exceeded
     * 1 megabyte, or the execution time exceeded 5 seconds.
     */
    private String nextToken;

    /**
     * A list of items that match the select expression.
     *
     * @return A list of items that match the select expression.
     */
    public java.util.List<Item> getItems() {
        if (items == null) {
            items = new java.util.ArrayList<Item>();
        }
        return items;
    }
    
    /**
     * A list of items that match the select expression.
     *
     * @param items A list of items that match the select expression.
     */
    public void setItems(java.util.Collection<Item> items) {
        java.util.List<Item> itemsCopy = new java.util.ArrayList<Item>();
        if (items != null) {
            itemsCopy.addAll(items);
        }
        this.items = itemsCopy;
    }
    
    /**
     * A list of items that match the select expression.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param items A list of items that match the select expression.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SelectResult withItems(Item... items) {
        for (Item value : items) {
            getItems().add(value);
        }
        return this;
    }
    
    /**
     * A list of items that match the select expression.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param items A list of items that match the select expression.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SelectResult withItems(java.util.Collection<Item> items) {
        java.util.List<Item> itemsCopy = new java.util.ArrayList<Item>();
        if (items != null) {
            itemsCopy.addAll(items);
        }
        this.items = itemsCopy;

        return this;
    }
    
    /**
     * An opaque token indicating that more items than
     * <code>MaxNumberOfItems</code> were matched, the response size exceeded
     * 1 megabyte, or the execution time exceeded 5 seconds.
     *
     * @return An opaque token indicating that more items than
     *         <code>MaxNumberOfItems</code> were matched, the response size exceeded
     *         1 megabyte, or the execution time exceeded 5 seconds.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * An opaque token indicating that more items than
     * <code>MaxNumberOfItems</code> were matched, the response size exceeded
     * 1 megabyte, or the execution time exceeded 5 seconds.
     *
     * @param nextToken An opaque token indicating that more items than
     *         <code>MaxNumberOfItems</code> were matched, the response size exceeded
     *         1 megabyte, or the execution time exceeded 5 seconds.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * An opaque token indicating that more items than
     * <code>MaxNumberOfItems</code> were matched, the response size exceeded
     * 1 megabyte, or the execution time exceeded 5 seconds.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken An opaque token indicating that more items than
     *         <code>MaxNumberOfItems</code> were matched, the response size exceeded
     *         1 megabyte, or the execution time exceeded 5 seconds.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SelectResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("Items: " + items + ", ");
        sb.append("NextToken: " + nextToken + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    