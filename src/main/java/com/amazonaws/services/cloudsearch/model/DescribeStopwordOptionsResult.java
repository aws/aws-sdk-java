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
 * A response message that contains the stopword options for a search domain.
 * </p>
 */
public class DescribeStopwordOptionsResult implements Serializable {

    /**
     * The stopword options configured for this search domain and the current
     * status of those options.
     */
    private StopwordOptionsStatus stopwords;

    /**
     * The stopword options configured for this search domain and the current
     * status of those options.
     *
     * @return The stopword options configured for this search domain and the current
     *         status of those options.
     */
    public StopwordOptionsStatus getStopwords() {
        return stopwords;
    }
    
    /**
     * The stopword options configured for this search domain and the current
     * status of those options.
     *
     * @param stopwords The stopword options configured for this search domain and the current
     *         status of those options.
     */
    public void setStopwords(StopwordOptionsStatus stopwords) {
        this.stopwords = stopwords;
    }
    
    /**
     * The stopword options configured for this search domain and the current
     * status of those options.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stopwords The stopword options configured for this search domain and the current
     *         status of those options.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeStopwordOptionsResult withStopwords(StopwordOptionsStatus stopwords) {
        this.stopwords = stopwords;
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
        if (getStopwords() != null) sb.append("Stopwords: " + getStopwords() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStopwords() == null) ? 0 : getStopwords().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeStopwordOptionsResult == false) return false;
        DescribeStopwordOptionsResult other = (DescribeStopwordOptionsResult)obj;
        
        if (other.getStopwords() == null ^ this.getStopwords() == null) return false;
        if (other.getStopwords() != null && other.getStopwords().equals(this.getStopwords()) == false) return false; 
        return true;
    }
    
}
    