/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchdomain.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a <code>Suggest</code> request.
 * </p>
 */
public class SuggestResult implements Serializable {

    /**
     * The status of a <code>SuggestRequest</code>. Contains the resource ID
     * (<code>rid</code>) and how long it took to process the request
     * (<code>timems</code>).
     */
    private SuggestStatus status;

    /**
     * Container for the matching search suggestion information.
     */
    private SuggestModel suggest;

    /**
     * The status of a <code>SuggestRequest</code>. Contains the resource ID
     * (<code>rid</code>) and how long it took to process the request
     * (<code>timems</code>).
     *
     * @return The status of a <code>SuggestRequest</code>. Contains the resource ID
     *         (<code>rid</code>) and how long it took to process the request
     *         (<code>timems</code>).
     */
    public SuggestStatus getStatus() {
        return status;
    }
    
    /**
     * The status of a <code>SuggestRequest</code>. Contains the resource ID
     * (<code>rid</code>) and how long it took to process the request
     * (<code>timems</code>).
     *
     * @param status The status of a <code>SuggestRequest</code>. Contains the resource ID
     *         (<code>rid</code>) and how long it took to process the request
     *         (<code>timems</code>).
     */
    public void setStatus(SuggestStatus status) {
        this.status = status;
    }
    
    /**
     * The status of a <code>SuggestRequest</code>. Contains the resource ID
     * (<code>rid</code>) and how long it took to process the request
     * (<code>timems</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status of a <code>SuggestRequest</code>. Contains the resource ID
     *         (<code>rid</code>) and how long it took to process the request
     *         (<code>timems</code>).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SuggestResult withStatus(SuggestStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Container for the matching search suggestion information.
     *
     * @return Container for the matching search suggestion information.
     */
    public SuggestModel getSuggest() {
        return suggest;
    }
    
    /**
     * Container for the matching search suggestion information.
     *
     * @param suggest Container for the matching search suggestion information.
     */
    public void setSuggest(SuggestModel suggest) {
        this.suggest = suggest;
    }
    
    /**
     * Container for the matching search suggestion information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param suggest Container for the matching search suggestion information.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SuggestResult withSuggest(SuggestModel suggest) {
        this.suggest = suggest;
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
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getSuggest() != null) sb.append("Suggest: " + getSuggest() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getSuggest() == null) ? 0 : getSuggest().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SuggestResult == false) return false;
        SuggestResult other = (SuggestResult)obj;
        
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getSuggest() == null ^ this.getSuggest() == null) return false;
        if (other.getSuggest() != null && other.getSuggest().equals(this.getSuggest()) == false) return false; 
        return true;
    }
    
}
    