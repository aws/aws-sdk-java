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
 * A JSON object containing a .
 * </p>
 */
public class DescribeChapCredentialsResult implements Serializable {

    /**
     * An array of <a>ChapInfo</a> objects that represent CHAP credentials.
     * Each object in the array contains CHAP credential information for one
     * target-initiator pair. If no CHAP credentials are set, an empty array
     * is returned. CHAP credential information is provided in a JSON object
     * with the following fields: <ul> <li> <p><b>InitiatorName</b>: The
     * iSCSI initiator that connects to the target. </li> <li>
     * <p><b>SecretToAuthenticateInitiator</b>: The secret key that the
     * initiator (e.g. Windows client) must provide to participate in mutual
     * CHAP with the target. </li> <li> <p><b>SecretToAuthenticateTarget</b>:
     * The secret key that the target must provide to participate in mutual
     * CHAP with the initiator (e.g. Windows client). </li> <li>
     * <p><b>TargetARN</b>: The Amazon Resource Name (ARN) of the storage
     * volume. </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ChapInfo> chapCredentials;

    /**
     * An array of <a>ChapInfo</a> objects that represent CHAP credentials.
     * Each object in the array contains CHAP credential information for one
     * target-initiator pair. If no CHAP credentials are set, an empty array
     * is returned. CHAP credential information is provided in a JSON object
     * with the following fields: <ul> <li> <p><b>InitiatorName</b>: The
     * iSCSI initiator that connects to the target. </li> <li>
     * <p><b>SecretToAuthenticateInitiator</b>: The secret key that the
     * initiator (e.g. Windows client) must provide to participate in mutual
     * CHAP with the target. </li> <li> <p><b>SecretToAuthenticateTarget</b>:
     * The secret key that the target must provide to participate in mutual
     * CHAP with the initiator (e.g. Windows client). </li> <li>
     * <p><b>TargetARN</b>: The Amazon Resource Name (ARN) of the storage
     * volume. </li> </ul>
     *
     * @return An array of <a>ChapInfo</a> objects that represent CHAP credentials.
     *         Each object in the array contains CHAP credential information for one
     *         target-initiator pair. If no CHAP credentials are set, an empty array
     *         is returned. CHAP credential information is provided in a JSON object
     *         with the following fields: <ul> <li> <p><b>InitiatorName</b>: The
     *         iSCSI initiator that connects to the target. </li> <li>
     *         <p><b>SecretToAuthenticateInitiator</b>: The secret key that the
     *         initiator (e.g. Windows client) must provide to participate in mutual
     *         CHAP with the target. </li> <li> <p><b>SecretToAuthenticateTarget</b>:
     *         The secret key that the target must provide to participate in mutual
     *         CHAP with the initiator (e.g. Windows client). </li> <li>
     *         <p><b>TargetARN</b>: The Amazon Resource Name (ARN) of the storage
     *         volume. </li> </ul>
     */
    public java.util.List<ChapInfo> getChapCredentials() {
        if (chapCredentials == null) {
              chapCredentials = new com.amazonaws.internal.ListWithAutoConstructFlag<ChapInfo>();
              chapCredentials.setAutoConstruct(true);
        }
        return chapCredentials;
    }
    
