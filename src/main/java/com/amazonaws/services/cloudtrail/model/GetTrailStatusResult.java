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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;


/**
 * <p>
 * Returns the objects or data listed below if successful. Otherwise, returns an error.
 * </p>
 */
public class GetTrailStatusResult implements Serializable {

    /**
     * Whether the CloudTrail is currently logging AWS API calls.
     */
    private Boolean isLogging;

    /**
     * Information about the most recent error CloudTrail encountered when
     * attempting to deliver log files to the account's Amazon S3 bucket.
     */
    private String latestDeliveryError;

    /**
     * Information about the most recent error CloudTrail encountered when
     * attempting to send an Amazon SNS notification.
     */
    private String latestNotificationError;

    /**
     * The last time CloudTrail attempted to deliver a file to an account's
     * Amazon S3 bucket.
     */
    private String latestDeliveryAttemptTime;

    /**
     * The last time CloudTrail successfully delivered a log file to an
     * account's Amazon S3 bucket.
     */
    private String latestDeliveryAttemptSucceeded;

    /**
     * The last time CloudTrail attempted to notify an account's owner of a
     * log delivery to the account's Amazon S3 bucket.
     */
    private String latestNotificationAttemptTime;

    /**
     * The last time CloudTrail successfully notified an account's owner of a
     * log delivery to the account's Amazon S3 bucket.
     */
    private String latestNotificationAttemptSucceeded;

    /**
     * The time at which CloudTrail started logging AWS API calls for an
     * account.
     */
    private String timeLoggingStarted;

    /**
     * The time at which CloudTrail stopped logging AWS API calls for an
     * account.
     */
    private String timeLoggingStopped;

    /**
     * Whether the CloudTrail is currently logging AWS API calls.
     *
     * @return Whether the CloudTrail is currently logging AWS API calls.
     */
    public Boolean isLogging() {
        return isLogging;
    }
    
    /**
     * Whether the CloudTrail is currently logging AWS API calls.
     *
     * @param isLogging Whether the CloudTrail is currently logging AWS API calls.
     */
    public void setIsLogging(Boolean isLogging) {
        this.isLogging = isLogging;
    }
    
    /**
     * Whether the CloudTrail is currently logging AWS API calls.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isLogging Whether the CloudTrail is currently logging AWS API calls.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetTrailStatusResult withIsLogging(Boolean isLogging) {
        this.isLogging = isLogging;
        return this;
    }

    /**
     * Whether the CloudTrail is currently logging AWS API calls.
     *
     * @return Whether the CloudTrail is currently logging AWS API calls.
     */
    public Boolean getIsLogging() {
        return isLogging;
    }

    /**
     * Information about the most recent error CloudTrail encountered when
     * attempting to deliver log files to the account's Amazon S3 bucket.
     *
     * @return Information about the most recent error CloudTrail encountered when
     *         attempting to deliver log files to the account's Amazon S3 bucket.
     */
    public String getLatestDeliveryError() {
        return latestDeliveryError;
    }
    
    /**
     * Information about the most recent error CloudTrail encountered when
     * attempting to deliver log files to the account's Amazon S3 bucket.
     *
     * @param latestDeliveryError Information about the most recent error CloudTrail encountered when
     *         attempting to deliver log files to the account's Amazon S3 bucket.
     */
    public void setLatestDeliveryError(String latestDeliveryError) {
        this.latestDeliveryError = latestDeliveryError;
    }
    
    /**
     * Information about the most recent error CloudTrail encountered when
     * attempting to deliver log files to the account's Amazon S3 bucket.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param latestDeliveryError Information about the most recent error CloudTrail encountered when
     *         attempting to deliver log files to the account's Amazon S3 bucket.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetTrailStatusResult withLatestDeliveryError(String latestDeliveryError) {
        this.latestDeliveryError = latestDeliveryError;
        return this;
    }

    /**
     * Information about the most recent error CloudTrail encountered when
     * attempting to send an Amazon SNS notification.
     *
     * @return Information about the most recent error CloudTrail encountered when
     *         attempting to send an Amazon SNS notification.
     */
    public String getLatestNotificationError() {
        return latestNotificationError;
    }
    
