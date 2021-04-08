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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeWarmPool" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeWarmPoolResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The warm pool configuration details.
     * </p>
     */
    private WarmPoolConfiguration warmPoolConfiguration;
    /**
     * <p>
     * The instances that are currently in the warm pool.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Instance> instances;
    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The warm pool configuration details.
     * </p>
     * 
     * @param warmPoolConfiguration
     *        The warm pool configuration details.
     */

    public void setWarmPoolConfiguration(WarmPoolConfiguration warmPoolConfiguration) {
        this.warmPoolConfiguration = warmPoolConfiguration;
    }

    /**
     * <p>
     * The warm pool configuration details.
     * </p>
     * 
     * @return The warm pool configuration details.
     */

    public WarmPoolConfiguration getWarmPoolConfiguration() {
        return this.warmPoolConfiguration;
    }

    /**
     * <p>
     * The warm pool configuration details.
     * </p>
     * 
     * @param warmPoolConfiguration
     *        The warm pool configuration details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWarmPoolResult withWarmPoolConfiguration(WarmPoolConfiguration warmPoolConfiguration) {
        setWarmPoolConfiguration(warmPoolConfiguration);
        return this;
    }

    /**
     * <p>
     * The instances that are currently in the warm pool.
     * </p>
     * 
     * @return The instances that are currently in the warm pool.
     */

    public java.util.List<Instance> getInstances() {
        if (instances == null) {
            instances = new com.amazonaws.internal.SdkInternalList<Instance>();
        }
        return instances;
    }

    /**
     * <p>
     * The instances that are currently in the warm pool.
     * </p>
     * 
     * @param instances
     *        The instances that are currently in the warm pool.
     */

    public void setInstances(java.util.Collection<Instance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new com.amazonaws.internal.SdkInternalList<Instance>(instances);
    }

    /**
     * <p>
     * The instances that are currently in the warm pool.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstances(java.util.Collection)} or {@link #withInstances(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instances
     *        The instances that are currently in the warm pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWarmPoolResult withInstances(Instance... instances) {
        if (this.instances == null) {
            setInstances(new com.amazonaws.internal.SdkInternalList<Instance>(instances.length));
        }
        for (Instance ele : instances) {
            this.instances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instances that are currently in the warm pool.
     * </p>
     * 
     * @param instances
     *        The instances that are currently in the warm pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWarmPoolResult withInstances(java.util.Collection<Instance> instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @return The token for the next set of items to return. (You received this token from a previous call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWarmPoolResult withNextToken(String nextToken) {
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
        if (getWarmPoolConfiguration() != null)
            sb.append("WarmPoolConfiguration: ").append(getWarmPoolConfiguration()).append(",");
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

        if (obj instanceof DescribeWarmPoolResult == false)
            return false;
        DescribeWarmPoolResult other = (DescribeWarmPoolResult) obj;
        if (other.getWarmPoolConfiguration() == null ^ this.getWarmPoolConfiguration() == null)
            return false;
        if (other.getWarmPoolConfiguration() != null && other.getWarmPoolConfiguration().equals(this.getWarmPoolConfiguration()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getWarmPoolConfiguration() == null) ? 0 : getWarmPoolConfiguration().hashCode());
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeWarmPoolResult clone() {
        try {
            return (DescribeWarmPoolResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
