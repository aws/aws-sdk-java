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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#getAccountAuthorizationDetails(GetAccountAuthorizationDetailsRequest) GetAccountAuthorizationDetails operation}.
 * <p>
 * Retrieves information about all IAM users, groups, and roles in your
 * account, including their relationships to one another and their
 * policies. Use this API to obtain a snapshot of the configuration of
 * IAM permissions (users, groups, roles, and their policies) in your
 * account.
 * </p>
 * <p>
 * You can optionally filter the results using the <code>Filter</code>
 * parameter. You can paginate the results using the
 * <code>MaxItems</code> and <code>Marker</code> parameters.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#getAccountAuthorizationDetails(GetAccountAuthorizationDetailsRequest)
 */
public class GetAccountAuthorizationDetailsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A list of entity types (user, group, or role) for filtering the
     * results.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> filter;

    /**
     * Use this only when paginating results to indicate the maximum number
     * of items you want in the response. If there are additional items
     * beyond the maximum you specify, the <code>IsTruncated</code> response
     * element is <code>true</code>. This parameter is optional. If you do
     * not include it, it defaults to 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxItems;

    /**
     * Use this only when paginating results, and only in a subsequent
     * request after you've received a response where the results are
     * truncated. Set it to the value of the <code>Marker</code> element in
     * the response you just received.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]*<br/>
     */
    private String marker;

    /**
     * A list of entity types (user, group, or role) for filtering the
     * results.
     *
     * @return A list of entity types (user, group, or role) for filtering the
     *         results.
     */
    public java.util.List<String> getFilter() {
        if (filter == null) {
              filter = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              filter.setAutoConstruct(true);
        }
        return filter;
    }
    
    /**
     * A list of entity types (user, group, or role) for filtering the
     * results.
     *
     * @param filter A list of entity types (user, group, or role) for filtering the
     *         results.
     */
    public void setFilter(java.util.Collection<String> filter) {
        if (filter == null) {
            this.filter = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> filterCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(filter.size());
        filterCopy.addAll(filter);
        this.filter = filterCopy;
    }
    
    /**
     * A list of entity types (user, group, or role) for filtering the
     * results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filter A list of entity types (user, group, or role) for filtering the
     *         results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetAccountAuthorizationDetailsRequest withFilter(String... filter) {
        if (getFilter() == null) setFilter(new java.util.ArrayList<String>(filter.length));
        for (String value : filter) {
            getFilter().add(value);
        }
        return this;
    }
    
    /**
     * A list of entity types (user, group, or role) for filtering the
     * results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filter A list of entity types (user, group, or role) for filtering the
     *         results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetAccountAuthorizationDetailsRequest withFilter(java.util.Collection<String> filter) {
        if (filter == null) {
            this.filter = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> filterCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(filter.size());
            filterCopy.addAll(filter);
            this.filter = filterCopy;
        }

        return this;
    }

    /**
     * A list of entity types (user, group, or role) for filtering the
     * results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filter A list of entity types (user, group, or role) for filtering the
     *         results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetAccountAuthorizationDetailsRequest withFilter(EntityType... filter) {
        java.util.ArrayList<String> filterCopy = new java.util.ArrayList<String>(filter.length);
        for (EntityType member : filter) {
            filterCopy.add(member.toString());
        }
        if (getFilter() == null) {
            setFilter(filterCopy);
        } else {
            getFilter().addAll(filterCopy);
        }
        return this;
    }

    /**
     * Use this only when paginating results to indicate the maximum number
     * of items you want in the response. If there are additional items
     * beyond the maximum you specify, the <code>IsTruncated</code> response
     * element is <code>true</code>. This parameter is optional. If you do
     * not include it, it defaults to 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return Use this only when paginating results to indicate the maximum number
     *         of items you want in the response. If there are additional items
     *         beyond the maximum you specify, the <code>IsTruncated</code> response
     *         element is <code>true</code>. This parameter is optional. If you do
     *         not include it, it defaults to 100.
     */
    public Integer getMaxItems() {
        return maxItems;
    }
    
    /**
     * Use this only when paginating results to indicate the maximum number
     * of items you want in the response. If there are additional items
     * beyond the maximum you specify, the <code>IsTruncated</code> response
     * element is <code>true</code>. This parameter is optional. If you do
     * not include it, it defaults to 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxItems Use this only when paginating results to indicate the maximum number
     *         of items you want in the response. If there are additional items
     *         beyond the maximum you specify, the <code>IsTruncated</code> response
     *         element is <code>true</code>. This parameter is optional. If you do
     *         not include it, it defaults to 100.
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * Use this only when paginating results to indicate the maximum number
     * of items you want in the response. If there are additional items
     * beyond the maximum you specify, the <code>IsTruncated</code> response
     * element is <code>true</code>. This parameter is optional. If you do
     * not include it, it defaults to 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxItems Use this only when paginating results to indicate the maximum number
     *         of items you want in the response. If there are additional items
     *         beyond the maximum you specify, the <code>IsTruncated</code> response
     *         element is <code>true</code>. This parameter is optional. If you do
     *         not include it, it defaults to 100.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetAccountAuthorizationDetailsRequest withMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }

    /**
     * Use this only when paginating results, and only in a subsequent
     * request after you've received a response where the results are
     * truncated. Set it to the value of the <code>Marker</code> element in
     * the response you just received.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]*<br/>
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
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]*<br/>
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
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]*<br/>
     *
     * @param marker Use this only when paginating results, and only in a subsequent
     *         request after you've received a response where the results are
     *         truncated. Set it to the value of the <code>Marker</code> element in
     *         the response you just received.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetAccountAuthorizationDetailsRequest withMarker(String marker) {
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
        if (getFilter() != null) sb.append("Filter: " + getFilter() + ",");
        if (getMaxItems() != null) sb.append("MaxItems: " + getMaxItems() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode()); 
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetAccountAuthorizationDetailsRequest == false) return false;
        GetAccountAuthorizationDetailsRequest other = (GetAccountAuthorizationDetailsRequest)obj;
        
        if (other.getFilter() == null ^ this.getFilter() == null) return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    