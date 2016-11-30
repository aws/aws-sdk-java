/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeClusterResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about a specific cluster, including shipping information, cluster status, and other important
     * metadata.
     * </p>
     */
    private ClusterMetadata clusterMetadata;

    /**
     * <p>
     * Information about a specific cluster, including shipping information, cluster status, and other important
     * metadata.
     * </p>
     * 
     * @param clusterMetadata
     *        Information about a specific cluster, including shipping information, cluster status, and other important
     *        metadata.
     */

    public void setClusterMetadata(ClusterMetadata clusterMetadata) {
        this.clusterMetadata = clusterMetadata;
    }

    /**
     * <p>
     * Information about a specific cluster, including shipping information, cluster status, and other important
     * metadata.
     * </p>
     * 
     * @return Information about a specific cluster, including shipping information, cluster status, and other important
     *         metadata.
     */

    public ClusterMetadata getClusterMetadata() {
        return this.clusterMetadata;
    }

    /**
     * <p>
     * Information about a specific cluster, including shipping information, cluster status, and other important
     * metadata.
     * </p>
     * 
     * @param clusterMetadata
     *        Information about a specific cluster, including shipping information, cluster status, and other important
     *        metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClusterResult withClusterMetadata(ClusterMetadata clusterMetadata) {
        setClusterMetadata(clusterMetadata);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getClusterMetadata() != null)
            sb.append("ClusterMetadata: " + getClusterMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClusterResult == false)
            return false;
        DescribeClusterResult other = (DescribeClusterResult) obj;
        if (other.getClusterMetadata() == null ^ this.getClusterMetadata() == null)
            return false;
        if (other.getClusterMetadata() != null && other.getClusterMetadata().equals(this.getClusterMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterMetadata() == null) ? 0 : getClusterMetadata().hashCode());
        return hashCode;
    }

    @Override
    public DescribeClusterResult clone() {
        try {
            return (DescribeClusterResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
