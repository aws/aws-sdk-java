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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about an NTP server connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/NtpStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NtpStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The connection's status.
     * </p>
     */
    private String connectionStatus;
    /**
     * <p>
     * The IP address of the server.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * The domain name of the server.
     * </p>
     */
    private String ntpServerName;

    /**
     * <p>
     * The connection's status.
     * </p>
     * 
     * @param connectionStatus
     *        The connection's status.
     * @see NetworkConnectionStatus
     */

    public void setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    /**
     * <p>
     * The connection's status.
     * </p>
     * 
     * @return The connection's status.
     * @see NetworkConnectionStatus
     */

    public String getConnectionStatus() {
        return this.connectionStatus;
    }

    /**
     * <p>
     * The connection's status.
     * </p>
     * 
     * @param connectionStatus
     *        The connection's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkConnectionStatus
     */

    public NtpStatus withConnectionStatus(String connectionStatus) {
        setConnectionStatus(connectionStatus);
        return this;
    }

    /**
     * <p>
     * The connection's status.
     * </p>
     * 
     * @param connectionStatus
     *        The connection's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkConnectionStatus
     */

    public NtpStatus withConnectionStatus(NetworkConnectionStatus connectionStatus) {
        this.connectionStatus = connectionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The IP address of the server.
     * </p>
     * 
     * @param ipAddress
     *        The IP address of the server.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The IP address of the server.
     * </p>
     * 
     * @return The IP address of the server.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The IP address of the server.
     * </p>
     * 
     * @param ipAddress
     *        The IP address of the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NtpStatus withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * The domain name of the server.
     * </p>
     * 
     * @param ntpServerName
     *        The domain name of the server.
     */

    public void setNtpServerName(String ntpServerName) {
        this.ntpServerName = ntpServerName;
    }

    /**
     * <p>
     * The domain name of the server.
     * </p>
     * 
     * @return The domain name of the server.
     */

    public String getNtpServerName() {
        return this.ntpServerName;
    }

    /**
     * <p>
     * The domain name of the server.
     * </p>
     * 
     * @param ntpServerName
     *        The domain name of the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NtpStatus withNtpServerName(String ntpServerName) {
        setNtpServerName(ntpServerName);
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
        if (getConnectionStatus() != null)
            sb.append("ConnectionStatus: ").append(getConnectionStatus()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getNtpServerName() != null)
            sb.append("NtpServerName: ").append(getNtpServerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NtpStatus == false)
            return false;
        NtpStatus other = (NtpStatus) obj;
        if (other.getConnectionStatus() == null ^ this.getConnectionStatus() == null)
            return false;
        if (other.getConnectionStatus() != null && other.getConnectionStatus().equals(this.getConnectionStatus()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getNtpServerName() == null ^ this.getNtpServerName() == null)
            return false;
        if (other.getNtpServerName() != null && other.getNtpServerName().equals(this.getNtpServerName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionStatus() == null) ? 0 : getConnectionStatus().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getNtpServerName() == null) ? 0 : getNtpServerName().hashCode());
        return hashCode;
    }

    @Override
    public NtpStatus clone() {
        try {
            return (NtpStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.panorama.model.transform.NtpStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
