/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyGlobalReplicationGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyGlobalReplicationGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Global datastore
     * </p>
     */
    private String globalReplicationGroupId;
    /**
     * <p>
     * This parameter causes the modifications in this request and any pending modifications to be applied,
     * asynchronously and as soon as possible. Modifications to Global Replication Groups cannot be requested to be
     * applied in PreferredMaintenceWindow.
     * </p>
     */
    private Boolean applyImmediately;
    /**
     * <p>
     * A valid cache node type that you want to scale this Global datastore to.
     * </p>
     */
    private String cacheNodeType;
    /**
     * <p>
     * The upgraded version of the cache engine to be run on the clusters in the Global datastore.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The name of the cache parameter group to use with the Global datastore. It must be compatible with the major
     * engine version used by the Global datastore.
     * </p>
     */
    private String cacheParameterGroupName;
    /**
     * <p>
     * A description of the Global datastore
     * </p>
     */
    private String globalReplicationGroupDescription;
    /**
     * <p>
     * Determines whether a read replica is automatically promoted to read/write primary if the existing primary
     * encounters a failure.
     * </p>
     */
    private Boolean automaticFailoverEnabled;

    /**
     * <p>
     * The name of the Global datastore
     * </p>
     * 
     * @param globalReplicationGroupId
     *        The name of the Global datastore
     */

    public void setGlobalReplicationGroupId(String globalReplicationGroupId) {
        this.globalReplicationGroupId = globalReplicationGroupId;
    }

    /**
     * <p>
     * The name of the Global datastore
     * </p>
     * 
     * @return The name of the Global datastore
     */

    public String getGlobalReplicationGroupId() {
        return this.globalReplicationGroupId;
    }

    /**
     * <p>
     * The name of the Global datastore
     * </p>
     * 
     * @param globalReplicationGroupId
     *        The name of the Global datastore
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyGlobalReplicationGroupRequest withGlobalReplicationGroupId(String globalReplicationGroupId) {
        setGlobalReplicationGroupId(globalReplicationGroupId);
        return this;
    }

    /**
     * <p>
     * This parameter causes the modifications in this request and any pending modifications to be applied,
     * asynchronously and as soon as possible. Modifications to Global Replication Groups cannot be requested to be
     * applied in PreferredMaintenceWindow.
     * </p>
     * 
     * @param applyImmediately
     *        This parameter causes the modifications in this request and any pending modifications to be applied,
     *        asynchronously and as soon as possible. Modifications to Global Replication Groups cannot be requested to
     *        be applied in PreferredMaintenceWindow.
     */

    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * This parameter causes the modifications in this request and any pending modifications to be applied,
     * asynchronously and as soon as possible. Modifications to Global Replication Groups cannot be requested to be
     * applied in PreferredMaintenceWindow.
     * </p>
     * 
     * @return This parameter causes the modifications in this request and any pending modifications to be applied,
     *         asynchronously and as soon as possible. Modifications to Global Replication Groups cannot be requested to
     *         be applied in PreferredMaintenceWindow.
     */

    public Boolean getApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * This parameter causes the modifications in this request and any pending modifications to be applied,
     * asynchronously and as soon as possible. Modifications to Global Replication Groups cannot be requested to be
     * applied in PreferredMaintenceWindow.
     * </p>
     * 
     * @param applyImmediately
     *        This parameter causes the modifications in this request and any pending modifications to be applied,
     *        asynchronously and as soon as possible. Modifications to Global Replication Groups cannot be requested to
     *        be applied in PreferredMaintenceWindow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyGlobalReplicationGroupRequest withApplyImmediately(Boolean applyImmediately) {
        setApplyImmediately(applyImmediately);
        return this;
    }

    /**
     * <p>
     * This parameter causes the modifications in this request and any pending modifications to be applied,
     * asynchronously and as soon as possible. Modifications to Global Replication Groups cannot be requested to be
     * applied in PreferredMaintenceWindow.
     * </p>
     * 
     * @return This parameter causes the modifications in this request and any pending modifications to be applied,
     *         asynchronously and as soon as possible. Modifications to Global Replication Groups cannot be requested to
     *         be applied in PreferredMaintenceWindow.
     */

    public Boolean isApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * A valid cache node type that you want to scale this Global datastore to.
     * </p>
     * 
     * @param cacheNodeType
     *        A valid cache node type that you want to scale this Global datastore to.
     */

    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }

    /**
     * <p>
     * A valid cache node type that you want to scale this Global datastore to.
     * </p>
     * 
     * @return A valid cache node type that you want to scale this Global datastore to.
     */

    public String getCacheNodeType() {
        return this.cacheNodeType;
    }

    /**
     * <p>
     * A valid cache node type that you want to scale this Global datastore to.
     * </p>
     * 
     * @param cacheNodeType
     *        A valid cache node type that you want to scale this Global datastore to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyGlobalReplicationGroupRequest withCacheNodeType(String cacheNodeType) {
        setCacheNodeType(cacheNodeType);
        return this;
    }

    /**
     * <p>
     * The upgraded version of the cache engine to be run on the clusters in the Global datastore.
     * </p>
     * 
     * @param engineVersion
     *        The upgraded version of the cache engine to be run on the clusters in the Global datastore.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The upgraded version of the cache engine to be run on the clusters in the Global datastore.
     * </p>
     * 
     * @return The upgraded version of the cache engine to be run on the clusters in the Global datastore.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The upgraded version of the cache engine to be run on the clusters in the Global datastore.
     * </p>
     * 
     * @param engineVersion
     *        The upgraded version of the cache engine to be run on the clusters in the Global datastore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyGlobalReplicationGroupRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The name of the cache parameter group to use with the Global datastore. It must be compatible with the major
     * engine version used by the Global datastore.
     * </p>
     * 
     * @param cacheParameterGroupName
     *        The name of the cache parameter group to use with the Global datastore. It must be compatible with the
     *        major engine version used by the Global datastore.
     */

    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the cache parameter group to use with the Global datastore. It must be compatible with the major
     * engine version used by the Global datastore.
     * </p>
     * 
     * @return The name of the cache parameter group to use with the Global datastore. It must be compatible with the
     *         major engine version used by the Global datastore.
     */

    public String getCacheParameterGroupName() {
        return this.cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the cache parameter group to use with the Global datastore. It must be compatible with the major
     * engine version used by the Global datastore.
     * </p>
     * 
     * @param cacheParameterGroupName
     *        The name of the cache parameter group to use with the Global datastore. It must be compatible with the
     *        major engine version used by the Global datastore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyGlobalReplicationGroupRequest withCacheParameterGroupName(String cacheParameterGroupName) {
        setCacheParameterGroupName(cacheParameterGroupName);
        return this;
    }

    /**
     * <p>
     * A description of the Global datastore
     * </p>
     * 
     * @param globalReplicationGroupDescription
     *        A description of the Global datastore
     */

    public void setGlobalReplicationGroupDescription(String globalReplicationGroupDescription) {
        this.globalReplicationGroupDescription = globalReplicationGroupDescription;
    }

    /**
     * <p>
     * A description of the Global datastore
     * </p>
     * 
     * @return A description of the Global datastore
     */

    public String getGlobalReplicationGroupDescription() {
        return this.globalReplicationGroupDescription;
    }

    /**
     * <p>
     * A description of the Global datastore
     * </p>
     * 
     * @param globalReplicationGroupDescription
     *        A description of the Global datastore
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyGlobalReplicationGroupRequest withGlobalReplicationGroupDescription(String globalReplicationGroupDescription) {
        setGlobalReplicationGroupDescription(globalReplicationGroupDescription);
        return this;
    }

    /**
     * <p>
     * Determines whether a read replica is automatically promoted to read/write primary if the existing primary
     * encounters a failure.
     * </p>
     * 
     * @param automaticFailoverEnabled
     *        Determines whether a read replica is automatically promoted to read/write primary if the existing primary
     *        encounters a failure.
     */

    public void setAutomaticFailoverEnabled(Boolean automaticFailoverEnabled) {
        this.automaticFailoverEnabled = automaticFailoverEnabled;
    }

    /**
     * <p>
     * Determines whether a read replica is automatically promoted to read/write primary if the existing primary
     * encounters a failure.
     * </p>
     * 
     * @return Determines whether a read replica is automatically promoted to read/write primary if the existing primary
     *         encounters a failure.
     */

    public Boolean getAutomaticFailoverEnabled() {
        return this.automaticFailoverEnabled;
    }

    /**
     * <p>
     * Determines whether a read replica is automatically promoted to read/write primary if the existing primary
     * encounters a failure.
     * </p>
     * 
     * @param automaticFailoverEnabled
     *        Determines whether a read replica is automatically promoted to read/write primary if the existing primary
     *        encounters a failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyGlobalReplicationGroupRequest withAutomaticFailoverEnabled(Boolean automaticFailoverEnabled) {
        setAutomaticFailoverEnabled(automaticFailoverEnabled);
        return this;
    }

    /**
     * <p>
     * Determines whether a read replica is automatically promoted to read/write primary if the existing primary
     * encounters a failure.
     * </p>
     * 
     * @return Determines whether a read replica is automatically promoted to read/write primary if the existing primary
     *         encounters a failure.
     */

    public Boolean isAutomaticFailoverEnabled() {
        return this.automaticFailoverEnabled;
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
        if (getGlobalReplicationGroupId() != null)
            sb.append("GlobalReplicationGroupId: ").append(getGlobalReplicationGroupId()).append(",");
        if (getApplyImmediately() != null)
            sb.append("ApplyImmediately: ").append(getApplyImmediately()).append(",");
        if (getCacheNodeType() != null)
            sb.append("CacheNodeType: ").append(getCacheNodeType()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getCacheParameterGroupName() != null)
            sb.append("CacheParameterGroupName: ").append(getCacheParameterGroupName()).append(",");
        if (getGlobalReplicationGroupDescription() != null)
            sb.append("GlobalReplicationGroupDescription: ").append(getGlobalReplicationGroupDescription()).append(",");
        if (getAutomaticFailoverEnabled() != null)
            sb.append("AutomaticFailoverEnabled: ").append(getAutomaticFailoverEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyGlobalReplicationGroupRequest == false)
            return false;
        ModifyGlobalReplicationGroupRequest other = (ModifyGlobalReplicationGroupRequest) obj;
        if (other.getGlobalReplicationGroupId() == null ^ this.getGlobalReplicationGroupId() == null)
            return false;
        if (other.getGlobalReplicationGroupId() != null && other.getGlobalReplicationGroupId().equals(this.getGlobalReplicationGroupId()) == false)
            return false;
        if (other.getApplyImmediately() == null ^ this.getApplyImmediately() == null)
            return false;
        if (other.getApplyImmediately() != null && other.getApplyImmediately().equals(this.getApplyImmediately()) == false)
            return false;
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null)
            return false;
        if (other.getCacheNodeType() != null && other.getCacheNodeType().equals(this.getCacheNodeType()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getCacheParameterGroupName() == null ^ this.getCacheParameterGroupName() == null)
            return false;
        if (other.getCacheParameterGroupName() != null && other.getCacheParameterGroupName().equals(this.getCacheParameterGroupName()) == false)
            return false;
        if (other.getGlobalReplicationGroupDescription() == null ^ this.getGlobalReplicationGroupDescription() == null)
            return false;
        if (other.getGlobalReplicationGroupDescription() != null
                && other.getGlobalReplicationGroupDescription().equals(this.getGlobalReplicationGroupDescription()) == false)
            return false;
        if (other.getAutomaticFailoverEnabled() == null ^ this.getAutomaticFailoverEnabled() == null)
            return false;
        if (other.getAutomaticFailoverEnabled() != null && other.getAutomaticFailoverEnabled().equals(this.getAutomaticFailoverEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalReplicationGroupId() == null) ? 0 : getGlobalReplicationGroupId().hashCode());
        hashCode = prime * hashCode + ((getApplyImmediately() == null) ? 0 : getApplyImmediately().hashCode());
        hashCode = prime * hashCode + ((getCacheNodeType() == null) ? 0 : getCacheNodeType().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getCacheParameterGroupName() == null) ? 0 : getCacheParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getGlobalReplicationGroupDescription() == null) ? 0 : getGlobalReplicationGroupDescription().hashCode());
        hashCode = prime * hashCode + ((getAutomaticFailoverEnabled() == null) ? 0 : getAutomaticFailoverEnabled().hashCode());
        return hashCode;
    }

    @Override
    public ModifyGlobalReplicationGroupRequest clone() {
        return (ModifyGlobalReplicationGroupRequest) super.clone();
    }

}
