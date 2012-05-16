/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.storagegateway.AWSStorageGateway#updateChapCredentials(UpdateChapCredentialsRequest) UpdateChapCredentials operation}.
 * <p>
 * This operation updates the Challenge-Handshake Authentication Protocol (CHAP) credentials for a specified iSCSI target. By default, a gateway does not
 * have CHAP enabled; however, for added security, you might use it.
 * </p>
 *
 * @see com.amazonaws.services.storagegateway.AWSStorageGateway#updateChapCredentials(UpdateChapCredentialsRequest)
 */
public class UpdateChapCredentialsRequest extends AmazonWebServiceRequest {

    /**
     * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the
     * <a>DescribeStorediSCSIVolumes</a> operation to return to retrieve the
     * TargetARN for specified VolumeARN.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     */
    private String targetARN;

    /**
     * The secret key that the initiator (e.g. Windows client) must provide
     * to participate in mutual CHAP with the target. <p>Length: Minimum
     * length of 12. Maximum length of 16.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 16<br/>
     */
    private String secretToAuthenticateInitiator;

    /**
     * The iSCSI initiator that connects to the target. <p>Length: Minimum
     * length of 1. Maximum length of 255. <p><i>Valid Values</i>: The
     * initiator name can contain lowercase letters, numbers, periods (.),
     * and hyphens (-).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[0-9a-z:.-]+<br/>
     */
    private String initiatorName;

    /**
     * The secret key that the target must provide to participate in mutual
     * CHAP with the initiator (e.g. Windows client). <p>Length: Minimum
     * length of 12. Maximum length of 16.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 16<br/>
     */
    private String secretToAuthenticateTarget;

