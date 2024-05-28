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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInstanceProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstancePropertiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Properties for the managed instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceProperty> instanceProperties;
    /**
     * <p>
     * The token for the next set of properties to return. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Properties for the managed instances.
     * </p>
     * 
     * @return Properties for the managed instances.
     */

    public java.util.List<InstanceProperty> getInstanceProperties() {
        if (instanceProperties == null) {
            instanceProperties = new com.amazonaws.internal.SdkInternalList<InstanceProperty>();
        }
        return instanceProperties;
    }

    /**
     * <p>
     * Properties for the managed instances.
     * </p>
     * 
     * @param instanceProperties
     *        Properties for the managed instances.
     */

    public void setInstanceProperties(java.util.Collection<InstanceProperty> instanceProperties) {
        if (instanceProperties == null) {
            this.instanceProperties = null;
            return;
        }

        this.instanceProperties = new com.amazonaws.internal.SdkInternalList<InstanceProperty>(instanceProperties);
    }

    /**
     * <p>
     * Properties for the managed instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceProperties(java.util.Collection)} or {@link #withInstanceProperties(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param instanceProperties
     *        Properties for the managed instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancePropertiesResult withInstanceProperties(InstanceProperty... instanceProperties) {
        if (this.instanceProperties == null) {
            setInstanceProperties(new com.amazonaws.internal.SdkInternalList<InstanceProperty>(instanceProperties.length));
        }
        for (InstanceProperty ele : instanceProperties) {
            this.instanceProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Properties for the managed instances.
     * </p>
     * 
     * @param instanceProperties
     *        Properties for the managed instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancePropertiesResult withInstanceProperties(java.util.Collection<InstanceProperty> instanceProperties) {
        setInstanceProperties(instanceProperties);
        return this;
    }

    /**
     * <p>
     * The token for the next set of properties to return. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of properties to return. Use this token to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of properties to return. Use this token to get the next set of results.
     * </p>
     * 
     * @return The token for the next set of properties to return. Use this token to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of properties to return. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of properties to return. Use this token to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancePropertiesResult withNextToken(String nextToken) {
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
        if (getInstanceProperties() != null)
            sb.append("InstanceProperties: ").append(getInstanceProperties()).append(",");
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

        if (obj instanceof DescribeInstancePropertiesResult == false)
            return false;
        DescribeInstancePropertiesResult other = (DescribeInstancePropertiesResult) obj;
        if (other.getInstanceProperties() == null ^ this.getInstanceProperties() == null)
            return false;
        if (other.getInstanceProperties() != null && other.getInstanceProperties().equals(this.getInstanceProperties()) == false)
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

        hashCode = prime * hashCode + ((getInstanceProperties() == null) ? 0 : getInstanceProperties().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstancePropertiesResult clone() {
        try {
            return (DescribeInstancePropertiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
