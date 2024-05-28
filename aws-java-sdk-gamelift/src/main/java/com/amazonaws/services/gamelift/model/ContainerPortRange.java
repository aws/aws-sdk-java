/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * <b>This data type is used with the Amazon GameLift containers feature, which is currently in public preview.</b>
 * </p>
 * <p>
 * A set of one or more port numbers that can be opened on the container.
 * </p>
 * <p>
 * <b>Part of:</b> <a>ContainerPortConfiguration</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ContainerPortRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerPortRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A starting value for the range of allowed port numbers.
     * </p>
     */
    private Integer fromPort;
    /**
     * <p>
     * An ending value for the range of allowed port numbers. Port numbers are end-inclusive. This value must be equal
     * to or greater than <code>FromPort</code>.
     * </p>
     */
    private Integer toPort;
    /**
     * <p>
     * The network protocol that these ports support.
     * </p>
     */
    private String protocol;

    /**
     * <p>
     * A starting value for the range of allowed port numbers.
     * </p>
     * 
     * @param fromPort
     *        A starting value for the range of allowed port numbers.
     */

    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * <p>
     * A starting value for the range of allowed port numbers.
     * </p>
     * 
     * @return A starting value for the range of allowed port numbers.
     */

    public Integer getFromPort() {
        return this.fromPort;
    }

    /**
     * <p>
     * A starting value for the range of allowed port numbers.
     * </p>
     * 
     * @param fromPort
     *        A starting value for the range of allowed port numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerPortRange withFromPort(Integer fromPort) {
        setFromPort(fromPort);
        return this;
    }

    /**
     * <p>
     * An ending value for the range of allowed port numbers. Port numbers are end-inclusive. This value must be equal
     * to or greater than <code>FromPort</code>.
     * </p>
     * 
     * @param toPort
     *        An ending value for the range of allowed port numbers. Port numbers are end-inclusive. This value must be
     *        equal to or greater than <code>FromPort</code>.
     */

    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    /**
     * <p>
     * An ending value for the range of allowed port numbers. Port numbers are end-inclusive. This value must be equal
     * to or greater than <code>FromPort</code>.
     * </p>
     * 
     * @return An ending value for the range of allowed port numbers. Port numbers are end-inclusive. This value must be
     *         equal to or greater than <code>FromPort</code>.
     */

    public Integer getToPort() {
        return this.toPort;
    }

    /**
     * <p>
     * An ending value for the range of allowed port numbers. Port numbers are end-inclusive. This value must be equal
     * to or greater than <code>FromPort</code>.
     * </p>
     * 
     * @param toPort
     *        An ending value for the range of allowed port numbers. Port numbers are end-inclusive. This value must be
     *        equal to or greater than <code>FromPort</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerPortRange withToPort(Integer toPort) {
        setToPort(toPort);
        return this;
    }

    /**
     * <p>
     * The network protocol that these ports support.
     * </p>
     * 
     * @param protocol
     *        The network protocol that these ports support.
     * @see IpProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The network protocol that these ports support.
     * </p>
     * 
     * @return The network protocol that these ports support.
     * @see IpProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The network protocol that these ports support.
     * </p>
     * 
     * @param protocol
     *        The network protocol that these ports support.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpProtocol
     */

    public ContainerPortRange withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The network protocol that these ports support.
     * </p>
     * 
     * @param protocol
     *        The network protocol that these ports support.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpProtocol
     */

    public ContainerPortRange withProtocol(IpProtocol protocol) {
        this.protocol = protocol.toString();
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
        if (getFromPort() != null)
            sb.append("FromPort: ").append("***Sensitive Data Redacted***").append(",");
        if (getToPort() != null)
            sb.append("ToPort: ").append("***Sensitive Data Redacted***").append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerPortRange == false)
            return false;
        ContainerPortRange other = (ContainerPortRange) obj;
        if (other.getFromPort() == null ^ this.getFromPort() == null)
            return false;
        if (other.getFromPort() != null && other.getFromPort().equals(this.getFromPort()) == false)
            return false;
        if (other.getToPort() == null ^ this.getToPort() == null)
            return false;
        if (other.getToPort() != null && other.getToPort().equals(this.getToPort()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFromPort() == null) ? 0 : getFromPort().hashCode());
        hashCode = prime * hashCode + ((getToPort() == null) ? 0 : getToPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        return hashCode;
    }

    @Override
    public ContainerPortRange clone() {
        try {
            return (ContainerPortRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.ContainerPortRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
