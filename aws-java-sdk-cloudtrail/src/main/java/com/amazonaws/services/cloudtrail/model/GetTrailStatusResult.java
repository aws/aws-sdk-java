/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Returns the objects or data listed below if successful. Otherwise,
 * returns an error.
 * </p>
 */
public class GetTrailStatusResult implements Serializable, Cloneable {

    /**
     * Whether the CloudTrail is currently logging AWS API calls.
     */
    private Boolean isLogging;

    /**
     * Displays any Amazon S3 error that CloudTrail encountered when
     * attempting to deliver log files to the designated bucket. For more
     * information see the topic <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html">Error
     * Responses</a> in the Amazon S3 API Reference. <note>This error occurs
     * only when there is a problem with the destination S3 bucket and will
     * not occur for timeouts. To resolve the issue, create a new bucket and
     * call <code>UpdateTrail</code> to specify the new bucket, or fix the
     * existing objects so that CloudTrail can again write to the bucket.
     * </note>
     */
    private String latestDeliveryError;

    /**
     * Displays any Amazon SNS error that CloudTrail encountered when
     * attempting to send a notification. For more information about Amazon
     * SNS errors, see the <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/welcome.html">Amazon
     * SNS Developer Guide</a>.
     */
    private String latestNotificationError;

    /**
     * Specifies the date and time that CloudTrail last delivered log files
     * to an account's Amazon S3 bucket.
     */
    private java.util.Date latestDeliveryTime;

    /**
     * Specifies the date and time of the most recent Amazon SNS notification
     * that CloudTrail has written a new log file to an account's Amazon S3
     * bucket.
     */
    private java.util.Date latestNotificationTime;

    /**
     * Specifies the most recent date and time when CloudTrail started
     * recording API calls for an AWS account.
     */
    private java.util.Date startLoggingTime;

    /**
     * Specifies the most recent date and time when CloudTrail stopped
     * recording API calls for an AWS account.
     */
    private java.util.Date stopLoggingTime;

    /**
     * Displays any CloudWatch Logs error that CloudTrail encountered when
     * attempting to deliver logs to CloudWatch Logs.
     */
    private String latestCloudWatchLogsDeliveryError;

    /**
     * Displays the most recent date and time when CloudTrail delivered logs
     * to CloudWatch Logs.
     */
    private java.util.Date latestCloudWatchLogsDeliveryTime;

    /**
     * Specifies the date and time that CloudTrail last delivered a digest
     * file to an account's Amazon S3 bucket.
     */
    private java.util.Date latestDigestDeliveryTime;

    /**
     * Displays any Amazon S3 error that CloudTrail encountered when
     * attempting to deliver a digest file to the designated bucket. For more
     * information see the topic <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html">Error
     * Responses</a> in the Amazon S3 API Reference. <note>This error occurs
     * only when there is a problem with the destination S3 bucket and will
     * not occur for timeouts. To resolve the issue, create a new bucket and
     * call <code>UpdateTrail</code> to specify the new bucket, or fix the
     * existing objects so that CloudTrail can again write to the bucket.
     * </note>
     */
    private String latestDigestDeliveryError;

    /**
     * This field is deprecated.
     */
    private String latestDeliveryAttemptTime;

    /**
     * This field is deprecated.
     */
    private String latestNotificationAttemptTime;

    /**
     * This field is deprecated.
     */
    private String latestNotificationAttemptSucceeded;

    /**
     * This field is deprecated.
     */
    private String latestDeliveryAttemptSucceeded;

    /**
     * This field is deprecated.
     */
    private String timeLoggingStarted;

    /**
     * This field is deprecated.
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
     * Displays any Amazon S3 error that CloudTrail encountered when
     * attempting to deliver log files to the designated bucket. For more
     * information see the topic <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html">Error
     * Responses</a> in the Amazon S3 API Reference. <note>This error occurs
     * only when there is a problem with the destination S3 bucket and will
     * not occur for timeouts. To resolve the issue, create a new bucket and
     * call <code>UpdateTrail</code> to specify the new bucket, or fix the
     * existing objects so that CloudTrail can again write to the bucket.
     * </note>
     *
     * @return Displays any Amazon S3 error that CloudTrail encountered when
     *         attempting to deliver log files to the designated bucket. For more
     *         information see the topic <a
     *         href="http://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html">Error
     *         Responses</a> in the Amazon S3 API Reference. <note>This error occurs
     *         only when there is a problem with the destination S3 bucket and will
     *         not occur for timeouts. To resolve the issue, create a new bucket and
     *         call <code>UpdateTrail</code> to specify the new bucket, or fix the
     *         existing objects so that CloudTrail can again write to the bucket.
     *         </note>
     */
    public String getLatestDeliveryError() {
        return latestDeliveryError;
    }
    
