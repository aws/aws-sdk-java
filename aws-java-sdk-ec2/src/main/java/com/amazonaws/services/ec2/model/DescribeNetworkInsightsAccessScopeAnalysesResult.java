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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNetworkInsightsAccessScopeAnalysesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The Network Access Scope analyses.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<NetworkInsightsAccessScopeAnalysis> networkInsightsAccessScopeAnalyses;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Network Access Scope analyses.
     * </p>
     * 
     * @return The Network Access Scope analyses.
     */

    public java.util.List<NetworkInsightsAccessScopeAnalysis> getNetworkInsightsAccessScopeAnalyses() {
        if (networkInsightsAccessScopeAnalyses == null) {
            networkInsightsAccessScopeAnalyses = new com.amazonaws.internal.SdkInternalList<NetworkInsightsAccessScopeAnalysis>();
        }
        return networkInsightsAccessScopeAnalyses;
    }

    /**
     * <p>
     * The Network Access Scope analyses.
     * </p>
     * 
     * @param networkInsightsAccessScopeAnalyses
     *        The Network Access Scope analyses.
     */

    public void setNetworkInsightsAccessScopeAnalyses(java.util.Collection<NetworkInsightsAccessScopeAnalysis> networkInsightsAccessScopeAnalyses) {
        if (networkInsightsAccessScopeAnalyses == null) {
            this.networkInsightsAccessScopeAnalyses = null;
            return;
        }

        this.networkInsightsAccessScopeAnalyses = new com.amazonaws.internal.SdkInternalList<NetworkInsightsAccessScopeAnalysis>(
                networkInsightsAccessScopeAnalyses);
    }

    /**
     * <p>
     * The Network Access Scope analyses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInsightsAccessScopeAnalyses(java.util.Collection)} or
     * {@link #withNetworkInsightsAccessScopeAnalyses(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param networkInsightsAccessScopeAnalyses
     *        The Network Access Scope analyses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInsightsAccessScopeAnalysesResult withNetworkInsightsAccessScopeAnalyses(
            NetworkInsightsAccessScopeAnalysis... networkInsightsAccessScopeAnalyses) {
        if (this.networkInsightsAccessScopeAnalyses == null) {
            setNetworkInsightsAccessScopeAnalyses(new com.amazonaws.internal.SdkInternalList<NetworkInsightsAccessScopeAnalysis>(
                    networkInsightsAccessScopeAnalyses.length));
        }
        for (NetworkInsightsAccessScopeAnalysis ele : networkInsightsAccessScopeAnalyses) {
            this.networkInsightsAccessScopeAnalyses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Network Access Scope analyses.
     * </p>
     * 
     * @param networkInsightsAccessScopeAnalyses
     *        The Network Access Scope analyses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInsightsAccessScopeAnalysesResult withNetworkInsightsAccessScopeAnalyses(
            java.util.Collection<NetworkInsightsAccessScopeAnalysis> networkInsightsAccessScopeAnalyses) {
        setNetworkInsightsAccessScopeAnalyses(networkInsightsAccessScopeAnalyses);
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

    public DescribeNetworkInsightsAccessScopeAnalysesResult withNextToken(String nextToken) {
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
        if (getNetworkInsightsAccessScopeAnalyses() != null)
            sb.append("NetworkInsightsAccessScopeAnalyses: ").append(getNetworkInsightsAccessScopeAnalyses()).append(",");
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

        if (obj instanceof DescribeNetworkInsightsAccessScopeAnalysesResult == false)
            return false;
        DescribeNetworkInsightsAccessScopeAnalysesResult other = (DescribeNetworkInsightsAccessScopeAnalysesResult) obj;
        if (other.getNetworkInsightsAccessScopeAnalyses() == null ^ this.getNetworkInsightsAccessScopeAnalyses() == null)
            return false;
        if (other.getNetworkInsightsAccessScopeAnalyses() != null
                && other.getNetworkInsightsAccessScopeAnalyses().equals(this.getNetworkInsightsAccessScopeAnalyses()) == false)
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

        hashCode = prime * hashCode + ((getNetworkInsightsAccessScopeAnalyses() == null) ? 0 : getNetworkInsightsAccessScopeAnalyses().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNetworkInsightsAccessScopeAnalysesResult clone() {
        try {
            return (DescribeNetworkInsightsAccessScopeAnalysesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
