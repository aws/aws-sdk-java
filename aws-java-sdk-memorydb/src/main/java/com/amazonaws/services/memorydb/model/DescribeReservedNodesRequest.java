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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeReservedNodes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedNodesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The reserved node identifier filter value. Use this parameter to show only the reservation that matches the
     * specified reservation ID.
     * </p>
     */
    private String reservationId;
    /**
     * <p>
     * The offering identifier filter value. Use this parameter to show only purchased reservations matching the
     * specified offering identifier.
     * </p>
     */
    private String reservedNodesOfferingId;
    /**
     * <p>
     * The node type filter value. Use this parameter to show only those reservations matching the specified node type.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.reserved.html#reserved-nodes-supported"
     * >Supported node types</a>.
     * </p>
     */
    private String nodeType;
    /**
     * <p>
     * The duration filter value, specified in years or seconds. Use this parameter to show only reservations for this
     * duration.
     * </p>
     */
    private String duration;
    /**
     * <p>
     * The offering type filter value. Use this parameter to show only the available offerings matching the specified
     * offering type. Valid values: "All Upfront"|"Partial Upfront"| "No Upfront"
     * </p>
     */
    private String offeringType;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified MaxRecords
     * value, a marker is included in the response so that the remaining results can be retrieved.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by MaxRecords.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The reserved node identifier filter value. Use this parameter to show only the reservation that matches the
     * specified reservation ID.
     * </p>
     * 
     * @param reservationId
     *        The reserved node identifier filter value. Use this parameter to show only the reservation that matches
     *        the specified reservation ID.
     */

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    /**
     * <p>
     * The reserved node identifier filter value. Use this parameter to show only the reservation that matches the
     * specified reservation ID.
     * </p>
     * 
     * @return The reserved node identifier filter value. Use this parameter to show only the reservation that matches
     *         the specified reservation ID.
     */

    public String getReservationId() {
        return this.reservationId;
    }

    /**
     * <p>
     * The reserved node identifier filter value. Use this parameter to show only the reservation that matches the
     * specified reservation ID.
     * </p>
     * 
     * @param reservationId
     *        The reserved node identifier filter value. Use this parameter to show only the reservation that matches
     *        the specified reservation ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedNodesRequest withReservationId(String reservationId) {
        setReservationId(reservationId);
        return this;
    }

    /**
     * <p>
     * The offering identifier filter value. Use this parameter to show only purchased reservations matching the
     * specified offering identifier.
     * </p>
     * 
     * @param reservedNodesOfferingId
     *        The offering identifier filter value. Use this parameter to show only purchased reservations matching the
     *        specified offering identifier.
     */

    public void setReservedNodesOfferingId(String reservedNodesOfferingId) {
        this.reservedNodesOfferingId = reservedNodesOfferingId;
    }

    /**
     * <p>
     * The offering identifier filter value. Use this parameter to show only purchased reservations matching the
     * specified offering identifier.
     * </p>
     * 
     * @return The offering identifier filter value. Use this parameter to show only purchased reservations matching the
     *         specified offering identifier.
     */

    public String getReservedNodesOfferingId() {
        return this.reservedNodesOfferingId;
    }

    /**
     * <p>
     * The offering identifier filter value. Use this parameter to show only purchased reservations matching the
     * specified offering identifier.
     * </p>
     * 
     * @param reservedNodesOfferingId
     *        The offering identifier filter value. Use this parameter to show only purchased reservations matching the
     *        specified offering identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedNodesRequest withReservedNodesOfferingId(String reservedNodesOfferingId) {
        setReservedNodesOfferingId(reservedNodesOfferingId);
        return this;
    }

    /**
     * <p>
     * The node type filter value. Use this parameter to show only those reservations matching the specified node type.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.reserved.html#reserved-nodes-supported"
     * >Supported node types</a>.
     * </p>
     * 
     * @param nodeType
     *        The node type filter value. Use this parameter to show only those reservations matching the specified node
     *        type. For more information, see <a
     *        href="https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.reserved.html#reserved-nodes-supported"
     *        >Supported node types</a>.
     */

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The node type filter value. Use this parameter to show only those reservations matching the specified node type.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.reserved.html#reserved-nodes-supported"
     * >Supported node types</a>.
     * </p>
     * 
     * @return The node type filter value. Use this parameter to show only those reservations matching the specified
     *         node type. For more information, see <a href=
     *         "https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.reserved.html#reserved-nodes-supported"
     *         >Supported node types</a>.
     */

    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * <p>
     * The node type filter value. Use this parameter to show only those reservations matching the specified node type.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.reserved.html#reserved-nodes-supported"
     * >Supported node types</a>.
     * </p>
     * 
     * @param nodeType
     *        The node type filter value. Use this parameter to show only those reservations matching the specified node
     *        type. For more information, see <a
     *        href="https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.reserved.html#reserved-nodes-supported"
     *        >Supported node types</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedNodesRequest withNodeType(String nodeType) {
        setNodeType(nodeType);
        return this;
    }

    /**
     * <p>
     * The duration filter value, specified in years or seconds. Use this parameter to show only reservations for this
     * duration.
     * </p>
     * 
     * @param duration
     *        The duration filter value, specified in years or seconds. Use this parameter to show only reservations for
     *        this duration.
     */

    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration filter value, specified in years or seconds. Use this parameter to show only reservations for this
     * duration.
     * </p>
     * 
     * @return The duration filter value, specified in years or seconds. Use this parameter to show only reservations
     *         for this duration.
     */

    public String getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The duration filter value, specified in years or seconds. Use this parameter to show only reservations for this
     * duration.
     * </p>
     * 
     * @param duration
     *        The duration filter value, specified in years or seconds. Use this parameter to show only reservations for
     *        this duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedNodesRequest withDuration(String duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * The offering type filter value. Use this parameter to show only the available offerings matching the specified
     * offering type. Valid values: "All Upfront"|"Partial Upfront"| "No Upfront"
     * </p>
     * 
     * @param offeringType
     *        The offering type filter value. Use this parameter to show only the available offerings matching the
     *        specified offering type. Valid values: "All Upfront"|"Partial Upfront"| "No Upfront"
     */

    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }

    /**
     * <p>
     * The offering type filter value. Use this parameter to show only the available offerings matching the specified
     * offering type. Valid values: "All Upfront"|"Partial Upfront"| "No Upfront"
     * </p>
     * 
     * @return The offering type filter value. Use this parameter to show only the available offerings matching the
     *         specified offering type. Valid values: "All Upfront"|"Partial Upfront"| "No Upfront"
     */

    public String getOfferingType() {
        return this.offeringType;
    }

    /**
     * <p>
     * The offering type filter value. Use this parameter to show only the available offerings matching the specified
     * offering type. Valid values: "All Upfront"|"Partial Upfront"| "No Upfront"
     * </p>
     * 
     * @param offeringType
     *        The offering type filter value. Use this parameter to show only the available offerings matching the
     *        specified offering type. Valid values: "All Upfront"|"Partial Upfront"| "No Upfront"
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedNodesRequest withOfferingType(String offeringType) {
        setOfferingType(offeringType);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified MaxRecords
     * value, a marker is included in the response so that the remaining results can be retrieved.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        MaxRecords value, a marker is included in the response so that the remaining results can be retrieved.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified MaxRecords
     * value, a marker is included in the response so that the remaining results can be retrieved.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more records exist than the specified
     *         MaxRecords value, a marker is included in the response so that the remaining results can be retrieved.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified MaxRecords
     * value, a marker is included in the response so that the remaining results can be retrieved.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        MaxRecords value, a marker is included in the response so that the remaining results can be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedNodesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by MaxRecords.
     * </p>
     * 
     * @param nextToken
     *        An optional marker returned from a prior request. Use this marker for pagination of results from this
     *        operation. If this parameter is specified, the response includes only records beyond the marker, up to the
     *        value specified by MaxRecords.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by MaxRecords.
     * </p>
     * 
     * @return An optional marker returned from a prior request. Use this marker for pagination of results from this
     *         operation. If this parameter is specified, the response includes only records beyond the marker, up to
     *         the value specified by MaxRecords.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by MaxRecords.
     * </p>
     * 
     * @param nextToken
     *        An optional marker returned from a prior request. Use this marker for pagination of results from this
     *        operation. If this parameter is specified, the response includes only records beyond the marker, up to the
     *        value specified by MaxRecords.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedNodesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getReservationId() != null)
            sb.append("ReservationId: ").append(getReservationId()).append(",");
        if (getReservedNodesOfferingId() != null)
            sb.append("ReservedNodesOfferingId: ").append(getReservedNodesOfferingId()).append(",");
        if (getNodeType() != null)
            sb.append("NodeType: ").append(getNodeType()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getOfferingType() != null)
            sb.append("OfferingType: ").append(getOfferingType()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReservedNodesRequest == false)
            return false;
        DescribeReservedNodesRequest other = (DescribeReservedNodesRequest) obj;
        if (other.getReservationId() == null ^ this.getReservationId() == null)
            return false;
        if (other.getReservationId() != null && other.getReservationId().equals(this.getReservationId()) == false)
            return false;
        if (other.getReservedNodesOfferingId() == null ^ this.getReservedNodesOfferingId() == null)
            return false;
        if (other.getReservedNodesOfferingId() != null && other.getReservedNodesOfferingId().equals(this.getReservedNodesOfferingId()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getOfferingType() == null ^ this.getOfferingType() == null)
            return false;
        if (other.getOfferingType() != null && other.getOfferingType().equals(this.getOfferingType()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservationId() == null) ? 0 : getReservationId().hashCode());
        hashCode = prime * hashCode + ((getReservedNodesOfferingId() == null) ? 0 : getReservedNodesOfferingId().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReservedNodesRequest clone() {
        return (DescribeReservedNodesRequest) super.clone();
    }

}