    /**
     * An array of <a>ChapInfo</a> objects that represent CHAP credentials.
     * Each object in the array contains CHAP credential information for one
     * target-initiator pair. If no CHAP credentials are set, an empty array
     * is returned. CHAP credential information is provided in a JSON object
     * with the following fields: <ul> <li> <p><b>InitiatorName</b>: The
     * iSCSI initiator that connects to the target. </li> <li>
     * <p><b>SecretToAuthenticateInitiator</b>: The secret key that the
     * initiator (e.g. Windows client) must provide to participate in mutual
     * CHAP with the target. </li> <li> <p><b>SecretToAuthenticateTarget</b>:
     * The secret key that the target must provide to participate in mutual
     * CHAP with the initiator (e.g. Windows client). </li> <li>
     * <p><b>TargetARN</b>: The Amazon Resource Name (ARN) of the storage
     * volume. </li> </ul>
     *
     * @param chapCredentials An array of <a>ChapInfo</a> objects that represent CHAP credentials.
     *         Each object in the array contains CHAP credential information for one
     *         target-initiator pair. If no CHAP credentials are set, an empty array
     *         is returned. CHAP credential information is provided in a JSON object
     *         with the following fields: <ul> <li> <p><b>InitiatorName</b>: The
     *         iSCSI initiator that connects to the target. </li> <li>
     *         <p><b>SecretToAuthenticateInitiator</b>: The secret key that the
     *         initiator (e.g. Windows client) must provide to participate in mutual
     *         CHAP with the target. </li> <li> <p><b>SecretToAuthenticateTarget</b>:
     *         The secret key that the target must provide to participate in mutual
     *         CHAP with the initiator (e.g. Windows client). </li> <li>
     *         <p><b>TargetARN</b>: The Amazon Resource Name (ARN) of the storage
     *         volume. </li> </ul>
     */
    public void setChapCredentials(java.util.Collection<ChapInfo> chapCredentials) {
        if (chapCredentials == null) {
            this.chapCredentials = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ChapInfo> chapCredentialsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ChapInfo>(chapCredentials.size());
        chapCredentialsCopy.addAll(chapCredentials);
        this.chapCredentials = chapCredentialsCopy;
    }
    
    /**
     * An array of <a>ChapInfo</a> objects that represent CHAP credentials.
     * Each object in the array contains CHAP credential information for one
     * target-initiator pair. If no CHAP credentials are set, an empty array
     * is returned. CHAP credential information is provided in a JSON object
     * with the following fields: <ul> <li> <p><b>InitiatorName</b>: The
     * iSCSI initiator that connects to the target. </li> <li>
     * <p><b>SecretToAuthenticateInitiator</b>: The secret key that the
     * initiator (e.g. Windows client) must provide to participate in mutual
     * CHAP with the target. </li> <li> <p><b>SecretToAuthenticateTarget</b>:
     * The secret key that the target must provide to participate in mutual
     * CHAP with the initiator (e.g. Windows client). </li> <li>
     * <p><b>TargetARN</b>: The Amazon Resource Name (ARN) of the storage
     * volume. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param chapCredentials An array of <a>ChapInfo</a> objects that represent CHAP credentials.
     *         Each object in the array contains CHAP credential information for one
     *         target-initiator pair. If no CHAP credentials are set, an empty array
     *         is returned. CHAP credential information is provided in a JSON object
     *         with the following fields: <ul> <li> <p><b>InitiatorName</b>: The
     *         iSCSI initiator that connects to the target. </li> <li>
     *         <p><b>SecretToAuthenticateInitiator</b>: The secret key that the
     *         initiator (e.g. Windows client) must provide to participate in mutual
     *         CHAP with the target. </li> <li> <p><b>SecretToAuthenticateTarget</b>:
     *         The secret key that the target must provide to participate in mutual
     *         CHAP with the initiator (e.g. Windows client). </li> <li>
     *         <p><b>TargetARN</b>: The Amazon Resource Name (ARN) of the storage
     *         volume. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeChapCredentialsResult withChapCredentials(ChapInfo... chapCredentials) {
        if (getChapCredentials() == null) setChapCredentials(new java.util.ArrayList<ChapInfo>(chapCredentials.length));
        for (ChapInfo value : chapCredentials) {
            getChapCredentials().add(value);
        }
        return this;
    }
    
    /**
     * An array of <a>ChapInfo</a> objects that represent CHAP credentials.
     * Each object in the array contains CHAP credential information for one
     * target-initiator pair. If no CHAP credentials are set, an empty array
     * is returned. CHAP credential information is provided in a JSON object
     * with the following fields: <ul> <li> <p><b>InitiatorName</b>: The
     * iSCSI initiator that connects to the target. </li> <li>
     * <p><b>SecretToAuthenticateInitiator</b>: The secret key that the
     * initiator (e.g. Windows client) must provide to participate in mutual
     * CHAP with the target. </li> <li> <p><b>SecretToAuthenticateTarget</b>:
     * The secret key that the target must provide to participate in mutual
     * CHAP with the initiator (e.g. Windows client). </li> <li>
     * <p><b>TargetARN</b>: The Amazon Resource Name (ARN) of the storage
     * volume. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param chapCredentials An array of <a>ChapInfo</a> objects that represent CHAP credentials.
     *         Each object in the array contains CHAP credential information for one
     *         target-initiator pair. If no CHAP credentials are set, an empty array
     *         is returned. CHAP credential information is provided in a JSON object
     *         with the following fields: <ul> <li> <p><b>InitiatorName</b>: The
     *         iSCSI initiator that connects to the target. </li> <li>
     *         <p><b>SecretToAuthenticateInitiator</b>: The secret key that the
     *         initiator (e.g. Windows client) must provide to participate in mutual
     *         CHAP with the target. </li> <li> <p><b>SecretToAuthenticateTarget</b>:
     *         The secret key that the target must provide to participate in mutual
     *         CHAP with the initiator (e.g. Windows client). </li> <li>
     *         <p><b>TargetARN</b>: The Amazon Resource Name (ARN) of the storage
     *         volume. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeChapCredentialsResult withChapCredentials(java.util.Collection<ChapInfo> chapCredentials) {
        if (chapCredentials == null) {
            this.chapCredentials = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ChapInfo> chapCredentialsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ChapInfo>(chapCredentials.size());
            chapCredentialsCopy.addAll(chapCredentials);
            this.chapCredentials = chapCredentialsCopy;
        }

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
        if (getChapCredentials() != null) sb.append("ChapCredentials: " + getChapCredentials() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getChapCredentials() == null) ? 0 : getChapCredentials().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeChapCredentialsResult == false) return false;
        DescribeChapCredentialsResult other = (DescribeChapCredentialsResult)obj;
        
        if (other.getChapCredentials() == null ^ this.getChapCredentials() == null) return false;
        if (other.getChapCredentials() != null && other.getChapCredentials().equals(this.getChapCredentials()) == false) return false; 
        return true;
    }
    
}
    