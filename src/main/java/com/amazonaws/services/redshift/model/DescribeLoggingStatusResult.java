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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;


/**
 * <p>
 * Describes the status of logging for a cluster.
 * </p>
 */
public class DescribeLoggingStatusResult implements Serializable {

    /**
     * <code>true</code> if logging is on, <code>false</code> if logging is
     * off.
     */
    private Boolean loggingEnabled;

    /**
     * The name of the S3 bucket where the log files are stored.
     */
    private String bucketName;

    /**
     * The prefix applied to the log file names.
     */
    private String s3KeyPrefix;

    /**
     * The last time when logs were delivered.
     */
    private java.util.Date lastSuccessfulDeliveryTime;

    /**
     * The last time when logs failed to be delivered.
     */
    private java.util.Date lastFailureTime;

    /**
     * The message indicating that logs failed to be delivered.
     */
    private String lastFailureMessage;

    /**
     * <code>true</code> if logging is on, <code>false</code> if logging is
     * off.
     *
     * @return <code>true</code> if logging is on, <code>false</code> if logging is
     *         off.
     */
    public Boolean isLoggingEnabled() {
        return loggingEnabled;
    }
    
    /**
     * <code>true</code> if logging is on, <code>false</code> if logging is
     * off.
     *
     * @param loggingEnabled <code>true</code> if logging is on, <code>false</code> if logging is
     *         off.
     */
    public void setLoggingEnabled(Boolean loggingEnabled) {
        this.loggingEnabled = loggingEnabled;
    }
    
    /**
     * <code>true</code> if logging is on, <code>false</code> if logging is
     * off.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loggingEnabled <code>true</code> if logging is on, <code>false</code> if logging is
     *         off.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeLoggingStatusResult withLoggingEnabled(Boolean loggingEnabled) {
        this.loggingEnabled = loggingEnabled;
        return this;
    }

    /**
     * <code>true</code> if logging is on, <code>false</code> if logging is
     * off.
     *
     * @return <code>true</code> if logging is on, <code>false</code> if logging is
     *         off.
     */
    public Boolean getLoggingEnabled() {
        return loggingEnabled;
    }

    /**
     * The name of the S3 bucket where the log files are stored.
     *
     * @return The name of the S3 bucket where the log files are stored.
     */
    public String getBucketName() {
        return bucketName;
    }
    
    /**
     * The name of the S3 bucket where the log files are stored.
     *
     * @param bucketName The name of the S3 bucket where the log files are stored.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }
    
    /**
     * The name of the S3 bucket where the log files are stored.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bucketName The name of the S3 bucket where the log files are stored.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeLoggingStatusResult withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * The prefix applied to the log file names.
     *
     * @return The prefix applied to the log file names.
     */
    public String getS3KeyPrefix() {
        return s3KeyPrefix;
    }
    