    /**
     * Displays any Amazon S3 error that CloudTrail encountered when
     * attempting to deliver log files to the designated bucket. For more
     * information see the topic <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html">Error
     * Responses</a> in the Amazon S3 API Reference. <note>This error occurs
     * only when there is a problem with the destination S3 bucket and will
     * not occur for timeouts. To resolve the issue, create a new bucket and
     * call <code>UpdateTrail</code> to specify the new bucket, or fix the
     * existing objects so that CloudTrail can again write to the bucket.
     * </note>
     *
     * @param latestDeliveryError Displays any Amazon S3 error that CloudTrail encountered when
     *         attempting to deliver log files to the designated bucket. For more
     *         information see the topic <a
     *         href="http://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html">Error
     *         Responses</a> in the Amazon S3 API Reference. <note>This error occurs
     *         only when there is a problem with the destination S3 bucket and will
     *         not occur for timeouts. To resolve the issue, create a new bucket and
     *         call <code>UpdateTrail</code> to specify the new bucket, or fix the
     *         existing objects so that CloudTrail can again write to the bucket.
     *         </note>
     */
    public void setLatestDeliveryError(String latestDeliveryError) {
        this.latestDeliveryError = latestDeliveryError;
    }
    
    /**
     * Displays any Amazon S3 error that CloudTrail encountered when
     * attempting to deliver log files to the designated bucket. For more
     * information see the topic <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html">Error
     * Responses</a> in the Amazon S3 API Reference. <note>This error occurs
     * only when there is a problem with the destination S3 bucket and will
     * not occur for timeouts. To resolve the issue, create a new bucket and
     * call <code>UpdateTrail</code> to specify the new bucket, or fix the
     * existing objects so that CloudTrail can again write to the bucket.
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param latestDeliveryError Displays any Amazon S3 error that CloudTrail encountered when
     *         attempting to deliver log files to the designated bucket. For more
     *         information see the topic <a
     *         href="http://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html">Error
     *         Responses</a> in the Amazon S3 API Reference. <note>This error occurs
     *         only when there is a problem with the destination S3 bucket and will
     *         not occur for timeouts. To resolve the issue, create a new bucket and
     *         call <code>UpdateTrail</code> to specify the new bucket, or fix the
     *         existing objects so that CloudTrail can again write to the bucket.
     *         </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTrailStatusResult withLatestDeliveryError(String latestDeliveryError) {
        this.latestDeliveryError = latestDeliveryError;
        return this;
    }

    /**
     * Displays any Amazon SNS error that CloudTrail encountered when
     * attempting to send a notification. For more information about Amazon
     * SNS errors, see the <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/welcome.html">Amazon
     * SNS Developer Guide</a>.
     *
     * @return Displays any Amazon SNS error that CloudTrail encountered when
     *         attempting to send a notification. For more information about Amazon
     *         SNS errors, see the <a
     *         href="http://docs.aws.amazon.com/sns/latest/dg/welcome.html">Amazon
     *         SNS Developer Guide</a>.
     */
    public String getLatestNotificationError() {
        return latestNotificationError;
    }
    
    /**
     * Displays any Amazon SNS error that CloudTrail encountered when
     * attempting to send a notification. For more information about Amazon
     * SNS errors, see the <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/welcome.html">Amazon
     * SNS Developer Guide</a>.
     *
     * @param latestNotificationError Displays any Amazon SNS error that CloudTrail encountered when
     *         attempting to send a notification. For more information about Amazon
     *         SNS errors, see the <a
     *         href="http://docs.aws.amazon.com/sns/latest/dg/welcome.html">Amazon
     *         SNS Developer Guide</a>.
     */
    public void setLatestNotificationError(String latestNotificationError) {
        this.latestNotificationError = latestNotificationError;
    }
    
