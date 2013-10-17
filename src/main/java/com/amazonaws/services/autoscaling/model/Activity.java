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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;


/**
 * <p>
 * A scaling Activity is a long-running process that represents a change to your AutoScalingGroup, such as changing the size of the group. It can also
 * be a process to replace an instance, or a process to perform any other long-running operations supported by the API.
 * </p>
 */
public class Activity implements Serializable {

    /**
     * Specifies the ID of the activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String activityId;

    /**
     * The name of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * Contains a friendly, more verbose description of the scaling activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String description;

    /**
     * Contains the reason the activity was begun.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String cause;

    /**
     * Provides the start time of this activity.
     */
    private java.util.Date startTime;

    /**
     * Provides the end time of this activity.
     */
    private java.util.Date endTime;

    /**
     * Contains the current status of the activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WaitingForSpotInstanceRequestId, WaitingForSpotInstanceId, WaitingForInstanceId, PreInService, InProgress, Successful, Failed, Cancelled
     */
    private String statusCode;

    /**
     * Contains a friendly, more verbose description of the activity status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String statusMessage;

    /**
     * Specifies a value between 0 and 100 that indicates the progress of the
     * activity.
     */
    private Integer progress;

    /**
     * Contains details of the scaling activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String details;

    /**
     * Specifies the ID of the activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Specifies the ID of the activity.
     */
    public String getActivityId() {
        return activityId;
    }
    
