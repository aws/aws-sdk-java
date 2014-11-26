/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#describeScalingActivities(DescribeScalingActivitiesRequest) DescribeScalingActivities operation}.
 * <p>
 * Describes one or more scaling activities for the specified Auto
 * Scaling group. If you omit the <code>ActivityIds</code> , the call
 * returns all activities from the past six weeks. Activities are sorted
 * by the start time. Activities still in progress appear first on the
 * list.
 * </p>
 * <p>
 * You can specify a maximum number of items to be returned with a single
 * call. If there are more items to return, the call returns a token. To
 * get the next set of items, repeat the call with the returned token in
 * the <code>NextToken</code> parameter.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#describeScalingActivities(DescribeScalingActivitiesRequest)
 */
public class DescribeScalingActivitiesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A list containing the activity IDs of the desired scaling activities.
     * If this list is omitted, all activities are described. If an
     * <code>AutoScalingGroupName</code> is provided, the results are limited
     * to that group. The list of requested activities cannot contain more
     * than 50 items. If unknown activities are requested, they are ignored
     * with no error.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> activityIds;

    /**
     * The name of the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The maximum number of items to return with this call.
     */
    private Integer maxRecords;

    /**
     * The token for the next set of items to return. (You received this
     * token from a previous call.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String nextToken;

    /**
     * A list containing the activity IDs of the desired scaling activities.
     * If this list is omitted, all activities are described. If an
     * <code>AutoScalingGroupName</code> is provided, the results are limited
     * to that group. The list of requested activities cannot contain more
     * than 50 items. If unknown activities are requested, they are ignored
     * with no error.
     *
     * @return A list containing the activity IDs of the desired scaling activities.
     *         If this list is omitted, all activities are described. If an
     *         <code>AutoScalingGroupName</code> is provided, the results are limited
     *         to that group. The list of requested activities cannot contain more
     *         than 50 items. If unknown activities are requested, they are ignored
     *         with no error.
     */
    public java.util.List<String> getActivityIds() {
        if (activityIds == null) {
              activityIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              activityIds.setAutoConstruct(true);
        }
        return activityIds;
    }
    
    /**
     * A list containing the activity IDs of the desired scaling activities.
     * If this list is omitted, all activities are described. If an
     * <code>AutoScalingGroupName</code> is provided, the results are limited
     * to that group. The list of requested activities cannot contain more
     * than 50 items. If unknown activities are requested, they are ignored
     * with no error.
     *
     * @param activityIds A list containing the activity IDs of the desired scaling activities.
     *         If this list is omitted, all activities are described. If an
     *         <code>AutoScalingGroupName</code> is provided, the results are limited
     *         to that group. The list of requested activities cannot contain more
     *         than 50 items. If unknown activities are requested, they are ignored
     *         with no error.
     */
    public void setActivityIds(java.util.Collection<String> activityIds) {
        if (activityIds == null) {
            this.activityIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> activityIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(activityIds.size());
        activityIdsCopy.addAll(activityIds);
        this.activityIds = activityIdsCopy;
    }
    
    /**
     * A list containing the activity IDs of the desired scaling activities.
     * If this list is omitted, all activities are described. If an
     * <code>AutoScalingGroupName</code> is provided, the results are limited
     * to that group. The list of requested activities cannot contain more
     * than 50 items. If unknown activities are requested, they are ignored
     * with no error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param activityIds A list containing the activity IDs of the desired scaling activities.
     *         If this list is omitted, all activities are described. If an
     *         <code>AutoScalingGroupName</code> is provided, the results are limited
     *         to that group. The list of requested activities cannot contain more
     *         than 50 items. If unknown activities are requested, they are ignored
     *         with no error.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeScalingActivitiesRequest withActivityIds(String... activityIds) {
        if (getActivityIds() == null) setActivityIds(new java.util.ArrayList<String>(activityIds.length));
        for (String value : activityIds) {
            getActivityIds().add(value);
        }
        return this;
    }
    
    /**
     * A list containing the activity IDs of the desired scaling activities.
     * If this list is omitted, all activities are described. If an
     * <code>AutoScalingGroupName</code> is provided, the results are limited
     * to that group. The list of requested activities cannot contain more
     * than 50 items. If unknown activities are requested, they are ignored
     * with no error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param activityIds A list containing the activity IDs of the desired scaling activities.
     *         If this list is omitted, all activities are described. If an
     *         <code>AutoScalingGroupName</code> is provided, the results are limited
     *         to that group. The list of requested activities cannot contain more
     *         than 50 items. If unknown activities are requested, they are ignored
     *         with no error.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeScalingActivitiesRequest withActivityIds(java.util.Collection<String> activityIds) {
        if (activityIds == null) {
            this.activityIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> activityIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(activityIds.size());
            activityIdsCopy.addAll(activityIds);
            this.activityIds = activityIdsCopy;
        }

        return this;
    }

    /**
     * The name of the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name of the group.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name of the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the group.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name of the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeScalingActivitiesRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * The maximum number of items to return with this call.
     *
     * @return The maximum number of items to return with this call.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of items to return with this call.
     *
     * @param maxRecords The maximum number of items to return with this call.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of items to return with this call.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of items to return with this call.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeScalingActivitiesRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * The token for the next set of items to return. (You received this
     * token from a previous call.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The token for the next set of items to return. (You received this
     *         token from a previous call.)
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token for the next set of items to return. (You received this
     * token from a previous call.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param nextToken The token for the next set of items to return. (You received this
     *         token from a previous call.)
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token for the next set of items to return. (You received this
     * token from a previous call.)
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param nextToken The token for the next set of items to return. (You received this
     *         token from a previous call.)
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
        if (getActivityIds() != null) sb.append("ActivityIds: " + getActivityIds() + ",");
        if (getAutoScalingGroupName() != null) sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getActivityIds() == null) ? 0 : getActivityIds().hashCode()); 
        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeScalingActivitiesRequest == false) return false;
        DescribeScalingActivitiesRequest other = (DescribeScalingActivitiesRequest)obj;
        
        if (other.getActivityIds() == null ^ this.getActivityIds() == null) return false;
        if (other.getActivityIds() != null && other.getActivityIds().equals(this.getActivityIds()) == false) return false; 
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null) return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    