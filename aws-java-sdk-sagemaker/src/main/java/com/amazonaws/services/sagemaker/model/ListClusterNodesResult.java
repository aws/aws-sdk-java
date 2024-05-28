/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListClusterNodes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListClusterNodesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The next token specified for listing instances in a SageMaker HyperPod cluster.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The summaries of listed instances in a SageMaker HyperPod cluster
     * </p>
     */
    private java.util.List<ClusterNodeSummary> clusterNodeSummaries;

    /**
     * <p>
     * The next token specified for listing instances in a SageMaker HyperPod cluster.
     * </p>
     * 
     * @param nextToken
     *        The next token specified for listing instances in a SageMaker HyperPod cluster.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token specified for listing instances in a SageMaker HyperPod cluster.
     * </p>
     * 
     * @return The next token specified for listing instances in a SageMaker HyperPod cluster.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next token specified for listing instances in a SageMaker HyperPod cluster.
     * </p>
     * 
     * @param nextToken
     *        The next token specified for listing instances in a SageMaker HyperPod cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClusterNodesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The summaries of listed instances in a SageMaker HyperPod cluster
     * </p>
     * 
     * @return The summaries of listed instances in a SageMaker HyperPod cluster
     */

    public java.util.List<ClusterNodeSummary> getClusterNodeSummaries() {
        return clusterNodeSummaries;
    }

    /**
     * <p>
     * The summaries of listed instances in a SageMaker HyperPod cluster
     * </p>
     * 
     * @param clusterNodeSummaries
     *        The summaries of listed instances in a SageMaker HyperPod cluster
     */

    public void setClusterNodeSummaries(java.util.Collection<ClusterNodeSummary> clusterNodeSummaries) {
        if (clusterNodeSummaries == null) {
            this.clusterNodeSummaries = null;
            return;
        }

        this.clusterNodeSummaries = new java.util.ArrayList<ClusterNodeSummary>(clusterNodeSummaries);
    }

    /**
     * <p>
     * The summaries of listed instances in a SageMaker HyperPod cluster
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusterNodeSummaries(java.util.Collection)} or {@link #withClusterNodeSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param clusterNodeSummaries
     *        The summaries of listed instances in a SageMaker HyperPod cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClusterNodesResult withClusterNodeSummaries(ClusterNodeSummary... clusterNodeSummaries) {
        if (this.clusterNodeSummaries == null) {
            setClusterNodeSummaries(new java.util.ArrayList<ClusterNodeSummary>(clusterNodeSummaries.length));
        }
        for (ClusterNodeSummary ele : clusterNodeSummaries) {
            this.clusterNodeSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The summaries of listed instances in a SageMaker HyperPod cluster
     * </p>
     * 
     * @param clusterNodeSummaries
     *        The summaries of listed instances in a SageMaker HyperPod cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClusterNodesResult withClusterNodeSummaries(java.util.Collection<ClusterNodeSummary> clusterNodeSummaries) {
        setClusterNodeSummaries(clusterNodeSummaries);
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
        if (getClusterNodeSummaries() != null)
            sb.append("ClusterNodeSummaries: ").append(getClusterNodeSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListClusterNodesResult == false)
            return false;
        ListClusterNodesResult other = (ListClusterNodesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getClusterNodeSummaries() == null ^ this.getClusterNodeSummaries() == null)
            return false;
        if (other.getClusterNodeSummaries() != null && other.getClusterNodeSummaries().equals(this.getClusterNodeSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getClusterNodeSummaries() == null) ? 0 : getClusterNodeSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListClusterNodesResult clone() {
        try {
            return (ListClusterNodesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
