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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ListClusters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListClustersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of full Amazon Resource Name (ARN) entries for each cluster associated with your account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> clusterArns;
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListClusters</code> request. When the results of a
     * <code>ListClusters</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next
     * page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of full Amazon Resource Name (ARN) entries for each cluster associated with your account.
     * </p>
     * 
     * @return The list of full Amazon Resource Name (ARN) entries for each cluster associated with your account.
     */

    public java.util.List<String> getClusterArns() {
        if (clusterArns == null) {
            clusterArns = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return clusterArns;
    }

    /**
     * <p>
     * The list of full Amazon Resource Name (ARN) entries for each cluster associated with your account.
     * </p>
     * 
     * @param clusterArns
     *        The list of full Amazon Resource Name (ARN) entries for each cluster associated with your account.
     */

    public void setClusterArns(java.util.Collection<String> clusterArns) {
        if (clusterArns == null) {
            this.clusterArns = null;
            return;
        }

        this.clusterArns = new com.amazonaws.internal.SdkInternalList<String>(clusterArns);
    }

    /**
     * <p>
     * The list of full Amazon Resource Name (ARN) entries for each cluster associated with your account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusterArns(java.util.Collection)} or {@link #withClusterArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param clusterArns
     *        The list of full Amazon Resource Name (ARN) entries for each cluster associated with your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClustersResult withClusterArns(String... clusterArns) {
        if (this.clusterArns == null) {
            setClusterArns(new com.amazonaws.internal.SdkInternalList<String>(clusterArns.length));
        }
        for (String ele : clusterArns) {
            this.clusterArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of full Amazon Resource Name (ARN) entries for each cluster associated with your account.
     * </p>
     * 
     * @param clusterArns
     *        The list of full Amazon Resource Name (ARN) entries for each cluster associated with your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClustersResult withClusterArns(java.util.Collection<String> clusterArns) {
        setClusterArns(clusterArns);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListClusters</code> request. When the results of a
     * <code>ListClusters</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next
     * page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListClusters</code> request. When the
     *        results of a <code>ListClusters</code> request exceed <code>maxResults</code>, this value can be used to
     *        retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *        return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListClusters</code> request. When the results of a
     * <code>ListClusters</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next
     * page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>ListClusters</code> request. When the
     *         results of a <code>ListClusters</code> request exceed <code>maxResults</code>, this value can be used to
     *         retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *         return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListClusters</code> request. When the results of a
     * <code>ListClusters</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next
     * page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListClusters</code> request. When the
     *        results of a <code>ListClusters</code> request exceed <code>maxResults</code>, this value can be used to
     *        retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *        return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClustersResult withNextToken(String nextToken) {
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
        if (getClusterArns() != null)
            sb.append("ClusterArns: ").append(getClusterArns()).append(",");
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

        if (obj instanceof ListClustersResult == false)
            return false;
        ListClustersResult other = (ListClustersResult) obj;
        if (other.getClusterArns() == null ^ this.getClusterArns() == null)
            return false;
        if (other.getClusterArns() != null && other.getClusterArns().equals(this.getClusterArns()) == false)
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

        hashCode = prime * hashCode + ((getClusterArns() == null) ? 0 : getClusterArns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListClustersResult clone() {
        try {
            return (ListClustersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
