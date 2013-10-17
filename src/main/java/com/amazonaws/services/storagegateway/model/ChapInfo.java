/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;


/**
 * <p>
 * Describes Challenge-Handshake Authentication Protocol (CHAP) information that supports authentication between your gateway and iSCSI initiators.
 * </p>
 */
public class ChapInfo implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the volume. <p><i>Valid Values</i>:
     * 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     */
    private String targetARN;

    /**
     * The secret key that the initiator (e.g. Windows client) must provide
     * to participate in mutual CHAP with the target.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 16<br/>
     */
    private String secretToAuthenticateInitiator;

    /**
     * The iSCSI initiator that connects to the target.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[0-9a-z:.-]+<br/>
     */
    private String initiatorName;

    /**
     * The secret key that the target must provide to participate in mutual
     * CHAP with the initiator (e.g. Windows client).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 16<br/>
     */
    private String secretToAuthenticateTarget;

    /**
     * The Amazon Resource Name (ARN) of the volume. <p><i>Valid Values</i>:
     * 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     *
     * @return The Amazon Resource Name (ARN) of the volume. <p><i>Valid Values</i>:
     *         50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     */
    public String getTargetARN() {
        return targetARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the volume. <p><i>Valid Values</i>:
     * 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     *
     * @param targetARN The Amazon Resource Name (ARN) of the volume. <p><i>Valid Values</i>:
     *         50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     */
    public void setTargetARN(String targetARN) {
        this.targetARN = targetARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the volume. <p><i>Valid Values</i>:
     * 50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     *
     * @param targetARN The Amazon Resource Name (ARN) of the volume. <p><i>Valid Values</i>:
     *         50 to 500 lowercase letters, numbers, periods (.), and hyphens (-).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ChapInfo withTargetARN(String targetARN) {
        this.targetARN = targetARN;
        return this;
    }

    /**
     * The secret key that the initiator (e.g. Windows client) must provide
     * to participate in mutual CHAP with the target.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 16<br/>
     *
     * @return The secret key that the initiator (e.g. Windows client) must provide
     *         to participate in mutual CHAP with the target.
     */
    public String getSecretToAuthenticateInitiator() {
        return secretToAuthenticateInitiator;
    }
    
    /**
     * The secret key that the initiator (e.g. Windows client) must provide
     * to participate in mutual CHAP with the target.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 16<br/>
     *
     * @param secretToAuthenticateInitiator The secret key that the initiator (e.g. Windows client) must provide
     *         to participate in mutual CHAP with the target.
     */
    public void setSecretToAuthenticateInitiator(String secretToAuthenticateInitiator) {
        this.secretToAuthenticateInitiator = secretToAuthenticateInitiator;
    }
    
    /**
     * The secret key that the initiator (e.g. Windows client) must provide
     * to participate in mutual CHAP with the target.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 16<br/>
     *
     * @param secretToAuthenticateInitiator The secret key that the initiator (e.g. Windows client) must provide
     *         to participate in mutual CHAP with the target.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ChapInfo withSecretToAuthenticateInitiator(String secretToAuthenticateInitiator) {
        this.secretToAuthenticateInitiator = secretToAuthenticateInitiator;
        return this;
    }

    /**
     * The iSCSI initiator that connects to the target.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[0-9a-z:.-]+<br/>
     *
     * @return The iSCSI initiator that connects to the target.
     */
    public String getInitiatorName() {
        return initiatorName;
    }
    
    /**
     * The iSCSI initiator that connects to the target.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[0-9a-z:.-]+<br/>
     *
     * @param initiatorName The iSCSI initiator that connects to the target.
     */
    public void setInitiatorName(String initiatorName) {
        this.initiatorName = initiatorName;
    }
    
    /**
     * The iSCSI initiator that connects to the target.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[0-9a-z:.-]+<br/>
     *
     * @param initiatorName The iSCSI initiator that connects to the target.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ChapInfo withInitiatorName(String initiatorName) {
        this.initiatorName = initiatorName;
        return this;
    }

    /**
     * The secret key that the target must provide to participate in mutual
     * CHAP with the initiator (e.g. Windows client).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 16<br/>
     *
     * @return The secret key that the target must provide to participate in mutual
     *         CHAP with the initiator (e.g. Windows client).
     */
    public String getSecretToAuthenticateTarget() {
        return secretToAuthenticateTarget;
    }
    
    /**
     * The secret key that the target must provide to participate in mutual
     * CHAP with the initiator (e.g. Windows client).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 16<br/>
     *
     * @param secretToAuthenticateTarget The secret key that the target must provide to participate in mutual
     *         CHAP with the initiator (e.g. Windows client).
     */
    public void setSecretToAuthenticateTarget(String secretToAuthenticateTarget) {
        this.secretToAuthenticateTarget = secretToAuthenticateTarget;
    }
    
    /**
     * The secret key that the target must provide to participate in mutual
     * CHAP with the initiator (e.g. Windows client).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 16<br/>
     *
     * @param secretToAuthenticateTarget The secret key that the target must provide to participate in mutual
     *         CHAP with the initiator (e.g. Windows client).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ChapInfo withSecretToAuthenticateTarget(String secretToAuthenticateTarget) {
        this.secretToAuthenticateTarget = secretToAuthenticateTarget;
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
        if (getTargetARN() != null) sb.append("TargetARN: " + getTargetARN() + ",");
        if (getSecretToAuthenticateInitiator() != null) sb.append("SecretToAuthenticateInitiator: " + getSecretToAuthenticateInitiator() + ",");
        if (getInitiatorName() != null) sb.append("InitiatorName: " + getInitiatorName() + ",");
        if (getSecretToAuthenticateTarget() != null) sb.append("SecretToAuthenticateTarget: " + getSecretToAuthenticateTarget() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTargetARN() == null) ? 0 : getTargetARN().hashCode()); 
        hashCode = prime * hashCode + ((getSecretToAuthenticateInitiator() == null) ? 0 : getSecretToAuthenticateInitiator().hashCode()); 
        hashCode = prime * hashCode + ((getInitiatorName() == null) ? 0 : getInitiatorName().hashCode()); 
        hashCode = prime * hashCode + ((getSecretToAuthenticateTarget() == null) ? 0 : getSecretToAuthenticateTarget().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ChapInfo == false) return false;
        ChapInfo other = (ChapInfo)obj;
        
        if (other.getTargetARN() == null ^ this.getTargetARN() == null) return false;
        if (other.getTargetARN() != null && other.getTargetARN().equals(this.getTargetARN()) == false) return false; 
        if (other.getSecretToAuthenticateInitiator() == null ^ this.getSecretToAuthenticateInitiator() == null) return false;
        if (other.getSecretToAuthenticateInitiator() != null && other.getSecretToAuthenticateInitiator().equals(this.getSecretToAuthenticateInitiator()) == false) return false; 
        if (other.getInitiatorName() == null ^ this.getInitiatorName() == null) return false;
        if (other.getInitiatorName() != null && other.getInitiatorName().equals(this.getInitiatorName()) == false) return false; 
        if (other.getSecretToAuthenticateTarget() == null ^ this.getSecretToAuthenticateTarget() == null) return false;
        if (other.getSecretToAuthenticateTarget() != null && other.getSecretToAuthenticateTarget().equals(this.getSecretToAuthenticateTarget()) == false) return false; 
        return true;
    }
    
}
    