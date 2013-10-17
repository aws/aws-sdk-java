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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.storagegateway.AWSStorageGateway#listGateways(ListGatewaysRequest) ListGateways operation}.
 * <p>
 * This operation lists gateways owned by an AWS account in a region specified in the request. The returned list is ordered by gateway Amazon Resource
 * Name (ARN).
 * </p>
 * <p>
 * By default, the operation returns a maximum of 100 gateways. This operation supports pagination that allows you to optionally reduce the number of
 * gateways returned in a response.
 * </p>
 * <p>
 * If you have more gateways than are returned in a response-that is, the response returns only a truncated list of your gateways-the response contains a
 * marker that you can specify in your next request to fetch the next page of gateways.
 * </p>
 *
 * @see com.amazonaws.services.storagegateway.AWSStorageGateway#listGateways(ListGatewaysRequest)
 */
public class ListGatewaysRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * An opaque string that indicates the position at which to begin the
     * returned list of gateways.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String marker;

    /**
     * Specifies that the list of gateways returned be limited to the
     * specified number of items.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer limit;

    /**
     * An opaque string that indicates the position at which to begin the
     * returned list of gateways.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return An opaque string that indicates the position at which to begin the
     *         returned list of gateways.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An opaque string that indicates the position at which to begin the
     * returned list of gateways.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker An opaque string that indicates the position at which to begin the
     *         returned list of gateways.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An opaque string that indicates the position at which to begin the
     * returned list of gateways.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param marker An opaque string that indicates the position at which to begin the
     *         returned list of gateways.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListGatewaysRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Specifies that the list of gateways returned be limited to the
     * specified number of items.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return Specifies that the list of gateways returned be limited to the
     *         specified number of items.
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * Specifies that the list of gateways returned be limited to the
     * specified number of items.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit Specifies that the list of gateways returned be limited to the
     *         specified number of items.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * Specifies that the list of gateways returned be limited to the
     * specified number of items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit Specifies that the list of gateways returned be limited to the
     *         specified number of items.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListGatewaysRequest withLimit(Integer limit) {
        this.limit = limit;
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
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getLimit() != null) sb.append("Limit: " + getLimit() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListGatewaysRequest == false) return false;
        ListGatewaysRequest other = (ListGatewaysRequest)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        return true;
    }
    
}
    