    /**
     * Information about the most recent error CloudTrail encountered when
     * attempting to send an Amazon SNS notification.
     *
     * @param latestNotificationError Information about the most recent error CloudTrail encountered when
     *         attempting to send an Amazon SNS notification.
     */
    public void setLatestNotificationError(String latestNotificationError) {
        this.latestNotificationError = latestNotificationError;
    }
    
    /**
     * Information about the most recent error CloudTrail encountered when
     * attempting to send an Amazon SNS notification.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param latestNotificationError Information about the most recent error CloudTrail encountered when
     *         attempting to send an Amazon SNS notification.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetTrailStatusResult withLatestNotificationError(String latestNotificationError) {
        this.latestNotificationError = latestNotificationError;
        return this;
    }

    /**
     * The last time CloudTrail attempted to deliver a file to an account's
     * Amazon S3 bucket.
     *
     * @return The last time CloudTrail attempted to deliver a file to an account's
     *         Amazon S3 bucket.
     */
    public String getLatestDeliveryAttemptTime() {
        return latestDeliveryAttemptTime;
    }
    
    /**
     * The last time CloudTrail attempted to deliver a file to an account's
     * Amazon S3 bucket.
     *
     * @param latestDeliveryAttemptTime The last time CloudTrail attempted to deliver a file to an account's
     *         Amazon S3 bucket.
     */
    public void setLatestDeliveryAttemptTime(String latestDeliveryAttemptTime) {
        this.latestDeliveryAttemptTime = latestDeliveryAttemptTime;
    }
    
    /**
     * The last time CloudTrail attempted to deliver a file to an account's
     * Amazon S3 bucket.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param latestDeliveryAttemptTime The last time CloudTrail attempted to deliver a file to an account's
     *         Amazon S3 bucket.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetTrailStatusResult withLatestDeliveryAttemptTime(String latestDeliveryAttemptTime) {
        this.latestDeliveryAttemptTime = latestDeliveryAttemptTime;
        return this;
    }

    /**
     * The last time CloudTrail successfully delivered a log file to an
     * account's Amazon S3 bucket.
     *
     * @return The last time CloudTrail successfully delivered a log file to an
     *         account's Amazon S3 bucket.
     */
    public String getLatestDeliveryAttemptSucceeded() {
        return latestDeliveryAttemptSucceeded;
    }
    
    /**
     * The last time CloudTrail successfully delivered a log file to an
     * account's Amazon S3 bucket.
     *
     * @param latestDeliveryAttemptSucceeded The last time CloudTrail successfully delivered a log file to an
     *         account's Amazon S3 bucket.
     */
    public void setLatestDeliveryAttemptSucceeded(String latestDeliveryAttemptSucceeded) {
        this.latestDeliveryAttemptSucceeded = latestDeliveryAttemptSucceeded;
    }
    
    /**
     * The last time CloudTrail successfully delivered a log file to an
     * account's Amazon S3 bucket.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param latestDeliveryAttemptSucceeded The last time CloudTrail successfully delivered a log file to an
     *         account's Amazon S3 bucket.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetTrailStatusResult withLatestDeliveryAttemptSucceeded(String latestDeliveryAttemptSucceeded) {
        this.latestDeliveryAttemptSucceeded = latestDeliveryAttemptSucceeded;
        return this;
    }

    /**
     * The last time CloudTrail attempted to notify an account's owner of a
     * log delivery to the account's Amazon S3 bucket.
     *
     * @return The last time CloudTrail attempted to notify an account's owner of a
     *         log delivery to the account's Amazon S3 bucket.
     */
    public String getLatestNotificationAttemptTime() {
        return latestNotificationAttemptTime;
    }
    
    /**
     * The last time CloudTrail attempted to notify an account's owner of a
     * log delivery to the account's Amazon S3 bucket.
     *
     * @param latestNotificationAttemptTime The last time CloudTrail attempted to notify an account's owner of a
     *         log delivery to the account's Amazon S3 bucket.
     */
    public void setLatestNotificationAttemptTime(String latestNotificationAttemptTime) {
        this.latestNotificationAttemptTime = latestNotificationAttemptTime;
    }
    
