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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>DeleteCacheCluster</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteCacheCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCacheClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The cluster identifier for the cluster to be deleted. This parameter is not case sensitive.
     * </p>
     */
    private String cacheClusterId;
    /**
     * <p>
     * The user-supplied name of a final cluster snapshot. This is the unique name that identifies the snapshot.
     * ElastiCache creates the snapshot, and then deletes the cluster immediately afterward.
     * </p>
     */
    private String finalSnapshotIdentifier;

    /**
     * Default constructor for DeleteCacheClusterRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public DeleteCacheClusterRequest() {
    }

    /**
     * Constructs a new DeleteCacheClusterRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param cacheClusterId
     *        The cluster identifier for the cluster to be deleted. This parameter is not case sensitive.
     */
    public DeleteCacheClusterRequest(String cacheClusterId) {
        setCacheClusterId(cacheClusterId);
    }

    /**
     * <p>
     * The cluster identifier for the cluster to be deleted. This parameter is not case sensitive.
     * </p>
     * 
     * @param cacheClusterId
     *        The cluster identifier for the cluster to be deleted. This parameter is not case sensitive.
     */

    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }

    /**
     * <p>
     * The cluster identifier for the cluster to be deleted. This parameter is not case sensitive.
     * </p>
     * 
     * @return The cluster identifier for the cluster to be deleted. This parameter is not case sensitive.
     */

    public String getCacheClusterId() {
        return this.cacheClusterId;
    }

    /**
     * <p>
     * The cluster identifier for the cluster to be deleted. This parameter is not case sensitive.
     * </p>
     * 
     * @param cacheClusterId
     *        The cluster identifier for the cluster to be deleted. This parameter is not case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCacheClusterRequest withCacheClusterId(String cacheClusterId) {
        setCacheClusterId(cacheClusterId);
        return this;
    }

    /**
     * <p>
     * The user-supplied name of a final cluster snapshot. This is the unique name that identifies the snapshot.
     * ElastiCache creates the snapshot, and then deletes the cluster immediately afterward.
     * </p>
     * 
     * @param finalSnapshotIdentifier
     *        The user-supplied name of a final cluster snapshot. This is the unique name that identifies the snapshot.
     *        ElastiCache creates the snapshot, and then deletes the cluster immediately afterward.
     */

    public void setFinalSnapshotIdentifier(String finalSnapshotIdentifier) {
        this.finalSnapshotIdentifier = finalSnapshotIdentifier;
    }

    /**
     * <p>
     * The user-supplied name of a final cluster snapshot. This is the unique name that identifies the snapshot.
     * ElastiCache creates the snapshot, and then deletes the cluster immediately afterward.
     * </p>
     * 
     * @return The user-supplied name of a final cluster snapshot. This is the unique name that identifies the snapshot.
     *         ElastiCache creates the snapshot, and then deletes the cluster immediately afterward.
     */

    public String getFinalSnapshotIdentifier() {
        return this.finalSnapshotIdentifier;
    }

    /**
     * <p>
     * The user-supplied name of a final cluster snapshot. This is the unique name that identifies the snapshot.
     * ElastiCache creates the snapshot, and then deletes the cluster immediately afterward.
     * </p>
     * 
     * @param finalSnapshotIdentifier
     *        The user-supplied name of a final cluster snapshot. This is the unique name that identifies the snapshot.
     *        ElastiCache creates the snapshot, and then deletes the cluster immediately afterward.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCacheClusterRequest withFinalSnapshotIdentifier(String finalSnapshotIdentifier) {
        setFinalSnapshotIdentifier(finalSnapshotIdentifier);
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
        if (getCacheClusterId() != null)
            sb.append("CacheClusterId: ").append(getCacheClusterId()).append(",");
        if (getFinalSnapshotIdentifier() != null)
            sb.append("FinalSnapshotIdentifier: ").append(getFinalSnapshotIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCacheClusterRequest == false)
            return false;
        DeleteCacheClusterRequest other = (DeleteCacheClusterRequest) obj;
        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null)
            return false;
        if (other.getCacheClusterId() != null && other.getCacheClusterId().equals(this.getCacheClusterId()) == false)
            return false;
        if (other.getFinalSnapshotIdentifier() == null ^ this.getFinalSnapshotIdentifier() == null)
            return false;
        if (other.getFinalSnapshotIdentifier() != null && other.getFinalSnapshotIdentifier().equals(this.getFinalSnapshotIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCacheClusterId() == null) ? 0 : getCacheClusterId().hashCode());
        hashCode = prime * hashCode + ((getFinalSnapshotIdentifier() == null) ? 0 : getFinalSnapshotIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCacheClusterRequest clone() {
        return (DeleteCacheClusterRequest) super.clone();
    }

}
