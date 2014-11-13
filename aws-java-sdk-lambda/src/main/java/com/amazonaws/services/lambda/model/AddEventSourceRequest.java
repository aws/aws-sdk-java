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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.lambda.AWSLambda#addEventSource(AddEventSourceRequest) AddEventSource operation}.
 * <p>
 * Identifies an Amazon Kinesis stream as the event source for an AWS
 * Lambda function. AWS Lambda invokes the specified function when
 * records are posted to the stream.
 * </p>
 * <p>
 * This is the pull model, where AWS Lambda invokes the function. For
 * more information, go to
 * <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html"> AWS LambdaL How it Works </a>
 * in the AWS Lambda Developer Guide.
 * </p>
 * <p>
 * This association between an Amazon Kinesis stream and an AWS Lambda
 * function is called the event source mapping. You provide the
 * configuration information (for example, which stream to read from and
 * which AWS Lambda function to invoke) for the event source mapping in
 * the request body.
 * </p>
 * <p>
 * This operation requires permission for the <code>iam:PassRole</code>
 * action for the IAM role. It also requires permission for the
 * <code>lambda:AddEventSource</code> action.
 * </p>
 *
 * @see com.amazonaws.services.lambda.AWSLambda#addEventSource(AddEventSourceRequest)
 */
public class AddEventSourceRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream that is
     * the event source. Any record added to this stream causes AWS Lambda to
     * invoke your Lambda function. AWS Lambda POSTs the Amazon Kinesis
     * event, containing records, to your Lambda function as JSON.
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
     * The ARN of the IAM role (invocation role) that AWS Lambda can assume
     * to read from the stream and invoke the function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_]+<br/>
     */
    private String role;

    /**
     * The largest number of records that AWS Lambda will give to your
     * function in a single event. The default is 100 records.
     */
    private Integer batchSize;

    /**
     * A map (key-value pairs) defining the configuration for AWS Lambda to
     * use when reading the event source. Currently, AWS Lambda supports only
     * the <code>InitialPositionInStream</code> key. The valid values are:
     * "TRIM_HORIZON" and "LATEST". The default value is "TRIM_HORIZON". For
     * more information, go to <a
     * href="http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType">ShardIteratorType</a>
     * in the Amazon Kinesis Service API Reference.
     */
    private java.util.Map<String,String> parameters;

    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream that is
     * the event source. Any record added to this stream causes AWS Lambda to
     * invoke your Lambda function. AWS Lambda POSTs the Amazon Kinesis
     * event, containing records, to your Lambda function as JSON.
     *
     * @return The Amazon Resource Name (ARN) of the Amazon Kinesis stream that is
     *         the event source. Any record added to this stream causes AWS Lambda to
     *         invoke your Lambda function. AWS Lambda POSTs the Amazon Kinesis
     *         event, containing records, to your Lambda function as JSON.
     */
    public String getEventSource() {
        return eventSource;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream that is
     * the event source. Any record added to this stream causes AWS Lambda to
     * invoke your Lambda function. AWS Lambda POSTs the Amazon Kinesis
     * event, containing records, to your Lambda function as JSON.
     *
     * @param eventSource The Amazon Resource Name (ARN) of the Amazon Kinesis stream that is
     *         the event source. Any record added to this stream causes AWS Lambda to
     *         invoke your Lambda function. AWS Lambda POSTs the Amazon Kinesis
     *         event, containing records, to your Lambda function as JSON.
     */
    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream that is
     * the event source. Any record added to this stream causes AWS Lambda to
     * invoke your Lambda function. AWS Lambda POSTs the Amazon Kinesis
     * event, containing records, to your Lambda function as JSON.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventSource The Amazon Resource Name (ARN) of the Amazon Kinesis stream that is
     *         the event source. Any record added to this stream causes AWS Lambda to
     *         invoke your Lambda function. AWS Lambda POSTs the Amazon Kinesis
     *         event, containing records, to your Lambda function as JSON.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddEventSourceRequest withEventSource(String eventSource) {
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
    public AddEventSourceRequest withFunctionName(String functionName) {
        this.functionName = functionName;
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
    public AddEventSourceRequest withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * The largest number of records that AWS Lambda will give to your
     * function in a single event. The default is 100 records.
     *
     * @return The largest number of records that AWS Lambda will give to your
     *         function in a single event. The default is 100 records.
     */
    public Integer getBatchSize() {
        return batchSize;
    }
    
    /**
     * The largest number of records that AWS Lambda will give to your
     * function in a single event. The default is 100 records.
     *
     * @param batchSize The largest number of records that AWS Lambda will give to your
     *         function in a single event. The default is 100 records.
     */
    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }
    
    /**
     * The largest number of records that AWS Lambda will give to your
     * function in a single event. The default is 100 records.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param batchSize The largest number of records that AWS Lambda will give to your
     *         function in a single event. The default is 100 records.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddEventSourceRequest withBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    /**
     * A map (key-value pairs) defining the configuration for AWS Lambda to
     * use when reading the event source. Currently, AWS Lambda supports only
     * the <code>InitialPositionInStream</code> key. The valid values are:
     * "TRIM_HORIZON" and "LATEST". The default value is "TRIM_HORIZON". For
     * more information, go to <a
     * href="http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType">ShardIteratorType</a>
     * in the Amazon Kinesis Service API Reference.
     *
     * @return A map (key-value pairs) defining the configuration for AWS Lambda to
     *         use when reading the event source. Currently, AWS Lambda supports only
     *         the <code>InitialPositionInStream</code> key. The valid values are:
     *         "TRIM_HORIZON" and "LATEST". The default value is "TRIM_HORIZON". For
     *         more information, go to <a
     *         href="http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType">ShardIteratorType</a>
     *         in the Amazon Kinesis Service API Reference.
     */
    public java.util.Map<String,String> getParameters() {
        
        if (parameters == null) {
            parameters = new java.util.HashMap<String,String>();
        }
        return parameters;
    }
    
    /**
     * A map (key-value pairs) defining the configuration for AWS Lambda to
     * use when reading the event source. Currently, AWS Lambda supports only
     * the <code>InitialPositionInStream</code> key. The valid values are:
     * "TRIM_HORIZON" and "LATEST". The default value is "TRIM_HORIZON". For
     * more information, go to <a
     * href="http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType">ShardIteratorType</a>
     * in the Amazon Kinesis Service API Reference.
     *
     * @param parameters A map (key-value pairs) defining the configuration for AWS Lambda to
     *         use when reading the event source. Currently, AWS Lambda supports only
     *         the <code>InitialPositionInStream</code> key. The valid values are:
     *         "TRIM_HORIZON" and "LATEST". The default value is "TRIM_HORIZON". For
     *         more information, go to <a
     *         href="http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType">ShardIteratorType</a>
     *         in the Amazon Kinesis Service API Reference.
     */
    public void setParameters(java.util.Map<String,String> parameters) {
        this.parameters = parameters;
    }
    
    /**
     * A map (key-value pairs) defining the configuration for AWS Lambda to
     * use when reading the event source. Currently, AWS Lambda supports only
     * the <code>InitialPositionInStream</code> key. The valid values are:
     * "TRIM_HORIZON" and "LATEST". The default value is "TRIM_HORIZON". For
     * more information, go to <a
     * href="http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType">ShardIteratorType</a>
     * in the Amazon Kinesis Service API Reference.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters A map (key-value pairs) defining the configuration for AWS Lambda to
     *         use when reading the event source. Currently, AWS Lambda supports only
     *         the <code>InitialPositionInStream</code> key. The valid values are:
     *         "TRIM_HORIZON" and "LATEST". The default value is "TRIM_HORIZON". For
     *         more information, go to <a
     *         href="http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType">ShardIteratorType</a>
     *         in the Amazon Kinesis Service API Reference.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddEventSourceRequest withParameters(java.util.Map<String,String> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * A map (key-value pairs) defining the configuration for AWS Lambda to
     * use when reading the event source. Currently, AWS Lambda supports only
     * the <code>InitialPositionInStream</code> key. The valid values are:
     * "TRIM_HORIZON" and "LATEST". The default value is "TRIM_HORIZON". For
     * more information, go to <a
     * href="http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType">ShardIteratorType</a>
     * in the Amazon Kinesis Service API Reference.
     * <p>
     * The method adds a new key-value pair into Parameters parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Parameters.
     * @param value The corresponding value of the entry to be added into Parameters.
     */
    public AddEventSourceRequest addParametersEntry(String key, String value) {
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
    public AddEventSourceRequest clearParametersEntries() {
        this.parameters = null;
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
        if (getEventSource() != null) sb.append("EventSource: " + getEventSource() + ",");
        if (getFunctionName() != null) sb.append("FunctionName: " + getFunctionName() + ",");
        if (getRole() != null) sb.append("Role: " + getRole() + ",");
        if (getBatchSize() != null) sb.append("BatchSize: " + getBatchSize() + ",");
        if (getParameters() != null) sb.append("Parameters: " + getParameters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEventSource() == null) ? 0 : getEventSource().hashCode()); 
        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode()); 
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode()); 
        hashCode = prime * hashCode + ((getBatchSize() == null) ? 0 : getBatchSize().hashCode()); 
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AddEventSourceRequest == false) return false;
        AddEventSourceRequest other = (AddEventSourceRequest)obj;
        
        if (other.getEventSource() == null ^ this.getEventSource() == null) return false;
        if (other.getEventSource() != null && other.getEventSource().equals(this.getEventSource()) == false) return false; 
        if (other.getFunctionName() == null ^ this.getFunctionName() == null) return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false) return false; 
        if (other.getRole() == null ^ this.getRole() == null) return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false) return false; 
        if (other.getBatchSize() == null ^ this.getBatchSize() == null) return false;
        if (other.getBatchSize() != null && other.getBatchSize().equals(this.getBatchSize()) == false) return false; 
        if (other.getParameters() == null ^ this.getParameters() == null) return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false) return false; 
        return true;
    }
    
}
    