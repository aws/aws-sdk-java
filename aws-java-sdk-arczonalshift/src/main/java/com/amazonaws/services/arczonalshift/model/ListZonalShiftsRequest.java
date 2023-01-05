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
package com.amazonaws.services.arczonalshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/ListZonalShifts" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListZonalShiftsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The number of objects that you want to return with this call.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Specifies that you want to receive the next page of results. Valid only if you received a <code>NextToken</code>
     * response in the previous request. If you did, it indicates that more output is available. Set this parameter to
     * the value provided by the previous call's <code>NextToken</code> response to request the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A status for a zonal shift.
     * </p>
     * <p>
     * The <code>Status</code> for a zonal shift can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACTIVE</b>: The zonal shift is started and active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EXPIRED</b>: The zonal shift has expired (the expiry time was exceeded).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CANCELED</b>: The zonal shift was canceled.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The number of objects that you want to return with this call.
     * </p>
     * 
     * @param maxResults
     *        The number of objects that you want to return with this call.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The number of objects that you want to return with this call.
     * </p>
     * 
     * @return The number of objects that you want to return with this call.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The number of objects that you want to return with this call.
     * </p>
     * 
     * @param maxResults
     *        The number of objects that you want to return with this call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListZonalShiftsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to receive the next page of results. Valid only if you received a <code>NextToken</code>
     * response in the previous request. If you did, it indicates that more output is available. Set this parameter to
     * the value provided by the previous call's <code>NextToken</code> response to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specifies that you want to receive the next page of results. Valid only if you received a
     *        <code>NextToken</code> response in the previous request. If you did, it indicates that more output is
     *        available. Set this parameter to the value provided by the previous call's <code>NextToken</code> response
     *        to request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specifies that you want to receive the next page of results. Valid only if you received a <code>NextToken</code>
     * response in the previous request. If you did, it indicates that more output is available. Set this parameter to
     * the value provided by the previous call's <code>NextToken</code> response to request the next page of results.
     * </p>
     * 
     * @return Specifies that you want to receive the next page of results. Valid only if you received a
     *         <code>NextToken</code> response in the previous request. If you did, it indicates that more output is
     *         available. Set this parameter to the value provided by the previous call's <code>NextToken</code>
     *         response to request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specifies that you want to receive the next page of results. Valid only if you received a <code>NextToken</code>
     * response in the previous request. If you did, it indicates that more output is available. Set this parameter to
     * the value provided by the previous call's <code>NextToken</code> response to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specifies that you want to receive the next page of results. Valid only if you received a
     *        <code>NextToken</code> response in the previous request. If you did, it indicates that more output is
     *        available. Set this parameter to the value provided by the previous call's <code>NextToken</code> response
     *        to request the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListZonalShiftsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A status for a zonal shift.
     * </p>
     * <p>
     * The <code>Status</code> for a zonal shift can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACTIVE</b>: The zonal shift is started and active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EXPIRED</b>: The zonal shift has expired (the expiry time was exceeded).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CANCELED</b>: The zonal shift was canceled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        A status for a zonal shift.</p>
     *        <p>
     *        The <code>Status</code> for a zonal shift can have one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b>: The zonal shift is started and active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>EXPIRED</b>: The zonal shift has expired (the expiry time was exceeded).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CANCELED</b>: The zonal shift was canceled.
     *        </p>
     *        </li>
     * @see ZonalShiftStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A status for a zonal shift.
     * </p>
     * <p>
     * The <code>Status</code> for a zonal shift can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACTIVE</b>: The zonal shift is started and active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EXPIRED</b>: The zonal shift has expired (the expiry time was exceeded).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CANCELED</b>: The zonal shift was canceled.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A status for a zonal shift.</p>
     *         <p>
     *         The <code>Status</code> for a zonal shift can have one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>ACTIVE</b>: The zonal shift is started and active.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>EXPIRED</b>: The zonal shift has expired (the expiry time was exceeded).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>CANCELED</b>: The zonal shift was canceled.
     *         </p>
     *         </li>
     * @see ZonalShiftStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A status for a zonal shift.
     * </p>
     * <p>
     * The <code>Status</code> for a zonal shift can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACTIVE</b>: The zonal shift is started and active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EXPIRED</b>: The zonal shift has expired (the expiry time was exceeded).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CANCELED</b>: The zonal shift was canceled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        A status for a zonal shift.</p>
     *        <p>
     *        The <code>Status</code> for a zonal shift can have one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b>: The zonal shift is started and active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>EXPIRED</b>: The zonal shift has expired (the expiry time was exceeded).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CANCELED</b>: The zonal shift was canceled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ZonalShiftStatus
     */

    public ListZonalShiftsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A status for a zonal shift.
     * </p>
     * <p>
     * The <code>Status</code> for a zonal shift can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACTIVE</b>: The zonal shift is started and active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EXPIRED</b>: The zonal shift has expired (the expiry time was exceeded).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CANCELED</b>: The zonal shift was canceled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        A status for a zonal shift.</p>
     *        <p>
     *        The <code>Status</code> for a zonal shift can have one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b>: The zonal shift is started and active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>EXPIRED</b>: The zonal shift has expired (the expiry time was exceeded).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CANCELED</b>: The zonal shift was canceled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ZonalShiftStatus
     */

    public ListZonalShiftsRequest withStatus(ZonalShiftStatus status) {
        this.status = status.toString();
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListZonalShiftsRequest == false)
            return false;
        ListZonalShiftsRequest other = (ListZonalShiftsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListZonalShiftsRequest clone() {
        return (ListZonalShiftsRequest) super.clone();
    }

}
