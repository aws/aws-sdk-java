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
package com.amazonaws.services.dax.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DescribeClusters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClustersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The descriptions of your DAX clusters, in response to a <i>DescribeClusters</i> request.
     * </p>
     */
    private java.util.List<Cluster> clusters;

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @param nextToken
     *        Provides an identifier to allow retrieval of paginated results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @return Provides an identifier to allow retrieval of paginated results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @param nextToken
     *        Provides an identifier to allow retrieval of paginated results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClustersResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The descriptions of your DAX clusters, in response to a <i>DescribeClusters</i> request.
     * </p>
     * 
     * @return The descriptions of your DAX clusters, in response to a <i>DescribeClusters</i> request.
     */

    public java.util.List<Cluster> getClusters() {
        return clusters;
    }

    /**
     * <p>
     * The descriptions of your DAX clusters, in response to a <i>DescribeClusters</i> request.
     * </p>
     * 
     * @param clusters
     *        The descriptions of your DAX clusters, in response to a <i>DescribeClusters</i> request.
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
     * The descriptions of your DAX clusters, in response to a <i>DescribeClusters</i> request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusters(java.util.Collection)} or {@link #withClusters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param clusters
     *        The descriptions of your DAX clusters, in response to a <i>DescribeClusters</i> request.
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
     * The descriptions of your DAX clusters, in response to a <i>DescribeClusters</i> request.
     * </p>
     * 
     * @param clusters
     *        The descriptions of your DAX clusters, in response to a <i>DescribeClusters</i> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClustersResult withClusters(java.util.Collection<Cluster> clusters) {
        setClusters(clusters);
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
        if (getClusters() != null)
            sb.append("Clusters: ").append(getClusters());
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
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getClusters() == null ^ this.getClusters() == null)
            return false;
        if (other.getClusters() != null && other.getClusters().equals(this.getClusters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getClusters() == null) ? 0 : getClusters().hashCode());
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