    /**
     * The last time CloudTrail attempted to notify an account's owner of a
     * log delivery to the account's Amazon S3 bucket.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param latestNotificationAttemptTime The last time CloudTrail attempted to notify an account's owner of a
     *         log delivery to the account's Amazon S3 bucket.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetTrailStatusResult withLatestNotificationAttemptTime(String latestNotificationAttemptTime) {
        this.latestNotificationAttemptTime = latestNotificationAttemptTime;
        return this;
    }

    /**
     * The last time CloudTrail successfully notified an account's owner of a
     * log delivery to the account's Amazon S3 bucket.
     *
     * @return The last time CloudTrail successfully notified an account's owner of a
     *         log delivery to the account's Amazon S3 bucket.
     */
    public String getLatestNotificationAttemptSucceeded() {
        return latestNotificationAttemptSucceeded;
    }
    
    /**
     * The last time CloudTrail successfully notified an account's owner of a
     * log delivery to the account's Amazon S3 bucket.
     *
     * @param latestNotificationAttemptSucceeded The last time CloudTrail successfully notified an account's owner of a
     *         log delivery to the account's Amazon S3 bucket.
     */
    public void setLatestNotificationAttemptSucceeded(String latestNotificationAttemptSucceeded) {
        this.latestNotificationAttemptSucceeded = latestNotificationAttemptSucceeded;
    }
    
    /**
     * The last time CloudTrail successfully notified an account's owner of a
     * log delivery to the account's Amazon S3 bucket.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param latestNotificationAttemptSucceeded The last time CloudTrail successfully notified an account's owner of a
     *         log delivery to the account's Amazon S3 bucket.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetTrailStatusResult withLatestNotificationAttemptSucceeded(String latestNotificationAttemptSucceeded) {
        this.latestNotificationAttemptSucceeded = latestNotificationAttemptSucceeded;
        return this;
    }

    /**
     * The time at which CloudTrail started logging AWS API calls for an
     * account.
     *
     * @return The time at which CloudTrail started logging AWS API calls for an
     *         account.
     */
    public String getTimeLoggingStarted() {
        return timeLoggingStarted;
    }
    
    /**
     * The time at which CloudTrail started logging AWS API calls for an
     * account.
     *
     * @param timeLoggingStarted The time at which CloudTrail started logging AWS API calls for an
     *         account.
     */
    public void setTimeLoggingStarted(String timeLoggingStarted) {
        this.timeLoggingStarted = timeLoggingStarted;
    }
    
    /**
     * The time at which CloudTrail started logging AWS API calls for an
     * account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timeLoggingStarted The time at which CloudTrail started logging AWS API calls for an
     *         account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetTrailStatusResult withTimeLoggingStarted(String timeLoggingStarted) {
        this.timeLoggingStarted = timeLoggingStarted;
        return this;
    }

    /**
     * The time at which CloudTrail stopped logging AWS API calls for an
     * account.
     *
     * @return The time at which CloudTrail stopped logging AWS API calls for an
     *         account.
     */
    public String getTimeLoggingStopped() {
        return timeLoggingStopped;
    }
    
    /**
     * The time at which CloudTrail stopped logging AWS API calls for an
     * account.
     *
     * @param timeLoggingStopped The time at which CloudTrail stopped logging AWS API calls for an
     *         account.
     */
    public void setTimeLoggingStopped(String timeLoggingStopped) {
        this.timeLoggingStopped = timeLoggingStopped;
    }
    
