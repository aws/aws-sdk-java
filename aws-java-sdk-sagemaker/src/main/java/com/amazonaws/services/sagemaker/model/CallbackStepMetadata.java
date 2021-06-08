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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Metadata about a callback step.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CallbackStepMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CallbackStepMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The pipeline generated token from the Amazon SQS queue.
     * </p>
     */
    private String callbackToken;
    /**
     * <p>
     * The URL of the Amazon Simple Queue Service (Amazon SQS) queue used by the callback step.
     * </p>
     */
    private String sqsQueueUrl;
    /**
     * <p>
     * A list of the output parameters of the callback step.
     * </p>
     */
    private java.util.List<OutputParameter> outputParameters;

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

    public CallbackStepMetadata withCallbackToken(String callbackToken) {
        setCallbackToken(callbackToken);
        return this;
    }

    /**
     * <p>
     * The URL of the Amazon Simple Queue Service (Amazon SQS) queue used by the callback step.
     * </p>
     * 
     * @param sqsQueueUrl
     *        The URL of the Amazon Simple Queue Service (Amazon SQS) queue used by the callback step.
     */

    public void setSqsQueueUrl(String sqsQueueUrl) {
        this.sqsQueueUrl = sqsQueueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon Simple Queue Service (Amazon SQS) queue used by the callback step.
     * </p>
     * 
     * @return The URL of the Amazon Simple Queue Service (Amazon SQS) queue used by the callback step.
     */

    public String getSqsQueueUrl() {
        return this.sqsQueueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon Simple Queue Service (Amazon SQS) queue used by the callback step.
     * </p>
     * 
     * @param sqsQueueUrl
     *        The URL of the Amazon Simple Queue Service (Amazon SQS) queue used by the callback step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallbackStepMetadata withSqsQueueUrl(String sqsQueueUrl) {
        setSqsQueueUrl(sqsQueueUrl);
        return this;
    }

    /**
     * <p>
     * A list of the output parameters of the callback step.
     * </p>
     * 
     * @return A list of the output parameters of the callback step.
     */

    public java.util.List<OutputParameter> getOutputParameters() {
        return outputParameters;
    }

    /**
     * <p>
     * A list of the output parameters of the callback step.
     * </p>
     * 
     * @param outputParameters
     *        A list of the output parameters of the callback step.
     */

    public void setOutputParameters(java.util.Collection<OutputParameter> outputParameters) {
        if (outputParameters == null) {
            this.outputParameters = null;
            return;
        }

        this.outputParameters = new java.util.ArrayList<OutputParameter>(outputParameters);
    }

    /**
     * <p>
     * A list of the output parameters of the callback step.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputParameters(java.util.Collection)} or {@link #withOutputParameters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param outputParameters
     *        A list of the output parameters of the callback step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallbackStepMetadata withOutputParameters(OutputParameter... outputParameters) {
        if (this.outputParameters == null) {
            setOutputParameters(new java.util.ArrayList<OutputParameter>(outputParameters.length));
        }
        for (OutputParameter ele : outputParameters) {
            this.outputParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the output parameters of the callback step.
     * </p>
     * 
     * @param outputParameters
     *        A list of the output parameters of the callback step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallbackStepMetadata withOutputParameters(java.util.Collection<OutputParameter> outputParameters) {
        setOutputParameters(outputParameters);
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
        if (getSqsQueueUrl() != null)
            sb.append("SqsQueueUrl: ").append(getSqsQueueUrl()).append(",");
        if (getOutputParameters() != null)
            sb.append("OutputParameters: ").append(getOutputParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CallbackStepMetadata == false)
            return false;
        CallbackStepMetadata other = (CallbackStepMetadata) obj;
        if (other.getCallbackToken() == null ^ this.getCallbackToken() == null)
            return false;
        if (other.getCallbackToken() != null && other.getCallbackToken().equals(this.getCallbackToken()) == false)
            return false;
        if (other.getSqsQueueUrl() == null ^ this.getSqsQueueUrl() == null)
            return false;
        if (other.getSqsQueueUrl() != null && other.getSqsQueueUrl().equals(this.getSqsQueueUrl()) == false)
            return false;
        if (other.getOutputParameters() == null ^ this.getOutputParameters() == null)
            return false;
        if (other.getOutputParameters() != null && other.getOutputParameters().equals(this.getOutputParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCallbackToken() == null) ? 0 : getCallbackToken().hashCode());
        hashCode = prime * hashCode + ((getSqsQueueUrl() == null) ? 0 : getSqsQueueUrl().hashCode());
        hashCode = prime * hashCode + ((getOutputParameters() == null) ? 0 : getOutputParameters().hashCode());
        return hashCode;
    }

    @Override
    public CallbackStepMetadata clone() {
        try {
            return (CallbackStepMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.CallbackStepMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
