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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.lambda.AWSLambda#createEventSourceMapping(CreateEventSourceMappingRequest) CreateEventSourceMapping operation}.
 * <p>
 * Identifies a stream as an event source for a Lambda function. It can
 * be either an Amazon Kinesis stream or an Amazon DynamoDB stream. AWS
 * Lambda invokes the specified function when records are posted to the
 * stream.
 * </p>
 * <p>
 * This is the pull model, where AWS Lambda invokes the function. For
 * more information, go to
 * <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html"> AWS Lambda: How it Works </a>
 * in the <i>AWS Lambda Developer Guide</i> .
 * </p>
 * <p>
 * This association between an Amazon Kinesis stream and a Lambda
 * function is called the event source mapping. You provide the
 * configuration information (for example, which stream to read from and
 * which Lambda function to invoke) for the event source mapping in the
 * request body.
 * </p>
 * <p>
 * Each event source, such as an Amazon Kinesis or a DynamoDB stream,
 * can be associated with multiple AWS Lambda function. A given Lambda
 * function can be associated with multiple AWS event sources.
 * </p>
 * <p>
 * This operation requires permission for the
 * <code>lambda:CreateEventSourceMapping</code> action.
 * </p>
 *
 * @see com.amazonaws.services.lambda.AWSLambda#createEventSourceMapping(CreateEventSourceMappingRequest)
 */