    /**
     * Displays any Amazon SNS error that CloudTrail encountered when
     * attempting to send a notification. For more information about Amazon
     * SNS errors, see the <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/welcome.html">Amazon
     * SNS Developer Guide</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param latestNotificationError Displays any Amazon SNS error that CloudTrail encountered when
     *         attempting to send a notification. For more information about Amazon
     *         SNS errors, see the <a
     *         href="http://docs.aws.amazon.com/sns/latest/dg/welcome.html">Amazon
     *         SNS Developer Guide</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTrailStatusResult withLatestNotificationError(String latestNotificationError) {
        this.latestNotificationError = latestNotificationError;
        return this;
    }

    /**
     * Specifies the date and time that CloudTrail last delivered log files
     * to an account's Amazon S3 bucket.
     *
     * @return Specifies the date and time that CloudTrail last delivered log files
     *         to an account's Amazon S3 bucket.
     */
    public java.util.Date getLatestDeliveryTime() {
        return latestDeliveryTime;
    }
    
    /**
     * Specifies the date and time that CloudTrail last delivered log files
     * to an account's Amazon S3 bucket.
     *
     * @param latestDeliveryTime Specifies the date and time that CloudTrail last delivered log files
     *         to an account's Amazon S3 bucket.
     */
    public void setLatestDeliveryTime(java.util.Date latestDeliveryTime) {
        this.latestDeliveryTime = latestDeliveryTime;
    }
    
    /**
     * Specifies the date and time that CloudTrail last delivered log files
     * to an account's Amazon S3 bucket.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param latestDeliveryTime Specifies the date and time that CloudTrail last delivered log files
     *         to an account's Amazon S3 bucket.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTrailStatusResult withLatestDeliveryTime(java.util.Date latestDeliveryTime) {
        this.latestDeliveryTime = latestDeliveryTime;
        return this;
    }

    /**
     * Specifies the date and time of the most recent Amazon SNS notification
     * that CloudTrail has written a new log file to an account's Amazon S3
     * bucket.
     *
     * @return Specifies the date and time of the most recent Amazon SNS notification
     *         that CloudTrail has written a new log file to an account's Amazon S3
     *         bucket.
     */
    public java.util.Date getLatestNotificationTime() {
        return latestNotificationTime;
    }
    
    /**
     * Specifies the date and time of the most recent Amazon SNS notification
     * that CloudTrail has written a new log file to an account's Amazon S3
     * bucket.
     *
     * @param latestNotificationTime Specifies the date and time of the most recent Amazon SNS notification
     *         that CloudTrail has written a new log file to an account's Amazon S3
     *         bucket.
     */
    public void setLatestNotificationTime(java.util.Date latestNotificationTime) {
        this.latestNotificationTime = latestNotificationTime;
    }
    
    /**
     * Specifies the date and time of the most recent Amazon SNS notification
     * that CloudTrail has written a new log file to an account's Amazon S3
     * bucket.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param latestNotificationTime Specifies the date and time of the most recent Amazon SNS notification
     *         that CloudTrail has written a new log file to an account's Amazon S3
     *         bucket.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTrailStatusResult withLatestNotificationTime(java.util.Date latestNotificationTime) {
        this.latestNotificationTime = latestNotificationTime;
        return this;
    }

    /**
     * Specifies the most recent date and time when CloudTrail started
     * recording API calls for an AWS account.
     *
     * @return Specifies the most recent date and time when CloudTrail started
     *         recording API calls for an AWS account.
     */
    public java.util.Date getStartLoggingTime() {
        return startLoggingTime;
    }
    
    /**
     * Specifies the most recent date and time when CloudTrail started
     * recording API calls for an AWS account.
     *
     * @param startLoggingTime Specifies the most recent date and time when CloudTrail started
     *         recording API calls for an AWS account.
     */
    public void setStartLoggingTime(java.util.Date startLoggingTime) {
        this.startLoggingTime = startLoggingTime;
    }
    
    /**
     * Specifies the most recent date and time when CloudTrail started
     * recording API calls for an AWS account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startLoggingTime Specifies the most recent date and time when CloudTrail started
     *         recording API calls for an AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTrailStatusResult withStartLoggingTime(java.util.Date startLoggingTime) {
        this.startLoggingTime = startLoggingTime;
        return this;
    }

    /**
     * Specifies the most recent date and time when CloudTrail stopped
     * recording API calls for an AWS account.
     *
     * @return Specifies the most recent date and time when CloudTrail stopped
     *         recording API calls for an AWS account.
     */
    public java.util.Date getStopLoggingTime() {
        return stopLoggingTime;
    }
    
