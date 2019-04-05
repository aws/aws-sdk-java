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
 * <p>
 * Contains the output of DescribeVpcEndpointServices.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVpcEndpointServicesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of supported services.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> serviceNames;
    /**
     * <p>
     * Information about the service.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ServiceDetail> serviceDetails;
    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of supported services.
     * </p>
     * 
     * @return A list of supported services.
     */

    public java.util.List<String> getServiceNames() {
        if (serviceNames == null) {
            serviceNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return serviceNames;
    }

    /**
     * <p>
     * A list of supported services.
     * </p>
     * 
     * @param serviceNames
     *        A list of supported services.
     */

    public void setServiceNames(java.util.Collection<String> serviceNames) {
        if (serviceNames == null) {
            this.serviceNames = null;
            return;
        }

        this.serviceNames = new com.amazonaws.internal.SdkInternalList<String>(serviceNames);
    }

    /**
     * <p>
     * A list of supported services.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceNames(java.util.Collection)} or {@link #withServiceNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param serviceNames
     *        A list of supported services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointServicesResult withServiceNames(String... serviceNames) {
        if (this.serviceNames == null) {
            setServiceNames(new com.amazonaws.internal.SdkInternalList<String>(serviceNames.length));
        }
        for (String ele : serviceNames) {
            this.serviceNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of supported services.
     * </p>
     * 
     * @param serviceNames
     *        A list of supported services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointServicesResult withServiceNames(java.util.Collection<String> serviceNames) {
        setServiceNames(serviceNames);
        return this;
    }

    /**
     * <p>
     * Information about the service.
     * </p>
     * 
     * @return Information about the service.
     */

    public java.util.List<ServiceDetail> getServiceDetails() {
        if (serviceDetails == null) {
            serviceDetails = new com.amazonaws.internal.SdkInternalList<ServiceDetail>();
        }
        return serviceDetails;
    }

    /**
     * <p>
     * Information about the service.
     * </p>
     * 
     * @param serviceDetails
     *        Information about the service.
     */

    public void setServiceDetails(java.util.Collection<ServiceDetail> serviceDetails) {
        if (serviceDetails == null) {
            this.serviceDetails = null;
            return;
        }

        this.serviceDetails = new com.amazonaws.internal.SdkInternalList<ServiceDetail>(serviceDetails);
    }

    /**
     * <p>
     * Information about the service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceDetails(java.util.Collection)} or {@link #withServiceDetails(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param serviceDetails
     *        Information about the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointServicesResult withServiceDetails(ServiceDetail... serviceDetails) {
        if (this.serviceDetails == null) {
            setServiceDetails(new com.amazonaws.internal.SdkInternalList<ServiceDetail>(serviceDetails.length));
        }
        for (ServiceDetail ele : serviceDetails) {
            this.serviceDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the service.
     * </p>
     * 
     * @param serviceDetails
     *        Information about the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointServicesResult withServiceDetails(java.util.Collection<ServiceDetail> serviceDetails) {
        setServiceDetails(serviceDetails);
        return this;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. If there are no additional items to return, the
     *        string is empty.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @return The token to use when requesting the next set of items. If there are no additional items to return, the
     *         string is empty.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. If there are no additional items to return, the
     *        string is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointServicesResult withNextToken(String nextToken) {
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
        if (getServiceNames() != null)
            sb.append("ServiceNames: ").append(getServiceNames()).append(",");
        if (getServiceDetails() != null)
            sb.append("ServiceDetails: ").append(getServiceDetails()).append(",");
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

        if (obj instanceof DescribeVpcEndpointServicesResult == false)
            return false;
        DescribeVpcEndpointServicesResult other = (DescribeVpcEndpointServicesResult) obj;
        if (other.getServiceNames() == null ^ this.getServiceNames() == null)
            return false;
        if (other.getServiceNames() != null && other.getServiceNames().equals(this.getServiceNames()) == false)
            return false;
        if (other.getServiceDetails() == null ^ this.getServiceDetails() == null)
            return false;
        if (other.getServiceDetails() != null && other.getServiceDetails().equals(this.getServiceDetails()) == false)
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

        hashCode = prime * hashCode + ((getServiceNames() == null) ? 0 : getServiceNames().hashCode());
        hashCode = prime * hashCode + ((getServiceDetails() == null) ? 0 : getServiceDetails().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVpcEndpointServicesResult clone() {
        try {
            return (DescribeVpcEndpointServicesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
