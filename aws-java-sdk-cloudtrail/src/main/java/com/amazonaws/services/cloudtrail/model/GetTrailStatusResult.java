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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Returns the objects or data listed below if successful. Otherwise, returns an error.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/GetTrailStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTrailStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Whether the CloudTrail is currently logging AWS API calls.
     * </p>
     */
    private Boolean isLogging;
    /**
     * <p>
     * Displays any Amazon S3 error that CloudTrail encountered when attempting to deliver log files to the designated
     * bucket. For more information see the topic <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html">Error Responses</a> in the Amazon S3
     * API Reference.
     * </p>
     * <note>
     * <p>
     * This error occurs only when there is a problem with the destination S3 bucket and will not occur for timeouts. To
     * resolve the issue, create a new bucket and call <code>UpdateTrail</code> to specify the new bucket, or fix the
     * existing objects so that CloudTrail can again write to the bucket.
     * </p>
     * </note>
     */
    private String latestDeliveryError;
    /**
     * <p>
     * Displays any Amazon SNS error that CloudTrail encountered when attempting to send a notification. For more
     * information about Amazon SNS errors, see the <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/welcome.html">Amazon SNS Developer Guide</a>.
     * </p>
     */
    private String latestNotificationError;
    /**
     * <p>
     * Specifies the date and time that CloudTrail last delivered log files to an account's Amazon S3 bucket.
     * </p>
     */
    private java.util.Date latestDeliveryTime;
    /**
     * <p>
     * Specifies the date and time of the most recent Amazon SNS notification that CloudTrail has written a new log file
     * to an account's Amazon S3 bucket.
     * </p>
     */
    private java.util.Date latestNotificationTime;
    /**
     * <p>
     * Specifies the most recent date and time when CloudTrail started recording API calls for an AWS account.
     * </p>
     */
    private java.util.Date startLoggingTime;
    /**
     * <p>
     * Specifies the most recent date and time when CloudTrail stopped recording API calls for an AWS account.
     * </p>
     */
    private java.util.Date stopLoggingTime;
    /**
     * <p>
     * Displays any CloudWatch Logs error that CloudTrail encountered when attempting to deliver logs to CloudWatch
     * Logs.
     * </p>
     */
    private String latestCloudWatchLogsDeliveryError;
    /**
     * <p>
     * Displays the most recent date and time when CloudTrail delivered logs to CloudWatch Logs.
     * </p>
     */
    private java.util.Date latestCloudWatchLogsDeliveryTime;
    /**
     * <p>
     * Specifies the date and time that CloudTrail last delivered a digest file to an account's Amazon S3 bucket.
     * </p>
     */
    private java.util.Date latestDigestDeliveryTime;
    /**
     * <p>
     * Displays any Amazon S3 error that CloudTrail encountered when attempting to deliver a digest file to the
     * designated bucket. For more information see the topic <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html">Error Responses</a> in the Amazon S3
     * API Reference.
     * </p>
     * <note>
     * <p>
     * This error occurs only when there is a problem with the destination S3 bucket and will not occur for timeouts. To
     * resolve the issue, create a new bucket and call <code>UpdateTrail</code> to specify the new bucket, or fix the
     * existing objects so that CloudTrail can again write to the bucket.
     * </p>
     * </note>
     */
    private String latestDigestDeliveryError;
    /**
     * <p>
     * This field is deprecated.
     * </p>
     */
    private String latestDeliveryAttemptTime;
    /**
     * <p>
     * This field is deprecated.
     * </p>
     */
    private String latestNotificationAttemptTime;
    /**
     * <p>
     * This field is deprecated.
     * </p>
     */
    private String latestNotificationAttemptSucceeded;
    /**
     * <p>
     * This field is deprecated.
     * </p>
     */
    private String latestDeliveryAttemptSucceeded;
    /**
     * <p>
     * This field is deprecated.
     * </p>
     */
    private String timeLoggingStarted;
    /**
     * <p>
     * This field is deprecated.
     * </p>
     */
    private String timeLoggingStopped;

    /**
     * <p>
     * Whether the CloudTrail is currently logging AWS API calls.
     * </p>
     * 
     * @param isLogging
     *        Whether the CloudTrail is currently logging AWS API calls.
     */

    public void setIsLogging(Boolean isLogging) {
        this.isLogging = isLogging;
    }

    /**
     * <p>
     * Whether the CloudTrail is currently logging AWS API calls.
     * </p>
     * 
     * @return Whether the CloudTrail is currently logging AWS API calls.
     */

    public Boolean getIsLogging() {
        return this.isLogging;
    }

    /**
     * <p>
     * Whether the CloudTrail is currently logging AWS API calls.
     * </p>
     * 
     * @param isLogging
     *        Whether the CloudTrail is currently logging AWS API calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrailStatusResult withIsLogging(Boolean isLogging) {
        setIsLogging(isLogging);
        return this;
    }

    /**
     * <p>
     * Whether the CloudTrail is currently logging AWS API calls.
     * </p>
     * 
     * @return Whether the CloudTrail is currently logging AWS API calls.
     */

    public Boolean isLogging() {
        return this.isLogging;
    }

    /**
     * <p>
     * Displays any Amazon S3 error that CloudTrail encountered when attempting to deliver log files to the designated
     * bucket. For more information see the topic <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html">Error Responses</a> in the Amazon S3
     * API Reference.
     * </p>
     * <note>
     * <p>
     * This error occurs only when there is a problem with the destination S3 bucket and will not occur for timeouts. To
     * resolve the issue, create a new bucket and call <code>UpdateTrail</code> to specify the new bucket, or fix the
     * existing objects so that CloudTrail can again write to the bucket.
     * </p>
     * </note>
     * 
     * @param latestDeliveryError
     *        Displays any Amazon S3 error that CloudTrail encountered when attempting to deliver log files to the
     *        designated bucket. For more information see the topic <a
     *        href="http://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html">Error Responses</a> in the
     *        Amazon S3 API Reference. </p> <note>
     *        <p>
     *        This error occurs only when there is a problem with the destination S3 bucket and will not occur for
     *        timeouts. To resolve the issue, create a new bucket and call <code>UpdateTrail</code> to specify the new
     *        bucket, or fix the existing objects so that CloudTrail can again write to the bucket.
     *        </p>
     */

    public void setLatestDeliveryError(String latestDeliveryError) {
        this.latestDeliveryError = latestDeliveryError;
    }

    /**
     * <p>
     * Displays any Amazon S3 error that CloudTrail encountered when attempting to deliver log files to the designated
     * bucket. For more information see the topic <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html">Error Responses</a> in the Amazon S3
     * API Reference.
     * </p>
     * <note>
     * <p>
     * This error occurs only when there is a problem with the destination S3 bucket and will not occur for timeouts. To
     * resolve the issue, create a new bucket and call <code>UpdateTrail</code> to specify the new bucket, or fix the
     * existing objects so that CloudTrail can again write to the bucket.
     * </p>
     * </note>
     * 
     * @return Displays any Amazon S3 error that CloudTrail encountered when attempting to deliver log files to the
     *         designated bucket. For more information see the topic <a
     *         href="http://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html">Error Responses</a> in the
     *         Amazon S3 API Reference. </p> <note>
     *         <p>
     *         This error occurs only when there is a problem with the destination S3 bucket and will not occur for
     *         timeouts. To resolve the issue, create a new bucket and call <code>UpdateTrail</code> to specify the new
     *         bucket, or fix the existing objects so that CloudTrail can again write to the bucket.
     *         </p>
     */

    public String getLatestDeliveryError() {
        return this.latestDeliveryError;
    }

    /**
     * <p>
     * Displays any Amazon S3 error that CloudTrail encountered when attempting to deliver log files to the designated
     * bucket. For more information see the topic <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html">Error Responses</a> in the Amazon S3
     * API Reference.
     * </p>
     * <note>
     * <p>
     * This error occurs only when there is a problem with the destination S3 bucket and will not occur for timeouts. To
     * resolve the issue, create a new bucket and call <code>UpdateTrail</code> to specify the new bucket, or fix the
     * existing objects so that CloudTrail can again write to the bucket.
     * </p>
     * </note>
     * 
     * @param latestDeliveryError
     *        Displays any Amazon S3 error that CloudTrail encountered when attempting to deliver log files to the
     *        designated bucket. For more information see the topic <a
     *        href="http://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html">Error Responses</a> in the
     *        Amazon S3 API Reference. </p> <note>
     *        <p>
     *        This error occurs only when there is a problem with the destination S3 bucket and will not occur for
     *        timeouts. To resolve the issue, create a new bucket and call <code>UpdateTrail</code> to specify the new
     *        bucket, or fix the existing objects so that CloudTrail can again write to the bucket.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrailStatusResult withLatestDeliveryError(String latestDeliveryError) {
        setLatestDeliveryError(latestDeliveryError);
        return this;
    }

    /**
     * <p>
     * Displays any Amazon SNS error that CloudTrail encountered when attempting to send a notification. For more
     * information about Amazon SNS errors, see the <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/welcome.html">Amazon SNS Developer Guide</a>.
     * </p>
     * 
     * @param latestNotificationError
     *        Displays any Amazon SNS error that CloudTrail encountered when attempting to send a notification. For more
     *        information about Amazon SNS errors, see the <a
     *        href="http://docs.aws.amazon.com/sns/latest/dg/welcome.html">Amazon SNS Developer Guide</a>.
     */

    public void setLatestNotificationError(String latestNotificationError) {
        this.latestNotificationError = latestNotificationError;
    }

    /**
     * <p>
     * Displays any Amazon SNS error that CloudTrail encountered when attempting to send a notification. For more
     * information about Amazon SNS errors, see the <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/welcome.html">Amazon SNS Developer Guide</a>.
     * </p>
     * 
     * @return Displays any Amazon SNS error that CloudTrail encountered when attempting to send a notification. For
     *         more information about Amazon SNS errors, see the <a
     *         href="http://docs.aws.amazon.com/sns/latest/dg/welcome.html">Amazon SNS Developer Guide</a>.
     */

    public String getLatestNotificationError() {
        return this.latestNotificationError;
    }

    /**
     * <p>
     * Displays any Amazon SNS error that CloudTrail encountered when attempting to send a notification. For more
     * information about Amazon SNS errors, see the <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/welcome.html">Amazon SNS Developer Guide</a>.
     * </p>
     * 
     * @param latestNotificationError
     *        Displays any Amazon SNS error that CloudTrail encountered when attempting to send a notification. For more
     *        information about Amazon SNS errors, see the <a
     *        href="http://docs.aws.amazon.com/sns/latest/dg/welcome.html">Amazon SNS Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrailStatusResult withLatestNotificationError(String latestNotificationError) {
        setLatestNotificationError(latestNotificationError);
        return this;
    }

    /**
     * <p>
     * Specifies the date and time that CloudTrail last delivered log files to an account's Amazon S3 bucket.
     * </p>
     * 
     * @param latestDeliveryTime
     *        Specifies the date and time that CloudTrail last delivered log files to an account's Amazon S3 bucket.
     */

    public void setLatestDeliveryTime(java.util.Date latestDeliveryTime) {
        this.latestDeliveryTime = latestDeliveryTime;
    }

    /**
     * <p>
     * Specifies the date and time that CloudTrail last delivered log files to an account's Amazon S3 bucket.
     * </p>
     * 
     * @return Specifies the date and time that CloudTrail last delivered log files to an account's Amazon S3 bucket.
     */

    public java.util.Date getLatestDeliveryTime() {
        return this.latestDeliveryTime;
    }

    /**
     * <p>
     * Specifies the date and time that CloudTrail last delivered log files to an account's Amazon S3 bucket.
     * </p>
     * 
     * @param latestDeliveryTime
     *        Specifies the date and time that CloudTrail last delivered log files to an account's Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrailStatusResult withLatestDeliveryTime(java.util.Date latestDeliveryTime) {
        setLatestDeliveryTime(latestDeliveryTime);
        return this;
    }

    /**
     * <p>
     * Specifies the date and time of the most recent Amazon SNS notification that CloudTrail has written a new log file
     * to an account's Amazon S3 bucket.
     * </p>
     * 
     * @param latestNotificationTime
     *        Specifies the date and time of the most recent Amazon SNS notification that CloudTrail has written a new
     *        log file to an account's Amazon S3 bucket.
     */

    public void setLatestNotificationTime(java.util.Date latestNotificationTime) {
        this.latestNotificationTime = latestNotificationTime;
    }

    /**
     * <p>
     * Specifies the date and time of the most recent Amazon SNS notification that CloudTrail has written a new log file
     * to an account's Amazon S3 bucket.
     * </p>
     * 
     * @return Specifies the date and time of the most recent Amazon SNS notification that CloudTrail has written a new
     *         log file to an account's Amazon S3 bucket.
     */

    public java.util.Date getLatestNotificationTime() {
        return this.latestNotificationTime;
    }

    /**
     * <p>
     * Specifies the date and time of the most recent Amazon SNS notification that CloudTrail has written a new log file
     * to an account's Amazon S3 bucket.
     * </p>
     * 
     * @param latestNotificationTime
     *        Specifies the date and time of the most recent Amazon SNS notification that CloudTrail has written a new
     *        log file to an account's Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrailStatusResult withLatestNotificationTime(java.util.Date latestNotificationTime) {
        setLatestNotificationTime(latestNotificationTime);
        return this;
    }

    /**
     * <p>
     * Specifies the most recent date and time when CloudTrail started recording API calls for an AWS account.
     * </p>
     * 
     * @param startLoggingTime
     *        Specifies the most recent date and time when CloudTrail started recording API calls for an AWS account.
     */

    public void setStartLoggingTime(java.util.Date startLoggingTime) {
        this.startLoggingTime = startLoggingTime;
    }

    /**
     * <p>
     * Specifies the most recent date and time when CloudTrail started recording API calls for an AWS account.
     * </p>
     * 
     * @return Specifies the most recent date and time when CloudTrail started recording API calls for an AWS account.
     */

    public java.util.Date getStartLoggingTime() {
        return this.startLoggingTime;
    }

    /**
     * <p>
     * Specifies the most recent date and time when CloudTrail started recording API calls for an AWS account.
     * </p>
     * 
     * @param startLoggingTime
     *        Specifies the most recent date and time when CloudTrail started recording API calls for an AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrailStatusResult withStartLoggingTime(java.util.Date startLoggingTime) {
        setStartLoggingTime(startLoggingTime);
        return this;
    }

    /**
     * <p>
     * Specifies the most recent date and time when CloudTrail stopped recording API calls for an AWS account.
     * </p>
     * 
     * @param stopLoggingTime
     *        Specifies the most recent date and time when CloudTrail stopped recording API calls for an AWS account.
     */

    public void setStopLoggingTime(java.util.Date stopLoggingTime) {
        this.stopLoggingTime = stopLoggingTime;
    }

    /**
     * <p>
     * Specifies the most recent date and time when CloudTrail stopped recording API calls for an AWS account.
     * </p>
     * 
     * @return Specifies the most recent date and time when CloudTrail stopped recording API calls for an AWS account.
     */

    public java.util.Date getStopLoggingTime() {
        return this.stopLoggingTime;
    }

    /**
     * <p>
     * Specifies the most recent date and time when CloudTrail stopped recording API calls for an AWS account.
     * </p>
     * 
     * @param stopLoggingTime
     *        Specifies the most recent date and time when CloudTrail stopped recording API calls for an AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrailStatusResult withStopLoggingTime(java.util.Date stopLoggingTime) {
        setStopLoggingTime(stopLoggingTime);
        return this;
    }

    /**
     * <p>
     * Displays any CloudWatch Logs error that CloudTrail encountered when attempting to deliver logs to CloudWatch
     * Logs.
     * </p>
     * 
     * @param latestCloudWatchLogsDeliveryError
     *        Displays any CloudWatch Logs error that CloudTrail encountered when attempting to deliver logs to
     *        CloudWatch Logs.
     */

    public void setLatestCloudWatchLogsDeliveryError(String latestCloudWatchLogsDeliveryError) {
        this.latestCloudWatchLogsDeliveryError = latestCloudWatchLogsDeliveryError;
    }

    /**
     * <p>
     * Displays any CloudWatch Logs error that CloudTrail encountered when attempting to deliver logs to CloudWatch
     * Logs.
     * </p>
     * 
     * @return Displays any CloudWatch Logs error that CloudTrail encountered when attempting to deliver logs to
     *         CloudWatch Logs.
     */

    public String getLatestCloudWatchLogsDeliveryError() {
        return this.latestCloudWatchLogsDeliveryError;
    }

    /**
     * <p>
     * Displays any CloudWatch Logs error that CloudTrail encountered when attempting to deliver logs to CloudWatch
     * Logs.
     * </p>
     * 
     * @param latestCloudWatchLogsDeliveryError
     *        Displays any CloudWatch Logs error that CloudTrail encountered when attempting to deliver logs to
     *        CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrailStatusResult withLatestCloudWatchLogsDeliveryError(String latestCloudWatchLogsDeliveryError) {
        setLatestCloudWatchLogsDeliveryError(latestCloudWatchLogsDeliveryError);
        return this;
    }

    /**
     * <p>
     * Displays the most recent date and time when CloudTrail delivered logs to CloudWatch Logs.
     * </p>
     * 
     * @param latestCloudWatchLogsDeliveryTime
     *        Displays the most recent date and time when CloudTrail delivered logs to CloudWatch Logs.
     */

    public void setLatestCloudWatchLogsDeliveryTime(java.util.Date latestCloudWatchLogsDeliveryTime) {
        this.latestCloudWatchLogsDeliveryTime = latestCloudWatchLogsDeliveryTime;
    }

    /**
     * <p>
     * Displays the most recent date and time when CloudTrail delivered logs to CloudWatch Logs.
     * </p>
     * 
     * @return Displays the most recent date and time when CloudTrail delivered logs to CloudWatch Logs.
     */

    public java.util.Date getLatestCloudWatchLogsDeliveryTime() {
        return this.latestCloudWatchLogsDeliveryTime;
    }

    /**
     * <p>
     * Displays the most recent date and time when CloudTrail delivered logs to CloudWatch Logs.
     * </p>
     * 
     * @param latestCloudWatchLogsDeliveryTime
     *        Displays the most recent date and time when CloudTrail delivered logs to CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrailStatusResult withLatestCloudWatchLogsDeliveryTime(java.util.Date latestCloudWatchLogsDeliveryTime) {
        setLatestCloudWatchLogsDeliveryTime(latestCloudWatchLogsDeliveryTime);
        return this;
    }

    /**
     * <p>
     * Specifies the date and time that CloudTrail last delivered a digest file to an account's Amazon S3 bucket.
     * </p>
     * 
     * @param latestDigestDeliveryTime
     *        Specifies the date and time that CloudTrail last delivered a digest file to an account's Amazon S3 bucket.
     */

    public void setLatestDigestDeliveryTime(java.util.Date latestDigestDeliveryTime) {
        this.latestDigestDeliveryTime = latestDigestDeliveryTime;
    }

    /**
     * <p>
     * Specifies the date and time that CloudTrail last delivered a digest file to an account's Amazon S3 bucket.
     * </p>
     * 
     * @return Specifies the date and time that CloudTrail last delivered a digest file to an account's Amazon S3
     *         bucket.
     */

    public java.util.Date getLatestDigestDeliveryTime() {
        return this.latestDigestDeliveryTime;
    }

    /**
     * <p>
     * Specifies the date and time that CloudTrail last delivered a digest file to an account's Amazon S3 bucket.
     * </p>
     * 
     * @param latestDigestDeliveryTime
     *        Specifies the date and time that CloudTrail last delivered a digest file to an account's Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrailStatusResult withLatestDigestDeliveryTime(java.util.Date latestDigestDeliveryTime) {
        setLatestDigestDeliveryTime(latestDigestDeliveryTime);
        return this;
    }

    /**
     * <p>
     * Displays any Amazon S3 error that CloudTrail encountered when attempting to deliver a digest file to the
     * designated bucket. For more information see the topic <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html">Error Responses</a> in the Amazon S3
     * API Reference.
     * </p>
     * <note>
     * <p>
     * This error occurs only when there is a problem with the destination S3 bucket and will not occur for timeouts. To
     * resolve the issue, create a new bucket and call <code>UpdateTrail</code> to specify the new bucket, or fix the
     * existing objects so that CloudTrail can again write to the bucket.
     * </p>
     * </note>
     * 
     * @param latestDigestDeliveryError
     *        Displays any Amazon S3 error that CloudTrail encountered when attempting to deliver a digest file to the
     *        designated bucket. For more information see the topic <a
     *        href="http://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html">Error Responses</a> in the
     *        Amazon S3 API Reference. </p> <note>
     *        <p>
     *        This error occurs only when there is a problem with the destination S3 bucket and will not occur for
     *        timeouts. To resolve the issue, create a new bucket and call <code>UpdateTrail</code> to specify the new
     *        bucket, or fix the existing objects so that CloudTrail can again write to the bucket.
     *        </p>
     */

    public void setLatestDigestDeliveryError(String latestDigestDeliveryError) {
        this.latestDigestDeliveryError = latestDigestDeliveryError;
    }

    /**
     * <p>
     * Displays any Amazon S3 error that CloudTrail encountered when attempting to deliver a digest file to the
     * designated bucket. For more information see the topic <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html">Error Responses</a> in the Amazon S3
     * API Reference.
     * </p>
     * <note>
     * <p>
     * This error occurs only when there is a problem with the destination S3 bucket and will not occur for timeouts. To
     * resolve the issue, create a new bucket and call <code>UpdateTrail</code> to specify the new bucket, or fix the
     * existing objects so that CloudTrail can again write to the bucket.
     * </p>
     * </note>
     * 
     * @return Displays any Amazon S3 error that CloudTrail encountered when attempting to deliver a digest file to the
     *         designated bucket. For more information see the topic <a
     *         href="http://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html">Error Responses</a> in the
     *         Amazon S3 API Reference. </p> <note>
     *         <p>
     *         This error occurs only when there is a problem with the destination S3 bucket and will not occur for
     *         timeouts. To resolve the issue, create a new bucket and call <code>UpdateTrail</code> to specify the new
     *         bucket, or fix the existing objects so that CloudTrail can again write to the bucket.
     *         </p>
     */

    public String getLatestDigestDeliveryError() {
        return this.latestDigestDeliveryError;
    }

    /**
     * <p>
     * Displays any Amazon S3 error that CloudTrail encountered when attempting to deliver a digest file to the
     * designated bucket. For more information see the topic <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html">Error Responses</a> in the Amazon S3
     * API Reference.
     * </p>
     * <note>
     * <p>
     * This error occurs only when there is a problem with the destination S3 bucket and will not occur for timeouts. To
     * resolve the issue, create a new bucket and call <code>UpdateTrail</code> to specify the new bucket, or fix the
     * existing objects so that CloudTrail can again write to the bucket.
     * </p>
     * </note>
     * 
     * @param latestDigestDeliveryError
     *        Displays any Amazon S3 error that CloudTrail encountered when attempting to deliver a digest file to the
     *        designated bucket. For more information see the topic <a
     *        href="http://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html">Error Responses</a> in the
     *        Amazon S3 API Reference. </p> <note>
     *        <p>
     *        This error occurs only when there is a problem with the destination S3 bucket and will not occur for
     *        timeouts. To resolve the issue, create a new bucket and call <code>UpdateTrail</code> to specify the new
     *        bucket, or fix the existing objects so that CloudTrail can again write to the bucket.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrailStatusResult withLatestDigestDeliveryError(String latestDigestDeliveryError) {
        setLatestDigestDeliveryError(latestDigestDeliveryError);
        return this;
    }

    /**
     * <p>
     * This field is deprecated.
     * </p>
     * 
     * @param latestDeliveryAttemptTime
     *        This field is deprecated.
     */

    public void setLatestDeliveryAttemptTime(String latestDeliveryAttemptTime) {
        this.latestDeliveryAttemptTime = latestDeliveryAttemptTime;
    }

    /**
     * <p>
     * This field is deprecated.
     * </p>
     * 
     * @return This field is deprecated.
     */

    public String getLatestDeliveryAttemptTime() {
        return this.latestDeliveryAttemptTime;
    }

    /**
     * <p>
     * This field is deprecated.
     * </p>
     * 
     * @param latestDeliveryAttemptTime
     *        This field is deprecated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrailStatusResult withLatestDeliveryAttemptTime(String latestDeliveryAttemptTime) {
        setLatestDeliveryAttemptTime(latestDeliveryAttemptTime);
        return this;
    }

    /**
     * <p>
     * This field is deprecated.
     * </p>
     * 
     * @param latestNotificationAttemptTime
     *        This field is deprecated.
     */

    public void setLatestNotificationAttemptTime(String latestNotificationAttemptTime) {
        this.latestNotificationAttemptTime = latestNotificationAttemptTime;
    }

    /**
     * <p>
     * This field is deprecated.
     * </p>
     * 
     * @return This field is deprecated.
     */

    public String getLatestNotificationAttemptTime() {
        return this.latestNotificationAttemptTime;
    }

    /**
     * <p>
     * This field is deprecated.
     * </p>
     * 
     * @param latestNotificationAttemptTime
     *        This field is deprecated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrailStatusResult withLatestNotificationAttemptTime(String latestNotificationAttemptTime) {
        setLatestNotificationAttemptTime(latestNotificationAttemptTime);
        return this;
    }

    /**
     * <p>
     * This field is deprecated.
     * </p>
     * 
     * @param latestNotificationAttemptSucceeded
     *        This field is deprecated.
     */

    public void setLatestNotificationAttemptSucceeded(String latestNotificationAttemptSucceeded) {
        this.latestNotificationAttemptSucceeded = latestNotificationAttemptSucceeded;
    }

    /**
     * <p>
     * This field is deprecated.
     * </p>
     * 
     * @return This field is deprecated.
     */

    public String getLatestNotificationAttemptSucceeded() {
        return this.latestNotificationAttemptSucceeded;
    }

    /**
     * <p>
     * This field is deprecated.
     * </p>
     * 
     * @param latestNotificationAttemptSucceeded
     *        This field is deprecated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrailStatusResult withLatestNotificationAttemptSucceeded(String latestNotificationAttemptSucceeded) {
        setLatestNotificationAttemptSucceeded(latestNotificationAttemptSucceeded);
        return this;
    }

    /**
     * <p>
     * This field is deprecated.
     * </p>
     * 
     * @param latestDeliveryAttemptSucceeded
     *        This field is deprecated.
     */

    public void setLatestDeliveryAttemptSucceeded(String latestDeliveryAttemptSucceeded) {
        this.latestDeliveryAttemptSucceeded = latestDeliveryAttemptSucceeded;
    }

    /**
     * <p>
     * This field is deprecated.
     * </p>
     * 
     * @return This field is deprecated.
     */

    public String getLatestDeliveryAttemptSucceeded() {
        return this.latestDeliveryAttemptSucceeded;
    }

    /**
     * <p>
     * This field is deprecated.
     * </p>
     * 
     * @param latestDeliveryAttemptSucceeded
     *        This field is deprecated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrailStatusResult withLatestDeliveryAttemptSucceeded(String latestDeliveryAttemptSucceeded) {
        setLatestDeliveryAttemptSucceeded(latestDeliveryAttemptSucceeded);
        return this;
    }

    /**
     * <p>
     * This field is deprecated.
     * </p>
     * 
     * @param timeLoggingStarted
     *        This field is deprecated.
     */

    public void setTimeLoggingStarted(String timeLoggingStarted) {
        this.timeLoggingStarted = timeLoggingStarted;
    }

    /**
     * <p>
     * This field is deprecated.
     * </p>
     * 
     * @return This field is deprecated.
     */

    public String getTimeLoggingStarted() {
        return this.timeLoggingStarted;
    }

    /**
     * <p>
     * This field is deprecated.
     * </p>
     * 
     * @param timeLoggingStarted
     *        This field is deprecated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrailStatusResult withTimeLoggingStarted(String timeLoggingStarted) {
        setTimeLoggingStarted(timeLoggingStarted);
        return this;
    }

    /**
     * <p>
     * This field is deprecated.
     * </p>
     * 
     * @param timeLoggingStopped
     *        This field is deprecated.
     */

    public void setTimeLoggingStopped(String timeLoggingStopped) {
        this.timeLoggingStopped = timeLoggingStopped;
    }

    /**
     * <p>
     * This field is deprecated.
     * </p>
     * 
     * @return This field is deprecated.
     */

    public String getTimeLoggingStopped() {
        return this.timeLoggingStopped;
    }

    /**
     * <p>
     * This field is deprecated.
     * </p>
     * 
     * @param timeLoggingStopped
     *        This field is deprecated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrailStatusResult withTimeLoggingStopped(String timeLoggingStopped) {
        setTimeLoggingStopped(timeLoggingStopped);
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
        if (getIsLogging() != null)
            sb.append("IsLogging: ").append(getIsLogging()).append(",");
        if (getLatestDeliveryError() != null)
            sb.append("LatestDeliveryError: ").append(getLatestDeliveryError()).append(",");
        if (getLatestNotificationError() != null)
            sb.append("LatestNotificationError: ").append(getLatestNotificationError()).append(",");
        if (getLatestDeliveryTime() != null)
            sb.append("LatestDeliveryTime: ").append(getLatestDeliveryTime()).append(",");
        if (getLatestNotificationTime() != null)
            sb.append("LatestNotificationTime: ").append(getLatestNotificationTime()).append(",");
        if (getStartLoggingTime() != null)
            sb.append("StartLoggingTime: ").append(getStartLoggingTime()).append(",");
        if (getStopLoggingTime() != null)
            sb.append("StopLoggingTime: ").append(getStopLoggingTime()).append(",");
        if (getLatestCloudWatchLogsDeliveryError() != null)
            sb.append("LatestCloudWatchLogsDeliveryError: ").append(getLatestCloudWatchLogsDeliveryError()).append(",");
        if (getLatestCloudWatchLogsDeliveryTime() != null)
            sb.append("LatestCloudWatchLogsDeliveryTime: ").append(getLatestCloudWatchLogsDeliveryTime()).append(",");
        if (getLatestDigestDeliveryTime() != null)
            sb.append("LatestDigestDeliveryTime: ").append(getLatestDigestDeliveryTime()).append(",");
        if (getLatestDigestDeliveryError() != null)
            sb.append("LatestDigestDeliveryError: ").append(getLatestDigestDeliveryError()).append(",");
        if (getLatestDeliveryAttemptTime() != null)
            sb.append("LatestDeliveryAttemptTime: ").append(getLatestDeliveryAttemptTime()).append(",");
        if (getLatestNotificationAttemptTime() != null)
            sb.append("LatestNotificationAttemptTime: ").append(getLatestNotificationAttemptTime()).append(",");
        if (getLatestNotificationAttemptSucceeded() != null)
            sb.append("LatestNotificationAttemptSucceeded: ").append(getLatestNotificationAttemptSucceeded()).append(",");
        if (getLatestDeliveryAttemptSucceeded() != null)
            sb.append("LatestDeliveryAttemptSucceeded: ").append(getLatestDeliveryAttemptSucceeded()).append(",");
        if (getTimeLoggingStarted() != null)
            sb.append("TimeLoggingStarted: ").append(getTimeLoggingStarted()).append(",");
        if (getTimeLoggingStopped() != null)
            sb.append("TimeLoggingStopped: ").append(getTimeLoggingStopped());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTrailStatusResult == false)
            return false;
        GetTrailStatusResult other = (GetTrailStatusResult) obj;
        if (other.getIsLogging() == null ^ this.getIsLogging() == null)
            return false;
        if (other.getIsLogging() != null && other.getIsLogging().equals(this.getIsLogging()) == false)
            return false;
        if (other.getLatestDeliveryError() == null ^ this.getLatestDeliveryError() == null)
            return false;
        if (other.getLatestDeliveryError() != null && other.getLatestDeliveryError().equals(this.getLatestDeliveryError()) == false)
            return false;
        if (other.getLatestNotificationError() == null ^ this.getLatestNotificationError() == null)
            return false;
        if (other.getLatestNotificationError() != null && other.getLatestNotificationError().equals(this.getLatestNotificationError()) == false)
            return false;
        if (other.getLatestDeliveryTime() == null ^ this.getLatestDeliveryTime() == null)
            return false;
        if (other.getLatestDeliveryTime() != null && other.getLatestDeliveryTime().equals(this.getLatestDeliveryTime()) == false)
            return false;
        if (other.getLatestNotificationTime() == null ^ this.getLatestNotificationTime() == null)
            return false;
        if (other.getLatestNotificationTime() != null && other.getLatestNotificationTime().equals(this.getLatestNotificationTime()) == false)
            return false;
        if (other.getStartLoggingTime() == null ^ this.getStartLoggingTime() == null)
            return false;
        if (other.getStartLoggingTime() != null && other.getStartLoggingTime().equals(this.getStartLoggingTime()) == false)
            return false;
        if (other.getStopLoggingTime() == null ^ this.getStopLoggingTime() == null)
            return false;
        if (other.getStopLoggingTime() != null && other.getStopLoggingTime().equals(this.getStopLoggingTime()) == false)
            return false;
        if (other.getLatestCloudWatchLogsDeliveryError() == null ^ this.getLatestCloudWatchLogsDeliveryError() == null)
            return false;
        if (other.getLatestCloudWatchLogsDeliveryError() != null
                && other.getLatestCloudWatchLogsDeliveryError().equals(this.getLatestCloudWatchLogsDeliveryError()) == false)
            return false;
        if (other.getLatestCloudWatchLogsDeliveryTime() == null ^ this.getLatestCloudWatchLogsDeliveryTime() == null)
            return false;
        if (other.getLatestCloudWatchLogsDeliveryTime() != null
                && other.getLatestCloudWatchLogsDeliveryTime().equals(this.getLatestCloudWatchLogsDeliveryTime()) == false)
            return false;
        if (other.getLatestDigestDeliveryTime() == null ^ this.getLatestDigestDeliveryTime() == null)
            return false;
        if (other.getLatestDigestDeliveryTime() != null && other.getLatestDigestDeliveryTime().equals(this.getLatestDigestDeliveryTime()) == false)
            return false;
        if (other.getLatestDigestDeliveryError() == null ^ this.getLatestDigestDeliveryError() == null)
            return false;
        if (other.getLatestDigestDeliveryError() != null && other.getLatestDigestDeliveryError().equals(this.getLatestDigestDeliveryError()) == false)
            return false;
        if (other.getLatestDeliveryAttemptTime() == null ^ this.getLatestDeliveryAttemptTime() == null)
            return false;
        if (other.getLatestDeliveryAttemptTime() != null && other.getLatestDeliveryAttemptTime().equals(this.getLatestDeliveryAttemptTime()) == false)
            return false;
        if (other.getLatestNotificationAttemptTime() == null ^ this.getLatestNotificationAttemptTime() == null)
            return false;
        if (other.getLatestNotificationAttemptTime() != null
                && other.getLatestNotificationAttemptTime().equals(this.getLatestNotificationAttemptTime()) == false)
            return false;
        if (other.getLatestNotificationAttemptSucceeded() == null ^ this.getLatestNotificationAttemptSucceeded() == null)
            return false;
        if (other.getLatestNotificationAttemptSucceeded() != null
                && other.getLatestNotificationAttemptSucceeded().equals(this.getLatestNotificationAttemptSucceeded()) == false)
            return false;
        if (other.getLatestDeliveryAttemptSucceeded() == null ^ this.getLatestDeliveryAttemptSucceeded() == null)
            return false;
        if (other.getLatestDeliveryAttemptSucceeded() != null
                && other.getLatestDeliveryAttemptSucceeded().equals(this.getLatestDeliveryAttemptSucceeded()) == false)
            return false;
        if (other.getTimeLoggingStarted() == null ^ this.getTimeLoggingStarted() == null)
            return false;
        if (other.getTimeLoggingStarted() != null && other.getTimeLoggingStarted().equals(this.getTimeLoggingStarted()) == false)
            return false;
        if (other.getTimeLoggingStopped() == null ^ this.getTimeLoggingStopped() == null)
            return false;
        if (other.getTimeLoggingStopped() != null && other.getTimeLoggingStopped().equals(this.getTimeLoggingStopped()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsLogging() == null) ? 0 : getIsLogging().hashCode());
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
    public GetTrailStatusResult clone() {
        try {
            return (GetTrailStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