    /**
     * Specifies the most recent date and time when CloudTrail stopped
     * recording API calls for an AWS account.
     *
     * @param stopLoggingTime Specifies the most recent date and time when CloudTrail stopped
     *         recording API calls for an AWS account.
     */
    public void setStopLoggingTime(java.util.Date stopLoggingTime) {
        this.stopLoggingTime = stopLoggingTime;
    }
    
    /**
     * Specifies the most recent date and time when CloudTrail stopped
     * recording API calls for an AWS account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stopLoggingTime Specifies the most recent date and time when CloudTrail stopped
     *         recording API calls for an AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTrailStatusResult withStopLoggingTime(java.util.Date stopLoggingTime) {
        this.stopLoggingTime = stopLoggingTime;
        return this;
    }

    /**
     * Displays any CloudWatch Logs error that CloudTrail encountered when
     * attempting to deliver logs to CloudWatch Logs.
     *
     * @return Displays any CloudWatch Logs error that CloudTrail encountered when
     *         attempting to deliver logs to CloudWatch Logs.
     */
    public String getLatestCloudWatchLogsDeliveryError() {
        return latestCloudWatchLogsDeliveryError;
    }
    
    /**
     * Displays any CloudWatch Logs error that CloudTrail encountered when
     * attempting to deliver logs to CloudWatch Logs.
     *
     * @param latestCloudWatchLogsDeliveryError Displays any CloudWatch Logs error that CloudTrail encountered when
     *         attempting to deliver logs to CloudWatch Logs.
     */
    public void setLatestCloudWatchLogsDeliveryError(String latestCloudWatchLogsDeliveryError) {
        this.latestCloudWatchLogsDeliveryError = latestCloudWatchLogsDeliveryError;
    }
    
    /**
     * Displays any CloudWatch Logs error that CloudTrail encountered when
     * attempting to deliver logs to CloudWatch Logs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param latestCloudWatchLogsDeliveryError Displays any CloudWatch Logs error that CloudTrail encountered when
     *         attempting to deliver logs to CloudWatch Logs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTrailStatusResult withLatestCloudWatchLogsDeliveryError(String latestCloudWatchLogsDeliveryError) {
        this.latestCloudWatchLogsDeliveryError = latestCloudWatchLogsDeliveryError;
        return this;
    }

    /**
     * Displays the most recent date and time when CloudTrail delivered logs
     * to CloudWatch Logs.
     *
     * @return Displays the most recent date and time when CloudTrail delivered logs
     *         to CloudWatch Logs.
     */
    public java.util.Date getLatestCloudWatchLogsDeliveryTime() {
        return latestCloudWatchLogsDeliveryTime;
    }
    
    /**
     * Displays the most recent date and time when CloudTrail delivered logs
     * to CloudWatch Logs.
     *
     * @param latestCloudWatchLogsDeliveryTime Displays the most recent date and time when CloudTrail delivered logs
     *         to CloudWatch Logs.
     */
    public void setLatestCloudWatchLogsDeliveryTime(java.util.Date latestCloudWatchLogsDeliveryTime) {
        this.latestCloudWatchLogsDeliveryTime = latestCloudWatchLogsDeliveryTime;
    }
    
    /**
     * Displays the most recent date and time when CloudTrail delivered logs
     * to CloudWatch Logs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param latestCloudWatchLogsDeliveryTime Displays the most recent date and time when CloudTrail delivered logs
     *         to CloudWatch Logs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTrailStatusResult withLatestCloudWatchLogsDeliveryTime(java.util.Date latestCloudWatchLogsDeliveryTime) {
        this.latestCloudWatchLogsDeliveryTime = latestCloudWatchLogsDeliveryTime;
        return this;
    }

    /**
     * Specifies the date and time that CloudTrail last delivered a digest
     * file to an account's Amazon S3 bucket.
     *
     * @return Specifies the date and time that CloudTrail last delivered a digest
     *         file to an account's Amazon S3 bucket.
     */
    public java.util.Date getLatestDigestDeliveryTime() {
        return latestDigestDeliveryTime;
    }
    
