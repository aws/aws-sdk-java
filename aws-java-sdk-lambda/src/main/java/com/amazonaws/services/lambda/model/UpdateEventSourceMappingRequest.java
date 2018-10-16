/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The event source mapping identifier.
     * </p>
     */
    private String uUID;
    /**
     * <p>
     * The name of the lambda function.
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
     * The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64
     * characters in length.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * Specifies whether AWS Lambda should actively poll the stream or not. If disabled, AWS Lambda will not poll the
     * stream.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The largest number of records that AWS Lambda will retrieve from your event source at the time of invoking your
     * function. Your function receives an event with all the retrieved records.
     * </p>
     */
    private Integer batchSize;

    /**
     * <p>
     * The event source mapping identifier.
     * </p>
     * 
     * @param uUID
     *        The event source mapping identifier.
     */

    public void setUUID(String uUID) {
        this.uUID = uUID;
    }

    /**
     * <p>
     * The event source mapping identifier.
     * </p>
     * 
     * @return The event source mapping identifier.
     */

    public String getUUID() {
        return this.uUID;
    }

    /**
     * <p>
     * The event source mapping identifier.
     * </p>
     * 
     * @param uUID
     *        The event source mapping identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventSourceMappingRequest withUUID(String uUID) {
        setUUID(uUID);
        return this;
    }

    /**
     * <p>
     * The name of the lambda function.
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
     * The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64
     * characters in length.
     * </p>
     * 
     * @param functionName
     *        The name of the lambda function.</p>
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
     *        The length constraint applies only to the full ARN. If you specify only the function name, it is limited
     *        to 64 characters in length.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The name of the lambda function.
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
     * The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64
     * characters in length.
     * </p>
     * 
     * @return The name of the lambda function.</p>
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
     *         The length constraint applies only to the full ARN. If you specify only the function name, it is limited
     *         to 64 characters in length.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The name of the lambda function.
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
     * The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64
     * characters in length.
     * </p>
     * 
     * @param functionName
     *        The name of the lambda function.</p>
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
     *        The length constraint applies only to the full ARN. If you specify only the function name, it is limited
     *        to 64 characters in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventSourceMappingRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * Specifies whether AWS Lambda should actively poll the stream or not. If disabled, AWS Lambda will not poll the
     * stream.
     * </p>
     * 
     * @param enabled
     *        Specifies whether AWS Lambda should actively poll the stream or not. If disabled, AWS Lambda will not poll
     *        the stream.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether AWS Lambda should actively poll the stream or not. If disabled, AWS Lambda will not poll the
     * stream.
     * </p>
     * 
     * @return Specifies whether AWS Lambda should actively poll the stream or not. If disabled, AWS Lambda will not
     *         poll the stream.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether AWS Lambda should actively poll the stream or not. If disabled, AWS Lambda will not poll the
     * stream.
     * </p>
     * 
     * @param enabled
     *        Specifies whether AWS Lambda should actively poll the stream or not. If disabled, AWS Lambda will not poll
     *        the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventSourceMappingRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether AWS Lambda should actively poll the stream or not. If disabled, AWS Lambda will not poll the
     * stream.
     * </p>
     * 
     * @return Specifies whether AWS Lambda should actively poll the stream or not. If disabled, AWS Lambda will not
     *         poll the stream.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The largest number of records that AWS Lambda will retrieve from your event source at the time of invoking your
     * function. Your function receives an event with all the retrieved records.
     * </p>
     * 
     * @param batchSize
     *        The largest number of records that AWS Lambda will retrieve from your event source at the time of invoking
     *        your function. Your function receives an event with all the retrieved records.
     */

    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    /**
     * <p>
     * The largest number of records that AWS Lambda will retrieve from your event source at the time of invoking your
     * function. Your function receives an event with all the retrieved records.
     * </p>
     * 
     * @return The largest number of records that AWS Lambda will retrieve from your event source at the time of
     *         invoking your function. Your function receives an event with all the retrieved records.
     */

    public Integer getBatchSize() {
        return this.batchSize;
    }

    /**
     * <p>
     * The largest number of records that AWS Lambda will retrieve from your event source at the time of invoking your
     * function. Your function receives an event with all the retrieved records.
     * </p>
     * 
     * @param batchSize
     *        The largest number of records that AWS Lambda will retrieve from your event source at the time of invoking
     *        your function. Your function receives an event with all the retrieved records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventSourceMappingRequest withBatchSize(Integer batchSize) {
        setBatchSize(batchSize);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
