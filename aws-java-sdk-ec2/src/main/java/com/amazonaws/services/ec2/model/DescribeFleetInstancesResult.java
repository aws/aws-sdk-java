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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFleetInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The running instances. This list is refreshed periodically and might be out of date.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ActiveInstance> activeInstances;
    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     */
    private String fleetId;

    /**
     * <p>
     * The running instances. This list is refreshed periodically and might be out of date.
     * </p>
     * 
     * @return The running instances. This list is refreshed periodically and might be out of date.
     */

    public java.util.List<ActiveInstance> getActiveInstances() {
        if (activeInstances == null) {
            activeInstances = new com.amazonaws.internal.SdkInternalList<ActiveInstance>();
        }
        return activeInstances;
    }

    /**
     * <p>
     * The running instances. This list is refreshed periodically and might be out of date.
     * </p>
     * 
     * @param activeInstances
     *        The running instances. This list is refreshed periodically and might be out of date.
     */

    public void setActiveInstances(java.util.Collection<ActiveInstance> activeInstances) {
        if (activeInstances == null) {
            this.activeInstances = null;
            return;
        }

        this.activeInstances = new com.amazonaws.internal.SdkInternalList<ActiveInstance>(activeInstances);
    }

    /**
     * <p>
     * The running instances. This list is refreshed periodically and might be out of date.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActiveInstances(java.util.Collection)} or {@link #withActiveInstances(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param activeInstances
     *        The running instances. This list is refreshed periodically and might be out of date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetInstancesResult withActiveInstances(ActiveInstance... activeInstances) {
        if (this.activeInstances == null) {
            setActiveInstances(new com.amazonaws.internal.SdkInternalList<ActiveInstance>(activeInstances.length));
        }
        for (ActiveInstance ele : activeInstances) {
            this.activeInstances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The running instances. This list is refreshed periodically and might be out of date.
     * </p>
     * 
     * @param activeInstances
     *        The running instances. This list is refreshed periodically and might be out of date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetInstancesResult withActiveInstances(java.util.Collection<ActiveInstance> activeInstances) {
        setActiveInstances(activeInstances);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @return The token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetInstancesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     * 
     * @param fleetId
     *        The ID of the EC2 Fleet.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     * 
     * @return The ID of the EC2 Fleet.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     * 
     * @param fleetId
     *        The ID of the EC2 Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetInstancesResult withFleetId(String fleetId) {
        setFleetId(fleetId);
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
        if (getActiveInstances() != null)
            sb.append("ActiveInstances: ").append(getActiveInstances()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFleetInstancesResult == false)
            return false;
        DescribeFleetInstancesResult other = (DescribeFleetInstancesResult) obj;
        if (other.getActiveInstances() == null ^ this.getActiveInstances() == null)
            return false;
        if (other.getActiveInstances() != null && other.getActiveInstances().equals(this.getActiveInstances()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActiveInstances() == null) ? 0 : getActiveInstances().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFleetInstancesResult clone() {
        try {
            return (DescribeFleetInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
