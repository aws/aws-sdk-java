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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

/**
 * <p>
 * Summarizes the number of layers, instances, and apps in a stack.
 * </p>
 */
public class StackSummary implements Serializable {

    /**
     * The stack ID.
     */
    private String stackId;

    /**
     * The stack name.
     */
    private String name;

    /**
     * The number of layers.
     */
    private Integer layersCount;

    /**
     * The number of apps.
     */
    private Integer appsCount;

    /**
     * An <code>InstancesCount</code> object with the number of instances in
     * each status.
     */
    private InstancesCount instancesCount;

    /**
     * The stack ID.
     *
     * @return The stack ID.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * The stack ID.
     *
     * @param stackId The stack ID.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * The stack ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId The stack ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StackSummary withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * The stack name.
     *
     * @return The stack name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The stack name.
     *
     * @param name The stack name.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The stack name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The stack name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StackSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The number of layers.
     *
     * @return The number of layers.
     */
    public Integer getLayersCount() {
        return layersCount;
    }
    
    /**
     * The number of layers.
     *
     * @param layersCount The number of layers.
     */
    public void setLayersCount(Integer layersCount) {
        this.layersCount = layersCount;
    }
    
    /**
     * The number of layers.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param layersCount The number of layers.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StackSummary withLayersCount(Integer layersCount) {
        this.layersCount = layersCount;
        return this;
    }

    /**
     * The number of apps.
     *
     * @return The number of apps.
     */
    public Integer getAppsCount() {
        return appsCount;
    }
    
    /**
     * The number of apps.
     *
     * @param appsCount The number of apps.
     */
    public void setAppsCount(Integer appsCount) {
        this.appsCount = appsCount;
    }
    
    /**
     * The number of apps.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param appsCount The number of apps.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StackSummary withAppsCount(Integer appsCount) {
        this.appsCount = appsCount;
        return this;
    }

    /**
     * An <code>InstancesCount</code> object with the number of instances in
     * each status.
     *
     * @return An <code>InstancesCount</code> object with the number of instances in
     *         each status.
     */
    public InstancesCount getInstancesCount() {
        return instancesCount;
    }
    
    /**
     * An <code>InstancesCount</code> object with the number of instances in
     * each status.
     *
     * @param instancesCount An <code>InstancesCount</code> object with the number of instances in
     *         each status.
     */
    public void setInstancesCount(InstancesCount instancesCount) {
        this.instancesCount = instancesCount;
    }
    
    /**
     * An <code>InstancesCount</code> object with the number of instances in
     * each status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instancesCount An <code>InstancesCount</code> object with the number of instances in
     *         each status.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StackSummary withInstancesCount(InstancesCount instancesCount) {
        this.instancesCount = instancesCount;
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
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getLayersCount() != null) sb.append("LayersCount: " + getLayersCount() + ",");
        if (getAppsCount() != null) sb.append("AppsCount: " + getAppsCount() + ",");
        if (getInstancesCount() != null) sb.append("InstancesCount: " + getInstancesCount() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getLayersCount() == null) ? 0 : getLayersCount().hashCode()); 
        hashCode = prime * hashCode + ((getAppsCount() == null) ? 0 : getAppsCount().hashCode()); 
        hashCode = prime * hashCode + ((getInstancesCount() == null) ? 0 : getInstancesCount().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StackSummary == false) return false;
        StackSummary other = (StackSummary)obj;
        
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getLayersCount() == null ^ this.getLayersCount() == null) return false;
        if (other.getLayersCount() != null && other.getLayersCount().equals(this.getLayersCount()) == false) return false; 
        if (other.getAppsCount() == null ^ this.getAppsCount() == null) return false;
        if (other.getAppsCount() != null && other.getAppsCount().equals(this.getAppsCount()) == false) return false; 
        if (other.getInstancesCount() == null ^ this.getInstancesCount() == null) return false;
        if (other.getInstancesCount() != null && other.getInstancesCount().equals(this.getInstancesCount()) == false) return false; 
        return true;
    }
    
}
    