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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeEcsClusters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEcsClustersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of ARNs, one for each cluster to be described.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> ecsClusterArns;
    /**
     * <p>
     * A stack ID. <code>DescribeEcsClusters</code> returns a description of the cluster that is registered with the
     * stack.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * If the previous paginated request did not return all of the remaining results, the response object's
     * <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     * <code>DescribeEcsClusters</code> again and assign that token to the request object's <code>NextToken</code>
     * parameter. If there are no remaining results, the previous response object's <code>NextToken</code> parameter is
     * set to <code>null</code>.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * To receive a paginated response, use this parameter to specify the maximum number of results to be returned with
     * a single call. If the number of available results exceeds this maximum, the response includes a
     * <code>NextToken</code> value that you can assign to the <code>NextToken</code> request parameter to get the next
     * set of results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * A list of ARNs, one for each cluster to be described.
     * </p>
     * 
     * @return A list of ARNs, one for each cluster to be described.
     */

    public java.util.List<String> getEcsClusterArns() {
        if (ecsClusterArns == null) {
            ecsClusterArns = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return ecsClusterArns;
    }

    /**
     * <p>
     * A list of ARNs, one for each cluster to be described.
     * </p>
     * 
     * @param ecsClusterArns
     *        A list of ARNs, one for each cluster to be described.
     */

    public void setEcsClusterArns(java.util.Collection<String> ecsClusterArns) {
        if (ecsClusterArns == null) {
            this.ecsClusterArns = null;
            return;
        }

        this.ecsClusterArns = new com.amazonaws.internal.SdkInternalList<String>(ecsClusterArns);
    }

    /**
     * <p>
     * A list of ARNs, one for each cluster to be described.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEcsClusterArns(java.util.Collection)} or {@link #withEcsClusterArns(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ecsClusterArns
     *        A list of ARNs, one for each cluster to be described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEcsClustersRequest withEcsClusterArns(String... ecsClusterArns) {
        if (this.ecsClusterArns == null) {
            setEcsClusterArns(new com.amazonaws.internal.SdkInternalList<String>(ecsClusterArns.length));
        }
        for (String ele : ecsClusterArns) {
            this.ecsClusterArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of ARNs, one for each cluster to be described.
     * </p>
     * 
     * @param ecsClusterArns
     *        A list of ARNs, one for each cluster to be described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEcsClustersRequest withEcsClusterArns(java.util.Collection<String> ecsClusterArns) {
        setEcsClusterArns(ecsClusterArns);
        return this;
    }

    /**
     * <p>
     * A stack ID. <code>DescribeEcsClusters</code> returns a description of the cluster that is registered with the
     * stack.
     * </p>
     * 
     * @param stackId
     *        A stack ID. <code>DescribeEcsClusters</code> returns a description of the cluster that is registered with
     *        the stack.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * A stack ID. <code>DescribeEcsClusters</code> returns a description of the cluster that is registered with the
     * stack.
     * </p>
     * 
     * @return A stack ID. <code>DescribeEcsClusters</code> returns a description of the cluster that is registered with
     *         the stack.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * A stack ID. <code>DescribeEcsClusters</code> returns a description of the cluster that is registered with the
     * stack.
     * </p>
     * 
     * @param stackId
     *        A stack ID. <code>DescribeEcsClusters</code> returns a description of the cluster that is registered with
     *        the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEcsClustersRequest withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * If the previous paginated request did not return all of the remaining results, the response object's
     * <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     * <code>DescribeEcsClusters</code> again and assign that token to the request object's <code>NextToken</code>
     * parameter. If there are no remaining results, the previous response object's <code>NextToken</code> parameter is
     * set to <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If the previous paginated request did not return all of the remaining results, the response object's
     *        <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     *        <code>DescribeEcsClusters</code> again and assign that token to the request object's
     *        <code>NextToken</code> parameter. If there are no remaining results, the previous response object's
     *        <code>NextToken</code> parameter is set to <code>null</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous paginated request did not return all of the remaining results, the response object's
     * <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     * <code>DescribeEcsClusters</code> again and assign that token to the request object's <code>NextToken</code>
     * parameter. If there are no remaining results, the previous response object's <code>NextToken</code> parameter is
     * set to <code>null</code>.
     * </p>
     * 
     * @return If the previous paginated request did not return all of the remaining results, the response object's
     *         <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     *         <code>DescribeEcsClusters</code> again and assign that token to the request object's
     *         <code>NextToken</code> parameter. If there are no remaining results, the previous response object's
     *         <code>NextToken</code> parameter is set to <code>null</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous paginated request did not return all of the remaining results, the response object's
     * <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     * <code>DescribeEcsClusters</code> again and assign that token to the request object's <code>NextToken</code>
     * parameter. If there are no remaining results, the previous response object's <code>NextToken</code> parameter is
     * set to <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If the previous paginated request did not return all of the remaining results, the response object's
     *        <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call
     *        <code>DescribeEcsClusters</code> again and assign that token to the request object's
     *        <code>NextToken</code> parameter. If there are no remaining results, the previous response object's
     *        <code>NextToken</code> parameter is set to <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEcsClustersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * To receive a paginated response, use this parameter to specify the maximum number of results to be returned with
     * a single call. If the number of available results exceeds this maximum, the response includes a
     * <code>NextToken</code> value that you can assign to the <code>NextToken</code> request parameter to get the next
     * set of results.
     * </p>
     * 
     * @param maxResults
     *        To receive a paginated response, use this parameter to specify the maximum number of results to be
     *        returned with a single call. If the number of available results exceeds this maximum, the response
     *        includes a <code>NextToken</code> value that you can assign to the <code>NextToken</code> request
     *        parameter to get the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * To receive a paginated response, use this parameter to specify the maximum number of results to be returned with
     * a single call. If the number of available results exceeds this maximum, the response includes a
     * <code>NextToken</code> value that you can assign to the <code>NextToken</code> request parameter to get the next
     * set of results.
     * </p>
     * 
     * @return To receive a paginated response, use this parameter to specify the maximum number of results to be
     *         returned with a single call. If the number of available results exceeds this maximum, the response
     *         includes a <code>NextToken</code> value that you can assign to the <code>NextToken</code> request
     *         parameter to get the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * To receive a paginated response, use this parameter to specify the maximum number of results to be returned with
     * a single call. If the number of available results exceeds this maximum, the response includes a
     * <code>NextToken</code> value that you can assign to the <code>NextToken</code> request parameter to get the next
     * set of results.
     * </p>
     * 
     * @param maxResults
     *        To receive a paginated response, use this parameter to specify the maximum number of results to be
     *        returned with a single call. If the number of available results exceeds this maximum, the response
     *        includes a <code>NextToken</code> value that you can assign to the <code>NextToken</code> request
     *        parameter to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEcsClustersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getEcsClusterArns() != null)
            sb.append("EcsClusterArns: ").append(getEcsClusterArns()).append(",");
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEcsClustersRequest == false)
            return false;
        DescribeEcsClustersRequest other = (DescribeEcsClustersRequest) obj;
        if (other.getEcsClusterArns() == null ^ this.getEcsClusterArns() == null)
            return false;
        if (other.getEcsClusterArns() != null && other.getEcsClusterArns().equals(this.getEcsClusterArns()) == false)
            return false;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEcsClusterArns() == null) ? 0 : getEcsClusterArns().hashCode());
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEcsClustersRequest clone() {
        return (DescribeEcsClustersRequest) super.clone();
    }

}
