/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;

/**
 * <p>
 * The result of a <code>DescribeSuggesters</code> request.
 * </p>
 */
public class DescribeSuggestersResult implements Serializable, Cloneable {

    /**
     * The suggesters configured for the domain specified in the request.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<SuggesterStatus> suggesters;

    /**
     * The suggesters configured for the domain specified in the request.
     *
     * @return The suggesters configured for the domain specified in the request.
     */
    public java.util.List<SuggesterStatus> getSuggesters() {
        if (suggesters == null) {
              suggesters = new com.amazonaws.internal.ListWithAutoConstructFlag<SuggesterStatus>();
              suggesters.setAutoConstruct(true);
        }
        return suggesters;
    }
    
    /**
     * The suggesters configured for the domain specified in the request.
     *
     * @param suggesters The suggesters configured for the domain specified in the request.
     */
    public void setSuggesters(java.util.Collection<SuggesterStatus> suggesters) {
        if (suggesters == null) {
            this.suggesters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<SuggesterStatus> suggestersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SuggesterStatus>(suggesters.size());
        suggestersCopy.addAll(suggesters);
        this.suggesters = suggestersCopy;
    }
    
    /**
     * The suggesters configured for the domain specified in the request.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSuggesters(java.util.Collection)} or {@link
     * #withSuggesters(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param suggesters The suggesters configured for the domain specified in the request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSuggestersResult withSuggesters(SuggesterStatus... suggesters) {
        if (getSuggesters() == null) setSuggesters(new java.util.ArrayList<SuggesterStatus>(suggesters.length));
        for (SuggesterStatus value : suggesters) {
            getSuggesters().add(value);
        }
        return this;
    }
    
    /**
     * The suggesters configured for the domain specified in the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param suggesters The suggesters configured for the domain specified in the request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSuggestersResult withSuggesters(java.util.Collection<SuggesterStatus> suggesters) {
        if (suggesters == null) {
            this.suggesters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<SuggesterStatus> suggestersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SuggesterStatus>(suggesters.size());
            suggestersCopy.addAll(suggesters);
            this.suggesters = suggestersCopy;
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
        if (getSuggesters() != null) sb.append("Suggesters: " + getSuggesters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSuggesters() == null) ? 0 : getSuggesters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeSuggestersResult == false) return false;
        DescribeSuggestersResult other = (DescribeSuggestersResult)obj;
        
        if (other.getSuggesters() == null ^ this.getSuggesters() == null) return false;
        if (other.getSuggesters() != null && other.getSuggesters().equals(this.getSuggesters()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeSuggestersResult clone() {
        try {
            return (DescribeSuggestersResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    