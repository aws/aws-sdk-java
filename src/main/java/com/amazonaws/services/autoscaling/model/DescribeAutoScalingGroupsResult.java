/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;

/**
 * <p>
 * 
 * </p>
 */
public class DescribeAutoScalingGroupsResult {

    /**
     * 
     */
    private java.util.List<AutoScalingGroup> autoScalingGroups;

    /**
     * 
     *
     * @return 
     */
    public java.util.List<AutoScalingGroup> getAutoScalingGroups() {
        if (autoScalingGroups == null) {
            autoScalingGroups = new java.util.ArrayList<AutoScalingGroup>();
        }
        return autoScalingGroups;
    }
    
    /**
     * 
     *
     * @param autoScalingGroups 
     */
    public void setAutoScalingGroups(java.util.Collection<AutoScalingGroup> autoScalingGroups) {
        java.util.List<AutoScalingGroup> autoScalingGroupsCopy = new java.util.ArrayList<AutoScalingGroup>();
        if (autoScalingGroups != null) {
            autoScalingGroupsCopy.addAll(autoScalingGroups);
        }
        this.autoScalingGroups = autoScalingGroupsCopy;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingGroups 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAutoScalingGroupsResult withAutoScalingGroups(AutoScalingGroup... autoScalingGroups) {
        for (AutoScalingGroup value : autoScalingGroups) {
            getAutoScalingGroups().add(value);
        }
        return this;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingGroups 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAutoScalingGroupsResult withAutoScalingGroups(java.util.Collection<AutoScalingGroup> autoScalingGroups) {
        java.util.List<AutoScalingGroup> autoScalingGroupsCopy = new java.util.ArrayList<AutoScalingGroup>();
        if (autoScalingGroups != null) {
            autoScalingGroupsCopy.addAll(autoScalingGroups);
        }
        this.autoScalingGroups = autoScalingGroupsCopy;

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
        sb.append("AutoScalingGroups: " + autoScalingGroups + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    