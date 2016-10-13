/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 */
public class DescribeScalingPoliciesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for a fleet. Specify the fleet to retrieve scaling policies for.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * Scaling policy status to filter results on. A scaling policy is only in force when in an <code>ACTIVE</code>
     * status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACTIVE</b> – The scaling policy is currently in force.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATEREQUESTED</b> – A request to update the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATING</b> – A change is being made to the scaling policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETEREQUESTED</b> – A request to delete the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b> – The scaling policy is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETED</b> – The scaling policy has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ERROR</b> – An error occurred in creating the policy. It should be removed and recreated.
     * </p>
     * </li>
     * </ul>
     */
    private String statusFilter;
    /**
     * <p>
     * Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set of
     * sequential pages.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * Token indicating the start of the next sequential page of results. Use the token that is returned with a previous
     * call to this action. To specify the start of the result set, do not specify a value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Unique identifier for a fleet. Specify the fleet to retrieve scaling policies for.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet. Specify the fleet to retrieve scaling policies for.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet. Specify the fleet to retrieve scaling policies for.
     * </p>
     * 
     * @return Unique identifier for a fleet. Specify the fleet to retrieve scaling policies for.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet. Specify the fleet to retrieve scaling policies for.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet. Specify the fleet to retrieve scaling policies for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingPoliciesRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * Scaling policy status to filter results on. A scaling policy is only in force when in an <code>ACTIVE</code>
     * status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACTIVE</b> – The scaling policy is currently in force.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATEREQUESTED</b> – A request to update the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATING</b> – A change is being made to the scaling policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETEREQUESTED</b> – A request to delete the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b> – The scaling policy is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETED</b> – The scaling policy has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ERROR</b> – An error occurred in creating the policy. It should be removed and recreated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statusFilter
     *        Scaling policy status to filter results on. A scaling policy is only in force when in an
     *        <code>ACTIVE</code> status.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> – The scaling policy is currently in force.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UPDATEREQUESTED</b> – A request to update the scaling policy has been received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UPDATING</b> – A change is being made to the scaling policy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETEREQUESTED</b> – A request to delete the scaling policy has been received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETING</b> – The scaling policy is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETED</b> – The scaling policy has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ERROR</b> – An error occurred in creating the policy. It should be removed and recreated.
     *        </p>
     *        </li>
     * @see ScalingStatusType
     */

    public void setStatusFilter(String statusFilter) {
        this.statusFilter = statusFilter;
    }

    /**
     * <p>
     * Scaling policy status to filter results on. A scaling policy is only in force when in an <code>ACTIVE</code>
     * status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACTIVE</b> – The scaling policy is currently in force.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATEREQUESTED</b> – A request to update the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATING</b> – A change is being made to the scaling policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETEREQUESTED</b> – A request to delete the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b> – The scaling policy is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETED</b> – The scaling policy has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ERROR</b> – An error occurred in creating the policy. It should be removed and recreated.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Scaling policy status to filter results on. A scaling policy is only in force when in an
     *         <code>ACTIVE</code> status.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>ACTIVE</b> – The scaling policy is currently in force.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UPDATEREQUESTED</b> – A request to update the scaling policy has been received.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UPDATING</b> – A change is being made to the scaling policy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>DELETEREQUESTED</b> – A request to delete the scaling policy has been received.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>DELETING</b> – The scaling policy is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>DELETED</b> – The scaling policy has been deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ERROR</b> – An error occurred in creating the policy. It should be removed and recreated.
     *         </p>
     *         </li>
     * @see ScalingStatusType
     */

    public String getStatusFilter() {
        return this.statusFilter;
    }

    /**
     * <p>
     * Scaling policy status to filter results on. A scaling policy is only in force when in an <code>ACTIVE</code>
     * status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACTIVE</b> – The scaling policy is currently in force.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATEREQUESTED</b> – A request to update the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATING</b> – A change is being made to the scaling policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETEREQUESTED</b> – A request to delete the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b> – The scaling policy is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETED</b> – The scaling policy has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ERROR</b> – An error occurred in creating the policy. It should be removed and recreated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statusFilter
     *        Scaling policy status to filter results on. A scaling policy is only in force when in an
     *        <code>ACTIVE</code> status.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> – The scaling policy is currently in force.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UPDATEREQUESTED</b> – A request to update the scaling policy has been received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UPDATING</b> – A change is being made to the scaling policy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETEREQUESTED</b> – A request to delete the scaling policy has been received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETING</b> – The scaling policy is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETED</b> – The scaling policy has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ERROR</b> – An error occurred in creating the policy. It should be removed and recreated.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingStatusType
     */

    public DescribeScalingPoliciesRequest withStatusFilter(String statusFilter) {
        setStatusFilter(statusFilter);
        return this;
    }

    /**
     * <p>
     * Scaling policy status to filter results on. A scaling policy is only in force when in an <code>ACTIVE</code>
     * status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACTIVE</b> – The scaling policy is currently in force.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATEREQUESTED</b> – A request to update the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATING</b> – A change is being made to the scaling policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETEREQUESTED</b> – A request to delete the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b> – The scaling policy is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETED</b> – The scaling policy has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ERROR</b> – An error occurred in creating the policy. It should be removed and recreated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statusFilter
     *        Scaling policy status to filter results on. A scaling policy is only in force when in an
     *        <code>ACTIVE</code> status.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> – The scaling policy is currently in force.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UPDATEREQUESTED</b> – A request to update the scaling policy has been received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UPDATING</b> – A change is being made to the scaling policy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETEREQUESTED</b> – A request to delete the scaling policy has been received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETING</b> – The scaling policy is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETED</b> – The scaling policy has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ERROR</b> – An error occurred in creating the policy. It should be removed and recreated.
     *        </p>
     *        </li>
     * @see ScalingStatusType
     */

    public void setStatusFilter(ScalingStatusType statusFilter) {
        this.statusFilter = statusFilter.toString();
    }

    /**
     * <p>
     * Scaling policy status to filter results on. A scaling policy is only in force when in an <code>ACTIVE</code>
     * status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACTIVE</b> – The scaling policy is currently in force.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATEREQUESTED</b> – A request to update the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UPDATING</b> – A change is being made to the scaling policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETEREQUESTED</b> – A request to delete the scaling policy has been received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b> – The scaling policy is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETED</b> – The scaling policy has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ERROR</b> – An error occurred in creating the policy. It should be removed and recreated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statusFilter
     *        Scaling policy status to filter results on. A scaling policy is only in force when in an
     *        <code>ACTIVE</code> status.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> – The scaling policy is currently in force.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UPDATEREQUESTED</b> – A request to update the scaling policy has been received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UPDATING</b> – A change is being made to the scaling policy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETEREQUESTED</b> – A request to delete the scaling policy has been received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETING</b> – The scaling policy is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETED</b> – The scaling policy has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ERROR</b> – An error occurred in creating the policy. It should be removed and recreated.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingStatusType
     */

    public DescribeScalingPoliciesRequest withStatusFilter(ScalingStatusType statusFilter) {
        setStatusFilter(statusFilter);
        return this;
    }

    /**
     * <p>
     * Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set of
     * sequential pages.
     * </p>
     * 
     * @param limit
     *        Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a
     *        set of sequential pages.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set of
     * sequential pages.
     * </p>
     * 
     * @return Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a
     *         set of sequential pages.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set of
     * sequential pages.
     * </p>
     * 
     * @param limit
     *        Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a
     *        set of sequential pages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingPoliciesRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * Token indicating the start of the next sequential page of results. Use the token that is returned with a previous
     * call to this action. To specify the start of the result set, do not specify a value.
     * </p>
     * 
     * @param nextToken
     *        Token indicating the start of the next sequential page of results. Use the token that is returned with a
     *        previous call to this action. To specify the start of the result set, do not specify a value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token indicating the start of the next sequential page of results. Use the token that is returned with a previous
     * call to this action. To specify the start of the result set, do not specify a value.
     * </p>
     * 
     * @return Token indicating the start of the next sequential page of results. Use the token that is returned with a
     *         previous call to this action. To specify the start of the result set, do not specify a value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token indicating the start of the next sequential page of results. Use the token that is returned with a previous
     * call to this action. To specify the start of the result set, do not specify a value.
     * </p>
     * 
     * @param nextToken
     *        Token indicating the start of the next sequential page of results. Use the token that is returned with a
     *        previous call to this action. To specify the start of the result set, do not specify a value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingPoliciesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFleetId() != null)
            sb.append("FleetId: " + getFleetId() + ",");
        if (getStatusFilter() != null)
            sb.append("StatusFilter: " + getStatusFilter() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeScalingPoliciesRequest == false)
            return false;
        DescribeScalingPoliciesRequest other = (DescribeScalingPoliciesRequest) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getStatusFilter() == null ^ this.getStatusFilter() == null)
            return false;
        if (other.getStatusFilter() != null && other.getStatusFilter().equals(this.getStatusFilter()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
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

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getStatusFilter() == null) ? 0 : getStatusFilter().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeScalingPoliciesRequest clone() {
        return (DescribeScalingPoliciesRequest) super.clone();
    }
}
