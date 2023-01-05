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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/ListVpcEndpoints"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVpcEndpointsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Details about each VPC endpoint, including the name and current status.
     * </p>
     */
    private java.util.List<VpcEndpointSummary> vpcEndpointSummaries;

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        When <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @return When <code>nextToken</code> is returned, there are more results available. The value of
     *         <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *         token to retrieve the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        When <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVpcEndpointsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Details about each VPC endpoint, including the name and current status.
     * </p>
     * 
     * @return Details about each VPC endpoint, including the name and current status.
     */

    public java.util.List<VpcEndpointSummary> getVpcEndpointSummaries() {
        return vpcEndpointSummaries;
    }

    /**
     * <p>
     * Details about each VPC endpoint, including the name and current status.
     * </p>
     * 
     * @param vpcEndpointSummaries
     *        Details about each VPC endpoint, including the name and current status.
     */

    public void setVpcEndpointSummaries(java.util.Collection<VpcEndpointSummary> vpcEndpointSummaries) {
        if (vpcEndpointSummaries == null) {
            this.vpcEndpointSummaries = null;
            return;
        }

        this.vpcEndpointSummaries = new java.util.ArrayList<VpcEndpointSummary>(vpcEndpointSummaries);
    }

    /**
     * <p>
     * Details about each VPC endpoint, including the name and current status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcEndpointSummaries(java.util.Collection)} or {@link #withVpcEndpointSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcEndpointSummaries
     *        Details about each VPC endpoint, including the name and current status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVpcEndpointsResult withVpcEndpointSummaries(VpcEndpointSummary... vpcEndpointSummaries) {
        if (this.vpcEndpointSummaries == null) {
            setVpcEndpointSummaries(new java.util.ArrayList<VpcEndpointSummary>(vpcEndpointSummaries.length));
        }
        for (VpcEndpointSummary ele : vpcEndpointSummaries) {
            this.vpcEndpointSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details about each VPC endpoint, including the name and current status.
     * </p>
     * 
     * @param vpcEndpointSummaries
     *        Details about each VPC endpoint, including the name and current status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVpcEndpointsResult withVpcEndpointSummaries(java.util.Collection<VpcEndpointSummary> vpcEndpointSummaries) {
        setVpcEndpointSummaries(vpcEndpointSummaries);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getVpcEndpointSummaries() != null)
            sb.append("VpcEndpointSummaries: ").append(getVpcEndpointSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVpcEndpointsResult == false)
            return false;
        ListVpcEndpointsResult other = (ListVpcEndpointsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getVpcEndpointSummaries() == null ^ this.getVpcEndpointSummaries() == null)
            return false;
        if (other.getVpcEndpointSummaries() != null && other.getVpcEndpointSummaries().equals(this.getVpcEndpointSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpointSummaries() == null) ? 0 : getVpcEndpointSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListVpcEndpointsResult clone() {
        try {
            return (ListVpcEndpointsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
