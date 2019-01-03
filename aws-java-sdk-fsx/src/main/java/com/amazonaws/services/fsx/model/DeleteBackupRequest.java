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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request object for <code>DeleteBackup</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteBackup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteBackupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the backup you want to delete.
     * </p>
     */
    private String backupId;
    /**
     * <p>
     * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent deletion. This is
     * automatically filled on your behalf when using the AWS CLI or SDK.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The ID of the backup you want to delete.
     * </p>
     * 
     * @param backupId
     *        The ID of the backup you want to delete.
     */

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    /**
     * <p>
     * The ID of the backup you want to delete.
     * </p>
     * 
     * @return The ID of the backup you want to delete.
     */

    public String getBackupId() {
        return this.backupId;
    }

    /**
     * <p>
     * The ID of the backup you want to delete.
     * </p>
     * 
     * @param backupId
     *        The ID of the backup you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBackupRequest withBackupId(String backupId) {
        setBackupId(backupId);
        return this;
    }

    /**
     * <p>
     * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent deletion. This is
     * automatically filled on your behalf when using the AWS CLI or SDK.
     * </p>
     * 
     * @param clientRequestToken
     *        (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent deletion. This
     *        is automatically filled on your behalf when using the AWS CLI or SDK.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent deletion. This is
     * automatically filled on your behalf when using the AWS CLI or SDK.
     * </p>
     * 
     * @return (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent deletion. This
     *         is automatically filled on your behalf when using the AWS CLI or SDK.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent deletion. This is
     * automatically filled on your behalf when using the AWS CLI or SDK.
     * </p>
     * 
     * @param clientRequestToken
     *        (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent deletion. This
     *        is automatically filled on your behalf when using the AWS CLI or SDK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBackupRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getBackupId() != null)
            sb.append("BackupId: ").append(getBackupId()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteBackupRequest == false)
            return false;
        DeleteBackupRequest other = (DeleteBackupRequest) obj;
        if (other.getBackupId() == null ^ this.getBackupId() == null)
            return false;
        if (other.getBackupId() != null && other.getBackupId().equals(this.getBackupId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupId() == null) ? 0 : getBackupId().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public DeleteBackupRequest clone() {
        return (DeleteBackupRequest) super.clone();
    }

}
