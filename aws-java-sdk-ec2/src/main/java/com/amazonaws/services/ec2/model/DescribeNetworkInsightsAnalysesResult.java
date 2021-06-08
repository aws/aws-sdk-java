/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class DescribeNetworkInsightsAnalysesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the network insights analyses.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<NetworkInsightsAnalysis> networkInsightsAnalyses;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the network insights analyses.
     * </p>
     * 
     * @return Information about the network insights analyses.
     */

    public java.util.List<NetworkInsightsAnalysis> getNetworkInsightsAnalyses() {
        if (networkInsightsAnalyses == null) {
            networkInsightsAnalyses = new com.amazonaws.internal.SdkInternalList<NetworkInsightsAnalysis>();
        }
        return networkInsightsAnalyses;
    }

    /**
     * <p>
     * Information about the network insights analyses.
     * </p>
     * 
     * @param networkInsightsAnalyses
     *        Information about the network insights analyses.
     */

    public void setNetworkInsightsAnalyses(java.util.Collection<NetworkInsightsAnalysis> networkInsightsAnalyses) {
        if (networkInsightsAnalyses == null) {
            this.networkInsightsAnalyses = null;
            return;
        }

        this.networkInsightsAnalyses = new com.amazonaws.internal.SdkInternalList<NetworkInsightsAnalysis>(networkInsightsAnalyses);
    }

    /**
     * <p>
     * Information about the network insights analyses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInsightsAnalyses(java.util.Collection)} or
     * {@link #withNetworkInsightsAnalyses(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param networkInsightsAnalyses
     *        Information about the network insights analyses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInsightsAnalysesResult withNetworkInsightsAnalyses(NetworkInsightsAnalysis... networkInsightsAnalyses) {
        if (this.networkInsightsAnalyses == null) {
            setNetworkInsightsAnalyses(new com.amazonaws.internal.SdkInternalList<NetworkInsightsAnalysis>(networkInsightsAnalyses.length));
        }
        for (NetworkInsightsAnalysis ele : networkInsightsAnalyses) {
            this.networkInsightsAnalyses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the network insights analyses.
     * </p>
     * 
     * @param networkInsightsAnalyses
     *        Information about the network insights analyses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInsightsAnalysesResult withNetworkInsightsAnalyses(java.util.Collection<NetworkInsightsAnalysis> networkInsightsAnalyses) {
        setNetworkInsightsAnalyses(networkInsightsAnalyses);
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

    public DescribeNetworkInsightsAnalysesResult withNextToken(String nextToken) {
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
        if (getNetworkInsightsAnalyses() != null)
            sb.append("NetworkInsightsAnalyses: ").append(getNetworkInsightsAnalyses()).append(",");
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

        if (obj instanceof DescribeNetworkInsightsAnalysesResult == false)
            return false;
        DescribeNetworkInsightsAnalysesResult other = (DescribeNetworkInsightsAnalysesResult) obj;
        if (other.getNetworkInsightsAnalyses() == null ^ this.getNetworkInsightsAnalyses() == null)
            return false;
        if (other.getNetworkInsightsAnalyses() != null && other.getNetworkInsightsAnalyses().equals(this.getNetworkInsightsAnalyses()) == false)
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

        hashCode = prime * hashCode + ((getNetworkInsightsAnalyses() == null) ? 0 : getNetworkInsightsAnalyses().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNetworkInsightsAnalysesResult clone() {
        try {
            return (DescribeNetworkInsightsAnalysesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
