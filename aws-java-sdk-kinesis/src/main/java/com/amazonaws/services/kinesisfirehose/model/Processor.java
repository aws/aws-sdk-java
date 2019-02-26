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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a data processor.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/Processor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Processor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of processor.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The processor parameters.
     * </p>
     */
    private java.util.List<ProcessorParameter> parameters;

    /**
     * <p>
     * The type of processor.
     * </p>
     * 
     * @param type
     *        The type of processor.
     * @see ProcessorType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of processor.
     * </p>
     * 
     * @return The type of processor.
     * @see ProcessorType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of processor.
     * </p>
     * 
     * @param type
     *        The type of processor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessorType
     */

    public Processor withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of processor.
     * </p>
     * 
     * @param type
     *        The type of processor.
     * @see ProcessorType
     */

    public void setType(ProcessorType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of processor.
     * </p>
     * 
     * @param type
     *        The type of processor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessorType
     */

    public Processor withType(ProcessorType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The processor parameters.
     * </p>
     * 
     * @return The processor parameters.
     */

    public java.util.List<ProcessorParameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The processor parameters.
     * </p>
     * 
     * @param parameters
     *        The processor parameters.
     */

    public void setParameters(java.util.Collection<ProcessorParameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<ProcessorParameter>(parameters);
    }

    /**
     * <p>
     * The processor parameters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        The processor parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Processor withParameters(ProcessorParameter... parameters) {
        if (this.parameters == null) {
            setParameters(new java.util.ArrayList<ProcessorParameter>(parameters.length));
        }
        for (ProcessorParameter ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The processor parameters.
     * </p>
     * 
     * @param parameters
     *        The processor parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Processor withParameters(java.util.Collection<ProcessorParameter> parameters) {
        setParameters(parameters);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Processor == false)
            return false;
        Processor other = (Processor) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public Processor clone() {
        try {
            return (Processor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.ProcessorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
