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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateDataRepositoryAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDataRepositoryAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the data repository association that you are updating.
     * </p>
     */
    private String associationId;

    private String clientRequestToken;
    /**
     * <p>
     * For files imported from a data repository, this value determines the stripe count and maximum amount of data per
     * file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be striped
     * across is limited by the total number of disks that make up the file system.
     * </p>
     * <p>
     * The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects have a
     * maximum size of 5 TB.
     * </p>
     */
    private Integer importedFileChunkSize;
    /**
     * <p>
     * The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system with a data
     * repository association. The configuration defines which file events (new, changed, or deleted files or
     * directories) are automatically imported from the linked data repository to the file system or automatically
     * exported from the file system to the data repository.
     * </p>
     */
    private S3DataRepositoryConfiguration s3;

    /**
     * <p>
     * The ID of the data repository association that you are updating.
     * </p>
     * 
     * @param associationId
     *        The ID of the data repository association that you are updating.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The ID of the data repository association that you are updating.
     * </p>
     * 
     * @return The ID of the data repository association that you are updating.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The ID of the data repository association that you are updating.
     * </p>
     * 
     * @param associationId
     *        The ID of the data repository association that you are updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataRepositoryAssociationRequest withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * @param clientRequestToken
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * @return
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * @param clientRequestToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataRepositoryAssociationRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * For files imported from a data repository, this value determines the stripe count and maximum amount of data per
     * file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be striped
     * across is limited by the total number of disks that make up the file system.
     * </p>
     * <p>
     * The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects have a
     * maximum size of 5 TB.
     * </p>
     * 
     * @param importedFileChunkSize
     *        For files imported from a data repository, this value determines the stripe count and maximum amount of
     *        data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file
     *        can be striped across is limited by the total number of disks that make up the file system.</p>
     *        <p>
     *        The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects
     *        have a maximum size of 5 TB.
     */

    public void setImportedFileChunkSize(Integer importedFileChunkSize) {
        this.importedFileChunkSize = importedFileChunkSize;
    }

    /**
     * <p>
     * For files imported from a data repository, this value determines the stripe count and maximum amount of data per
     * file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be striped
     * across is limited by the total number of disks that make up the file system.
     * </p>
     * <p>
     * The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects have a
     * maximum size of 5 TB.
     * </p>
     * 
     * @return For files imported from a data repository, this value determines the stripe count and maximum amount of
     *         data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file
     *         can be striped across is limited by the total number of disks that make up the file system.</p>
     *         <p>
     *         The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3
     *         objects have a maximum size of 5 TB.
     */

    public Integer getImportedFileChunkSize() {
        return this.importedFileChunkSize;
    }

    /**
     * <p>
     * For files imported from a data repository, this value determines the stripe count and maximum amount of data per
     * file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be striped
     * across is limited by the total number of disks that make up the file system.
     * </p>
     * <p>
     * The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects have a
     * maximum size of 5 TB.
     * </p>
     * 
     * @param importedFileChunkSize
     *        For files imported from a data repository, this value determines the stripe count and maximum amount of
     *        data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file
     *        can be striped across is limited by the total number of disks that make up the file system.</p>
     *        <p>
     *        The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects
     *        have a maximum size of 5 TB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataRepositoryAssociationRequest withImportedFileChunkSize(Integer importedFileChunkSize) {
        setImportedFileChunkSize(importedFileChunkSize);
        return this;
    }

    /**
     * <p>
     * The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system with a data
     * repository association. The configuration defines which file events (new, changed, or deleted files or
     * directories) are automatically imported from the linked data repository to the file system or automatically
     * exported from the file system to the data repository.
     * </p>
     * 
     * @param s3
     *        The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system with a data
     *        repository association. The configuration defines which file events (new, changed, or deleted files or
     *        directories) are automatically imported from the linked data repository to the file system or
     *        automatically exported from the file system to the data repository.
     */

    public void setS3(S3DataRepositoryConfiguration s3) {
        this.s3 = s3;
    }

    /**
     * <p>
     * The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system with a data
     * repository association. The configuration defines which file events (new, changed, or deleted files or
     * directories) are automatically imported from the linked data repository to the file system or automatically
     * exported from the file system to the data repository.
     * </p>
     * 
     * @return The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system with a data
     *         repository association. The configuration defines which file events (new, changed, or deleted files or
     *         directories) are automatically imported from the linked data repository to the file system or
     *         automatically exported from the file system to the data repository.
     */

    public S3DataRepositoryConfiguration getS3() {
        return this.s3;
    }

    /**
     * <p>
     * The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system with a data
     * repository association. The configuration defines which file events (new, changed, or deleted files or
     * directories) are automatically imported from the linked data repository to the file system or automatically
     * exported from the file system to the data repository.
     * </p>
     * 
     * @param s3
     *        The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system with a data
     *        repository association. The configuration defines which file events (new, changed, or deleted files or
     *        directories) are automatically imported from the linked data repository to the file system or
     *        automatically exported from the file system to the data repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataRepositoryAssociationRequest withS3(S3DataRepositoryConfiguration s3) {
        setS3(s3);
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
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getImportedFileChunkSize() != null)
            sb.append("ImportedFileChunkSize: ").append(getImportedFileChunkSize()).append(",");
        if (getS3() != null)
            sb.append("S3: ").append(getS3());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDataRepositoryAssociationRequest == false)
            return false;
        UpdateDataRepositoryAssociationRequest other = (UpdateDataRepositoryAssociationRequest) obj;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getImportedFileChunkSize() == null ^ this.getImportedFileChunkSize() == null)
            return false;
        if (other.getImportedFileChunkSize() != null && other.getImportedFileChunkSize().equals(this.getImportedFileChunkSize()) == false)
            return false;
        if (other.getS3() == null ^ this.getS3() == null)
            return false;
        if (other.getS3() != null && other.getS3().equals(this.getS3()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getImportedFileChunkSize() == null) ? 0 : getImportedFileChunkSize().hashCode());
        hashCode = prime * hashCode + ((getS3() == null) ? 0 : getS3().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDataRepositoryAssociationRequest clone() {
        return (UpdateDataRepositoryAssociationRequest) super.clone();
    }

}
