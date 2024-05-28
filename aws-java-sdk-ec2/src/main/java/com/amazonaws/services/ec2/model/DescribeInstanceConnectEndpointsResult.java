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
public class DescribeInstanceConnectEndpointsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the EC2 Instance Connect Endpoints.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Ec2InstanceConnectEndpoint> instanceConnectEndpoints;
    /**
     * <p>
     * The token to include in another request to get the next page of items. This value is <code>null</code> when there
     * are no more items to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the EC2 Instance Connect Endpoints.
     * </p>
     * 
     * @return Information about the EC2 Instance Connect Endpoints.
     */

    public java.util.List<Ec2InstanceConnectEndpoint> getInstanceConnectEndpoints() {
        if (instanceConnectEndpoints == null) {
            instanceConnectEndpoints = new com.amazonaws.internal.SdkInternalList<Ec2InstanceConnectEndpoint>();
        }
        return instanceConnectEndpoints;
    }

    /**
     * <p>
     * Information about the EC2 Instance Connect Endpoints.
     * </p>
     * 
     * @param instanceConnectEndpoints
     *        Information about the EC2 Instance Connect Endpoints.
     */

    public void setInstanceConnectEndpoints(java.util.Collection<Ec2InstanceConnectEndpoint> instanceConnectEndpoints) {
        if (instanceConnectEndpoints == null) {
            this.instanceConnectEndpoints = null;
            return;
        }

        this.instanceConnectEndpoints = new com.amazonaws.internal.SdkInternalList<Ec2InstanceConnectEndpoint>(instanceConnectEndpoints);
    }

    /**
     * <p>
     * Information about the EC2 Instance Connect Endpoints.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceConnectEndpoints(java.util.Collection)} or
     * {@link #withInstanceConnectEndpoints(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param instanceConnectEndpoints
     *        Information about the EC2 Instance Connect Endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceConnectEndpointsResult withInstanceConnectEndpoints(Ec2InstanceConnectEndpoint... instanceConnectEndpoints) {
        if (this.instanceConnectEndpoints == null) {
            setInstanceConnectEndpoints(new com.amazonaws.internal.SdkInternalList<Ec2InstanceConnectEndpoint>(instanceConnectEndpoints.length));
        }
        for (Ec2InstanceConnectEndpoint ele : instanceConnectEndpoints) {
            this.instanceConnectEndpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the EC2 Instance Connect Endpoints.
     * </p>
     * 
     * @param instanceConnectEndpoints
     *        Information about the EC2 Instance Connect Endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceConnectEndpointsResult withInstanceConnectEndpoints(java.util.Collection<Ec2InstanceConnectEndpoint> instanceConnectEndpoints) {
        setInstanceConnectEndpoints(instanceConnectEndpoints);
        return this;
    }

    /**
     * <p>
     * The token to include in another request to get the next page of items. This value is <code>null</code> when there
     * are no more items to return.
     * </p>
     * 
     * @param nextToken
     *        The token to include in another request to get the next page of items. This value is <code>null</code>
     *        when there are no more items to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to include in another request to get the next page of items. This value is <code>null</code> when there
     * are no more items to return.
     * </p>
     * 
     * @return The token to include in another request to get the next page of items. This value is <code>null</code>
     *         when there are no more items to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to include in another request to get the next page of items. This value is <code>null</code> when there
     * are no more items to return.
     * </p>
     * 
     * @param nextToken
     *        The token to include in another request to get the next page of items. This value is <code>null</code>
     *        when there are no more items to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceConnectEndpointsResult withNextToken(String nextToken) {
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
        if (getInstanceConnectEndpoints() != null)
            sb.append("InstanceConnectEndpoints: ").append(getInstanceConnectEndpoints()).append(",");
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

        if (obj instanceof DescribeInstanceConnectEndpointsResult == false)
            return false;
        DescribeInstanceConnectEndpointsResult other = (DescribeInstanceConnectEndpointsResult) obj;
        if (other.getInstanceConnectEndpoints() == null ^ this.getInstanceConnectEndpoints() == null)
            return false;
        if (other.getInstanceConnectEndpoints() != null && other.getInstanceConnectEndpoints().equals(this.getInstanceConnectEndpoints()) == false)
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

        hashCode = prime * hashCode + ((getInstanceConnectEndpoints() == null) ? 0 : getInstanceConnectEndpoints().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstanceConnectEndpointsResult clone() {
        try {
            return (DescribeInstanceConnectEndpointsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
