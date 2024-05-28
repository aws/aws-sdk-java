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
public class DescribeInstanceTopologyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the topology of each instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceTopology> instances;
    /**
     * <p>
     * The token to include in another request to get the next page of items. This value is <code>null</code> when there
     * are no more items to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the topology of each instance.
     * </p>
     * 
     * @return Information about the topology of each instance.
     */

    public java.util.List<InstanceTopology> getInstances() {
        if (instances == null) {
            instances = new com.amazonaws.internal.SdkInternalList<InstanceTopology>();
        }
        return instances;
    }

    /**
     * <p>
     * Information about the topology of each instance.
     * </p>
     * 
     * @param instances
     *        Information about the topology of each instance.
     */

    public void setInstances(java.util.Collection<InstanceTopology> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new com.amazonaws.internal.SdkInternalList<InstanceTopology>(instances);
    }

    /**
     * <p>
     * Information about the topology of each instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstances(java.util.Collection)} or {@link #withInstances(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instances
     *        Information about the topology of each instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceTopologyResult withInstances(InstanceTopology... instances) {
        if (this.instances == null) {
            setInstances(new com.amazonaws.internal.SdkInternalList<InstanceTopology>(instances.length));
        }
        for (InstanceTopology ele : instances) {
            this.instances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the topology of each instance.
     * </p>
     * 
     * @param instances
     *        Information about the topology of each instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceTopologyResult withInstances(java.util.Collection<InstanceTopology> instances) {
        setInstances(instances);
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

    public DescribeInstanceTopologyResult withNextToken(String nextToken) {
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
        if (getInstances() != null)
            sb.append("Instances: ").append(getInstances()).append(",");
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

        if (obj instanceof DescribeInstanceTopologyResult == false)
            return false;
        DescribeInstanceTopologyResult other = (DescribeInstanceTopologyResult) obj;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false)
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

        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstanceTopologyResult clone() {
        try {
            return (DescribeInstanceTopologyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
