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
 * The Activity data type.
 * </p>
 */
public class Activity {

    /**
     * Specifies the ID of the activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String activityId;

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
     * <b>Length: </b>1 - 255<br/>
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
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String statusCode;

    /**
     * Contains a friendly, more verbose description of the activity status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String statusMessage;

    /**
     * Specifies a value between 0 and 100 that indicates the progress of the
     * activity.
     */
    private Integer progress;

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
     * <b>Length: </b>1 - 255<br/>
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
     * <b>Length: </b>1 - 255<br/>
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
     * <b>Length: </b>1 - 255<br/>
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
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Contains the current status of the activity.
     */
    public String getStatusCode() {
        return statusCode;
    }
    
    /**
     * Contains the current status of the activity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param statusCode Contains the current status of the activity.
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
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param statusCode Contains the current status of the activity.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Activity withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    /**
     * Contains a friendly, more verbose description of the activity status.
     * <p>
     * <b>Constraints:</b><br/>
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
        sb.append("ActivityId: " + activityId + ", ");
        sb.append("Description: " + description + ", ");
        sb.append("Cause: " + cause + ", ");
        sb.append("StartTime: " + startTime + ", ");
        sb.append("EndTime: " + endTime + ", ");
        sb.append("StatusCode: " + statusCode + ", ");
        sb.append("StatusMessage: " + statusMessage + ", ");
        sb.append("Progress: " + progress + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    