    /**
     * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the
     * <a>DescribeStorediSCSIVolumes</a> operation to return to retrieve the
     * TargetARN for specified VolumeARN.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     *
     * @return The Amazon Resource Name (ARN) of the iSCSI volume target. Use the
     *         <a>DescribeStorediSCSIVolumes</a> operation to return to retrieve the
     *         TargetARN for specified VolumeARN.
     */
    public String getTargetARN() {
        return targetARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the
     * <a>DescribeStorediSCSIVolumes</a> operation to return to retrieve the
     * TargetARN for specified VolumeARN.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     *
     * @param targetARN The Amazon Resource Name (ARN) of the iSCSI volume target. Use the
     *         <a>DescribeStorediSCSIVolumes</a> operation to return to retrieve the
     *         TargetARN for specified VolumeARN.
     */
    public void setTargetARN(String targetARN) {
        this.targetARN = targetARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the
     * <a>DescribeStorediSCSIVolumes</a> operation to return to retrieve the
     * TargetARN for specified VolumeARN.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     *
     * @param targetARN The Amazon Resource Name (ARN) of the iSCSI volume target. Use the
     *         <a>DescribeStorediSCSIVolumes</a> operation to return to retrieve the
     *         TargetARN for specified VolumeARN.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateChapCredentialsRequest withTargetARN(String targetARN) {
        this.targetARN = targetARN;
        return this;
    }
    
    
    /**
     * The secret key that the initiator (e.g. Windows client) must provide
     * to participate in mutual CHAP with the target. <p>Length: Minimum
     * length of 12. Maximum length of 16.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 16<br/>
     *
     * @return The secret key that the initiator (e.g. Windows client) must provide
     *         to participate in mutual CHAP with the target. <p>Length: Minimum
     *         length of 12. Maximum length of 16.
     */
    public String getSecretToAuthenticateInitiator() {
        return secretToAuthenticateInitiator;
    }
    
    /**
     * The secret key that the initiator (e.g. Windows client) must provide
     * to participate in mutual CHAP with the target. <p>Length: Minimum
     * length of 12. Maximum length of 16.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 16<br/>
     *
     * @param secretToAuthenticateInitiator The secret key that the initiator (e.g. Windows client) must provide
     *         to participate in mutual CHAP with the target. <p>Length: Minimum
     *         length of 12. Maximum length of 16.
     */
    public void setSecretToAuthenticateInitiator(String secretToAuthenticateInitiator) {
        this.secretToAuthenticateInitiator = secretToAuthenticateInitiator;
    }
    
    /**
     * The secret key that the initiator (e.g. Windows client) must provide
     * to participate in mutual CHAP with the target. <p>Length: Minimum
     * length of 12. Maximum length of 16.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 16<br/>
     *
     * @param secretToAuthenticateInitiator The secret key that the initiator (e.g. Windows client) must provide
     *         to participate in mutual CHAP with the target. <p>Length: Minimum
     *         length of 12. Maximum length of 16.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateChapCredentialsRequest withSecretToAuthenticateInitiator(String secretToAuthenticateInitiator) {
        this.secretToAuthenticateInitiator = secretToAuthenticateInitiator;
        return this;
    }
    
    
    /**
     * The iSCSI initiator that connects to the target. <p>Length: Minimum
     * length of 1. Maximum length of 255. <p><i>Valid Values</i>: The
     * initiator name can contain lowercase letters, numbers, periods (.),
     * and hyphens (-).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[0-9a-z:.-]+<br/>
     *
     * @return The iSCSI initiator that connects to the target. <p>Length: Minimum
     *         length of 1. Maximum length of 255. <p><i>Valid Values</i>: The
     *         initiator name can contain lowercase letters, numbers, periods (.),
     *         and hyphens (-).
     */
    public String getInitiatorName() {
        return initiatorName;
    }
    
    /**
     * The iSCSI initiator that connects to the target. <p>Length: Minimum
     * length of 1. Maximum length of 255. <p><i>Valid Values</i>: The
     * initiator name can contain lowercase letters, numbers, periods (.),
     * and hyphens (-).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[0-9a-z:.-]+<br/>
     *
     * @param initiatorName The iSCSI initiator that connects to the target. <p>Length: Minimum
     *         length of 1. Maximum length of 255. <p><i>Valid Values</i>: The
     *         initiator name can contain lowercase letters, numbers, periods (.),
     *         and hyphens (-).
     */
    public void setInitiatorName(String initiatorName) {
        this.initiatorName = initiatorName;
    }
    
    /**
     * The iSCSI initiator that connects to the target. <p>Length: Minimum
     * length of 1. Maximum length of 255. <p><i>Valid Values</i>: The
     * initiator name can contain lowercase letters, numbers, periods (.),
     * and hyphens (-).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[0-9a-z:.-]+<br/>
     *
     * @param initiatorName The iSCSI initiator that connects to the target. <p>Length: Minimum
     *         length of 1. Maximum length of 255. <p><i>Valid Values</i>: The
     *         initiator name can contain lowercase letters, numbers, periods (.),
     *         and hyphens (-).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateChapCredentialsRequest withInitiatorName(String initiatorName) {
        this.initiatorName = initiatorName;
        return this;
    }
    
    
    /**
     * The secret key that the target must provide to participate in mutual
     * CHAP with the initiator (e.g. Windows client). <p>Length: Minimum
     * length of 12. Maximum length of 16.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 16<br/>
     *
     * @return The secret key that the target must provide to participate in mutual
     *         CHAP with the initiator (e.g. Windows client). <p>Length: Minimum
     *         length of 12. Maximum length of 16.
     */
    public String getSecretToAuthenticateTarget() {
        return secretToAuthenticateTarget;
    }
    
    /**
     * The secret key that the target must provide to participate in mutual
     * CHAP with the initiator (e.g. Windows client). <p>Length: Minimum
     * length of 12. Maximum length of 16.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 16<br/>
     *
     * @param secretToAuthenticateTarget The secret key that the target must provide to participate in mutual
     *         CHAP with the initiator (e.g. Windows client). <p>Length: Minimum
     *         length of 12. Maximum length of 16.
     */
    public void setSecretToAuthenticateTarget(String secretToAuthenticateTarget) {
        this.secretToAuthenticateTarget = secretToAuthenticateTarget;
    }
    
    /**
     * The secret key that the target must provide to participate in mutual
     * CHAP with the initiator (e.g. Windows client). <p>Length: Minimum
     * length of 12. Maximum length of 16.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 16<br/>
     *
     * @param secretToAuthenticateTarget The secret key that the target must provide to participate in mutual
     *         CHAP with the initiator (e.g. Windows client). <p>Length: Minimum
     *         length of 12. Maximum length of 16.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateChapCredentialsRequest withSecretToAuthenticateTarget(String secretToAuthenticateTarget) {
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
        if (targetARN != null) sb.append("TargetARN: " + targetARN + ", ");
        if (secretToAuthenticateInitiator != null) sb.append("SecretToAuthenticateInitiator: " + secretToAuthenticateInitiator + ", ");
        if (initiatorName != null) sb.append("InitiatorName: " + initiatorName + ", ");
        if (secretToAuthenticateTarget != null) sb.append("SecretToAuthenticateTarget: " + secretToAuthenticateTarget + ", ");
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
    
        if (obj instanceof UpdateChapCredentialsRequest == false) return false;
        UpdateChapCredentialsRequest other = (UpdateChapCredentialsRequest)obj;
        
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
    