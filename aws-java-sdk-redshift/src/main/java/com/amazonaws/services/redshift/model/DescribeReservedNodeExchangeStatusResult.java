/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeReservedNodeExchangeStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedNodeExchangeStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The details of the reserved-node exchange request, including the status, request time, source reserved-node
     * identifier, and additional details.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ReservedNodeExchangeStatus> reservedNodeExchangeStatusDetails;
    /**
     * <p>
     * A pagination token provided by a previous <code>DescribeReservedNodeExchangeStatus</code> request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The details of the reserved-node exchange request, including the status, request time, source reserved-node
     * identifier, and additional details.
     * </p>
     * 
     * @return The details of the reserved-node exchange request, including the status, request time, source
     *         reserved-node identifier, and additional details.
     */

    public java.util.List<ReservedNodeExchangeStatus> getReservedNodeExchangeStatusDetails() {
        if (reservedNodeExchangeStatusDetails == null) {
            reservedNodeExchangeStatusDetails = new com.amazonaws.internal.SdkInternalList<ReservedNodeExchangeStatus>();
        }
        return reservedNodeExchangeStatusDetails;
    }

    /**
     * <p>
     * The details of the reserved-node exchange request, including the status, request time, source reserved-node
     * identifier, and additional details.
     * </p>
     * 
     * @param reservedNodeExchangeStatusDetails
     *        The details of the reserved-node exchange request, including the status, request time, source
     *        reserved-node identifier, and additional details.
     */

    public void setReservedNodeExchangeStatusDetails(java.util.Collection<ReservedNodeExchangeStatus> reservedNodeExchangeStatusDetails) {
        if (reservedNodeExchangeStatusDetails == null) {
            this.reservedNodeExchangeStatusDetails = null;
            return;
        }

        this.reservedNodeExchangeStatusDetails = new com.amazonaws.internal.SdkInternalList<ReservedNodeExchangeStatus>(reservedNodeExchangeStatusDetails);
    }

    /**
     * <p>
     * The details of the reserved-node exchange request, including the status, request time, source reserved-node
     * identifier, and additional details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReservedNodeExchangeStatusDetails(java.util.Collection)} or
     * {@link #withReservedNodeExchangeStatusDetails(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param reservedNodeExchangeStatusDetails
     *        The details of the reserved-node exchange request, including the status, request time, source
     *        reserved-node identifier, and additional details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedNodeExchangeStatusResult withReservedNodeExchangeStatusDetails(ReservedNodeExchangeStatus... reservedNodeExchangeStatusDetails) {
        if (this.reservedNodeExchangeStatusDetails == null) {
            setReservedNodeExchangeStatusDetails(new com.amazonaws.internal.SdkInternalList<ReservedNodeExchangeStatus>(
                    reservedNodeExchangeStatusDetails.length));
        }
        for (ReservedNodeExchangeStatus ele : reservedNodeExchangeStatusDetails) {
            this.reservedNodeExchangeStatusDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details of the reserved-node exchange request, including the status, request time, source reserved-node
     * identifier, and additional details.
     * </p>
     * 
     * @param reservedNodeExchangeStatusDetails
     *        The details of the reserved-node exchange request, including the status, request time, source
     *        reserved-node identifier, and additional details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedNodeExchangeStatusResult withReservedNodeExchangeStatusDetails(
            java.util.Collection<ReservedNodeExchangeStatus> reservedNodeExchangeStatusDetails) {
        setReservedNodeExchangeStatusDetails(reservedNodeExchangeStatusDetails);
        return this;
    }

    /**
     * <p>
     * A pagination token provided by a previous <code>DescribeReservedNodeExchangeStatus</code> request.
     * </p>
     * 
     * @param marker
     *        A pagination token provided by a previous <code>DescribeReservedNodeExchangeStatus</code> request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A pagination token provided by a previous <code>DescribeReservedNodeExchangeStatus</code> request.
     * </p>
     * 
     * @return A pagination token provided by a previous <code>DescribeReservedNodeExchangeStatus</code> request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A pagination token provided by a previous <code>DescribeReservedNodeExchangeStatus</code> request.
     * </p>
     * 
     * @param marker
     *        A pagination token provided by a previous <code>DescribeReservedNodeExchangeStatus</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedNodeExchangeStatusResult withMarker(String marker) {
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
        if (getReservedNodeExchangeStatusDetails() != null)
            sb.append("ReservedNodeExchangeStatusDetails: ").append(getReservedNodeExchangeStatusDetails()).append(",");
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

        if (obj instanceof DescribeReservedNodeExchangeStatusResult == false)
            return false;
        DescribeReservedNodeExchangeStatusResult other = (DescribeReservedNodeExchangeStatusResult) obj;
        if (other.getReservedNodeExchangeStatusDetails() == null ^ this.getReservedNodeExchangeStatusDetails() == null)
            return false;
        if (other.getReservedNodeExchangeStatusDetails() != null
                && other.getReservedNodeExchangeStatusDetails().equals(this.getReservedNodeExchangeStatusDetails()) == false)
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

        hashCode = prime * hashCode + ((getReservedNodeExchangeStatusDetails() == null) ? 0 : getReservedNodeExchangeStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReservedNodeExchangeStatusResult clone() {
        try {
            return (DescribeReservedNodeExchangeStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
