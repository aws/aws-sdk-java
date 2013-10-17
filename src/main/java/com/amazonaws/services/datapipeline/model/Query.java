/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;


/**
 * <p>
 * Defines the query to run against an object.
 * </p>
 */
public class Query implements Serializable {

    /**
     * List of selectors that define the query. An object must satisfy all of
     * the selectors to match the query.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Selector> selectors;

    /**
     * List of selectors that define the query. An object must satisfy all of
     * the selectors to match the query.
     *
     * @return List of selectors that define the query. An object must satisfy all of
     *         the selectors to match the query.
     */
    public java.util.List<Selector> getSelectors() {
        if (selectors == null) {
              selectors = new com.amazonaws.internal.ListWithAutoConstructFlag<Selector>();
              selectors.setAutoConstruct(true);
        }
        return selectors;
    }
    
    /**
     * List of selectors that define the query. An object must satisfy all of
     * the selectors to match the query.
     *
     * @param selectors List of selectors that define the query. An object must satisfy all of
     *         the selectors to match the query.
     */
    public void setSelectors(java.util.Collection<Selector> selectors) {
        if (selectors == null) {
            this.selectors = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Selector> selectorsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Selector>(selectors.size());
        selectorsCopy.addAll(selectors);
        this.selectors = selectorsCopy;
    }
    
    /**
     * List of selectors that define the query. An object must satisfy all of
     * the selectors to match the query.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param selectors List of selectors that define the query. An object must satisfy all of
     *         the selectors to match the query.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Query withSelectors(Selector... selectors) {
        if (getSelectors() == null) setSelectors(new java.util.ArrayList<Selector>(selectors.length));
        for (Selector value : selectors) {
            getSelectors().add(value);
        }
        return this;
    }
    
    /**
     * List of selectors that define the query. An object must satisfy all of
     * the selectors to match the query.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param selectors List of selectors that define the query. An object must satisfy all of
     *         the selectors to match the query.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Query withSelectors(java.util.Collection<Selector> selectors) {
        if (selectors == null) {
            this.selectors = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Selector> selectorsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Selector>(selectors.size());
            selectorsCopy.addAll(selectors);
            this.selectors = selectorsCopy;
        }

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
        if (getSelectors() != null) sb.append("Selectors: " + getSelectors() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSelectors() == null) ? 0 : getSelectors().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Query == false) return false;
        Query other = (Query)obj;
        
        if (other.getSelectors() == null ^ this.getSelectors() == null) return false;
        if (other.getSelectors() != null && other.getSelectors().equals(this.getSelectors()) == false) return false; 
        return true;
    }
    
}
    