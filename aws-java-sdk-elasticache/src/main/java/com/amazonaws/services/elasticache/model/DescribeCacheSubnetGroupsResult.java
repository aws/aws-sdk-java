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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a <code>DescribeCacheSubnetGroups</code> operation.
 * </p>
 */
public class DescribeCacheSubnetGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A list of cache subnet groups. Each element in the list contains detailed information about one group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CacheSubnetGroup> cacheSubnetGroups;

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

    public DescribeCacheSubnetGroupsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A list of cache subnet groups. Each element in the list contains detailed information about one group.
     * </p>
     * 
     * @return A list of cache subnet groups. Each element in the list contains detailed information about one group.
     */

    public java.util.List<CacheSubnetGroup> getCacheSubnetGroups() {
        if (cacheSubnetGroups == null) {
            cacheSubnetGroups = new com.amazonaws.internal.SdkInternalList<CacheSubnetGroup>();
        }
        return cacheSubnetGroups;
    }

    /**
     * <p>
     * A list of cache subnet groups. Each element in the list contains detailed information about one group.
     * </p>
     * 
     * @param cacheSubnetGroups
     *        A list of cache subnet groups. Each element in the list contains detailed information about one group.
     */

    public void setCacheSubnetGroups(java.util.Collection<CacheSubnetGroup> cacheSubnetGroups) {
        if (cacheSubnetGroups == null) {
            this.cacheSubnetGroups = null;
            return;
        }

        this.cacheSubnetGroups = new com.amazonaws.internal.SdkInternalList<CacheSubnetGroup>(cacheSubnetGroups);
    }

    /**
     * <p>
     * A list of cache subnet groups. Each element in the list contains detailed information about one group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCacheSubnetGroups(java.util.Collection)} or {@link #withCacheSubnetGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param cacheSubnetGroups
     *        A list of cache subnet groups. Each element in the list contains detailed information about one group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCacheSubnetGroupsResult withCacheSubnetGroups(CacheSubnetGroup... cacheSubnetGroups) {
        if (this.cacheSubnetGroups == null) {
            setCacheSubnetGroups(new com.amazonaws.internal.SdkInternalList<CacheSubnetGroup>(cacheSubnetGroups.length));
        }
        for (CacheSubnetGroup ele : cacheSubnetGroups) {
            this.cacheSubnetGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of cache subnet groups. Each element in the list contains detailed information about one group.
     * </p>
     * 
     * @param cacheSubnetGroups
     *        A list of cache subnet groups. Each element in the list contains detailed information about one group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCacheSubnetGroupsResult withCacheSubnetGroups(java.util.Collection<CacheSubnetGroup> cacheSubnetGroups) {
        setCacheSubnetGroups(cacheSubnetGroups);
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
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getCacheSubnetGroups() != null)
            sb.append("CacheSubnetGroups: " + getCacheSubnetGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCacheSubnetGroupsResult == false)
            return false;
        DescribeCacheSubnetGroupsResult other = (DescribeCacheSubnetGroupsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getCacheSubnetGroups() == null ^ this.getCacheSubnetGroups() == null)
            return false;
        if (other.getCacheSubnetGroups() != null && other.getCacheSubnetGroups().equals(this.getCacheSubnetGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getCacheSubnetGroups() == null) ? 0 : getCacheSubnetGroups().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCacheSubnetGroupsResult clone() {
        try {
            return (DescribeCacheSubnetGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
