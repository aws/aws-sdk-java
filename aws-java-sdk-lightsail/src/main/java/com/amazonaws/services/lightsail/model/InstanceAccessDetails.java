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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters for gaining temporary access to one of your Amazon Lightsail instances.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/InstanceAccessDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceAccessDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * For SSH access, the public key to use when accessing your instance For OpenSSH clients (e.g., command line SSH),
     * you should save this value to <code>tempkey-cert.pub</code>.
     * </p>
     */
    private String certKey;
    /**
     * <p>
     * For SSH access, the date on which the temporary keys expire.
     * </p>
     */
    private java.util.Date expiresAt;
    /**
     * <p>
     * The public IP address of the Amazon Lightsail instance.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * For RDP access, the password for your Amazon Lightsail instance. Password will be an empty string if the password
     * for your new instance is not ready yet. When you create an instance, it can take up to 15 minutes for the
     * instance to be ready.
     * </p>
     * <note>
     * <p>
     * If you create an instance using any key pair other than the default (<code>LightsailDefaultKeyPair</code>),
     * <code>password</code> will always be an empty string.
     * </p>
     * <p>
     * If you change the Administrator password on the instance, Lightsail will continue to return the original password
     * value. When accessing the instance using RDP, you need to manually enter the Administrator password after
     * changing it from the default.
     * </p>
     * </note>
     */
    private String password;
    /**
     * <p>
     * For a Windows Server-based instance, an object with the data you can use to retrieve your password. This is only
     * needed if <code>password</code> is empty and the instance is not new (and therefore the password is not ready
     * yet). When you create an instance, it can take up to 15 minutes for the instance to be ready.
     * </p>
     */
    private PasswordData passwordData;
    /**
     * <p>
     * For SSH access, the temporary private key. For OpenSSH clients (e.g., command line SSH), you should save this
     * value to <code>tempkey</code>).
     * </p>
     */
    private String privateKey;
    /**
     * <p>
     * The protocol for these Amazon Lightsail instance access details.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The name of this Amazon Lightsail instance.
     * </p>
     */
    private String instanceName;
    /**
     * <p>
     * The user name to use when logging in to the Amazon Lightsail instance.
     * </p>
     */
    private String username;
    /**
     * <p>
     * Describes the public SSH host keys or the RDP certificate.
     * </p>
     */
    private java.util.List<HostKeyAttributes> hostKeys;

    /**
     * <p>
     * For SSH access, the public key to use when accessing your instance For OpenSSH clients (e.g., command line SSH),
     * you should save this value to <code>tempkey-cert.pub</code>.
     * </p>
     * 
     * @param certKey
     *        For SSH access, the public key to use when accessing your instance For OpenSSH clients (e.g., command line
     *        SSH), you should save this value to <code>tempkey-cert.pub</code>.
     */

    public void setCertKey(String certKey) {
        this.certKey = certKey;
    }

    /**
     * <p>
     * For SSH access, the public key to use when accessing your instance For OpenSSH clients (e.g., command line SSH),
     * you should save this value to <code>tempkey-cert.pub</code>.
     * </p>
     * 
     * @return For SSH access, the public key to use when accessing your instance For OpenSSH clients (e.g., command
     *         line SSH), you should save this value to <code>tempkey-cert.pub</code>.
     */

    public String getCertKey() {
        return this.certKey;
    }

    /**
     * <p>
     * For SSH access, the public key to use when accessing your instance For OpenSSH clients (e.g., command line SSH),
     * you should save this value to <code>tempkey-cert.pub</code>.
     * </p>
     * 
     * @param certKey
     *        For SSH access, the public key to use when accessing your instance For OpenSSH clients (e.g., command line
     *        SSH), you should save this value to <code>tempkey-cert.pub</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAccessDetails withCertKey(String certKey) {
        setCertKey(certKey);
        return this;
    }

    /**
     * <p>
     * For SSH access, the date on which the temporary keys expire.
     * </p>
     * 
     * @param expiresAt
     *        For SSH access, the date on which the temporary keys expire.
     */

    public void setExpiresAt(java.util.Date expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * <p>
     * For SSH access, the date on which the temporary keys expire.
     * </p>
     * 
     * @return For SSH access, the date on which the temporary keys expire.
     */

    public java.util.Date getExpiresAt() {
        return this.expiresAt;
    }

    /**
     * <p>
     * For SSH access, the date on which the temporary keys expire.
     * </p>
     * 
     * @param expiresAt
     *        For SSH access, the date on which the temporary keys expire.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAccessDetails withExpiresAt(java.util.Date expiresAt) {
        setExpiresAt(expiresAt);
        return this;
    }

    /**
     * <p>
     * The public IP address of the Amazon Lightsail instance.
     * </p>
     * 
     * @param ipAddress
     *        The public IP address of the Amazon Lightsail instance.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The public IP address of the Amazon Lightsail instance.
     * </p>
     * 
     * @return The public IP address of the Amazon Lightsail instance.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The public IP address of the Amazon Lightsail instance.
     * </p>
     * 
     * @param ipAddress
     *        The public IP address of the Amazon Lightsail instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAccessDetails withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * For RDP access, the password for your Amazon Lightsail instance. Password will be an empty string if the password
     * for your new instance is not ready yet. When you create an instance, it can take up to 15 minutes for the
     * instance to be ready.
     * </p>
     * <note>
     * <p>
     * If you create an instance using any key pair other than the default (<code>LightsailDefaultKeyPair</code>),
     * <code>password</code> will always be an empty string.
     * </p>
     * <p>
     * If you change the Administrator password on the instance, Lightsail will continue to return the original password
     * value. When accessing the instance using RDP, you need to manually enter the Administrator password after
     * changing it from the default.
     * </p>
     * </note>
     * 
     * @param password
     *        For RDP access, the password for your Amazon Lightsail instance. Password will be an empty string if the
     *        password for your new instance is not ready yet. When you create an instance, it can take up to 15 minutes
     *        for the instance to be ready.</p> <note>
     *        <p>
     *        If you create an instance using any key pair other than the default (<code>LightsailDefaultKeyPair</code>
     *        ), <code>password</code> will always be an empty string.
     *        </p>
     *        <p>
     *        If you change the Administrator password on the instance, Lightsail will continue to return the original
     *        password value. When accessing the instance using RDP, you need to manually enter the Administrator
     *        password after changing it from the default.
     *        </p>
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * For RDP access, the password for your Amazon Lightsail instance. Password will be an empty string if the password
     * for your new instance is not ready yet. When you create an instance, it can take up to 15 minutes for the
     * instance to be ready.
     * </p>
     * <note>
     * <p>
     * If you create an instance using any key pair other than the default (<code>LightsailDefaultKeyPair</code>),
     * <code>password</code> will always be an empty string.
     * </p>
     * <p>
     * If you change the Administrator password on the instance, Lightsail will continue to return the original password
     * value. When accessing the instance using RDP, you need to manually enter the Administrator password after
     * changing it from the default.
     * </p>
     * </note>
     * 
     * @return For RDP access, the password for your Amazon Lightsail instance. Password will be an empty string if the
     *         password for your new instance is not ready yet. When you create an instance, it can take up to 15
     *         minutes for the instance to be ready.</p> <note>
     *         <p>
     *         If you create an instance using any key pair other than the default (<code>LightsailDefaultKeyPair</code>
     *         ), <code>password</code> will always be an empty string.
     *         </p>
     *         <p>
     *         If you change the Administrator password on the instance, Lightsail will continue to return the original
     *         password value. When accessing the instance using RDP, you need to manually enter the Administrator
     *         password after changing it from the default.
     *         </p>
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * For RDP access, the password for your Amazon Lightsail instance. Password will be an empty string if the password
     * for your new instance is not ready yet. When you create an instance, it can take up to 15 minutes for the
     * instance to be ready.
     * </p>
     * <note>
     * <p>
     * If you create an instance using any key pair other than the default (<code>LightsailDefaultKeyPair</code>),
     * <code>password</code> will always be an empty string.
     * </p>
     * <p>
     * If you change the Administrator password on the instance, Lightsail will continue to return the original password
     * value. When accessing the instance using RDP, you need to manually enter the Administrator password after
     * changing it from the default.
     * </p>
     * </note>
     * 
     * @param password
     *        For RDP access, the password for your Amazon Lightsail instance. Password will be an empty string if the
     *        password for your new instance is not ready yet. When you create an instance, it can take up to 15 minutes
     *        for the instance to be ready.</p> <note>
     *        <p>
     *        If you create an instance using any key pair other than the default (<code>LightsailDefaultKeyPair</code>
     *        ), <code>password</code> will always be an empty string.
     *        </p>
     *        <p>
     *        If you change the Administrator password on the instance, Lightsail will continue to return the original
     *        password value. When accessing the instance using RDP, you need to manually enter the Administrator
     *        password after changing it from the default.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAccessDetails withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * For a Windows Server-based instance, an object with the data you can use to retrieve your password. This is only
     * needed if <code>password</code> is empty and the instance is not new (and therefore the password is not ready
     * yet). When you create an instance, it can take up to 15 minutes for the instance to be ready.
     * </p>
     * 
     * @param passwordData
     *        For a Windows Server-based instance, an object with the data you can use to retrieve your password. This
     *        is only needed if <code>password</code> is empty and the instance is not new (and therefore the password
     *        is not ready yet). When you create an instance, it can take up to 15 minutes for the instance to be ready.
     */

    public void setPasswordData(PasswordData passwordData) {
        this.passwordData = passwordData;
    }

    /**
     * <p>
     * For a Windows Server-based instance, an object with the data you can use to retrieve your password. This is only
     * needed if <code>password</code> is empty and the instance is not new (and therefore the password is not ready
     * yet). When you create an instance, it can take up to 15 minutes for the instance to be ready.
     * </p>
     * 
     * @return For a Windows Server-based instance, an object with the data you can use to retrieve your password. This
     *         is only needed if <code>password</code> is empty and the instance is not new (and therefore the password
     *         is not ready yet). When you create an instance, it can take up to 15 minutes for the instance to be
     *         ready.
     */

    public PasswordData getPasswordData() {
        return this.passwordData;
    }

    /**
     * <p>
     * For a Windows Server-based instance, an object with the data you can use to retrieve your password. This is only
     * needed if <code>password</code> is empty and the instance is not new (and therefore the password is not ready
     * yet). When you create an instance, it can take up to 15 minutes for the instance to be ready.
     * </p>
     * 
     * @param passwordData
     *        For a Windows Server-based instance, an object with the data you can use to retrieve your password. This
     *        is only needed if <code>password</code> is empty and the instance is not new (and therefore the password
     *        is not ready yet). When you create an instance, it can take up to 15 minutes for the instance to be ready.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAccessDetails withPasswordData(PasswordData passwordData) {
        setPasswordData(passwordData);
        return this;
    }

    /**
     * <p>
     * For SSH access, the temporary private key. For OpenSSH clients (e.g., command line SSH), you should save this
     * value to <code>tempkey</code>).
     * </p>
     * 
     * @param privateKey
     *        For SSH access, the temporary private key. For OpenSSH clients (e.g., command line SSH), you should save
     *        this value to <code>tempkey</code>).
     */

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    /**
     * <p>
     * For SSH access, the temporary private key. For OpenSSH clients (e.g., command line SSH), you should save this
     * value to <code>tempkey</code>).
     * </p>
     * 
     * @return For SSH access, the temporary private key. For OpenSSH clients (e.g., command line SSH), you should save
     *         this value to <code>tempkey</code>).
     */

    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * <p>
     * For SSH access, the temporary private key. For OpenSSH clients (e.g., command line SSH), you should save this
     * value to <code>tempkey</code>).
     * </p>
     * 
     * @param privateKey
     *        For SSH access, the temporary private key. For OpenSSH clients (e.g., command line SSH), you should save
     *        this value to <code>tempkey</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAccessDetails withPrivateKey(String privateKey) {
        setPrivateKey(privateKey);
        return this;
    }

    /**
     * <p>
     * The protocol for these Amazon Lightsail instance access details.
     * </p>
     * 
     * @param protocol
     *        The protocol for these Amazon Lightsail instance access details.
     * @see InstanceAccessProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol for these Amazon Lightsail instance access details.
     * </p>
     * 
     * @return The protocol for these Amazon Lightsail instance access details.
     * @see InstanceAccessProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol for these Amazon Lightsail instance access details.
     * </p>
     * 
     * @param protocol
     *        The protocol for these Amazon Lightsail instance access details.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceAccessProtocol
     */

    public InstanceAccessDetails withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol for these Amazon Lightsail instance access details.
     * </p>
     * 
     * @param protocol
     *        The protocol for these Amazon Lightsail instance access details.
     * @see InstanceAccessProtocol
     */

    public void setProtocol(InstanceAccessProtocol protocol) {
        withProtocol(protocol);
    }

    /**
     * <p>
     * The protocol for these Amazon Lightsail instance access details.
     * </p>
     * 
     * @param protocol
     *        The protocol for these Amazon Lightsail instance access details.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceAccessProtocol
     */

    public InstanceAccessDetails withProtocol(InstanceAccessProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The name of this Amazon Lightsail instance.
     * </p>
     * 
     * @param instanceName
     *        The name of this Amazon Lightsail instance.
     */

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>
     * The name of this Amazon Lightsail instance.
     * </p>
     * 
     * @return The name of this Amazon Lightsail instance.
     */

    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * <p>
     * The name of this Amazon Lightsail instance.
     * </p>
     * 
     * @param instanceName
     *        The name of this Amazon Lightsail instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAccessDetails withInstanceName(String instanceName) {
        setInstanceName(instanceName);
        return this;
    }

    /**
     * <p>
     * The user name to use when logging in to the Amazon Lightsail instance.
     * </p>
     * 
     * @param username
     *        The user name to use when logging in to the Amazon Lightsail instance.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name to use when logging in to the Amazon Lightsail instance.
     * </p>
     * 
     * @return The user name to use when logging in to the Amazon Lightsail instance.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name to use when logging in to the Amazon Lightsail instance.
     * </p>
     * 
     * @param username
     *        The user name to use when logging in to the Amazon Lightsail instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAccessDetails withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * Describes the public SSH host keys or the RDP certificate.
     * </p>
     * 
     * @return Describes the public SSH host keys or the RDP certificate.
     */

    public java.util.List<HostKeyAttributes> getHostKeys() {
        return hostKeys;
    }

    /**
     * <p>
     * Describes the public SSH host keys or the RDP certificate.
     * </p>
     * 
     * @param hostKeys
     *        Describes the public SSH host keys or the RDP certificate.
     */

    public void setHostKeys(java.util.Collection<HostKeyAttributes> hostKeys) {
        if (hostKeys == null) {
            this.hostKeys = null;
            return;
        }

        this.hostKeys = new java.util.ArrayList<HostKeyAttributes>(hostKeys);
    }

    /**
     * <p>
     * Describes the public SSH host keys or the RDP certificate.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHostKeys(java.util.Collection)} or {@link #withHostKeys(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param hostKeys
     *        Describes the public SSH host keys or the RDP certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAccessDetails withHostKeys(HostKeyAttributes... hostKeys) {
        if (this.hostKeys == null) {
            setHostKeys(new java.util.ArrayList<HostKeyAttributes>(hostKeys.length));
        }
        for (HostKeyAttributes ele : hostKeys) {
            this.hostKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the public SSH host keys or the RDP certificate.
     * </p>
     * 
     * @param hostKeys
     *        Describes the public SSH host keys or the RDP certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAccessDetails withHostKeys(java.util.Collection<HostKeyAttributes> hostKeys) {
        setHostKeys(hostKeys);
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
        if (getCertKey() != null)
            sb.append("CertKey: ").append(getCertKey()).append(",");
        if (getExpiresAt() != null)
            sb.append("ExpiresAt: ").append(getExpiresAt()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append(getPassword()).append(",");
        if (getPasswordData() != null)
            sb.append("PasswordData: ").append(getPasswordData()).append(",");
        if (getPrivateKey() != null)
            sb.append("PrivateKey: ").append(getPrivateKey()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getInstanceName() != null)
            sb.append("InstanceName: ").append(getInstanceName()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername()).append(",");
        if (getHostKeys() != null)
            sb.append("HostKeys: ").append(getHostKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceAccessDetails == false)
            return false;
        InstanceAccessDetails other = (InstanceAccessDetails) obj;
        if (other.getCertKey() == null ^ this.getCertKey() == null)
            return false;
        if (other.getCertKey() != null && other.getCertKey().equals(this.getCertKey()) == false)
            return false;
        if (other.getExpiresAt() == null ^ this.getExpiresAt() == null)
            return false;
        if (other.getExpiresAt() != null && other.getExpiresAt().equals(this.getExpiresAt()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getPasswordData() == null ^ this.getPasswordData() == null)
            return false;
        if (other.getPasswordData() != null && other.getPasswordData().equals(this.getPasswordData()) == false)
            return false;
        if (other.getPrivateKey() == null ^ this.getPrivateKey() == null)
            return false;
        if (other.getPrivateKey() != null && other.getPrivateKey().equals(this.getPrivateKey()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getInstanceName() == null ^ this.getInstanceName() == null)
            return false;
        if (other.getInstanceName() != null && other.getInstanceName().equals(this.getInstanceName()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getHostKeys() == null ^ this.getHostKeys() == null)
            return false;
        if (other.getHostKeys() != null && other.getHostKeys().equals(this.getHostKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertKey() == null) ? 0 : getCertKey().hashCode());
        hashCode = prime * hashCode + ((getExpiresAt() == null) ? 0 : getExpiresAt().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getPasswordData() == null) ? 0 : getPasswordData().hashCode());
        hashCode = prime * hashCode + ((getPrivateKey() == null) ? 0 : getPrivateKey().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getHostKeys() == null) ? 0 : getHostKeys().hashCode());
        return hashCode;
    }

    @Override
    public InstanceAccessDetails clone() {
        try {
            return (InstanceAccessDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.InstanceAccessDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
