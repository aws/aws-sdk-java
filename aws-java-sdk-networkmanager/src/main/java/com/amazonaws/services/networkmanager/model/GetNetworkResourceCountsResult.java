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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetNetworkResourceCounts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetNetworkResourceCountsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The count of resources.
     * </p>
     */
    private java.util.List<NetworkResourceCount> networkResourceCounts;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The count of resources.
     * </p>
     * 
     * @return The count of resources.
     */

    public java.util.List<NetworkResourceCount> getNetworkResourceCounts() {
        return networkResourceCounts;
    }

    /**
     * <p>
     * The count of resources.
     * </p>
     * 
     * @param networkResourceCounts
     *        The count of resources.
     */

    public void setNetworkResourceCounts(java.util.Collection<NetworkResourceCount> networkResourceCounts) {
        if (networkResourceCounts == null) {
            this.networkResourceCounts = null;
            return;
        }

        this.networkResourceCounts = new java.util.ArrayList<NetworkResourceCount>(networkResourceCounts);
    }

    /**
     * <p>
     * The count of resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkResourceCounts(java.util.Collection)} or
     * {@link #withNetworkResourceCounts(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param networkResourceCounts
     *        The count of resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkResourceCountsResult withNetworkResourceCounts(NetworkResourceCount... networkResourceCounts) {
        if (this.networkResourceCounts == null) {
            setNetworkResourceCounts(new java.util.ArrayList<NetworkResourceCount>(networkResourceCounts.length));
        }
        for (NetworkResourceCount ele : networkResourceCounts) {
            this.networkResourceCounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The count of resources.
     * </p>
     * 
     * @param networkResourceCounts
     *        The count of resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkResourceCountsResult withNetworkResourceCounts(java.util.Collection<NetworkResourceCount> networkResourceCounts) {
        setNetworkResourceCounts(networkResourceCounts);
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

    public GetNetworkResourceCountsResult withNextToken(String nextToken) {
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
        if (getNetworkResourceCounts() != null)
            sb.append("NetworkResourceCounts: ").append(getNetworkResourceCounts()).append(",");
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

        if (obj instanceof GetNetworkResourceCountsResult == false)
            return false;
        GetNetworkResourceCountsResult other = (GetNetworkResourceCountsResult) obj;
        if (other.getNetworkResourceCounts() == null ^ this.getNetworkResourceCounts() == null)
            return false;
        if (other.getNetworkResourceCounts() != null && other.getNetworkResourceCounts().equals(this.getNetworkResourceCounts()) == false)
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

        hashCode = prime * hashCode + ((getNetworkResourceCounts() == null) ? 0 : getNetworkResourceCounts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetNetworkResourceCountsResult clone() {
        try {
            return (GetNetworkResourceCountsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
