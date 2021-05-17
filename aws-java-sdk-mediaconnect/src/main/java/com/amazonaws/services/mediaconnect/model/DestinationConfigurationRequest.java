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
 * The transport parameters that you want to associate with an outbound media stream.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DestinationConfigurationRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DestinationConfigurationRequest implements Serializable, Cloneable, StructuredPojo {

    /** The IP address where you want MediaConnect to send contents of the media stream. */
    private String destinationIp;
    /** The port that you want MediaConnect to use when it distributes the media stream to the output. */
    private Integer destinationPort;
    /** The VPC interface that you want to use for the media stream associated with the output. */
    private InterfaceRequest interfaceValue;

    /**
     * The IP address where you want MediaConnect to send contents of the media stream.
     * 
     * @param destinationIp
     *        The IP address where you want MediaConnect to send contents of the media stream.
     */

    public void setDestinationIp(String destinationIp) {
        this.destinationIp = destinationIp;
    }

    /**
     * The IP address where you want MediaConnect to send contents of the media stream.
     * 
     * @return The IP address where you want MediaConnect to send contents of the media stream.
     */

    public String getDestinationIp() {
        return this.destinationIp;
    }

    /**
     * The IP address where you want MediaConnect to send contents of the media stream.
     * 
     * @param destinationIp
     *        The IP address where you want MediaConnect to send contents of the media stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConfigurationRequest withDestinationIp(String destinationIp) {
        setDestinationIp(destinationIp);
        return this;
    }

    /**
     * The port that you want MediaConnect to use when it distributes the media stream to the output.
     * 
     * @param destinationPort
     *        The port that you want MediaConnect to use when it distributes the media stream to the output.
     */

    public void setDestinationPort(Integer destinationPort) {
        this.destinationPort = destinationPort;
    }

    /**
     * The port that you want MediaConnect to use when it distributes the media stream to the output.
     * 
     * @return The port that you want MediaConnect to use when it distributes the media stream to the output.
     */

    public Integer getDestinationPort() {
        return this.destinationPort;
    }

    /**
     * The port that you want MediaConnect to use when it distributes the media stream to the output.
     * 
     * @param destinationPort
     *        The port that you want MediaConnect to use when it distributes the media stream to the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConfigurationRequest withDestinationPort(Integer destinationPort) {
        setDestinationPort(destinationPort);
        return this;
    }

    /**
     * The VPC interface that you want to use for the media stream associated with the output.
     * 
     * @param interfaceValue
     *        The VPC interface that you want to use for the media stream associated with the output.
     */

    public void setInterface(InterfaceRequest interfaceValue) {
        this.interfaceValue = interfaceValue;
    }

    /**
     * The VPC interface that you want to use for the media stream associated with the output.
     * 
     * @return The VPC interface that you want to use for the media stream associated with the output.
     */

    public InterfaceRequest getInterface() {
        return this.interfaceValue;
    }

    /**
     * The VPC interface that you want to use for the media stream associated with the output.
     * 
     * @param interfaceValue
     *        The VPC interface that you want to use for the media stream associated with the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConfigurationRequest withInterface(InterfaceRequest interfaceValue) {
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
        if (getDestinationIp() != null)
            sb.append("DestinationIp: ").append(getDestinationIp()).append(",");
        if (getDestinationPort() != null)
            sb.append("DestinationPort: ").append(getDestinationPort()).append(",");
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

        if (obj instanceof DestinationConfigurationRequest == false)
            return false;
        DestinationConfigurationRequest other = (DestinationConfigurationRequest) obj;
        if (other.getDestinationIp() == null ^ this.getDestinationIp() == null)
            return false;
        if (other.getDestinationIp() != null && other.getDestinationIp().equals(this.getDestinationIp()) == false)
            return false;
        if (other.getDestinationPort() == null ^ this.getDestinationPort() == null)
            return false;
        if (other.getDestinationPort() != null && other.getDestinationPort().equals(this.getDestinationPort()) == false)
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

        hashCode = prime * hashCode + ((getDestinationIp() == null) ? 0 : getDestinationIp().hashCode());
        hashCode = prime * hashCode + ((getDestinationPort() == null) ? 0 : getDestinationPort().hashCode());
        hashCode = prime * hashCode + ((getInterface() == null) ? 0 : getInterface().hashCode());
        return hashCode;
    }

    @Override
    public DestinationConfigurationRequest clone() {
        try {
            return (DestinationConfigurationRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.DestinationConfigurationRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
