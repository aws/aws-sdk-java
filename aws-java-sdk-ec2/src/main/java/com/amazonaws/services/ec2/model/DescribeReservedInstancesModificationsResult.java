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
 * <p>
 * Contains the output of DescribeReservedInstancesModifications.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedInstancesModificationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
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
     * The Reserved Instance modification information.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ReservedInstancesModification> reservedInstancesModifications;

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

    public DescribeReservedInstancesModificationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The Reserved Instance modification information.
     * </p>
     * 
     * @return The Reserved Instance modification information.
     */

    public java.util.List<ReservedInstancesModification> getReservedInstancesModifications() {
        if (reservedInstancesModifications == null) {
            reservedInstancesModifications = new com.amazonaws.internal.SdkInternalList<ReservedInstancesModification>();
        }
        return reservedInstancesModifications;
    }

    /**
     * <p>
     * The Reserved Instance modification information.
     * </p>
     * 
     * @param reservedInstancesModifications
     *        The Reserved Instance modification information.
     */

    public void setReservedInstancesModifications(java.util.Collection<ReservedInstancesModification> reservedInstancesModifications) {
        if (reservedInstancesModifications == null) {
            this.reservedInstancesModifications = null;
            return;
        }

        this.reservedInstancesModifications = new com.amazonaws.internal.SdkInternalList<ReservedInstancesModification>(reservedInstancesModifications);
    }

    /**
     * <p>
     * The Reserved Instance modification information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReservedInstancesModifications(java.util.Collection)} or
     * {@link #withReservedInstancesModifications(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param reservedInstancesModifications
     *        The Reserved Instance modification information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesModificationsResult withReservedInstancesModifications(ReservedInstancesModification... reservedInstancesModifications) {
        if (this.reservedInstancesModifications == null) {
            setReservedInstancesModifications(new com.amazonaws.internal.SdkInternalList<ReservedInstancesModification>(reservedInstancesModifications.length));
        }
        for (ReservedInstancesModification ele : reservedInstancesModifications) {
            this.reservedInstancesModifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Reserved Instance modification information.
     * </p>
     * 
     * @param reservedInstancesModifications
     *        The Reserved Instance modification information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesModificationsResult withReservedInstancesModifications(
            java.util.Collection<ReservedInstancesModification> reservedInstancesModifications) {
        setReservedInstancesModifications(reservedInstancesModifications);
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
        if (getReservedInstancesModifications() != null)
            sb.append("ReservedInstancesModifications: ").append(getReservedInstancesModifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReservedInstancesModificationsResult == false)
            return false;
        DescribeReservedInstancesModificationsResult other = (DescribeReservedInstancesModificationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getReservedInstancesModifications() == null ^ this.getReservedInstancesModifications() == null)
            return false;
        if (other.getReservedInstancesModifications() != null
                && other.getReservedInstancesModifications().equals(this.getReservedInstancesModifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getReservedInstancesModifications() == null) ? 0 : getReservedInstancesModifications().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReservedInstancesModificationsResult clone() {
        try {
            return (DescribeReservedInstancesModificationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
