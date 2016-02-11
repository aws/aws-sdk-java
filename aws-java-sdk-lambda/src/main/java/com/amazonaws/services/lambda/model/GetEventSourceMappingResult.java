/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;

/**
 * <p>
 * Describes mapping between an Amazon Kinesis stream and a Lambda
 * function.
 * </p>
 */
public class GetEventSourceMappingResult implements Serializable, Cloneable {

    /**
     * The AWS Lambda assigned opaque identifier for the mapping.
     */
    private String uUID;

    /**
     * The largest number of records that AWS Lambda will retrieve from your
     * event source at the time of invoking your function. Your function
     * receives an event with all the retrieved records.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     */
    private Integer batchSize;

    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream that is
     * the source of events.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:([a-zA-Z0-9\-])+:([a-z]{2}-[a-z]+-\d{1})?:(\d{12})?:(.*)<br/>
     */
    private String eventSourceArn;

    /**
     * The Lambda function to invoke when AWS Lambda detects an event on the
     * stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function:[a-zA-Z0-9-_]+(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     */
    private String functionArn;

    /**
     * The UTC time string indicating the last time the event mapping was
     * updated.
     */
    private java.util.Date lastModified;

    /**
     * The result of the last AWS Lambda invocation of your Lambda function.
     */
    private String lastProcessingResult;

    /**
     * The state of the event source mapping. It can be
     * <code>Creating</code>, <code>Enabled</code>, <code>Disabled</code>,
     * <code>Enabling</code>, <code>Disabling</code>, <code>Updating</code>,
     * or <code>Deleting</code>.
     */
    private String state;

    /**
     * The reason the event source mapping is in its current state. It is
     * either user-requested or an AWS Lambda-initiated state transition.
     */
    private String stateTransitionReason;

    /**
     * The AWS Lambda assigned opaque identifier for the mapping.
     *
     * @return The AWS Lambda assigned opaque identifier for the mapping.
     */
    public String getUUID() {
        return uUID;
    }
    
    /**
     * The AWS Lambda assigned opaque identifier for the mapping.
     *
     * @param uUID The AWS Lambda assigned opaque identifier for the mapping.
     */
    public void setUUID(String uUID) {
        this.uUID = uUID;
    }
    
    /**
     * The AWS Lambda assigned opaque identifier for the mapping.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param uUID The AWS Lambda assigned opaque identifier for the mapping.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetEventSourceMappingResult withUUID(String uUID) {
        this.uUID = uUID;
        return this;
    }

    /**
     * The largest number of records that AWS Lambda will retrieve from your
     * event source at the time of invoking your function. Your function
     * receives an event with all the retrieved records.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @return The largest number of records that AWS Lambda will retrieve from your
     *         event source at the time of invoking your function. Your function
     *         receives an event with all the retrieved records.
     */
    public Integer getBatchSize() {
        return batchSize;
    }
    
