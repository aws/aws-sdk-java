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
public class DescribeNatGatewaysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the NAT gateways.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<NatGateway> natGateways;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the NAT gateways.
     * </p>
     * 
     * @return Information about the NAT gateways.
     */

    public java.util.List<NatGateway> getNatGateways() {
        if (natGateways == null) {
            natGateways = new com.amazonaws.internal.SdkInternalList<NatGateway>();
        }
        return natGateways;
    }

    /**
     * <p>
     * Information about the NAT gateways.
     * </p>
     * 
     * @param natGateways
     *        Information about the NAT gateways.
     */

    public void setNatGateways(java.util.Collection<NatGateway> natGateways) {
        if (natGateways == null) {
            this.natGateways = null;
            return;
        }

        this.natGateways = new com.amazonaws.internal.SdkInternalList<NatGateway>(natGateways);
    }

    /**
     * <p>
     * Information about the NAT gateways.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNatGateways(java.util.Collection)} or {@link #withNatGateways(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param natGateways
     *        Information about the NAT gateways.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNatGatewaysResult withNatGateways(NatGateway... natGateways) {
        if (this.natGateways == null) {
            setNatGateways(new com.amazonaws.internal.SdkInternalList<NatGateway>(natGateways.length));
        }
        for (NatGateway ele : natGateways) {
            this.natGateways.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the NAT gateways.
     * </p>
     * 
     * @param natGateways
     *        Information about the NAT gateways.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNatGatewaysResult withNatGateways(java.util.Collection<NatGateway> natGateways) {
        setNatGateways(natGateways);
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

    public DescribeNatGatewaysResult withNextToken(String nextToken) {
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
        if (getNatGateways() != null)
            sb.append("NatGateways: ").append(getNatGateways()).append(",");
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

        if (obj instanceof DescribeNatGatewaysResult == false)
            return false;
        DescribeNatGatewaysResult other = (DescribeNatGatewaysResult) obj;
        if (other.getNatGateways() == null ^ this.getNatGateways() == null)
            return false;
        if (other.getNatGateways() != null && other.getNatGateways().equals(this.getNatGateways()) == false)
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

        hashCode = prime * hashCode + ((getNatGateways() == null) ? 0 : getNatGateways().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNatGatewaysResult clone() {
        try {
            return (DescribeNatGatewaysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
