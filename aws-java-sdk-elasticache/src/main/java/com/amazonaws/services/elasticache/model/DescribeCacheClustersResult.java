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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a <code>DescribeCacheClusters</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeCacheClusters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCacheClustersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A list of clusters. Each item in the list contains detailed information about one cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CacheCluster> cacheClusters;

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @param marker
     *        Provides an identifier to allow retrieval of paginated results.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @return Provides an identifier to allow retrieval of paginated results.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @param marker
     *        Provides an identifier to allow retrieval of paginated results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCacheClustersResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A list of clusters. Each item in the list contains detailed information about one cluster.
     * </p>
     * 
     * @return A list of clusters. Each item in the list contains detailed information about one cluster.
     */

    public java.util.List<CacheCluster> getCacheClusters() {
        if (cacheClusters == null) {
            cacheClusters = new com.amazonaws.internal.SdkInternalList<CacheCluster>();
        }
        return cacheClusters;
    }

    /**
     * <p>
     * A list of clusters. Each item in the list contains detailed information about one cluster.
     * </p>
     * 
     * @param cacheClusters
     *        A list of clusters. Each item in the list contains detailed information about one cluster.
     */

    public void setCacheClusters(java.util.Collection<CacheCluster> cacheClusters) {
        if (cacheClusters == null) {
            this.cacheClusters = null;
            return;
        }

        this.cacheClusters = new com.amazonaws.internal.SdkInternalList<CacheCluster>(cacheClusters);
    }

    /**
     * <p>
     * A list of clusters. Each item in the list contains detailed information about one cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCacheClusters(java.util.Collection)} or {@link #withCacheClusters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param cacheClusters
     *        A list of clusters. Each item in the list contains detailed information about one cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCacheClustersResult withCacheClusters(CacheCluster... cacheClusters) {
        if (this.cacheClusters == null) {
            setCacheClusters(new com.amazonaws.internal.SdkInternalList<CacheCluster>(cacheClusters.length));
        }
        for (CacheCluster ele : cacheClusters) {
            this.cacheClusters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of clusters. Each item in the list contains detailed information about one cluster.
     * </p>
     * 
     * @param cacheClusters
     *        A list of clusters. Each item in the list contains detailed information about one cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCacheClustersResult withCacheClusters(java.util.Collection<CacheCluster> cacheClusters) {
        setCacheClusters(cacheClusters);
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getCacheClusters() != null)
            sb.append("CacheClusters: ").append(getCacheClusters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCacheClustersResult == false)
            return false;
        DescribeCacheClustersResult other = (DescribeCacheClustersResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getCacheClusters() == null ^ this.getCacheClusters() == null)
            return false;
        if (other.getCacheClusters() != null && other.getCacheClusters().equals(this.getCacheClusters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getCacheClusters() == null) ? 0 : getCacheClusters().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCacheClustersResult clone() {
        try {
            return (DescribeCacheClustersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
