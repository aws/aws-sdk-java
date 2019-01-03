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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/GetReservedNodeExchangeOfferings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReservedNodeExchangeOfferingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A string representing the node identifier for the DC1 Reserved Node to be exchanged.
     * </p>
     */
    private String reservedNodeId;
    /**
     * <p>
     * An integer setting the maximum number of ReservedNodeOfferings to retrieve.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * A value that indicates the starting point for the next set of ReservedNodeOfferings.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A string representing the node identifier for the DC1 Reserved Node to be exchanged.
     * </p>
     * 
     * @param reservedNodeId
     *        A string representing the node identifier for the DC1 Reserved Node to be exchanged.
     */

    public void setReservedNodeId(String reservedNodeId) {
        this.reservedNodeId = reservedNodeId;
    }

    /**
     * <p>
     * A string representing the node identifier for the DC1 Reserved Node to be exchanged.
     * </p>
     * 
     * @return A string representing the node identifier for the DC1 Reserved Node to be exchanged.
     */

    public String getReservedNodeId() {
        return this.reservedNodeId;
    }

    /**
     * <p>
     * A string representing the node identifier for the DC1 Reserved Node to be exchanged.
     * </p>
     * 
     * @param reservedNodeId
     *        A string representing the node identifier for the DC1 Reserved Node to be exchanged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservedNodeExchangeOfferingsRequest withReservedNodeId(String reservedNodeId) {
        setReservedNodeId(reservedNodeId);
        return this;
    }

    /**
     * <p>
     * An integer setting the maximum number of ReservedNodeOfferings to retrieve.
     * </p>
     * 
     * @param maxRecords
     *        An integer setting the maximum number of ReservedNodeOfferings to retrieve.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * An integer setting the maximum number of ReservedNodeOfferings to retrieve.
     * </p>
     * 
     * @return An integer setting the maximum number of ReservedNodeOfferings to retrieve.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * An integer setting the maximum number of ReservedNodeOfferings to retrieve.
     * </p>
     * 
     * @param maxRecords
     *        An integer setting the maximum number of ReservedNodeOfferings to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservedNodeExchangeOfferingsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of ReservedNodeOfferings.
     * </p>
     * 
     * @param marker
     *        A value that indicates the starting point for the next set of ReservedNodeOfferings.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of ReservedNodeOfferings.
     * </p>
     * 
     * @return A value that indicates the starting point for the next set of ReservedNodeOfferings.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of ReservedNodeOfferings.
     * </p>
     * 
     * @param marker
     *        A value that indicates the starting point for the next set of ReservedNodeOfferings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservedNodeExchangeOfferingsRequest withMarker(String marker) {
        setMarker(marker);
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
        if (getReservedNodeId() != null)
            sb.append("ReservedNodeId: ").append(getReservedNodeId()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReservedNodeExchangeOfferingsRequest == false)
            return false;
        GetReservedNodeExchangeOfferingsRequest other = (GetReservedNodeExchangeOfferingsRequest) obj;
        if (other.getReservedNodeId() == null ^ this.getReservedNodeId() == null)
            return false;
        if (other.getReservedNodeId() != null && other.getReservedNodeId().equals(this.getReservedNodeId()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservedNodeId() == null) ? 0 : getReservedNodeId().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public GetReservedNodeExchangeOfferingsRequest clone() {
        return (GetReservedNodeExchangeOfferingsRequest) super.clone();
    }

}
