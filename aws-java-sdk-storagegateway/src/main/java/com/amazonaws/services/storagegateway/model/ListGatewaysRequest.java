/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A JSON object containing zero or more of the following fields:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListGatewaysInput$Limit</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListGatewaysInput$Marker</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListGateways" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGatewaysRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An opaque string that indicates the position at which to begin the returned list of gateways.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Specifies that the list of gateways returned be limited to the specified number of items.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * An opaque string that indicates the position at which to begin the returned list of gateways.
     * </p>
     * 
     * @param marker
     *        An opaque string that indicates the position at which to begin the returned list of gateways.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin the returned list of gateways.
     * </p>
     * 
     * @return An opaque string that indicates the position at which to begin the returned list of gateways.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An opaque string that indicates the position at which to begin the returned list of gateways.
     * </p>
     * 
     * @param marker
     *        An opaque string that indicates the position at which to begin the returned list of gateways.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGatewaysRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Specifies that the list of gateways returned be limited to the specified number of items.
     * </p>
     * 
     * @param limit
     *        Specifies that the list of gateways returned be limited to the specified number of items.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Specifies that the list of gateways returned be limited to the specified number of items.
     * </p>
     * 
     * @return Specifies that the list of gateways returned be limited to the specified number of items.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Specifies that the list of gateways returned be limited to the specified number of items.
     * </p>
     * 
     * @param limit
     *        Specifies that the list of gateways returned be limited to the specified number of items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGatewaysRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGatewaysRequest == false)
            return false;
        ListGatewaysRequest other = (ListGatewaysRequest) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
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
    public ListGatewaysRequest clone() {
        return (ListGatewaysRequest) super.clone();
    }

}
