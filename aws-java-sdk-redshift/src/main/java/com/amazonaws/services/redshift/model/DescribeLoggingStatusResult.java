/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the status of logging for a cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeLoggingStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLoggingStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * <code>true</code> if logging is on, <code>false</code> if logging is off.
     * </p>
     */
    private Boolean loggingEnabled;
    /**
     * <p>
     * The name of the S3 bucket where the log files are stored.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * The prefix applied to the log file names.
     * </p>
     */
    private String s3KeyPrefix;
    /**
     * <p>
     * The last time that logs were delivered.
     * </p>
     */
    private java.util.Date lastSuccessfulDeliveryTime;
    /**
     * <p>
     * The last time when logs failed to be delivered.
     * </p>
     */
    private java.util.Date lastFailureTime;
    /**
     * <p>
     * The message indicating that logs failed to be delivered.
     * </p>
     */
    private String lastFailureMessage;

    /**
     * <p>
     * <code>true</code> if logging is on, <code>false</code> if logging is off.
     * </p>
     * 
     * @param loggingEnabled
     *        <code>true</code> if logging is on, <code>false</code> if logging is off.
     */

    public void setLoggingEnabled(Boolean loggingEnabled) {
        this.loggingEnabled = loggingEnabled;
    }

    /**
     * <p>
     * <code>true</code> if logging is on, <code>false</code> if logging is off.
     * </p>
     * 
     * @return <code>true</code> if logging is on, <code>false</code> if logging is off.
     */

    public Boolean getLoggingEnabled() {
        return this.loggingEnabled;
    }

    /**
     * <p>
     * <code>true</code> if logging is on, <code>false</code> if logging is off.
     * </p>
     * 
     * @param loggingEnabled
     *        <code>true</code> if logging is on, <code>false</code> if logging is off.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLoggingStatusResult withLoggingEnabled(Boolean loggingEnabled) {
        setLoggingEnabled(loggingEnabled);
        return this;
    }

    /**
     * <p>
     * <code>true</code> if logging is on, <code>false</code> if logging is off.
     * </p>
     * 
     * @return <code>true</code> if logging is on, <code>false</code> if logging is off.
     */

    public Boolean isLoggingEnabled() {
        return this.loggingEnabled;
    }

    /**
     * <p>
     * The name of the S3 bucket where the log files are stored.
     * </p>
     * 
     * @param bucketName
     *        The name of the S3 bucket where the log files are stored.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket where the log files are stored.
     * </p>
     * 
     * @return The name of the S3 bucket where the log files are stored.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket where the log files are stored.
     * </p>
     * 
     * @param bucketName
     *        The name of the S3 bucket where the log files are stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLoggingStatusResult withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * The prefix applied to the log file names.
     * </p>
     * 
     * @param s3KeyPrefix
     *        The prefix applied to the log file names.
     */

    public void setS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }

    /**
     * <p>
     * The prefix applied to the log file names.
     * </p>
     * 
     * @return The prefix applied to the log file names.
     */

    public String getS3KeyPrefix() {
        return this.s3KeyPrefix;
    }

    /**
     * <p>
     * The prefix applied to the log file names.
     * </p>
     * 
     * @param s3KeyPrefix
     *        The prefix applied to the log file names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLoggingStatusResult withS3KeyPrefix(String s3KeyPrefix) {
        setS3KeyPrefix(s3KeyPrefix);
        return this;
    }

    /**
     * <p>
     * The last time that logs were delivered.
     * </p>
     * 
     * @param lastSuccessfulDeliveryTime
     *        The last time that logs were delivered.
     */

    public void setLastSuccessfulDeliveryTime(java.util.Date lastSuccessfulDeliveryTime) {
        this.lastSuccessfulDeliveryTime = lastSuccessfulDeliveryTime;
    }

    /**
     * <p>
     * The last time that logs were delivered.
     * </p>
     * 
     * @return The last time that logs were delivered.
     */

    public java.util.Date getLastSuccessfulDeliveryTime() {
        return this.lastSuccessfulDeliveryTime;
    }

    /**
     * <p>
     * The last time that logs were delivered.
     * </p>
     * 
     * @param lastSuccessfulDeliveryTime
     *        The last time that logs were delivered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLoggingStatusResult withLastSuccessfulDeliveryTime(java.util.Date lastSuccessfulDeliveryTime) {
        setLastSuccessfulDeliveryTime(lastSuccessfulDeliveryTime);
        return this;
    }

    /**
     * <p>
     * The last time when logs failed to be delivered.
     * </p>
     * 
     * @param lastFailureTime
     *        The last time when logs failed to be delivered.
     */

    public void setLastFailureTime(java.util.Date lastFailureTime) {
        this.lastFailureTime = lastFailureTime;
    }

    /**
     * <p>
     * The last time when logs failed to be delivered.
     * </p>
     * 
     * @return The last time when logs failed to be delivered.
     */

    public java.util.Date getLastFailureTime() {
        return this.lastFailureTime;
    }

    /**
     * <p>
     * The last time when logs failed to be delivered.
     * </p>
     * 
     * @param lastFailureTime
     *        The last time when logs failed to be delivered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLoggingStatusResult withLastFailureTime(java.util.Date lastFailureTime) {
        setLastFailureTime(lastFailureTime);
        return this;
    }

    /**
     * <p>
     * The message indicating that logs failed to be delivered.
     * </p>
     * 
     * @param lastFailureMessage
     *        The message indicating that logs failed to be delivered.
     */

    public void setLastFailureMessage(String lastFailureMessage) {
        this.lastFailureMessage = lastFailureMessage;
    }

    /**
     * <p>
     * The message indicating that logs failed to be delivered.
     * </p>
     * 
     * @return The message indicating that logs failed to be delivered.
     */

    public String getLastFailureMessage() {
        return this.lastFailureMessage;
    }

    /**
     * <p>
     * The message indicating that logs failed to be delivered.
     * </p>
     * 
     * @param lastFailureMessage
     *        The message indicating that logs failed to be delivered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLoggingStatusResult withLastFailureMessage(String lastFailureMessage) {
        setLastFailureMessage(lastFailureMessage);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLoggingEnabled() != null)
            sb.append("LoggingEnabled: ").append(getLoggingEnabled()).append(",");
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getS3KeyPrefix() != null)
            sb.append("S3KeyPrefix: ").append(getS3KeyPrefix()).append(",");
        if (getLastSuccessfulDeliveryTime() != null)
            sb.append("LastSuccessfulDeliveryTime: ").append(getLastSuccessfulDeliveryTime()).append(",");
        if (getLastFailureTime() != null)
            sb.append("LastFailureTime: ").append(getLastFailureTime()).append(",");
        if (getLastFailureMessage() != null)
            sb.append("LastFailureMessage: ").append(getLastFailureMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLoggingStatusResult == false)
            return false;
        DescribeLoggingStatusResult other = (DescribeLoggingStatusResult) obj;
        if (other.getLoggingEnabled() == null ^ this.getLoggingEnabled() == null)
            return false;
        if (other.getLoggingEnabled() != null && other.getLoggingEnabled().equals(this.getLoggingEnabled()) == false)
            return false;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getS3KeyPrefix() == null ^ this.getS3KeyPrefix() == null)
            return false;
        if (other.getS3KeyPrefix() != null && other.getS3KeyPrefix().equals(this.getS3KeyPrefix()) == false)
            return false;
        if (other.getLastSuccessfulDeliveryTime() == null ^ this.getLastSuccessfulDeliveryTime() == null)
            return false;
        if (other.getLastSuccessfulDeliveryTime() != null && other.getLastSuccessfulDeliveryTime().equals(this.getLastSuccessfulDeliveryTime()) == false)
            return false;
        if (other.getLastFailureTime() == null ^ this.getLastFailureTime() == null)
            return false;
        if (other.getLastFailureTime() != null && other.getLastFailureTime().equals(this.getLastFailureTime()) == false)
            return false;
        if (other.getLastFailureMessage() == null ^ this.getLastFailureMessage() == null)
            return false;
        if (other.getLastFailureMessage() != null && other.getLastFailureMessage().equals(this.getLastFailureMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoggingEnabled() == null) ? 0 : getLoggingEnabled().hashCode());
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getS3KeyPrefix() == null) ? 0 : getS3KeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getLastSuccessfulDeliveryTime() == null) ? 0 : getLastSuccessfulDeliveryTime().hashCode());
        hashCode = prime * hashCode + ((getLastFailureTime() == null) ? 0 : getLastFailureTime().hashCode());
        hashCode = prime * hashCode + ((getLastFailureMessage() == null) ? 0 : getLastFailureMessage().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLoggingStatusResult clone() {
        try {
            return (DescribeLoggingStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
