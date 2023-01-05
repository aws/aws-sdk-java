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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/GetChunk" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetChunkRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** Storage job id */
    private String storageJobId;
    /** Chunk token */
    private String chunkToken;

    /**
     * Storage job id
     * 
     * @param storageJobId
     *        Storage job id
     */

    public void setStorageJobId(String storageJobId) {
        this.storageJobId = storageJobId;
    }

    /**
     * Storage job id
     * 
     * @return Storage job id
     */

    public String getStorageJobId() {
        return this.storageJobId;
    }

    /**
     * Storage job id
     * 
     * @param storageJobId
     *        Storage job id
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChunkRequest withStorageJobId(String storageJobId) {
        setStorageJobId(storageJobId);
        return this;
    }

    /**
     * Chunk token
     * 
     * @param chunkToken
     *        Chunk token
     */

    public void setChunkToken(String chunkToken) {
        this.chunkToken = chunkToken;
    }

    /**
     * Chunk token
     * 
     * @return Chunk token
     */

    public String getChunkToken() {
        return this.chunkToken;
    }

    /**
     * Chunk token
     * 
     * @param chunkToken
     *        Chunk token
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChunkRequest withChunkToken(String chunkToken) {
        setChunkToken(chunkToken);
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
        if (getChunkToken() != null)
            sb.append("ChunkToken: ").append(getChunkToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetChunkRequest == false)
            return false;
        GetChunkRequest other = (GetChunkRequest) obj;
        if (other.getStorageJobId() == null ^ this.getStorageJobId() == null)
            return false;
        if (other.getStorageJobId() != null && other.getStorageJobId().equals(this.getStorageJobId()) == false)
            return false;
        if (other.getChunkToken() == null ^ this.getChunkToken() == null)
            return false;
        if (other.getChunkToken() != null && other.getChunkToken().equals(this.getChunkToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorageJobId() == null) ? 0 : getStorageJobId().hashCode());
        hashCode = prime * hashCode + ((getChunkToken() == null) ? 0 : getChunkToken().hashCode());
        return hashCode;
    }

    @Override
    public GetChunkRequest clone() {
        return (GetChunkRequest) super.clone();
    }

}
