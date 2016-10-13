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

/**
 * <p>
 * Represents the returned data in response to a request action.
 * </p>
 */
public class DescribeFleetUtilizationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Collection of objects containing utilization information for each requested fleet ID.
     * </p>
     */
    private java.util.List<FleetUtilization> fleetUtilization;
    /**
     * <p>
     * Token indicating where to resume retrieving results on the next call to this action. If no token is returned,
     * these results represent the end of the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Collection of objects containing utilization information for each requested fleet ID.
     * </p>
     * 
     * @return Collection of objects containing utilization information for each requested fleet ID.
     */

    public java.util.List<FleetUtilization> getFleetUtilization() {
        return fleetUtilization;
    }

    /**
     * <p>
     * Collection of objects containing utilization information for each requested fleet ID.
     * </p>
     * 
     * @param fleetUtilization
     *        Collection of objects containing utilization information for each requested fleet ID.
     */

    public void setFleetUtilization(java.util.Collection<FleetUtilization> fleetUtilization) {
        if (fleetUtilization == null) {
            this.fleetUtilization = null;
            return;
        }

        this.fleetUtilization = new java.util.ArrayList<FleetUtilization>(fleetUtilization);
    }

    /**
     * <p>
     * Collection of objects containing utilization information for each requested fleet ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFleetUtilization(java.util.Collection)} or {@link #withFleetUtilization(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param fleetUtilization
     *        Collection of objects containing utilization information for each requested fleet ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetUtilizationResult withFleetUtilization(FleetUtilization... fleetUtilization) {
        if (this.fleetUtilization == null) {
            setFleetUtilization(new java.util.ArrayList<FleetUtilization>(fleetUtilization.length));
        }
        for (FleetUtilization ele : fleetUtilization) {
            this.fleetUtilization.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Collection of objects containing utilization information for each requested fleet ID.
     * </p>
     * 
     * @param fleetUtilization
     *        Collection of objects containing utilization information for each requested fleet ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetUtilizationResult withFleetUtilization(java.util.Collection<FleetUtilization> fleetUtilization) {
        setFleetUtilization(fleetUtilization);
        return this;
    }

    /**
     * <p>
     * Token indicating where to resume retrieving results on the next call to this action. If no token is returned,
     * these results represent the end of the list.
     * </p>
     * 
     * @param nextToken
     *        Token indicating where to resume retrieving results on the next call to this action. If no token is
     *        returned, these results represent the end of the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token indicating where to resume retrieving results on the next call to this action. If no token is returned,
     * these results represent the end of the list.
     * </p>
     * 
     * @return Token indicating where to resume retrieving results on the next call to this action. If no token is
     *         returned, these results represent the end of the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token indicating where to resume retrieving results on the next call to this action. If no token is returned,
     * these results represent the end of the list.
     * </p>
     * 
     * @param nextToken
     *        Token indicating where to resume retrieving results on the next call to this action. If no token is
     *        returned, these results represent the end of the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetUtilizationResult withNextToken(String nextToken) {
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
        if (getFleetUtilization() != null)
            sb.append("FleetUtilization: " + getFleetUtilization() + ",");
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

        if (obj instanceof DescribeFleetUtilizationResult == false)
            return false;
        DescribeFleetUtilizationResult other = (DescribeFleetUtilizationResult) obj;
        if (other.getFleetUtilization() == null ^ this.getFleetUtilization() == null)
            return false;
        if (other.getFleetUtilization() != null && other.getFleetUtilization().equals(this.getFleetUtilization()) == false)
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

        hashCode = prime * hashCode + ((getFleetUtilization() == null) ? 0 : getFleetUtilization().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFleetUtilizationResult clone() {
        try {
            return (DescribeFleetUtilizationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