    /**
     * The largest number of records that AWS Lambda will retrieve from your
     * event source at the time of invoking your function. Your function
     * receives an event with all the retrieved records.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param batchSize The largest number of records that AWS Lambda will retrieve from your
     *         event source at the time of invoking your function. Your function
     *         receives an event with all the retrieved records.
     */
    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }
    
    /**
     * The largest number of records that AWS Lambda will retrieve from your
     * event source at the time of invoking your function. Your function
     * receives an event with all the retrieved records.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param batchSize The largest number of records that AWS Lambda will retrieve from your
     *         event source at the time of invoking your function. Your function
     *         receives an event with all the retrieved records.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetEventSourceMappingResult withBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream that is
     * the source of events.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:([a-zA-Z0-9\-])+:([a-z]{2}-[a-z]+-\d{1})?:(\d{12})?:(.*)<br/>
     *
     * @return The Amazon Resource Name (ARN) of the Amazon Kinesis stream that is
     *         the source of events.
     */
    public String getEventSourceArn() {
        return eventSourceArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream that is
     * the source of events.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:([a-zA-Z0-9\-])+:([a-z]{2}-[a-z]+-\d{1})?:(\d{12})?:(.*)<br/>
     *
     * @param eventSourceArn The Amazon Resource Name (ARN) of the Amazon Kinesis stream that is
     *         the source of events.
     */
    public void setEventSourceArn(String eventSourceArn) {
        this.eventSourceArn = eventSourceArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream that is
     * the source of events.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:([a-zA-Z0-9\-])+:([a-z]{2}-[a-z]+-\d{1})?:(\d{12})?:(.*)<br/>
     *
     * @param eventSourceArn The Amazon Resource Name (ARN) of the Amazon Kinesis stream that is
     *         the source of events.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetEventSourceMappingResult withEventSourceArn(String eventSourceArn) {
        this.eventSourceArn = eventSourceArn;
        return this;
    }

    /**
     * The Lambda function to invoke when AWS Lambda detects an event on the
     * stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function:[a-zA-Z0-9-_]+(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @return The Lambda function to invoke when AWS Lambda detects an event on the
     *         stream.
     */
    public String getFunctionArn() {
        return functionArn;
    }
    
    /**
     * The Lambda function to invoke when AWS Lambda detects an event on the
     * stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function:[a-zA-Z0-9-_]+(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param functionArn The Lambda function to invoke when AWS Lambda detects an event on the
     *         stream.
     */
    public void setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
    }
    
    /**
     * The Lambda function to invoke when AWS Lambda detects an event on the
     * stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function:[a-zA-Z0-9-_]+(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param functionArn The Lambda function to invoke when AWS Lambda detects an event on the
     *         stream.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetEventSourceMappingResult withFunctionArn(String functionArn) {
        this.functionArn = functionArn;
        return this;
    }

    /**
     * The UTC time string indicating the last time the event mapping was
     * updated.
     *
     * @return The UTC time string indicating the last time the event mapping was
     *         updated.
     */
    public java.util.Date getLastModified() {
        return lastModified;
    }
    
    /**
     * The UTC time string indicating the last time the event mapping was
     * updated.
     *
     * @param lastModified The UTC time string indicating the last time the event mapping was
     *         updated.
     */
    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }
    
    /**
     * The UTC time string indicating the last time the event mapping was
     * updated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastModified The UTC time string indicating the last time the event mapping was
     *         updated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetEventSourceMappingResult withLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * The result of the last AWS Lambda invocation of your Lambda function.
     *
     * @return The result of the last AWS Lambda invocation of your Lambda function.
     */
    public String getLastProcessingResult() {
        return lastProcessingResult;
    }
    
    /**
     * The result of the last AWS Lambda invocation of your Lambda function.
     *
     * @param lastProcessingResult The result of the last AWS Lambda invocation of your Lambda function.
     */
    public void setLastProcessingResult(String lastProcessingResult) {
        this.lastProcessingResult = lastProcessingResult;
    }
    
    /**
     * The result of the last AWS Lambda invocation of your Lambda function.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastProcessingResult The result of the last AWS Lambda invocation of your Lambda function.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetEventSourceMappingResult withLastProcessingResult(String lastProcessingResult) {
        this.lastProcessingResult = lastProcessingResult;
        return this;
    }

    /**
     * The state of the event source mapping. It can be
     * <code>Creating</code>, <code>Enabled</code>, <code>Disabled</code>,
     * <code>Enabling</code>, <code>Disabling</code>, <code>Updating</code>,
     * or <code>Deleting</code>.
     *
     * @return The state of the event source mapping. It can be
     *         <code>Creating</code>, <code>Enabled</code>, <code>Disabled</code>,
     *         <code>Enabling</code>, <code>Disabling</code>, <code>Updating</code>,
     *         or <code>Deleting</code>.
     */
    public String getState() {
        return state;
    }
    
    /**
     * The state of the event source mapping. It can be
     * <code>Creating</code>, <code>Enabled</code>, <code>Disabled</code>,
     * <code>Enabling</code>, <code>Disabling</code>, <code>Updating</code>,
     * or <code>Deleting</code>.
     *
     * @param state The state of the event source mapping. It can be
     *         <code>Creating</code>, <code>Enabled</code>, <code>Disabled</code>,
     *         <code>Enabling</code>, <code>Disabling</code>, <code>Updating</code>,
     *         or <code>Deleting</code>.
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The state of the event source mapping. It can be
     * <code>Creating</code>, <code>Enabled</code>, <code>Disabled</code>,
     * <code>Enabling</code>, <code>Disabling</code>, <code>Updating</code>,
     * or <code>Deleting</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param state The state of the event source mapping. It can be
     *         <code>Creating</code>, <code>Enabled</code>, <code>Disabled</code>,
     *         <code>Enabling</code>, <code>Disabling</code>, <code>Updating</code>,
     *         or <code>Deleting</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetEventSourceMappingResult withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The reason the event source mapping is in its current state. It is
     * either user-requested or an AWS Lambda-initiated state transition.
     *
     * @return The reason the event source mapping is in its current state. It is
     *         either user-requested or an AWS Lambda-initiated state transition.
     */
    public String getStateTransitionReason() {
        return stateTransitionReason;
    }
    
    /**
     * The reason the event source mapping is in its current state. It is
     * either user-requested or an AWS Lambda-initiated state transition.
     *
     * @param stateTransitionReason The reason the event source mapping is in its current state. It is
     *         either user-requested or an AWS Lambda-initiated state transition.
     */
    public void setStateTransitionReason(String stateTransitionReason) {
        this.stateTransitionReason = stateTransitionReason;
    }
    
    /**
     * The reason the event source mapping is in its current state. It is
     * either user-requested or an AWS Lambda-initiated state transition.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stateTransitionReason The reason the event source mapping is in its current state. It is
     *         either user-requested or an AWS Lambda-initiated state transition.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetEventSourceMappingResult withStateTransitionReason(String stateTransitionReason) {
        this.stateTransitionReason = stateTransitionReason;
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
        if (getUUID() != null) sb.append("UUID: " + getUUID() + ",");
        if (getBatchSize() != null) sb.append("BatchSize: " + getBatchSize() + ",");
        if (getEventSourceArn() != null) sb.append("EventSourceArn: " + getEventSourceArn() + ",");
        if (getFunctionArn() != null) sb.append("FunctionArn: " + getFunctionArn() + ",");
        if (getLastModified() != null) sb.append("LastModified: " + getLastModified() + ",");
        if (getLastProcessingResult() != null) sb.append("LastProcessingResult: " + getLastProcessingResult() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getStateTransitionReason() != null) sb.append("StateTransitionReason: " + getStateTransitionReason() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetEventSourceMappingResult == false) return false;
        GetEventSourceMappingResult other = (GetEventSourceMappingResult)obj;
        
        if (other.getUUID() == null ^ this.getUUID() == null) return false;
        if (other.getUUID() != null && other.getUUID().equals(this.getUUID()) == false) return false; 
        if (other.getBatchSize() == null ^ this.getBatchSize() == null) return false;
        if (other.getBatchSize() != null && other.getBatchSize().equals(this.getBatchSize()) == false) return false; 
        if (other.getEventSourceArn() == null ^ this.getEventSourceArn() == null) return false;
        if (other.getEventSourceArn() != null && other.getEventSourceArn().equals(this.getEventSourceArn()) == false) return false; 
        if (other.getFunctionArn() == null ^ this.getFunctionArn() == null) return false;
        if (other.getFunctionArn() != null && other.getFunctionArn().equals(this.getFunctionArn()) == false) return false; 
        if (other.getLastModified() == null ^ this.getLastModified() == null) return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false) return false; 
        if (other.getLastProcessingResult() == null ^ this.getLastProcessingResult() == null) return false;
        if (other.getLastProcessingResult() != null && other.getLastProcessingResult().equals(this.getLastProcessingResult()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getStateTransitionReason() == null ^ this.getStateTransitionReason() == null) return false;
        if (other.getStateTransitionReason() != null && other.getStateTransitionReason().equals(this.getStateTransitionReason()) == false) return false; 
        return true;
    }
    
    @Override
    public GetEventSourceMappingResult clone() {
        try {
            return (GetEventSourceMappingResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    