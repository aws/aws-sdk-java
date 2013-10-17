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
 * A response message that contains the status of an updated default search field.
 * </p>
 */
public class UpdateDefaultSearchFieldResult implements Serializable {

    /**
     * The value of the <code>DefaultSearchField</code> configured for this
     * search domain and its current status.
     */
    private DefaultSearchFieldStatus defaultSearchField;

    /**
     * The value of the <code>DefaultSearchField</code> configured for this
     * search domain and its current status.
     *
     * @return The value of the <code>DefaultSearchField</code> configured for this
     *         search domain and its current status.
     */
    public DefaultSearchFieldStatus getDefaultSearchField() {
        return defaultSearchField;
    }
    
    /**
     * The value of the <code>DefaultSearchField</code> configured for this
     * search domain and its current status.
     *
     * @param defaultSearchField The value of the <code>DefaultSearchField</code> configured for this
     *         search domain and its current status.
     */
    public void setDefaultSearchField(DefaultSearchFieldStatus defaultSearchField) {
        this.defaultSearchField = defaultSearchField;
    }
    
    /**
     * The value of the <code>DefaultSearchField</code> configured for this
     * search domain and its current status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultSearchField The value of the <code>DefaultSearchField</code> configured for this
     *         search domain and its current status.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateDefaultSearchFieldResult withDefaultSearchField(DefaultSearchFieldStatus defaultSearchField) {
        this.defaultSearchField = defaultSearchField;
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
        if (getDefaultSearchField() != null) sb.append("DefaultSearchField: " + getDefaultSearchField() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDefaultSearchField() == null) ? 0 : getDefaultSearchField().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateDefaultSearchFieldResult == false) return false;
        UpdateDefaultSearchFieldResult other = (UpdateDefaultSearchFieldResult)obj;
        
        if (other.getDefaultSearchField() == null ^ this.getDefaultSearchField() == null) return false;
        if (other.getDefaultSearchField() != null && other.getDefaultSearchField().equals(this.getDefaultSearchField()) == false) return false; 
        return true;
    }
    
}
    