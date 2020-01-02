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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PutFunctionEventInvokeConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutFunctionEventInvokeConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The date and time that the configuration was last updated.
     * </p>
     */
    private java.util.Date lastModified;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function.
     * </p>
     */
    private String functionArn;
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
     * The date and time that the configuration was last updated.
     * </p>
     * 
     * @param lastModified
     *        The date and time that the configuration was last updated.
     */

    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The date and time that the configuration was last updated.
     * </p>
     * 
     * @return The date and time that the configuration was last updated.
     */

    public java.util.Date getLastModified() {
        return this.lastModified;
    }

    /**
     * <p>
     * The date and time that the configuration was last updated.
     * </p>
     * 
     * @param lastModified
     *        The date and time that the configuration was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFunctionEventInvokeConfigResult withLastModified(java.util.Date lastModified) {
        setLastModified(lastModified);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function.
     * </p>
     * 
     * @param functionArn
     *        The Amazon Resource Name (ARN) of the function.
     */

    public void setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the function.
     */

    public String getFunctionArn() {
        return this.functionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function.
     * </p>
     * 
     * @param functionArn
     *        The Amazon Resource Name (ARN) of the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFunctionEventInvokeConfigResult withFunctionArn(String functionArn) {
        setFunctionArn(functionArn);
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

    public PutFunctionEventInvokeConfigResult withMaximumRetryAttempts(Integer maximumRetryAttempts) {
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

    public PutFunctionEventInvokeConfigResult withMaximumEventAgeInSeconds(Integer maximumEventAgeInSeconds) {
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

    public PutFunctionEventInvokeConfigResult withDestinationConfig(DestinationConfig destinationConfig) {
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
        if (getLastModified() != null)
            sb.append("LastModified: ").append(getLastModified()).append(",");
        if (getFunctionArn() != null)
            sb.append("FunctionArn: ").append(getFunctionArn()).append(",");
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

        if (obj instanceof PutFunctionEventInvokeConfigResult == false)
            return false;
        PutFunctionEventInvokeConfigResult other = (PutFunctionEventInvokeConfigResult) obj;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getFunctionArn() == null ^ this.getFunctionArn() == null)
            return false;
        if (other.getFunctionArn() != null && other.getFunctionArn().equals(this.getFunctionArn()) == false)
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

        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getFunctionArn() == null) ? 0 : getFunctionArn().hashCode());
        hashCode = prime * hashCode + ((getMaximumRetryAttempts() == null) ? 0 : getMaximumRetryAttempts().hashCode());
        hashCode = prime * hashCode + ((getMaximumEventAgeInSeconds() == null) ? 0 : getMaximumEventAgeInSeconds().hashCode());
        hashCode = prime * hashCode + ((getDestinationConfig() == null) ? 0 : getDestinationConfig().hashCode());
        return hashCode;
    }

    @Override
    public PutFunctionEventInvokeConfigResult clone() {
        try {
            return (PutFunctionEventInvokeConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
