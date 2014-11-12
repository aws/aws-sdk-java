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
public class ListGrantsResult implements Serializable {

    /**
     * A list of grants.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<GrantListEntry> grants;

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
     * more grants in the list.
     */
    private Boolean truncated;

    /**
     * A list of grants.
     *
     * @return A list of grants.
     */
    public java.util.List<GrantListEntry> getGrants() {
        if (grants == null) {
              grants = new com.amazonaws.internal.ListWithAutoConstructFlag<GrantListEntry>();
              grants.setAutoConstruct(true);
        }
        return grants;
    }
    
    /**
     * A list of grants.
     *
     * @param grants A list of grants.
     */
    public void setGrants(java.util.Collection<GrantListEntry> grants) {
        if (grants == null) {
            this.grants = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<GrantListEntry> grantsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<GrantListEntry>(grants.size());
        grantsCopy.addAll(grants);
        this.grants = grantsCopy;
    }
    
    /**
     * A list of grants.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param grants A list of grants.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListGrantsResult withGrants(GrantListEntry... grants) {
        if (getGrants() == null) setGrants(new java.util.ArrayList<GrantListEntry>(grants.length));
        for (GrantListEntry value : grants) {
            getGrants().add(value);
        }
        return this;
    }
    
    /**
     * A list of grants.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param grants A list of grants.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListGrantsResult withGrants(java.util.Collection<GrantListEntry> grants) {
        if (grants == null) {
            this.grants = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<GrantListEntry> grantsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<GrantListEntry>(grants.size());
            grantsCopy.addAll(grants);
            this.grants = grantsCopy;
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
    public ListGrantsResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * A flag that indicates whether there are more items in the list. If
     * your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more grants in the list.
     *
     * @return A flag that indicates whether there are more items in the list. If
     *         your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more grants in the list.
     */
    public Boolean isTruncated() {
        return truncated;
    }
    
    /**
     * A flag that indicates whether there are more items in the list. If
     * your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more grants in the list.
     *
     * @param truncated A flag that indicates whether there are more items in the list. If
     *         your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more grants in the list.
     */
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }
    
    /**
     * A flag that indicates whether there are more items in the list. If
     * your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more grants in the list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param truncated A flag that indicates whether there are more items in the list. If
     *         your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more grants in the list.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListGrantsResult withTruncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }

    /**
     * A flag that indicates whether there are more items in the list. If
     * your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more grants in the list.
     *
     * @return A flag that indicates whether there are more items in the list. If
     *         your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more grants in the list.
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
        if (getGrants() != null) sb.append("Grants: " + getGrants() + ",");
        if (getNextMarker() != null) sb.append("NextMarker: " + getNextMarker() + ",");
        if (isTruncated() != null) sb.append("Truncated: " + isTruncated() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGrants() == null) ? 0 : getGrants().hashCode()); 
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode()); 
        hashCode = prime * hashCode + ((isTruncated() == null) ? 0 : isTruncated().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListGrantsResult == false) return false;
        ListGrantsResult other = (ListGrantsResult)obj;
        
        if (other.getGrants() == null ^ this.getGrants() == null) return false;
        if (other.getGrants() != null && other.getGrants().equals(this.getGrants()) == false) return false; 
        if (other.getNextMarker() == null ^ this.getNextMarker() == null) return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false) return false; 
        if (other.isTruncated() == null ^ this.isTruncated() == null) return false;
        if (other.isTruncated() != null && other.isTruncated().equals(this.isTruncated()) == false) return false; 
        return true;
    }
    
}
    