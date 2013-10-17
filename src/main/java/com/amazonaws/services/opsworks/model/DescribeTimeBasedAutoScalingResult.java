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
 * Contains the response to a <code>DescribeTimeBasedAutoScaling</code> request.
 * </p>
 */
public class DescribeTimeBasedAutoScalingResult implements Serializable {

    /**
     * An array of <code>TimeBasedAutoScalingConfiguration</code> objects
     * that describe the configuration for the specified instances.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<TimeBasedAutoScalingConfiguration> timeBasedAutoScalingConfigurations;

    /**
     * An array of <code>TimeBasedAutoScalingConfiguration</code> objects
     * that describe the configuration for the specified instances.
     *
     * @return An array of <code>TimeBasedAutoScalingConfiguration</code> objects
     *         that describe the configuration for the specified instances.
     */
    public java.util.List<TimeBasedAutoScalingConfiguration> getTimeBasedAutoScalingConfigurations() {
        if (timeBasedAutoScalingConfigurations == null) {
              timeBasedAutoScalingConfigurations = new com.amazonaws.internal.ListWithAutoConstructFlag<TimeBasedAutoScalingConfiguration>();
              timeBasedAutoScalingConfigurations.setAutoConstruct(true);
        }
        return timeBasedAutoScalingConfigurations;
    }
    
    /**
     * An array of <code>TimeBasedAutoScalingConfiguration</code> objects
     * that describe the configuration for the specified instances.
     *
     * @param timeBasedAutoScalingConfigurations An array of <code>TimeBasedAutoScalingConfiguration</code> objects
     *         that describe the configuration for the specified instances.
     */
    public void setTimeBasedAutoScalingConfigurations(java.util.Collection<TimeBasedAutoScalingConfiguration> timeBasedAutoScalingConfigurations) {
        if (timeBasedAutoScalingConfigurations == null) {
            this.timeBasedAutoScalingConfigurations = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<TimeBasedAutoScalingConfiguration> timeBasedAutoScalingConfigurationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TimeBasedAutoScalingConfiguration>(timeBasedAutoScalingConfigurations.size());
        timeBasedAutoScalingConfigurationsCopy.addAll(timeBasedAutoScalingConfigurations);
        this.timeBasedAutoScalingConfigurations = timeBasedAutoScalingConfigurationsCopy;
    }
    
    /**
     * An array of <code>TimeBasedAutoScalingConfiguration</code> objects
     * that describe the configuration for the specified instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timeBasedAutoScalingConfigurations An array of <code>TimeBasedAutoScalingConfiguration</code> objects
     *         that describe the configuration for the specified instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeTimeBasedAutoScalingResult withTimeBasedAutoScalingConfigurations(TimeBasedAutoScalingConfiguration... timeBasedAutoScalingConfigurations) {
        if (getTimeBasedAutoScalingConfigurations() == null) setTimeBasedAutoScalingConfigurations(new java.util.ArrayList<TimeBasedAutoScalingConfiguration>(timeBasedAutoScalingConfigurations.length));
        for (TimeBasedAutoScalingConfiguration value : timeBasedAutoScalingConfigurations) {
            getTimeBasedAutoScalingConfigurations().add(value);
        }
        return this;
    }
    
    /**
     * An array of <code>TimeBasedAutoScalingConfiguration</code> objects
     * that describe the configuration for the specified instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timeBasedAutoScalingConfigurations An array of <code>TimeBasedAutoScalingConfiguration</code> objects
     *         that describe the configuration for the specified instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeTimeBasedAutoScalingResult withTimeBasedAutoScalingConfigurations(java.util.Collection<TimeBasedAutoScalingConfiguration> timeBasedAutoScalingConfigurations) {
        if (timeBasedAutoScalingConfigurations == null) {
            this.timeBasedAutoScalingConfigurations = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<TimeBasedAutoScalingConfiguration> timeBasedAutoScalingConfigurationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TimeBasedAutoScalingConfiguration>(timeBasedAutoScalingConfigurations.size());
            timeBasedAutoScalingConfigurationsCopy.addAll(timeBasedAutoScalingConfigurations);
            this.timeBasedAutoScalingConfigurations = timeBasedAutoScalingConfigurationsCopy;
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
        if (getTimeBasedAutoScalingConfigurations() != null) sb.append("TimeBasedAutoScalingConfigurations: " + getTimeBasedAutoScalingConfigurations() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTimeBasedAutoScalingConfigurations() == null) ? 0 : getTimeBasedAutoScalingConfigurations().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeTimeBasedAutoScalingResult == false) return false;
        DescribeTimeBasedAutoScalingResult other = (DescribeTimeBasedAutoScalingResult)obj;
        
        if (other.getTimeBasedAutoScalingConfigurations() == null ^ this.getTimeBasedAutoScalingConfigurations() == null) return false;
        if (other.getTimeBasedAutoScalingConfigurations() != null && other.getTimeBasedAutoScalingConfigurations().equals(this.getTimeBasedAutoScalingConfigurations()) == false) return false; 
        return true;
    }
    
}
    