    /**
     * Specifies the date and time that CloudTrail last delivered a digest
     * file to an account's Amazon S3 bucket.
     *
     * @param latestDigestDeliveryTime Specifies the date and time that CloudTrail last delivered a digest
     *         file to an account's Amazon S3 bucket.
     */
    public void setLatestDigestDeliveryTime(java.util.Date latestDigestDeliveryTime) {
        this.latestDigestDeliveryTime = latestDigestDeliveryTime;
    }
    
    /**
     * Specifies the date and time that CloudTrail last delivered a digest
     * file to an account's Amazon S3 bucket.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param latestDigestDeliveryTime Specifies the date and time that CloudTrail last delivered a digest
     *         file to an account's Amazon S3 bucket.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTrailStatusResult withLatestDigestDeliveryTime(java.util.Date latestDigestDeliveryTime) {
        this.latestDigestDeliveryTime = latestDigestDeliveryTime;
        return this;
    }

    /**
     * Displays any Amazon S3 error that CloudTrail encountered when
     * attempting to deliver a digest file to the designated bucket. For more
     * information see the topic <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html">Error
     * Responses</a> in the Amazon S3 API Reference. <note>This error occurs
     * only when there is a problem with the destination S3 bucket and will
     * not occur for timeouts. To resolve the issue, create a new bucket and
     * call <code>UpdateTrail</code> to specify the new bucket, or fix the
     * existing objects so that CloudTrail can again write to the bucket.
     * </note>
     *
     * @return Displays any Amazon S3 error that CloudTrail encountered when
     *         attempting to deliver a digest file to the designated bucket. For more
     *         information see the topic <a
     *         href="http://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html">Error
     *         Responses</a> in the Amazon S3 API Reference. <note>This error occurs
     *         only when there is a problem with the destination S3 bucket and will
     *         not occur for timeouts. To resolve the issue, create a new bucket and
     *         call <code>UpdateTrail</code> to specify the new bucket, or fix the
     *         existing objects so that CloudTrail can again write to the bucket.
     *         </note>
     */
    public String getLatestDigestDeliveryError() {
        return latestDigestDeliveryError;
    }
    
    /**
     * Displays any Amazon S3 error that CloudTrail encountered when
     * attempting to deliver a digest file to the designated bucket. For more
     * information see the topic <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html">Error
     * Responses</a> in the Amazon S3 API Reference. <note>This error occurs
     * only when there is a problem with the destination S3 bucket and will
     * not occur for timeouts. To resolve the issue, create a new bucket and
     * call <code>UpdateTrail</code> to specify the new bucket, or fix the
     * existing objects so that CloudTrail can again write to the bucket.
     * </note>
     *
     * @param latestDigestDeliveryError Displays any Amazon S3 error that CloudTrail encountered when
     *         attempting to deliver a digest file to the designated bucket. For more
     *         information see the topic <a
     *         href="http://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html">Error
     *         Responses</a> in the Amazon S3 API Reference. <note>This error occurs
     *         only when there is a problem with the destination S3 bucket and will
     *         not occur for timeouts. To resolve the issue, create a new bucket and
     *         call <code>UpdateTrail</code> to specify the new bucket, or fix the
     *         existing objects so that CloudTrail can again write to the bucket.
     *         </note>
     */
    public void setLatestDigestDeliveryError(String latestDigestDeliveryError) {
        this.latestDigestDeliveryError = latestDigestDeliveryError;
    }
    
    /**
     * Displays any Amazon S3 error that CloudTrail encountered when
     * attempting to deliver a digest file to the designated bucket. For more
     * information see the topic <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html">Error
     * Responses</a> in the Amazon S3 API Reference. <note>This error occurs
     * only when there is a problem with the destination S3 bucket and will
     * not occur for timeouts. To resolve the issue, create a new bucket and
     * call <code>UpdateTrail</code> to specify the new bucket, or fix the
     * existing objects so that CloudTrail can again write to the bucket.
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param latestDigestDeliveryError Displays any Amazon S3 error that CloudTrail encountered when
     *         attempting to deliver a digest file to the designated bucket. For more
     *         information see the topic <a
     *         href="http://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html">Error
     *         Responses</a> in the Amazon S3 API Reference. <note>This error occurs
     *         only when there is a problem with the destination S3 bucket and will
     *         not occur for timeouts. To resolve the issue, create a new bucket and
     *         call <code>UpdateTrail</code> to specify the new bucket, or fix the
     *         existing objects so that CloudTrail can again write to the bucket.
     *         </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTrailStatusResult withLatestDigestDeliveryError(String latestDigestDeliveryError) {
        this.latestDigestDeliveryError = latestDigestDeliveryError;
        return this;
    }

    /**
     * This field is deprecated.
     *
     * @return This field is deprecated.
     */
    public String getLatestDeliveryAttemptTime() {
        return latestDeliveryAttemptTime;
    }
    
