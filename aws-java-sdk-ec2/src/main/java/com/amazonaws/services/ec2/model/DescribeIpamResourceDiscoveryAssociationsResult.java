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
public class DescribeIpamResourceDiscoveryAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The resource discovery associations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IpamResourceDiscoveryAssociation> ipamResourceDiscoveryAssociations;
    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The resource discovery associations.
     * </p>
     * 
     * @return The resource discovery associations.
     */

    public java.util.List<IpamResourceDiscoveryAssociation> getIpamResourceDiscoveryAssociations() {
        if (ipamResourceDiscoveryAssociations == null) {
            ipamResourceDiscoveryAssociations = new com.amazonaws.internal.SdkInternalList<IpamResourceDiscoveryAssociation>();
        }
        return ipamResourceDiscoveryAssociations;
    }

    /**
     * <p>
     * The resource discovery associations.
     * </p>
     * 
     * @param ipamResourceDiscoveryAssociations
     *        The resource discovery associations.
     */

    public void setIpamResourceDiscoveryAssociations(java.util.Collection<IpamResourceDiscoveryAssociation> ipamResourceDiscoveryAssociations) {
        if (ipamResourceDiscoveryAssociations == null) {
            this.ipamResourceDiscoveryAssociations = null;
            return;
        }

        this.ipamResourceDiscoveryAssociations = new com.amazonaws.internal.SdkInternalList<IpamResourceDiscoveryAssociation>(ipamResourceDiscoveryAssociations);
    }

    /**
     * <p>
     * The resource discovery associations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpamResourceDiscoveryAssociations(java.util.Collection)} or
     * {@link #withIpamResourceDiscoveryAssociations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param ipamResourceDiscoveryAssociations
     *        The resource discovery associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpamResourceDiscoveryAssociationsResult withIpamResourceDiscoveryAssociations(
            IpamResourceDiscoveryAssociation... ipamResourceDiscoveryAssociations) {
        if (this.ipamResourceDiscoveryAssociations == null) {
            setIpamResourceDiscoveryAssociations(new com.amazonaws.internal.SdkInternalList<IpamResourceDiscoveryAssociation>(
                    ipamResourceDiscoveryAssociations.length));
        }
        for (IpamResourceDiscoveryAssociation ele : ipamResourceDiscoveryAssociations) {
            this.ipamResourceDiscoveryAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource discovery associations.
     * </p>
     * 
     * @param ipamResourceDiscoveryAssociations
     *        The resource discovery associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpamResourceDiscoveryAssociationsResult withIpamResourceDiscoveryAssociations(
            java.util.Collection<IpamResourceDiscoveryAssociation> ipamResourceDiscoveryAssociations) {
        setIpamResourceDiscoveryAssociations(ipamResourceDiscoveryAssociations);
        return this;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token from a previous request to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @return Specify the pagination token from a previous request to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token from a previous request to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpamResourceDiscoveryAssociationsResult withNextToken(String nextToken) {
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
        if (getIpamResourceDiscoveryAssociations() != null)
            sb.append("IpamResourceDiscoveryAssociations: ").append(getIpamResourceDiscoveryAssociations()).append(",");
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

        if (obj instanceof DescribeIpamResourceDiscoveryAssociationsResult == false)
            return false;
        DescribeIpamResourceDiscoveryAssociationsResult other = (DescribeIpamResourceDiscoveryAssociationsResult) obj;
        if (other.getIpamResourceDiscoveryAssociations() == null ^ this.getIpamResourceDiscoveryAssociations() == null)
            return false;
        if (other.getIpamResourceDiscoveryAssociations() != null
                && other.getIpamResourceDiscoveryAssociations().equals(this.getIpamResourceDiscoveryAssociations()) == false)
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

        hashCode = prime * hashCode + ((getIpamResourceDiscoveryAssociations() == null) ? 0 : getIpamResourceDiscoveryAssociations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeIpamResourceDiscoveryAssociationsResult clone() {
        try {
            return (DescribeIpamResourceDiscoveryAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
