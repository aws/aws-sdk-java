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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * IP address based configurations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/IPAddressBasedRemoteInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IPAddressBasedRemoteInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of authorization.
     * </p>
     */
    private String authType;
    /**
     * <p>
     * The time stamp of the configuration.
     * </p>
     */
    private String ipAddressConfigurationTimeStamp;
    /**
     * <p>
     * The type of the operating system.
     * </p>
     */
    private String osType;

    /**
     * <p>
     * The type of authorization.
     * </p>
     * 
     * @param authType
     *        The type of authorization.
     * @see AuthType
     */

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * <p>
     * The type of authorization.
     * </p>
     * 
     * @return The type of authorization.
     * @see AuthType
     */

    public String getAuthType() {
        return this.authType;
    }

    /**
     * <p>
     * The type of authorization.
     * </p>
     * 
     * @param authType
     *        The type of authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthType
     */

    public IPAddressBasedRemoteInfo withAuthType(String authType) {
        setAuthType(authType);
        return this;
    }

    /**
     * <p>
     * The type of authorization.
     * </p>
     * 
     * @param authType
     *        The type of authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthType
     */

    public IPAddressBasedRemoteInfo withAuthType(AuthType authType) {
        this.authType = authType.toString();
        return this;
    }

    /**
     * <p>
     * The time stamp of the configuration.
     * </p>
     * 
     * @param ipAddressConfigurationTimeStamp
     *        The time stamp of the configuration.
     */

    public void setIpAddressConfigurationTimeStamp(String ipAddressConfigurationTimeStamp) {
        this.ipAddressConfigurationTimeStamp = ipAddressConfigurationTimeStamp;
    }

    /**
     * <p>
     * The time stamp of the configuration.
     * </p>
     * 
     * @return The time stamp of the configuration.
     */

    public String getIpAddressConfigurationTimeStamp() {
        return this.ipAddressConfigurationTimeStamp;
    }

    /**
     * <p>
     * The time stamp of the configuration.
     * </p>
     * 
     * @param ipAddressConfigurationTimeStamp
     *        The time stamp of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IPAddressBasedRemoteInfo withIpAddressConfigurationTimeStamp(String ipAddressConfigurationTimeStamp) {
        setIpAddressConfigurationTimeStamp(ipAddressConfigurationTimeStamp);
        return this;
    }

    /**
     * <p>
     * The type of the operating system.
     * </p>
     * 
     * @param osType
     *        The type of the operating system.
     * @see OSType
     */

    public void setOsType(String osType) {
        this.osType = osType;
    }

    /**
     * <p>
     * The type of the operating system.
     * </p>
     * 
     * @return The type of the operating system.
     * @see OSType
     */

    public String getOsType() {
        return this.osType;
    }

    /**
     * <p>
     * The type of the operating system.
     * </p>
     * 
     * @param osType
     *        The type of the operating system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OSType
     */

    public IPAddressBasedRemoteInfo withOsType(String osType) {
        setOsType(osType);
        return this;
    }

    /**
     * <p>
     * The type of the operating system.
     * </p>
     * 
     * @param osType
     *        The type of the operating system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OSType
     */

    public IPAddressBasedRemoteInfo withOsType(OSType osType) {
        this.osType = osType.toString();
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
        if (getAuthType() != null)
            sb.append("AuthType: ").append(getAuthType()).append(",");
        if (getIpAddressConfigurationTimeStamp() != null)
            sb.append("IpAddressConfigurationTimeStamp: ").append(getIpAddressConfigurationTimeStamp()).append(",");
        if (getOsType() != null)
            sb.append("OsType: ").append(getOsType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IPAddressBasedRemoteInfo == false)
            return false;
        IPAddressBasedRemoteInfo other = (IPAddressBasedRemoteInfo) obj;
        if (other.getAuthType() == null ^ this.getAuthType() == null)
            return false;
        if (other.getAuthType() != null && other.getAuthType().equals(this.getAuthType()) == false)
            return false;
        if (other.getIpAddressConfigurationTimeStamp() == null ^ this.getIpAddressConfigurationTimeStamp() == null)
            return false;
        if (other.getIpAddressConfigurationTimeStamp() != null
                && other.getIpAddressConfigurationTimeStamp().equals(this.getIpAddressConfigurationTimeStamp()) == false)
            return false;
        if (other.getOsType() == null ^ this.getOsType() == null)
            return false;
        if (other.getOsType() != null && other.getOsType().equals(this.getOsType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        hashCode = prime * hashCode + ((getIpAddressConfigurationTimeStamp() == null) ? 0 : getIpAddressConfigurationTimeStamp().hashCode());
        hashCode = prime * hashCode + ((getOsType() == null) ? 0 : getOsType().hashCode());
        return hashCode;
    }

    @Override
    public IPAddressBasedRemoteInfo clone() {
        try {
            return (IPAddressBasedRemoteInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.IPAddressBasedRemoteInfoMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
