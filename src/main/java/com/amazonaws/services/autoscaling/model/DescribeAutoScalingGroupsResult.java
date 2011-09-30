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
 * <p>
 * The AutoScalingGroupsType data type.
 * </p>
 */
public class DescribeAutoScalingGroupsResult {

    /**
     * A list of Auto Scaling groups.
     */
    private java.util.List<AutoScalingGroup> autoScalingGroups;

    /**
     * A string that marks the start of the next batch of returned results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String nextToken;

    /**
     * A list of Auto Scaling groups.
     *
     * @return A list of Auto Scaling groups.
     */
    public java.util.List<AutoScalingGroup> getAutoScalingGroups() {
        
        if (autoScalingGroups == null) {
            autoScalingGroups = new java.util.ArrayList<AutoScalingGroup>();
        }
        return autoScalingGroups;
    }
    
    /**
     * A list of Auto Scaling groups.
     *
     * @param autoScalingGroups A list of Auto Scaling groups.
     */
    public void setAutoScalingGroups(java.util.Collection<AutoScalingGroup> autoScalingGroups) {
        java.util.List<AutoScalingGroup> autoScalingGroupsCopy = new java.util.ArrayList<AutoScalingGroup>();
        if (autoScalingGroups != null) {
            autoScalingGroupsCopy.addAll(autoScalingGroups);
        }
        this.autoScalingGroups = autoScalingGroupsCopy;
    }
    
    /**
     * A list of Auto Scaling groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingGroups A list of Auto Scaling groups.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAutoScalingGroupsResult withAutoScalingGroups(AutoScalingGroup... autoScalingGroups) {
        if (getAutoScalingGroups() == null) setAutoScalingGroups(new java.util.ArrayList<AutoScalingGroup>());
        for (AutoScalingGroup value : autoScalingGroups) {
            getAutoScalingGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of Auto Scaling groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingGroups A list of Auto Scaling groups.
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
     * A string that marks the start of the next batch of returned results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return A string that marks the start of the next batch of returned results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A string that marks the start of the next batch of returned results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param nextToken A string that marks the start of the next batch of returned results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A string that marks the start of the next batch of returned results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param nextToken A string that marks the start of the next batch of returned results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAutoScalingGroupsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        sb.append("NextToken: " + nextToken + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    