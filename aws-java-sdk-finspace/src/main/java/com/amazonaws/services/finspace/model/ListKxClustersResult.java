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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListKxClusters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListKxClustersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists the cluster details.
     * </p>
     */
    private java.util.List<KxCluster> kxClusterSummaries;
    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Lists the cluster details.
     * </p>
     * 
     * @return Lists the cluster details.
     */

    public java.util.List<KxCluster> getKxClusterSummaries() {
        return kxClusterSummaries;
    }

    /**
     * <p>
     * Lists the cluster details.
     * </p>
     * 
     * @param kxClusterSummaries
     *        Lists the cluster details.
     */

    public void setKxClusterSummaries(java.util.Collection<KxCluster> kxClusterSummaries) {
        if (kxClusterSummaries == null) {
            this.kxClusterSummaries = null;
            return;
        }

        this.kxClusterSummaries = new java.util.ArrayList<KxCluster>(kxClusterSummaries);
    }

    /**
     * <p>
     * Lists the cluster details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKxClusterSummaries(java.util.Collection)} or {@link #withKxClusterSummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param kxClusterSummaries
     *        Lists the cluster details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKxClustersResult withKxClusterSummaries(KxCluster... kxClusterSummaries) {
        if (this.kxClusterSummaries == null) {
            setKxClusterSummaries(new java.util.ArrayList<KxCluster>(kxClusterSummaries.length));
        }
        for (KxCluster ele : kxClusterSummaries) {
            this.kxClusterSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the cluster details.
     * </p>
     * 
     * @param kxClusterSummaries
     *        Lists the cluster details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKxClustersResult withKxClusterSummaries(java.util.Collection<KxCluster> kxClusterSummaries) {
        setKxClusterSummaries(kxClusterSummaries);
        return this;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where a results page should begin.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @return A token that indicates where a results page should begin.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where a results page should begin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKxClustersResult withNextToken(String nextToken) {
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
        if (getKxClusterSummaries() != null)
            sb.append("KxClusterSummaries: ").append(getKxClusterSummaries()).append(",");
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

        if (obj instanceof ListKxClustersResult == false)
            return false;
        ListKxClustersResult other = (ListKxClustersResult) obj;
        if (other.getKxClusterSummaries() == null ^ this.getKxClusterSummaries() == null)
            return false;
        if (other.getKxClusterSummaries() != null && other.getKxClusterSummaries().equals(this.getKxClusterSummaries()) == false)
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

        hashCode = prime * hashCode + ((getKxClusterSummaries() == null) ? 0 : getKxClusterSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListKxClustersResult clone() {
        try {
            return (ListKxClustersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
