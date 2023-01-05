/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specifies the configuration for notifications of inference results for asynchronous inference.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AsyncInferenceNotificationConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AsyncInferenceNotificationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon SNS topic to post a notification to when inference completes successfully. If no topic is provided, no
     * notification is sent on success.
     * </p>
     */
    private String successTopic;
    /**
     * <p>
     * Amazon SNS topic to post a notification to when inference fails. If no topic is provided, no notification is sent
     * on failure.
     * </p>
     */
    private String errorTopic;

    /**
     * <p>
     * Amazon SNS topic to post a notification to when inference completes successfully. If no topic is provided, no
     * notification is sent on success.
     * </p>
     * 
     * @param successTopic
     *        Amazon SNS topic to post a notification to when inference completes successfully. If no topic is provided,
     *        no notification is sent on success.
     */

    public void setSuccessTopic(String successTopic) {
        this.successTopic = successTopic;
    }

    /**
     * <p>
     * Amazon SNS topic to post a notification to when inference completes successfully. If no topic is provided, no
     * notification is sent on success.
     * </p>
     * 
     * @return Amazon SNS topic to post a notification to when inference completes successfully. If no topic is
     *         provided, no notification is sent on success.
     */

    public String getSuccessTopic() {
        return this.successTopic;
    }

    /**
     * <p>
     * Amazon SNS topic to post a notification to when inference completes successfully. If no topic is provided, no
     * notification is sent on success.
     * </p>
     * 
     * @param successTopic
     *        Amazon SNS topic to post a notification to when inference completes successfully. If no topic is provided,
     *        no notification is sent on success.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AsyncInferenceNotificationConfig withSuccessTopic(String successTopic) {
        setSuccessTopic(successTopic);
        return this;
    }

    /**
     * <p>
     * Amazon SNS topic to post a notification to when inference fails. If no topic is provided, no notification is sent
     * on failure.
     * </p>
     * 
     * @param errorTopic
     *        Amazon SNS topic to post a notification to when inference fails. If no topic is provided, no notification
     *        is sent on failure.
     */

    public void setErrorTopic(String errorTopic) {
        this.errorTopic = errorTopic;
    }

    /**
     * <p>
     * Amazon SNS topic to post a notification to when inference fails. If no topic is provided, no notification is sent
     * on failure.
     * </p>
     * 
     * @return Amazon SNS topic to post a notification to when inference fails. If no topic is provided, no notification
     *         is sent on failure.
     */

    public String getErrorTopic() {
        return this.errorTopic;
    }

    /**
     * <p>
     * Amazon SNS topic to post a notification to when inference fails. If no topic is provided, no notification is sent
     * on failure.
     * </p>
     * 
     * @param errorTopic
     *        Amazon SNS topic to post a notification to when inference fails. If no topic is provided, no notification
     *        is sent on failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AsyncInferenceNotificationConfig withErrorTopic(String errorTopic) {
        setErrorTopic(errorTopic);
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
        if (getSuccessTopic() != null)
            sb.append("SuccessTopic: ").append(getSuccessTopic()).append(",");
        if (getErrorTopic() != null)
            sb.append("ErrorTopic: ").append(getErrorTopic());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AsyncInferenceNotificationConfig == false)
            return false;
        AsyncInferenceNotificationConfig other = (AsyncInferenceNotificationConfig) obj;
        if (other.getSuccessTopic() == null ^ this.getSuccessTopic() == null)
            return false;
        if (other.getSuccessTopic() != null && other.getSuccessTopic().equals(this.getSuccessTopic()) == false)
            return false;
        if (other.getErrorTopic() == null ^ this.getErrorTopic() == null)
            return false;
        if (other.getErrorTopic() != null && other.getErrorTopic().equals(this.getErrorTopic()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessTopic() == null) ? 0 : getSuccessTopic().hashCode());
        hashCode = prime * hashCode + ((getErrorTopic() == null) ? 0 : getErrorTopic().hashCode());
        return hashCode;
    }

    @Override
    public AsyncInferenceNotificationConfig clone() {
        try {
            return (AsyncInferenceNotificationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AsyncInferenceNotificationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
