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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/ListVpcEndpoints"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVpcEndpointsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results. The default is 20.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If your initial <code>ListVpcEndpoints</code> operation returns a <code>nextToken</code>, you can include the
     * returned <code>nextToken</code> in subsequent <code>ListVpcEndpoints</code> operations, which returns results in
     * the next page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Filter the results according to the current status of the VPC endpoint. Possible statuses are
     * <code>CREATING</code>, <code>DELETING</code>, <code>UPDATING</code>, <code>ACTIVE</code>, and <code>FAILED</code>
     * .
     * </p>
     */
    private VpcEndpointFilters vpcEndpointFilters;

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results. The default is 20.
     * </p>
     * 
     * @param maxResults
     *        An optional parameter that specifies the maximum number of results to return. You can use
     *        <code>nextToken</code> to get the next page of results. The default is 20.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results. The default is 20.
     * </p>
     * 
     * @return An optional parameter that specifies the maximum number of results to return. You can use
     *         <code>nextToken</code> to get the next page of results. The default is 20.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results. The default is 20.
     * </p>
     * 
     * @param maxResults
     *        An optional parameter that specifies the maximum number of results to return. You can use
     *        <code>nextToken</code> to get the next page of results. The default is 20.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVpcEndpointsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If your initial <code>ListVpcEndpoints</code> operation returns a <code>nextToken</code>, you can include the
     * returned <code>nextToken</code> in subsequent <code>ListVpcEndpoints</code> operations, which returns results in
     * the next page.
     * </p>
     * 
     * @param nextToken
     *        If your initial <code>ListVpcEndpoints</code> operation returns a <code>nextToken</code>, you can include
     *        the returned <code>nextToken</code> in subsequent <code>ListVpcEndpoints</code> operations, which returns
     *        results in the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If your initial <code>ListVpcEndpoints</code> operation returns a <code>nextToken</code>, you can include the
     * returned <code>nextToken</code> in subsequent <code>ListVpcEndpoints</code> operations, which returns results in
     * the next page.
     * </p>
     * 
     * @return If your initial <code>ListVpcEndpoints</code> operation returns a <code>nextToken</code>, you can include
     *         the returned <code>nextToken</code> in subsequent <code>ListVpcEndpoints</code> operations, which returns
     *         results in the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If your initial <code>ListVpcEndpoints</code> operation returns a <code>nextToken</code>, you can include the
     * returned <code>nextToken</code> in subsequent <code>ListVpcEndpoints</code> operations, which returns results in
     * the next page.
     * </p>
     * 
     * @param nextToken
     *        If your initial <code>ListVpcEndpoints</code> operation returns a <code>nextToken</code>, you can include
     *        the returned <code>nextToken</code> in subsequent <code>ListVpcEndpoints</code> operations, which returns
     *        results in the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVpcEndpointsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Filter the results according to the current status of the VPC endpoint. Possible statuses are
     * <code>CREATING</code>, <code>DELETING</code>, <code>UPDATING</code>, <code>ACTIVE</code>, and <code>FAILED</code>
     * .
     * </p>
     * 
     * @param vpcEndpointFilters
     *        Filter the results according to the current status of the VPC endpoint. Possible statuses are
     *        <code>CREATING</code>, <code>DELETING</code>, <code>UPDATING</code>, <code>ACTIVE</code>, and
     *        <code>FAILED</code>.
     */

    public void setVpcEndpointFilters(VpcEndpointFilters vpcEndpointFilters) {
        this.vpcEndpointFilters = vpcEndpointFilters;
    }

    /**
     * <p>
     * Filter the results according to the current status of the VPC endpoint. Possible statuses are
     * <code>CREATING</code>, <code>DELETING</code>, <code>UPDATING</code>, <code>ACTIVE</code>, and <code>FAILED</code>
     * .
     * </p>
     * 
     * @return Filter the results according to the current status of the VPC endpoint. Possible statuses are
     *         <code>CREATING</code>, <code>DELETING</code>, <code>UPDATING</code>, <code>ACTIVE</code>, and
     *         <code>FAILED</code>.
     */

    public VpcEndpointFilters getVpcEndpointFilters() {
        return this.vpcEndpointFilters;
    }

    /**
     * <p>
     * Filter the results according to the current status of the VPC endpoint. Possible statuses are
     * <code>CREATING</code>, <code>DELETING</code>, <code>UPDATING</code>, <code>ACTIVE</code>, and <code>FAILED</code>
     * .
     * </p>
     * 
     * @param vpcEndpointFilters
     *        Filter the results according to the current status of the VPC endpoint. Possible statuses are
     *        <code>CREATING</code>, <code>DELETING</code>, <code>UPDATING</code>, <code>ACTIVE</code>, and
     *        <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVpcEndpointsRequest withVpcEndpointFilters(VpcEndpointFilters vpcEndpointFilters) {
        setVpcEndpointFilters(vpcEndpointFilters);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getVpcEndpointFilters() != null)
            sb.append("VpcEndpointFilters: ").append(getVpcEndpointFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVpcEndpointsRequest == false)
            return false;
        ListVpcEndpointsRequest other = (ListVpcEndpointsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getVpcEndpointFilters() == null ^ this.getVpcEndpointFilters() == null)
            return false;
        if (other.getVpcEndpointFilters() != null && other.getVpcEndpointFilters().equals(this.getVpcEndpointFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpointFilters() == null) ? 0 : getVpcEndpointFilters().hashCode());
        return hashCode;
    }

    @Override
    public ListVpcEndpointsRequest clone() {
        return (ListVpcEndpointsRequest) super.clone();
    }

}
