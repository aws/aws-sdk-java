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
package com.amazonaws.services.autoscaling.model;

/**
 * 
 */
public class DescribeAutoScalingNotificationTypesResult {

    /**
     * Notification types supported by Auto Scaling. They are:
     * autoscaling:EC2_INSTANCE_LAUNCH,
     * autoscaling:EC2_INSTANCE_LAUNCH_ERROR,
     * autoscaling:EC2_INSTANCE_TERMINATE,
     * autoscaling:EC2_INSTANCE_TERMINATE_ERROR,
     * autoscaling:TEST_NOTIFICATION
     */
    private java.util.List<String> autoScalingNotificationTypes;

    /**
     * Notification types supported by Auto Scaling. They are:
     * autoscaling:EC2_INSTANCE_LAUNCH,
     * autoscaling:EC2_INSTANCE_LAUNCH_ERROR,
     * autoscaling:EC2_INSTANCE_TERMINATE,
     * autoscaling:EC2_INSTANCE_TERMINATE_ERROR,
     * autoscaling:TEST_NOTIFICATION
     *
     * @return Notification types supported by Auto Scaling. They are:
     *         autoscaling:EC2_INSTANCE_LAUNCH,
     *         autoscaling:EC2_INSTANCE_LAUNCH_ERROR,
     *         autoscaling:EC2_INSTANCE_TERMINATE,
     *         autoscaling:EC2_INSTANCE_TERMINATE_ERROR,
     *         autoscaling:TEST_NOTIFICATION
     */
    public java.util.List<String> getAutoScalingNotificationTypes() {
        
        if (autoScalingNotificationTypes == null) {
            autoScalingNotificationTypes = new java.util.ArrayList<String>();
        }
        return autoScalingNotificationTypes;
    }
    
    /**
     * Notification types supported by Auto Scaling. They are:
     * autoscaling:EC2_INSTANCE_LAUNCH,
     * autoscaling:EC2_INSTANCE_LAUNCH_ERROR,
     * autoscaling:EC2_INSTANCE_TERMINATE,
     * autoscaling:EC2_INSTANCE_TERMINATE_ERROR,
     * autoscaling:TEST_NOTIFICATION
     *
     * @param autoScalingNotificationTypes Notification types supported by Auto Scaling. They are:
     *         autoscaling:EC2_INSTANCE_LAUNCH,
     *         autoscaling:EC2_INSTANCE_LAUNCH_ERROR,
     *         autoscaling:EC2_INSTANCE_TERMINATE,
     *         autoscaling:EC2_INSTANCE_TERMINATE_ERROR,
     *         autoscaling:TEST_NOTIFICATION
     */
    public void setAutoScalingNotificationTypes(java.util.Collection<String> autoScalingNotificationTypes) {
        java.util.List<String> autoScalingNotificationTypesCopy = new java.util.ArrayList<String>();
        if (autoScalingNotificationTypes != null) {
            autoScalingNotificationTypesCopy.addAll(autoScalingNotificationTypes);
        }
        this.autoScalingNotificationTypes = autoScalingNotificationTypesCopy;
    }
    
    /**
     * Notification types supported by Auto Scaling. They are:
     * autoscaling:EC2_INSTANCE_LAUNCH,
     * autoscaling:EC2_INSTANCE_LAUNCH_ERROR,
     * autoscaling:EC2_INSTANCE_TERMINATE,
     * autoscaling:EC2_INSTANCE_TERMINATE_ERROR,
     * autoscaling:TEST_NOTIFICATION
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingNotificationTypes Notification types supported by Auto Scaling. They are:
     *         autoscaling:EC2_INSTANCE_LAUNCH,
     *         autoscaling:EC2_INSTANCE_LAUNCH_ERROR,
     *         autoscaling:EC2_INSTANCE_TERMINATE,
     *         autoscaling:EC2_INSTANCE_TERMINATE_ERROR,
     *         autoscaling:TEST_NOTIFICATION
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAutoScalingNotificationTypesResult withAutoScalingNotificationTypes(String... autoScalingNotificationTypes) {
        if (getAutoScalingNotificationTypes() == null) setAutoScalingNotificationTypes(new java.util.ArrayList<String>());
        for (String value : autoScalingNotificationTypes) {
            getAutoScalingNotificationTypes().add(value);
        }
        return this;
    }
    
    /**
     * Notification types supported by Auto Scaling. They are:
     * autoscaling:EC2_INSTANCE_LAUNCH,
     * autoscaling:EC2_INSTANCE_LAUNCH_ERROR,
     * autoscaling:EC2_INSTANCE_TERMINATE,
     * autoscaling:EC2_INSTANCE_TERMINATE_ERROR,
     * autoscaling:TEST_NOTIFICATION
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingNotificationTypes Notification types supported by Auto Scaling. They are:
     *         autoscaling:EC2_INSTANCE_LAUNCH,
     *         autoscaling:EC2_INSTANCE_LAUNCH_ERROR,
     *         autoscaling:EC2_INSTANCE_TERMINATE,
     *         autoscaling:EC2_INSTANCE_TERMINATE_ERROR,
     *         autoscaling:TEST_NOTIFICATION
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAutoScalingNotificationTypesResult withAutoScalingNotificationTypes(java.util.Collection<String> autoScalingNotificationTypes) {
        java.util.List<String> autoScalingNotificationTypesCopy = new java.util.ArrayList<String>();
        if (autoScalingNotificationTypes != null) {
            autoScalingNotificationTypesCopy.addAll(autoScalingNotificationTypes);
        }
        this.autoScalingNotificationTypes = autoScalingNotificationTypesCopy;

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
        sb.append("AutoScalingNotificationTypes: " + autoScalingNotificationTypes + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    