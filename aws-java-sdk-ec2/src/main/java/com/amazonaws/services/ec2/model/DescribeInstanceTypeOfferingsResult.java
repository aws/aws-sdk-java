/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class DescribeInstanceTypeOfferingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The instance types offered.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceTypeOffering> instanceTypeOfferings;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The instance types offered.
     * </p>
     * 
     * @return The instance types offered.
     */

    public java.util.List<InstanceTypeOffering> getInstanceTypeOfferings() {
        if (instanceTypeOfferings == null) {
            instanceTypeOfferings = new com.amazonaws.internal.SdkInternalList<InstanceTypeOffering>();
        }
        return instanceTypeOfferings;
    }

    /**
     * <p>
     * The instance types offered.
     * </p>
     * 
     * @param instanceTypeOfferings
     *        The instance types offered.
     */

    public void setInstanceTypeOfferings(java.util.Collection<InstanceTypeOffering> instanceTypeOfferings) {
        if (instanceTypeOfferings == null) {
            this.instanceTypeOfferings = null;
            return;
        }

        this.instanceTypeOfferings = new com.amazonaws.internal.SdkInternalList<InstanceTypeOffering>(instanceTypeOfferings);
    }

    /**
     * <p>
     * The instance types offered.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceTypeOfferings(java.util.Collection)} or
     * {@link #withInstanceTypeOfferings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param instanceTypeOfferings
     *        The instance types offered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceTypeOfferingsResult withInstanceTypeOfferings(InstanceTypeOffering... instanceTypeOfferings) {
        if (this.instanceTypeOfferings == null) {
            setInstanceTypeOfferings(new com.amazonaws.internal.SdkInternalList<InstanceTypeOffering>(instanceTypeOfferings.length));
        }
        for (InstanceTypeOffering ele : instanceTypeOfferings) {
            this.instanceTypeOfferings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instance types offered.
     * </p>
     * 
     * @param instanceTypeOfferings
     *        The instance types offered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceTypeOfferingsResult withInstanceTypeOfferings(java.util.Collection<InstanceTypeOffering> instanceTypeOfferings) {
        setInstanceTypeOfferings(instanceTypeOfferings);
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

    public DescribeInstanceTypeOfferingsResult withNextToken(String nextToken) {
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
        if (getInstanceTypeOfferings() != null)
            sb.append("InstanceTypeOfferings: ").append(getInstanceTypeOfferings()).append(",");
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

        if (obj instanceof DescribeInstanceTypeOfferingsResult == false)
            return false;
        DescribeInstanceTypeOfferingsResult other = (DescribeInstanceTypeOfferingsResult) obj;
        if (other.getInstanceTypeOfferings() == null ^ this.getInstanceTypeOfferings() == null)
            return false;
        if (other.getInstanceTypeOfferings() != null && other.getInstanceTypeOfferings().equals(this.getInstanceTypeOfferings()) == false)
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

        hashCode = prime * hashCode + ((getInstanceTypeOfferings() == null) ? 0 : getInstanceTypeOfferings().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstanceTypeOfferingsResult clone() {
        try {
            return (DescribeInstanceTypeOfferingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
