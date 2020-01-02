/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateFunctionEventInvokeConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFunctionEventInvokeConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Lambda function, version, or alias.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>my-function</code> (name-only), <code>my-function:v1</code> (with alias).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can append a version number or alias to any of the formats. The length constraint applies only to the full
     * ARN. If you specify only the function name, it is limited to 64 characters in length.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * A version number or alias name.
     * </p>
     */
    private String qualifier;
    /**
     * <p>
     * The maximum number of times to retry when the function returns an error.
     * </p>
     */
    private Integer maximumRetryAttempts;
    /**
     * <p>
     * The maximum age of a request that Lambda sends to a function for processing.
     * </p>
     */
    private Integer maximumEventAgeInSeconds;
    /**
     * <p>
     * A destination for events after they have been sent to a function for processing.
     * </p>
     * <p class="title">
     * <b>Destinations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function</b> - The Amazon Resource Name (ARN) of a Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Queue</b> - The ARN of an SQS queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Topic</b> - The ARN of an SNS topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Event Bus</b> - The ARN of an Amazon EventBridge event bus.
     * </p>
     * </li>
     * </ul>
     */
    private DestinationConfig destinationConfig;

    /**
     * <p>
     * The name of the Lambda function, version, or alias.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>my-function</code> (name-only), <code>my-function:v1</code> (with alias).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can append a version number or alias to any of the formats. The length constraint applies only to the full
     * ARN. If you specify only the function name, it is limited to 64 characters in length.
     * </p>
     * 
     * @param functionName
     *        The name of the Lambda function, version, or alias.</p>
     *        <p class="title">
     *        <b>Name formats</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Function name</b> - <code>my-function</code> (name-only), <code>my-function:v1</code> (with alias).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can append a version number or alias to any of the formats. The length constraint applies only to the
     *        full ARN. If you specify only the function name, it is limited to 64 characters in length.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The name of the Lambda function, version, or alias.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>my-function</code> (name-only), <code>my-function:v1</code> (with alias).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can append a version number or alias to any of the formats. The length constraint applies only to the full
     * ARN. If you specify only the function name, it is limited to 64 characters in length.
     * </p>
     * 
     * @return The name of the Lambda function, version, or alias.</p>
     *         <p class="title">
     *         <b>Name formats</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Function name</b> - <code>my-function</code> (name-only), <code>my-function:v1</code> (with alias).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can append a version number or alias to any of the formats. The length constraint applies only to the
     *         full ARN. If you specify only the function name, it is limited to 64 characters in length.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The name of the Lambda function, version, or alias.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>my-function</code> (name-only), <code>my-function:v1</code> (with alias).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can append a version number or alias to any of the formats. The length constraint applies only to the full
     * ARN. If you specify only the function name, it is limited to 64 characters in length.
     * </p>
     * 
     * @param functionName
     *        The name of the Lambda function, version, or alias.</p>
     *        <p class="title">
     *        <b>Name formats</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Function name</b> - <code>my-function</code> (name-only), <code>my-function:v1</code> (with alias).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:my-function</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Partial ARN</b> - <code>123456789012:function:my-function</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can append a version number or alias to any of the formats. The length constraint applies only to the
     *        full ARN. If you specify only the function name, it is limited to 64 characters in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionEventInvokeConfigRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * A version number or alias name.
     * </p>
     * 
     * @param qualifier
     *        A version number or alias name.
     */

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /**
     * <p>
     * A version number or alias name.
     * </p>
     * 
     * @return A version number or alias name.
     */

    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * <p>
     * A version number or alias name.
     * </p>
     * 
     * @param qualifier
     *        A version number or alias name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionEventInvokeConfigRequest withQualifier(String qualifier) {
        setQualifier(qualifier);
        return this;
    }

    /**
     * <p>
     * The maximum number of times to retry when the function returns an error.
     * </p>
     * 
     * @param maximumRetryAttempts
     *        The maximum number of times to retry when the function returns an error.
     */

    public void setMaximumRetryAttempts(Integer maximumRetryAttempts) {
        this.maximumRetryAttempts = maximumRetryAttempts;
    }

    /**
     * <p>
     * The maximum number of times to retry when the function returns an error.
     * </p>
     * 
     * @return The maximum number of times to retry when the function returns an error.
     */

    public Integer getMaximumRetryAttempts() {
        return this.maximumRetryAttempts;
    }

    /**
     * <p>
     * The maximum number of times to retry when the function returns an error.
     * </p>
     * 
     * @param maximumRetryAttempts
     *        The maximum number of times to retry when the function returns an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionEventInvokeConfigRequest withMaximumRetryAttempts(Integer maximumRetryAttempts) {
        setMaximumRetryAttempts(maximumRetryAttempts);
        return this;
    }

    /**
     * <p>
     * The maximum age of a request that Lambda sends to a function for processing.
     * </p>
     * 
     * @param maximumEventAgeInSeconds
     *        The maximum age of a request that Lambda sends to a function for processing.
     */

    public void setMaximumEventAgeInSeconds(Integer maximumEventAgeInSeconds) {
        this.maximumEventAgeInSeconds = maximumEventAgeInSeconds;
    }

    /**
     * <p>
     * The maximum age of a request that Lambda sends to a function for processing.
     * </p>
     * 
     * @return The maximum age of a request that Lambda sends to a function for processing.
     */

    public Integer getMaximumEventAgeInSeconds() {
        return this.maximumEventAgeInSeconds;
    }

    /**
     * <p>
     * The maximum age of a request that Lambda sends to a function for processing.
     * </p>
     * 
     * @param maximumEventAgeInSeconds
     *        The maximum age of a request that Lambda sends to a function for processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionEventInvokeConfigRequest withMaximumEventAgeInSeconds(Integer maximumEventAgeInSeconds) {
        setMaximumEventAgeInSeconds(maximumEventAgeInSeconds);
        return this;
    }

    /**
     * <p>
     * A destination for events after they have been sent to a function for processing.
     * </p>
     * <p class="title">
     * <b>Destinations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function</b> - The Amazon Resource Name (ARN) of a Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Queue</b> - The ARN of an SQS queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Topic</b> - The ARN of an SNS topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Event Bus</b> - The ARN of an Amazon EventBridge event bus.
     * </p>
     * </li>
     * </ul>
     * 
     * @param destinationConfig
     *        A destination for events after they have been sent to a function for processing.</p>
     *        <p class="title">
     *        <b>Destinations</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Function</b> - The Amazon Resource Name (ARN) of a Lambda function.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Queue</b> - The ARN of an SQS queue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Topic</b> - The ARN of an SNS topic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Event Bus</b> - The ARN of an Amazon EventBridge event bus.
     *        </p>
     *        </li>
     */

    public void setDestinationConfig(DestinationConfig destinationConfig) {
        this.destinationConfig = destinationConfig;
    }

    /**
     * <p>
     * A destination for events after they have been sent to a function for processing.
     * </p>
     * <p class="title">
     * <b>Destinations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function</b> - The Amazon Resource Name (ARN) of a Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Queue</b> - The ARN of an SQS queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Topic</b> - The ARN of an SNS topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Event Bus</b> - The ARN of an Amazon EventBridge event bus.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A destination for events after they have been sent to a function for processing.</p>
     *         <p class="title">
     *         <b>Destinations</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Function</b> - The Amazon Resource Name (ARN) of a Lambda function.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Queue</b> - The ARN of an SQS queue.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Topic</b> - The ARN of an SNS topic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Event Bus</b> - The ARN of an Amazon EventBridge event bus.
     *         </p>
     *         </li>
     */

    public DestinationConfig getDestinationConfig() {
        return this.destinationConfig;
    }

    /**
     * <p>
     * A destination for events after they have been sent to a function for processing.
     * </p>
     * <p class="title">
     * <b>Destinations</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function</b> - The Amazon Resource Name (ARN) of a Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Queue</b> - The ARN of an SQS queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Topic</b> - The ARN of an SNS topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Event Bus</b> - The ARN of an Amazon EventBridge event bus.
     * </p>
     * </li>
     * </ul>
     * 
     * @param destinationConfig
     *        A destination for events after they have been sent to a function for processing.</p>
     *        <p class="title">
     *        <b>Destinations</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Function</b> - The Amazon Resource Name (ARN) of a Lambda function.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Queue</b> - The ARN of an SQS queue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Topic</b> - The ARN of an SNS topic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Event Bus</b> - The ARN of an Amazon EventBridge event bus.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionEventInvokeConfigRequest withDestinationConfig(DestinationConfig destinationConfig) {
        setDestinationConfig(destinationConfig);
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
        if (getFunctionName() != null)
            sb.append("FunctionName: ").append(getFunctionName()).append(",");
        if (getQualifier() != null)
            sb.append("Qualifier: ").append(getQualifier()).append(",");
        if (getMaximumRetryAttempts() != null)
            sb.append("MaximumRetryAttempts: ").append(getMaximumRetryAttempts()).append(",");
        if (getMaximumEventAgeInSeconds() != null)
            sb.append("MaximumEventAgeInSeconds: ").append(getMaximumEventAgeInSeconds()).append(",");
        if (getDestinationConfig() != null)
            sb.append("DestinationConfig: ").append(getDestinationConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFunctionEventInvokeConfigRequest == false)
            return false;
        UpdateFunctionEventInvokeConfigRequest other = (UpdateFunctionEventInvokeConfigRequest) obj;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getQualifier() == null ^ this.getQualifier() == null)
            return false;
        if (other.getQualifier() != null && other.getQualifier().equals(this.getQualifier()) == false)
            return false;
        if (other.getMaximumRetryAttempts() == null ^ this.getMaximumRetryAttempts() == null)
            return false;
        if (other.getMaximumRetryAttempts() != null && other.getMaximumRetryAttempts().equals(this.getMaximumRetryAttempts()) == false)
            return false;
        if (other.getMaximumEventAgeInSeconds() == null ^ this.getMaximumEventAgeInSeconds() == null)
            return false;
        if (other.getMaximumEventAgeInSeconds() != null && other.getMaximumEventAgeInSeconds().equals(this.getMaximumEventAgeInSeconds()) == false)
            return false;
        if (other.getDestinationConfig() == null ^ this.getDestinationConfig() == null)
            return false;
        if (other.getDestinationConfig() != null && other.getDestinationConfig().equals(this.getDestinationConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getQualifier() == null) ? 0 : getQualifier().hashCode());
        hashCode = prime * hashCode + ((getMaximumRetryAttempts() == null) ? 0 : getMaximumRetryAttempts().hashCode());
        hashCode = prime * hashCode + ((getMaximumEventAgeInSeconds() == null) ? 0 : getMaximumEventAgeInSeconds().hashCode());
        hashCode = prime * hashCode + ((getDestinationConfig() == null) ? 0 : getDestinationConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFunctionEventInvokeConfigRequest clone() {
        return (UpdateFunctionEventInvokeConfigRequest) super.clone();
    }

}
