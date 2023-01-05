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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateDataRepositoryAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDataRepositoryAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String fileSystemId;
    /**
     * <p>
     * A path on the file system that points to a high-level directory (such as <code>/ns1/</code>) or subdirectory
     * (such as <code>/ns1/subdir/</code>) that will be mapped 1-1 with <code>DataRepositoryPath</code>. The leading
     * forward slash in the name is required. Two data repository associations cannot have overlapping file system
     * paths. For example, if a data repository is associated with file system path <code>/ns1/</code>, then you cannot
     * link another data repository with file system path <code>/ns1/ns2</code>.
     * </p>
     * <p>
     * This path specifies where in your file system files will be exported from or imported to. This file system
     * directory can be linked to only one Amazon S3 bucket, and no other S3 bucket can be linked to the directory.
     * </p>
     * <note>
     * <p>
     * If you specify only a forward slash (<code>/</code>) as the file system path, you can link only one data
     * repository to the file system. You can only specify "/" as the file system path for the first data repository
     * associated with a file system.
     * </p>
     * </note>
     */
    private String fileSystemPath;
    /**
     * <p>
     * The path to the Amazon S3 data repository that will be linked to the file system. The path can be an S3 bucket or
     * prefix in the format <code>s3://myBucket/myPrefix/</code>. This path specifies where in the S3 data repository
     * files will be imported from or exported to.
     * </p>
     */
    private String dataRepositoryPath;
    /**
     * <p>
     * Set to <code>true</code> to run an import data repository task to import metadata from the data repository to the
     * file system after the data repository association is created. Default is <code>false</code>.
     * </p>
     */
    private Boolean batchImportMetaDataOnCreate;
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

    private String clientRequestToken;

    private java.util.List<Tag> tags;

    /**
     * @param fileSystemId
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * @return
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @param fileSystemId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataRepositoryAssociationRequest withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * A path on the file system that points to a high-level directory (such as <code>/ns1/</code>) or subdirectory
     * (such as <code>/ns1/subdir/</code>) that will be mapped 1-1 with <code>DataRepositoryPath</code>. The leading
     * forward slash in the name is required. Two data repository associations cannot have overlapping file system
     * paths. For example, if a data repository is associated with file system path <code>/ns1/</code>, then you cannot
     * link another data repository with file system path <code>/ns1/ns2</code>.
     * </p>
     * <p>
     * This path specifies where in your file system files will be exported from or imported to. This file system
     * directory can be linked to only one Amazon S3 bucket, and no other S3 bucket can be linked to the directory.
     * </p>
     * <note>
     * <p>
     * If you specify only a forward slash (<code>/</code>) as the file system path, you can link only one data
     * repository to the file system. You can only specify "/" as the file system path for the first data repository
     * associated with a file system.
     * </p>
     * </note>
     * 
     * @param fileSystemPath
     *        A path on the file system that points to a high-level directory (such as <code>/ns1/</code>) or
     *        subdirectory (such as <code>/ns1/subdir/</code>) that will be mapped 1-1 with
     *        <code>DataRepositoryPath</code>. The leading forward slash in the name is required. Two data repository
     *        associations cannot have overlapping file system paths. For example, if a data repository is associated
     *        with file system path <code>/ns1/</code>, then you cannot link another data repository with file system
     *        path <code>/ns1/ns2</code>.</p>
     *        <p>
     *        This path specifies where in your file system files will be exported from or imported to. This file system
     *        directory can be linked to only one Amazon S3 bucket, and no other S3 bucket can be linked to the
     *        directory.
     *        </p>
     *        <note>
     *        <p>
     *        If you specify only a forward slash (<code>/</code>) as the file system path, you can link only one data
     *        repository to the file system. You can only specify "/" as the file system path for the first data
     *        repository associated with a file system.
     *        </p>
     */

    public void setFileSystemPath(String fileSystemPath) {
        this.fileSystemPath = fileSystemPath;
    }

    /**
     * <p>
     * A path on the file system that points to a high-level directory (such as <code>/ns1/</code>) or subdirectory
     * (such as <code>/ns1/subdir/</code>) that will be mapped 1-1 with <code>DataRepositoryPath</code>. The leading
     * forward slash in the name is required. Two data repository associations cannot have overlapping file system
     * paths. For example, if a data repository is associated with file system path <code>/ns1/</code>, then you cannot
     * link another data repository with file system path <code>/ns1/ns2</code>.
     * </p>
     * <p>
     * This path specifies where in your file system files will be exported from or imported to. This file system
     * directory can be linked to only one Amazon S3 bucket, and no other S3 bucket can be linked to the directory.
     * </p>
     * <note>
     * <p>
     * If you specify only a forward slash (<code>/</code>) as the file system path, you can link only one data
     * repository to the file system. You can only specify "/" as the file system path for the first data repository
     * associated with a file system.
     * </p>
     * </note>
     * 
     * @return A path on the file system that points to a high-level directory (such as <code>/ns1/</code>) or
     *         subdirectory (such as <code>/ns1/subdir/</code>) that will be mapped 1-1 with
     *         <code>DataRepositoryPath</code>. The leading forward slash in the name is required. Two data repository
     *         associations cannot have overlapping file system paths. For example, if a data repository is associated
     *         with file system path <code>/ns1/</code>, then you cannot link another data repository with file system
     *         path <code>/ns1/ns2</code>.</p>
     *         <p>
     *         This path specifies where in your file system files will be exported from or imported to. This file
     *         system directory can be linked to only one Amazon S3 bucket, and no other S3 bucket can be linked to the
     *         directory.
     *         </p>
     *         <note>
     *         <p>
     *         If you specify only a forward slash (<code>/</code>) as the file system path, you can link only one data
     *         repository to the file system. You can only specify "/" as the file system path for the first data
     *         repository associated with a file system.
     *         </p>
     */

    public String getFileSystemPath() {
        return this.fileSystemPath;
    }

    /**
     * <p>
     * A path on the file system that points to a high-level directory (such as <code>/ns1/</code>) or subdirectory
     * (such as <code>/ns1/subdir/</code>) that will be mapped 1-1 with <code>DataRepositoryPath</code>. The leading
     * forward slash in the name is required. Two data repository associations cannot have overlapping file system
     * paths. For example, if a data repository is associated with file system path <code>/ns1/</code>, then you cannot
     * link another data repository with file system path <code>/ns1/ns2</code>.
     * </p>
     * <p>
     * This path specifies where in your file system files will be exported from or imported to. This file system
     * directory can be linked to only one Amazon S3 bucket, and no other S3 bucket can be linked to the directory.
     * </p>
     * <note>
     * <p>
     * If you specify only a forward slash (<code>/</code>) as the file system path, you can link only one data
     * repository to the file system. You can only specify "/" as the file system path for the first data repository
     * associated with a file system.
     * </p>
     * </note>
     * 
     * @param fileSystemPath
     *        A path on the file system that points to a high-level directory (such as <code>/ns1/</code>) or
     *        subdirectory (such as <code>/ns1/subdir/</code>) that will be mapped 1-1 with
     *        <code>DataRepositoryPath</code>. The leading forward slash in the name is required. Two data repository
     *        associations cannot have overlapping file system paths. For example, if a data repository is associated
     *        with file system path <code>/ns1/</code>, then you cannot link another data repository with file system
     *        path <code>/ns1/ns2</code>.</p>
     *        <p>
     *        This path specifies where in your file system files will be exported from or imported to. This file system
     *        directory can be linked to only one Amazon S3 bucket, and no other S3 bucket can be linked to the
     *        directory.
     *        </p>
     *        <note>
     *        <p>
     *        If you specify only a forward slash (<code>/</code>) as the file system path, you can link only one data
     *        repository to the file system. You can only specify "/" as the file system path for the first data
     *        repository associated with a file system.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataRepositoryAssociationRequest withFileSystemPath(String fileSystemPath) {
        setFileSystemPath(fileSystemPath);
        return this;
    }

    /**
     * <p>
     * The path to the Amazon S3 data repository that will be linked to the file system. The path can be an S3 bucket or
     * prefix in the format <code>s3://myBucket/myPrefix/</code>. This path specifies where in the S3 data repository
     * files will be imported from or exported to.
     * </p>
     * 
     * @param dataRepositoryPath
     *        The path to the Amazon S3 data repository that will be linked to the file system. The path can be an S3
     *        bucket or prefix in the format <code>s3://myBucket/myPrefix/</code>. This path specifies where in the S3
     *        data repository files will be imported from or exported to.
     */

    public void setDataRepositoryPath(String dataRepositoryPath) {
        this.dataRepositoryPath = dataRepositoryPath;
    }

    /**
     * <p>
     * The path to the Amazon S3 data repository that will be linked to the file system. The path can be an S3 bucket or
     * prefix in the format <code>s3://myBucket/myPrefix/</code>. This path specifies where in the S3 data repository
     * files will be imported from or exported to.
     * </p>
     * 
     * @return The path to the Amazon S3 data repository that will be linked to the file system. The path can be an S3
     *         bucket or prefix in the format <code>s3://myBucket/myPrefix/</code>. This path specifies where in the S3
     *         data repository files will be imported from or exported to.
     */

    public String getDataRepositoryPath() {
        return this.dataRepositoryPath;
    }

    /**
     * <p>
     * The path to the Amazon S3 data repository that will be linked to the file system. The path can be an S3 bucket or
     * prefix in the format <code>s3://myBucket/myPrefix/</code>. This path specifies where in the S3 data repository
     * files will be imported from or exported to.
     * </p>
     * 
     * @param dataRepositoryPath
     *        The path to the Amazon S3 data repository that will be linked to the file system. The path can be an S3
     *        bucket or prefix in the format <code>s3://myBucket/myPrefix/</code>. This path specifies where in the S3
     *        data repository files will be imported from or exported to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataRepositoryAssociationRequest withDataRepositoryPath(String dataRepositoryPath) {
        setDataRepositoryPath(dataRepositoryPath);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to run an import data repository task to import metadata from the data repository to the
     * file system after the data repository association is created. Default is <code>false</code>.
     * </p>
     * 
     * @param batchImportMetaDataOnCreate
     *        Set to <code>true</code> to run an import data repository task to import metadata from the data repository
     *        to the file system after the data repository association is created. Default is <code>false</code>.
     */

    public void setBatchImportMetaDataOnCreate(Boolean batchImportMetaDataOnCreate) {
        this.batchImportMetaDataOnCreate = batchImportMetaDataOnCreate;
    }

    /**
     * <p>
     * Set to <code>true</code> to run an import data repository task to import metadata from the data repository to the
     * file system after the data repository association is created. Default is <code>false</code>.
     * </p>
     * 
     * @return Set to <code>true</code> to run an import data repository task to import metadata from the data
     *         repository to the file system after the data repository association is created. Default is
     *         <code>false</code>.
     */

    public Boolean getBatchImportMetaDataOnCreate() {
        return this.batchImportMetaDataOnCreate;
    }

    /**
     * <p>
     * Set to <code>true</code> to run an import data repository task to import metadata from the data repository to the
     * file system after the data repository association is created. Default is <code>false</code>.
     * </p>
     * 
     * @param batchImportMetaDataOnCreate
     *        Set to <code>true</code> to run an import data repository task to import metadata from the data repository
     *        to the file system after the data repository association is created. Default is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataRepositoryAssociationRequest withBatchImportMetaDataOnCreate(Boolean batchImportMetaDataOnCreate) {
        setBatchImportMetaDataOnCreate(batchImportMetaDataOnCreate);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to run an import data repository task to import metadata from the data repository to the
     * file system after the data repository association is created. Default is <code>false</code>.
     * </p>
     * 
     * @return Set to <code>true</code> to run an import data repository task to import metadata from the data
     *         repository to the file system after the data repository association is created. Default is
     *         <code>false</code>.
     */

    public Boolean isBatchImportMetaDataOnCreate() {
        return this.batchImportMetaDataOnCreate;
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

    public CreateDataRepositoryAssociationRequest withImportedFileChunkSize(Integer importedFileChunkSize) {
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

    public CreateDataRepositoryAssociationRequest withS3(S3DataRepositoryConfiguration s3) {
        setS3(s3);
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

    public CreateDataRepositoryAssociationRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataRepositoryAssociationRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataRepositoryAssociationRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
        if (getFileSystemPath() != null)
            sb.append("FileSystemPath: ").append(getFileSystemPath()).append(",");
        if (getDataRepositoryPath() != null)
            sb.append("DataRepositoryPath: ").append(getDataRepositoryPath()).append(",");
        if (getBatchImportMetaDataOnCreate() != null)
            sb.append("BatchImportMetaDataOnCreate: ").append(getBatchImportMetaDataOnCreate()).append(",");
        if (getImportedFileChunkSize() != null)
            sb.append("ImportedFileChunkSize: ").append(getImportedFileChunkSize()).append(",");
        if (getS3() != null)
            sb.append("S3: ").append(getS3()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDataRepositoryAssociationRequest == false)
            return false;
        CreateDataRepositoryAssociationRequest other = (CreateDataRepositoryAssociationRequest) obj;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getFileSystemPath() == null ^ this.getFileSystemPath() == null)
            return false;
        if (other.getFileSystemPath() != null && other.getFileSystemPath().equals(this.getFileSystemPath()) == false)
            return false;
        if (other.getDataRepositoryPath() == null ^ this.getDataRepositoryPath() == null)
            return false;
        if (other.getDataRepositoryPath() != null && other.getDataRepositoryPath().equals(this.getDataRepositoryPath()) == false)
            return false;
        if (other.getBatchImportMetaDataOnCreate() == null ^ this.getBatchImportMetaDataOnCreate() == null)
            return false;
        if (other.getBatchImportMetaDataOnCreate() != null && other.getBatchImportMetaDataOnCreate().equals(this.getBatchImportMetaDataOnCreate()) == false)
            return false;
        if (other.getImportedFileChunkSize() == null ^ this.getImportedFileChunkSize() == null)
            return false;
        if (other.getImportedFileChunkSize() != null && other.getImportedFileChunkSize().equals(this.getImportedFileChunkSize()) == false)
            return false;
        if (other.getS3() == null ^ this.getS3() == null)
            return false;
        if (other.getS3() != null && other.getS3().equals(this.getS3()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getFileSystemPath() == null) ? 0 : getFileSystemPath().hashCode());
        hashCode = prime * hashCode + ((getDataRepositoryPath() == null) ? 0 : getDataRepositoryPath().hashCode());
        hashCode = prime * hashCode + ((getBatchImportMetaDataOnCreate() == null) ? 0 : getBatchImportMetaDataOnCreate().hashCode());
        hashCode = prime * hashCode + ((getImportedFileChunkSize() == null) ? 0 : getImportedFileChunkSize().hashCode());
        hashCode = prime * hashCode + ((getS3() == null) ? 0 : getS3().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDataRepositoryAssociationRequest clone() {
        return (CreateDataRepositoryAssociationRequest) super.clone();
    }

}