    /**
     * This field is deprecated.
     *
     * @param latestDeliveryAttemptTime This field is deprecated.
     */
    public void setLatestDeliveryAttemptTime(String latestDeliveryAttemptTime) {
        this.latestDeliveryAttemptTime = latestDeliveryAttemptTime;
    }
    
    /**
     * This field is deprecated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param latestDeliveryAttemptTime This field is deprecated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTrailStatusResult withLatestDeliveryAttemptTime(String latestDeliveryAttemptTime) {
        this.latestDeliveryAttemptTime = latestDeliveryAttemptTime;
        return this;
    }

    /**
     * This field is deprecated.
     *
     * @return This field is deprecated.
     */
    public String getLatestNotificationAttemptTime() {
        return latestNotificationAttemptTime;
    }
    
    /**
     * This field is deprecated.
     *
     * @param latestNotificationAttemptTime This field is deprecated.
     */
    public void setLatestNotificationAttemptTime(String latestNotificationAttemptTime) {
        this.latestNotificationAttemptTime = latestNotificationAttemptTime;
    }
    
    /**
     * This field is deprecated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param latestNotificationAttemptTime This field is deprecated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTrailStatusResult withLatestNotificationAttemptTime(String latestNotificationAttemptTime) {
        this.latestNotificationAttemptTime = latestNotificationAttemptTime;
        return this;
    }

    /**
     * This field is deprecated.
     *
     * @return This field is deprecated.
     */
    public String getLatestNotificationAttemptSucceeded() {
        return latestNotificationAttemptSucceeded;
    }
    
    /**
     * This field is deprecated.
     *
     * @param latestNotificationAttemptSucceeded This field is deprecated.
     */
    public void setLatestNotificationAttemptSucceeded(String latestNotificationAttemptSucceeded) {
        this.latestNotificationAttemptSucceeded = latestNotificationAttemptSucceeded;
    }
    
    /**
     * This field is deprecated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param latestNotificationAttemptSucceeded This field is deprecated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTrailStatusResult withLatestNotificationAttemptSucceeded(String latestNotificationAttemptSucceeded) {
        this.latestNotificationAttemptSucceeded = latestNotificationAttemptSucceeded;
        return this;
    }

    /**
     * This field is deprecated.
     *
     * @return This field is deprecated.
     */
    public String getLatestDeliveryAttemptSucceeded() {
        return latestDeliveryAttemptSucceeded;
    }
    
    /**
     * This field is deprecated.
     *
     * @param latestDeliveryAttemptSucceeded This field is deprecated.
     */
    public void setLatestDeliveryAttemptSucceeded(String latestDeliveryAttemptSucceeded) {
        this.latestDeliveryAttemptSucceeded = latestDeliveryAttemptSucceeded;
    }
    
    /**
     * This field is deprecated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param latestDeliveryAttemptSucceeded This field is deprecated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTrailStatusResult withLatestDeliveryAttemptSucceeded(String latestDeliveryAttemptSucceeded) {
        this.latestDeliveryAttemptSucceeded = latestDeliveryAttemptSucceeded;
        return this;
    }

    /**
     * This field is deprecated.
     *
     * @return This field is deprecated.
     */
    public String getTimeLoggingStarted() {
        return timeLoggingStarted;
    }
    
    /**
     * This field is deprecated.
     *
     * @param timeLoggingStarted This field is deprecated.
     */
    public void setTimeLoggingStarted(String timeLoggingStarted) {
        this.timeLoggingStarted = timeLoggingStarted;
    }
    
