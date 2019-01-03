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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/ListClusterJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListClusterJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The 39-character ID for the cluster that you want to list, for example
     * <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     */
    private String clusterId;
    /**
     * <p>
     * The number of <code>JobListEntry</code> objects to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * HTTP requests are stateless. To identify what object comes "next" in the list of <code>JobListEntry</code>
     * objects, you have the option of specifying <code>NextToken</code> as the starting point for your returned list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The 39-character ID for the cluster that you want to list, for example
     * <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @param clusterId
     *        The 39-character ID for the cluster that you want to list, for example
     *        <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     */

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The 39-character ID for the cluster that you want to list, for example
     * <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @return The 39-character ID for the cluster that you want to list, for example
     *         <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     */

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * <p>
     * The 39-character ID for the cluster that you want to list, for example
     * <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @param clusterId
     *        The 39-character ID for the cluster that you want to list, for example
     *        <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClusterJobsRequest withClusterId(String clusterId) {
        setClusterId(clusterId);
        return this;
    }

    /**
     * <p>
     * The number of <code>JobListEntry</code> objects to return.
     * </p>
     * 
     * @param maxResults
     *        The number of <code>JobListEntry</code> objects to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The number of <code>JobListEntry</code> objects to return.
     * </p>
     * 
     * @return The number of <code>JobListEntry</code> objects to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The number of <code>JobListEntry</code> objects to return.
     * </p>
     * 
     * @param maxResults
     *        The number of <code>JobListEntry</code> objects to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClusterJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * HTTP requests are stateless. To identify what object comes "next" in the list of <code>JobListEntry</code>
     * objects, you have the option of specifying <code>NextToken</code> as the starting point for your returned list.
     * </p>
     * 
     * @param nextToken
     *        HTTP requests are stateless. To identify what object comes "next" in the list of <code>JobListEntry</code>
     *        objects, you have the option of specifying <code>NextToken</code> as the starting point for your returned
     *        list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * HTTP requests are stateless. To identify what object comes "next" in the list of <code>JobListEntry</code>
     * objects, you have the option of specifying <code>NextToken</code> as the starting point for your returned list.
     * </p>
     * 
     * @return HTTP requests are stateless. To identify what object comes "next" in the list of
     *         <code>JobListEntry</code> objects, you have the option of specifying <code>NextToken</code> as the
     *         starting point for your returned list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * HTTP requests are stateless. To identify what object comes "next" in the list of <code>JobListEntry</code>
     * objects, you have the option of specifying <code>NextToken</code> as the starting point for your returned list.
     * </p>
     * 
     * @param nextToken
     *        HTTP requests are stateless. To identify what object comes "next" in the list of <code>JobListEntry</code>
     *        objects, you have the option of specifying <code>NextToken</code> as the starting point for your returned
     *        list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClusterJobsRequest withNextToken(String nextToken) {
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
        if (getClusterId() != null)
            sb.append("ClusterId: ").append(getClusterId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListClusterJobsRequest == false)
            return false;
        ListClusterJobsRequest other = (ListClusterJobsRequest) obj;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListClusterJobsRequest clone() {
        return (ListClusterJobsRequest) super.clone();
    }

}
