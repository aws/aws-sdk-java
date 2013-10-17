/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;


/**
 * <p>
 * The status of the cache parameter group.
 * </p>
 */
public class CacheParameterGroupStatus implements Serializable {

    /**
     * The name of the cache parameter group.
     */
    private String cacheParameterGroupName;

    /**
     * The status of parameter updates.
     */
    private String parameterApplyStatus;

    /**
     * A list of the cache node IDs which need to be rebooted for parameter
     * changes to be applied. A node ID is a numeric identifier (0001, 0002,
     * etc.).
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> cacheNodeIdsToReboot;

    /**
     * Default constructor for a new CacheParameterGroupStatus object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CacheParameterGroupStatus() {}
    
    /**
     * The name of the cache parameter group.
     *
     * @return The name of the cache parameter group.
     */
    public String getCacheParameterGroupName() {
        return cacheParameterGroupName;
    }
    
    /**
     * The name of the cache parameter group.
     *
     * @param cacheParameterGroupName The name of the cache parameter group.
     */
    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }
    
    /**
     * The name of the cache parameter group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheParameterGroupName The name of the cache parameter group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheParameterGroupStatus withCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        return this;
    }

    /**
     * The status of parameter updates.
     *
     * @return The status of parameter updates.
     */
    public String getParameterApplyStatus() {
        return parameterApplyStatus;
    }
    
    /**
     * The status of parameter updates.
     *
     * @param parameterApplyStatus The status of parameter updates.
     */
    public void setParameterApplyStatus(String parameterApplyStatus) {
        this.parameterApplyStatus = parameterApplyStatus;
    }
    
    /**
     * The status of parameter updates.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterApplyStatus The status of parameter updates.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheParameterGroupStatus withParameterApplyStatus(String parameterApplyStatus) {
        this.parameterApplyStatus = parameterApplyStatus;
        return this;
    }

    /**
     * A list of the cache node IDs which need to be rebooted for parameter
     * changes to be applied. A node ID is a numeric identifier (0001, 0002,
     * etc.).
     *
     * @return A list of the cache node IDs which need to be rebooted for parameter
     *         changes to be applied. A node ID is a numeric identifier (0001, 0002,
     *         etc.).
     */
    public java.util.List<String> getCacheNodeIdsToReboot() {
        if (cacheNodeIdsToReboot == null) {
              cacheNodeIdsToReboot = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              cacheNodeIdsToReboot.setAutoConstruct(true);
        }
        return cacheNodeIdsToReboot;
    }
    
    /**
     * A list of the cache node IDs which need to be rebooted for parameter
     * changes to be applied. A node ID is a numeric identifier (0001, 0002,
     * etc.).
     *
     * @param cacheNodeIdsToReboot A list of the cache node IDs which need to be rebooted for parameter
     *         changes to be applied. A node ID is a numeric identifier (0001, 0002,
     *         etc.).
     */
    public void setCacheNodeIdsToReboot(java.util.Collection<String> cacheNodeIdsToReboot) {
        if (cacheNodeIdsToReboot == null) {
            this.cacheNodeIdsToReboot = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> cacheNodeIdsToRebootCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(cacheNodeIdsToReboot.size());
        cacheNodeIdsToRebootCopy.addAll(cacheNodeIdsToReboot);
        this.cacheNodeIdsToReboot = cacheNodeIdsToRebootCopy;
    }
    
    /**
     * A list of the cache node IDs which need to be rebooted for parameter
     * changes to be applied. A node ID is a numeric identifier (0001, 0002,
     * etc.).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeIdsToReboot A list of the cache node IDs which need to be rebooted for parameter
     *         changes to be applied. A node ID is a numeric identifier (0001, 0002,
     *         etc.).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheParameterGroupStatus withCacheNodeIdsToReboot(String... cacheNodeIdsToReboot) {
        if (getCacheNodeIdsToReboot() == null) setCacheNodeIdsToReboot(new java.util.ArrayList<String>(cacheNodeIdsToReboot.length));
        for (String value : cacheNodeIdsToReboot) {
            getCacheNodeIdsToReboot().add(value);
        }
        return this;
    }
    
    /**
     * A list of the cache node IDs which need to be rebooted for parameter
     * changes to be applied. A node ID is a numeric identifier (0001, 0002,
     * etc.).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeIdsToReboot A list of the cache node IDs which need to be rebooted for parameter
     *         changes to be applied. A node ID is a numeric identifier (0001, 0002,
     *         etc.).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheParameterGroupStatus withCacheNodeIdsToReboot(java.util.Collection<String> cacheNodeIdsToReboot) {
        if (cacheNodeIdsToReboot == null) {
            this.cacheNodeIdsToReboot = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> cacheNodeIdsToRebootCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(cacheNodeIdsToReboot.size());
            cacheNodeIdsToRebootCopy.addAll(cacheNodeIdsToReboot);
            this.cacheNodeIdsToReboot = cacheNodeIdsToRebootCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCacheParameterGroupName() != null) sb.append("CacheParameterGroupName: " + getCacheParameterGroupName() + ",");
        if (getParameterApplyStatus() != null) sb.append("ParameterApplyStatus: " + getParameterApplyStatus() + ",");
        if (getCacheNodeIdsToReboot() != null) sb.append("CacheNodeIdsToReboot: " + getCacheNodeIdsToReboot() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CacheParameterGroupStatus == false) return false;
        CacheParameterGroupStatus other = (CacheParameterGroupStatus)obj;
        
        if (other.getCacheParameterGroupName() == null ^ this.getCacheParameterGroupName() == null) return false;
        if (other.getCacheParameterGroupName() != null && other.getCacheParameterGroupName().equals(this.getCacheParameterGroupName()) == false) return false; 
        if (other.getParameterApplyStatus() == null ^ this.getParameterApplyStatus() == null) return false;
        if (other.getParameterApplyStatus() != null && other.getParameterApplyStatus().equals(this.getParameterApplyStatus()) == false) return false; 
        if (other.getCacheNodeIdsToReboot() == null ^ this.getCacheNodeIdsToReboot() == null) return false;
        if (other.getCacheNodeIdsToReboot() != null && other.getCacheNodeIdsToReboot().equals(this.getCacheNodeIdsToReboot()) == false) return false; 
        return true;
    }
    
}
    