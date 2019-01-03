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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/RegisterInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the stack that the instance is to be registered with.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The instance's hostname.
     * </p>
     */
    private String hostname;
    /**
     * <p>
     * The instance's public IP address.
     * </p>
     */
    private String publicIp;
    /**
     * <p>
     * The instance's private IP address.
     * </p>
     */
    private String privateIp;
    /**
     * <p>
     * The instances public RSA key. This key is used to encrypt communication between the instance and the service.
     * </p>
     */
    private String rsaPublicKey;
    /**
     * <p>
     * The instances public RSA key fingerprint.
     * </p>
     */
    private String rsaPublicKeyFingerprint;
    /**
     * <p>
     * An InstanceIdentity object that contains the instance's identity.
     * </p>
     */
    private InstanceIdentity instanceIdentity;

    /**
     * <p>
     * The ID of the stack that the instance is to be registered with.
     * </p>
     * 
     * @param stackId
     *        The ID of the stack that the instance is to be registered with.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The ID of the stack that the instance is to be registered with.
     * </p>
     * 
     * @return The ID of the stack that the instance is to be registered with.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The ID of the stack that the instance is to be registered with.
     * </p>
     * 
     * @param stackId
     *        The ID of the stack that the instance is to be registered with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterInstanceRequest withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The instance's hostname.
     * </p>
     * 
     * @param hostname
     *        The instance's hostname.
     */

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * <p>
     * The instance's hostname.
     * </p>
     * 
     * @return The instance's hostname.
     */

    public String getHostname() {
        return this.hostname;
    }

    /**
     * <p>
     * The instance's hostname.
     * </p>
     * 
     * @param hostname
     *        The instance's hostname.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterInstanceRequest withHostname(String hostname) {
        setHostname(hostname);
        return this;
    }

    /**
     * <p>
     * The instance's public IP address.
     * </p>
     * 
     * @param publicIp
     *        The instance's public IP address.
     */

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * <p>
     * The instance's public IP address.
     * </p>
     * 
     * @return The instance's public IP address.
     */

    public String getPublicIp() {
        return this.publicIp;
    }

    /**
     * <p>
     * The instance's public IP address.
     * </p>
     * 
     * @param publicIp
     *        The instance's public IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterInstanceRequest withPublicIp(String publicIp) {
        setPublicIp(publicIp);
        return this;
    }

    /**
     * <p>
     * The instance's private IP address.
     * </p>
     * 
     * @param privateIp
     *        The instance's private IP address.
     */

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    /**
     * <p>
     * The instance's private IP address.
     * </p>
     * 
     * @return The instance's private IP address.
     */

    public String getPrivateIp() {
        return this.privateIp;
    }

    /**
     * <p>
     * The instance's private IP address.
     * </p>
     * 
     * @param privateIp
     *        The instance's private IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterInstanceRequest withPrivateIp(String privateIp) {
        setPrivateIp(privateIp);
        return this;
    }

    /**
     * <p>
     * The instances public RSA key. This key is used to encrypt communication between the instance and the service.
     * </p>
     * 
     * @param rsaPublicKey
     *        The instances public RSA key. This key is used to encrypt communication between the instance and the
     *        service.
     */

    public void setRsaPublicKey(String rsaPublicKey) {
        this.rsaPublicKey = rsaPublicKey;
    }

    /**
     * <p>
     * The instances public RSA key. This key is used to encrypt communication between the instance and the service.
     * </p>
     * 
     * @return The instances public RSA key. This key is used to encrypt communication between the instance and the
     *         service.
     */

    public String getRsaPublicKey() {
        return this.rsaPublicKey;
    }

    /**
     * <p>
     * The instances public RSA key. This key is used to encrypt communication between the instance and the service.
     * </p>
     * 
     * @param rsaPublicKey
     *        The instances public RSA key. This key is used to encrypt communication between the instance and the
     *        service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterInstanceRequest withRsaPublicKey(String rsaPublicKey) {
        setRsaPublicKey(rsaPublicKey);
        return this;
    }

    /**
     * <p>
     * The instances public RSA key fingerprint.
     * </p>
     * 
     * @param rsaPublicKeyFingerprint
     *        The instances public RSA key fingerprint.
     */

    public void setRsaPublicKeyFingerprint(String rsaPublicKeyFingerprint) {
        this.rsaPublicKeyFingerprint = rsaPublicKeyFingerprint;
    }

    /**
     * <p>
     * The instances public RSA key fingerprint.
     * </p>
     * 
     * @return The instances public RSA key fingerprint.
     */

    public String getRsaPublicKeyFingerprint() {
        return this.rsaPublicKeyFingerprint;
    }

    /**
     * <p>
     * The instances public RSA key fingerprint.
     * </p>
     * 
     * @param rsaPublicKeyFingerprint
     *        The instances public RSA key fingerprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterInstanceRequest withRsaPublicKeyFingerprint(String rsaPublicKeyFingerprint) {
        setRsaPublicKeyFingerprint(rsaPublicKeyFingerprint);
        return this;
    }

    /**
     * <p>
     * An InstanceIdentity object that contains the instance's identity.
     * </p>
     * 
     * @param instanceIdentity
     *        An InstanceIdentity object that contains the instance's identity.
     */

    public void setInstanceIdentity(InstanceIdentity instanceIdentity) {
        this.instanceIdentity = instanceIdentity;
    }

    /**
     * <p>
     * An InstanceIdentity object that contains the instance's identity.
     * </p>
     * 
     * @return An InstanceIdentity object that contains the instance's identity.
     */

    public InstanceIdentity getInstanceIdentity() {
        return this.instanceIdentity;
    }

    /**
     * <p>
     * An InstanceIdentity object that contains the instance's identity.
     * </p>
     * 
     * @param instanceIdentity
     *        An InstanceIdentity object that contains the instance's identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterInstanceRequest withInstanceIdentity(InstanceIdentity instanceIdentity) {
        setInstanceIdentity(instanceIdentity);
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
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getHostname() != null)
            sb.append("Hostname: ").append(getHostname()).append(",");
        if (getPublicIp() != null)
            sb.append("PublicIp: ").append(getPublicIp()).append(",");
        if (getPrivateIp() != null)
            sb.append("PrivateIp: ").append(getPrivateIp()).append(",");
        if (getRsaPublicKey() != null)
            sb.append("RsaPublicKey: ").append(getRsaPublicKey()).append(",");
        if (getRsaPublicKeyFingerprint() != null)
            sb.append("RsaPublicKeyFingerprint: ").append(getRsaPublicKeyFingerprint()).append(",");
        if (getInstanceIdentity() != null)
            sb.append("InstanceIdentity: ").append(getInstanceIdentity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterInstanceRequest == false)
            return false;
        RegisterInstanceRequest other = (RegisterInstanceRequest) obj;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getHostname() == null ^ this.getHostname() == null)
            return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false)
            return false;
        if (other.getPublicIp() == null ^ this.getPublicIp() == null)
            return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false)
            return false;
        if (other.getPrivateIp() == null ^ this.getPrivateIp() == null)
            return false;
        if (other.getPrivateIp() != null && other.getPrivateIp().equals(this.getPrivateIp()) == false)
            return false;
        if (other.getRsaPublicKey() == null ^ this.getRsaPublicKey() == null)
            return false;
        if (other.getRsaPublicKey() != null && other.getRsaPublicKey().equals(this.getRsaPublicKey()) == false)
            return false;
        if (other.getRsaPublicKeyFingerprint() == null ^ this.getRsaPublicKeyFingerprint() == null)
            return false;
        if (other.getRsaPublicKeyFingerprint() != null && other.getRsaPublicKeyFingerprint().equals(this.getRsaPublicKeyFingerprint()) == false)
            return false;
        if (other.getInstanceIdentity() == null ^ this.getInstanceIdentity() == null)
            return false;
        if (other.getInstanceIdentity() != null && other.getInstanceIdentity().equals(this.getInstanceIdentity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode());
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode());
        hashCode = prime * hashCode + ((getPrivateIp() == null) ? 0 : getPrivateIp().hashCode());
        hashCode = prime * hashCode + ((getRsaPublicKey() == null) ? 0 : getRsaPublicKey().hashCode());
        hashCode = prime * hashCode + ((getRsaPublicKeyFingerprint() == null) ? 0 : getRsaPublicKeyFingerprint().hashCode());
        hashCode = prime * hashCode + ((getInstanceIdentity() == null) ? 0 : getInstanceIdentity().hashCode());
        return hashCode;
    }

    @Override
    public RegisterInstanceRequest clone() {
        return (RegisterInstanceRequest) super.clone();
    }

}
