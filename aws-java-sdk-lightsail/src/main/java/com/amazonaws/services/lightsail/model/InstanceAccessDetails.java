/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The parameters for gaining temporary access to one of your Amazon Lightsail instances.
 * </p>
 */
public class InstanceAccessDetails implements Serializable, Cloneable {

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
     * For RDP access, the temporary password of the Amazon EC2 instance.
     * </p>
     */
    private String password;
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
     * For RDP access, the temporary password of the Amazon EC2 instance.
     * </p>
     * 
     * @param password
     *        For RDP access, the temporary password of the Amazon EC2 instance.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * For RDP access, the temporary password of the Amazon EC2 instance.
     * </p>
     * 
     * @return For RDP access, the temporary password of the Amazon EC2 instance.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * For RDP access, the temporary password of the Amazon EC2 instance.
     * </p>
     * 
     * @param password
     *        For RDP access, the temporary password of the Amazon EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAccessDetails withPassword(String password) {
        setPassword(password);
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
        this.protocol = protocol.toString();
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
        setProtocol(protocol);
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
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("CertKey: " + getCertKey() + ",");
        if (getExpiresAt() != null)
            sb.append("ExpiresAt: " + getExpiresAt() + ",");
        if (getIpAddress() != null)
            sb.append("IpAddress: " + getIpAddress() + ",");
        if (getPassword() != null)
            sb.append("Password: " + getPassword() + ",");
        if (getPrivateKey() != null)
            sb.append("PrivateKey: " + getPrivateKey() + ",");
        if (getProtocol() != null)
            sb.append("Protocol: " + getProtocol() + ",");
        if (getInstanceName() != null)
            sb.append("InstanceName: " + getInstanceName() + ",");
        if (getUsername() != null)
            sb.append("Username: " + getUsername());
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
        hashCode = prime * hashCode + ((getPrivateKey() == null) ? 0 : getPrivateKey().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
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
}
