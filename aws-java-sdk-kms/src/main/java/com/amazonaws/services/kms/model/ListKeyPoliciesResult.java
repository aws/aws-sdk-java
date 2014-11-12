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
public class ListKeyPoliciesResult implements Serializable {

    /**
     * A list of policy names. Currently, there is only one policy and it is
     * named "Default".
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> policyNames;

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
     * more policies in the list.
     */
    private Boolean truncated;

    /**
     * A list of policy names. Currently, there is only one policy and it is
     * named "Default".
     *
     * @return A list of policy names. Currently, there is only one policy and it is
     *         named "Default".
     */
    public java.util.List<String> getPolicyNames() {
        if (policyNames == null) {
              policyNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              policyNames.setAutoConstruct(true);
        }
        return policyNames;
    }
    
    /**
     * A list of policy names. Currently, there is only one policy and it is
     * named "Default".
     *
     * @param policyNames A list of policy names. Currently, there is only one policy and it is
     *         named "Default".
     */
    public void setPolicyNames(java.util.Collection<String> policyNames) {
        if (policyNames == null) {
            this.policyNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> policyNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(policyNames.size());
        policyNamesCopy.addAll(policyNames);
        this.policyNames = policyNamesCopy;
    }
    
    /**
     * A list of policy names. Currently, there is only one policy and it is
     * named "Default".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyNames A list of policy names. Currently, there is only one policy and it is
     *         named "Default".
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListKeyPoliciesResult withPolicyNames(String... policyNames) {
        if (getPolicyNames() == null) setPolicyNames(new java.util.ArrayList<String>(policyNames.length));
        for (String value : policyNames) {
            getPolicyNames().add(value);
        }
        return this;
    }
    
    /**
     * A list of policy names. Currently, there is only one policy and it is
     * named "Default".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyNames A list of policy names. Currently, there is only one policy and it is
     *         named "Default".
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListKeyPoliciesResult withPolicyNames(java.util.Collection<String> policyNames) {
        if (policyNames == null) {
            this.policyNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> policyNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(policyNames.size());
            policyNamesCopy.addAll(policyNames);
            this.policyNames = policyNamesCopy;
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
    public ListKeyPoliciesResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * A flag that indicates whether there are more items in the list. If
     * your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more policies in the list.
     *
     * @return A flag that indicates whether there are more items in the list. If
     *         your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more policies in the list.
     */
    public Boolean isTruncated() {
        return truncated;
    }
    
    /**
     * A flag that indicates whether there are more items in the list. If
     * your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more policies in the list.
     *
     * @param truncated A flag that indicates whether there are more items in the list. If
     *         your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more policies in the list.
     */
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }
    
    /**
     * A flag that indicates whether there are more items in the list. If
     * your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more policies in the list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param truncated A flag that indicates whether there are more items in the list. If
     *         your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more policies in the list.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListKeyPoliciesResult withTruncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }

    /**
     * A flag that indicates whether there are more items in the list. If
     * your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more policies in the list.
     *
     * @return A flag that indicates whether there are more items in the list. If
     *         your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more policies in the list.
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
        if (getPolicyNames() != null) sb.append("PolicyNames: " + getPolicyNames() + ",");
        if (getNextMarker() != null) sb.append("NextMarker: " + getNextMarker() + ",");
        if (isTruncated() != null) sb.append("Truncated: " + isTruncated() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPolicyNames() == null) ? 0 : getPolicyNames().hashCode()); 
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode()); 
        hashCode = prime * hashCode + ((isTruncated() == null) ? 0 : isTruncated().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListKeyPoliciesResult == false) return false;
        ListKeyPoliciesResult other = (ListKeyPoliciesResult)obj;
        
        if (other.getPolicyNames() == null ^ this.getPolicyNames() == null) return false;
        if (other.getPolicyNames() != null && other.getPolicyNames().equals(this.getPolicyNames()) == false) return false; 
        if (other.getNextMarker() == null ^ this.getNextMarker() == null) return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false) return false; 
        if (other.isTruncated() == null ^ this.isTruncated() == null) return false;
        if (other.isTruncated() != null && other.isTruncated().equals(this.isTruncated()) == false) return false; 
        return true;
    }
    
}
    