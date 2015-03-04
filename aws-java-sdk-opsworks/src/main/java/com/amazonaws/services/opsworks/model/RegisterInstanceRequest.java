/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#registerInstance(RegisterInstanceRequest) RegisterInstance operation}.
 * <p>
 * Registers instances with a specified stack that were created outside
 * of AWS OpsWorks.
 * </p>
 * <p>
 * <b>NOTE:</b>We do not recommend using this action to register
 * instances. The complete registration operation has two primary steps,
 * installing the AWS OpsWorks agent on the instance and registering the
 * instance with the stack. RegisterInstance handles only the second
 * step. You should instead use the AWS CLI register command, which
 * performs the entire registration operation.
 * </p>
 * <p>
 * <b>Required Permissions</b> : To use this action, an IAM user must
 * have a Manage permissions level for the stack or an attached policy
 * that explicitly grants permissions. For more information on user
 * permissions, see
 * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#registerInstance(RegisterInstanceRequest)
 */
public class RegisterInstanceRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ID of the stack that the instance is to be registered with.
     */
    private String stackId;

    /**
     * The instance's hostname.
     */
    private String hostname;

    /**
     * The instance's public IP address.
     */
    private String publicIp;

    /**
     * The instance's private IP address.
     */
    private String privateIp;

    /**
     * The instances public RSA key. This key is used to encrypt
     * communication between the instance and the service.
     */
    private String rsaPublicKey;

    /**
     * The instances public RSA key fingerprint.
     */
    private String rsaPublicKeyFingerprint;

    /**
     * An InstanceIdentity object that contains the instance's identity.
     */
    private InstanceIdentity instanceIdentity;

    /**
     * The ID of the stack that the instance is to be registered with.
     *
     * @return The ID of the stack that the instance is to be registered with.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * The ID of the stack that the instance is to be registered with.
     *
     * @param stackId The ID of the stack that the instance is to be registered with.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * The ID of the stack that the instance is to be registered with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId The ID of the stack that the instance is to be registered with.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterInstanceRequest withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * The instance's hostname.
     *
     * @return The instance's hostname.
     */
    public String getHostname() {
        return hostname;
    }
    
    /**
     * The instance's hostname.
     *
     * @param hostname The instance's hostname.
     */
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
    
    /**
     * The instance's hostname.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostname The instance's hostname.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterInstanceRequest withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * The instance's public IP address.
     *
     * @return The instance's public IP address.
     */
    public String getPublicIp() {
        return publicIp;
    }
    
    /**
     * The instance's public IP address.
     *
     * @param publicIp The instance's public IP address.
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }
    
    /**
     * The instance's public IP address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIp The instance's public IP address.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterInstanceRequest withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * The instance's private IP address.
     *
     * @return The instance's private IP address.
     */
    public String getPrivateIp() {
        return privateIp;
    }
    
    /**
     * The instance's private IP address.
     *
     * @param privateIp The instance's private IP address.
     */
    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }
    
    /**
     * The instance's private IP address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIp The instance's private IP address.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterInstanceRequest withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * The instances public RSA key. This key is used to encrypt
     * communication between the instance and the service.
     *
     * @return The instances public RSA key. This key is used to encrypt
     *         communication between the instance and the service.
     */
    public String getRsaPublicKey() {
        return rsaPublicKey;
    }
    
    /**
     * The instances public RSA key. This key is used to encrypt
     * communication between the instance and the service.
     *
     * @param rsaPublicKey The instances public RSA key. This key is used to encrypt
     *         communication between the instance and the service.
     */
    public void setRsaPublicKey(String rsaPublicKey) {
        this.rsaPublicKey = rsaPublicKey;
    }
    
    /**
     * The instances public RSA key. This key is used to encrypt
     * communication between the instance and the service.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rsaPublicKey The instances public RSA key. This key is used to encrypt
     *         communication between the instance and the service.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterInstanceRequest withRsaPublicKey(String rsaPublicKey) {
        this.rsaPublicKey = rsaPublicKey;
        return this;
    }

    /**
     * The instances public RSA key fingerprint.
     *
     * @return The instances public RSA key fingerprint.
     */
    public String getRsaPublicKeyFingerprint() {
        return rsaPublicKeyFingerprint;
    }
    
    /**
     * The instances public RSA key fingerprint.
     *
     * @param rsaPublicKeyFingerprint The instances public RSA key fingerprint.
     */
    public void setRsaPublicKeyFingerprint(String rsaPublicKeyFingerprint) {
        this.rsaPublicKeyFingerprint = rsaPublicKeyFingerprint;
    }
    
    /**
     * The instances public RSA key fingerprint.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rsaPublicKeyFingerprint The instances public RSA key fingerprint.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterInstanceRequest withRsaPublicKeyFingerprint(String rsaPublicKeyFingerprint) {
        this.rsaPublicKeyFingerprint = rsaPublicKeyFingerprint;
        return this;
    }

    /**
     * An InstanceIdentity object that contains the instance's identity.
     *
     * @return An InstanceIdentity object that contains the instance's identity.
     */
    public InstanceIdentity getInstanceIdentity() {
        return instanceIdentity;
    }
    
    /**
     * An InstanceIdentity object that contains the instance's identity.
     *
     * @param instanceIdentity An InstanceIdentity object that contains the instance's identity.
     */
    public void setInstanceIdentity(InstanceIdentity instanceIdentity) {
        this.instanceIdentity = instanceIdentity;
    }
    
    /**
     * An InstanceIdentity object that contains the instance's identity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIdentity An InstanceIdentity object that contains the instance's identity.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterInstanceRequest withInstanceIdentity(InstanceIdentity instanceIdentity) {
        this.instanceIdentity = instanceIdentity;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");
        if (getHostname() != null) sb.append("Hostname: " + getHostname() + ",");
        if (getPublicIp() != null) sb.append("PublicIp: " + getPublicIp() + ",");
        if (getPrivateIp() != null) sb.append("PrivateIp: " + getPrivateIp() + ",");
        if (getRsaPublicKey() != null) sb.append("RsaPublicKey: " + getRsaPublicKey() + ",");
        if (getRsaPublicKeyFingerprint() != null) sb.append("RsaPublicKeyFingerprint: " + getRsaPublicKeyFingerprint() + ",");
        if (getInstanceIdentity() != null) sb.append("InstanceIdentity: " + getInstanceIdentity() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RegisterInstanceRequest == false) return false;
        RegisterInstanceRequest other = (RegisterInstanceRequest)obj;
        
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getHostname() == null ^ this.getHostname() == null) return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false) return false; 
        if (other.getPublicIp() == null ^ this.getPublicIp() == null) return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false) return false; 
        if (other.getPrivateIp() == null ^ this.getPrivateIp() == null) return false;
        if (other.getPrivateIp() != null && other.getPrivateIp().equals(this.getPrivateIp()) == false) return false; 
        if (other.getRsaPublicKey() == null ^ this.getRsaPublicKey() == null) return false;
        if (other.getRsaPublicKey() != null && other.getRsaPublicKey().equals(this.getRsaPublicKey()) == false) return false; 
        if (other.getRsaPublicKeyFingerprint() == null ^ this.getRsaPublicKeyFingerprint() == null) return false;
        if (other.getRsaPublicKeyFingerprint() != null && other.getRsaPublicKeyFingerprint().equals(this.getRsaPublicKeyFingerprint()) == false) return false; 
        if (other.getInstanceIdentity() == null ^ this.getInstanceIdentity() == null) return false;
        if (other.getInstanceIdentity() != null && other.getInstanceIdentity().equals(this.getInstanceIdentity()) == false) return false; 
        return true;
    }
    
    @Override
    public RegisterInstanceRequest clone() {
        
            return (RegisterInstanceRequest) super.clone();
    }

}
    