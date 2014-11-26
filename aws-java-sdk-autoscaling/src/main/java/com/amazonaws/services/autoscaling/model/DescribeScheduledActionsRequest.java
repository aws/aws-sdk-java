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
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#describeScheduledActions(DescribeScheduledActionsRequest) DescribeScheduledActions operation}.
 * <p>
 * Lists the actions scheduled for your Auto Scaling group that haven't
 * been executed. To list the actions that were already executed, use
 * DescribeScalingActivities.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#describeScheduledActions(DescribeScheduledActionsRequest)
 */
public class DescribeScheduledActionsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * Describes one or more scheduled actions. If you omit this list, the
     * call describes all scheduled actions. If you specify an unknown
     * scheduled action it is ignored with no error. <p>You can describe up
     * to a maximum of 50 instances with a single call. If there are more
     * items to return, the call returns a token. To get the next set of
     * items, repeat the call with the returned token in the
     * <code>NextToken</code> parameter.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> scheduledActionNames;

    /**
     * The earliest scheduled start time to return. If scheduled action names
     * are provided, this parameter is ignored.
     */
    private java.util.Date startTime;

    /**
     * The latest scheduled start time to return. If scheduled action names
     * are provided, this parameter is ignored.
     */
    private java.util.Date endTime;

    /**
     * The token for the next set of items to return. (You received this
     * token from a previous call.)
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String nextToken;

    /**
     * The maximum number of items to return with this call.
     */
    private Integer maxRecords;

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
    public DescribeScheduledActionsRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * Describes one or more scheduled actions. If you omit this list, the
     * call describes all scheduled actions. If you specify an unknown
     * scheduled action it is ignored with no error. <p>You can describe up
     * to a maximum of 50 instances with a single call. If there are more
     * items to return, the call returns a token. To get the next set of
     * items, repeat the call with the returned token in the
     * <code>NextToken</code> parameter.
     *
     * @return Describes one or more scheduled actions. If you omit this list, the
     *         call describes all scheduled actions. If you specify an unknown
     *         scheduled action it is ignored with no error. <p>You can describe up
     *         to a maximum of 50 instances with a single call. If there are more
     *         items to return, the call returns a token. To get the next set of
     *         items, repeat the call with the returned token in the
     *         <code>NextToken</code> parameter.
     */
    public java.util.List<String> getScheduledActionNames() {
        if (scheduledActionNames == null) {
              scheduledActionNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              scheduledActionNames.setAutoConstruct(true);
        }
        return scheduledActionNames;
    }
    
    /**
     * Describes one or more scheduled actions. If you omit this list, the
     * call describes all scheduled actions. If you specify an unknown
     * scheduled action it is ignored with no error. <p>You can describe up
     * to a maximum of 50 instances with a single call. If there are more
     * items to return, the call returns a token. To get the next set of
     * items, repeat the call with the returned token in the
     * <code>NextToken</code> parameter.
     *
     * @param scheduledActionNames Describes one or more scheduled actions. If you omit this list, the
     *         call describes all scheduled actions. If you specify an unknown
     *         scheduled action it is ignored with no error. <p>You can describe up
     *         to a maximum of 50 instances with a single call. If there are more
     *         items to return, the call returns a token. To get the next set of
     *         items, repeat the call with the returned token in the
     *         <code>NextToken</code> parameter.
     */
    public void setScheduledActionNames(java.util.Collection<String> scheduledActionNames) {
        if (scheduledActionNames == null) {
            this.scheduledActionNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> scheduledActionNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(scheduledActionNames.size());
        scheduledActionNamesCopy.addAll(scheduledActionNames);
        this.scheduledActionNames = scheduledActionNamesCopy;
    }
    
    /**
     * Describes one or more scheduled actions. If you omit this list, the
     * call describes all scheduled actions. If you specify an unknown
     * scheduled action it is ignored with no error. <p>You can describe up
     * to a maximum of 50 instances with a single call. If there are more
     * items to return, the call returns a token. To get the next set of
     * items, repeat the call with the returned token in the
     * <code>NextToken</code> parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scheduledActionNames Describes one or more scheduled actions. If you omit this list, the
     *         call describes all scheduled actions. If you specify an unknown
     *         scheduled action it is ignored with no error. <p>You can describe up
     *         to a maximum of 50 instances with a single call. If there are more
     *         items to return, the call returns a token. To get the next set of
     *         items, repeat the call with the returned token in the
     *         <code>NextToken</code> parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeScheduledActionsRequest withScheduledActionNames(String... scheduledActionNames) {
        if (getScheduledActionNames() == null) setScheduledActionNames(new java.util.ArrayList<String>(scheduledActionNames.length));
        for (String value : scheduledActionNames) {
            getScheduledActionNames().add(value);
        }
        return this;
    }
    
    /**
     * Describes one or more scheduled actions. If you omit this list, the
     * call describes all scheduled actions. If you specify an unknown
     * scheduled action it is ignored with no error. <p>You can describe up
     * to a maximum of 50 instances with a single call. If there are more
     * items to return, the call returns a token. To get the next set of
     * items, repeat the call with the returned token in the
     * <code>NextToken</code> parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scheduledActionNames Describes one or more scheduled actions. If you omit this list, the
     *         call describes all scheduled actions. If you specify an unknown
     *         scheduled action it is ignored with no error. <p>You can describe up
     *         to a maximum of 50 instances with a single call. If there are more
     *         items to return, the call returns a token. To get the next set of
     *         items, repeat the call with the returned token in the
     *         <code>NextToken</code> parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeScheduledActionsRequest withScheduledActionNames(java.util.Collection<String> scheduledActionNames) {
        if (scheduledActionNames == null) {
            this.scheduledActionNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> scheduledActionNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(scheduledActionNames.size());
            scheduledActionNamesCopy.addAll(scheduledActionNames);
            this.scheduledActionNames = scheduledActionNamesCopy;
        }

        return this;
    }

    /**
     * The earliest scheduled start time to return. If scheduled action names
     * are provided, this parameter is ignored.
     *
     * @return The earliest scheduled start time to return. If scheduled action names
     *         are provided, this parameter is ignored.
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    
    /**
     * The earliest scheduled start time to return. If scheduled action names
     * are provided, this parameter is ignored.
     *
     * @param startTime The earliest scheduled start time to return. If scheduled action names
     *         are provided, this parameter is ignored.
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    
    /**
     * The earliest scheduled start time to return. If scheduled action names
     * are provided, this parameter is ignored.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime The earliest scheduled start time to return. If scheduled action names
     *         are provided, this parameter is ignored.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeScheduledActionsRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * The latest scheduled start time to return. If scheduled action names
     * are provided, this parameter is ignored.
     *
     * @return The latest scheduled start time to return. If scheduled action names
     *         are provided, this parameter is ignored.
     */
    public java.util.Date getEndTime() {
        return endTime;
    }
    
    /**
     * The latest scheduled start time to return. If scheduled action names
     * are provided, this parameter is ignored.
     *
     * @param endTime The latest scheduled start time to return. If scheduled action names
     *         are provided, this parameter is ignored.
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }
    
    /**
     * The latest scheduled start time to return. If scheduled action names
     * are provided, this parameter is ignored.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endTime The latest scheduled start time to return. If scheduled action names
     *         are provided, this parameter is ignored.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeScheduledActionsRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
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
    public DescribeScheduledActionsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
    public DescribeScheduledActionsRequest withMaxRecords(Integer maxRecords) {
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
        if (getAutoScalingGroupName() != null) sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getScheduledActionNames() != null) sb.append("ScheduledActionNames: " + getScheduledActionNames() + ",");
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null) sb.append("EndTime: " + getEndTime() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getScheduledActionNames() == null) ? 0 : getScheduledActionNames().hashCode()); 
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode()); 
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeScheduledActionsRequest == false) return false;
        DescribeScheduledActionsRequest other = (DescribeScheduledActionsRequest)obj;
        
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null) return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false) return false; 
        if (other.getScheduledActionNames() == null ^ this.getScheduledActionNames() == null) return false;
        if (other.getScheduledActionNames() != null && other.getScheduledActionNames().equals(this.getScheduledActionNames()) == false) return false; 
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false; 
        if (other.getEndTime() == null ^ this.getEndTime() == null) return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        return true;
    }
    
}
    