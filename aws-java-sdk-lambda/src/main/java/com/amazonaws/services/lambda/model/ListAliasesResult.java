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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;

/**
 * List Aliases Result
 */
public class ListAliasesResult implements Serializable, Cloneable {

    /**
     * A string, present if there are more aliases.
     */
    private String nextMarker;

    /**
     * A list of aliases.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<AliasConfiguration> aliases;

    /**
     * A string, present if there are more aliases.
     *
     * @return A string, present if there are more aliases.
     */
    public String getNextMarker() {
        return nextMarker;
    }
    
    /**
     * A string, present if there are more aliases.
     *
     * @param nextMarker A string, present if there are more aliases.
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }
    
    /**
     * A string, present if there are more aliases.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextMarker A string, present if there are more aliases.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListAliasesResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * A list of aliases.
     *
     * @return A list of aliases.
     */
    public java.util.List<AliasConfiguration> getAliases() {
        if (aliases == null) {
              aliases = new com.amazonaws.internal.ListWithAutoConstructFlag<AliasConfiguration>();
              aliases.setAutoConstruct(true);
        }
        return aliases;
    }
    
    /**
     * A list of aliases.
     *
     * @param aliases A list of aliases.
     */
    public void setAliases(java.util.Collection<AliasConfiguration> aliases) {
        if (aliases == null) {
            this.aliases = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<AliasConfiguration> aliasesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AliasConfiguration>(aliases.size());
        aliasesCopy.addAll(aliases);
        this.aliases = aliasesCopy;
    }
    
    /**
     * A list of aliases.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAliases(java.util.Collection)} or {@link
     * #withAliases(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aliases A list of aliases.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListAliasesResult withAliases(AliasConfiguration... aliases) {
        if (getAliases() == null) setAliases(new java.util.ArrayList<AliasConfiguration>(aliases.length));
        for (AliasConfiguration value : aliases) {
            getAliases().add(value);
        }
        return this;
    }
    
    /**
     * A list of aliases.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aliases A list of aliases.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListAliasesResult withAliases(java.util.Collection<AliasConfiguration> aliases) {
        if (aliases == null) {
            this.aliases = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<AliasConfiguration> aliasesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AliasConfiguration>(aliases.size());
            aliasesCopy.addAll(aliases);
            this.aliases = aliasesCopy;
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
        if (getNextMarker() != null) sb.append("NextMarker: " + getNextMarker() + ",");
        if (getAliases() != null) sb.append("Aliases: " + getAliases() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode()); 
        hashCode = prime * hashCode + ((getAliases() == null) ? 0 : getAliases().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListAliasesResult == false) return false;
        ListAliasesResult other = (ListAliasesResult)obj;
        
        if (other.getNextMarker() == null ^ this.getNextMarker() == null) return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false) return false; 
        if (other.getAliases() == null ^ this.getAliases() == null) return false;
        if (other.getAliases() != null && other.getAliases().equals(this.getAliases()) == false) return false; 
        return true;
    }
    
    @Override
    public ListAliasesResult clone() {
        try {
            return (ListAliasesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    