    /**
     * Specifies the ID of the activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param activityId Specifies the ID of the activity.
     */
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }
    
    /**
     * Specifies the ID of the activity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param activityId Specifies the ID of the activity.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Activity withActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }

    /**
     * The name of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the Auto Scaling group.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the Auto Scaling group.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name of the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Activity withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * Contains a friendly, more verbose description of the scaling activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Contains a friendly, more verbose description of the scaling activity.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Contains a friendly, more verbose description of the scaling activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param description Contains a friendly, more verbose description of the scaling activity.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Contains a friendly, more verbose description of the scaling activity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param description Contains a friendly, more verbose description of the scaling activity.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Activity withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Contains the reason the activity was begun.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Contains the reason the activity was begun.
     */
    public String getCause() {
        return cause;
    }
    
    /**
     * Contains the reason the activity was begun.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param cause Contains the reason the activity was begun.
     */
    public void setCause(String cause) {
        this.cause = cause;
    }
    
    /**
     * Contains the reason the activity was begun.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1023<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param cause Contains the reason the activity was begun.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Activity withCause(String cause) {
        this.cause = cause;
        return this;
    }

    /**
     * Provides the start time of this activity.
     *
     * @return Provides the start time of this activity.
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    
    /**
     * Provides the start time of this activity.
     *
     * @param startTime Provides the start time of this activity.
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    
    /**
     * Provides the start time of this activity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime Provides the start time of this activity.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Activity withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Provides the end time of this activity.
     *
     * @return Provides the end time of this activity.
     */
    public java.util.Date getEndTime() {
        return endTime;
    }
    
    /**
     * Provides the end time of this activity.
     *
     * @param endTime Provides the end time of this activity.
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }
    
    /**
     * Provides the end time of this activity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endTime Provides the end time of this activity.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Activity withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Contains the current status of the activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WaitingForSpotInstanceRequestId, WaitingForSpotInstanceId, WaitingForInstanceId, PreInService, InProgress, Successful, Failed, Cancelled
     *
     * @return Contains the current status of the activity.
     *
     * @see ScalingActivityStatusCode
     */
    public String getStatusCode() {
        return statusCode;
    }
    
    /**
     * Contains the current status of the activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WaitingForSpotInstanceRequestId, WaitingForSpotInstanceId, WaitingForInstanceId, PreInService, InProgress, Successful, Failed, Cancelled
     *
     * @param statusCode Contains the current status of the activity.
     *
     * @see ScalingActivityStatusCode
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
    
    /**
     * Contains the current status of the activity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WaitingForSpotInstanceRequestId, WaitingForSpotInstanceId, WaitingForInstanceId, PreInService, InProgress, Successful, Failed, Cancelled
     *
     * @param statusCode Contains the current status of the activity.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ScalingActivityStatusCode
     */
    public Activity withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Contains the current status of the activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WaitingForSpotInstanceRequestId, WaitingForSpotInstanceId, WaitingForInstanceId, PreInService, InProgress, Successful, Failed, Cancelled
     *
     * @param statusCode Contains the current status of the activity.
     *
     * @see ScalingActivityStatusCode
     */
    public void setStatusCode(ScalingActivityStatusCode statusCode) {
        this.statusCode = statusCode.toString();
    }
    
    /**
     * Contains the current status of the activity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WaitingForSpotInstanceRequestId, WaitingForSpotInstanceId, WaitingForInstanceId, PreInService, InProgress, Successful, Failed, Cancelled
     *
     * @param statusCode Contains the current status of the activity.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ScalingActivityStatusCode
     */
    public Activity withStatusCode(ScalingActivityStatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * Contains a friendly, more verbose description of the activity status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Contains a friendly, more verbose description of the activity status.
     */
    public String getStatusMessage() {
        return statusMessage;
    }
    
    /**
     * Contains a friendly, more verbose description of the activity status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param statusMessage Contains a friendly, more verbose description of the activity status.
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
    
    /**
     * Contains a friendly, more verbose description of the activity status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param statusMessage Contains a friendly, more verbose description of the activity status.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Activity withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * Specifies a value between 0 and 100 that indicates the progress of the
     * activity.
     *
     * @return Specifies a value between 0 and 100 that indicates the progress of the
     *         activity.
     */
    public Integer getProgress() {
        return progress;
    }
    
    /**
     * Specifies a value between 0 and 100 that indicates the progress of the
     * activity.
     *
     * @param progress Specifies a value between 0 and 100 that indicates the progress of the
     *         activity.
     */
    public void setProgress(Integer progress) {
        this.progress = progress;
    }
    
    /**
     * Specifies a value between 0 and 100 that indicates the progress of the
     * activity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param progress Specifies a value between 0 and 100 that indicates the progress of the
     *         activity.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Activity withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * Contains details of the scaling activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Contains details of the scaling activity.
     */
    public String getDetails() {
        return details;
    }
    
    /**
     * Contains details of the scaling activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param details Contains details of the scaling activity.
     */
    public void setDetails(String details) {
        this.details = details;
    }
    
    /**
     * Contains details of the scaling activity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param details Contains details of the scaling activity.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Activity withDetails(String details) {
        this.details = details;
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
        if (getActivityId() != null) sb.append("ActivityId: " + getActivityId() + ",");
        if (getAutoScalingGroupName() != null) sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getCause() != null) sb.append("Cause: " + getCause() + ",");
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null) sb.append("EndTime: " + getEndTime() + ",");
        if (getStatusCode() != null) sb.append("StatusCode: " + getStatusCode() + ",");
        if (getStatusMessage() != null) sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getProgress() != null) sb.append("Progress: " + getProgress() + ",");
        if (getDetails() != null) sb.append("Details: " + getDetails() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getActivityId() == null) ? 0 : getActivityId().hashCode()); 
        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getCause() == null) ? 0 : getCause().hashCode()); 
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode()); 
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode()); 
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode()); 
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode()); 
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode()); 
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Activity == false) return false;
        Activity other = (Activity)obj;
        
        if (other.getActivityId() == null ^ this.getActivityId() == null) return false;
        if (other.getActivityId() != null && other.getActivityId().equals(this.getActivityId()) == false) return false; 
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null) return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getCause() == null ^ this.getCause() == null) return false;
        if (other.getCause() != null && other.getCause().equals(this.getCause()) == false) return false; 
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false; 
        if (other.getEndTime() == null ^ this.getEndTime() == null) return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false) return false; 
        if (other.getStatusCode() == null ^ this.getStatusCode() == null) return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false) return false; 
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null) return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false) return false; 
        if (other.getProgress() == null ^ this.getProgress() == null) return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false) return false; 
        if (other.getDetails() == null ^ this.getDetails() == null) return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false) return false; 
        return true;
    }
    
}
    