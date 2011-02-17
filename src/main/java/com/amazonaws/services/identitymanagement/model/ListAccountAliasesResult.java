/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains the result of a successful invocation of the
 * ListAccountAliases action.
 * </p>
 */
public class ListAccountAliasesResult {

    /**
     * 
     */
    private java.util.List<String> accountAliases;

    /**
     * A flag that indicates whether there are more account aliases to list.
     * If your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more account aliases in the list.
     */
    private Boolean isTruncated;

    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     */
    private String marker;

    /**
     * 
     *
     * @return 
     */
    public java.util.List<String> getAccountAliases() {
        if (accountAliases == null) {
            accountAliases = new java.util.ArrayList<String>();
        }
        return accountAliases;
    }
    
    /**
     * 
     *
     * @param accountAliases 
     */
    public void setAccountAliases(java.util.Collection<String> accountAliases) {
        java.util.List<String> accountAliasesCopy = new java.util.ArrayList<String>();
        if (accountAliases != null) {
            accountAliasesCopy.addAll(accountAliases);
        }
        this.accountAliases = accountAliasesCopy;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountAliases 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListAccountAliasesResult withAccountAliases(String... accountAliases) {
        for (String value : accountAliases) {
            getAccountAliases().add(value);
        }
        return this;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountAliases 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListAccountAliasesResult withAccountAliases(java.util.Collection<String> accountAliases) {
        java.util.List<String> accountAliasesCopy = new java.util.ArrayList<String>();
        if (accountAliases != null) {
            accountAliasesCopy.addAll(accountAliases);
        }
        this.accountAliases = accountAliasesCopy;

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
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @return 
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @param marker 
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @param marker 
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
        sb.append("AccountAliases: " + accountAliases + ", ");
        sb.append("IsTruncated: " + isTruncated + ", ");
        sb.append("Marker: " + marker + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    