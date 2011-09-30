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
 * The AutoScalingInstancesType data type.
 * </p>
 */
public class DescribeAutoScalingInstancesResult {

    /**
     * A list of Auto Scaling instances.
     */
    private java.util.List<AutoScalingInstanceDetails> autoScalingInstances;

    /**
     * A string that marks the start of the next batch of returned results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String nextToken;

    /**
     * A list of Auto Scaling instances.
     *
     * @return A list of Auto Scaling instances.
     */
    public java.util.List<AutoScalingInstanceDetails> getAutoScalingInstances() {
        
        if (autoScalingInstances == null) {
            autoScalingInstances = new java.util.ArrayList<AutoScalingInstanceDetails>();
        }
        return autoScalingInstances;
    }
    
    /**
     * A list of Auto Scaling instances.
     *
     * @param autoScalingInstances A list of Auto Scaling instances.
     */
    public void setAutoScalingInstances(java.util.Collection<AutoScalingInstanceDetails> autoScalingInstances) {
        java.util.List<AutoScalingInstanceDetails> autoScalingInstancesCopy = new java.util.ArrayList<AutoScalingInstanceDetails>();
        if (autoScalingInstances != null) {
            autoScalingInstancesCopy.addAll(autoScalingInstances);
        }
        this.autoScalingInstances = autoScalingInstancesCopy;
    }
    
    /**
     * A list of Auto Scaling instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingInstances A list of Auto Scaling instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAutoScalingInstancesResult withAutoScalingInstances(AutoScalingInstanceDetails... autoScalingInstances) {
        if (getAutoScalingInstances() == null) setAutoScalingInstances(new java.util.ArrayList<AutoScalingInstanceDetails>());
        for (AutoScalingInstanceDetails value : autoScalingInstances) {
            getAutoScalingInstances().add(value);
        }
        return this;
    }
    
    /**
     * A list of Auto Scaling instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingInstances A list of Auto Scaling instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAutoScalingInstancesResult withAutoScalingInstances(java.util.Collection<AutoScalingInstanceDetails> autoScalingInstances) {
        java.util.List<AutoScalingInstanceDetails> autoScalingInstancesCopy = new java.util.ArrayList<AutoScalingInstanceDetails>();
        if (autoScalingInstances != null) {
            autoScalingInstancesCopy.addAll(autoScalingInstances);
        }
        this.autoScalingInstances = autoScalingInstancesCopy;

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
    public DescribeAutoScalingInstancesResult withNextToken(String nextToken) {
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
        sb.append("AutoScalingInstances: " + autoScalingInstances + ", ");
        sb.append("NextToken: " + nextToken + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    