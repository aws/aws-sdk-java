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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#describeAutoScalingGroups(DescribeAutoScalingGroupsRequest) DescribeAutoScalingGroups operation}.
 * <p>
 * Returns a full description of the AutoScalingGroup instances
 * specified in the given list. This includes all Amazon EC2 instances
 * that are members of the Auto Scaling group. If a list of names is not
 * provided, then the full details of all AutoScalingGroups is returned.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#describeAutoScalingGroups(DescribeAutoScalingGroupsRequest)
 */
public class DescribeAutoScalingGroupsRequest extends AmazonWebServiceRequest {

    /**
     * 
     */
    private java.util.List<String> autoScalingGroupNames;

    /**
     * 
     *
     * @return 
     */
    public java.util.List<String> getAutoScalingGroupNames() {
        if (autoScalingGroupNames == null) {
            autoScalingGroupNames = new java.util.ArrayList<String>();
        }
        return autoScalingGroupNames;
    }
    
    /**
     * 
     *
     * @param autoScalingGroupNames 
     */
    public void setAutoScalingGroupNames(java.util.Collection<String> autoScalingGroupNames) {
        java.util.List<String> autoScalingGroupNamesCopy = new java.util.ArrayList<String>();
        if (autoScalingGroupNames != null) {
            autoScalingGroupNamesCopy.addAll(autoScalingGroupNames);
        }
        this.autoScalingGroupNames = autoScalingGroupNamesCopy;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingGroupNames 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAutoScalingGroupsRequest withAutoScalingGroupNames(String... autoScalingGroupNames) {
        for (String value : autoScalingGroupNames) {
            getAutoScalingGroupNames().add(value);
        }
        return this;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingGroupNames 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAutoScalingGroupsRequest withAutoScalingGroupNames(java.util.Collection<String> autoScalingGroupNames) {
        java.util.List<String> autoScalingGroupNamesCopy = new java.util.ArrayList<String>();
        if (autoScalingGroupNames != null) {
            autoScalingGroupNamesCopy.addAll(autoScalingGroupNames);
        }
        this.autoScalingGroupNames = autoScalingGroupNamesCopy;

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
        
        sb.append("AutoScalingGroupNames: " + autoScalingGroupNames + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    