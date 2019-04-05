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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateEventSourceMapping" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEventSourceMappingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event source.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Amazon Kinesis</b> - The ARN of the data stream or a stream consumer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon DynamoDB Streams</b> - The ARN of the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon Simple Queue Service</b> - The ARN of the queue.
     * </p>
     * </li>
     * </ul>
     */
    private String eventSourceArn;
    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Version or Alias ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length constraint applies only to the full ARN. If you specify only the function name, it's limited to 64
     * characters in length.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * Disables the event source mapping to pause polling and invocation.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The maximum number of items to retrieve in a single batch.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Amazon Kinesis</b> - Default 100. Max 10,000.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon DynamoDB Streams</b> - Default 100. Max 1,000.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon Simple Queue Service</b> - Default 10. Max 10.
     * </p>
     * </li>
     * </ul>
     */
    private Integer batchSize;
    /**
     * <p>
     * The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB Streams
     * sources. <code>AT_TIMESTAMP</code> is only supported for Amazon Kinesis streams.
     * </p>
     */
    private String startingPosition;
    /**
     * <p>
     * With <code>StartingPosition</code> set to <code>AT_TIMESTAMP</code>, the time from which to start reading.
     * </p>
     */
    private java.util.Date startingPositionTimestamp;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event source.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Amazon Kinesis</b> - The ARN of the data stream or a stream consumer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon DynamoDB Streams</b> - The ARN of the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon Simple Queue Service</b> - The ARN of the queue.
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventSourceArn
     *        The Amazon Resource Name (ARN) of the event source.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Amazon Kinesis</b> - The ARN of the data stream or a stream consumer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon DynamoDB Streams</b> - The ARN of the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon Simple Queue Service</b> - The ARN of the queue.
     *        </p>
     *        </li>
     */

    public void setEventSourceArn(String eventSourceArn) {
        this.eventSourceArn = eventSourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event source.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Amazon Kinesis</b> - The ARN of the data stream or a stream consumer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon DynamoDB Streams</b> - The ARN of the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon Simple Queue Service</b> - The ARN of the queue.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) of the event source.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Amazon Kinesis</b> - The ARN of the data stream or a stream consumer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Amazon DynamoDB Streams</b> - The ARN of the stream.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Amazon Simple Queue Service</b> - The ARN of the queue.
     *         </p>
     *         </li>
     */

    public String getEventSourceArn() {
        return this.eventSourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event source.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Amazon Kinesis</b> - The ARN of the data stream or a stream consumer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon DynamoDB Streams</b> - The ARN of the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon Simple Queue Service</b> - The ARN of the queue.
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventSourceArn
     *        The Amazon Resource Name (ARN) of the event source.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Amazon Kinesis</b> - The ARN of the data stream or a stream consumer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon DynamoDB Streams</b> - The ARN of the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon Simple Queue Service</b> - The ARN of the queue.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingRequest withEventSourceArn(String eventSourceArn) {
        setEventSourceArn(eventSourceArn);
        return this;
    }

    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Version or Alias ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length constraint applies only to the full ARN. If you specify only the function name, it's limited to 64
     * characters in length.
     * </p>
     * 
     * @param functionName
     *        The name of the Lambda function.</p>
     *        <p class="title">
     *        <b>Name formats</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Function name</b> - <code>MyFunction</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Version or Alias ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The length constraint applies only to the full ARN. If you specify only the function name, it's limited to
     *        64 characters in length.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Version or Alias ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length constraint applies only to the full ARN. If you specify only the function name, it's limited to 64
     * characters in length.
     * </p>
     * 
     * @return The name of the Lambda function.</p>
     *         <p class="title">
     *         <b>Name formats</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Function name</b> - <code>MyFunction</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Version or Alias ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The length constraint applies only to the full ARN. If you specify only the function name, it's limited
     *         to 64 characters in length.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Version or Alias ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length constraint applies only to the full ARN. If you specify only the function name, it's limited to 64
     * characters in length.
     * </p>
     * 
     * @param functionName
     *        The name of the Lambda function.</p>
     *        <p class="title">
     *        <b>Name formats</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Function name</b> - <code>MyFunction</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Version or Alias ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The length constraint applies only to the full ARN. If you specify only the function name, it's limited to
     *        64 characters in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * Disables the event source mapping to pause polling and invocation.
     * </p>
     * 
     * @param enabled
     *        Disables the event source mapping to pause polling and invocation.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Disables the event source mapping to pause polling and invocation.
     * </p>
     * 
     * @return Disables the event source mapping to pause polling and invocation.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Disables the event source mapping to pause polling and invocation.
     * </p>
     * 
     * @param enabled
     *        Disables the event source mapping to pause polling and invocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Disables the event source mapping to pause polling and invocation.
     * </p>
     * 
     * @return Disables the event source mapping to pause polling and invocation.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The maximum number of items to retrieve in a single batch.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Amazon Kinesis</b> - Default 100. Max 10,000.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon DynamoDB Streams</b> - Default 100. Max 1,000.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon Simple Queue Service</b> - Default 10. Max 10.
     * </p>
     * </li>
     * </ul>
     * 
     * @param batchSize
     *        The maximum number of items to retrieve in a single batch.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Amazon Kinesis</b> - Default 100. Max 10,000.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon DynamoDB Streams</b> - Default 100. Max 1,000.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon Simple Queue Service</b> - Default 10. Max 10.
     *        </p>
     *        </li>
     */

    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    /**
     * <p>
     * The maximum number of items to retrieve in a single batch.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Amazon Kinesis</b> - Default 100. Max 10,000.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon DynamoDB Streams</b> - Default 100. Max 1,000.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon Simple Queue Service</b> - Default 10. Max 10.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The maximum number of items to retrieve in a single batch.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Amazon Kinesis</b> - Default 100. Max 10,000.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Amazon DynamoDB Streams</b> - Default 100. Max 1,000.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Amazon Simple Queue Service</b> - Default 10. Max 10.
     *         </p>
     *         </li>
     */

    public Integer getBatchSize() {
        return this.batchSize;
    }

    /**
     * <p>
     * The maximum number of items to retrieve in a single batch.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Amazon Kinesis</b> - Default 100. Max 10,000.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon DynamoDB Streams</b> - Default 100. Max 1,000.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon Simple Queue Service</b> - Default 10. Max 10.
     * </p>
     * </li>
     * </ul>
     * 
     * @param batchSize
     *        The maximum number of items to retrieve in a single batch.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Amazon Kinesis</b> - Default 100. Max 10,000.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon DynamoDB Streams</b> - Default 100. Max 1,000.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon Simple Queue Service</b> - Default 10. Max 10.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingRequest withBatchSize(Integer batchSize) {
        setBatchSize(batchSize);
        return this;
    }

    /**
     * <p>
     * The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB Streams
     * sources. <code>AT_TIMESTAMP</code> is only supported for Amazon Kinesis streams.
     * </p>
     * 
     * @param startingPosition
     *        The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB
     *        Streams sources. <code>AT_TIMESTAMP</code> is only supported for Amazon Kinesis streams.
     * @see EventSourcePosition
     */

    public void setStartingPosition(String startingPosition) {
        this.startingPosition = startingPosition;
    }

    /**
     * <p>
     * The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB Streams
     * sources. <code>AT_TIMESTAMP</code> is only supported for Amazon Kinesis streams.
     * </p>
     * 
     * @return The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB
     *         Streams sources. <code>AT_TIMESTAMP</code> is only supported for Amazon Kinesis streams.
     * @see EventSourcePosition
     */

    public String getStartingPosition() {
        return this.startingPosition;
    }

    /**
     * <p>
     * The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB Streams
     * sources. <code>AT_TIMESTAMP</code> is only supported for Amazon Kinesis streams.
     * </p>
     * 
     * @param startingPosition
     *        The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB
     *        Streams sources. <code>AT_TIMESTAMP</code> is only supported for Amazon Kinesis streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventSourcePosition
     */

    public CreateEventSourceMappingRequest withStartingPosition(String startingPosition) {
        setStartingPosition(startingPosition);
        return this;
    }

    /**
     * <p>
     * The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB Streams
     * sources. <code>AT_TIMESTAMP</code> is only supported for Amazon Kinesis streams.
     * </p>
     * 
     * @param startingPosition
     *        The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB
     *        Streams sources. <code>AT_TIMESTAMP</code> is only supported for Amazon Kinesis streams.
     * @see EventSourcePosition
     */

    public void setStartingPosition(EventSourcePosition startingPosition) {
        withStartingPosition(startingPosition);
    }

    /**
     * <p>
     * The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB Streams
     * sources. <code>AT_TIMESTAMP</code> is only supported for Amazon Kinesis streams.
     * </p>
     * 
     * @param startingPosition
     *        The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB
     *        Streams sources. <code>AT_TIMESTAMP</code> is only supported for Amazon Kinesis streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventSourcePosition
     */

    public CreateEventSourceMappingRequest withStartingPosition(EventSourcePosition startingPosition) {
        this.startingPosition = startingPosition.toString();
        return this;
    }

    /**
     * <p>
     * With <code>StartingPosition</code> set to <code>AT_TIMESTAMP</code>, the time from which to start reading.
     * </p>
     * 
     * @param startingPositionTimestamp
     *        With <code>StartingPosition</code> set to <code>AT_TIMESTAMP</code>, the time from which to start reading.
     */

    public void setStartingPositionTimestamp(java.util.Date startingPositionTimestamp) {
        this.startingPositionTimestamp = startingPositionTimestamp;
    }

    /**
     * <p>
     * With <code>StartingPosition</code> set to <code>AT_TIMESTAMP</code>, the time from which to start reading.
     * </p>
     * 
     * @return With <code>StartingPosition</code> set to <code>AT_TIMESTAMP</code>, the time from which to start
     *         reading.
     */

    public java.util.Date getStartingPositionTimestamp() {
        return this.startingPositionTimestamp;
    }

    /**
     * <p>
     * With <code>StartingPosition</code> set to <code>AT_TIMESTAMP</code>, the time from which to start reading.
     * </p>
     * 
     * @param startingPositionTimestamp
     *        With <code>StartingPosition</code> set to <code>AT_TIMESTAMP</code>, the time from which to start reading.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingRequest withStartingPositionTimestamp(java.util.Date startingPositionTimestamp) {
        setStartingPositionTimestamp(startingPositionTimestamp);
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
        if (getEventSourceArn() != null)
            sb.append("EventSourceArn: ").append(getEventSourceArn()).append(",");
        if (getFunctionName() != null)
            sb.append("FunctionName: ").append(getFunctionName()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getBatchSize() != null)
            sb.append("BatchSize: ").append(getBatchSize()).append(",");
        if (getStartingPosition() != null)
            sb.append("StartingPosition: ").append(getStartingPosition()).append(",");
        if (getStartingPositionTimestamp() != null)
            sb.append("StartingPositionTimestamp: ").append(getStartingPositionTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEventSourceMappingRequest == false)
            return false;
        CreateEventSourceMappingRequest other = (CreateEventSourceMappingRequest) obj;
        if (other.getEventSourceArn() == null ^ this.getEventSourceArn() == null)
            return false;
        if (other.getEventSourceArn() != null && other.getEventSourceArn().equals(this.getEventSourceArn()) == false)
            return false;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getBatchSize() == null ^ this.getBatchSize() == null)
            return false;
        if (other.getBatchSize() != null && other.getBatchSize().equals(this.getBatchSize()) == false)
            return false;
        if (other.getStartingPosition() == null ^ this.getStartingPosition() == null)
            return false;
        if (other.getStartingPosition() != null && other.getStartingPosition().equals(this.getStartingPosition()) == false)
            return false;
        if (other.getStartingPositionTimestamp() == null ^ this.getStartingPositionTimestamp() == null)
            return false;
        if (other.getStartingPositionTimestamp() != null && other.getStartingPositionTimestamp().equals(this.getStartingPositionTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventSourceArn() == null) ? 0 : getEventSourceArn().hashCode());
        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getBatchSize() == null) ? 0 : getBatchSize().hashCode());
        hashCode = prime * hashCode + ((getStartingPosition() == null) ? 0 : getStartingPosition().hashCode());
        hashCode = prime * hashCode + ((getStartingPositionTimestamp() == null) ? 0 : getStartingPositionTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public CreateEventSourceMappingRequest clone() {
        return (CreateEventSourceMappingRequest) super.clone();
    }

}
