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
 * Specifies configuration for how an endpoint performs asynchronous inference.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AsyncInferenceConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AsyncInferenceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configures the behavior of the client used by SageMaker to interact with the model container during asynchronous
     * inference.
     * </p>
     */
    private AsyncInferenceClientConfig clientConfig;
    /**
     * <p>
     * Specifies the configuration for asynchronous inference invocation outputs.
     * </p>
     */
    private AsyncInferenceOutputConfig outputConfig;

    /**
     * <p>
     * Configures the behavior of the client used by SageMaker to interact with the model container during asynchronous
     * inference.
     * </p>
     * 
     * @param clientConfig
     *        Configures the behavior of the client used by SageMaker to interact with the model container during
     *        asynchronous inference.
     */

    public void setClientConfig(AsyncInferenceClientConfig clientConfig) {
        this.clientConfig = clientConfig;
    }

    /**
     * <p>
     * Configures the behavior of the client used by SageMaker to interact with the model container during asynchronous
     * inference.
     * </p>
     * 
     * @return Configures the behavior of the client used by SageMaker to interact with the model container during
     *         asynchronous inference.
     */

    public AsyncInferenceClientConfig getClientConfig() {
        return this.clientConfig;
    }

    /**
     * <p>
     * Configures the behavior of the client used by SageMaker to interact with the model container during asynchronous
     * inference.
     * </p>
     * 
     * @param clientConfig
     *        Configures the behavior of the client used by SageMaker to interact with the model container during
     *        asynchronous inference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AsyncInferenceConfig withClientConfig(AsyncInferenceClientConfig clientConfig) {
        setClientConfig(clientConfig);
        return this;
    }

    /**
     * <p>
     * Specifies the configuration for asynchronous inference invocation outputs.
     * </p>
     * 
     * @param outputConfig
     *        Specifies the configuration for asynchronous inference invocation outputs.
     */

    public void setOutputConfig(AsyncInferenceOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * Specifies the configuration for asynchronous inference invocation outputs.
     * </p>
     * 
     * @return Specifies the configuration for asynchronous inference invocation outputs.
     */

    public AsyncInferenceOutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * Specifies the configuration for asynchronous inference invocation outputs.
     * </p>
     * 
     * @param outputConfig
     *        Specifies the configuration for asynchronous inference invocation outputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AsyncInferenceConfig withOutputConfig(AsyncInferenceOutputConfig outputConfig) {
        setOutputConfig(outputConfig);
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
        if (getClientConfig() != null)
            sb.append("ClientConfig: ").append(getClientConfig()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AsyncInferenceConfig == false)
            return false;
        AsyncInferenceConfig other = (AsyncInferenceConfig) obj;
        if (other.getClientConfig() == null ^ this.getClientConfig() == null)
            return false;
        if (other.getClientConfig() != null && other.getClientConfig().equals(this.getClientConfig()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientConfig() == null) ? 0 : getClientConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        return hashCode;
    }

    @Override
    public AsyncInferenceConfig clone() {
        try {
            return (AsyncInferenceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AsyncInferenceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
