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
package com.amazonaws.services.docdbelastic.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/ListClusters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListClustersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of Elastic DocumentDB cluster.
     * </p>
     */
    private java.util.List<ClusterInList> clusters;
    /**
     * <p>
     * The response will provide a nextToken if there is more data beyond the maxResults.
     * </p>
     * <p>
     * If there is no more data in the responce, the nextToken will not be returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of Elastic DocumentDB cluster.
     * </p>
     * 
     * @return A list of Elastic DocumentDB cluster.
     */

    public java.util.List<ClusterInList> getClusters() {
        return clusters;
    }

    /**
     * <p>
     * A list of Elastic DocumentDB cluster.
     * </p>
     * 
     * @param clusters
     *        A list of Elastic DocumentDB cluster.
     */

    public void setClusters(java.util.Collection<ClusterInList> clusters) {
        if (clusters == null) {
            this.clusters = null;
            return;
        }

        this.clusters = new java.util.ArrayList<ClusterInList>(clusters);
    }

    /**
     * <p>
     * A list of Elastic DocumentDB cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusters(java.util.Collection)} or {@link #withClusters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param clusters
     *        A list of Elastic DocumentDB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClustersResult withClusters(ClusterInList... clusters) {
        if (this.clusters == null) {
            setClusters(new java.util.ArrayList<ClusterInList>(clusters.length));
        }
        for (ClusterInList ele : clusters) {
            this.clusters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Elastic DocumentDB cluster.
     * </p>
     * 
     * @param clusters
     *        A list of Elastic DocumentDB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClustersResult withClusters(java.util.Collection<ClusterInList> clusters) {
        setClusters(clusters);
        return this;
    }

    /**
     * <p>
     * The response will provide a nextToken if there is more data beyond the maxResults.
     * </p>
     * <p>
     * If there is no more data in the responce, the nextToken will not be returned.
     * </p>
     * 
     * @param nextToken
     *        The response will provide a nextToken if there is more data beyond the maxResults.</p>
     *        <p>
     *        If there is no more data in the responce, the nextToken will not be returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The response will provide a nextToken if there is more data beyond the maxResults.
     * </p>
     * <p>
     * If there is no more data in the responce, the nextToken will not be returned.
     * </p>
     * 
     * @return The response will provide a nextToken if there is more data beyond the maxResults.</p>
     *         <p>
     *         If there is no more data in the responce, the nextToken will not be returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The response will provide a nextToken if there is more data beyond the maxResults.
     * </p>
     * <p>
     * If there is no more data in the responce, the nextToken will not be returned.
     * </p>
     * 
     * @param nextToken
     *        The response will provide a nextToken if there is more data beyond the maxResults.</p>
     *        <p>
     *        If there is no more data in the responce, the nextToken will not be returned.
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
        if (getClusters() != null)
            sb.append("Clusters: ").append(getClusters()).append(",");
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
        if (other.getClusters() == null ^ this.getClusters() == null)
            return false;
        if (other.getClusters() != null && other.getClusters().equals(this.getClusters()) == false)
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

        hashCode = prime * hashCode + ((getClusters() == null) ? 0 : getClusters().hashCode());
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
