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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of a data repository association that links an Amazon FSx for Lustre file system to an Amazon S3
 * bucket or an Amazon File Cache resource to an Amazon S3 bucket or an NFS file system. The data repository association
 * configuration object is returned in the response of the following operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>CreateDataRepositoryAssociation</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateDataRepositoryAssociation</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeDataRepositoryAssociations</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * Data repository associations are supported only for an Amazon FSx for Lustre file system with the
 * <code>Persistent_2</code> deployment type and for an Amazon File Cache resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DataRepositoryAssociation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataRepositoryAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The system-generated, unique ID of the data repository association.
     * </p>
     */
    private String associationId;

    private String resourceARN;

    private String fileSystemId;
    /**
     * <p>
     * Describes the state of a data repository association. The lifecycle can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The data repository association between the file system or cache and the data repository
     * is being created. The data repository is unavailable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The data repository association is available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> - The data repository association is misconfigured. Until the configuration is
     * corrected, automatic import and automatic export will not work (only for Amazon FSx for Lustre).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The data repository association is undergoing a customer initiated update that might
     * affect its availability.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The data repository association is undergoing a customer initiated deletion.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The data repository association is in a terminal state that cannot be recovered.
     * </p>
     * </li>
     * </ul>
     */
    private String lifecycle;

    private DataRepositoryFailureDetails failureDetails;
    /**
     * <p>
     * A path on the Amazon FSx for Lustre file system that points to a high-level directory (such as <code>/ns1/</code>
     * ) or subdirectory (such as <code>/ns1/subdir/</code>) that will be mapped 1-1 with
     * <code>DataRepositoryPath</code>. The leading forward slash in the name is required. Two data repository
     * associations cannot have overlapping file system paths. For example, if a data repository is associated with file
     * system path <code>/ns1/</code>, then you cannot link another data repository with file system path
     * <code>/ns1/ns2</code>.
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
     * The path to the data repository that will be linked to the cache or file system.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Amazon File Cache, the path can be an NFS data repository that will be linked to the cache. The path can be
     * in one of two formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are not using the <code>DataRepositorySubdirectories</code> parameter, the path is to an NFS Export
     * directory (or one of its subdirectories) in the format <code>nsf://nfs-domain-name/exportpath</code>. You can
     * therefore link a single NFS Export to a single data repository association.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are using the <code>DataRepositorySubdirectories</code> parameter, the path is the domain name of the NFS
     * file system in the format <code>nfs://filer-domain-name</code>, which indicates the root of the subdirectories
     * specified with the <code>DataRepositorySubdirectories</code> parameter.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Amazon File Cache, the path can be an S3 bucket or prefix in the format <code>s3://myBucket/myPrefix/</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon FSx for Lustre, the path can be an S3 bucket or prefix in the format
     * <code>s3://myBucket/myPrefix/</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String dataRepositoryPath;
    /**
     * <p>
     * A boolean flag indicating whether an import data repository task to import metadata should run after the data
     * repository association is created. The task runs if this flag is set to <code>true</code>.
     * </p>
     * <note>
     * <p>
     * <code>BatchImportMetaDataOnCreate</code> is not supported for data repositories linked to an Amazon File Cache
     * resource.
     * </p>
     * </note>
     */
    private Boolean batchImportMetaDataOnCreate;
    /**
     * <p>
     * For files imported from a data repository, this value determines the stripe count and maximum amount of data per
     * file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be striped
     * across is limited by the total number of disks that make up the file system or cache.
     * </p>
     * <p>
     * The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects have a
     * maximum size of 5 TB.
     * </p>
     */
    private Integer importedFileChunkSize;
    /**
     * <p>
     * The configuration for an Amazon S3 data repository linked to an Amazon FSx for Lustre file system with a data
     * repository association.
     * </p>
     */
    private S3DataRepositoryConfiguration s3;

    private java.util.List<Tag> tags;

    private java.util.Date creationTime;
    /**
     * <p>
     * The globally unique ID of the Amazon File Cache resource.
     * </p>
     */
    private String fileCacheId;
    /**
     * <p>
     * A path on the Amazon File Cache that points to a high-level directory (such as <code>/ns1/</code>) or
     * subdirectory (such as <code>/ns1/subdir/</code>) that will be mapped 1-1 with <code>DataRepositoryPath</code>.
     * The leading forward slash in the path is required. Two data repository associations cannot have overlapping cache
     * paths. For example, if a data repository is associated with cache path <code>/ns1/</code>, then you cannot link
     * another data repository with cache path <code>/ns1/ns2</code>.
     * </p>
     * <p>
     * This path specifies the directory in your cache where files will be exported from. This cache directory can be
     * linked to only one data repository (S3 or NFS) and no other data repository can be linked to the directory.
     * </p>
     * <note>
     * <p>
     * The cache path can only be set to root (/) on an NFS DRA when <code>DataRepositorySubdirectories</code> is
     * specified. If you specify root (/) as the cache path, you can create only one DRA on the cache.
     * </p>
     * <p>
     * The cache path cannot be set to root (/) for an S3 DRA.
     * </p>
     * </note>
     */
    private String fileCachePath;
    /**
     * <p>
     * For Amazon File Cache, a list of NFS Exports that will be linked with an NFS data repository association. All the
     * subdirectories must be on a single NFS file system. The Export paths are in the format <code>/exportpath1</code>.
     * To use this parameter, you must configure <code>DataRepositoryPath</code> as the domain name of the NFS file
     * system. The NFS file system domain name in effect is the root of the subdirectories. Note that
     * <code>DataRepositorySubdirectories</code> is not supported for S3 data repositories.
     * </p>
     */
    private java.util.List<String> dataRepositorySubdirectories;
    /**
     * <p>
     * The configuration for an NFS data repository linked to an Amazon File Cache resource with a data repository
     * association.
     * </p>
     */
    private NFSDataRepositoryConfiguration nFS;

    /**
     * <p>
     * The system-generated, unique ID of the data repository association.
     * </p>
     * 
     * @param associationId
     *        The system-generated, unique ID of the data repository association.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The system-generated, unique ID of the data repository association.
     * </p>
     * 
     * @return The system-generated, unique ID of the data repository association.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The system-generated, unique ID of the data repository association.
     * </p>
     * 
     * @param associationId
     *        The system-generated, unique ID of the data repository association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryAssociation withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * @param resourceARN
     */

    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * @return
     */

    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * @param resourceARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryAssociation withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
        return this;
    }

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

    public DataRepositoryAssociation withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * Describes the state of a data repository association. The lifecycle can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The data repository association between the file system or cache and the data repository
     * is being created. The data repository is unavailable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The data repository association is available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> - The data repository association is misconfigured. Until the configuration is
     * corrected, automatic import and automatic export will not work (only for Amazon FSx for Lustre).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The data repository association is undergoing a customer initiated update that might
     * affect its availability.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The data repository association is undergoing a customer initiated deletion.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The data repository association is in a terminal state that cannot be recovered.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lifecycle
     *        Describes the state of a data repository association. The lifecycle can have the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The data repository association between the file system or cache and the data
     *        repository is being created. The data repository is unavailable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The data repository association is available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MISCONFIGURED</code> - The data repository association is misconfigured. Until the configuration is
     *        corrected, automatic import and automatic export will not work (only for Amazon FSx for Lustre).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The data repository association is undergoing a customer initiated update that
     *        might affect its availability.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The data repository association is undergoing a customer initiated deletion.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The data repository association is in a terminal state that cannot be recovered.
     *        </p>
     *        </li>
     * @see DataRepositoryLifecycle
     */

    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * Describes the state of a data repository association. The lifecycle can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The data repository association between the file system or cache and the data repository
     * is being created. The data repository is unavailable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The data repository association is available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> - The data repository association is misconfigured. Until the configuration is
     * corrected, automatic import and automatic export will not work (only for Amazon FSx for Lustre).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The data repository association is undergoing a customer initiated update that might
     * affect its availability.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The data repository association is undergoing a customer initiated deletion.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The data repository association is in a terminal state that cannot be recovered.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Describes the state of a data repository association. The lifecycle can have the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - The data repository association between the file system or cache and the data
     *         repository is being created. The data repository is unavailable.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AVAILABLE</code> - The data repository association is available for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MISCONFIGURED</code> - The data repository association is misconfigured. Until the configuration is
     *         corrected, automatic import and automatic export will not work (only for Amazon FSx for Lustre).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code> - The data repository association is undergoing a customer initiated update that
     *         might affect its availability.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - The data repository association is undergoing a customer initiated deletion.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - The data repository association is in a terminal state that cannot be recovered.
     *         </p>
     *         </li>
     * @see DataRepositoryLifecycle
     */

    public String getLifecycle() {
        return this.lifecycle;
    }

    /**
     * <p>
     * Describes the state of a data repository association. The lifecycle can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The data repository association between the file system or cache and the data repository
     * is being created. The data repository is unavailable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The data repository association is available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> - The data repository association is misconfigured. Until the configuration is
     * corrected, automatic import and automatic export will not work (only for Amazon FSx for Lustre).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The data repository association is undergoing a customer initiated update that might
     * affect its availability.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The data repository association is undergoing a customer initiated deletion.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The data repository association is in a terminal state that cannot be recovered.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lifecycle
     *        Describes the state of a data repository association. The lifecycle can have the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The data repository association between the file system or cache and the data
     *        repository is being created. The data repository is unavailable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The data repository association is available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MISCONFIGURED</code> - The data repository association is misconfigured. Until the configuration is
     *        corrected, automatic import and automatic export will not work (only for Amazon FSx for Lustre).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The data repository association is undergoing a customer initiated update that
     *        might affect its availability.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The data repository association is undergoing a customer initiated deletion.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The data repository association is in a terminal state that cannot be recovered.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataRepositoryLifecycle
     */

    public DataRepositoryAssociation withLifecycle(String lifecycle) {
        setLifecycle(lifecycle);
        return this;
    }

    /**
     * <p>
     * Describes the state of a data repository association. The lifecycle can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The data repository association between the file system or cache and the data repository
     * is being created. The data repository is unavailable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The data repository association is available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> - The data repository association is misconfigured. Until the configuration is
     * corrected, automatic import and automatic export will not work (only for Amazon FSx for Lustre).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The data repository association is undergoing a customer initiated update that might
     * affect its availability.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The data repository association is undergoing a customer initiated deletion.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The data repository association is in a terminal state that cannot be recovered.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lifecycle
     *        Describes the state of a data repository association. The lifecycle can have the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The data repository association between the file system or cache and the data
     *        repository is being created. The data repository is unavailable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The data repository association is available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MISCONFIGURED</code> - The data repository association is misconfigured. Until the configuration is
     *        corrected, automatic import and automatic export will not work (only for Amazon FSx for Lustre).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The data repository association is undergoing a customer initiated update that
     *        might affect its availability.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The data repository association is undergoing a customer initiated deletion.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The data repository association is in a terminal state that cannot be recovered.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataRepositoryLifecycle
     */

    public DataRepositoryAssociation withLifecycle(DataRepositoryLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
        return this;
    }

    /**
     * @param failureDetails
     */

    public void setFailureDetails(DataRepositoryFailureDetails failureDetails) {
        this.failureDetails = failureDetails;
    }

    /**
     * @return
     */

    public DataRepositoryFailureDetails getFailureDetails() {
        return this.failureDetails;
    }

    /**
     * @param failureDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryAssociation withFailureDetails(DataRepositoryFailureDetails failureDetails) {
        setFailureDetails(failureDetails);
        return this;
    }

    /**
     * <p>
     * A path on the Amazon FSx for Lustre file system that points to a high-level directory (such as <code>/ns1/</code>
     * ) or subdirectory (such as <code>/ns1/subdir/</code>) that will be mapped 1-1 with
     * <code>DataRepositoryPath</code>. The leading forward slash in the name is required. Two data repository
     * associations cannot have overlapping file system paths. For example, if a data repository is associated with file
     * system path <code>/ns1/</code>, then you cannot link another data repository with file system path
     * <code>/ns1/ns2</code>.
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
     *        A path on the Amazon FSx for Lustre file system that points to a high-level directory (such as
     *        <code>/ns1/</code>) or subdirectory (such as <code>/ns1/subdir/</code>) that will be mapped 1-1 with
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
     * A path on the Amazon FSx for Lustre file system that points to a high-level directory (such as <code>/ns1/</code>
     * ) or subdirectory (such as <code>/ns1/subdir/</code>) that will be mapped 1-1 with
     * <code>DataRepositoryPath</code>. The leading forward slash in the name is required. Two data repository
     * associations cannot have overlapping file system paths. For example, if a data repository is associated with file
     * system path <code>/ns1/</code>, then you cannot link another data repository with file system path
     * <code>/ns1/ns2</code>.
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
     * @return A path on the Amazon FSx for Lustre file system that points to a high-level directory (such as
     *         <code>/ns1/</code>) or subdirectory (such as <code>/ns1/subdir/</code>) that will be mapped 1-1 with
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
     * A path on the Amazon FSx for Lustre file system that points to a high-level directory (such as <code>/ns1/</code>
     * ) or subdirectory (such as <code>/ns1/subdir/</code>) that will be mapped 1-1 with
     * <code>DataRepositoryPath</code>. The leading forward slash in the name is required. Two data repository
     * associations cannot have overlapping file system paths. For example, if a data repository is associated with file
     * system path <code>/ns1/</code>, then you cannot link another data repository with file system path
     * <code>/ns1/ns2</code>.
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
     *        A path on the Amazon FSx for Lustre file system that points to a high-level directory (such as
     *        <code>/ns1/</code>) or subdirectory (such as <code>/ns1/subdir/</code>) that will be mapped 1-1 with
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

    public DataRepositoryAssociation withFileSystemPath(String fileSystemPath) {
        setFileSystemPath(fileSystemPath);
        return this;
    }

    /**
     * <p>
     * The path to the data repository that will be linked to the cache or file system.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Amazon File Cache, the path can be an NFS data repository that will be linked to the cache. The path can be
     * in one of two formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are not using the <code>DataRepositorySubdirectories</code> parameter, the path is to an NFS Export
     * directory (or one of its subdirectories) in the format <code>nsf://nfs-domain-name/exportpath</code>. You can
     * therefore link a single NFS Export to a single data repository association.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are using the <code>DataRepositorySubdirectories</code> parameter, the path is the domain name of the NFS
     * file system in the format <code>nfs://filer-domain-name</code>, which indicates the root of the subdirectories
     * specified with the <code>DataRepositorySubdirectories</code> parameter.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Amazon File Cache, the path can be an S3 bucket or prefix in the format <code>s3://myBucket/myPrefix/</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon FSx for Lustre, the path can be an S3 bucket or prefix in the format
     * <code>s3://myBucket/myPrefix/</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataRepositoryPath
     *        The path to the data repository that will be linked to the cache or file system.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For Amazon File Cache, the path can be an NFS data repository that will be linked to the cache. The path
     *        can be in one of two formats:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you are not using the <code>DataRepositorySubdirectories</code> parameter, the path is to an NFS Export
     *        directory (or one of its subdirectories) in the format <code>nsf://nfs-domain-name/exportpath</code>. You
     *        can therefore link a single NFS Export to a single data repository association.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you are using the <code>DataRepositorySubdirectories</code> parameter, the path is the domain name of
     *        the NFS file system in the format <code>nfs://filer-domain-name</code>, which indicates the root of the
     *        subdirectories specified with the <code>DataRepositorySubdirectories</code> parameter.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For Amazon File Cache, the path can be an S3 bucket or prefix in the format
     *        <code>s3://myBucket/myPrefix/</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For Amazon FSx for Lustre, the path can be an S3 bucket or prefix in the format
     *        <code>s3://myBucket/myPrefix/</code>.
     *        </p>
     *        </li>
     */

    public void setDataRepositoryPath(String dataRepositoryPath) {
        this.dataRepositoryPath = dataRepositoryPath;
    }

    /**
     * <p>
     * The path to the data repository that will be linked to the cache or file system.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Amazon File Cache, the path can be an NFS data repository that will be linked to the cache. The path can be
     * in one of two formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are not using the <code>DataRepositorySubdirectories</code> parameter, the path is to an NFS Export
     * directory (or one of its subdirectories) in the format <code>nsf://nfs-domain-name/exportpath</code>. You can
     * therefore link a single NFS Export to a single data repository association.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are using the <code>DataRepositorySubdirectories</code> parameter, the path is the domain name of the NFS
     * file system in the format <code>nfs://filer-domain-name</code>, which indicates the root of the subdirectories
     * specified with the <code>DataRepositorySubdirectories</code> parameter.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Amazon File Cache, the path can be an S3 bucket or prefix in the format <code>s3://myBucket/myPrefix/</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon FSx for Lustre, the path can be an S3 bucket or prefix in the format
     * <code>s3://myBucket/myPrefix/</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The path to the data repository that will be linked to the cache or file system.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For Amazon File Cache, the path can be an NFS data repository that will be linked to the cache. The path
     *         can be in one of two formats:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you are not using the <code>DataRepositorySubdirectories</code> parameter, the path is to an NFS
     *         Export directory (or one of its subdirectories) in the format
     *         <code>nsf://nfs-domain-name/exportpath</code>. You can therefore link a single NFS Export to a single
     *         data repository association.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you are using the <code>DataRepositorySubdirectories</code> parameter, the path is the domain name of
     *         the NFS file system in the format <code>nfs://filer-domain-name</code>, which indicates the root of the
     *         subdirectories specified with the <code>DataRepositorySubdirectories</code> parameter.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         For Amazon File Cache, the path can be an S3 bucket or prefix in the format
     *         <code>s3://myBucket/myPrefix/</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For Amazon FSx for Lustre, the path can be an S3 bucket or prefix in the format
     *         <code>s3://myBucket/myPrefix/</code>.
     *         </p>
     *         </li>
     */

    public String getDataRepositoryPath() {
        return this.dataRepositoryPath;
    }

    /**
     * <p>
     * The path to the data repository that will be linked to the cache or file system.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Amazon File Cache, the path can be an NFS data repository that will be linked to the cache. The path can be
     * in one of two formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are not using the <code>DataRepositorySubdirectories</code> parameter, the path is to an NFS Export
     * directory (or one of its subdirectories) in the format <code>nsf://nfs-domain-name/exportpath</code>. You can
     * therefore link a single NFS Export to a single data repository association.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are using the <code>DataRepositorySubdirectories</code> parameter, the path is the domain name of the NFS
     * file system in the format <code>nfs://filer-domain-name</code>, which indicates the root of the subdirectories
     * specified with the <code>DataRepositorySubdirectories</code> parameter.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Amazon File Cache, the path can be an S3 bucket or prefix in the format <code>s3://myBucket/myPrefix/</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon FSx for Lustre, the path can be an S3 bucket or prefix in the format
     * <code>s3://myBucket/myPrefix/</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataRepositoryPath
     *        The path to the data repository that will be linked to the cache or file system.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For Amazon File Cache, the path can be an NFS data repository that will be linked to the cache. The path
     *        can be in one of two formats:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you are not using the <code>DataRepositorySubdirectories</code> parameter, the path is to an NFS Export
     *        directory (or one of its subdirectories) in the format <code>nsf://nfs-domain-name/exportpath</code>. You
     *        can therefore link a single NFS Export to a single data repository association.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you are using the <code>DataRepositorySubdirectories</code> parameter, the path is the domain name of
     *        the NFS file system in the format <code>nfs://filer-domain-name</code>, which indicates the root of the
     *        subdirectories specified with the <code>DataRepositorySubdirectories</code> parameter.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For Amazon File Cache, the path can be an S3 bucket or prefix in the format
     *        <code>s3://myBucket/myPrefix/</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For Amazon FSx for Lustre, the path can be an S3 bucket or prefix in the format
     *        <code>s3://myBucket/myPrefix/</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryAssociation withDataRepositoryPath(String dataRepositoryPath) {
        setDataRepositoryPath(dataRepositoryPath);
        return this;
    }

    /**
     * <p>
     * A boolean flag indicating whether an import data repository task to import metadata should run after the data
     * repository association is created. The task runs if this flag is set to <code>true</code>.
     * </p>
     * <note>
     * <p>
     * <code>BatchImportMetaDataOnCreate</code> is not supported for data repositories linked to an Amazon File Cache
     * resource.
     * </p>
     * </note>
     * 
     * @param batchImportMetaDataOnCreate
     *        A boolean flag indicating whether an import data repository task to import metadata should run after the
     *        data repository association is created. The task runs if this flag is set to <code>true</code>.</p> <note>
     *        <p>
     *        <code>BatchImportMetaDataOnCreate</code> is not supported for data repositories linked to an Amazon File
     *        Cache resource.
     *        </p>
     */

    public void setBatchImportMetaDataOnCreate(Boolean batchImportMetaDataOnCreate) {
        this.batchImportMetaDataOnCreate = batchImportMetaDataOnCreate;
    }

    /**
     * <p>
     * A boolean flag indicating whether an import data repository task to import metadata should run after the data
     * repository association is created. The task runs if this flag is set to <code>true</code>.
     * </p>
     * <note>
     * <p>
     * <code>BatchImportMetaDataOnCreate</code> is not supported for data repositories linked to an Amazon File Cache
     * resource.
     * </p>
     * </note>
     * 
     * @return A boolean flag indicating whether an import data repository task to import metadata should run after the
     *         data repository association is created. The task runs if this flag is set to <code>true</code>.</p>
     *         <note>
     *         <p>
     *         <code>BatchImportMetaDataOnCreate</code> is not supported for data repositories linked to an Amazon File
     *         Cache resource.
     *         </p>
     */

    public Boolean getBatchImportMetaDataOnCreate() {
        return this.batchImportMetaDataOnCreate;
    }

    /**
     * <p>
     * A boolean flag indicating whether an import data repository task to import metadata should run after the data
     * repository association is created. The task runs if this flag is set to <code>true</code>.
     * </p>
     * <note>
     * <p>
     * <code>BatchImportMetaDataOnCreate</code> is not supported for data repositories linked to an Amazon File Cache
     * resource.
     * </p>
     * </note>
     * 
     * @param batchImportMetaDataOnCreate
     *        A boolean flag indicating whether an import data repository task to import metadata should run after the
     *        data repository association is created. The task runs if this flag is set to <code>true</code>.</p> <note>
     *        <p>
     *        <code>BatchImportMetaDataOnCreate</code> is not supported for data repositories linked to an Amazon File
     *        Cache resource.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryAssociation withBatchImportMetaDataOnCreate(Boolean batchImportMetaDataOnCreate) {
        setBatchImportMetaDataOnCreate(batchImportMetaDataOnCreate);
        return this;
    }

    /**
     * <p>
     * A boolean flag indicating whether an import data repository task to import metadata should run after the data
     * repository association is created. The task runs if this flag is set to <code>true</code>.
     * </p>
     * <note>
     * <p>
     * <code>BatchImportMetaDataOnCreate</code> is not supported for data repositories linked to an Amazon File Cache
     * resource.
     * </p>
     * </note>
     * 
     * @return A boolean flag indicating whether an import data repository task to import metadata should run after the
     *         data repository association is created. The task runs if this flag is set to <code>true</code>.</p>
     *         <note>
     *         <p>
     *         <code>BatchImportMetaDataOnCreate</code> is not supported for data repositories linked to an Amazon File
     *         Cache resource.
     *         </p>
     */

    public Boolean isBatchImportMetaDataOnCreate() {
        return this.batchImportMetaDataOnCreate;
    }

    /**
     * <p>
     * For files imported from a data repository, this value determines the stripe count and maximum amount of data per
     * file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be striped
     * across is limited by the total number of disks that make up the file system or cache.
     * </p>
     * <p>
     * The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects have a
     * maximum size of 5 TB.
     * </p>
     * 
     * @param importedFileChunkSize
     *        For files imported from a data repository, this value determines the stripe count and maximum amount of
     *        data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file
     *        can be striped across is limited by the total number of disks that make up the file system or cache.</p>
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
     * across is limited by the total number of disks that make up the file system or cache.
     * </p>
     * <p>
     * The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects have a
     * maximum size of 5 TB.
     * </p>
     * 
     * @return For files imported from a data repository, this value determines the stripe count and maximum amount of
     *         data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file
     *         can be striped across is limited by the total number of disks that make up the file system or cache.</p>
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
     * across is limited by the total number of disks that make up the file system or cache.
     * </p>
     * <p>
     * The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects have a
     * maximum size of 5 TB.
     * </p>
     * 
     * @param importedFileChunkSize
     *        For files imported from a data repository, this value determines the stripe count and maximum amount of
     *        data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file
     *        can be striped across is limited by the total number of disks that make up the file system or cache.</p>
     *        <p>
     *        The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects
     *        have a maximum size of 5 TB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryAssociation withImportedFileChunkSize(Integer importedFileChunkSize) {
        setImportedFileChunkSize(importedFileChunkSize);
        return this;
    }

    /**
     * <p>
     * The configuration for an Amazon S3 data repository linked to an Amazon FSx for Lustre file system with a data
     * repository association.
     * </p>
     * 
     * @param s3
     *        The configuration for an Amazon S3 data repository linked to an Amazon FSx for Lustre file system with a
     *        data repository association.
     */

    public void setS3(S3DataRepositoryConfiguration s3) {
        this.s3 = s3;
    }

    /**
     * <p>
     * The configuration for an Amazon S3 data repository linked to an Amazon FSx for Lustre file system with a data
     * repository association.
     * </p>
     * 
     * @return The configuration for an Amazon S3 data repository linked to an Amazon FSx for Lustre file system with a
     *         data repository association.
     */

    public S3DataRepositoryConfiguration getS3() {
        return this.s3;
    }

    /**
     * <p>
     * The configuration for an Amazon S3 data repository linked to an Amazon FSx for Lustre file system with a data
     * repository association.
     * </p>
     * 
     * @param s3
     *        The configuration for an Amazon S3 data repository linked to an Amazon FSx for Lustre file system with a
     *        data repository association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryAssociation withS3(S3DataRepositoryConfiguration s3) {
        setS3(s3);
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

    public DataRepositoryAssociation withTags(Tag... tags) {
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

    public DataRepositoryAssociation withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * @param creationTime
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * @return
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * @param creationTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryAssociation withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The globally unique ID of the Amazon File Cache resource.
     * </p>
     * 
     * @param fileCacheId
     *        The globally unique ID of the Amazon File Cache resource.
     */

    public void setFileCacheId(String fileCacheId) {
        this.fileCacheId = fileCacheId;
    }

    /**
     * <p>
     * The globally unique ID of the Amazon File Cache resource.
     * </p>
     * 
     * @return The globally unique ID of the Amazon File Cache resource.
     */

    public String getFileCacheId() {
        return this.fileCacheId;
    }

    /**
     * <p>
     * The globally unique ID of the Amazon File Cache resource.
     * </p>
     * 
     * @param fileCacheId
     *        The globally unique ID of the Amazon File Cache resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryAssociation withFileCacheId(String fileCacheId) {
        setFileCacheId(fileCacheId);
        return this;
    }

    /**
     * <p>
     * A path on the Amazon File Cache that points to a high-level directory (such as <code>/ns1/</code>) or
     * subdirectory (such as <code>/ns1/subdir/</code>) that will be mapped 1-1 with <code>DataRepositoryPath</code>.
     * The leading forward slash in the path is required. Two data repository associations cannot have overlapping cache
     * paths. For example, if a data repository is associated with cache path <code>/ns1/</code>, then you cannot link
     * another data repository with cache path <code>/ns1/ns2</code>.
     * </p>
     * <p>
     * This path specifies the directory in your cache where files will be exported from. This cache directory can be
     * linked to only one data repository (S3 or NFS) and no other data repository can be linked to the directory.
     * </p>
     * <note>
     * <p>
     * The cache path can only be set to root (/) on an NFS DRA when <code>DataRepositorySubdirectories</code> is
     * specified. If you specify root (/) as the cache path, you can create only one DRA on the cache.
     * </p>
     * <p>
     * The cache path cannot be set to root (/) for an S3 DRA.
     * </p>
     * </note>
     * 
     * @param fileCachePath
     *        A path on the Amazon File Cache that points to a high-level directory (such as <code>/ns1/</code>) or
     *        subdirectory (such as <code>/ns1/subdir/</code>) that will be mapped 1-1 with
     *        <code>DataRepositoryPath</code>. The leading forward slash in the path is required. Two data repository
     *        associations cannot have overlapping cache paths. For example, if a data repository is associated with
     *        cache path <code>/ns1/</code>, then you cannot link another data repository with cache path
     *        <code>/ns1/ns2</code>.</p>
     *        <p>
     *        This path specifies the directory in your cache where files will be exported from. This cache directory
     *        can be linked to only one data repository (S3 or NFS) and no other data repository can be linked to the
     *        directory.
     *        </p>
     *        <note>
     *        <p>
     *        The cache path can only be set to root (/) on an NFS DRA when <code>DataRepositorySubdirectories</code> is
     *        specified. If you specify root (/) as the cache path, you can create only one DRA on the cache.
     *        </p>
     *        <p>
     *        The cache path cannot be set to root (/) for an S3 DRA.
     *        </p>
     */

    public void setFileCachePath(String fileCachePath) {
        this.fileCachePath = fileCachePath;
    }

    /**
     * <p>
     * A path on the Amazon File Cache that points to a high-level directory (such as <code>/ns1/</code>) or
     * subdirectory (such as <code>/ns1/subdir/</code>) that will be mapped 1-1 with <code>DataRepositoryPath</code>.
     * The leading forward slash in the path is required. Two data repository associations cannot have overlapping cache
     * paths. For example, if a data repository is associated with cache path <code>/ns1/</code>, then you cannot link
     * another data repository with cache path <code>/ns1/ns2</code>.
     * </p>
     * <p>
     * This path specifies the directory in your cache where files will be exported from. This cache directory can be
     * linked to only one data repository (S3 or NFS) and no other data repository can be linked to the directory.
     * </p>
     * <note>
     * <p>
     * The cache path can only be set to root (/) on an NFS DRA when <code>DataRepositorySubdirectories</code> is
     * specified. If you specify root (/) as the cache path, you can create only one DRA on the cache.
     * </p>
     * <p>
     * The cache path cannot be set to root (/) for an S3 DRA.
     * </p>
     * </note>
     * 
     * @return A path on the Amazon File Cache that points to a high-level directory (such as <code>/ns1/</code>) or
     *         subdirectory (such as <code>/ns1/subdir/</code>) that will be mapped 1-1 with
     *         <code>DataRepositoryPath</code>. The leading forward slash in the path is required. Two data repository
     *         associations cannot have overlapping cache paths. For example, if a data repository is associated with
     *         cache path <code>/ns1/</code>, then you cannot link another data repository with cache path
     *         <code>/ns1/ns2</code>.</p>
     *         <p>
     *         This path specifies the directory in your cache where files will be exported from. This cache directory
     *         can be linked to only one data repository (S3 or NFS) and no other data repository can be linked to the
     *         directory.
     *         </p>
     *         <note>
     *         <p>
     *         The cache path can only be set to root (/) on an NFS DRA when <code>DataRepositorySubdirectories</code>
     *         is specified. If you specify root (/) as the cache path, you can create only one DRA on the cache.
     *         </p>
     *         <p>
     *         The cache path cannot be set to root (/) for an S3 DRA.
     *         </p>
     */

    public String getFileCachePath() {
        return this.fileCachePath;
    }

    /**
     * <p>
     * A path on the Amazon File Cache that points to a high-level directory (such as <code>/ns1/</code>) or
     * subdirectory (such as <code>/ns1/subdir/</code>) that will be mapped 1-1 with <code>DataRepositoryPath</code>.
     * The leading forward slash in the path is required. Two data repository associations cannot have overlapping cache
     * paths. For example, if a data repository is associated with cache path <code>/ns1/</code>, then you cannot link
     * another data repository with cache path <code>/ns1/ns2</code>.
     * </p>
     * <p>
     * This path specifies the directory in your cache where files will be exported from. This cache directory can be
     * linked to only one data repository (S3 or NFS) and no other data repository can be linked to the directory.
     * </p>
     * <note>
     * <p>
     * The cache path can only be set to root (/) on an NFS DRA when <code>DataRepositorySubdirectories</code> is
     * specified. If you specify root (/) as the cache path, you can create only one DRA on the cache.
     * </p>
     * <p>
     * The cache path cannot be set to root (/) for an S3 DRA.
     * </p>
     * </note>
     * 
     * @param fileCachePath
     *        A path on the Amazon File Cache that points to a high-level directory (such as <code>/ns1/</code>) or
     *        subdirectory (such as <code>/ns1/subdir/</code>) that will be mapped 1-1 with
     *        <code>DataRepositoryPath</code>. The leading forward slash in the path is required. Two data repository
     *        associations cannot have overlapping cache paths. For example, if a data repository is associated with
     *        cache path <code>/ns1/</code>, then you cannot link another data repository with cache path
     *        <code>/ns1/ns2</code>.</p>
     *        <p>
     *        This path specifies the directory in your cache where files will be exported from. This cache directory
     *        can be linked to only one data repository (S3 or NFS) and no other data repository can be linked to the
     *        directory.
     *        </p>
     *        <note>
     *        <p>
     *        The cache path can only be set to root (/) on an NFS DRA when <code>DataRepositorySubdirectories</code> is
     *        specified. If you specify root (/) as the cache path, you can create only one DRA on the cache.
     *        </p>
     *        <p>
     *        The cache path cannot be set to root (/) for an S3 DRA.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryAssociation withFileCachePath(String fileCachePath) {
        setFileCachePath(fileCachePath);
        return this;
    }

    /**
     * <p>
     * For Amazon File Cache, a list of NFS Exports that will be linked with an NFS data repository association. All the
     * subdirectories must be on a single NFS file system. The Export paths are in the format <code>/exportpath1</code>.
     * To use this parameter, you must configure <code>DataRepositoryPath</code> as the domain name of the NFS file
     * system. The NFS file system domain name in effect is the root of the subdirectories. Note that
     * <code>DataRepositorySubdirectories</code> is not supported for S3 data repositories.
     * </p>
     * 
     * @return For Amazon File Cache, a list of NFS Exports that will be linked with an NFS data repository association.
     *         All the subdirectories must be on a single NFS file system. The Export paths are in the format
     *         <code>/exportpath1</code>. To use this parameter, you must configure <code>DataRepositoryPath</code> as
     *         the domain name of the NFS file system. The NFS file system domain name in effect is the root of the
     *         subdirectories. Note that <code>DataRepositorySubdirectories</code> is not supported for S3 data
     *         repositories.
     */

    public java.util.List<String> getDataRepositorySubdirectories() {
        return dataRepositorySubdirectories;
    }

    /**
     * <p>
     * For Amazon File Cache, a list of NFS Exports that will be linked with an NFS data repository association. All the
     * subdirectories must be on a single NFS file system. The Export paths are in the format <code>/exportpath1</code>.
     * To use this parameter, you must configure <code>DataRepositoryPath</code> as the domain name of the NFS file
     * system. The NFS file system domain name in effect is the root of the subdirectories. Note that
     * <code>DataRepositorySubdirectories</code> is not supported for S3 data repositories.
     * </p>
     * 
     * @param dataRepositorySubdirectories
     *        For Amazon File Cache, a list of NFS Exports that will be linked with an NFS data repository association.
     *        All the subdirectories must be on a single NFS file system. The Export paths are in the format
     *        <code>/exportpath1</code>. To use this parameter, you must configure <code>DataRepositoryPath</code> as
     *        the domain name of the NFS file system. The NFS file system domain name in effect is the root of the
     *        subdirectories. Note that <code>DataRepositorySubdirectories</code> is not supported for S3 data
     *        repositories.
     */

    public void setDataRepositorySubdirectories(java.util.Collection<String> dataRepositorySubdirectories) {
        if (dataRepositorySubdirectories == null) {
            this.dataRepositorySubdirectories = null;
            return;
        }

        this.dataRepositorySubdirectories = new java.util.ArrayList<String>(dataRepositorySubdirectories);
    }

    /**
     * <p>
     * For Amazon File Cache, a list of NFS Exports that will be linked with an NFS data repository association. All the
     * subdirectories must be on a single NFS file system. The Export paths are in the format <code>/exportpath1</code>.
     * To use this parameter, you must configure <code>DataRepositoryPath</code> as the domain name of the NFS file
     * system. The NFS file system domain name in effect is the root of the subdirectories. Note that
     * <code>DataRepositorySubdirectories</code> is not supported for S3 data repositories.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataRepositorySubdirectories(java.util.Collection)} or
     * {@link #withDataRepositorySubdirectories(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dataRepositorySubdirectories
     *        For Amazon File Cache, a list of NFS Exports that will be linked with an NFS data repository association.
     *        All the subdirectories must be on a single NFS file system. The Export paths are in the format
     *        <code>/exportpath1</code>. To use this parameter, you must configure <code>DataRepositoryPath</code> as
     *        the domain name of the NFS file system. The NFS file system domain name in effect is the root of the
     *        subdirectories. Note that <code>DataRepositorySubdirectories</code> is not supported for S3 data
     *        repositories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryAssociation withDataRepositorySubdirectories(String... dataRepositorySubdirectories) {
        if (this.dataRepositorySubdirectories == null) {
            setDataRepositorySubdirectories(new java.util.ArrayList<String>(dataRepositorySubdirectories.length));
        }
        for (String ele : dataRepositorySubdirectories) {
            this.dataRepositorySubdirectories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For Amazon File Cache, a list of NFS Exports that will be linked with an NFS data repository association. All the
     * subdirectories must be on a single NFS file system. The Export paths are in the format <code>/exportpath1</code>.
     * To use this parameter, you must configure <code>DataRepositoryPath</code> as the domain name of the NFS file
     * system. The NFS file system domain name in effect is the root of the subdirectories. Note that
     * <code>DataRepositorySubdirectories</code> is not supported for S3 data repositories.
     * </p>
     * 
     * @param dataRepositorySubdirectories
     *        For Amazon File Cache, a list of NFS Exports that will be linked with an NFS data repository association.
     *        All the subdirectories must be on a single NFS file system. The Export paths are in the format
     *        <code>/exportpath1</code>. To use this parameter, you must configure <code>DataRepositoryPath</code> as
     *        the domain name of the NFS file system. The NFS file system domain name in effect is the root of the
     *        subdirectories. Note that <code>DataRepositorySubdirectories</code> is not supported for S3 data
     *        repositories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryAssociation withDataRepositorySubdirectories(java.util.Collection<String> dataRepositorySubdirectories) {
        setDataRepositorySubdirectories(dataRepositorySubdirectories);
        return this;
    }

    /**
     * <p>
     * The configuration for an NFS data repository linked to an Amazon File Cache resource with a data repository
     * association.
     * </p>
     * 
     * @param nFS
     *        The configuration for an NFS data repository linked to an Amazon File Cache resource with a data
     *        repository association.
     */

    public void setNFS(NFSDataRepositoryConfiguration nFS) {
        this.nFS = nFS;
    }

    /**
     * <p>
     * The configuration for an NFS data repository linked to an Amazon File Cache resource with a data repository
     * association.
     * </p>
     * 
     * @return The configuration for an NFS data repository linked to an Amazon File Cache resource with a data
     *         repository association.
     */

    public NFSDataRepositoryConfiguration getNFS() {
        return this.nFS;
    }

    /**
     * <p>
     * The configuration for an NFS data repository linked to an Amazon File Cache resource with a data repository
     * association.
     * </p>
     * 
     * @param nFS
     *        The configuration for an NFS data repository linked to an Amazon File Cache resource with a data
     *        repository association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryAssociation withNFS(NFSDataRepositoryConfiguration nFS) {
        setNFS(nFS);
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
        if (getResourceARN() != null)
            sb.append("ResourceARN: ").append(getResourceARN()).append(",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: ").append(getLifecycle()).append(",");
        if (getFailureDetails() != null)
            sb.append("FailureDetails: ").append(getFailureDetails()).append(",");
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
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getFileCacheId() != null)
            sb.append("FileCacheId: ").append(getFileCacheId()).append(",");
        if (getFileCachePath() != null)
            sb.append("FileCachePath: ").append(getFileCachePath()).append(",");
        if (getDataRepositorySubdirectories() != null)
            sb.append("DataRepositorySubdirectories: ").append(getDataRepositorySubdirectories()).append(",");
        if (getNFS() != null)
            sb.append("NFS: ").append(getNFS());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataRepositoryAssociation == false)
            return false;
        DataRepositoryAssociation other = (DataRepositoryAssociation) obj;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null && other.getResourceARN().equals(this.getResourceARN()) == false)
            return false;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getFailureDetails() == null ^ this.getFailureDetails() == null)
            return false;
        if (other.getFailureDetails() != null && other.getFailureDetails().equals(this.getFailureDetails()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getFileCacheId() == null ^ this.getFileCacheId() == null)
            return false;
        if (other.getFileCacheId() != null && other.getFileCacheId().equals(this.getFileCacheId()) == false)
            return false;
        if (other.getFileCachePath() == null ^ this.getFileCachePath() == null)
            return false;
        if (other.getFileCachePath() != null && other.getFileCachePath().equals(this.getFileCachePath()) == false)
            return false;
        if (other.getDataRepositorySubdirectories() == null ^ this.getDataRepositorySubdirectories() == null)
            return false;
        if (other.getDataRepositorySubdirectories() != null && other.getDataRepositorySubdirectories().equals(this.getDataRepositorySubdirectories()) == false)
            return false;
        if (other.getNFS() == null ^ this.getNFS() == null)
            return false;
        if (other.getNFS() != null && other.getNFS().equals(this.getNFS()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode + ((getFailureDetails() == null) ? 0 : getFailureDetails().hashCode());
        hashCode = prime * hashCode + ((getFileSystemPath() == null) ? 0 : getFileSystemPath().hashCode());
        hashCode = prime * hashCode + ((getDataRepositoryPath() == null) ? 0 : getDataRepositoryPath().hashCode());
        hashCode = prime * hashCode + ((getBatchImportMetaDataOnCreate() == null) ? 0 : getBatchImportMetaDataOnCreate().hashCode());
        hashCode = prime * hashCode + ((getImportedFileChunkSize() == null) ? 0 : getImportedFileChunkSize().hashCode());
        hashCode = prime * hashCode + ((getS3() == null) ? 0 : getS3().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getFileCacheId() == null) ? 0 : getFileCacheId().hashCode());
        hashCode = prime * hashCode + ((getFileCachePath() == null) ? 0 : getFileCachePath().hashCode());
        hashCode = prime * hashCode + ((getDataRepositorySubdirectories() == null) ? 0 : getDataRepositorySubdirectories().hashCode());
        hashCode = prime * hashCode + ((getNFS() == null) ? 0 : getNFS().hashCode());
        return hashCode;
    }

    @Override
    public DataRepositoryAssociation clone() {
        try {
            return (DataRepositoryAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.DataRepositoryAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
