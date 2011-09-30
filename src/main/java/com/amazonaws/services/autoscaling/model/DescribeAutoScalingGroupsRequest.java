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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#describeAutoScalingGroups(DescribeAutoScalingGroupsRequest) DescribeAutoScalingGroups operation}.
 * <p>
 * Returns a full description of each Auto Scaling group in the given
 * list. This includes all Amazon EC2 instances that are members of the
 * group. If a list of names is not provided, the service returns the
 * full details of all Auto Scaling groups.
 * </p>
 * <p>
 * This action supports pagination by returning a token if there are
 * more pages to retrieve. To get the next page, call this action again
 * with the returned token as the NextToken parameter.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#describeAutoScalingGroups(DescribeAutoScalingGroupsRequest)
 */
public class DescribeAutoScalingGroupsRequest extends AmazonWebServiceRequest {

    /**
     * A list of Auto Scaling group names.
     */
    private java.util.List<String> autoScalingGroupNames;

    /**
     * A string that marks the start of the next batch of returned results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String nextToken;

    /**
     * The maximum number of records to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxRecords;

    /**
     * A list of Auto Scaling group names.
     *
     * @return A list of Auto Scaling group names.
     */
    public java.util.List<String> getAutoScalingGroupNames() {
        
        if (autoScalingGroupNames == null) {
            autoScalingGroupNames = new java.util.ArrayList<String>();
        }
        return autoScalingGroupNames;
    }
    
    /**
     * A list of Auto Scaling group names.
     *
     * @param autoScalingGroupNames A list of Auto Scaling group names.
     */
    public void setAutoScalingGroupNames(java.util.Collection<String> autoScalingGroupNames) {
        java.util.List<String> autoScalingGroupNamesCopy = new java.util.ArrayList<String>();
        if (autoScalingGroupNames != null) {
            autoScalingGroupNamesCopy.addAll(autoScalingGroupNames);
        }
        this.autoScalingGroupNames = autoScalingGroupNamesCopy;
    }
    
    /**
     * A list of Auto Scaling group names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingGroupNames A list of Auto Scaling group names.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAutoScalingGroupsRequest withAutoScalingGroupNames(String... autoScalingGroupNames) {
        if (getAutoScalingGroupNames() == null) setAutoScalingGroupNames(new java.util.ArrayList<String>());
        for (String value : autoScalingGroupNames) {
            getAutoScalingGroupNames().add(value);
        }
        return this;
    }
    
    /**
     * A list of Auto Scaling group names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingGroupNames A list of Auto Scaling group names.
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
    public DescribeAutoScalingGroupsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    
    
    /**
     * The maximum number of records to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return The maximum number of records to return.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of records to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxRecords The maximum number of records to return.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of records to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxRecords The maximum number of records to return.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAutoScalingGroupsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
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
        sb.append("NextToken: " + nextToken + ", ");
        sb.append("MaxRecords: " + maxRecords + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    