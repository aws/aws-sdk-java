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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;


/**
 * <p>
 * Used to filter the workflow executions in visibility APIs based on a tag.
 * </p>
 */
public class TagFilter implements Serializable {

    /**
     * Specifies the tag that must be associated with the execution for it to
     * meet the filter criteria. This field is required.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String tag;

    /**
     * Specifies the tag that must be associated with the execution for it to
     * meet the filter criteria. This field is required.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return Specifies the tag that must be associated with the execution for it to
     *         meet the filter criteria. This field is required.
     */
    public String getTag() {
        return tag;
    }
    
    /**
     * Specifies the tag that must be associated with the execution for it to
     * meet the filter criteria. This field is required.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param tag Specifies the tag that must be associated with the execution for it to
     *         meet the filter criteria. This field is required.
     */
    public void setTag(String tag) {
        this.tag = tag;
    }
    
    /**
     * Specifies the tag that must be associated with the execution for it to
     * meet the filter criteria. This field is required.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param tag Specifies the tag that must be associated with the execution for it to
     *         meet the filter criteria. This field is required.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TagFilter withTag(String tag) {
        this.tag = tag;
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
        if (getTag() != null) sb.append("Tag: " + getTag() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTag() == null) ? 0 : getTag().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TagFilter == false) return false;
        TagFilter other = (TagFilter)obj;
        
        if (other.getTag() == null ^ this.getTag() == null) return false;
        if (other.getTag() != null && other.getTag().equals(this.getTag()) == false) return false; 
        return true;
    }
    
}
    