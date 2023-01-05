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
package com.amazonaws.services.backupstorage.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/GetObjectMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetObjectMetadataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** Backup job id for the in-progress backup. */
    private String storageJobId;
    /** Object token. */
    private String objectToken;

    /**
     * Backup job id for the in-progress backup.
     * 
     * @param storageJobId
     *        Backup job id for the in-progress backup.
     */

    public void setStorageJobId(String storageJobId) {
        this.storageJobId = storageJobId;
    }

    /**
     * Backup job id for the in-progress backup.
     * 
     * @return Backup job id for the in-progress backup.
     */

    public String getStorageJobId() {
        return this.storageJobId;
    }

    /**
     * Backup job id for the in-progress backup.
     * 
     * @param storageJobId
     *        Backup job id for the in-progress backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetObjectMetadataRequest withStorageJobId(String storageJobId) {
        setStorageJobId(storageJobId);
        return this;
    }

    /**
     * Object token.
     * 
     * @param objectToken
     *        Object token.
     */

    public void setObjectToken(String objectToken) {
        this.objectToken = objectToken;
    }

    /**
     * Object token.
     * 
     * @return Object token.
     */

    public String getObjectToken() {
        return this.objectToken;
    }

    /**
     * Object token.
     * 
     * @param objectToken
     *        Object token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetObjectMetadataRequest withObjectToken(String objectToken) {
        setObjectToken(objectToken);
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
        if (getStorageJobId() != null)
            sb.append("StorageJobId: ").append(getStorageJobId()).append(",");
        if (getObjectToken() != null)
            sb.append("ObjectToken: ").append(getObjectToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetObjectMetadataRequest == false)
            return false;
        GetObjectMetadataRequest other = (GetObjectMetadataRequest) obj;
        if (other.getStorageJobId() == null ^ this.getStorageJobId() == null)
            return false;
        if (other.getStorageJobId() != null && other.getStorageJobId().equals(this.getStorageJobId()) == false)
            return false;
        if (other.getObjectToken() == null ^ this.getObjectToken() == null)
            return false;
        if (other.getObjectToken() != null && other.getObjectToken().equals(this.getObjectToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorageJobId() == null) ? 0 : getStorageJobId().hashCode());
        hashCode = prime * hashCode + ((getObjectToken() == null) ? 0 : getObjectToken().hashCode());
        return hashCode;
    }

    @Override
    public GetObjectMetadataRequest clone() {
        return (GetObjectMetadataRequest) super.clone();
    }

}
