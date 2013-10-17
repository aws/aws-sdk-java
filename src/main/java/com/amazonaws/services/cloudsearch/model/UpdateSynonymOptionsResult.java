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
 * A response message that contains the status of updated synonym options.
 * </p>
 */
public class UpdateSynonymOptionsResult implements Serializable {

    /**
     * The synonym options configured for this search domain and the current
     * status of those options.
     */
    private SynonymOptionsStatus synonyms;

    /**
     * The synonym options configured for this search domain and the current
     * status of those options.
     *
     * @return The synonym options configured for this search domain and the current
     *         status of those options.
     */
    public SynonymOptionsStatus getSynonyms() {
        return synonyms;
    }
    
    /**
     * The synonym options configured for this search domain and the current
     * status of those options.
     *
     * @param synonyms The synonym options configured for this search domain and the current
     *         status of those options.
     */
    public void setSynonyms(SynonymOptionsStatus synonyms) {
        this.synonyms = synonyms;
    }
    
    /**
     * The synonym options configured for this search domain and the current
     * status of those options.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param synonyms The synonym options configured for this search domain and the current
     *         status of those options.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateSynonymOptionsResult withSynonyms(SynonymOptionsStatus synonyms) {
        this.synonyms = synonyms;
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
        if (getSynonyms() != null) sb.append("Synonyms: " + getSynonyms() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSynonyms() == null) ? 0 : getSynonyms().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateSynonymOptionsResult == false) return false;
        UpdateSynonymOptionsResult other = (UpdateSynonymOptionsResult)obj;
        
        if (other.getSynonyms() == null ^ this.getSynonyms() == null) return false;
        if (other.getSynonyms() != null && other.getSynonyms().equals(this.getSynonyms()) == false) return false; 
        return true;
    }
    
}
    