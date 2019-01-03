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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a get blob operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetBlob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBlobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the repository that contains the blob.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The ID of the blob, which is its SHA-1 pointer.
     * </p>
     */
    private String blobId;

    /**
     * <p>
     * The name of the repository that contains the blob.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that contains the blob.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the blob.
     * </p>
     * 
     * @return The name of the repository that contains the blob.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the blob.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that contains the blob.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBlobRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The ID of the blob, which is its SHA-1 pointer.
     * </p>
     * 
     * @param blobId
     *        The ID of the blob, which is its SHA-1 pointer.
     */

    public void setBlobId(String blobId) {
        this.blobId = blobId;
    }

    /**
     * <p>
     * The ID of the blob, which is its SHA-1 pointer.
     * </p>
     * 
     * @return The ID of the blob, which is its SHA-1 pointer.
     */

    public String getBlobId() {
        return this.blobId;
    }

    /**
     * <p>
     * The ID of the blob, which is its SHA-1 pointer.
     * </p>
     * 
     * @param blobId
     *        The ID of the blob, which is its SHA-1 pointer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBlobRequest withBlobId(String blobId) {
        setBlobId(blobId);
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
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getBlobId() != null)
            sb.append("BlobId: ").append(getBlobId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBlobRequest == false)
            return false;
        GetBlobRequest other = (GetBlobRequest) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getBlobId() == null ^ this.getBlobId() == null)
            return false;
        if (other.getBlobId() != null && other.getBlobId().equals(this.getBlobId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getBlobId() == null) ? 0 : getBlobId().hashCode());
        return hashCode;
    }

    @Override
    public GetBlobRequest clone() {
        return (GetBlobRequest) super.clone();
    }

}
