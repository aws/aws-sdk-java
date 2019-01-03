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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListEventSourceMappings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEventSourceMappingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * A pagination token returned by a previous call.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The maximum number of event source mappings to return.
     * </p>
     */
    private Integer maxItems;

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

    public ListEventSourceMappingsRequest withEventSourceArn(String eventSourceArn) {
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

    public ListEventSourceMappingsRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * A pagination token returned by a previous call.
     * </p>
     * 
     * @param marker
     *        A pagination token returned by a previous call.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A pagination token returned by a previous call.
     * </p>
     * 
     * @return A pagination token returned by a previous call.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A pagination token returned by a previous call.
     * </p>
     * 
     * @param marker
     *        A pagination token returned by a previous call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventSourceMappingsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The maximum number of event source mappings to return.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of event source mappings to return.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of event source mappings to return.
     * </p>
     * 
     * @return The maximum number of event source mappings to return.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of event source mappings to return.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of event source mappings to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventSourceMappingsRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEventSourceMappingsRequest == false)
            return false;
        ListEventSourceMappingsRequest other = (ListEventSourceMappingsRequest) obj;
        if (other.getEventSourceArn() == null ^ this.getEventSourceArn() == null)
            return false;
        if (other.getEventSourceArn() != null && other.getEventSourceArn().equals(this.getEventSourceArn()) == false)
            return false;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventSourceArn() == null) ? 0 : getEventSourceArn().hashCode());
        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListEventSourceMappingsRequest clone() {
        return (ListEventSourceMappingsRequest) super.clone();
    }

}
