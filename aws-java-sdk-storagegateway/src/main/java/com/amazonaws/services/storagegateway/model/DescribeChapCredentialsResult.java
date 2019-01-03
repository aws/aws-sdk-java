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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A JSON object containing a .
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeChapCredentials"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeChapCredentialsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <a>ChapInfo</a> objects that represent CHAP credentials. Each object in the array contains CHAP
     * credential information for one target-initiator pair. If no CHAP credentials are set, an empty array is returned.
     * CHAP credential information is provided in a JSON object with the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>InitiatorName</b>: The iSCSI initiator that connects to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SecretToAuthenticateInitiator</b>: The secret key that the initiator (for example, the Windows client) must
     * provide to participate in mutual CHAP with the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SecretToAuthenticateTarget</b>: The secret key that the target must provide to participate in mutual CHAP with
     * the initiator (e.g. Windows client).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TargetARN</b>: The Amazon Resource Name (ARN) of the storage volume.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<ChapInfo> chapCredentials;

    /**
     * <p>
     * An array of <a>ChapInfo</a> objects that represent CHAP credentials. Each object in the array contains CHAP
     * credential information for one target-initiator pair. If no CHAP credentials are set, an empty array is returned.
     * CHAP credential information is provided in a JSON object with the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>InitiatorName</b>: The iSCSI initiator that connects to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SecretToAuthenticateInitiator</b>: The secret key that the initiator (for example, the Windows client) must
     * provide to participate in mutual CHAP with the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SecretToAuthenticateTarget</b>: The secret key that the target must provide to participate in mutual CHAP with
     * the initiator (e.g. Windows client).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TargetARN</b>: The Amazon Resource Name (ARN) of the storage volume.
     * </p>
     * </li>
     * </ul>
     * 
     * @return An array of <a>ChapInfo</a> objects that represent CHAP credentials. Each object in the array contains
     *         CHAP credential information for one target-initiator pair. If no CHAP credentials are set, an empty array
     *         is returned. CHAP credential information is provided in a JSON object with the following fields:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>InitiatorName</b>: The iSCSI initiator that connects to the target.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>SecretToAuthenticateInitiator</b>: The secret key that the initiator (for example, the Windows client)
     *         must provide to participate in mutual CHAP with the target.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>SecretToAuthenticateTarget</b>: The secret key that the target must provide to participate in mutual
     *         CHAP with the initiator (e.g. Windows client).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>TargetARN</b>: The Amazon Resource Name (ARN) of the storage volume.
     *         </p>
     *         </li>
     */

    public java.util.List<ChapInfo> getChapCredentials() {
        if (chapCredentials == null) {
            chapCredentials = new com.amazonaws.internal.SdkInternalList<ChapInfo>();
        }
        return chapCredentials;
    }

    /**
     * <p>
     * An array of <a>ChapInfo</a> objects that represent CHAP credentials. Each object in the array contains CHAP
     * credential information for one target-initiator pair. If no CHAP credentials are set, an empty array is returned.
     * CHAP credential information is provided in a JSON object with the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>InitiatorName</b>: The iSCSI initiator that connects to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SecretToAuthenticateInitiator</b>: The secret key that the initiator (for example, the Windows client) must
     * provide to participate in mutual CHAP with the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SecretToAuthenticateTarget</b>: The secret key that the target must provide to participate in mutual CHAP with
     * the initiator (e.g. Windows client).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TargetARN</b>: The Amazon Resource Name (ARN) of the storage volume.
     * </p>
     * </li>
     * </ul>
     * 
     * @param chapCredentials
     *        An array of <a>ChapInfo</a> objects that represent CHAP credentials. Each object in the array contains
     *        CHAP credential information for one target-initiator pair. If no CHAP credentials are set, an empty array
     *        is returned. CHAP credential information is provided in a JSON object with the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>InitiatorName</b>: The iSCSI initiator that connects to the target.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SecretToAuthenticateInitiator</b>: The secret key that the initiator (for example, the Windows client)
     *        must provide to participate in mutual CHAP with the target.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SecretToAuthenticateTarget</b>: The secret key that the target must provide to participate in mutual
     *        CHAP with the initiator (e.g. Windows client).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TargetARN</b>: The Amazon Resource Name (ARN) of the storage volume.
     *        </p>
     *        </li>
     */

    public void setChapCredentials(java.util.Collection<ChapInfo> chapCredentials) {
        if (chapCredentials == null) {
            this.chapCredentials = null;
            return;
        }

        this.chapCredentials = new com.amazonaws.internal.SdkInternalList<ChapInfo>(chapCredentials);
    }

    /**
     * <p>
     * An array of <a>ChapInfo</a> objects that represent CHAP credentials. Each object in the array contains CHAP
     * credential information for one target-initiator pair. If no CHAP credentials are set, an empty array is returned.
     * CHAP credential information is provided in a JSON object with the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>InitiatorName</b>: The iSCSI initiator that connects to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SecretToAuthenticateInitiator</b>: The secret key that the initiator (for example, the Windows client) must
     * provide to participate in mutual CHAP with the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SecretToAuthenticateTarget</b>: The secret key that the target must provide to participate in mutual CHAP with
     * the initiator (e.g. Windows client).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TargetARN</b>: The Amazon Resource Name (ARN) of the storage volume.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChapCredentials(java.util.Collection)} or {@link #withChapCredentials(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param chapCredentials
     *        An array of <a>ChapInfo</a> objects that represent CHAP credentials. Each object in the array contains
     *        CHAP credential information for one target-initiator pair. If no CHAP credentials are set, an empty array
     *        is returned. CHAP credential information is provided in a JSON object with the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>InitiatorName</b>: The iSCSI initiator that connects to the target.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SecretToAuthenticateInitiator</b>: The secret key that the initiator (for example, the Windows client)
     *        must provide to participate in mutual CHAP with the target.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SecretToAuthenticateTarget</b>: The secret key that the target must provide to participate in mutual
     *        CHAP with the initiator (e.g. Windows client).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TargetARN</b>: The Amazon Resource Name (ARN) of the storage volume.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChapCredentialsResult withChapCredentials(ChapInfo... chapCredentials) {
        if (this.chapCredentials == null) {
            setChapCredentials(new com.amazonaws.internal.SdkInternalList<ChapInfo>(chapCredentials.length));
        }
        for (ChapInfo ele : chapCredentials) {
            this.chapCredentials.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <a>ChapInfo</a> objects that represent CHAP credentials. Each object in the array contains CHAP
     * credential information for one target-initiator pair. If no CHAP credentials are set, an empty array is returned.
     * CHAP credential information is provided in a JSON object with the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>InitiatorName</b>: The iSCSI initiator that connects to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SecretToAuthenticateInitiator</b>: The secret key that the initiator (for example, the Windows client) must
     * provide to participate in mutual CHAP with the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SecretToAuthenticateTarget</b>: The secret key that the target must provide to participate in mutual CHAP with
     * the initiator (e.g. Windows client).
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TargetARN</b>: The Amazon Resource Name (ARN) of the storage volume.
     * </p>
     * </li>
     * </ul>
     * 
     * @param chapCredentials
     *        An array of <a>ChapInfo</a> objects that represent CHAP credentials. Each object in the array contains
     *        CHAP credential information for one target-initiator pair. If no CHAP credentials are set, an empty array
     *        is returned. CHAP credential information is provided in a JSON object with the following fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>InitiatorName</b>: The iSCSI initiator that connects to the target.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SecretToAuthenticateInitiator</b>: The secret key that the initiator (for example, the Windows client)
     *        must provide to participate in mutual CHAP with the target.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SecretToAuthenticateTarget</b>: The secret key that the target must provide to participate in mutual
     *        CHAP with the initiator (e.g. Windows client).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TargetARN</b>: The Amazon Resource Name (ARN) of the storage volume.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChapCredentialsResult withChapCredentials(java.util.Collection<ChapInfo> chapCredentials) {
        setChapCredentials(chapCredentials);
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
        if (getChapCredentials() != null)
            sb.append("ChapCredentials: ").append(getChapCredentials());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeChapCredentialsResult == false)
            return false;
        DescribeChapCredentialsResult other = (DescribeChapCredentialsResult) obj;
        if (other.getChapCredentials() == null ^ this.getChapCredentials() == null)
            return false;
        if (other.getChapCredentials() != null && other.getChapCredentials().equals(this.getChapCredentials()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChapCredentials() == null) ? 0 : getChapCredentials().hashCode());
        return hashCode;
    }

    @Override
    public DescribeChapCredentialsResult clone() {
        try {
            return (DescribeChapCredentialsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
