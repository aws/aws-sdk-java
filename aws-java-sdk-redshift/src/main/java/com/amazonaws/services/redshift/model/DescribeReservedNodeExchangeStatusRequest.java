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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeReservedNodeExchangeStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedNodeExchangeStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the source reserved node in a reserved-node exchange request.
     * </p>
     */
    private String reservedNodeId;
    /**
     * <p>
     * The identifier of the reserved-node exchange request.
     * </p>
     */
    private String reservedNodeExchangeRequestId;
    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>Marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeReservedNodeExchangeStatus</code> request. If
     * this parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * the <code>MaxRecords</code> parameter. You can retrieve the next set of response records by providing the
     * returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The identifier of the source reserved node in a reserved-node exchange request.
     * </p>
     * 
     * @param reservedNodeId
     *        The identifier of the source reserved node in a reserved-node exchange request.
     */

    public void setReservedNodeId(String reservedNodeId) {
        this.reservedNodeId = reservedNodeId;
    }

    /**
     * <p>
     * The identifier of the source reserved node in a reserved-node exchange request.
     * </p>
     * 
     * @return The identifier of the source reserved node in a reserved-node exchange request.
     */

    public String getReservedNodeId() {
        return this.reservedNodeId;
    }

    /**
     * <p>
     * The identifier of the source reserved node in a reserved-node exchange request.
     * </p>
     * 
     * @param reservedNodeId
     *        The identifier of the source reserved node in a reserved-node exchange request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedNodeExchangeStatusRequest withReservedNodeId(String reservedNodeId) {
        setReservedNodeId(reservedNodeId);
        return this;
    }

    /**
     * <p>
     * The identifier of the reserved-node exchange request.
     * </p>
     * 
     * @param reservedNodeExchangeRequestId
     *        The identifier of the reserved-node exchange request.
     */

    public void setReservedNodeExchangeRequestId(String reservedNodeExchangeRequestId) {
        this.reservedNodeExchangeRequestId = reservedNodeExchangeRequestId;
    }

    /**
     * <p>
     * The identifier of the reserved-node exchange request.
     * </p>
     * 
     * @return The identifier of the reserved-node exchange request.
     */

    public String getReservedNodeExchangeRequestId() {
        return this.reservedNodeExchangeRequestId;
    }

    /**
     * <p>
     * The identifier of the reserved-node exchange request.
     * </p>
     * 
     * @param reservedNodeExchangeRequestId
     *        The identifier of the reserved-node exchange request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedNodeExchangeStatusRequest withReservedNodeExchangeRequestId(String reservedNodeExchangeRequestId) {
        setReservedNodeExchangeRequestId(reservedNodeExchangeRequestId);
        return this;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>Marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of response records to return in each call. If the number of remaining response records
     *        exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>Marker</code> field of
     *        the response. You can retrieve the next set of records by retrying the command with the returned marker
     *        value.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>Marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     * 
     * @return The maximum number of response records to return in each call. If the number of remaining response
     *         records exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>Marker</code>
     *         field of the response. You can retrieve the next set of records by retrying the command with the returned
     *         marker value.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>Marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of response records to return in each call. If the number of remaining response records
     *        exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>Marker</code> field of
     *        the response. You can retrieve the next set of records by retrying the command with the returned marker
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedNodeExchangeStatusRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeReservedNodeExchangeStatus</code> request. If
     * this parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * the <code>MaxRecords</code> parameter. You can retrieve the next set of response records by providing the
     * returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeReservedNodeExchangeStatus</code>
     *        request. If this parameter is specified, the response includes only records beyond the marker, up to the
     *        value specified by the <code>MaxRecords</code> parameter. You can retrieve the next set of response
     *        records by providing the returned marker value in the <code>Marker</code> parameter and retrying the
     *        request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeReservedNodeExchangeStatus</code> request. If
     * this parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * the <code>MaxRecords</code> parameter. You can retrieve the next set of response records by providing the
     * returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * 
     * @return An optional pagination token provided by a previous <code>DescribeReservedNodeExchangeStatus</code>
     *         request. If this parameter is specified, the response includes only records beyond the marker, up to the
     *         value specified by the <code>MaxRecords</code> parameter. You can retrieve the next set of response
     *         records by providing the returned marker value in the <code>Marker</code> parameter and retrying the
     *         request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeReservedNodeExchangeStatus</code> request. If
     * this parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * the <code>MaxRecords</code> parameter. You can retrieve the next set of response records by providing the
     * returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeReservedNodeExchangeStatus</code>
     *        request. If this parameter is specified, the response includes only records beyond the marker, up to the
     *        value specified by the <code>MaxRecords</code> parameter. You can retrieve the next set of response
     *        records by providing the returned marker value in the <code>Marker</code> parameter and retrying the
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedNodeExchangeStatusRequest withMarker(String marker) {
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
        if (getReservedNodeExchangeRequestId() != null)
            sb.append("ReservedNodeExchangeRequestId: ").append(getReservedNodeExchangeRequestId()).append(",");
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

        if (obj instanceof DescribeReservedNodeExchangeStatusRequest == false)
            return false;
        DescribeReservedNodeExchangeStatusRequest other = (DescribeReservedNodeExchangeStatusRequest) obj;
        if (other.getReservedNodeId() == null ^ this.getReservedNodeId() == null)
            return false;
        if (other.getReservedNodeId() != null && other.getReservedNodeId().equals(this.getReservedNodeId()) == false)
            return false;
        if (other.getReservedNodeExchangeRequestId() == null ^ this.getReservedNodeExchangeRequestId() == null)
            return false;
        if (other.getReservedNodeExchangeRequestId() != null
                && other.getReservedNodeExchangeRequestId().equals(this.getReservedNodeExchangeRequestId()) == false)
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
        hashCode = prime * hashCode + ((getReservedNodeExchangeRequestId() == null) ? 0 : getReservedNodeExchangeRequestId().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReservedNodeExchangeStatusRequest clone() {
        return (DescribeReservedNodeExchangeStatusRequest) super.clone();
    }

}
