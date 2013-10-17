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
 * Contains the response to a <code>DescribeLoadBasedAutoScaling</code> request.
 * </p>
 */
public class DescribeLoadBasedAutoScalingResult implements Serializable {

    /**
     * An array of <code>LoadBasedAutoScalingConfiguration</code> objects
     * that describe each layer's configuration.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<LoadBasedAutoScalingConfiguration> loadBasedAutoScalingConfigurations;

    /**
     * An array of <code>LoadBasedAutoScalingConfiguration</code> objects
     * that describe each layer's configuration.
     *
     * @return An array of <code>LoadBasedAutoScalingConfiguration</code> objects
     *         that describe each layer's configuration.
     */
    public java.util.List<LoadBasedAutoScalingConfiguration> getLoadBasedAutoScalingConfigurations() {
        if (loadBasedAutoScalingConfigurations == null) {
              loadBasedAutoScalingConfigurations = new com.amazonaws.internal.ListWithAutoConstructFlag<LoadBasedAutoScalingConfiguration>();
              loadBasedAutoScalingConfigurations.setAutoConstruct(true);
        }
        return loadBasedAutoScalingConfigurations;
    }
    
    /**
     * An array of <code>LoadBasedAutoScalingConfiguration</code> objects
     * that describe each layer's configuration.
     *
     * @param loadBasedAutoScalingConfigurations An array of <code>LoadBasedAutoScalingConfiguration</code> objects
     *         that describe each layer's configuration.
     */
    public void setLoadBasedAutoScalingConfigurations(java.util.Collection<LoadBasedAutoScalingConfiguration> loadBasedAutoScalingConfigurations) {
        if (loadBasedAutoScalingConfigurations == null) {
            this.loadBasedAutoScalingConfigurations = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<LoadBasedAutoScalingConfiguration> loadBasedAutoScalingConfigurationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LoadBasedAutoScalingConfiguration>(loadBasedAutoScalingConfigurations.size());
        loadBasedAutoScalingConfigurationsCopy.addAll(loadBasedAutoScalingConfigurations);
        this.loadBasedAutoScalingConfigurations = loadBasedAutoScalingConfigurationsCopy;
    }
    
    /**
     * An array of <code>LoadBasedAutoScalingConfiguration</code> objects
     * that describe each layer's configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBasedAutoScalingConfigurations An array of <code>LoadBasedAutoScalingConfiguration</code> objects
     *         that describe each layer's configuration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeLoadBasedAutoScalingResult withLoadBasedAutoScalingConfigurations(LoadBasedAutoScalingConfiguration... loadBasedAutoScalingConfigurations) {
        if (getLoadBasedAutoScalingConfigurations() == null) setLoadBasedAutoScalingConfigurations(new java.util.ArrayList<LoadBasedAutoScalingConfiguration>(loadBasedAutoScalingConfigurations.length));
        for (LoadBasedAutoScalingConfiguration value : loadBasedAutoScalingConfigurations) {
            getLoadBasedAutoScalingConfigurations().add(value);
        }
        return this;
    }
    
    /**
     * An array of <code>LoadBasedAutoScalingConfiguration</code> objects
     * that describe each layer's configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBasedAutoScalingConfigurations An array of <code>LoadBasedAutoScalingConfiguration</code> objects
     *         that describe each layer's configuration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeLoadBasedAutoScalingResult withLoadBasedAutoScalingConfigurations(java.util.Collection<LoadBasedAutoScalingConfiguration> loadBasedAutoScalingConfigurations) {
        if (loadBasedAutoScalingConfigurations == null) {
            this.loadBasedAutoScalingConfigurations = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<LoadBasedAutoScalingConfiguration> loadBasedAutoScalingConfigurationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LoadBasedAutoScalingConfiguration>(loadBasedAutoScalingConfigurations.size());
            loadBasedAutoScalingConfigurationsCopy.addAll(loadBasedAutoScalingConfigurations);
            this.loadBasedAutoScalingConfigurations = loadBasedAutoScalingConfigurationsCopy;
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
        if (getLoadBasedAutoScalingConfigurations() != null) sb.append("LoadBasedAutoScalingConfigurations: " + getLoadBasedAutoScalingConfigurations() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLoadBasedAutoScalingConfigurations() == null) ? 0 : getLoadBasedAutoScalingConfigurations().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeLoadBasedAutoScalingResult == false) return false;
        DescribeLoadBasedAutoScalingResult other = (DescribeLoadBasedAutoScalingResult)obj;
        
        if (other.getLoadBasedAutoScalingConfigurations() == null ^ this.getLoadBasedAutoScalingConfigurations() == null) return false;
        if (other.getLoadBasedAutoScalingConfigurations() != null && other.getLoadBasedAutoScalingConfigurations().equals(this.getLoadBasedAutoScalingConfigurations()) == false) return false; 
        return true;
    }
    
}
    