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
package com.amazonaws.services.cloudhsmv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DescribeClusters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClustersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of clusters.
     * </p>
     */
    private java.util.List<Cluster> clusters;
    /**
     * <p>
     * An opaque string that indicates that the response contains only a subset of clusters. Use this value in a
     * subsequent <code>DescribeClusters</code> request to get more clusters.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of clusters.
     * </p>
     * 
     * @return A list of clusters.
     */

    public java.util.List<Cluster> getClusters() {
        return clusters;
    }

    /**
     * <p>
     * A list of clusters.
     * </p>
     * 
     * @param clusters
     *        A list of clusters.
     */

    public void setClusters(java.util.Collection<Cluster> clusters) {
        if (clusters == null) {
            this.clusters = null;
            return;
        }

        this.clusters = new java.util.ArrayList<Cluster>(clusters);
    }

    /**
     * <p>
     * A list of clusters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusters(java.util.Collection)} or {@link #withClusters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param clusters
     *        A list of clusters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClustersResult withClusters(Cluster... clusters) {
        if (this.clusters == null) {
            setClusters(new java.util.ArrayList<Cluster>(clusters.length));
        }
        for (Cluster ele : clusters) {
            this.clusters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of clusters.
     * </p>
     * 
     * @param clusters
     *        A list of clusters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClustersResult withClusters(java.util.Collection<Cluster> clusters) {
        setClusters(clusters);
        return this;
    }

    /**
     * <p>
     * An opaque string that indicates that the response contains only a subset of clusters. Use this value in a
     * subsequent <code>DescribeClusters</code> request to get more clusters.
     * </p>
     * 
     * @param nextToken
     *        An opaque string that indicates that the response contains only a subset of clusters. Use this value in a
     *        subsequent <code>DescribeClusters</code> request to get more clusters.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An opaque string that indicates that the response contains only a subset of clusters. Use this value in a
     * subsequent <code>DescribeClusters</code> request to get more clusters.
     * </p>
     * 
     * @return An opaque string that indicates that the response contains only a subset of clusters. Use this value in a
     *         subsequent <code>DescribeClusters</code> request to get more clusters.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An opaque string that indicates that the response contains only a subset of clusters. Use this value in a
     * subsequent <code>DescribeClusters</code> request to get more clusters.
     * </p>
     * 
     * @param nextToken
     *        An opaque string that indicates that the response contains only a subset of clusters. Use this value in a
     *        subsequent <code>DescribeClusters</code> request to get more clusters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClustersResult withNextToken(String nextToken) {
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

        if (obj instanceof DescribeClustersResult == false)
            return false;
        DescribeClustersResult other = (DescribeClustersResult) obj;
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
    public DescribeClustersResult clone() {
        try {
            return (DescribeClustersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
