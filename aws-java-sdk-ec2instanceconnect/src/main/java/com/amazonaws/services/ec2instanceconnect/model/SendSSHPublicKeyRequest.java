/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2instanceconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-instance-connect-2018-04-02/SendSSHPublicKey"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendSSHPublicKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The EC2 instance you wish to publish the SSH key to.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The OS user on the EC2 instance whom the key may be used to authenticate as.
     * </p>
     */
    private String instanceOSUser;
    /**
     * <p>
     * The public key to be published to the instance. To use it after publication you must have the matching private
     * key.
     * </p>
     */
    private String sSHPublicKey;
    /**
     * <p>
     * The availability zone the EC2 instance was launched in.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * The EC2 instance you wish to publish the SSH key to.
     * </p>
     * 
     * @param instanceId
     *        The EC2 instance you wish to publish the SSH key to.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The EC2 instance you wish to publish the SSH key to.
     * </p>
     * 
     * @return The EC2 instance you wish to publish the SSH key to.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The EC2 instance you wish to publish the SSH key to.
     * </p>
     * 
     * @param instanceId
     *        The EC2 instance you wish to publish the SSH key to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendSSHPublicKeyRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The OS user on the EC2 instance whom the key may be used to authenticate as.
     * </p>
     * 
     * @param instanceOSUser
     *        The OS user on the EC2 instance whom the key may be used to authenticate as.
     */

    public void setInstanceOSUser(String instanceOSUser) {
        this.instanceOSUser = instanceOSUser;
    }

    /**
     * <p>
     * The OS user on the EC2 instance whom the key may be used to authenticate as.
     * </p>
     * 
     * @return The OS user on the EC2 instance whom the key may be used to authenticate as.
     */

    public String getInstanceOSUser() {
        return this.instanceOSUser;
    }

    /**
     * <p>
     * The OS user on the EC2 instance whom the key may be used to authenticate as.
     * </p>
     * 
     * @param instanceOSUser
     *        The OS user on the EC2 instance whom the key may be used to authenticate as.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendSSHPublicKeyRequest withInstanceOSUser(String instanceOSUser) {
        setInstanceOSUser(instanceOSUser);
        return this;
    }

    /**
     * <p>
     * The public key to be published to the instance. To use it after publication you must have the matching private
     * key.
     * </p>
     * 
     * @param sSHPublicKey
     *        The public key to be published to the instance. To use it after publication you must have the matching
     *        private key.
     */

    public void setSSHPublicKey(String sSHPublicKey) {
        this.sSHPublicKey = sSHPublicKey;
    }

    /**
     * <p>
     * The public key to be published to the instance. To use it after publication you must have the matching private
     * key.
     * </p>
     * 
     * @return The public key to be published to the instance. To use it after publication you must have the matching
     *         private key.
     */

    public String getSSHPublicKey() {
        return this.sSHPublicKey;
    }

    /**
     * <p>
     * The public key to be published to the instance. To use it after publication you must have the matching private
     * key.
     * </p>
     * 
     * @param sSHPublicKey
     *        The public key to be published to the instance. To use it after publication you must have the matching
     *        private key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendSSHPublicKeyRequest withSSHPublicKey(String sSHPublicKey) {
        setSSHPublicKey(sSHPublicKey);
        return this;
    }

    /**
     * <p>
     * The availability zone the EC2 instance was launched in.
     * </p>
     * 
     * @param availabilityZone
     *        The availability zone the EC2 instance was launched in.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The availability zone the EC2 instance was launched in.
     * </p>
     * 
     * @return The availability zone the EC2 instance was launched in.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The availability zone the EC2 instance was launched in.
     * </p>
     * 
     * @param availabilityZone
     *        The availability zone the EC2 instance was launched in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendSSHPublicKeyRequest withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getInstanceOSUser() != null)
            sb.append("InstanceOSUser: ").append(getInstanceOSUser()).append(",");
        if (getSSHPublicKey() != null)
            sb.append("SSHPublicKey: ").append(getSSHPublicKey()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendSSHPublicKeyRequest == false)
            return false;
        SendSSHPublicKeyRequest other = (SendSSHPublicKeyRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getInstanceOSUser() == null ^ this.getInstanceOSUser() == null)
            return false;
        if (other.getInstanceOSUser() != null && other.getInstanceOSUser().equals(this.getInstanceOSUser()) == false)
            return false;
        if (other.getSSHPublicKey() == null ^ this.getSSHPublicKey() == null)
            return false;
        if (other.getSSHPublicKey() != null && other.getSSHPublicKey().equals(this.getSSHPublicKey()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getInstanceOSUser() == null) ? 0 : getInstanceOSUser().hashCode());
        hashCode = prime * hashCode + ((getSSHPublicKey() == null) ? 0 : getSSHPublicKey().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        return hashCode;
    }

    @Override
    public SendSSHPublicKeyRequest clone() {
        return (SendSSHPublicKeyRequest) super.clone();
    }

}
