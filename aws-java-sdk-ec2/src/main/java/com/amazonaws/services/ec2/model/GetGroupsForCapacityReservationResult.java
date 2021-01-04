/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class GetGroupsForCapacityReservationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Information about the resource groups to which the Capacity Reservation has been added.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CapacityReservationGroup> capacityReservationGroups;

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupsForCapacityReservationResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Information about the resource groups to which the Capacity Reservation has been added.
     * </p>
     * 
     * @return Information about the resource groups to which the Capacity Reservation has been added.
     */

    public java.util.List<CapacityReservationGroup> getCapacityReservationGroups() {
        if (capacityReservationGroups == null) {
            capacityReservationGroups = new com.amazonaws.internal.SdkInternalList<CapacityReservationGroup>();
        }
        return capacityReservationGroups;
    }

    /**
     * <p>
     * Information about the resource groups to which the Capacity Reservation has been added.
     * </p>
     * 
     * @param capacityReservationGroups
     *        Information about the resource groups to which the Capacity Reservation has been added.
     */

    public void setCapacityReservationGroups(java.util.Collection<CapacityReservationGroup> capacityReservationGroups) {
        if (capacityReservationGroups == null) {
            this.capacityReservationGroups = null;
            return;
        }

        this.capacityReservationGroups = new com.amazonaws.internal.SdkInternalList<CapacityReservationGroup>(capacityReservationGroups);
    }

    /**
     * <p>
     * Information about the resource groups to which the Capacity Reservation has been added.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapacityReservationGroups(java.util.Collection)} or
     * {@link #withCapacityReservationGroups(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param capacityReservationGroups
     *        Information about the resource groups to which the Capacity Reservation has been added.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupsForCapacityReservationResult withCapacityReservationGroups(CapacityReservationGroup... capacityReservationGroups) {
        if (this.capacityReservationGroups == null) {
            setCapacityReservationGroups(new com.amazonaws.internal.SdkInternalList<CapacityReservationGroup>(capacityReservationGroups.length));
        }
        for (CapacityReservationGroup ele : capacityReservationGroups) {
            this.capacityReservationGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the resource groups to which the Capacity Reservation has been added.
     * </p>
     * 
     * @param capacityReservationGroups
     *        Information about the resource groups to which the Capacity Reservation has been added.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupsForCapacityReservationResult withCapacityReservationGroups(java.util.Collection<CapacityReservationGroup> capacityReservationGroups) {
        setCapacityReservationGroups(capacityReservationGroups);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getCapacityReservationGroups() != null)
            sb.append("CapacityReservationGroups: ").append(getCapacityReservationGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGroupsForCapacityReservationResult == false)
            return false;
        GetGroupsForCapacityReservationResult other = (GetGroupsForCapacityReservationResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getCapacityReservationGroups() == null ^ this.getCapacityReservationGroups() == null)
            return false;
        if (other.getCapacityReservationGroups() != null && other.getCapacityReservationGroups().equals(this.getCapacityReservationGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getCapacityReservationGroups() == null) ? 0 : getCapacityReservationGroups().hashCode());
        return hashCode;
    }

    @Override
    public GetGroupsForCapacityReservationResult clone() {
        try {
            return (GetGroupsForCapacityReservationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