public class CreateEventSourceMappingRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis or the Amazon
     * DynamoDB stream that is the event source. Any record added to this
     * stream could cause AWS Lambda to invoke your Lambda function, it
     * depends on the <code>BatchSize</code>. AWS Lambda POSTs the Amazon
     * Kinesis event, containing records, to your Lambda function as JSON.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:([a-zA-Z0-9\-])+:([a-z]{2}-[a-z]+-\d{1})?:(\d{12})?:(.*)<br/>
     */
    private String eventSourceArn;

    /**
     * The Lambda function to invoke when AWS Lambda detects an event on the
     * stream. <p> You can specify an unqualified function name (for example,
     * "Thumbnail") or you can specify Amazon Resource Name (ARN) of the
     * function (for example,
     * "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     * also allows you to specify only the account ID qualifier (for example,
     * "account-id:Thumbnail"). Note that the length constraint applies only
     * to the ARN. If you specify only the function name, it is limited to 64
     * character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 111<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)<br/>
     */
    private String functionName;

    /**
     * Indicates whether AWS Lambda should begin polling the event source.
     */
    private Boolean enabled;

    /**
     * The largest number of records that AWS Lambda will retrieve from your
     * event source at the time of invoking your function. Your function
     * receives an event with all the retrieved records. The default is 100
     * records.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     */
    private Integer batchSize;

    /**
     * The position in the stream where AWS Lambda should start reading. For
     * more information, go to <a
     * href="http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType">ShardIteratorType</a>
     * in the <i>Amazon Kinesis API Reference</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRIM_HORIZON, LATEST
     */
    private String startingPosition;

    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis or the Amazon
     * DynamoDB stream that is the event source. Any record added to this
     * stream could cause AWS Lambda to invoke your Lambda function, it
     * depends on the <code>BatchSize</code>. AWS Lambda POSTs the Amazon
     * Kinesis event, containing records, to your Lambda function as JSON.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:([a-zA-Z0-9\-])+:([a-z]{2}-[a-z]+-\d{1})?:(\d{12})?:(.*)<br/>
     *
     * @return The Amazon Resource Name (ARN) of the Amazon Kinesis or the Amazon
     *         DynamoDB stream that is the event source. Any record added to this
     *         stream could cause AWS Lambda to invoke your Lambda function, it
     *         depends on the <code>BatchSize</code>. AWS Lambda POSTs the Amazon
     *         Kinesis event, containing records, to your Lambda function as JSON.
     */
    public String getEventSourceArn() {
        return eventSourceArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis or the Amazon
     * DynamoDB stream that is the event source. Any record added to this
     * stream could cause AWS Lambda to invoke your Lambda function, it
     * depends on the <code>BatchSize</code>. AWS Lambda POSTs the Amazon
     * Kinesis event, containing records, to your Lambda function as JSON.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:([a-zA-Z0-9\-])+:([a-z]{2}-[a-z]+-\d{1})?:(\d{12})?:(.*)<br/>
     *
     * @param eventSourceArn The Amazon Resource Name (ARN) of the Amazon Kinesis or the Amazon
     *         DynamoDB stream that is the event source. Any record added to this
     *         stream could cause AWS Lambda to invoke your Lambda function, it
     *         depends on the <code>BatchSize</code>. AWS Lambda POSTs the Amazon
     *         Kinesis event, containing records, to your Lambda function as JSON.
     */
    public void setEventSourceArn(String eventSourceArn) {
        this.eventSourceArn = eventSourceArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis or the Amazon
     * DynamoDB stream that is the event source. Any record added to this
     * stream could cause AWS Lambda to invoke your Lambda function, it
     * depends on the <code>BatchSize</code>. AWS Lambda POSTs the Amazon
     * Kinesis event, containing records, to your Lambda function as JSON.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:([a-zA-Z0-9\-])+:([a-z]{2}-[a-z]+-\d{1})?:(\d{12})?:(.*)<br/>
     *
     * @param eventSourceArn The Amazon Resource Name (ARN) of the Amazon Kinesis or the Amazon
     *         DynamoDB stream that is the event source. Any record added to this
     *         stream could cause AWS Lambda to invoke your Lambda function, it
     *         depends on the <code>BatchSize</code>. AWS Lambda POSTs the Amazon
     *         Kinesis event, containing records, to your Lambda function as JSON.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateEventSourceMappingRequest withEventSourceArn(String eventSourceArn) {
        this.eventSourceArn = eventSourceArn;
        return this;
    }

    /**
     * The Lambda function to invoke when AWS Lambda detects an event on the
     * stream. <p> You can specify an unqualified function name (for example,
     * "Thumbnail") or you can specify Amazon Resource Name (ARN) of the
     * function (for example,
     * "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     * also allows you to specify only the account ID qualifier (for example,
     * "account-id:Thumbnail"). Note that the length constraint applies only
     * to the ARN. If you specify only the function name, it is limited to 64
     * character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 111<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)<br/>
     *
     * @return The Lambda function to invoke when AWS Lambda detects an event on the
     *         stream. <p> You can specify an unqualified function name (for example,
     *         "Thumbnail") or you can specify Amazon Resource Name (ARN) of the
     *         function (for example,
     *         "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     *         also allows you to specify only the account ID qualifier (for example,
     *         "account-id:Thumbnail"). Note that the length constraint applies only
     *         to the ARN. If you specify only the function name, it is limited to 64
     *         character in length.
     */
    public String getFunctionName() {
        return functionName;
    }
    
    /**
     * The Lambda function to invoke when AWS Lambda detects an event on the
     * stream. <p> You can specify an unqualified function name (for example,
     * "Thumbnail") or you can specify Amazon Resource Name (ARN) of the
     * function (for example,
     * "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     * also allows you to specify only the account ID qualifier (for example,
     * "account-id:Thumbnail"). Note that the length constraint applies only
     * to the ARN. If you specify only the function name, it is limited to 64
     * character in length.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 111<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)<br/>
     *
     * @param functionName The Lambda function to invoke when AWS Lambda detects an event on the
     *         stream. <p> You can specify an unqualified function name (for example,
     *         "Thumbnail") or you can specify Amazon Resource Name (ARN) of the
     *         function (for example,
     *         "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     *         also allows you to specify only the account ID qualifier (for example,
     *         "account-id:Thumbnail"). Note that the length constraint applies only
     *         to the ARN. If you specify only the function name, it is limited to 64
     *         character in length.
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
    
    /**
     * The Lambda function to invoke when AWS Lambda detects an event on the
     * stream. <p> You can specify an unqualified function name (for example,
     * "Thumbnail") or you can specify Amazon Resource Name (ARN) of the
     * function (for example,
     * "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     * also allows you to specify only the account ID qualifier (for example,
     * "account-id:Thumbnail"). Note that the length constraint applies only
     * to the ARN. If you specify only the function name, it is limited to 64
     * character in length.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 111<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)<br/>
     *
     * @param functionName The Lambda function to invoke when AWS Lambda detects an event on the
     *         stream. <p> You can specify an unqualified function name (for example,
     *         "Thumbnail") or you can specify Amazon Resource Name (ARN) of the
     *         function (for example,
     *         "arn:aws:lambda:us-west-2:account-id:function:ThumbNail"). AWS Lambda
     *         also allows you to specify only the account ID qualifier (for example,
     *         "account-id:Thumbnail"). Note that the length constraint applies only
     *         to the ARN. If you specify only the function name, it is limited to 64
     *         character in length.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateEventSourceMappingRequest withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * Indicates whether AWS Lambda should begin polling the event source.
     *
     * @return Indicates whether AWS Lambda should begin polling the event source.
     */
    public Boolean isEnabled() {
        return enabled;
    }
    
    /**
     * Indicates whether AWS Lambda should begin polling the event source.
     *
     * @param enabled Indicates whether AWS Lambda should begin polling the event source.
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
    /**
     * Indicates whether AWS Lambda should begin polling the event source.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enabled Indicates whether AWS Lambda should begin polling the event source.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateEventSourceMappingRequest withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Indicates whether AWS Lambda should begin polling the event source.
     *
     * @return Indicates whether AWS Lambda should begin polling the event source.
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * The largest number of records that AWS Lambda will retrieve from your
     * event source at the time of invoking your function. Your function
     * receives an event with all the retrieved records. The default is 100
     * records.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @return The largest number of records that AWS Lambda will retrieve from your
     *         event source at the time of invoking your function. Your function
     *         receives an event with all the retrieved records. The default is 100
     *         records.
     */
    public Integer getBatchSize() {
        return batchSize;
    }
    
    /**
     * The largest number of records that AWS Lambda will retrieve from your
     * event source at the time of invoking your function. Your function
     * receives an event with all the retrieved records. The default is 100
     * records.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param batchSize The largest number of records that AWS Lambda will retrieve from your
     *         event source at the time of invoking your function. Your function
     *         receives an event with all the retrieved records. The default is 100
     *         records.
     */
    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }
    
    /**
     * The largest number of records that AWS Lambda will retrieve from your
     * event source at the time of invoking your function. Your function
     * receives an event with all the retrieved records. The default is 100
     * records.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param batchSize The largest number of records that AWS Lambda will retrieve from your
     *         event source at the time of invoking your function. Your function
     *         receives an event with all the retrieved records. The default is 100
     *         records.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateEventSourceMappingRequest withBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    /**
     * The position in the stream where AWS Lambda should start reading. For
     * more information, go to <a
     * href="http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType">ShardIteratorType</a>
     * in the <i>Amazon Kinesis API Reference</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRIM_HORIZON, LATEST
     *
     * @return The position in the stream where AWS Lambda should start reading. For
     *         more information, go to <a
     *         href="http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType">ShardIteratorType</a>
     *         in the <i>Amazon Kinesis API Reference</i>.
     *
     * @see EventSourcePosition
     */
    public String getStartingPosition() {
        return startingPosition;
    }
    
    /**
     * The position in the stream where AWS Lambda should start reading. For
     * more information, go to <a
     * href="http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType">ShardIteratorType</a>
     * in the <i>Amazon Kinesis API Reference</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRIM_HORIZON, LATEST
     *
     * @param startingPosition The position in the stream where AWS Lambda should start reading. For
     *         more information, go to <a
     *         href="http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType">ShardIteratorType</a>
     *         in the <i>Amazon Kinesis API Reference</i>.
     *
     * @see EventSourcePosition
     */
    public void setStartingPosition(String startingPosition) {
        this.startingPosition = startingPosition;
    }
    
    /**
     * The position in the stream where AWS Lambda should start reading. For
     * more information, go to <a
     * href="http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType">ShardIteratorType</a>
     * in the <i>Amazon Kinesis API Reference</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRIM_HORIZON, LATEST
     *
     * @param startingPosition The position in the stream where AWS Lambda should start reading. For
     *         more information, go to <a
     *         href="http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType">ShardIteratorType</a>
     *         in the <i>Amazon Kinesis API Reference</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see EventSourcePosition
     */
    public CreateEventSourceMappingRequest withStartingPosition(String startingPosition) {
        this.startingPosition = startingPosition;
        return this;
    }

    /**
     * The position in the stream where AWS Lambda should start reading. For
     * more information, go to <a
     * href="http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType">ShardIteratorType</a>
     * in the <i>Amazon Kinesis API Reference</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRIM_HORIZON, LATEST
     *
     * @param startingPosition The position in the stream where AWS Lambda should start reading. For
     *         more information, go to <a
     *         href="http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType">ShardIteratorType</a>
     *         in the <i>Amazon Kinesis API Reference</i>.
     *
     * @see EventSourcePosition
     */
    public void setStartingPosition(EventSourcePosition startingPosition) {
        this.startingPosition = startingPosition.toString();
    }
    
    /**
     * The position in the stream where AWS Lambda should start reading. For
     * more information, go to <a
     * href="http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType">ShardIteratorType</a>
     * in the <i>Amazon Kinesis API Reference</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRIM_HORIZON, LATEST
     *
     * @param startingPosition The position in the stream where AWS Lambda should start reading. For
     *         more information, go to <a
     *         href="http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType">ShardIteratorType</a>
     *         in the <i>Amazon Kinesis API Reference</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see EventSourcePosition
     */
    public CreateEventSourceMappingRequest withStartingPosition(EventSourcePosition startingPosition) {
        this.startingPosition = startingPosition.toString();
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
        if (getEventSourceArn() != null) sb.append("EventSourceArn: " + getEventSourceArn() + ",");
        if (getFunctionName() != null) sb.append("FunctionName: " + getFunctionName() + ",");
        if (isEnabled() != null) sb.append("Enabled: " + isEnabled() + ",");
        if (getBatchSize() != null) sb.append("BatchSize: " + getBatchSize() + ",");
        if (getStartingPosition() != null) sb.append("StartingPosition: " + getStartingPosition() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEventSourceArn() == null) ? 0 : getEventSourceArn().hashCode()); 
        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode()); 
        hashCode = prime * hashCode + ((isEnabled() == null) ? 0 : isEnabled().hashCode()); 
        hashCode = prime * hashCode + ((getBatchSize() == null) ? 0 : getBatchSize().hashCode()); 
        hashCode = prime * hashCode + ((getStartingPosition() == null) ? 0 : getStartingPosition().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateEventSourceMappingRequest == false) return false;
        CreateEventSourceMappingRequest other = (CreateEventSourceMappingRequest)obj;
        
        if (other.getEventSourceArn() == null ^ this.getEventSourceArn() == null) return false;
        if (other.getEventSourceArn() != null && other.getEventSourceArn().equals(this.getEventSourceArn()) == false) return false; 
        if (other.getFunctionName() == null ^ this.getFunctionName() == null) return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false) return false; 
        if (other.isEnabled() == null ^ this.isEnabled() == null) return false;
        if (other.isEnabled() != null && other.isEnabled().equals(this.isEnabled()) == false) return false; 
        if (other.getBatchSize() == null ^ this.getBatchSize() == null) return false;
        if (other.getBatchSize() != null && other.getBatchSize().equals(this.getBatchSize()) == false) return false; 
        if (other.getStartingPosition() == null ^ this.getStartingPosition() == null) return false;
        if (other.getStartingPosition() != null && other.getStartingPosition().equals(this.getStartingPosition()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateEventSourceMappingRequest clone() {
        
            return (CreateEventSourceMappingRequest) super.clone();
    }

}
    