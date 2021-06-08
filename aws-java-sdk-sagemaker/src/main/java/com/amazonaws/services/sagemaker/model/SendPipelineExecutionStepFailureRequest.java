/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/SendPipelineExecutionStepFailure"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendPipelineExecutionStepFailureRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The pipeline generated token from the Amazon SQS queue.
     * </p>
     */
    private String callbackToken;
    /**
     * <p>
     * A message describing why the step failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than one time.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The pipeline generated token from the Amazon SQS queue.
     * </p>
     * 
     * @param callbackToken
     *        The pipeline generated token from the Amazon SQS queue.
     */

    public void setCallbackToken(String callbackToken) {
        this.callbackToken = callbackToken;
    }

    /**
     * <p>
     * The pipeline generated token from the Amazon SQS queue.
     * </p>
     * 
     * @return The pipeline generated token from the Amazon SQS queue.
     */

    public String getCallbackToken() {
        return this.callbackToken;
    }

    /**
     * <p>
     * The pipeline generated token from the Amazon SQS queue.
     * </p>
     * 
     * @param callbackToken
     *        The pipeline generated token from the Amazon SQS queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendPipelineExecutionStepFailureRequest withCallbackToken(String callbackToken) {
        setCallbackToken(callbackToken);
        return this;
    }

    /**
     * <p>
     * A message describing why the step failed.
     * </p>
     * 
     * @param failureReason
     *        A message describing why the step failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * A message describing why the step failed.
     * </p>
     * 
     * @return A message describing why the step failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * A message describing why the step failed.
     * </p>
     * 
     * @param failureReason
     *        A message describing why the step failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendPipelineExecutionStepFailureRequest withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than one time.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     *        idempotent operation completes no more than one time.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than one time.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     *         idempotent operation completes no more than one time.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than one time.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     *        idempotent operation completes no more than one time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendPipelineExecutionStepFailureRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getCallbackToken() != null)
            sb.append("CallbackToken: ").append(getCallbackToken()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendPipelineExecutionStepFailureRequest == false)
            return false;
        SendPipelineExecutionStepFailureRequest other = (SendPipelineExecutionStepFailureRequest) obj;
        if (other.getCallbackToken() == null ^ this.getCallbackToken() == null)
            return false;
        if (other.getCallbackToken() != null && other.getCallbackToken().equals(this.getCallbackToken()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCallbackToken() == null) ? 0 : getCallbackToken().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public SendPipelineExecutionStepFailureRequest clone() {
        return (SendPipelineExecutionStepFailureRequest) super.clone();
    }

}
