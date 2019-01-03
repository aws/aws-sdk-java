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
 * Contains the output of DescribeReservedInstancesOfferings.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedInstancesOfferingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of Reserved Instances offerings.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ReservedInstancesOffering> reservedInstancesOfferings;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of Reserved Instances offerings.
     * </p>
     * 
     * @return A list of Reserved Instances offerings.
     */

    public java.util.List<ReservedInstancesOffering> getReservedInstancesOfferings() {
        if (reservedInstancesOfferings == null) {
            reservedInstancesOfferings = new com.amazonaws.internal.SdkInternalList<ReservedInstancesOffering>();
        }
        return reservedInstancesOfferings;
    }

    /**
     * <p>
     * A list of Reserved Instances offerings.
     * </p>
     * 
     * @param reservedInstancesOfferings
     *        A list of Reserved Instances offerings.
     */

    public void setReservedInstancesOfferings(java.util.Collection<ReservedInstancesOffering> reservedInstancesOfferings) {
        if (reservedInstancesOfferings == null) {
            this.reservedInstancesOfferings = null;
            return;
        }

        this.reservedInstancesOfferings = new com.amazonaws.internal.SdkInternalList<ReservedInstancesOffering>(reservedInstancesOfferings);
    }

    /**
     * <p>
     * A list of Reserved Instances offerings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReservedInstancesOfferings(java.util.Collection)} or
     * {@link #withReservedInstancesOfferings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param reservedInstancesOfferings
     *        A list of Reserved Instances offerings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesOfferingsResult withReservedInstancesOfferings(ReservedInstancesOffering... reservedInstancesOfferings) {
        if (this.reservedInstancesOfferings == null) {
            setReservedInstancesOfferings(new com.amazonaws.internal.SdkInternalList<ReservedInstancesOffering>(reservedInstancesOfferings.length));
        }
        for (ReservedInstancesOffering ele : reservedInstancesOfferings) {
            this.reservedInstancesOfferings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Reserved Instances offerings.
     * </p>
     * 
     * @param reservedInstancesOfferings
     *        A list of Reserved Instances offerings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservedInstancesOfferingsResult withReservedInstancesOfferings(java.util.Collection<ReservedInstancesOffering> reservedInstancesOfferings) {
        setReservedInstancesOfferings(reservedInstancesOfferings);
        return this;
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

    public DescribeReservedInstancesOfferingsResult withNextToken(String nextToken) {
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
        if (getReservedInstancesOfferings() != null)
            sb.append("ReservedInstancesOfferings: ").append(getReservedInstancesOfferings()).append(",");
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

        if (obj instanceof DescribeReservedInstancesOfferingsResult == false)
            return false;
        DescribeReservedInstancesOfferingsResult other = (DescribeReservedInstancesOfferingsResult) obj;
        if (other.getReservedInstancesOfferings() == null ^ this.getReservedInstancesOfferings() == null)
            return false;
        if (other.getReservedInstancesOfferings() != null && other.getReservedInstancesOfferings().equals(this.getReservedInstancesOfferings()) == false)
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

        hashCode = prime * hashCode + ((getReservedInstancesOfferings() == null) ? 0 : getReservedInstancesOfferings().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReservedInstancesOfferingsResult clone() {
        try {
            return (DescribeReservedInstancesOfferingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