    /**
     * This field is deprecated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timeLoggingStarted This field is deprecated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTrailStatusResult withTimeLoggingStarted(String timeLoggingStarted) {
        this.timeLoggingStarted = timeLoggingStarted;
        return this;
    }

    /**
     * This field is deprecated.
     *
     * @return This field is deprecated.
     */
    public String getTimeLoggingStopped() {
        return timeLoggingStopped;
    }
    
    /**
     * This field is deprecated.
     *
     * @param timeLoggingStopped This field is deprecated.
     */
    public void setTimeLoggingStopped(String timeLoggingStopped) {
        this.timeLoggingStopped = timeLoggingStopped;
    }
    
    /**
     * This field is deprecated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timeLoggingStopped This field is deprecated.
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
        if (getLatestDeliveryTime() != null) sb.append("LatestDeliveryTime: " + getLatestDeliveryTime() + ",");
        if (getLatestNotificationTime() != null) sb.append("LatestNotificationTime: " + getLatestNotificationTime() + ",");
        if (getStartLoggingTime() != null) sb.append("StartLoggingTime: " + getStartLoggingTime() + ",");
        if (getStopLoggingTime() != null) sb.append("StopLoggingTime: " + getStopLoggingTime() + ",");
        if (getLatestCloudWatchLogsDeliveryError() != null) sb.append("LatestCloudWatchLogsDeliveryError: " + getLatestCloudWatchLogsDeliveryError() + ",");
        if (getLatestCloudWatchLogsDeliveryTime() != null) sb.append("LatestCloudWatchLogsDeliveryTime: " + getLatestCloudWatchLogsDeliveryTime() + ",");
        if (getLatestDigestDeliveryTime() != null) sb.append("LatestDigestDeliveryTime: " + getLatestDigestDeliveryTime() + ",");
        if (getLatestDigestDeliveryError() != null) sb.append("LatestDigestDeliveryError: " + getLatestDigestDeliveryError() + ",");
        if (getLatestDeliveryAttemptTime() != null) sb.append("LatestDeliveryAttemptTime: " + getLatestDeliveryAttemptTime() + ",");
        if (getLatestNotificationAttemptTime() != null) sb.append("LatestNotificationAttemptTime: " + getLatestNotificationAttemptTime() + ",");
        if (getLatestNotificationAttemptSucceeded() != null) sb.append("LatestNotificationAttemptSucceeded: " + getLatestNotificationAttemptSucceeded() + ",");
        if (getLatestDeliveryAttemptSucceeded() != null) sb.append("LatestDeliveryAttemptSucceeded: " + getLatestDeliveryAttemptSucceeded() + ",");
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
        hashCode = prime * hashCode + ((getLatestDeliveryTime() == null) ? 0 : getLatestDeliveryTime().hashCode()); 
        hashCode = prime * hashCode + ((getLatestNotificationTime() == null) ? 0 : getLatestNotificationTime().hashCode()); 
        hashCode = prime * hashCode + ((getStartLoggingTime() == null) ? 0 : getStartLoggingTime().hashCode()); 
        hashCode = prime * hashCode + ((getStopLoggingTime() == null) ? 0 : getStopLoggingTime().hashCode()); 
        hashCode = prime * hashCode + ((getLatestCloudWatchLogsDeliveryError() == null) ? 0 : getLatestCloudWatchLogsDeliveryError().hashCode()); 
        hashCode = prime * hashCode + ((getLatestCloudWatchLogsDeliveryTime() == null) ? 0 : getLatestCloudWatchLogsDeliveryTime().hashCode()); 
        hashCode = prime * hashCode + ((getLatestDigestDeliveryTime() == null) ? 0 : getLatestDigestDeliveryTime().hashCode()); 
        hashCode = prime * hashCode + ((getLatestDigestDeliveryError() == null) ? 0 : getLatestDigestDeliveryError().hashCode()); 
        hashCode = prime * hashCode + ((getLatestDeliveryAttemptTime() == null) ? 0 : getLatestDeliveryAttemptTime().hashCode()); 
        hashCode = prime * hashCode + ((getLatestNotificationAttemptTime() == null) ? 0 : getLatestNotificationAttemptTime().hashCode()); 
        hashCode = prime * hashCode + ((getLatestNotificationAttemptSucceeded() == null) ? 0 : getLatestNotificationAttemptSucceeded().hashCode()); 
        hashCode = prime * hashCode + ((getLatestDeliveryAttemptSucceeded() == null) ? 0 : getLatestDeliveryAttemptSucceeded().hashCode()); 
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
        if (other.getLatestDeliveryTime() == null ^ this.getLatestDeliveryTime() == null) return false;
        if (other.getLatestDeliveryTime() != null && other.getLatestDeliveryTime().equals(this.getLatestDeliveryTime()) == false) return false; 
        if (other.getLatestNotificationTime() == null ^ this.getLatestNotificationTime() == null) return false;
        if (other.getLatestNotificationTime() != null && other.getLatestNotificationTime().equals(this.getLatestNotificationTime()) == false) return false; 
        if (other.getStartLoggingTime() == null ^ this.getStartLoggingTime() == null) return false;
        if (other.getStartLoggingTime() != null && other.getStartLoggingTime().equals(this.getStartLoggingTime()) == false) return false; 
        if (other.getStopLoggingTime() == null ^ this.getStopLoggingTime() == null) return false;
        if (other.getStopLoggingTime() != null && other.getStopLoggingTime().equals(this.getStopLoggingTime()) == false) return false; 
        if (other.getLatestCloudWatchLogsDeliveryError() == null ^ this.getLatestCloudWatchLogsDeliveryError() == null) return false;
        if (other.getLatestCloudWatchLogsDeliveryError() != null && other.getLatestCloudWatchLogsDeliveryError().equals(this.getLatestCloudWatchLogsDeliveryError()) == false) return false; 
        if (other.getLatestCloudWatchLogsDeliveryTime() == null ^ this.getLatestCloudWatchLogsDeliveryTime() == null) return false;
        if (other.getLatestCloudWatchLogsDeliveryTime() != null && other.getLatestCloudWatchLogsDeliveryTime().equals(this.getLatestCloudWatchLogsDeliveryTime()) == false) return false; 
        if (other.getLatestDigestDeliveryTime() == null ^ this.getLatestDigestDeliveryTime() == null) return false;
        if (other.getLatestDigestDeliveryTime() != null && other.getLatestDigestDeliveryTime().equals(this.getLatestDigestDeliveryTime()) == false) return false; 
        if (other.getLatestDigestDeliveryError() == null ^ this.getLatestDigestDeliveryError() == null) return false;
        if (other.getLatestDigestDeliveryError() != null && other.getLatestDigestDeliveryError().equals(this.getLatestDigestDeliveryError()) == false) return false; 
        if (other.getLatestDeliveryAttemptTime() == null ^ this.getLatestDeliveryAttemptTime() == null) return false;
        if (other.getLatestDeliveryAttemptTime() != null && other.getLatestDeliveryAttemptTime().equals(this.getLatestDeliveryAttemptTime()) == false) return false; 
        if (other.getLatestNotificationAttemptTime() == null ^ this.getLatestNotificationAttemptTime() == null) return false;
        if (other.getLatestNotificationAttemptTime() != null && other.getLatestNotificationAttemptTime().equals(this.getLatestNotificationAttemptTime()) == false) return false; 
        if (other.getLatestNotificationAttemptSucceeded() == null ^ this.getLatestNotificationAttemptSucceeded() == null) return false;
        if (other.getLatestNotificationAttemptSucceeded() != null && other.getLatestNotificationAttemptSucceeded().equals(this.getLatestNotificationAttemptSucceeded()) == false) return false; 
        if (other.getLatestDeliveryAttemptSucceeded() == null ^ this.getLatestDeliveryAttemptSucceeded() == null) return false;
        if (other.getLatestDeliveryAttemptSucceeded() != null && other.getLatestDeliveryAttemptSucceeded().equals(this.getLatestDeliveryAttemptSucceeded()) == false) return false; 
        if (other.getTimeLoggingStarted() == null ^ this.getTimeLoggingStarted() == null) return false;
        if (other.getTimeLoggingStarted() != null && other.getTimeLoggingStarted().equals(this.getTimeLoggingStarted()) == false) return false; 
        if (other.getTimeLoggingStopped() == null ^ this.getTimeLoggingStopped() == null) return false;
        if (other.getTimeLoggingStopped() != null && other.getTimeLoggingStopped().equals(this.getTimeLoggingStopped()) == false) return false; 
        return true;
    }
    
    @Override
    public GetTrailStatusResult clone() {
        try {
            return (GetTrailStatusResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    