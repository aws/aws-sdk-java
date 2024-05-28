/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class DescribeCapacityBlockOfferingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The recommended Capacity Block offering for the dates specified.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CapacityBlockOffering> capacityBlockOfferings;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The recommended Capacity Block offering for the dates specified.
     * </p>
     * 
     * @return The recommended Capacity Block offering for the dates specified.
     */

    public java.util.List<CapacityBlockOffering> getCapacityBlockOfferings() {
        if (capacityBlockOfferings == null) {
            capacityBlockOfferings = new com.amazonaws.internal.SdkInternalList<CapacityBlockOffering>();
        }
        return capacityBlockOfferings;
    }

    /**
     * <p>
     * The recommended Capacity Block offering for the dates specified.
     * </p>
     * 
     * @param capacityBlockOfferings
     *        The recommended Capacity Block offering for the dates specified.
     */

    public void setCapacityBlockOfferings(java.util.Collection<CapacityBlockOffering> capacityBlockOfferings) {
        if (capacityBlockOfferings == null) {
            this.capacityBlockOfferings = null;
            return;
        }

        this.capacityBlockOfferings = new com.amazonaws.internal.SdkInternalList<CapacityBlockOffering>(capacityBlockOfferings);
    }

    /**
     * <p>
     * The recommended Capacity Block offering for the dates specified.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapacityBlockOfferings(java.util.Collection)} or
     * {@link #withCapacityBlockOfferings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param capacityBlockOfferings
     *        The recommended Capacity Block offering for the dates specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityBlockOfferingsResult withCapacityBlockOfferings(CapacityBlockOffering... capacityBlockOfferings) {
        if (this.capacityBlockOfferings == null) {
            setCapacityBlockOfferings(new com.amazonaws.internal.SdkInternalList<CapacityBlockOffering>(capacityBlockOfferings.length));
        }
        for (CapacityBlockOffering ele : capacityBlockOfferings) {
            this.capacityBlockOfferings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The recommended Capacity Block offering for the dates specified.
     * </p>
     * 
     * @param capacityBlockOfferings
     *        The recommended Capacity Block offering for the dates specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityBlockOfferingsResult withCapacityBlockOfferings(java.util.Collection<CapacityBlockOffering> capacityBlockOfferings) {
        setCapacityBlockOfferings(capacityBlockOfferings);
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

    public DescribeCapacityBlockOfferingsResult withNextToken(String nextToken) {
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
        if (getCapacityBlockOfferings() != null)
            sb.append("CapacityBlockOfferings: ").append(getCapacityBlockOfferings()).append(",");
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

        if (obj instanceof DescribeCapacityBlockOfferingsResult == false)
            return false;
        DescribeCapacityBlockOfferingsResult other = (DescribeCapacityBlockOfferingsResult) obj;
        if (other.getCapacityBlockOfferings() == null ^ this.getCapacityBlockOfferings() == null)
            return false;
        if (other.getCapacityBlockOfferings() != null && other.getCapacityBlockOfferings().equals(this.getCapacityBlockOfferings()) == false)
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

        hashCode = prime * hashCode + ((getCapacityBlockOfferings() == null) ? 0 : getCapacityBlockOfferings().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCapacityBlockOfferingsResult clone() {
        try {
            return (DescribeCapacityBlockOfferingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
