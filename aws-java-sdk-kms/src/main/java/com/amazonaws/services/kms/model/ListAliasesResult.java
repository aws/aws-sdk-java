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
package com.amazonaws.services.kms.model;

import java.io.Serializable;

/**
 * 
 */
public class ListAliasesResult implements Serializable {

    /**
     * A list of key aliases in the user's account.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<AliasListEntry> aliases;

    /**
     * If <code>Truncated</code> is true, this value is present and contains
     * the value to use for the <code>Marker</code> request parameter in a
     * subsequent pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]*<br/>
     */
    private String nextMarker;

    /**
     * A flag that indicates whether there are more items in the list. If
     * your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more aliases in the list.
     */
    private Boolean truncated;

    /**
     * A list of key aliases in the user's account.
     *
     * @return A list of key aliases in the user's account.
     */
    public java.util.List<AliasListEntry> getAliases() {
        if (aliases == null) {
              aliases = new com.amazonaws.internal.ListWithAutoConstructFlag<AliasListEntry>();
              aliases.setAutoConstruct(true);
        }
        return aliases;
    }
    
    /**
     * A list of key aliases in the user's account.
     *
     * @param aliases A list of key aliases in the user's account.
     */
    public void setAliases(java.util.Collection<AliasListEntry> aliases) {
        if (aliases == null) {
            this.aliases = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<AliasListEntry> aliasesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AliasListEntry>(aliases.size());
        aliasesCopy.addAll(aliases);
        this.aliases = aliasesCopy;
    }
    
    /**
     * A list of key aliases in the user's account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aliases A list of key aliases in the user's account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListAliasesResult withAliases(AliasListEntry... aliases) {
        if (getAliases() == null) setAliases(new java.util.ArrayList<AliasListEntry>(aliases.length));
        for (AliasListEntry value : aliases) {
            getAliases().add(value);
        }
        return this;
    }
    
    /**
     * A list of key aliases in the user's account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aliases A list of key aliases in the user's account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListAliasesResult withAliases(java.util.Collection<AliasListEntry> aliases) {
        if (aliases == null) {
            this.aliases = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<AliasListEntry> aliasesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AliasListEntry>(aliases.size());
            aliasesCopy.addAll(aliases);
            this.aliases = aliasesCopy;
        }

        return this;
    }

    /**
     * If <code>Truncated</code> is true, this value is present and contains
     * the value to use for the <code>Marker</code> request parameter in a
     * subsequent pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]*<br/>
     *
     * @return If <code>Truncated</code> is true, this value is present and contains
     *         the value to use for the <code>Marker</code> request parameter in a
     *         subsequent pagination request.
     */
    public String getNextMarker() {
        return nextMarker;
    }
    
    /**
     * If <code>Truncated</code> is true, this value is present and contains
     * the value to use for the <code>Marker</code> request parameter in a
     * subsequent pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]*<br/>
     *
     * @param nextMarker If <code>Truncated</code> is true, this value is present and contains
     *         the value to use for the <code>Marker</code> request parameter in a
     *         subsequent pagination request.
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }
    
    /**
     * If <code>Truncated</code> is true, this value is present and contains
     * the value to use for the <code>Marker</code> request parameter in a
     * subsequent pagination request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]*<br/>
     *
     * @param nextMarker If <code>Truncated</code> is true, this value is present and contains
     *         the value to use for the <code>Marker</code> request parameter in a
     *         subsequent pagination request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListAliasesResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * A flag that indicates whether there are more items in the list. If
     * your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more aliases in the list.
     *
     * @return A flag that indicates whether there are more items in the list. If
     *         your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more aliases in the list.
     */
    public Boolean isTruncated() {
        return truncated;
    }
    
    /**
     * A flag that indicates whether there are more items in the list. If
     * your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more aliases in the list.
     *
     * @param truncated A flag that indicates whether there are more items in the list. If
     *         your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more aliases in the list.
     */
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }
    
    /**
     * A flag that indicates whether there are more items in the list. If
     * your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more aliases in the list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param truncated A flag that indicates whether there are more items in the list. If
     *         your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more aliases in the list.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListAliasesResult withTruncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }

    /**
     * A flag that indicates whether there are more items in the list. If
     * your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more aliases in the list.
     *
     * @return A flag that indicates whether there are more items in the list. If
     *         your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more aliases in the list.
     */
    public Boolean getTruncated() {
        return truncated;
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
        if (getAliases() != null) sb.append("Aliases: " + getAliases() + ",");
        if (getNextMarker() != null) sb.append("NextMarker: " + getNextMarker() + ",");
        if (isTruncated() != null) sb.append("Truncated: " + isTruncated() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAliases() == null) ? 0 : getAliases().hashCode()); 
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode()); 
        hashCode = prime * hashCode + ((isTruncated() == null) ? 0 : isTruncated().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListAliasesResult == false) return false;
        ListAliasesResult other = (ListAliasesResult)obj;
        
        if (other.getAliases() == null ^ this.getAliases() == null) return false;
        if (other.getAliases() != null && other.getAliases().equals(this.getAliases()) == false) return false; 
        if (other.getNextMarker() == null ^ this.getNextMarker() == null) return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false) return false; 
        if (other.isTruncated() == null ^ this.isTruncated() == null) return false;
        if (other.isTruncated() != null && other.isTruncated().equals(this.isTruncated()) == false) return false; 
        return true;
    }
    
}
    