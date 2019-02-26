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
 * Status of the cache parameter group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CacheParameterGroupStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CacheParameterGroupStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cache parameter group.
     * </p>
     */
    private String cacheParameterGroupName;
    /**
     * <p>
     * The status of parameter updates.
     * </p>
     */
    private String parameterApplyStatus;
    /**
     * <p>
     * A list of the cache node IDs which need to be rebooted for parameter changes to be applied. A node ID is a
     * numeric identifier (0001, 0002, etc.).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> cacheNodeIdsToReboot;

    /**
     * <p>
     * The name of the cache parameter group.
     * </p>
     * 
     * @param cacheParameterGroupName
     *        The name of the cache parameter group.
     */

    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the cache parameter group.
     * </p>
     * 
     * @return The name of the cache parameter group.
     */

    public String getCacheParameterGroupName() {
        return this.cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the cache parameter group.
     * </p>
     * 
     * @param cacheParameterGroupName
     *        The name of the cache parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheParameterGroupStatus withCacheParameterGroupName(String cacheParameterGroupName) {
        setCacheParameterGroupName(cacheParameterGroupName);
        return this;
    }

    /**
     * <p>
     * The status of parameter updates.
     * </p>
     * 
     * @param parameterApplyStatus
     *        The status of parameter updates.
     */

    public void setParameterApplyStatus(String parameterApplyStatus) {
        this.parameterApplyStatus = parameterApplyStatus;
    }

    /**
     * <p>
     * The status of parameter updates.
     * </p>
     * 
     * @return The status of parameter updates.
     */

    public String getParameterApplyStatus() {
        return this.parameterApplyStatus;
    }

    /**
     * <p>
     * The status of parameter updates.
     * </p>
     * 
     * @param parameterApplyStatus
     *        The status of parameter updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheParameterGroupStatus withParameterApplyStatus(String parameterApplyStatus) {
        setParameterApplyStatus(parameterApplyStatus);
        return this;
    }

    /**
     * <p>
     * A list of the cache node IDs which need to be rebooted for parameter changes to be applied. A node ID is a
     * numeric identifier (0001, 0002, etc.).
     * </p>
     * 
     * @return A list of the cache node IDs which need to be rebooted for parameter changes to be applied. A node ID is
     *         a numeric identifier (0001, 0002, etc.).
     */

    public java.util.List<String> getCacheNodeIdsToReboot() {
        if (cacheNodeIdsToReboot == null) {
            cacheNodeIdsToReboot = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return cacheNodeIdsToReboot;
    }

    /**
     * <p>
     * A list of the cache node IDs which need to be rebooted for parameter changes to be applied. A node ID is a
     * numeric identifier (0001, 0002, etc.).
     * </p>
     * 
     * @param cacheNodeIdsToReboot
     *        A list of the cache node IDs which need to be rebooted for parameter changes to be applied. A node ID is a
     *        numeric identifier (0001, 0002, etc.).
     */

    public void setCacheNodeIdsToReboot(java.util.Collection<String> cacheNodeIdsToReboot) {
        if (cacheNodeIdsToReboot == null) {
            this.cacheNodeIdsToReboot = null;
            return;
        }

        this.cacheNodeIdsToReboot = new com.amazonaws.internal.SdkInternalList<String>(cacheNodeIdsToReboot);
    }

    /**
     * <p>
     * A list of the cache node IDs which need to be rebooted for parameter changes to be applied. A node ID is a
     * numeric identifier (0001, 0002, etc.).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCacheNodeIdsToReboot(java.util.Collection)} or {@link #withCacheNodeIdsToReboot(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param cacheNodeIdsToReboot
     *        A list of the cache node IDs which need to be rebooted for parameter changes to be applied. A node ID is a
     *        numeric identifier (0001, 0002, etc.).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheParameterGroupStatus withCacheNodeIdsToReboot(String... cacheNodeIdsToReboot) {
        if (this.cacheNodeIdsToReboot == null) {
            setCacheNodeIdsToReboot(new com.amazonaws.internal.SdkInternalList<String>(cacheNodeIdsToReboot.length));
        }
        for (String ele : cacheNodeIdsToReboot) {
            this.cacheNodeIdsToReboot.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the cache node IDs which need to be rebooted for parameter changes to be applied. A node ID is a
     * numeric identifier (0001, 0002, etc.).
     * </p>
     * 
     * @param cacheNodeIdsToReboot
     *        A list of the cache node IDs which need to be rebooted for parameter changes to be applied. A node ID is a
     *        numeric identifier (0001, 0002, etc.).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheParameterGroupStatus withCacheNodeIdsToReboot(java.util.Collection<String> cacheNodeIdsToReboot) {
        setCacheNodeIdsToReboot(cacheNodeIdsToReboot);
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
        if (getCacheParameterGroupName() != null)
            sb.append("CacheParameterGroupName: ").append(getCacheParameterGroupName()).append(",");
        if (getParameterApplyStatus() != null)
            sb.append("ParameterApplyStatus: ").append(getParameterApplyStatus()).append(",");
        if (getCacheNodeIdsToReboot() != null)
            sb.append("CacheNodeIdsToReboot: ").append(getCacheNodeIdsToReboot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CacheParameterGroupStatus == false)
            return false;
        CacheParameterGroupStatus other = (CacheParameterGroupStatus) obj;
        if (other.getCacheParameterGroupName() == null ^ this.getCacheParameterGroupName() == null)
            return false;
        if (other.getCacheParameterGroupName() != null && other.getCacheParameterGroupName().equals(this.getCacheParameterGroupName()) == false)
            return false;
        if (other.getParameterApplyStatus() == null ^ this.getParameterApplyStatus() == null)
            return false;
        if (other.getParameterApplyStatus() != null && other.getParameterApplyStatus().equals(this.getParameterApplyStatus()) == false)
            return false;
        if (other.getCacheNodeIdsToReboot() == null ^ this.getCacheNodeIdsToReboot() == null)
            return false;
        if (other.getCacheNodeIdsToReboot() != null && other.getCacheNodeIdsToReboot().equals(this.getCacheNodeIdsToReboot()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCacheParameterGroupName() == null) ? 0 : getCacheParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getParameterApplyStatus() == null) ? 0 : getParameterApplyStatus().hashCode());
        hashCode = prime * hashCode + ((getCacheNodeIdsToReboot() == null) ? 0 : getCacheNodeIdsToReboot().hashCode());
        return hashCode;
    }

    @Override
    public CacheParameterGroupStatus clone() {
        try {
            return (CacheParameterGroupStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
