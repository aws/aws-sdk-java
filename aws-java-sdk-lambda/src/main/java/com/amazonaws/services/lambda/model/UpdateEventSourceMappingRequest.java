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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateEventSourceMapping" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEventSourceMappingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the event source mapping.
     * </p>
     */
    private String uUID;
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

    public UpdateEventSourceMappingRequest withUUID(String uUID) {
        setUUID(uUID);
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

    public UpdateEventSourceMappingRequest withFunctionName(String functionName) {
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

    public UpdateEventSourceMappingRequest withEnabled(Boolean enabled) {
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

    public UpdateEventSourceMappingRequest withBatchSize(Integer batchSize) {
        setBatchSize(batchSize);
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
        if (getFunctionName() != null)
            sb.append("FunctionName: ").append(getFunctionName()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getBatchSize() != null)
            sb.append("BatchSize: ").append(getBatchSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEventSourceMappingRequest == false)
            return false;
        UpdateEventSourceMappingRequest other = (UpdateEventSourceMappingRequest) obj;
        if (other.getUUID() == null ^ this.getUUID() == null)
            return false;
        if (other.getUUID() != null && other.getUUID().equals(this.getUUID()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUUID() == null) ? 0 : getUUID().hashCode());
        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getBatchSize() == null) ? 0 : getBatchSize().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEventSourceMappingRequest clone() {
        return (UpdateEventSourceMappingRequest) super.clone();
    }

}
