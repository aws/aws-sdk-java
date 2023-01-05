/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pipes.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters for using a DynamoDB stream as a source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/UpdatePipeSourceDynamoDBStreamParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePipeSourceDynamoDBStreamParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of records to include in each batch.
     * </p>
     */
    private Integer batchSize;
    /**
     * <p>
     * Define the target queue to send dead-letter queue events to.
     * </p>
     */
    private DeadLetterConfig deadLetterConfig;
    /**
     * <p>
     * The maximum length of a time to wait for events.
     * </p>
     */
    private Integer maximumBatchingWindowInSeconds;
    /**
     * <p>
     * (Streams only) Discard records older than the specified age. The default value is -1, which sets the maximum age
     * to infinite. When the value is set to infinite, EventBridge never discards old records.
     * </p>
     */
    private Integer maximumRecordAgeInSeconds;
    /**
     * <p>
     * (Streams only) Discard records after the specified number of retries. The default value is -1, which sets the
     * maximum number of retries to infinite. When MaximumRetryAttempts is infinite, EventBridge retries failed records
     * until the record expires in the event source.
     * </p>
     */
    private Integer maximumRetryAttempts;
    /**
     * <p>
     * (Streams only) Define how to handle item process failures. <code>AUTOMATIC_BISECT</code> halves each batch and
     * retry each half until all the records are processed or there is one failed message left in the batch.
     * </p>
     */
    private String onPartialBatchItemFailure;
    /**
     * <p>
     * (Streams only) The number of batches to process concurrently from each shard. The default value is 1.
     * </p>
     */
    private Integer parallelizationFactor;

    /**
     * <p>
     * The maximum number of records to include in each batch.
     * </p>
     * 
     * @param batchSize
     *        The maximum number of records to include in each batch.
     */

    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    /**
     * <p>
     * The maximum number of records to include in each batch.
     * </p>
     * 
     * @return The maximum number of records to include in each batch.
     */

    public Integer getBatchSize() {
        return this.batchSize;
    }

    /**
     * <p>
     * The maximum number of records to include in each batch.
     * </p>
     * 
     * @param batchSize
     *        The maximum number of records to include in each batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePipeSourceDynamoDBStreamParameters withBatchSize(Integer batchSize) {
        setBatchSize(batchSize);
        return this;
    }

    /**
     * <p>
     * Define the target queue to send dead-letter queue events to.
     * </p>
     * 
     * @param deadLetterConfig
     *        Define the target queue to send dead-letter queue events to.
     */

    public void setDeadLetterConfig(DeadLetterConfig deadLetterConfig) {
        this.deadLetterConfig = deadLetterConfig;
    }

    /**
     * <p>
     * Define the target queue to send dead-letter queue events to.
     * </p>
     * 
     * @return Define the target queue to send dead-letter queue events to.
     */

    public DeadLetterConfig getDeadLetterConfig() {
        return this.deadLetterConfig;
    }

    /**
     * <p>
     * Define the target queue to send dead-letter queue events to.
     * </p>
     * 
     * @param deadLetterConfig
     *        Define the target queue to send dead-letter queue events to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePipeSourceDynamoDBStreamParameters withDeadLetterConfig(DeadLetterConfig deadLetterConfig) {
        setDeadLetterConfig(deadLetterConfig);
        return this;
    }

    /**
     * <p>
     * The maximum length of a time to wait for events.
     * </p>
     * 
     * @param maximumBatchingWindowInSeconds
     *        The maximum length of a time to wait for events.
     */

    public void setMaximumBatchingWindowInSeconds(Integer maximumBatchingWindowInSeconds) {
        this.maximumBatchingWindowInSeconds = maximumBatchingWindowInSeconds;
    }

    /**
     * <p>
     * The maximum length of a time to wait for events.
     * </p>
     * 
     * @return The maximum length of a time to wait for events.
     */

    public Integer getMaximumBatchingWindowInSeconds() {
        return this.maximumBatchingWindowInSeconds;
    }

    /**
     * <p>
     * The maximum length of a time to wait for events.
     * </p>
     * 
     * @param maximumBatchingWindowInSeconds
     *        The maximum length of a time to wait for events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePipeSourceDynamoDBStreamParameters withMaximumBatchingWindowInSeconds(Integer maximumBatchingWindowInSeconds) {
        setMaximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds);
        return this;
    }

    /**
     * <p>
     * (Streams only) Discard records older than the specified age. The default value is -1, which sets the maximum age
     * to infinite. When the value is set to infinite, EventBridge never discards old records.
     * </p>
     * 
     * @param maximumRecordAgeInSeconds
     *        (Streams only) Discard records older than the specified age. The default value is -1, which sets the
     *        maximum age to infinite. When the value is set to infinite, EventBridge never discards old records.
     */

    public void setMaximumRecordAgeInSeconds(Integer maximumRecordAgeInSeconds) {
        this.maximumRecordAgeInSeconds = maximumRecordAgeInSeconds;
    }

    /**
     * <p>
     * (Streams only) Discard records older than the specified age. The default value is -1, which sets the maximum age
     * to infinite. When the value is set to infinite, EventBridge never discards old records.
     * </p>
     * 
     * @return (Streams only) Discard records older than the specified age. The default value is -1, which sets the
     *         maximum age to infinite. When the value is set to infinite, EventBridge never discards old records.
     */

    public Integer getMaximumRecordAgeInSeconds() {
        return this.maximumRecordAgeInSeconds;
    }

    /**
     * <p>
     * (Streams only) Discard records older than the specified age. The default value is -1, which sets the maximum age
     * to infinite. When the value is set to infinite, EventBridge never discards old records.
     * </p>
     * 
     * @param maximumRecordAgeInSeconds
     *        (Streams only) Discard records older than the specified age. The default value is -1, which sets the
     *        maximum age to infinite. When the value is set to infinite, EventBridge never discards old records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePipeSourceDynamoDBStreamParameters withMaximumRecordAgeInSeconds(Integer maximumRecordAgeInSeconds) {
        setMaximumRecordAgeInSeconds(maximumRecordAgeInSeconds);
        return this;
    }

    /**
     * <p>
     * (Streams only) Discard records after the specified number of retries. The default value is -1, which sets the
     * maximum number of retries to infinite. When MaximumRetryAttempts is infinite, EventBridge retries failed records
     * until the record expires in the event source.
     * </p>
     * 
     * @param maximumRetryAttempts
     *        (Streams only) Discard records after the specified number of retries. The default value is -1, which sets
     *        the maximum number of retries to infinite. When MaximumRetryAttempts is infinite, EventBridge retries
     *        failed records until the record expires in the event source.
     */

    public void setMaximumRetryAttempts(Integer maximumRetryAttempts) {
        this.maximumRetryAttempts = maximumRetryAttempts;
    }

    /**
     * <p>
     * (Streams only) Discard records after the specified number of retries. The default value is -1, which sets the
     * maximum number of retries to infinite. When MaximumRetryAttempts is infinite, EventBridge retries failed records
     * until the record expires in the event source.
     * </p>
     * 
     * @return (Streams only) Discard records after the specified number of retries. The default value is -1, which sets
     *         the maximum number of retries to infinite. When MaximumRetryAttempts is infinite, EventBridge retries
     *         failed records until the record expires in the event source.
     */

    public Integer getMaximumRetryAttempts() {
        return this.maximumRetryAttempts;
    }

    /**
     * <p>
     * (Streams only) Discard records after the specified number of retries. The default value is -1, which sets the
     * maximum number of retries to infinite. When MaximumRetryAttempts is infinite, EventBridge retries failed records
     * until the record expires in the event source.
     * </p>
     * 
     * @param maximumRetryAttempts
     *        (Streams only) Discard records after the specified number of retries. The default value is -1, which sets
     *        the maximum number of retries to infinite. When MaximumRetryAttempts is infinite, EventBridge retries
     *        failed records until the record expires in the event source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePipeSourceDynamoDBStreamParameters withMaximumRetryAttempts(Integer maximumRetryAttempts) {
        setMaximumRetryAttempts(maximumRetryAttempts);
        return this;
    }

    /**
     * <p>
     * (Streams only) Define how to handle item process failures. <code>AUTOMATIC_BISECT</code> halves each batch and
     * retry each half until all the records are processed or there is one failed message left in the batch.
     * </p>
     * 
     * @param onPartialBatchItemFailure
     *        (Streams only) Define how to handle item process failures. <code>AUTOMATIC_BISECT</code> halves each batch
     *        and retry each half until all the records are processed or there is one failed message left in the batch.
     * @see OnPartialBatchItemFailureStreams
     */

    public void setOnPartialBatchItemFailure(String onPartialBatchItemFailure) {
        this.onPartialBatchItemFailure = onPartialBatchItemFailure;
    }

    /**
     * <p>
     * (Streams only) Define how to handle item process failures. <code>AUTOMATIC_BISECT</code> halves each batch and
     * retry each half until all the records are processed or there is one failed message left in the batch.
     * </p>
     * 
     * @return (Streams only) Define how to handle item process failures. <code>AUTOMATIC_BISECT</code> halves each
     *         batch and retry each half until all the records are processed or there is one failed message left in the
     *         batch.
     * @see OnPartialBatchItemFailureStreams
     */

    public String getOnPartialBatchItemFailure() {
        return this.onPartialBatchItemFailure;
    }

    /**
     * <p>
     * (Streams only) Define how to handle item process failures. <code>AUTOMATIC_BISECT</code> halves each batch and
     * retry each half until all the records are processed or there is one failed message left in the batch.
     * </p>
     * 
     * @param onPartialBatchItemFailure
     *        (Streams only) Define how to handle item process failures. <code>AUTOMATIC_BISECT</code> halves each batch
     *        and retry each half until all the records are processed or there is one failed message left in the batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OnPartialBatchItemFailureStreams
     */

    public UpdatePipeSourceDynamoDBStreamParameters withOnPartialBatchItemFailure(String onPartialBatchItemFailure) {
        setOnPartialBatchItemFailure(onPartialBatchItemFailure);
        return this;
    }

    /**
     * <p>
     * (Streams only) Define how to handle item process failures. <code>AUTOMATIC_BISECT</code> halves each batch and
     * retry each half until all the records are processed or there is one failed message left in the batch.
     * </p>
     * 
     * @param onPartialBatchItemFailure
     *        (Streams only) Define how to handle item process failures. <code>AUTOMATIC_BISECT</code> halves each batch
     *        and retry each half until all the records are processed or there is one failed message left in the batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OnPartialBatchItemFailureStreams
     */

    public UpdatePipeSourceDynamoDBStreamParameters withOnPartialBatchItemFailure(OnPartialBatchItemFailureStreams onPartialBatchItemFailure) {
        this.onPartialBatchItemFailure = onPartialBatchItemFailure.toString();
        return this;
    }

    /**
     * <p>
     * (Streams only) The number of batches to process concurrently from each shard. The default value is 1.
     * </p>
     * 
     * @param parallelizationFactor
     *        (Streams only) The number of batches to process concurrently from each shard. The default value is 1.
     */

    public void setParallelizationFactor(Integer parallelizationFactor) {
        this.parallelizationFactor = parallelizationFactor;
    }

    /**
     * <p>
     * (Streams only) The number of batches to process concurrently from each shard. The default value is 1.
     * </p>
     * 
     * @return (Streams only) The number of batches to process concurrently from each shard. The default value is 1.
     */

    public Integer getParallelizationFactor() {
        return this.parallelizationFactor;
    }

    /**
     * <p>
     * (Streams only) The number of batches to process concurrently from each shard. The default value is 1.
     * </p>
     * 
     * @param parallelizationFactor
     *        (Streams only) The number of batches to process concurrently from each shard. The default value is 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePipeSourceDynamoDBStreamParameters withParallelizationFactor(Integer parallelizationFactor) {
        setParallelizationFactor(parallelizationFactor);
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
        if (getBatchSize() != null)
            sb.append("BatchSize: ").append(getBatchSize()).append(",");
        if (getDeadLetterConfig() != null)
            sb.append("DeadLetterConfig: ").append(getDeadLetterConfig()).append(",");
        if (getMaximumBatchingWindowInSeconds() != null)
            sb.append("MaximumBatchingWindowInSeconds: ").append(getMaximumBatchingWindowInSeconds()).append(",");
        if (getMaximumRecordAgeInSeconds() != null)
            sb.append("MaximumRecordAgeInSeconds: ").append(getMaximumRecordAgeInSeconds()).append(",");
        if (getMaximumRetryAttempts() != null)
            sb.append("MaximumRetryAttempts: ").append(getMaximumRetryAttempts()).append(",");
        if (getOnPartialBatchItemFailure() != null)
            sb.append("OnPartialBatchItemFailure: ").append(getOnPartialBatchItemFailure()).append(",");
        if (getParallelizationFactor() != null)
            sb.append("ParallelizationFactor: ").append(getParallelizationFactor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePipeSourceDynamoDBStreamParameters == false)
            return false;
        UpdatePipeSourceDynamoDBStreamParameters other = (UpdatePipeSourceDynamoDBStreamParameters) obj;
        if (other.getBatchSize() == null ^ this.getBatchSize() == null)
            return false;
        if (other.getBatchSize() != null && other.getBatchSize().equals(this.getBatchSize()) == false)
            return false;
        if (other.getDeadLetterConfig() == null ^ this.getDeadLetterConfig() == null)
            return false;
        if (other.getDeadLetterConfig() != null && other.getDeadLetterConfig().equals(this.getDeadLetterConfig()) == false)
            return false;
        if (other.getMaximumBatchingWindowInSeconds() == null ^ this.getMaximumBatchingWindowInSeconds() == null)
            return false;
        if (other.getMaximumBatchingWindowInSeconds() != null
                && other.getMaximumBatchingWindowInSeconds().equals(this.getMaximumBatchingWindowInSeconds()) == false)
            return false;
        if (other.getMaximumRecordAgeInSeconds() == null ^ this.getMaximumRecordAgeInSeconds() == null)
            return false;
        if (other.getMaximumRecordAgeInSeconds() != null && other.getMaximumRecordAgeInSeconds().equals(this.getMaximumRecordAgeInSeconds()) == false)
            return false;
        if (other.getMaximumRetryAttempts() == null ^ this.getMaximumRetryAttempts() == null)
            return false;
        if (other.getMaximumRetryAttempts() != null && other.getMaximumRetryAttempts().equals(this.getMaximumRetryAttempts()) == false)
            return false;
        if (other.getOnPartialBatchItemFailure() == null ^ this.getOnPartialBatchItemFailure() == null)
            return false;
        if (other.getOnPartialBatchItemFailure() != null && other.getOnPartialBatchItemFailure().equals(this.getOnPartialBatchItemFailure()) == false)
            return false;
        if (other.getParallelizationFactor() == null ^ this.getParallelizationFactor() == null)
            return false;
        if (other.getParallelizationFactor() != null && other.getParallelizationFactor().equals(this.getParallelizationFactor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBatchSize() == null) ? 0 : getBatchSize().hashCode());
        hashCode = prime * hashCode + ((getDeadLetterConfig() == null) ? 0 : getDeadLetterConfig().hashCode());
        hashCode = prime * hashCode + ((getMaximumBatchingWindowInSeconds() == null) ? 0 : getMaximumBatchingWindowInSeconds().hashCode());
        hashCode = prime * hashCode + ((getMaximumRecordAgeInSeconds() == null) ? 0 : getMaximumRecordAgeInSeconds().hashCode());
        hashCode = prime * hashCode + ((getMaximumRetryAttempts() == null) ? 0 : getMaximumRetryAttempts().hashCode());
        hashCode = prime * hashCode + ((getOnPartialBatchItemFailure() == null) ? 0 : getOnPartialBatchItemFailure().hashCode());
        hashCode = prime * hashCode + ((getParallelizationFactor() == null) ? 0 : getParallelizationFactor().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePipeSourceDynamoDBStreamParameters clone() {
        try {
            return (UpdatePipeSourceDynamoDBStreamParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pipes.model.transform.UpdatePipeSourceDynamoDBStreamParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