    /**
     * The time at which CloudTrail stopped logging AWS API calls for an
     * account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timeLoggingStopped The time at which CloudTrail stopped logging AWS API calls for an
     *         account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetTrailStatusResult withTimeLoggingStopped(String timeLoggingStopped) {
        this.timeLoggingStopped = timeLoggingStopped;
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
        if (isLogging() != null) sb.append("IsLogging: " + isLogging() + ",");
        if (getLatestDeliveryError() != null) sb.append("LatestDeliveryError: " + getLatestDeliveryError() + ",");
        if (getLatestNotificationError() != null) sb.append("LatestNotificationError: " + getLatestNotificationError() + ",");
        if (getLatestDeliveryAttemptTime() != null) sb.append("LatestDeliveryAttemptTime: " + getLatestDeliveryAttemptTime() + ",");
        if (getLatestDeliveryAttemptSucceeded() != null) sb.append("LatestDeliveryAttemptSucceeded: " + getLatestDeliveryAttemptSucceeded() + ",");
        if (getLatestNotificationAttemptTime() != null) sb.append("LatestNotificationAttemptTime: " + getLatestNotificationAttemptTime() + ",");
        if (getLatestNotificationAttemptSucceeded() != null) sb.append("LatestNotificationAttemptSucceeded: " + getLatestNotificationAttemptSucceeded() + ",");
        if (getTimeLoggingStarted() != null) sb.append("TimeLoggingStarted: " + getTimeLoggingStarted() + ",");
        if (getTimeLoggingStopped() != null) sb.append("TimeLoggingStopped: " + getTimeLoggingStopped() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((isLogging() == null) ? 0 : isLogging().hashCode()); 
        hashCode = prime * hashCode + ((getLatestDeliveryError() == null) ? 0 : getLatestDeliveryError().hashCode()); 
        hashCode = prime * hashCode + ((getLatestNotificationError() == null) ? 0 : getLatestNotificationError().hashCode()); 
        hashCode = prime * hashCode + ((getLatestDeliveryAttemptTime() == null) ? 0 : getLatestDeliveryAttemptTime().hashCode()); 
        hashCode = prime * hashCode + ((getLatestDeliveryAttemptSucceeded() == null) ? 0 : getLatestDeliveryAttemptSucceeded().hashCode()); 
        hashCode = prime * hashCode + ((getLatestNotificationAttemptTime() == null) ? 0 : getLatestNotificationAttemptTime().hashCode()); 
        hashCode = prime * hashCode + ((getLatestNotificationAttemptSucceeded() == null) ? 0 : getLatestNotificationAttemptSucceeded().hashCode()); 
        hashCode = prime * hashCode + ((getTimeLoggingStarted() == null) ? 0 : getTimeLoggingStarted().hashCode()); 
        hashCode = prime * hashCode + ((getTimeLoggingStopped() == null) ? 0 : getTimeLoggingStopped().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetTrailStatusResult == false) return false;
        GetTrailStatusResult other = (GetTrailStatusResult)obj;
        
        if (other.isLogging() == null ^ this.isLogging() == null) return false;
        if (other.isLogging() != null && other.isLogging().equals(this.isLogging()) == false) return false; 
        if (other.getLatestDeliveryError() == null ^ this.getLatestDeliveryError() == null) return false;
        if (other.getLatestDeliveryError() != null && other.getLatestDeliveryError().equals(this.getLatestDeliveryError()) == false) return false; 
        if (other.getLatestNotificationError() == null ^ this.getLatestNotificationError() == null) return false;
        if (other.getLatestNotificationError() != null && other.getLatestNotificationError().equals(this.getLatestNotificationError()) == false) return false; 
        if (other.getLatestDeliveryAttemptTime() == null ^ this.getLatestDeliveryAttemptTime() == null) return false;
        if (other.getLatestDeliveryAttemptTime() != null && other.getLatestDeliveryAttemptTime().equals(this.getLatestDeliveryAttemptTime()) == false) return false; 
        if (other.getLatestDeliveryAttemptSucceeded() == null ^ this.getLatestDeliveryAttemptSucceeded() == null) return false;
        if (other.getLatestDeliveryAttemptSucceeded() != null && other.getLatestDeliveryAttemptSucceeded().equals(this.getLatestDeliveryAttemptSucceeded()) == false) return false; 
        if (other.getLatestNotificationAttemptTime() == null ^ this.getLatestNotificationAttemptTime() == null) return false;
        if (other.getLatestNotificationAttemptTime() != null && other.getLatestNotificationAttemptTime().equals(this.getLatestNotificationAttemptTime()) == false) return false; 
        if (other.getLatestNotificationAttemptSucceeded() == null ^ this.getLatestNotificationAttemptSucceeded() == null) return false;
        if (other.getLatestNotificationAttemptSucceeded() != null && other.getLatestNotificationAttemptSucceeded().equals(this.getLatestNotificationAttemptSucceeded()) == false) return false; 
        if (other.getTimeLoggingStarted() == null ^ this.getTimeLoggingStarted() == null) return false;
        if (other.getTimeLoggingStarted() != null && other.getTimeLoggingStarted().equals(this.getTimeLoggingStarted()) == false) return false; 
        if (other.getTimeLoggingStopped() == null ^ this.getTimeLoggingStopped() == null) return false;
        if (other.getTimeLoggingStopped() != null && other.getTimeLoggingStopped().equals(this.getTimeLoggingStopped()) == false) return false; 
        return true;
    }
    
}
    