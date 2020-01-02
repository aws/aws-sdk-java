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
public class DescribeTransitGatewayMulticastDomainsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the transit gateway multicast domains.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TransitGatewayMulticastDomain> transitGatewayMulticastDomains;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the transit gateway multicast domains.
     * </p>
     * 
     * @return Information about the transit gateway multicast domains.
     */

    public java.util.List<TransitGatewayMulticastDomain> getTransitGatewayMulticastDomains() {
        if (transitGatewayMulticastDomains == null) {
            transitGatewayMulticastDomains = new com.amazonaws.internal.SdkInternalList<TransitGatewayMulticastDomain>();
        }
        return transitGatewayMulticastDomains;
    }

    /**
     * <p>
     * Information about the transit gateway multicast domains.
     * </p>
     * 
     * @param transitGatewayMulticastDomains
     *        Information about the transit gateway multicast domains.
     */

    public void setTransitGatewayMulticastDomains(java.util.Collection<TransitGatewayMulticastDomain> transitGatewayMulticastDomains) {
        if (transitGatewayMulticastDomains == null) {
            this.transitGatewayMulticastDomains = null;
            return;
        }

        this.transitGatewayMulticastDomains = new com.amazonaws.internal.SdkInternalList<TransitGatewayMulticastDomain>(transitGatewayMulticastDomains);
    }

    /**
     * <p>
     * Information about the transit gateway multicast domains.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTransitGatewayMulticastDomains(java.util.Collection)} or
     * {@link #withTransitGatewayMulticastDomains(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param transitGatewayMulticastDomains
     *        Information about the transit gateway multicast domains.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransitGatewayMulticastDomainsResult withTransitGatewayMulticastDomains(TransitGatewayMulticastDomain... transitGatewayMulticastDomains) {
        if (this.transitGatewayMulticastDomains == null) {
            setTransitGatewayMulticastDomains(new com.amazonaws.internal.SdkInternalList<TransitGatewayMulticastDomain>(transitGatewayMulticastDomains.length));
        }
        for (TransitGatewayMulticastDomain ele : transitGatewayMulticastDomains) {
            this.transitGatewayMulticastDomains.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the transit gateway multicast domains.
     * </p>
     * 
     * @param transitGatewayMulticastDomains
     *        Information about the transit gateway multicast domains.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransitGatewayMulticastDomainsResult withTransitGatewayMulticastDomains(
            java.util.Collection<TransitGatewayMulticastDomain> transitGatewayMulticastDomains) {
        setTransitGatewayMulticastDomains(transitGatewayMulticastDomains);
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

    public DescribeTransitGatewayMulticastDomainsResult withNextToken(String nextToken) {
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
        if (getTransitGatewayMulticastDomains() != null)
            sb.append("TransitGatewayMulticastDomains: ").append(getTransitGatewayMulticastDomains()).append(",");
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

        if (obj instanceof DescribeTransitGatewayMulticastDomainsResult == false)
            return false;
        DescribeTransitGatewayMulticastDomainsResult other = (DescribeTransitGatewayMulticastDomainsResult) obj;
        if (other.getTransitGatewayMulticastDomains() == null ^ this.getTransitGatewayMulticastDomains() == null)
            return false;
        if (other.getTransitGatewayMulticastDomains() != null
                && other.getTransitGatewayMulticastDomains().equals(this.getTransitGatewayMulticastDomains()) == false)
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

        hashCode = prime * hashCode + ((getTransitGatewayMulticastDomains() == null) ? 0 : getTransitGatewayMulticastDomains().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTransitGatewayMulticastDomainsResult clone() {
        try {
            return (DescribeTransitGatewayMulticastDomainsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
