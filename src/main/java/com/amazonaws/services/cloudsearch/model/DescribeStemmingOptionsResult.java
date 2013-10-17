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
package com.amazonaws.services.cloudsearch.model;

import java.io.Serializable;


/**
 * <p>
 * A response message that contains the stemming options for a search domain.
 * </p>
 */
public class DescribeStemmingOptionsResult implements Serializable {

    /**
     * The stemming options configured for this search domain and the current
     * status of those options.
     */
    private StemmingOptionsStatus stems;

    /**
     * The stemming options configured for this search domain and the current
     * status of those options.
     *
     * @return The stemming options configured for this search domain and the current
     *         status of those options.
     */
    public StemmingOptionsStatus getStems() {
        return stems;
    }
    
    /**
     * The stemming options configured for this search domain and the current
     * status of those options.
     *
     * @param stems The stemming options configured for this search domain and the current
     *         status of those options.
     */
    public void setStems(StemmingOptionsStatus stems) {
        this.stems = stems;
    }
    
    /**
     * The stemming options configured for this search domain and the current
     * status of those options.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stems The stemming options configured for this search domain and the current
     *         status of those options.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeStemmingOptionsResult withStems(StemmingOptionsStatus stems) {
        this.stems = stems;
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
        if (getStems() != null) sb.append("Stems: " + getStems() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStems() == null) ? 0 : getStems().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeStemmingOptionsResult == false) return false;
        DescribeStemmingOptionsResult other = (DescribeStemmingOptionsResult)obj;
        
        if (other.getStems() == null ^ this.getStems() == null) return false;
        if (other.getStems() != null && other.getStems().equals(this.getStems()) == false) return false; 
        return true;
    }
    
}
    