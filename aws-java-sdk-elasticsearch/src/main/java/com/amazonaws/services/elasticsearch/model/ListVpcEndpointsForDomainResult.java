/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Container for response parameters to the <code><a>ListVpcEndpointsForDomain</a></code> operation. Returns a list
 * containing summarized details of the VPC endpoints.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVpcEndpointsForDomainResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Provides list of <code>VpcEndpointSummary</code> summarizing details of the VPC endpoints.
     * </p>
     */
    private java.util.List<VpcEndpointSummary> vpcEndpointSummaryList;
    /**
     * <p>
     * Information about each endpoint associated with the domain.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Provides list of <code>VpcEndpointSummary</code> summarizing details of the VPC endpoints.
     * </p>
     * 
     * @return Provides list of <code>VpcEndpointSummary</code> summarizing details of the VPC endpoints.
     */

    public java.util.List<VpcEndpointSummary> getVpcEndpointSummaryList() {
        return vpcEndpointSummaryList;
    }

    /**
     * <p>
     * Provides list of <code>VpcEndpointSummary</code> summarizing details of the VPC endpoints.
     * </p>
     * 
     * @param vpcEndpointSummaryList
     *        Provides list of <code>VpcEndpointSummary</code> summarizing details of the VPC endpoints.
     */

    public void setVpcEndpointSummaryList(java.util.Collection<VpcEndpointSummary> vpcEndpointSummaryList) {
        if (vpcEndpointSummaryList == null) {
            this.vpcEndpointSummaryList = null;
            return;
        }

        this.vpcEndpointSummaryList = new java.util.ArrayList<VpcEndpointSummary>(vpcEndpointSummaryList);
    }

    /**
     * <p>
     * Provides list of <code>VpcEndpointSummary</code> summarizing details of the VPC endpoints.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcEndpointSummaryList(java.util.Collection)} or
     * {@link #withVpcEndpointSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param vpcEndpointSummaryList
     *        Provides list of <code>VpcEndpointSummary</code> summarizing details of the VPC endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVpcEndpointsForDomainResult withVpcEndpointSummaryList(VpcEndpointSummary... vpcEndpointSummaryList) {
        if (this.vpcEndpointSummaryList == null) {
            setVpcEndpointSummaryList(new java.util.ArrayList<VpcEndpointSummary>(vpcEndpointSummaryList.length));
        }
        for (VpcEndpointSummary ele : vpcEndpointSummaryList) {
            this.vpcEndpointSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides list of <code>VpcEndpointSummary</code> summarizing details of the VPC endpoints.
     * </p>
     * 
     * @param vpcEndpointSummaryList
     *        Provides list of <code>VpcEndpointSummary</code> summarizing details of the VPC endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVpcEndpointsForDomainResult withVpcEndpointSummaryList(java.util.Collection<VpcEndpointSummary> vpcEndpointSummaryList) {
        setVpcEndpointSummaryList(vpcEndpointSummaryList);
        return this;
    }

    /**
     * <p>
     * Information about each endpoint associated with the domain.
     * </p>
     * 
     * @param nextToken
     *        Information about each endpoint associated with the domain.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Information about each endpoint associated with the domain.
     * </p>
     * 
     * @return Information about each endpoint associated with the domain.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Information about each endpoint associated with the domain.
     * </p>
     * 
     * @param nextToken
     *        Information about each endpoint associated with the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVpcEndpointsForDomainResult withNextToken(String nextToken) {
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
        if (getVpcEndpointSummaryList() != null)
            sb.append("VpcEndpointSummaryList: ").append(getVpcEndpointSummaryList()).append(",");
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

        if (obj instanceof ListVpcEndpointsForDomainResult == false)
            return false;
        ListVpcEndpointsForDomainResult other = (ListVpcEndpointsForDomainResult) obj;
        if (other.getVpcEndpointSummaryList() == null ^ this.getVpcEndpointSummaryList() == null)
            return false;
        if (other.getVpcEndpointSummaryList() != null && other.getVpcEndpointSummaryList().equals(this.getVpcEndpointSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getVpcEndpointSummaryList() == null) ? 0 : getVpcEndpointSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListVpcEndpointsForDomainResult clone() {
        try {
            return (ListVpcEndpointsForDomainResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
