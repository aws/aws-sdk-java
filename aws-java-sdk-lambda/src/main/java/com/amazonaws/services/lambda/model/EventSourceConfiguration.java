/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class EventSourceConfiguration implements Serializable {

    /**
     * The AWS Lambda assigned opaque identifier for the mapping.
     */
    private String uUID;

    /**
     * The largest number of records that AWS Lambda will POST in the
     * invocation request to your function.
     */
    private Integer batchSize;

    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream that is
     * the source of events.
     */
    private String eventSource;

    /**
     * The Lambda function to invoke when AWS Lambda detects an event on the
     * stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-]+<br/>
     */
    private String functionName;

    /**
     * The map (key-value pairs) defining the configuration for AWS Lambda to
     * use when reading the event source.
     */
    private java.util.Map<String,String> parameters;

    /**
     * The ARN of the IAM role (invocation role) that AWS Lambda can assume
     * to read from the stream and invoke the function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_]+<br/>
     */
    private String role;

    /**
     * The UTC time string indicating the last time the event mapping was
     * updated.
     */
    private String lastModified;

    /**
     * Indicates whether the event source mapping is currently honored.
     * Events are only processes if IsActive is true.
     */
    private String isActive;

    /**
     * The description of the health of the event source mapping. Valid
     * values are: "PENDING", "OK", and "PROBLEM:<i>message</i>". Initially
     * this staus is "PENDING". When AWS Lambda begins processing events, it
     * changes the status to "OK".
     */
    private String status;

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
    public EventSourceConfiguration withUUID(String uUID) {
        this.uUID = uUID;
        return this;
    }

    /**
     * The largest number of records that AWS Lambda will POST in the
     * invocation request to your function.
     *
     * @return The largest number of records that AWS Lambda will POST in the
     *         invocation request to your function.
     */
    public Integer getBatchSize() {
        return batchSize;
    }
    
    /**
     * The largest number of records that AWS Lambda will POST in the
     * invocation request to your function.
     *
     * @param batchSize The largest number of records that AWS Lambda will POST in the
     *         invocation request to your function.
     */
    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }
    
    /**
     * The largest number of records that AWS Lambda will POST in the
     * invocation request to your function.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param batchSize The largest number of records that AWS Lambda will POST in the
     *         invocation request to your function.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EventSourceConfiguration withBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream that is
     * the source of events.
     *
     * @return The Amazon Resource Name (ARN) of the Amazon Kinesis stream that is
     *         the source of events.
     */
    public String getEventSource() {
        return eventSource;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream that is
     * the source of events.
     *
     * @param eventSource The Amazon Resource Name (ARN) of the Amazon Kinesis stream that is
     *         the source of events.
     */
    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream that is
     * the source of events.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventSource The Amazon Resource Name (ARN) of the Amazon Kinesis stream that is
     *         the source of events.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EventSourceConfiguration withEventSource(String eventSource) {
        this.eventSource = eventSource;
        return this;
    }

    /**
     * The Lambda function to invoke when AWS Lambda detects an event on the
     * stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-]+<br/>
     *
     * @return The Lambda function to invoke when AWS Lambda detects an event on the
     *         stream.
     */
    public String getFunctionName() {
        return functionName;
    }
    
    /**
     * The Lambda function to invoke when AWS Lambda detects an event on the
     * stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-]+<br/>
     *
     * @param functionName The Lambda function to invoke when AWS Lambda detects an event on the
     *         stream.
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
    
    /**
     * The Lambda function to invoke when AWS Lambda detects an event on the
     * stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9-]+<br/>
     *
     * @param functionName The Lambda function to invoke when AWS Lambda detects an event on the
     *         stream.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EventSourceConfiguration withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * The map (key-value pairs) defining the configuration for AWS Lambda to
     * use when reading the event source.
     *
     * @return The map (key-value pairs) defining the configuration for AWS Lambda to
     *         use when reading the event source.
     */
    public java.util.Map<String,String> getParameters() {
        
        if (parameters == null) {
            parameters = new java.util.HashMap<String,String>();
        }
        return parameters;
    }
    
    /**
     * The map (key-value pairs) defining the configuration for AWS Lambda to
     * use when reading the event source.
     *
     * @param parameters The map (key-value pairs) defining the configuration for AWS Lambda to
     *         use when reading the event source.
     */
    public void setParameters(java.util.Map<String,String> parameters) {
        this.parameters = parameters;
    }
    
    /**
     * The map (key-value pairs) defining the configuration for AWS Lambda to
     * use when reading the event source.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters The map (key-value pairs) defining the configuration for AWS Lambda to
     *         use when reading the event source.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EventSourceConfiguration withParameters(java.util.Map<String,String> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * The map (key-value pairs) defining the configuration for AWS Lambda to
     * use when reading the event source.
     * <p>
     * The method adds a new key-value pair into Parameters parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Parameters.
     * @param value The corresponding value of the entry to be added into Parameters.
     */
    public EventSourceConfiguration addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String,String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public EventSourceConfiguration clearParametersEntries() {
        this.parameters = null;
        return this;
    }
    
    /**
     * The ARN of the IAM role (invocation role) that AWS Lambda can assume
     * to read from the stream and invoke the function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_]+<br/>
     *
     * @return The ARN of the IAM role (invocation role) that AWS Lambda can assume
     *         to read from the stream and invoke the function.
     */
    public String getRole() {
        return role;
    }
    
    /**
     * The ARN of the IAM role (invocation role) that AWS Lambda can assume
     * to read from the stream and invoke the function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_]+<br/>
     *
     * @param role The ARN of the IAM role (invocation role) that AWS Lambda can assume
     *         to read from the stream and invoke the function.
     */
    public void setRole(String role) {
        this.role = role;
    }
    
    /**
     * The ARN of the IAM role (invocation role) that AWS Lambda can assume
     * to read from the stream and invoke the function.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_]+<br/>
     *
     * @param role The ARN of the IAM role (invocation role) that AWS Lambda can assume
     *         to read from the stream and invoke the function.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EventSourceConfiguration withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * The UTC time string indicating the last time the event mapping was
     * updated.
     *
     * @return The UTC time string indicating the last time the event mapping was
     *         updated.
     */
    public String getLastModified() {
        return lastModified;
    }
    
    /**
     * The UTC time string indicating the last time the event mapping was
     * updated.
     *
     * @param lastModified The UTC time string indicating the last time the event mapping was
     *         updated.
     */
    public void setLastModified(String lastModified) {
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
    public EventSourceConfiguration withLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * Indicates whether the event source mapping is currently honored.
     * Events are only processes if IsActive is true.
     *
     * @return Indicates whether the event source mapping is currently honored.
     *         Events are only processes if IsActive is true.
     */
    public String getIsActive() {
        return isActive;
    }
    
    /**
     * Indicates whether the event source mapping is currently honored.
     * Events are only processes if IsActive is true.
     *
     * @param isActive Indicates whether the event source mapping is currently honored.
     *         Events are only processes if IsActive is true.
     */
    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }
    
    /**
     * Indicates whether the event source mapping is currently honored.
     * Events are only processes if IsActive is true.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isActive Indicates whether the event source mapping is currently honored.
     *         Events are only processes if IsActive is true.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EventSourceConfiguration withIsActive(String isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     * The description of the health of the event source mapping. Valid
     * values are: "PENDING", "OK", and "PROBLEM:<i>message</i>". Initially
     * this staus is "PENDING". When AWS Lambda begins processing events, it
     * changes the status to "OK".
     *
     * @return The description of the health of the event source mapping. Valid
     *         values are: "PENDING", "OK", and "PROBLEM:<i>message</i>". Initially
     *         this staus is "PENDING". When AWS Lambda begins processing events, it
     *         changes the status to "OK".
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The description of the health of the event source mapping. Valid
     * values are: "PENDING", "OK", and "PROBLEM:<i>message</i>". Initially
     * this staus is "PENDING". When AWS Lambda begins processing events, it
     * changes the status to "OK".
     *
     * @param status The description of the health of the event source mapping. Valid
     *         values are: "PENDING", "OK", and "PROBLEM:<i>message</i>". Initially
     *         this staus is "PENDING". When AWS Lambda begins processing events, it
     *         changes the status to "OK".
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The description of the health of the event source mapping. Valid
     * values are: "PENDING", "OK", and "PROBLEM:<i>message</i>". Initially
     * this staus is "PENDING". When AWS Lambda begins processing events, it
     * changes the status to "OK".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The description of the health of the event source mapping. Valid
     *         values are: "PENDING", "OK", and "PROBLEM:<i>message</i>". Initially
     *         this staus is "PENDING". When AWS Lambda begins processing events, it
     *         changes the status to "OK".
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EventSourceConfiguration withStatus(String status) {
        this.status = status;
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
        if (getEventSource() != null) sb.append("EventSource: " + getEventSource() + ",");
        if (getFunctionName() != null) sb.append("FunctionName: " + getFunctionName() + ",");
        if (getParameters() != null) sb.append("Parameters: " + getParameters() + ",");
        if (getRole() != null) sb.append("Role: " + getRole() + ",");
        if (getLastModified() != null) sb.append("LastModified: " + getLastModified() + ",");
        if (getIsActive() != null) sb.append("IsActive: " + getIsActive() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUUID() == null) ? 0 : getUUID().hashCode()); 
        hashCode = prime * hashCode + ((getBatchSize() == null) ? 0 : getBatchSize().hashCode()); 
        hashCode = prime * hashCode + ((getEventSource() == null) ? 0 : getEventSource().hashCode()); 
        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode()); 
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode()); 
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode()); 
        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode()); 
        hashCode = prime * hashCode + ((getIsActive() == null) ? 0 : getIsActive().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EventSourceConfiguration == false) return false;
        EventSourceConfiguration other = (EventSourceConfiguration)obj;
        
        if (other.getUUID() == null ^ this.getUUID() == null) return false;
        if (other.getUUID() != null && other.getUUID().equals(this.getUUID()) == false) return false; 
        if (other.getBatchSize() == null ^ this.getBatchSize() == null) return false;
        if (other.getBatchSize() != null && other.getBatchSize().equals(this.getBatchSize()) == false) return false; 
        if (other.getEventSource() == null ^ this.getEventSource() == null) return false;
        if (other.getEventSource() != null && other.getEventSource().equals(this.getEventSource()) == false) return false; 
        if (other.getFunctionName() == null ^ this.getFunctionName() == null) return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false) return false; 
        if (other.getParameters() == null ^ this.getParameters() == null) return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false) return false; 
        if (other.getRole() == null ^ this.getRole() == null) return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false) return false; 
        if (other.getLastModified() == null ^ this.getLastModified() == null) return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false) return false; 
        if (other.getIsActive() == null ^ this.getIsActive() == null) return false;
        if (other.getIsActive() != null && other.getIsActive().equals(this.getIsActive()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
}
    