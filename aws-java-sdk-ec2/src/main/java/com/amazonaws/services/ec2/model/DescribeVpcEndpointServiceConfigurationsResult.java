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
public class DescribeVpcEndpointServiceConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Information about one or more services.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ServiceConfiguration> serviceConfigurations;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about one or more services.
     * </p>
     * 
     * @return Information about one or more services.
     */

    public java.util.List<ServiceConfiguration> getServiceConfigurations() {
        if (serviceConfigurations == null) {
            serviceConfigurations = new com.amazonaws.internal.SdkInternalList<ServiceConfiguration>();
        }
        return serviceConfigurations;
    }

    /**
     * <p>
     * Information about one or more services.
     * </p>
     * 
     * @param serviceConfigurations
     *        Information about one or more services.
     */

    public void setServiceConfigurations(java.util.Collection<ServiceConfiguration> serviceConfigurations) {
        if (serviceConfigurations == null) {
            this.serviceConfigurations = null;
            return;
        }

        this.serviceConfigurations = new com.amazonaws.internal.SdkInternalList<ServiceConfiguration>(serviceConfigurations);
    }

    /**
     * <p>
     * Information about one or more services.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceConfigurations(java.util.Collection)} or
     * {@link #withServiceConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param serviceConfigurations
     *        Information about one or more services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointServiceConfigurationsResult withServiceConfigurations(ServiceConfiguration... serviceConfigurations) {
        if (this.serviceConfigurations == null) {
            setServiceConfigurations(new com.amazonaws.internal.SdkInternalList<ServiceConfiguration>(serviceConfigurations.length));
        }
        for (ServiceConfiguration ele : serviceConfigurations) {
            this.serviceConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about one or more services.
     * </p>
     * 
     * @param serviceConfigurations
     *        Information about one or more services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointServiceConfigurationsResult withServiceConfigurations(java.util.Collection<ServiceConfiguration> serviceConfigurations) {
        setServiceConfigurations(serviceConfigurations);
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

    public DescribeVpcEndpointServiceConfigurationsResult withNextToken(String nextToken) {
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
        if (getServiceConfigurations() != null)
            sb.append("ServiceConfigurations: ").append(getServiceConfigurations()).append(",");
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

        if (obj instanceof DescribeVpcEndpointServiceConfigurationsResult == false)
            return false;
        DescribeVpcEndpointServiceConfigurationsResult other = (DescribeVpcEndpointServiceConfigurationsResult) obj;
        if (other.getServiceConfigurations() == null ^ this.getServiceConfigurations() == null)
            return false;
        if (other.getServiceConfigurations() != null && other.getServiceConfigurations().equals(this.getServiceConfigurations()) == false)
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

        hashCode = prime * hashCode + ((getServiceConfigurations() == null) ? 0 : getServiceConfigurations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVpcEndpointServiceConfigurationsResult clone() {
        try {
            return (DescribeVpcEndpointServiceConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
