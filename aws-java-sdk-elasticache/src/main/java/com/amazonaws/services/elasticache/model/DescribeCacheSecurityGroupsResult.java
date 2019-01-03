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
 * Represents the output of a <code>DescribeCacheSecurityGroups</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeCacheSecurityGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCacheSecurityGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A list of cache security groups. Each element in the list contains detailed information about one group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CacheSecurityGroup> cacheSecurityGroups;

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

    public DescribeCacheSecurityGroupsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A list of cache security groups. Each element in the list contains detailed information about one group.
     * </p>
     * 
     * @return A list of cache security groups. Each element in the list contains detailed information about one group.
     */

    public java.util.List<CacheSecurityGroup> getCacheSecurityGroups() {
        if (cacheSecurityGroups == null) {
            cacheSecurityGroups = new com.amazonaws.internal.SdkInternalList<CacheSecurityGroup>();
        }
        return cacheSecurityGroups;
    }

    /**
     * <p>
     * A list of cache security groups. Each element in the list contains detailed information about one group.
     * </p>
     * 
     * @param cacheSecurityGroups
     *        A list of cache security groups. Each element in the list contains detailed information about one group.
     */

    public void setCacheSecurityGroups(java.util.Collection<CacheSecurityGroup> cacheSecurityGroups) {
        if (cacheSecurityGroups == null) {
            this.cacheSecurityGroups = null;
            return;
        }

        this.cacheSecurityGroups = new com.amazonaws.internal.SdkInternalList<CacheSecurityGroup>(cacheSecurityGroups);
    }

    /**
     * <p>
     * A list of cache security groups. Each element in the list contains detailed information about one group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCacheSecurityGroups(java.util.Collection)} or {@link #withCacheSecurityGroups(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param cacheSecurityGroups
     *        A list of cache security groups. Each element in the list contains detailed information about one group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCacheSecurityGroupsResult withCacheSecurityGroups(CacheSecurityGroup... cacheSecurityGroups) {
        if (this.cacheSecurityGroups == null) {
            setCacheSecurityGroups(new com.amazonaws.internal.SdkInternalList<CacheSecurityGroup>(cacheSecurityGroups.length));
        }
        for (CacheSecurityGroup ele : cacheSecurityGroups) {
            this.cacheSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of cache security groups. Each element in the list contains detailed information about one group.
     * </p>
     * 
     * @param cacheSecurityGroups
     *        A list of cache security groups. Each element in the list contains detailed information about one group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCacheSecurityGroupsResult withCacheSecurityGroups(java.util.Collection<CacheSecurityGroup> cacheSecurityGroups) {
        setCacheSecurityGroups(cacheSecurityGroups);
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
        if (getCacheSecurityGroups() != null)
            sb.append("CacheSecurityGroups: ").append(getCacheSecurityGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCacheSecurityGroupsResult == false)
            return false;
        DescribeCacheSecurityGroupsResult other = (DescribeCacheSecurityGroupsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getCacheSecurityGroups() == null ^ this.getCacheSecurityGroups() == null)
            return false;
        if (other.getCacheSecurityGroups() != null && other.getCacheSecurityGroups().equals(this.getCacheSecurityGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getCacheSecurityGroups() == null) ? 0 : getCacheSecurityGroups().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCacheSecurityGroupsResult clone() {
        try {
            return (DescribeCacheSecurityGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
