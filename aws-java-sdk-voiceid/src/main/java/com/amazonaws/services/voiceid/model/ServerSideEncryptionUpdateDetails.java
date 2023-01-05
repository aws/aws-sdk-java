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
package com.amazonaws.services.voiceid.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the most recent server-side encryption configuration update. When the server-side encryption
 * configuration is changed, dependency on the old KMS key is removed through an asynchronous process. When this update
 * is complete, the domain’s data can only be accessed using the new KMS key.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/ServerSideEncryptionUpdateDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerSideEncryptionUpdateDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Message explaining the current UpdateStatus. When the UpdateStatus is FAILED, this message explains the cause of
     * the failure.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The previous KMS key ID the domain was encrypted with, before ServerSideEncryptionConfiguration was updated to a
     * new KMS key ID.
     * </p>
     */
    private String oldKmsKeyId;
    /**
     * <p>
     * Status of the server-side encryption update. During an update, if there is an issue with the domain's current or
     * old KMS key ID, such as an inaccessible or disabled key, then the status is FAILED. In order to resolve this, the
     * key needs to be made accessible, and then an UpdateDomain call with the existing server-side encryption
     * configuration will re-attempt this update process.
     * </p>
     */
    private String updateStatus;

    /**
     * <p>
     * Message explaining the current UpdateStatus. When the UpdateStatus is FAILED, this message explains the cause of
     * the failure.
     * </p>
     * 
     * @param message
     *        Message explaining the current UpdateStatus. When the UpdateStatus is FAILED, this message explains the
     *        cause of the failure.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Message explaining the current UpdateStatus. When the UpdateStatus is FAILED, this message explains the cause of
     * the failure.
     * </p>
     * 
     * @return Message explaining the current UpdateStatus. When the UpdateStatus is FAILED, this message explains the
     *         cause of the failure.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Message explaining the current UpdateStatus. When the UpdateStatus is FAILED, this message explains the cause of
     * the failure.
     * </p>
     * 
     * @param message
     *        Message explaining the current UpdateStatus. When the UpdateStatus is FAILED, this message explains the
     *        cause of the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerSideEncryptionUpdateDetails withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The previous KMS key ID the domain was encrypted with, before ServerSideEncryptionConfiguration was updated to a
     * new KMS key ID.
     * </p>
     * 
     * @param oldKmsKeyId
     *        The previous KMS key ID the domain was encrypted with, before ServerSideEncryptionConfiguration was
     *        updated to a new KMS key ID.
     */

    public void setOldKmsKeyId(String oldKmsKeyId) {
        this.oldKmsKeyId = oldKmsKeyId;
    }

    /**
     * <p>
     * The previous KMS key ID the domain was encrypted with, before ServerSideEncryptionConfiguration was updated to a
     * new KMS key ID.
     * </p>
     * 
     * @return The previous KMS key ID the domain was encrypted with, before ServerSideEncryptionConfiguration was
     *         updated to a new KMS key ID.
     */

    public String getOldKmsKeyId() {
        return this.oldKmsKeyId;
    }

    /**
     * <p>
     * The previous KMS key ID the domain was encrypted with, before ServerSideEncryptionConfiguration was updated to a
     * new KMS key ID.
     * </p>
     * 
     * @param oldKmsKeyId
     *        The previous KMS key ID the domain was encrypted with, before ServerSideEncryptionConfiguration was
     *        updated to a new KMS key ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerSideEncryptionUpdateDetails withOldKmsKeyId(String oldKmsKeyId) {
        setOldKmsKeyId(oldKmsKeyId);
        return this;
    }

    /**
     * <p>
     * Status of the server-side encryption update. During an update, if there is an issue with the domain's current or
     * old KMS key ID, such as an inaccessible or disabled key, then the status is FAILED. In order to resolve this, the
     * key needs to be made accessible, and then an UpdateDomain call with the existing server-side encryption
     * configuration will re-attempt this update process.
     * </p>
     * 
     * @param updateStatus
     *        Status of the server-side encryption update. During an update, if there is an issue with the domain's
     *        current or old KMS key ID, such as an inaccessible or disabled key, then the status is FAILED. In order to
     *        resolve this, the key needs to be made accessible, and then an UpdateDomain call with the existing
     *        server-side encryption configuration will re-attempt this update process.
     * @see ServerSideEncryptionUpdateStatus
     */

    public void setUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
    }

    /**
     * <p>
     * Status of the server-side encryption update. During an update, if there is an issue with the domain's current or
     * old KMS key ID, such as an inaccessible or disabled key, then the status is FAILED. In order to resolve this, the
     * key needs to be made accessible, and then an UpdateDomain call with the existing server-side encryption
     * configuration will re-attempt this update process.
     * </p>
     * 
     * @return Status of the server-side encryption update. During an update, if there is an issue with the domain's
     *         current or old KMS key ID, such as an inaccessible or disabled key, then the status is FAILED. In order
     *         to resolve this, the key needs to be made accessible, and then an UpdateDomain call with the existing
     *         server-side encryption configuration will re-attempt this update process.
     * @see ServerSideEncryptionUpdateStatus
     */

    public String getUpdateStatus() {
        return this.updateStatus;
    }

    /**
     * <p>
     * Status of the server-side encryption update. During an update, if there is an issue with the domain's current or
     * old KMS key ID, such as an inaccessible or disabled key, then the status is FAILED. In order to resolve this, the
     * key needs to be made accessible, and then an UpdateDomain call with the existing server-side encryption
     * configuration will re-attempt this update process.
     * </p>
     * 
     * @param updateStatus
     *        Status of the server-side encryption update. During an update, if there is an issue with the domain's
     *        current or old KMS key ID, such as an inaccessible or disabled key, then the status is FAILED. In order to
     *        resolve this, the key needs to be made accessible, and then an UpdateDomain call with the existing
     *        server-side encryption configuration will re-attempt this update process.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerSideEncryptionUpdateStatus
     */

    public ServerSideEncryptionUpdateDetails withUpdateStatus(String updateStatus) {
        setUpdateStatus(updateStatus);
        return this;
    }

    /**
     * <p>
     * Status of the server-side encryption update. During an update, if there is an issue with the domain's current or
     * old KMS key ID, such as an inaccessible or disabled key, then the status is FAILED. In order to resolve this, the
     * key needs to be made accessible, and then an UpdateDomain call with the existing server-side encryption
     * configuration will re-attempt this update process.
     * </p>
     * 
     * @param updateStatus
     *        Status of the server-side encryption update. During an update, if there is an issue with the domain's
     *        current or old KMS key ID, such as an inaccessible or disabled key, then the status is FAILED. In order to
     *        resolve this, the key needs to be made accessible, and then an UpdateDomain call with the existing
     *        server-side encryption configuration will re-attempt this update process.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerSideEncryptionUpdateStatus
     */

    public ServerSideEncryptionUpdateDetails withUpdateStatus(ServerSideEncryptionUpdateStatus updateStatus) {
        this.updateStatus = updateStatus.toString();
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
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getOldKmsKeyId() != null)
            sb.append("OldKmsKeyId: ").append(getOldKmsKeyId()).append(",");
        if (getUpdateStatus() != null)
            sb.append("UpdateStatus: ").append(getUpdateStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerSideEncryptionUpdateDetails == false)
            return false;
        ServerSideEncryptionUpdateDetails other = (ServerSideEncryptionUpdateDetails) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getOldKmsKeyId() == null ^ this.getOldKmsKeyId() == null)
            return false;
        if (other.getOldKmsKeyId() != null && other.getOldKmsKeyId().equals(this.getOldKmsKeyId()) == false)
            return false;
        if (other.getUpdateStatus() == null ^ this.getUpdateStatus() == null)
            return false;
        if (other.getUpdateStatus() != null && other.getUpdateStatus().equals(this.getUpdateStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getOldKmsKeyId() == null) ? 0 : getOldKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getUpdateStatus() == null) ? 0 : getUpdateStatus().hashCode());
        return hashCode;
    }

    @Override
    public ServerSideEncryptionUpdateDetails clone() {
        try {
            return (ServerSideEncryptionUpdateDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.voiceid.model.transform.ServerSideEncryptionUpdateDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
