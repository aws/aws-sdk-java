/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A mapping between an AWS resource and an AWS Lambda function. See <a>CreateEventSourceMapping</a> for details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/EventSourceMappingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventSourceMappingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the event source mapping.
     * </p>
     */
    private String uUID;
    /**
     * <p>
     * The maximum number of items to retrieve in a single batch.
     * </p>
     */
    private Integer batchSize;
    /**
     * <p>
     * The maximum amount of time to gather records before invoking the function, in seconds.
     * </p>
     */
    private Integer maximumBatchingWindowInSeconds;
    /**
     * <p>
     * (Streams) The number of batches to process from each shard concurrently.
     * </p>
     */
    private Integer parallelizationFactor;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event source.
     * </p>
     */
    private String eventSourceArn;
    /**
     * <p>
     * The ARN of the Lambda function.
     * </p>
     */
    private String functionArn;
    /**
     * <p>
     * The date that the event source mapping was last updated, or its state changed.
     * </p>
     */
    private java.util.Date lastModified;
    /**
     * <p>
     * The result of the last AWS Lambda invocation of your Lambda function.
     * </p>
     */
    private String lastProcessingResult;
    /**
     * <p>
     * The state of the event source mapping. It can be one of the following: <code>Creating</code>,
     * <code>Enabling</code>, <code>Enabled</code>, <code>Disabling</code>, <code>Disabled</code>, <code>Updating</code>
     * , or <code>Deleting</code>.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Indicates whether the last change to the event source mapping was made by a user, or by the Lambda service.
     * </p>
     */
    private String stateTransitionReason;
    /**
     * <p>
     * (Streams) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     * </p>
     */
    private DestinationConfig destinationConfig;
    /**
     * <p>
     * (Streams) The maximum age of a record that Lambda sends to a function for processing.
     * </p>
     */
    private Integer maximumRecordAgeInSeconds;
    /**
     * <p>
     * (Streams) If the function returns an error, split the batch in two and retry.
     * </p>
     */
    private Boolean bisectBatchOnFunctionError;
    /**
     * <p>
     * (Streams) The maximum number of times to retry when the function returns an error.
     * </p>
     */
    private Integer maximumRetryAttempts;

    /**
     * <p>
     * The identifier of the event source mapping.
     * </p>
     * 
     * @param uUID
     *        The identifier of the event source mapping.
     */

    public void setUUID(String uUID) {
        this.uUID = uUID;
    }

    /**
     * <p>
     * The identifier of the event source mapping.
     * </p>
     * 
     * @return The identifier of the event source mapping.
     */

    public String getUUID() {
        return this.uUID;
    }

    /**
     * <p>
     * The identifier of the event source mapping.
     * </p>
     * 
     * @param uUID
     *        The identifier of the event source mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSourceMappingConfiguration withUUID(String uUID) {
        setUUID(uUID);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to retrieve in a single batch.
     * </p>
     * 
     * @param batchSize
     *        The maximum number of items to retrieve in a single batch.
     */

    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    /**
     * <p>
     * The maximum number of items to retrieve in a single batch.
     * </p>
     * 
     * @return The maximum number of items to retrieve in a single batch.
     */

    public Integer getBatchSize() {
        return this.batchSize;
    }

    /**
     * <p>
     * The maximum number of items to retrieve in a single batch.
     * </p>
     * 
     * @param batchSize
     *        The maximum number of items to retrieve in a single batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSourceMappingConfiguration withBatchSize(Integer batchSize) {
        setBatchSize(batchSize);
        return this;
    }

    /**
     * <p>
     * The maximum amount of time to gather records before invoking the function, in seconds.
     * </p>
     * 
     * @param maximumBatchingWindowInSeconds
     *        The maximum amount of time to gather records before invoking the function, in seconds.
     */

    public void setMaximumBatchingWindowInSeconds(Integer maximumBatchingWindowInSeconds) {
        this.maximumBatchingWindowInSeconds = maximumBatchingWindowInSeconds;
    }

    /**
     * <p>
     * The maximum amount of time to gather records before invoking the function, in seconds.
     * </p>
     * 
     * @return The maximum amount of time to gather records before invoking the function, in seconds.
     */

    public Integer getMaximumBatchingWindowInSeconds() {
        return this.maximumBatchingWindowInSeconds;
    }

    /**
     * <p>
     * The maximum amount of time to gather records before invoking the function, in seconds.
     * </p>
     * 
     * @param maximumBatchingWindowInSeconds
     *        The maximum amount of time to gather records before invoking the function, in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSourceMappingConfiguration withMaximumBatchingWindowInSeconds(Integer maximumBatchingWindowInSeconds) {
        setMaximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds);
        return this;
    }

    /**
     * <p>
     * (Streams) The number of batches to process from each shard concurrently.
     * </p>
     * 
     * @param parallelizationFactor
     *        (Streams) The number of batches to process from each shard concurrently.
     */

    public void setParallelizationFactor(Integer parallelizationFactor) {
        this.parallelizationFactor = parallelizationFactor;
    }

    /**
     * <p>
     * (Streams) The number of batches to process from each shard concurrently.
     * </p>
     * 
     * @return (Streams) The number of batches to process from each shard concurrently.
     */

    public Integer getParallelizationFactor() {
        return this.parallelizationFactor;
    }

    /**
     * <p>
     * (Streams) The number of batches to process from each shard concurrently.
     * </p>
     * 
     * @param parallelizationFactor
     *        (Streams) The number of batches to process from each shard concurrently.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSourceMappingConfiguration withParallelizationFactor(Integer parallelizationFactor) {
        setParallelizationFactor(parallelizationFactor);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event source.
     * </p>
     * 
     * @param eventSourceArn
     *        The Amazon Resource Name (ARN) of the event source.
     */

    public void setEventSourceArn(String eventSourceArn) {
        this.eventSourceArn = eventSourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event source.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the event source.
     */

    public String getEventSourceArn() {
        return this.eventSourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event source.
     * </p>
     * 
     * @param eventSourceArn
     *        The Amazon Resource Name (ARN) of the event source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSourceMappingConfiguration withEventSourceArn(String eventSourceArn) {
        setEventSourceArn(eventSourceArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the Lambda function.
     * </p>
     * 
     * @param functionArn
     *        The ARN of the Lambda function.
     */

    public void setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
    }

    /**
     * <p>
     * The ARN of the Lambda function.
     * </p>
     * 
     * @return The ARN of the Lambda function.
     */

    public String getFunctionArn() {
        return this.functionArn;
    }

    /**
     * <p>
     * The ARN of the Lambda function.
     * </p>
     * 
     * @param functionArn
     *        The ARN of the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSourceMappingConfiguration withFunctionArn(String functionArn) {
        setFunctionArn(functionArn);
        return this;
    }

    /**
     * <p>
     * The date that the event source mapping was last updated, or its state changed.
     * </p>
     * 
     * @param lastModified
     *        The date that the event source mapping was last updated, or its state changed.
     */

    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The date that the event source mapping was last updated, or its state changed.
     * </p>
     * 
     * @return The date that the event source mapping was last updated, or its state changed.
     */

    public java.util.Date getLastModified() {
        return this.lastModified;
    }

    /**
     * <p>
     * The date that the event source mapping was last updated, or its state changed.
     * </p>
     * 
     * @param lastModified
     *        The date that the event source mapping was last updated, or its state changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSourceMappingConfiguration withLastModified(java.util.Date lastModified) {
        setLastModified(lastModified);
        return this;
    }

    /**
     * <p>
     * The result of the last AWS Lambda invocation of your Lambda function.
     * </p>
     * 
     * @param lastProcessingResult
     *        The result of the last AWS Lambda invocation of your Lambda function.
     */

    public void setLastProcessingResult(String lastProcessingResult) {
        this.lastProcessingResult = lastProcessingResult;
    }

    /**
     * <p>
     * The result of the last AWS Lambda invocation of your Lambda function.
     * </p>
     * 
     * @return The result of the last AWS Lambda invocation of your Lambda function.
     */

    public String getLastProcessingResult() {
        return this.lastProcessingResult;
    }

    /**
     * <p>
     * The result of the last AWS Lambda invocation of your Lambda function.
     * </p>
     * 
     * @param lastProcessingResult
     *        The result of the last AWS Lambda invocation of your Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSourceMappingConfiguration withLastProcessingResult(String lastProcessingResult) {
        setLastProcessingResult(lastProcessingResult);
        return this;
    }

    /**
     * <p>
     * The state of the event source mapping. It can be one of the following: <code>Creating</code>,
     * <code>Enabling</code>, <code>Enabled</code>, <code>Disabling</code>, <code>Disabled</code>, <code>Updating</code>
     * , or <code>Deleting</code>.
     * </p>
     * 
     * @param state
     *        The state of the event source mapping. It can be one of the following: <code>Creating</code>,
     *        <code>Enabling</code>, <code>Enabled</code>, <code>Disabling</code>, <code>Disabled</code>,
     *        <code>Updating</code>, or <code>Deleting</code>.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the event source mapping. It can be one of the following: <code>Creating</code>,
     * <code>Enabling</code>, <code>Enabled</code>, <code>Disabling</code>, <code>Disabled</code>, <code>Updating</code>
     * , or <code>Deleting</code>.
     * </p>
     * 
     * @return The state of the event source mapping. It can be one of the following: <code>Creating</code>,
     *         <code>Enabling</code>, <code>Enabled</code>, <code>Disabling</code>, <code>Disabled</code>,
     *         <code>Updating</code>, or <code>Deleting</code>.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the event source mapping. It can be one of the following: <code>Creating</code>,
     * <code>Enabling</code>, <code>Enabled</code>, <code>Disabling</code>, <code>Disabled</code>, <code>Updating</code>
     * , or <code>Deleting</code>.
     * </p>
     * 
     * @param state
     *        The state of the event source mapping. It can be one of the following: <code>Creating</code>,
     *        <code>Enabling</code>, <code>Enabled</code>, <code>Disabling</code>, <code>Disabled</code>,
     *        <code>Updating</code>, or <code>Deleting</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSourceMappingConfiguration withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Indicates whether the last change to the event source mapping was made by a user, or by the Lambda service.
     * </p>
     * 
     * @param stateTransitionReason
     *        Indicates whether the last change to the event source mapping was made by a user, or by the Lambda
     *        service.
     */

    public void setStateTransitionReason(String stateTransitionReason) {
        this.stateTransitionReason = stateTransitionReason;
    }

    /**
     * <p>
     * Indicates whether the last change to the event source mapping was made by a user, or by the Lambda service.
     * </p>
     * 
     * @return Indicates whether the last change to the event source mapping was made by a user, or by the Lambda
     *         service.
     */

    public String getStateTransitionReason() {
        return this.stateTransitionReason;
    }

    /**
     * <p>
     * Indicates whether the last change to the event source mapping was made by a user, or by the Lambda service.
     * </p>
     * 
     * @param stateTransitionReason
     *        Indicates whether the last change to the event source mapping was made by a user, or by the Lambda
     *        service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSourceMappingConfiguration withStateTransitionReason(String stateTransitionReason) {
        setStateTransitionReason(stateTransitionReason);
        return this;
    }

    /**
     * <p>
     * (Streams) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     * </p>
     * 
     * @param destinationConfig
     *        (Streams) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     */

    public void setDestinationConfig(DestinationConfig destinationConfig) {
        this.destinationConfig = destinationConfig;
    }

    /**
     * <p>
     * (Streams) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     * </p>
     * 
     * @return (Streams) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     */

    public DestinationConfig getDestinationConfig() {
        return this.destinationConfig;
    }

    /**
     * <p>
     * (Streams) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     * </p>
     * 
     * @param destinationConfig
     *        (Streams) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSourceMappingConfiguration withDestinationConfig(DestinationConfig destinationConfig) {
        setDestinationConfig(destinationConfig);
        return this;
    }

    /**
     * <p>
     * (Streams) The maximum age of a record that Lambda sends to a function for processing.
     * </p>
     * 
     * @param maximumRecordAgeInSeconds
     *        (Streams) The maximum age of a record that Lambda sends to a function for processing.
     */

    public void setMaximumRecordAgeInSeconds(Integer maximumRecordAgeInSeconds) {
        this.maximumRecordAgeInSeconds = maximumRecordAgeInSeconds;
    }

    /**
     * <p>
     * (Streams) The maximum age of a record that Lambda sends to a function for processing.
     * </p>
     * 
     * @return (Streams) The maximum age of a record that Lambda sends to a function for processing.
     */

    public Integer getMaximumRecordAgeInSeconds() {
        return this.maximumRecordAgeInSeconds;
    }

    /**
     * <p>
     * (Streams) The maximum age of a record that Lambda sends to a function for processing.
     * </p>
     * 
     * @param maximumRecordAgeInSeconds
     *        (Streams) The maximum age of a record that Lambda sends to a function for processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSourceMappingConfiguration withMaximumRecordAgeInSeconds(Integer maximumRecordAgeInSeconds) {
        setMaximumRecordAgeInSeconds(maximumRecordAgeInSeconds);
        return this;
    }

    /**
     * <p>
     * (Streams) If the function returns an error, split the batch in two and retry.
     * </p>
     * 
     * @param bisectBatchOnFunctionError
     *        (Streams) If the function returns an error, split the batch in two and retry.
     */

    public void setBisectBatchOnFunctionError(Boolean bisectBatchOnFunctionError) {
        this.bisectBatchOnFunctionError = bisectBatchOnFunctionError;
    }

    /**
     * <p>
     * (Streams) If the function returns an error, split the batch in two and retry.
     * </p>
     * 
     * @return (Streams) If the function returns an error, split the batch in two and retry.
     */

    public Boolean getBisectBatchOnFunctionError() {
        return this.bisectBatchOnFunctionError;
    }

    /**
     * <p>
     * (Streams) If the function returns an error, split the batch in two and retry.
     * </p>
     * 
     * @param bisectBatchOnFunctionError
     *        (Streams) If the function returns an error, split the batch in two and retry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSourceMappingConfiguration withBisectBatchOnFunctionError(Boolean bisectBatchOnFunctionError) {
        setBisectBatchOnFunctionError(bisectBatchOnFunctionError);
        return this;
    }

    /**
     * <p>
     * (Streams) If the function returns an error, split the batch in two and retry.
     * </p>
     * 
     * @return (Streams) If the function returns an error, split the batch in two and retry.
     */

    public Boolean isBisectBatchOnFunctionError() {
        return this.bisectBatchOnFunctionError;
    }

    /**
     * <p>
     * (Streams) The maximum number of times to retry when the function returns an error.
     * </p>
     * 
     * @param maximumRetryAttempts
     *        (Streams) The maximum number of times to retry when the function returns an error.
     */

    public void setMaximumRetryAttempts(Integer maximumRetryAttempts) {
        this.maximumRetryAttempts = maximumRetryAttempts;
    }

    /**
     * <p>
     * (Streams) The maximum number of times to retry when the function returns an error.
     * </p>
     * 
     * @return (Streams) The maximum number of times to retry when the function returns an error.
     */

    public Integer getMaximumRetryAttempts() {
        return this.maximumRetryAttempts;
    }

    /**
     * <p>
     * (Streams) The maximum number of times to retry when the function returns an error.
     * </p>
     * 
     * @param maximumRetryAttempts
     *        (Streams) The maximum number of times to retry when the function returns an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSourceMappingConfiguration withMaximumRetryAttempts(Integer maximumRetryAttempts) {
        setMaximumRetryAttempts(maximumRetryAttempts);
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
        if (getUUID() != null)
            sb.append("UUID: ").append(getUUID()).append(",");
        if (getBatchSize() != null)
            sb.append("BatchSize: ").append(getBatchSize()).append(",");
        if (getMaximumBatchingWindowInSeconds() != null)
            sb.append("MaximumBatchingWindowInSeconds: ").append(getMaximumBatchingWindowInSeconds()).append(",");
        if (getParallelizationFactor() != null)
            sb.append("ParallelizationFactor: ").append(getParallelizationFactor()).append(",");
        if (getEventSourceArn() != null)
            sb.append("EventSourceArn: ").append(getEventSourceArn()).append(",");
        if (getFunctionArn() != null)
            sb.append("FunctionArn: ").append(getFunctionArn()).append(",");
        if (getLastModified() != null)
            sb.append("LastModified: ").append(getLastModified()).append(",");
        if (getLastProcessingResult() != null)
            sb.append("LastProcessingResult: ").append(getLastProcessingResult()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateTransitionReason() != null)
            sb.append("StateTransitionReason: ").append(getStateTransitionReason()).append(",");
        if (getDestinationConfig() != null)
            sb.append("DestinationConfig: ").append(getDestinationConfig()).append(",");
        if (getMaximumRecordAgeInSeconds() != null)
            sb.append("MaximumRecordAgeInSeconds: ").append(getMaximumRecordAgeInSeconds()).append(",");
        if (getBisectBatchOnFunctionError() != null)
            sb.append("BisectBatchOnFunctionError: ").append(getBisectBatchOnFunctionError()).append(",");
        if (getMaximumRetryAttempts() != null)
            sb.append("MaximumRetryAttempts: ").append(getMaximumRetryAttempts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventSourceMappingConfiguration == false)
            return false;
        EventSourceMappingConfiguration other = (EventSourceMappingConfiguration) obj;
        if (other.getUUID() == null ^ this.getUUID() == null)
            return false;
        if (other.getUUID() != null && other.getUUID().equals(this.getUUID()) == false)
            return false;
        if (other.getBatchSize() == null ^ this.getBatchSize() == null)
            return false;
        if (other.getBatchSize() != null && other.getBatchSize().equals(this.getBatchSize()) == false)
            return false;
        if (other.getMaximumBatchingWindowInSeconds() == null ^ this.getMaximumBatchingWindowInSeconds() == null)
            return false;
        if (other.getMaximumBatchingWindowInSeconds() != null
                && other.getMaximumBatchingWindowInSeconds().equals(this.getMaximumBatchingWindowInSeconds()) == false)
            return false;
        if (other.getParallelizationFactor() == null ^ this.getParallelizationFactor() == null)
            return false;
        if (other.getParallelizationFactor() != null && other.getParallelizationFactor().equals(this.getParallelizationFactor()) == false)
            return false;
        if (other.getEventSourceArn() == null ^ this.getEventSourceArn() == null)
            return false;
        if (other.getEventSourceArn() != null && other.getEventSourceArn().equals(this.getEventSourceArn()) == false)
            return false;
        if (other.getFunctionArn() == null ^ this.getFunctionArn() == null)
            return false;
        if (other.getFunctionArn() != null && other.getFunctionArn().equals(this.getFunctionArn()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getLastProcessingResult() == null ^ this.getLastProcessingResult() == null)
            return false;
        if (other.getLastProcessingResult() != null && other.getLastProcessingResult().equals(this.getLastProcessingResult()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateTransitionReason() == null ^ this.getStateTransitionReason() == null)
            return false;
        if (other.getStateTransitionReason() != null && other.getStateTransitionReason().equals(this.getStateTransitionReason()) == false)
            return false;
        if (other.getDestinationConfig() == null ^ this.getDestinationConfig() == null)
            return false;
        if (other.getDestinationConfig() != null && other.getDestinationConfig().equals(this.getDestinationConfig()) == false)
            return false;
        if (other.getMaximumRecordAgeInSeconds() == null ^ this.getMaximumRecordAgeInSeconds() == null)
            return false;
        if (other.getMaximumRecordAgeInSeconds() != null && other.getMaximumRecordAgeInSeconds().equals(this.getMaximumRecordAgeInSeconds()) == false)
            return false;
        if (other.getBisectBatchOnFunctionError() == null ^ this.getBisectBatchOnFunctionError() == null)
            return false;
        if (other.getBisectBatchOnFunctionError() != null && other.getBisectBatchOnFunctionError().equals(this.getBisectBatchOnFunctionError()) == false)
            return false;
        if (other.getMaximumRetryAttempts() == null ^ this.getMaximumRetryAttempts() == null)
            return false;
        if (other.getMaximumRetryAttempts() != null && other.getMaximumRetryAttempts().equals(this.getMaximumRetryAttempts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUUID() == null) ? 0 : getUUID().hashCode());
        hashCode = prime * hashCode + ((getBatchSize() == null) ? 0 : getBatchSize().hashCode());
        hashCode = prime * hashCode + ((getMaximumBatchingWindowInSeconds() == null) ? 0 : getMaximumBatchingWindowInSeconds().hashCode());
        hashCode = prime * hashCode + ((getParallelizationFactor() == null) ? 0 : getParallelizationFactor().hashCode());
        hashCode = prime * hashCode + ((getEventSourceArn() == null) ? 0 : getEventSourceArn().hashCode());
        hashCode = prime * hashCode + ((getFunctionArn() == null) ? 0 : getFunctionArn().hashCode());
        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getLastProcessingResult() == null) ? 0 : getLastProcessingResult().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateTransitionReason() == null) ? 0 : getStateTransitionReason().hashCode());
        hashCode = prime * hashCode + ((getDestinationConfig() == null) ? 0 : getDestinationConfig().hashCode());
        hashCode = prime * hashCode + ((getMaximumRecordAgeInSeconds() == null) ? 0 : getMaximumRecordAgeInSeconds().hashCode());
        hashCode = prime * hashCode + ((getBisectBatchOnFunctionError() == null) ? 0 : getBisectBatchOnFunctionError().hashCode());
        hashCode = prime * hashCode + ((getMaximumRetryAttempts() == null) ? 0 : getMaximumRetryAttempts().hashCode());
        return hashCode;
    }

    @Override
    public EventSourceMappingConfiguration clone() {
        try {
            return (EventSourceMappingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.EventSourceMappingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
