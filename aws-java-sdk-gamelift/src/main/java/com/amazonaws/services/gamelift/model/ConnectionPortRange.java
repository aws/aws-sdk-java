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
 * <b>This operation has been expanded to use with the Amazon GameLift containers feature, which is currently in public
 * preview.</b>
 * </p>
 * <p>
 * The set of port numbers to open on each instance in a container fleet. Connection ports are used by inbound traffic
 * to connect with processes that are running in containers on the fleet.
 * </p>
 * <p>
 * <b>Part of:</b> <a>ContainerGroupsConfiguration</a>, <a>ContainerGroupsAttributes</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ConnectionPortRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectionPortRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Starting value for the port range.
     * </p>
     */
    private Integer fromPort;
    /**
     * <p>
     * Ending value for the port. Port numbers are end-inclusive. This value must be equal to or greater than
     * <code>FromPort</code>.
     * </p>
     */
    private Integer toPort;

    /**
     * <p>
     * Starting value for the port range.
     * </p>
     * 
     * @param fromPort
     *        Starting value for the port range.
     */

    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * <p>
     * Starting value for the port range.
     * </p>
     * 
     * @return Starting value for the port range.
     */

    public Integer getFromPort() {
        return this.fromPort;
    }

    /**
     * <p>
     * Starting value for the port range.
     * </p>
     * 
     * @param fromPort
     *        Starting value for the port range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionPortRange withFromPort(Integer fromPort) {
        setFromPort(fromPort);
        return this;
    }

    /**
     * <p>
     * Ending value for the port. Port numbers are end-inclusive. This value must be equal to or greater than
     * <code>FromPort</code>.
     * </p>
     * 
     * @param toPort
     *        Ending value for the port. Port numbers are end-inclusive. This value must be equal to or greater than
     *        <code>FromPort</code>.
     */

    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    /**
     * <p>
     * Ending value for the port. Port numbers are end-inclusive. This value must be equal to or greater than
     * <code>FromPort</code>.
     * </p>
     * 
     * @return Ending value for the port. Port numbers are end-inclusive. This value must be equal to or greater than
     *         <code>FromPort</code>.
     */

    public Integer getToPort() {
        return this.toPort;
    }

    /**
     * <p>
     * Ending value for the port. Port numbers are end-inclusive. This value must be equal to or greater than
     * <code>FromPort</code>.
     * </p>
     * 
     * @param toPort
     *        Ending value for the port. Port numbers are end-inclusive. This value must be equal to or greater than
     *        <code>FromPort</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionPortRange withToPort(Integer toPort) {
        setToPort(toPort);
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
            sb.append("ToPort: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectionPortRange == false)
            return false;
        ConnectionPortRange other = (ConnectionPortRange) obj;
        if (other.getFromPort() == null ^ this.getFromPort() == null)
            return false;
        if (other.getFromPort() != null && other.getFromPort().equals(this.getFromPort()) == false)
            return false;
        if (other.getToPort() == null ^ this.getToPort() == null)
            return false;
        if (other.getToPort() != null && other.getToPort().equals(this.getToPort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFromPort() == null) ? 0 : getFromPort().hashCode());
        hashCode = prime * hashCode + ((getToPort() == null) ? 0 : getToPort().hashCode());
        return hashCode;
    }

    @Override
    public ConnectionPortRange clone() {
        try {
            return (ConnectionPortRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.ConnectionPortRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
