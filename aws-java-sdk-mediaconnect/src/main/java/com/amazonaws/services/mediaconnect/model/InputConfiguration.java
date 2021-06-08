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
 * The transport parameters that are associated with an incoming media stream.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/InputConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputConfiguration implements Serializable, Cloneable, StructuredPojo {

    /** The IP address that the flow listens on for incoming content for a media stream. */
    private String inputIp;
    /** The port that the flow listens on for an incoming media stream. */
    private Integer inputPort;
    /** The VPC interface where the media stream comes in from. */
    private Interface interfaceValue;

    /**
     * The IP address that the flow listens on for incoming content for a media stream.
     * 
     * @param inputIp
     *        The IP address that the flow listens on for incoming content for a media stream.
     */

    public void setInputIp(String inputIp) {
        this.inputIp = inputIp;
    }

    /**
     * The IP address that the flow listens on for incoming content for a media stream.
     * 
     * @return The IP address that the flow listens on for incoming content for a media stream.
     */

    public String getInputIp() {
        return this.inputIp;
    }

    /**
     * The IP address that the flow listens on for incoming content for a media stream.
     * 
     * @param inputIp
     *        The IP address that the flow listens on for incoming content for a media stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputConfiguration withInputIp(String inputIp) {
        setInputIp(inputIp);
        return this;
    }

    /**
     * The port that the flow listens on for an incoming media stream.
     * 
     * @param inputPort
     *        The port that the flow listens on for an incoming media stream.
     */

    public void setInputPort(Integer inputPort) {
        this.inputPort = inputPort;
    }

    /**
     * The port that the flow listens on for an incoming media stream.
     * 
     * @return The port that the flow listens on for an incoming media stream.
     */

    public Integer getInputPort() {
        return this.inputPort;
    }

    /**
     * The port that the flow listens on for an incoming media stream.
     * 
     * @param inputPort
     *        The port that the flow listens on for an incoming media stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputConfiguration withInputPort(Integer inputPort) {
        setInputPort(inputPort);
        return this;
    }

    /**
     * The VPC interface where the media stream comes in from.
     * 
     * @param interfaceValue
     *        The VPC interface where the media stream comes in from.
     */

    public void setInterface(Interface interfaceValue) {
        this.interfaceValue = interfaceValue;
    }

    /**
     * The VPC interface where the media stream comes in from.
     * 
     * @return The VPC interface where the media stream comes in from.
     */

    public Interface getInterface() {
        return this.interfaceValue;
    }

    /**
     * The VPC interface where the media stream comes in from.
     * 
     * @param interfaceValue
     *        The VPC interface where the media stream comes in from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputConfiguration withInterface(Interface interfaceValue) {
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
        if (getInputIp() != null)
            sb.append("InputIp: ").append(getInputIp()).append(",");
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

        if (obj instanceof InputConfiguration == false)
            return false;
        InputConfiguration other = (InputConfiguration) obj;
        if (other.getInputIp() == null ^ this.getInputIp() == null)
            return false;
        if (other.getInputIp() != null && other.getInputIp().equals(this.getInputIp()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getInputIp() == null) ? 0 : getInputIp().hashCode());
        hashCode = prime * hashCode + ((getInputPort() == null) ? 0 : getInputPort().hashCode());
        hashCode = prime * hashCode + ((getInterface() == null) ? 0 : getInterface().hashCode());
        return hashCode;
    }

    @Override
    public InputConfiguration clone() {
        try {
            return (InputConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.InputConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
