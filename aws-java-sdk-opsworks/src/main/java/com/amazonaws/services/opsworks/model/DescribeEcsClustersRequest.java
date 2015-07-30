/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#describeEcsClusters(DescribeEcsClustersRequest) DescribeEcsClusters operation}.
 * <p>
 * Describes Amazon ECS clusters that are registered with a stack. If you
 * specify only a stack ID, you can use the <code>MaxResults</code> and
 * <code>NextToken</code> parameters to paginate the response. However,
 * AWS OpsWorks currently supports only one cluster per layer, so the
 * result set has a maximum of one element.
 * </p>
 * <p>
 * <b>Required Permissions</b> : To use this action, an IAM user must
 * have a Show, Deploy, or Manage permissions level for the stack or an
 * attached policy that explicitly grants permission. For more
 * information on user permissions, see
 * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#describeEcsClusters(DescribeEcsClustersRequest)
 */
public class DescribeEcsClustersRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A list of ARNs, one for each cluster to be described.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> ecsClusterArns;

    /**
     * A stack ID. <code>DescribeEcsClusters</code> returns a description of
     * the cluster that is registered with the stack.
     */
    private String stackId;

    /**
     * If the previous paginated request did not return all of the remaining
     * results, the response object's<code>NextToken</code> parameter value
     * is set to a token. To retrieve the next set of results, call
     * <code>DescribeEcsClusters</code> again and assign that token to the
     * request object's <code>NextToken</code> parameter. If there are no
     * remaining results, the previous response object's
     * <code>NextToken</code> parameter is set to <code>null</code>.
     */
    private String nextToken;

    /**
     * To receive a paginated response, use this parameter to specify the
     * maximum number of results to be returned with a single call. If the
     * number of available results exceeds this maximum, the response
     * includes a <code>NextToken</code> value that you can assign to the
     * <code>NextToken</code> request parameter to get the next set of
     * results.
     */
    private Integer maxResults;

    /**
     * A list of ARNs, one for each cluster to be described.
     *
     * @return A list of ARNs, one for each cluster to be described.
     */
    public java.util.List<String> getEcsClusterArns() {
        if (ecsClusterArns == null) {
              ecsClusterArns = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              ecsClusterArns.setAutoConstruct(true);
        }
        return ecsClusterArns;
    }
    
    /**
     * A list of ARNs, one for each cluster to be described.
     *
     * @param ecsClusterArns A list of ARNs, one for each cluster to be described.
     */
    public void setEcsClusterArns(java.util.Collection<String> ecsClusterArns) {
        if (ecsClusterArns == null) {
            this.ecsClusterArns = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> ecsClusterArnsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(ecsClusterArns.size());
        ecsClusterArnsCopy.addAll(ecsClusterArns);
        this.ecsClusterArns = ecsClusterArnsCopy;
    }
    
    /**
     * A list of ARNs, one for each cluster to be described.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setEcsClusterArns(java.util.Collection)} or {@link
     * #withEcsClusterArns(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ecsClusterArns A list of ARNs, one for each cluster to be described.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeEcsClustersRequest withEcsClusterArns(String... ecsClusterArns) {
        if (getEcsClusterArns() == null) setEcsClusterArns(new java.util.ArrayList<String>(ecsClusterArns.length));
        for (String value : ecsClusterArns) {
            getEcsClusterArns().add(value);
        }
        return this;
    }
    
    /**
     * A list of ARNs, one for each cluster to be described.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ecsClusterArns A list of ARNs, one for each cluster to be described.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeEcsClustersRequest withEcsClusterArns(java.util.Collection<String> ecsClusterArns) {
        if (ecsClusterArns == null) {
            this.ecsClusterArns = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> ecsClusterArnsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(ecsClusterArns.size());
            ecsClusterArnsCopy.addAll(ecsClusterArns);
            this.ecsClusterArns = ecsClusterArnsCopy;
        }

        return this;
    }

    /**
     * A stack ID. <code>DescribeEcsClusters</code> returns a description of
     * the cluster that is registered with the stack.
     *
     * @return A stack ID. <code>DescribeEcsClusters</code> returns a description of
     *         the cluster that is registered with the stack.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * A stack ID. <code>DescribeEcsClusters</code> returns a description of
     * the cluster that is registered with the stack.
     *
     * @param stackId A stack ID. <code>DescribeEcsClusters</code> returns a description of
     *         the cluster that is registered with the stack.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * A stack ID. <code>DescribeEcsClusters</code> returns a description of
     * the cluster that is registered with the stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId A stack ID. <code>DescribeEcsClusters</code> returns a description of
     *         the cluster that is registered with the stack.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeEcsClustersRequest withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * If the previous paginated request did not return all of the remaining
     * results, the response object's<code>NextToken</code> parameter value
     * is set to a token. To retrieve the next set of results, call
     * <code>DescribeEcsClusters</code> again and assign that token to the
     * request object's <code>NextToken</code> parameter. If there are no
     * remaining results, the previous response object's
     * <code>NextToken</code> parameter is set to <code>null</code>.
     *
     * @return If the previous paginated request did not return all of the remaining
     *         results, the response object's<code>NextToken</code> parameter value
     *         is set to a token. To retrieve the next set of results, call
     *         <code>DescribeEcsClusters</code> again and assign that token to the
     *         request object's <code>NextToken</code> parameter. If there are no
     *         remaining results, the previous response object's
     *         <code>NextToken</code> parameter is set to <code>null</code>.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * If the previous paginated request did not return all of the remaining
     * results, the response object's<code>NextToken</code> parameter value
     * is set to a token. To retrieve the next set of results, call
     * <code>DescribeEcsClusters</code> again and assign that token to the
     * request object's <code>NextToken</code> parameter. If there are no
     * remaining results, the previous response object's
     * <code>NextToken</code> parameter is set to <code>null</code>.
     *
     * @param nextToken If the previous paginated request did not return all of the remaining
     *         results, the response object's<code>NextToken</code> parameter value
     *         is set to a token. To retrieve the next set of results, call
     *         <code>DescribeEcsClusters</code> again and assign that token to the
     *         request object's <code>NextToken</code> parameter. If there are no
     *         remaining results, the previous response object's
     *         <code>NextToken</code> parameter is set to <code>null</code>.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * If the previous paginated request did not return all of the remaining
     * results, the response object's<code>NextToken</code> parameter value
     * is set to a token. To retrieve the next set of results, call
     * <code>DescribeEcsClusters</code> again and assign that token to the
     * request object's <code>NextToken</code> parameter. If there are no
     * remaining results, the previous response object's
     * <code>NextToken</code> parameter is set to <code>null</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken If the previous paginated request did not return all of the remaining
     *         results, the response object's<code>NextToken</code> parameter value
     *         is set to a token. To retrieve the next set of results, call
     *         <code>DescribeEcsClusters</code> again and assign that token to the
     *         request object's <code>NextToken</code> parameter. If there are no
     *         remaining results, the previous response object's
     *         <code>NextToken</code> parameter is set to <code>null</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeEcsClustersRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * To receive a paginated response, use this parameter to specify the
     * maximum number of results to be returned with a single call. If the
     * number of available results exceeds this maximum, the response
     * includes a <code>NextToken</code> value that you can assign to the
     * <code>NextToken</code> request parameter to get the next set of
     * results.
     *
     * @return To receive a paginated response, use this parameter to specify the
     *         maximum number of results to be returned with a single call. If the
     *         number of available results exceeds this maximum, the response
     *         includes a <code>NextToken</code> value that you can assign to the
     *         <code>NextToken</code> request parameter to get the next set of
     *         results.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * To receive a paginated response, use this parameter to specify the
     * maximum number of results to be returned with a single call. If the
     * number of available results exceeds this maximum, the response
     * includes a <code>NextToken</code> value that you can assign to the
     * <code>NextToken</code> request parameter to get the next set of
     * results.
     *
     * @param maxResults To receive a paginated response, use this parameter to specify the
     *         maximum number of results to be returned with a single call. If the
     *         number of available results exceeds this maximum, the response
     *         includes a <code>NextToken</code> value that you can assign to the
     *         <code>NextToken</code> request parameter to get the next set of
     *         results.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * To receive a paginated response, use this parameter to specify the
     * maximum number of results to be returned with a single call. If the
     * number of available results exceeds this maximum, the response
     * includes a <code>NextToken</code> value that you can assign to the
     * <code>NextToken</code> request parameter to get the next set of
     * results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults To receive a paginated response, use this parameter to specify the
     *         maximum number of results to be returned with a single call. If the
     *         number of available results exceeds this maximum, the response
     *         includes a <code>NextToken</code> value that you can assign to the
     *         <code>NextToken</code> request parameter to get the next set of
     *         results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeEcsClustersRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEcsClusterArns() != null) sb.append("EcsClusterArns: " + getEcsClusterArns() + ",");
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeEcsClustersRequest == false) return false;
        DescribeEcsClustersRequest other = (DescribeEcsClustersRequest)obj;
        
        if (other.getEcsClusterArns() == null ^ this.getEcsClusterArns() == null) return false;
        if (other.getEcsClusterArns() != null && other.getEcsClusterArns().equals(this.getEcsClusterArns()) == false) return false; 
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeEcsClustersRequest clone() {
        
            return (DescribeEcsClustersRequest) super.clone();
    }

}
    