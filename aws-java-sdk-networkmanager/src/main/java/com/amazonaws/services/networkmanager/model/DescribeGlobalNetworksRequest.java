/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DescribeGlobalNetworks"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGlobalNetworksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The IDs of one or more global networks. The maximum is 10.
     * </p>
     */
    private java.util.List<String> globalNetworkIds;
    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The IDs of one or more global networks. The maximum is 10.
     * </p>
     * 
     * @return The IDs of one or more global networks. The maximum is 10.
     */

    public java.util.List<String> getGlobalNetworkIds() {
        return globalNetworkIds;
    }

    /**
     * <p>
     * The IDs of one or more global networks. The maximum is 10.
     * </p>
     * 
     * @param globalNetworkIds
     *        The IDs of one or more global networks. The maximum is 10.
     */

    public void setGlobalNetworkIds(java.util.Collection<String> globalNetworkIds) {
        if (globalNetworkIds == null) {
            this.globalNetworkIds = null;
            return;
        }

        this.globalNetworkIds = new java.util.ArrayList<String>(globalNetworkIds);
    }

    /**
     * <p>
     * The IDs of one or more global networks. The maximum is 10.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlobalNetworkIds(java.util.Collection)} or {@link #withGlobalNetworkIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param globalNetworkIds
     *        The IDs of one or more global networks. The maximum is 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGlobalNetworksRequest withGlobalNetworkIds(String... globalNetworkIds) {
        if (this.globalNetworkIds == null) {
            setGlobalNetworkIds(new java.util.ArrayList<String>(globalNetworkIds.length));
        }
        for (String ele : globalNetworkIds) {
            this.globalNetworkIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of one or more global networks. The maximum is 10.
     * </p>
     * 
     * @param globalNetworkIds
     *        The IDs of one or more global networks. The maximum is 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGlobalNetworksRequest withGlobalNetworkIds(java.util.Collection<String> globalNetworkIds) {
        setGlobalNetworkIds(globalNetworkIds);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @return The maximum number of results to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGlobalNetworksRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGlobalNetworksRequest withNextToken(String nextToken) {
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
        if (getGlobalNetworkIds() != null)
            sb.append("GlobalNetworkIds: ").append(getGlobalNetworkIds()).append(",");
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

        if (obj instanceof DescribeGlobalNetworksRequest == false)
            return false;
        DescribeGlobalNetworksRequest other = (DescribeGlobalNetworksRequest) obj;
        if (other.getGlobalNetworkIds() == null ^ this.getGlobalNetworkIds() == null)
            return false;
        if (other.getGlobalNetworkIds() != null && other.getGlobalNetworkIds().equals(this.getGlobalNetworkIds()) == false)
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

        hashCode = prime * hashCode + ((getGlobalNetworkIds() == null) ? 0 : getGlobalNetworkIds().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeGlobalNetworksRequest clone() {
        return (DescribeGlobalNetworksRequest) super.clone();
    }

}
