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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * The ID of the prefix.
 * </p>
 */
public class PrefixListId implements Serializable, Cloneable {

    /**
     * The ID of the prefix.
     */
    private String prefixListId;

    /**
     * The ID of the prefix.
     *
     * @return The ID of the prefix.
     */
    public String getPrefixListId() {
        return prefixListId;
    }
    
    /**
     * The ID of the prefix.
     *
     * @param prefixListId The ID of the prefix.
     */
    public void setPrefixListId(String prefixListId) {
        this.prefixListId = prefixListId;
    }
    
    /**
     * The ID of the prefix.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param prefixListId The ID of the prefix.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PrefixListId withPrefixListId(String prefixListId) {
        this.prefixListId = prefixListId;
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
        if (getPrefixListId() != null) sb.append("PrefixListId: " + getPrefixListId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPrefixListId() == null) ? 0 : getPrefixListId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PrefixListId == false) return false;
        PrefixListId other = (PrefixListId)obj;
        
        if (other.getPrefixListId() == null ^ this.getPrefixListId() == null) return false;
        if (other.getPrefixListId() != null && other.getPrefixListId().equals(this.getPrefixListId()) == false) return false; 
        return true;
    }
    
    @Override
    public PrefixListId clone() {
        try {
            return (PrefixListId) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    