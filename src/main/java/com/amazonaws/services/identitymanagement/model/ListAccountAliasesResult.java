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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the result of a successful invocation of the ListAccountAliases action.
 * </p>
 */
public class ListAccountAliasesResult implements Serializable {

    /**
     * A list of aliases associated with the account.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> accountAliases;

    /**
     * A flag that indicates whether there are more account aliases to list.
     * If your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more account aliases in the list.
     */
    private Boolean isTruncated;

    /**
     * Use this only when paginating results, and only in a subsequent
     * request after you've received a response where the results are
     * truncated. Set it to the value of the <code>Marker</code> element in
     * the response you just received.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     */
    private String marker;

    /**
     * A list of aliases associated with the account.
     *
     * @return A list of aliases associated with the account.
     */
    public java.util.List<String> getAccountAliases() {
        if (accountAliases == null) {
              accountAliases = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              accountAliases.setAutoConstruct(true);
        }
        return accountAliases;
    }
    
    /**
     * A list of aliases associated with the account.
     *
     * @param accountAliases A list of aliases associated with the account.
     */
    public void setAccountAliases(java.util.Collection<String> accountAliases) {
        if (accountAliases == null) {
            this.accountAliases = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> accountAliasesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(accountAliases.size());
        accountAliasesCopy.addAll(accountAliases);
        this.accountAliases = accountAliasesCopy;
    }
    
    /**
     * A list of aliases associated with the account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountAliases A list of aliases associated with the account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListAccountAliasesResult withAccountAliases(String... accountAliases) {
        if (getAccountAliases() == null) setAccountAliases(new java.util.ArrayList<String>(accountAliases.length));
        for (String value : accountAliases) {
            getAccountAliases().add(value);
        }
        return this;
    }
    
    /**
     * A list of aliases associated with the account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountAliases A list of aliases associated with the account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListAccountAliasesResult withAccountAliases(java.util.Collection<String> accountAliases) {
        if (accountAliases == null) {
            this.accountAliases = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> accountAliasesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(accountAliases.size());
            accountAliasesCopy.addAll(accountAliases);
            this.accountAliases = accountAliasesCopy;
        }

        return this;
    }

    /**
     * A flag that indicates whether there are more account aliases to list.
     * If your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more account aliases in the list.
     *
     * @return A flag that indicates whether there are more account aliases to list.
     *         If your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more account aliases in the list.
     */
    public Boolean isTruncated() {
        return isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more account aliases to list.
     * If your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more account aliases in the list.
     *
     * @param isTruncated A flag that indicates whether there are more account aliases to list.
     *         If your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more account aliases in the list.
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more account aliases to list.
     * If your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more account aliases in the list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isTruncated A flag that indicates whether there are more account aliases to list.
     *         If your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more account aliases in the list.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListAccountAliasesResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * A flag that indicates whether there are more account aliases to list.
     * If your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more account aliases in the list.
     *
     * @return A flag that indicates whether there are more account aliases to list.
     *         If your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more account aliases in the list.
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * Use this only when paginating results, and only in a subsequent
     * request after you've received a response where the results are
     * truncated. Set it to the value of the <code>Marker</code> element in
     * the response you just received.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @return Use this only when paginating results, and only in a subsequent
     *         request after you've received a response where the results are
     *         truncated. Set it to the value of the <code>Marker</code> element in
     *         the response you just received.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Use this only when paginating results, and only in a subsequent
     * request after you've received a response where the results are
     * truncated. Set it to the value of the <code>Marker</code> element in
     * the response you just received.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @param marker Use this only when paginating results, and only in a subsequent
     *         request after you've received a response where the results are
     *         truncated. Set it to the value of the <code>Marker</code> element in
     *         the response you just received.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Use this only when paginating results, and only in a subsequent
     * request after you've received a response where the results are
     * truncated. Set it to the value of the <code>Marker</code> element in
     * the response you just received.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @param marker Use this only when paginating results, and only in a subsequent
     *         request after you've received a response where the results are
     *         truncated. Set it to the value of the <code>Marker</code> element in
     *         the response you just received.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListAccountAliasesResult withMarker(String marker) {
        this.marker = marker;
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
        if (getAccountAliases() != null) sb.append("AccountAliases: " + getAccountAliases() + ",");
        if (isTruncated() != null) sb.append("IsTruncated: " + isTruncated() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAccountAliases() == null) ? 0 : getAccountAliases().hashCode()); 
        hashCode = prime * hashCode + ((isTruncated() == null) ? 0 : isTruncated().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListAccountAliasesResult == false) return false;
        ListAccountAliasesResult other = (ListAccountAliasesResult)obj;
        
        if (other.getAccountAliases() == null ^ this.getAccountAliases() == null) return false;
        if (other.getAccountAliases() != null && other.getAccountAliases().equals(this.getAccountAliases()) == false) return false; 
        if (other.isTruncated() == null ^ this.isTruncated() == null) return false;
        if (other.isTruncated() != null && other.isTruncated().equals(this.isTruncated()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    