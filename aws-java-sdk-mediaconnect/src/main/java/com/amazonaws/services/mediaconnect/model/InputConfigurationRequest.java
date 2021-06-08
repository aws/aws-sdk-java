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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The transport parameters that you want to associate with an incoming media stream.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/InputConfigurationRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputConfigurationRequest implements Serializable, Cloneable, StructuredPojo {

    /** The port that you want the flow to listen on for an incoming media stream. */
    private Integer inputPort;
    /** The VPC interface that you want to use for the incoming media stream. */
    private InterfaceRequest interfaceValue;

    /**
     * The port that you want the flow to listen on for an incoming media stream.
     * 
     * @param inputPort
     *        The port that you want the flow to listen on for an incoming media stream.
     */

    public void setInputPort(Integer inputPort) {
        this.inputPort = inputPort;
    }

    /**
     * The port that you want the flow to listen on for an incoming media stream.
     * 
     * @return The port that you want the flow to listen on for an incoming media stream.
     */

    public Integer getInputPort() {
        return this.inputPort;
    }

    /**
     * The port that you want the flow to listen on for an incoming media stream.
     * 
     * @param inputPort
     *        The port that you want the flow to listen on for an incoming media stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputConfigurationRequest withInputPort(Integer inputPort) {
        setInputPort(inputPort);
        return this;
    }

    /**
     * The VPC interface that you want to use for the incoming media stream.
     * 
     * @param interfaceValue
     *        The VPC interface that you want to use for the incoming media stream.
     */

    public void setInterface(InterfaceRequest interfaceValue) {
        this.interfaceValue = interfaceValue;
    }

    /**
     * The VPC interface that you want to use for the incoming media stream.
     * 
     * @return The VPC interface that you want to use for the incoming media stream.
     */

    public InterfaceRequest getInterface() {
        return this.interfaceValue;
    }

    /**
     * The VPC interface that you want to use for the incoming media stream.
     * 
     * @param interfaceValue
     *        The VPC interface that you want to use for the incoming media stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputConfigurationRequest withInterface(InterfaceRequest interfaceValue) {
        setInterface(interfaceValue);
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
        if (getInputPort() != null)
            sb.append("InputPort: ").append(getInputPort()).append(",");
        if (getInterface() != null)
            sb.append("Interface: ").append(getInterface());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputConfigurationRequest == false)
            return false;
        InputConfigurationRequest other = (InputConfigurationRequest) obj;
        if (other.getInputPort() == null ^ this.getInputPort() == null)
            return false;
        if (other.getInputPort() != null && other.getInputPort().equals(this.getInputPort()) == false)
            return false;
        if (other.getInterface() == null ^ this.getInterface() == null)
            return false;
        if (other.getInterface() != null && other.getInterface().equals(this.getInterface()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputPort() == null) ? 0 : getInputPort().hashCode());
        hashCode = prime * hashCode + ((getInterface() == null) ? 0 : getInterface().hashCode());
        return hashCode;
    }

    @Override
    public InputConfigurationRequest clone() {
        try {
            return (InputConfigurationRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.InputConfigurationRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
