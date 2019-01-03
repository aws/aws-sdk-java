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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the configuration of a destination in Splunk.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/SplunkDestinationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SplunkDestinationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The HTTP Event Collector (HEC) endpoint to which Kinesis Data Firehose sends your data.
     * </p>
     */
    private String hECEndpoint;
    /**
     * <p>
     * This type can be either "Raw" or "Event."
     * </p>
     */
    private String hECEndpointType;
    /**
     * <p>
     * This is a GUID that you obtain from your Splunk cluster when you create a new HEC endpoint.
     * </p>
     */
    private String hECToken;
    /**
     * <p>
     * The amount of time that Kinesis Data Firehose waits to receive an acknowledgment from Splunk after it sends it
     * data. At the end of the timeout period, Kinesis Data Firehose either tries to send the data again or considers it
     * an error, based on your retry settings.
     * </p>
     */
    private Integer hECAcknowledgmentTimeoutInSeconds;
    /**
     * <p>
     * The retry behavior in case Kinesis Data Firehose is unable to deliver data to Splunk, or if it doesn't receive an
     * acknowledgment of receipt from Splunk.
     * </p>
     */
    private SplunkRetryOptions retryOptions;
    /**
     * <p>
     * Defines how documents should be delivered to Amazon S3. When set to <code>FailedDocumentsOnly</code>, Kinesis
     * Data Firehose writes any data that could not be indexed to the configured Amazon S3 destination. When set to
     * <code>AllDocuments</code>, Kinesis Data Firehose delivers all incoming records to Amazon S3, and also writes
     * failed documents to Amazon S3. Default value is <code>FailedDocumentsOnly</code>.
     * </p>
     */
    private String s3BackupMode;
    /**
     * <p>
     * The configuration for the backup Amazon S3 location.
     * </p>
     */
    private S3DestinationConfiguration s3Configuration;
    /**
     * <p>
     * The data processing configuration.
     * </p>
     */
    private ProcessingConfiguration processingConfiguration;
    /**
     * <p>
     * The Amazon CloudWatch logging options for your delivery stream.
     * </p>
     */
    private CloudWatchLoggingOptions cloudWatchLoggingOptions;

    /**
     * <p>
     * The HTTP Event Collector (HEC) endpoint to which Kinesis Data Firehose sends your data.
     * </p>
     * 
     * @param hECEndpoint
     *        The HTTP Event Collector (HEC) endpoint to which Kinesis Data Firehose sends your data.
     */

    public void setHECEndpoint(String hECEndpoint) {
        this.hECEndpoint = hECEndpoint;
    }

    /**
     * <p>
     * The HTTP Event Collector (HEC) endpoint to which Kinesis Data Firehose sends your data.
     * </p>
     * 
     * @return The HTTP Event Collector (HEC) endpoint to which Kinesis Data Firehose sends your data.
     */

    public String getHECEndpoint() {
        return this.hECEndpoint;
    }

    /**
     * <p>
     * The HTTP Event Collector (HEC) endpoint to which Kinesis Data Firehose sends your data.
     * </p>
     * 
     * @param hECEndpoint
     *        The HTTP Event Collector (HEC) endpoint to which Kinesis Data Firehose sends your data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SplunkDestinationConfiguration withHECEndpoint(String hECEndpoint) {
        setHECEndpoint(hECEndpoint);
        return this;
    }

    /**
     * <p>
     * This type can be either "Raw" or "Event."
     * </p>
     * 
     * @param hECEndpointType
     *        This type can be either "Raw" or "Event."
     * @see HECEndpointType
     */

    public void setHECEndpointType(String hECEndpointType) {
        this.hECEndpointType = hECEndpointType;
    }

    /**
     * <p>
     * This type can be either "Raw" or "Event."
     * </p>
     * 
     * @return This type can be either "Raw" or "Event."
     * @see HECEndpointType
     */

    public String getHECEndpointType() {
        return this.hECEndpointType;
    }

    /**
     * <p>
     * This type can be either "Raw" or "Event."
     * </p>
     * 
     * @param hECEndpointType
     *        This type can be either "Raw" or "Event."
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HECEndpointType
     */

    public SplunkDestinationConfiguration withHECEndpointType(String hECEndpointType) {
        setHECEndpointType(hECEndpointType);
        return this;
    }

    /**
     * <p>
     * This type can be either "Raw" or "Event."
     * </p>
     * 
     * @param hECEndpointType
     *        This type can be either "Raw" or "Event."
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HECEndpointType
     */

    public SplunkDestinationConfiguration withHECEndpointType(HECEndpointType hECEndpointType) {
        this.hECEndpointType = hECEndpointType.toString();
        return this;
    }

    /**
     * <p>
     * This is a GUID that you obtain from your Splunk cluster when you create a new HEC endpoint.
     * </p>
     * 
     * @param hECToken
     *        This is a GUID that you obtain from your Splunk cluster when you create a new HEC endpoint.
     */

    public void setHECToken(String hECToken) {
        this.hECToken = hECToken;
    }

    /**
     * <p>
     * This is a GUID that you obtain from your Splunk cluster when you create a new HEC endpoint.
     * </p>
     * 
     * @return This is a GUID that you obtain from your Splunk cluster when you create a new HEC endpoint.
     */

    public String getHECToken() {
        return this.hECToken;
    }

    /**
     * <p>
     * This is a GUID that you obtain from your Splunk cluster when you create a new HEC endpoint.
     * </p>
     * 
     * @param hECToken
     *        This is a GUID that you obtain from your Splunk cluster when you create a new HEC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SplunkDestinationConfiguration withHECToken(String hECToken) {
        setHECToken(hECToken);
        return this;
    }

    /**
     * <p>
     * The amount of time that Kinesis Data Firehose waits to receive an acknowledgment from Splunk after it sends it
     * data. At the end of the timeout period, Kinesis Data Firehose either tries to send the data again or considers it
     * an error, based on your retry settings.
     * </p>
     * 
     * @param hECAcknowledgmentTimeoutInSeconds
     *        The amount of time that Kinesis Data Firehose waits to receive an acknowledgment from Splunk after it
     *        sends it data. At the end of the timeout period, Kinesis Data Firehose either tries to send the data again
     *        or considers it an error, based on your retry settings.
     */

    public void setHECAcknowledgmentTimeoutInSeconds(Integer hECAcknowledgmentTimeoutInSeconds) {
        this.hECAcknowledgmentTimeoutInSeconds = hECAcknowledgmentTimeoutInSeconds;
    }

    /**
     * <p>
     * The amount of time that Kinesis Data Firehose waits to receive an acknowledgment from Splunk after it sends it
     * data. At the end of the timeout period, Kinesis Data Firehose either tries to send the data again or considers it
     * an error, based on your retry settings.
     * </p>
     * 
     * @return The amount of time that Kinesis Data Firehose waits to receive an acknowledgment from Splunk after it
     *         sends it data. At the end of the timeout period, Kinesis Data Firehose either tries to send the data
     *         again or considers it an error, based on your retry settings.
     */

    public Integer getHECAcknowledgmentTimeoutInSeconds() {
        return this.hECAcknowledgmentTimeoutInSeconds;
    }

    /**
     * <p>
     * The amount of time that Kinesis Data Firehose waits to receive an acknowledgment from Splunk after it sends it
     * data. At the end of the timeout period, Kinesis Data Firehose either tries to send the data again or considers it
     * an error, based on your retry settings.
     * </p>
     * 
     * @param hECAcknowledgmentTimeoutInSeconds
     *        The amount of time that Kinesis Data Firehose waits to receive an acknowledgment from Splunk after it
     *        sends it data. At the end of the timeout period, Kinesis Data Firehose either tries to send the data again
     *        or considers it an error, based on your retry settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SplunkDestinationConfiguration withHECAcknowledgmentTimeoutInSeconds(Integer hECAcknowledgmentTimeoutInSeconds) {
        setHECAcknowledgmentTimeoutInSeconds(hECAcknowledgmentTimeoutInSeconds);
        return this;
    }

    /**
     * <p>
     * The retry behavior in case Kinesis Data Firehose is unable to deliver data to Splunk, or if it doesn't receive an
     * acknowledgment of receipt from Splunk.
     * </p>
     * 
     * @param retryOptions
     *        The retry behavior in case Kinesis Data Firehose is unable to deliver data to Splunk, or if it doesn't
     *        receive an acknowledgment of receipt from Splunk.
     */

    public void setRetryOptions(SplunkRetryOptions retryOptions) {
        this.retryOptions = retryOptions;
    }

    /**
     * <p>
     * The retry behavior in case Kinesis Data Firehose is unable to deliver data to Splunk, or if it doesn't receive an
     * acknowledgment of receipt from Splunk.
     * </p>
     * 
     * @return The retry behavior in case Kinesis Data Firehose is unable to deliver data to Splunk, or if it doesn't
     *         receive an acknowledgment of receipt from Splunk.
     */

    public SplunkRetryOptions getRetryOptions() {
        return this.retryOptions;
    }

    /**
     * <p>
     * The retry behavior in case Kinesis Data Firehose is unable to deliver data to Splunk, or if it doesn't receive an
     * acknowledgment of receipt from Splunk.
     * </p>
     * 
     * @param retryOptions
     *        The retry behavior in case Kinesis Data Firehose is unable to deliver data to Splunk, or if it doesn't
     *        receive an acknowledgment of receipt from Splunk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SplunkDestinationConfiguration withRetryOptions(SplunkRetryOptions retryOptions) {
        setRetryOptions(retryOptions);
        return this;
    }

    /**
     * <p>
     * Defines how documents should be delivered to Amazon S3. When set to <code>FailedDocumentsOnly</code>, Kinesis
     * Data Firehose writes any data that could not be indexed to the configured Amazon S3 destination. When set to
     * <code>AllDocuments</code>, Kinesis Data Firehose delivers all incoming records to Amazon S3, and also writes
     * failed documents to Amazon S3. Default value is <code>FailedDocumentsOnly</code>.
     * </p>
     * 
     * @param s3BackupMode
     *        Defines how documents should be delivered to Amazon S3. When set to <code>FailedDocumentsOnly</code>,
     *        Kinesis Data Firehose writes any data that could not be indexed to the configured Amazon S3 destination.
     *        When set to <code>AllDocuments</code>, Kinesis Data Firehose delivers all incoming records to Amazon S3,
     *        and also writes failed documents to Amazon S3. Default value is <code>FailedDocumentsOnly</code>.
     * @see SplunkS3BackupMode
     */

    public void setS3BackupMode(String s3BackupMode) {
        this.s3BackupMode = s3BackupMode;
    }

    /**
     * <p>
     * Defines how documents should be delivered to Amazon S3. When set to <code>FailedDocumentsOnly</code>, Kinesis
     * Data Firehose writes any data that could not be indexed to the configured Amazon S3 destination. When set to
     * <code>AllDocuments</code>, Kinesis Data Firehose delivers all incoming records to Amazon S3, and also writes
     * failed documents to Amazon S3. Default value is <code>FailedDocumentsOnly</code>.
     * </p>
     * 
     * @return Defines how documents should be delivered to Amazon S3. When set to <code>FailedDocumentsOnly</code>,
     *         Kinesis Data Firehose writes any data that could not be indexed to the configured Amazon S3 destination.
     *         When set to <code>AllDocuments</code>, Kinesis Data Firehose delivers all incoming records to Amazon S3,
     *         and also writes failed documents to Amazon S3. Default value is <code>FailedDocumentsOnly</code>.
     * @see SplunkS3BackupMode
     */

    public String getS3BackupMode() {
        return this.s3BackupMode;
    }

    /**
     * <p>
     * Defines how documents should be delivered to Amazon S3. When set to <code>FailedDocumentsOnly</code>, Kinesis
     * Data Firehose writes any data that could not be indexed to the configured Amazon S3 destination. When set to
     * <code>AllDocuments</code>, Kinesis Data Firehose delivers all incoming records to Amazon S3, and also writes
     * failed documents to Amazon S3. Default value is <code>FailedDocumentsOnly</code>.
     * </p>
     * 
     * @param s3BackupMode
     *        Defines how documents should be delivered to Amazon S3. When set to <code>FailedDocumentsOnly</code>,
     *        Kinesis Data Firehose writes any data that could not be indexed to the configured Amazon S3 destination.
     *        When set to <code>AllDocuments</code>, Kinesis Data Firehose delivers all incoming records to Amazon S3,
     *        and also writes failed documents to Amazon S3. Default value is <code>FailedDocumentsOnly</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SplunkS3BackupMode
     */

    public SplunkDestinationConfiguration withS3BackupMode(String s3BackupMode) {
        setS3BackupMode(s3BackupMode);
        return this;
    }

    /**
     * <p>
     * Defines how documents should be delivered to Amazon S3. When set to <code>FailedDocumentsOnly</code>, Kinesis
     * Data Firehose writes any data that could not be indexed to the configured Amazon S3 destination. When set to
     * <code>AllDocuments</code>, Kinesis Data Firehose delivers all incoming records to Amazon S3, and also writes
     * failed documents to Amazon S3. Default value is <code>FailedDocumentsOnly</code>.
     * </p>
     * 
     * @param s3BackupMode
     *        Defines how documents should be delivered to Amazon S3. When set to <code>FailedDocumentsOnly</code>,
     *        Kinesis Data Firehose writes any data that could not be indexed to the configured Amazon S3 destination.
     *        When set to <code>AllDocuments</code>, Kinesis Data Firehose delivers all incoming records to Amazon S3,
     *        and also writes failed documents to Amazon S3. Default value is <code>FailedDocumentsOnly</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SplunkS3BackupMode
     */

    public SplunkDestinationConfiguration withS3BackupMode(SplunkS3BackupMode s3BackupMode) {
        this.s3BackupMode = s3BackupMode.toString();
        return this;
    }

    /**
     * <p>
     * The configuration for the backup Amazon S3 location.
     * </p>
     * 
     * @param s3Configuration
     *        The configuration for the backup Amazon S3 location.
     */

    public void setS3Configuration(S3DestinationConfiguration s3Configuration) {
        this.s3Configuration = s3Configuration;
    }

    /**
     * <p>
     * The configuration for the backup Amazon S3 location.
     * </p>
     * 
     * @return The configuration for the backup Amazon S3 location.
     */

    public S3DestinationConfiguration getS3Configuration() {
        return this.s3Configuration;
    }

    /**
     * <p>
     * The configuration for the backup Amazon S3 location.
     * </p>
     * 
     * @param s3Configuration
     *        The configuration for the backup Amazon S3 location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SplunkDestinationConfiguration withS3Configuration(S3DestinationConfiguration s3Configuration) {
        setS3Configuration(s3Configuration);
        return this;
    }

    /**
     * <p>
     * The data processing configuration.
     * </p>
     * 
     * @param processingConfiguration
     *        The data processing configuration.
     */

    public void setProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
        this.processingConfiguration = processingConfiguration;
    }

    /**
     * <p>
     * The data processing configuration.
     * </p>
     * 
     * @return The data processing configuration.
     */

    public ProcessingConfiguration getProcessingConfiguration() {
        return this.processingConfiguration;
    }

    /**
     * <p>
     * The data processing configuration.
     * </p>
     * 
     * @param processingConfiguration
     *        The data processing configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SplunkDestinationConfiguration withProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
        setProcessingConfiguration(processingConfiguration);
        return this;
    }

    /**
     * <p>
     * The Amazon CloudWatch logging options for your delivery stream.
     * </p>
     * 
     * @param cloudWatchLoggingOptions
     *        The Amazon CloudWatch logging options for your delivery stream.
     */

    public void setCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
    }

    /**
     * <p>
     * The Amazon CloudWatch logging options for your delivery stream.
     * </p>
     * 
     * @return The Amazon CloudWatch logging options for your delivery stream.
     */

    public CloudWatchLoggingOptions getCloudWatchLoggingOptions() {
        return this.cloudWatchLoggingOptions;
    }

    /**
     * <p>
     * The Amazon CloudWatch logging options for your delivery stream.
     * </p>
     * 
     * @param cloudWatchLoggingOptions
     *        The Amazon CloudWatch logging options for your delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SplunkDestinationConfiguration withCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        setCloudWatchLoggingOptions(cloudWatchLoggingOptions);
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
        if (getHECEndpoint() != null)
            sb.append("HECEndpoint: ").append(getHECEndpoint()).append(",");
        if (getHECEndpointType() != null)
            sb.append("HECEndpointType: ").append(getHECEndpointType()).append(",");
        if (getHECToken() != null)
            sb.append("HECToken: ").append(getHECToken()).append(",");
        if (getHECAcknowledgmentTimeoutInSeconds() != null)
            sb.append("HECAcknowledgmentTimeoutInSeconds: ").append(getHECAcknowledgmentTimeoutInSeconds()).append(",");
        if (getRetryOptions() != null)
            sb.append("RetryOptions: ").append(getRetryOptions()).append(",");
        if (getS3BackupMode() != null)
            sb.append("S3BackupMode: ").append(getS3BackupMode()).append(",");
        if (getS3Configuration() != null)
            sb.append("S3Configuration: ").append(getS3Configuration()).append(",");
        if (getProcessingConfiguration() != null)
            sb.append("ProcessingConfiguration: ").append(getProcessingConfiguration()).append(",");
        if (getCloudWatchLoggingOptions() != null)
            sb.append("CloudWatchLoggingOptions: ").append(getCloudWatchLoggingOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SplunkDestinationConfiguration == false)
            return false;
        SplunkDestinationConfiguration other = (SplunkDestinationConfiguration) obj;
        if (other.getHECEndpoint() == null ^ this.getHECEndpoint() == null)
            return false;
        if (other.getHECEndpoint() != null && other.getHECEndpoint().equals(this.getHECEndpoint()) == false)
            return false;
        if (other.getHECEndpointType() == null ^ this.getHECEndpointType() == null)
            return false;
        if (other.getHECEndpointType() != null && other.getHECEndpointType().equals(this.getHECEndpointType()) == false)
            return false;
        if (other.getHECToken() == null ^ this.getHECToken() == null)
            return false;
        if (other.getHECToken() != null && other.getHECToken().equals(this.getHECToken()) == false)
            return false;
        if (other.getHECAcknowledgmentTimeoutInSeconds() == null ^ this.getHECAcknowledgmentTimeoutInSeconds() == null)
            return false;
        if (other.getHECAcknowledgmentTimeoutInSeconds() != null
                && other.getHECAcknowledgmentTimeoutInSeconds().equals(this.getHECAcknowledgmentTimeoutInSeconds()) == false)
            return false;
        if (other.getRetryOptions() == null ^ this.getRetryOptions() == null)
            return false;
        if (other.getRetryOptions() != null && other.getRetryOptions().equals(this.getRetryOptions()) == false)
            return false;
        if (other.getS3BackupMode() == null ^ this.getS3BackupMode() == null)
            return false;
        if (other.getS3BackupMode() != null && other.getS3BackupMode().equals(this.getS3BackupMode()) == false)
            return false;
        if (other.getS3Configuration() == null ^ this.getS3Configuration() == null)
            return false;
        if (other.getS3Configuration() != null && other.getS3Configuration().equals(this.getS3Configuration()) == false)
            return false;
        if (other.getProcessingConfiguration() == null ^ this.getProcessingConfiguration() == null)
            return false;
        if (other.getProcessingConfiguration() != null && other.getProcessingConfiguration().equals(this.getProcessingConfiguration()) == false)
            return false;
        if (other.getCloudWatchLoggingOptions() == null ^ this.getCloudWatchLoggingOptions() == null)
            return false;
        if (other.getCloudWatchLoggingOptions() != null && other.getCloudWatchLoggingOptions().equals(this.getCloudWatchLoggingOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHECEndpoint() == null) ? 0 : getHECEndpoint().hashCode());
        hashCode = prime * hashCode + ((getHECEndpointType() == null) ? 0 : getHECEndpointType().hashCode());
        hashCode = prime * hashCode + ((getHECToken() == null) ? 0 : getHECToken().hashCode());
        hashCode = prime * hashCode + ((getHECAcknowledgmentTimeoutInSeconds() == null) ? 0 : getHECAcknowledgmentTimeoutInSeconds().hashCode());
        hashCode = prime * hashCode + ((getRetryOptions() == null) ? 0 : getRetryOptions().hashCode());
        hashCode = prime * hashCode + ((getS3BackupMode() == null) ? 0 : getS3BackupMode().hashCode());
        hashCode = prime * hashCode + ((getS3Configuration() == null) ? 0 : getS3Configuration().hashCode());
        hashCode = prime * hashCode + ((getProcessingConfiguration() == null) ? 0 : getProcessingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLoggingOptions() == null) ? 0 : getCloudWatchLoggingOptions().hashCode());
        return hashCode;
    }

    @Override
    public SplunkDestinationConfiguration clone() {
        try {
            return (SplunkDestinationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.SplunkDestinationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
