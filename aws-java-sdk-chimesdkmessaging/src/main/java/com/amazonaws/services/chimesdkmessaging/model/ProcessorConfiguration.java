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
package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A processor's metadata.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ProcessorConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProcessorConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates that the processor is of type Lambda.
     * </p>
     */
    private LambdaConfiguration lambda;

    /**
     * <p>
     * Indicates that the processor is of type Lambda.
     * </p>
     * 
     * @param lambda
     *        Indicates that the processor is of type Lambda.
     */

    public void setLambda(LambdaConfiguration lambda) {
        this.lambda = lambda;
    }

    /**
     * <p>
     * Indicates that the processor is of type Lambda.
     * </p>
     * 
     * @return Indicates that the processor is of type Lambda.
     */

    public LambdaConfiguration getLambda() {
        return this.lambda;
    }

    /**
     * <p>
     * Indicates that the processor is of type Lambda.
     * </p>
     * 
     * @param lambda
     *        Indicates that the processor is of type Lambda.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessorConfiguration withLambda(LambdaConfiguration lambda) {
        setLambda(lambda);
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
        if (getLambda() != null)
            sb.append("Lambda: ").append(getLambda());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProcessorConfiguration == false)
            return false;
        ProcessorConfiguration other = (ProcessorConfiguration) obj;
        if (other.getLambda() == null ^ this.getLambda() == null)
            return false;
        if (other.getLambda() != null && other.getLambda().equals(this.getLambda()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLambda() == null) ? 0 : getLambda().hashCode());
        return hashCode;
    }

    @Override
    public ProcessorConfiguration clone() {
        try {
            return (ProcessorConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmessaging.model.transform.ProcessorConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