    /**
     * The prefix applied to the log file names.
     *
     * @param s3KeyPrefix The prefix applied to the log file names.
     */
    public void setS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }
    
    /**
     * The prefix applied to the log file names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3KeyPrefix The prefix applied to the log file names.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeLoggingStatusResult withS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
        return this;
    }

    /**
     * The last time when logs were delivered.
     *
     * @return The last time when logs were delivered.
     */
    public java.util.Date getLastSuccessfulDeliveryTime() {
        return lastSuccessfulDeliveryTime;
    }
    
    /**
     * The last time when logs were delivered.
     *
     * @param lastSuccessfulDeliveryTime The last time when logs were delivered.
     */
    public void setLastSuccessfulDeliveryTime(java.util.Date lastSuccessfulDeliveryTime) {
        this.lastSuccessfulDeliveryTime = lastSuccessfulDeliveryTime;
    }
    
    /**
     * The last time when logs were delivered.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastSuccessfulDeliveryTime The last time when logs were delivered.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeLoggingStatusResult withLastSuccessfulDeliveryTime(java.util.Date lastSuccessfulDeliveryTime) {
        this.lastSuccessfulDeliveryTime = lastSuccessfulDeliveryTime;
        return this;
    }

    /**
     * The last time when logs failed to be delivered.
     *
     * @return The last time when logs failed to be delivered.
     */
    public java.util.Date getLastFailureTime() {
        return lastFailureTime;
    }
    
    /**
     * The last time when logs failed to be delivered.
     *
     * @param lastFailureTime The last time when logs failed to be delivered.
     */
    public void setLastFailureTime(java.util.Date lastFailureTime) {
        this.lastFailureTime = lastFailureTime;
    }
    
    /**
     * The last time when logs failed to be delivered.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastFailureTime The last time when logs failed to be delivered.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeLoggingStatusResult withLastFailureTime(java.util.Date lastFailureTime) {
        this.lastFailureTime = lastFailureTime;
        return this;
    }

    /**
     * The message indicating that logs failed to be delivered.
     *
     * @return The message indicating that logs failed to be delivered.
     */
    public String getLastFailureMessage() {
        return lastFailureMessage;
    }
    
    /**
     * The message indicating that logs failed to be delivered.
     *
     * @param lastFailureMessage The message indicating that logs failed to be delivered.
     */
    public void setLastFailureMessage(String lastFailureMessage) {
        this.lastFailureMessage = lastFailureMessage;
    }
    
    /**
     * The message indicating that logs failed to be delivered.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastFailureMessage The message indicating that logs failed to be delivered.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeLoggingStatusResult withLastFailureMessage(String lastFailureMessage) {
        this.lastFailureMessage = lastFailureMessage;
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
        if (isLoggingEnabled() != null) sb.append("LoggingEnabled: " + isLoggingEnabled() + ",");
        if (getBucketName() != null) sb.append("BucketName: " + getBucketName() + ",");
        if (getS3KeyPrefix() != null) sb.append("S3KeyPrefix: " + getS3KeyPrefix() + ",");
        if (getLastSuccessfulDeliveryTime() != null) sb.append("LastSuccessfulDeliveryTime: " + getLastSuccessfulDeliveryTime() + ",");
        if (getLastFailureTime() != null) sb.append("LastFailureTime: " + getLastFailureTime() + ",");
        if (getLastFailureMessage() != null) sb.append("LastFailureMessage: " + getLastFailureMessage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((isLoggingEnabled() == null) ? 0 : isLoggingEnabled().hashCode()); 
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode()); 
        hashCode = prime * hashCode + ((getS3KeyPrefix() == null) ? 0 : getS3KeyPrefix().hashCode()); 
        hashCode = prime * hashCode + ((getLastSuccessfulDeliveryTime() == null) ? 0 : getLastSuccessfulDeliveryTime().hashCode()); 
        hashCode = prime * hashCode + ((getLastFailureTime() == null) ? 0 : getLastFailureTime().hashCode()); 
        hashCode = prime * hashCode + ((getLastFailureMessage() == null) ? 0 : getLastFailureMessage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeLoggingStatusResult == false) return false;
        DescribeLoggingStatusResult other = (DescribeLoggingStatusResult)obj;
        
        if (other.isLoggingEnabled() == null ^ this.isLoggingEnabled() == null) return false;
        if (other.isLoggingEnabled() != null && other.isLoggingEnabled().equals(this.isLoggingEnabled()) == false) return false; 
        if (other.getBucketName() == null ^ this.getBucketName() == null) return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false) return false; 
        if (other.getS3KeyPrefix() == null ^ this.getS3KeyPrefix() == null) return false;
        if (other.getS3KeyPrefix() != null && other.getS3KeyPrefix().equals(this.getS3KeyPrefix()) == false) return false; 
        if (other.getLastSuccessfulDeliveryTime() == null ^ this.getLastSuccessfulDeliveryTime() == null) return false;
        if (other.getLastSuccessfulDeliveryTime() != null && other.getLastSuccessfulDeliveryTime().equals(this.getLastSuccessfulDeliveryTime()) == false) return false; 
        if (other.getLastFailureTime() == null ^ this.getLastFailureTime() == null) return false;
        if (other.getLastFailureTime() != null && other.getLastFailureTime().equals(this.getLastFailureTime()) == false) return false; 
        if (other.getLastFailureMessage() == null ^ this.getLastFailureMessage() == null) return false;
        if (other.getLastFailureMessage() != null && other.getLastFailureMessage().equals(this.getLastFailureMessage()) == false) return false; 
        return true;
    }
    
}
    