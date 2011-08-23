/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The status of the Cache Parameter Group.
 * </p>
 */
public class CacheParameterGroupStatus {

    /**
     * The name of the Cache Parameter Group.
     */
    private String cacheParameterGroupName;

    /**
     * The status of parameter updates.
     */
    private String parameterApplyStatus;

    /**
     * A list of the Cache Node Ids which need to be rebooted for parameter
     * changes to be applied.
     */
    private java.util.List<String> cacheNodeIdsToReboot;

    /**
     * Default constructor for a new CacheParameterGroupStatus object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CacheParameterGroupStatus() {}
    
    /**
     * The name of the Cache Parameter Group.
     *
     * @return The name of the Cache Parameter Group.
     */
    public String getCacheParameterGroupName() {
        return cacheParameterGroupName;
    }
    
    /**
     * The name of the Cache Parameter Group.
     *
     * @param cacheParameterGroupName The name of the Cache Parameter Group.
     */
    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }
    
    /**
     * The name of the Cache Parameter Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheParameterGroupName The name of the Cache Parameter Group.
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
     * A list of the Cache Node Ids which need to be rebooted for parameter
     * changes to be applied.
     *
     * @return A list of the Cache Node Ids which need to be rebooted for parameter
     *         changes to be applied.
     */
    public java.util.List<String> getCacheNodeIdsToReboot() {
        
        if (cacheNodeIdsToReboot == null) {
            cacheNodeIdsToReboot = new java.util.ArrayList<String>();
        }
        return cacheNodeIdsToReboot;
    }
    
    /**
     * A list of the Cache Node Ids which need to be rebooted for parameter
     * changes to be applied.
     *
     * @param cacheNodeIdsToReboot A list of the Cache Node Ids which need to be rebooted for parameter
     *         changes to be applied.
     */
    public void setCacheNodeIdsToReboot(java.util.Collection<String> cacheNodeIdsToReboot) {
        java.util.List<String> cacheNodeIdsToRebootCopy = new java.util.ArrayList<String>();
        if (cacheNodeIdsToReboot != null) {
            cacheNodeIdsToRebootCopy.addAll(cacheNodeIdsToReboot);
        }
        this.cacheNodeIdsToReboot = cacheNodeIdsToRebootCopy;
    }
    
    /**
     * A list of the Cache Node Ids which need to be rebooted for parameter
     * changes to be applied.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeIdsToReboot A list of the Cache Node Ids which need to be rebooted for parameter
     *         changes to be applied.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheParameterGroupStatus withCacheNodeIdsToReboot(String... cacheNodeIdsToReboot) {
        if (getCacheNodeIdsToReboot() == null) setCacheNodeIdsToReboot(new java.util.ArrayList<String>());
        for (String value : cacheNodeIdsToReboot) {
            getCacheNodeIdsToReboot().add(value);
        }
        return this;
    }
    
    /**
     * A list of the Cache Node Ids which need to be rebooted for parameter
     * changes to be applied.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeIdsToReboot A list of the Cache Node Ids which need to be rebooted for parameter
     *         changes to be applied.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheParameterGroupStatus withCacheNodeIdsToReboot(java.util.Collection<String> cacheNodeIdsToReboot) {
        java.util.List<String> cacheNodeIdsToRebootCopy = new java.util.ArrayList<String>();
        if (cacheNodeIdsToReboot != null) {
            cacheNodeIdsToRebootCopy.addAll(cacheNodeIdsToReboot);
        }
        this.cacheNodeIdsToReboot = cacheNodeIdsToRebootCopy;

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
        sb.append("CacheParameterGroupName: " + cacheParameterGroupName + ", ");
        sb.append("ParameterApplyStatus: " + parameterApplyStatus + ", ");
        sb.append("CacheNodeIdsToReboot: " + cacheNodeIdsToReboot + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    