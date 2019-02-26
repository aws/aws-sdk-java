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

/**
 * <p>
 * A mapping between an AWS resource and an AWS Lambda function. See <a>CreateEventSourceMapping</a> for details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateEventSourceMapping" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEventSourceMappingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * The date that the event source mapping was last updated.
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
     * The cause of the last state change, either <code>User initiated</code> or <code>Lambda initiated</code>.
     * </p>
     */
    private String stateTransitionReason;

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

    public CreateEventSourceMappingResult withUUID(String uUID) {
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

    public CreateEventSourceMappingResult withBatchSize(Integer batchSize) {
        setBatchSize(batchSize);
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

    public CreateEventSourceMappingResult withEventSourceArn(String eventSourceArn) {
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

    public CreateEventSourceMappingResult withFunctionArn(String functionArn) {
        setFunctionArn(functionArn);
        return this;
    }

    /**
     * <p>
     * The date that the event source mapping was last updated.
     * </p>
     * 
     * @param lastModified
     *        The date that the event source mapping was last updated.
     */

    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The date that the event source mapping was last updated.
     * </p>
     * 
     * @return The date that the event source mapping was last updated.
     */

    public java.util.Date getLastModified() {
        return this.lastModified;
    }

    /**
     * <p>
     * The date that the event source mapping was last updated.
     * </p>
     * 
     * @param lastModified
     *        The date that the event source mapping was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingResult withLastModified(java.util.Date lastModified) {
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

    public CreateEventSourceMappingResult withLastProcessingResult(String lastProcessingResult) {
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

    public CreateEventSourceMappingResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The cause of the last state change, either <code>User initiated</code> or <code>Lambda initiated</code>.
     * </p>
     * 
     * @param stateTransitionReason
     *        The cause of the last state change, either <code>User initiated</code> or <code>Lambda initiated</code>.
     */

    public void setStateTransitionReason(String stateTransitionReason) {
        this.stateTransitionReason = stateTransitionReason;
    }

    /**
     * <p>
     * The cause of the last state change, either <code>User initiated</code> or <code>Lambda initiated</code>.
     * </p>
     * 
     * @return The cause of the last state change, either <code>User initiated</code> or <code>Lambda initiated</code>.
     */

    public String getStateTransitionReason() {
        return this.stateTransitionReason;
    }

    /**
     * <p>
     * The cause of the last state change, either <code>User initiated</code> or <code>Lambda initiated</code>.
     * </p>
     * 
     * @param stateTransitionReason
     *        The cause of the last state change, either <code>User initiated</code> or <code>Lambda initiated</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingResult withStateTransitionReason(String stateTransitionReason) {
        setStateTransitionReason(stateTransitionReason);
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
            sb.append("StateTransitionReason: ").append(getStateTransitionReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEventSourceMappingResult == false)
            return false;
        CreateEventSourceMappingResult other = (CreateEventSourceMappingResult) obj;
        if (other.getUUID() == null ^ this.getUUID() == null)
            return false;
        if (other.getUUID() != null && other.getUUID().equals(this.getUUID()) == false)
            return false;
        if (other.getBatchSize() == null ^ this.getBatchSize() == null)
            return false;
        if (other.getBatchSize() != null && other.getBatchSize().equals(this.getBatchSize()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUUID() == null) ? 0 : getUUID().hashCode());
        hashCode = prime * hashCode + ((getBatchSize() == null) ? 0 : getBatchSize().hashCode());
        hashCode = prime * hashCode + ((getEventSourceArn() == null) ? 0 : getEventSourceArn().hashCode());
        hashCode = prime * hashCode + ((getFunctionArn() == null) ? 0 : getFunctionArn().hashCode());
        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getLastProcessingResult() == null) ? 0 : getLastProcessingResult().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateTransitionReason() == null) ? 0 : getStateTransitionReason().hashCode());
        return hashCode;
    }

    @Override
    public CreateEventSourceMappingResult clone() {
        try {
            return (CreateEventSourceMappingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
