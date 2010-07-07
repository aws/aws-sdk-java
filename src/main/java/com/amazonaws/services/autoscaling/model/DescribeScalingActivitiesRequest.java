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
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#describeScalingActivities(DescribeScalingActivitiesRequest) DescribeScalingActivities operation}.
 * <p>
 * Returns the scaling activities for the specified Auto Scaling group.
 * </p>
 * <p>
 * If the specified <i>ActivityIds</i> list is empty, all the activities
 * from the past six weeks are returned. Activities will be sorted by
 * completion time. Activities that have no completion time are
 * considered as using the most recent possible time.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#describeScalingActivities(DescribeScalingActivitiesRequest)
 */
public class DescribeScalingActivitiesRequest extends AmazonWebServiceRequest {

    /**
     * A list containing the activity IDs of the desired scaling activities.
     */
    private java.util.List<String> activityIds;

    /**
     * The name of the <a>AutoScalingGroup</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The maximum number of scaling activities to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>20 - 100<br/>
     */
    private Integer maxRecords;

    /**
     * A string used to mark the start of the next batch of returned results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String nextToken;

    /**
     * A list containing the activity IDs of the desired scaling activities.
     *
     * @return A list containing the activity IDs of the desired scaling activities.
     */
    public java.util.List<String> getActivityIds() {
        if (activityIds == null) {
            activityIds = new java.util.ArrayList<String>();
        }
        return activityIds;
    }
    
    /**
     * A list containing the activity IDs of the desired scaling activities.
     *
     * @param activityIds A list containing the activity IDs of the desired scaling activities.
     */
    public void setActivityIds(java.util.Collection<String> activityIds) {
        java.util.List<String> activityIdsCopy = new java.util.ArrayList<String>();
        if (activityIds != null) {
            activityIdsCopy.addAll(activityIds);
        }
        this.activityIds = activityIdsCopy;
    }
    
    /**
     * A list containing the activity IDs of the desired scaling activities.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param activityIds A list containing the activity IDs of the desired scaling activities.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeScalingActivitiesRequest withActivityIds(String... activityIds) {
        for (String value : activityIds) {
            getActivityIds().add(value);
        }
        return this;
    }
    
    /**
     * A list containing the activity IDs of the desired scaling activities.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param activityIds A list containing the activity IDs of the desired scaling activities.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeScalingActivitiesRequest withActivityIds(java.util.Collection<String> activityIds) {
        java.util.List<String> activityIdsCopy = new java.util.ArrayList<String>();
        if (activityIds != null) {
            activityIdsCopy.addAll(activityIds);
        }
        this.activityIds = activityIdsCopy;

        return this;
    }
    
    /**
     * The name of the <a>AutoScalingGroup</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the <a>AutoScalingGroup</a>.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name of the <a>AutoScalingGroup</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the <a>AutoScalingGroup</a>.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name of the <a>AutoScalingGroup</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the <a>AutoScalingGroup</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeScalingActivitiesRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }
    
    
    /**
     * The maximum number of scaling activities to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>20 - 100<br/>
     *
     * @return The maximum number of scaling activities to return.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of scaling activities to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>20 - 100<br/>
     *
     * @param maxRecords The maximum number of scaling activities to return.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of scaling activities to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>20 - 100<br/>
     *
     * @param maxRecords The maximum number of scaling activities to return.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeScalingActivitiesRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }
    
    
    /**
     * A string used to mark the start of the next batch of returned results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return A string used to mark the start of the next batch of returned results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A string used to mark the start of the next batch of returned results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param nextToken A string used to mark the start of the next batch of returned results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A string used to mark the start of the next batch of returned results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param nextToken A string used to mark the start of the next batch of returned results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeScalingActivitiesRequest withNextToken(String nextToken) {
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
        sb.append("ActivityIds: " + activityIds + ", ");
        sb.append("AutoScalingGroupName: " + autoScalingGroupName + ", ");
        sb.append("MaxRecords: " + maxRecords + ", ");
        sb.append("NextToken: " + nextToken + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    