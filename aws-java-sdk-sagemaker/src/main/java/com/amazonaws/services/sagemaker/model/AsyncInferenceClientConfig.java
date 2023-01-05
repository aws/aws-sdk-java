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
 * Configures the behavior of the client used by SageMaker to interact with the model container during asynchronous
 * inference.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AsyncInferenceClientConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AsyncInferenceClientConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of concurrent requests sent by the SageMaker client to the model container. If no value is
     * provided, SageMaker chooses an optimal value.
     * </p>
     */
    private Integer maxConcurrentInvocationsPerInstance;

    /**
     * <p>
     * The maximum number of concurrent requests sent by the SageMaker client to the model container. If no value is
     * provided, SageMaker chooses an optimal value.
     * </p>
     * 
     * @param maxConcurrentInvocationsPerInstance
     *        The maximum number of concurrent requests sent by the SageMaker client to the model container. If no value
     *        is provided, SageMaker chooses an optimal value.
     */

    public void setMaxConcurrentInvocationsPerInstance(Integer maxConcurrentInvocationsPerInstance) {
        this.maxConcurrentInvocationsPerInstance = maxConcurrentInvocationsPerInstance;
    }

    /**
     * <p>
     * The maximum number of concurrent requests sent by the SageMaker client to the model container. If no value is
     * provided, SageMaker chooses an optimal value.
     * </p>
     * 
     * @return The maximum number of concurrent requests sent by the SageMaker client to the model container. If no
     *         value is provided, SageMaker chooses an optimal value.
     */

    public Integer getMaxConcurrentInvocationsPerInstance() {
        return this.maxConcurrentInvocationsPerInstance;
    }

    /**
     * <p>
     * The maximum number of concurrent requests sent by the SageMaker client to the model container. If no value is
     * provided, SageMaker chooses an optimal value.
     * </p>
     * 
     * @param maxConcurrentInvocationsPerInstance
     *        The maximum number of concurrent requests sent by the SageMaker client to the model container. If no value
     *        is provided, SageMaker chooses an optimal value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AsyncInferenceClientConfig withMaxConcurrentInvocationsPerInstance(Integer maxConcurrentInvocationsPerInstance) {
        setMaxConcurrentInvocationsPerInstance(maxConcurrentInvocationsPerInstance);
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
        if (getMaxConcurrentInvocationsPerInstance() != null)
            sb.append("MaxConcurrentInvocationsPerInstance: ").append(getMaxConcurrentInvocationsPerInstance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AsyncInferenceClientConfig == false)
            return false;
        AsyncInferenceClientConfig other = (AsyncInferenceClientConfig) obj;
        if (other.getMaxConcurrentInvocationsPerInstance() == null ^ this.getMaxConcurrentInvocationsPerInstance() == null)
            return false;
        if (other.getMaxConcurrentInvocationsPerInstance() != null
                && other.getMaxConcurrentInvocationsPerInstance().equals(this.getMaxConcurrentInvocationsPerInstance()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxConcurrentInvocationsPerInstance() == null) ? 0 : getMaxConcurrentInvocationsPerInstance().hashCode());
        return hashCode;
    }

    @Override
    public AsyncInferenceClientConfig clone() {
        try {
            return (AsyncInferenceClientConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AsyncInferenceClientConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
