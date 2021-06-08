/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The data repository configuration object for Lustre file systems returned in the response of the
 * <code>CreateFileSystem</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DataRepositoryConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataRepositoryConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the state of the file system's S3 durable data repository, if it is configured with an S3 repository.
     * The lifecycle can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The data repository configuration between the FSx file system and the linked S3 data
     * repository is being created. The data repository is unavailable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The data repository is available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> - Amazon FSx cannot automatically import updates from the S3 bucket until the data
     * repository configuration is corrected. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/troubleshooting.html#troubleshooting-misconfigured-data-repository"
     * >Troubleshooting a Misconfigured linked S3 bucket</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The data repository is undergoing a customer initiated update and availability may be
     * impacted.
     * </p>
     * </li>
     * </ul>
     */
    private String lifecycle;
    /**
     * <p>
     * The import path to the Amazon S3 bucket (and optional prefix) that you're using as the data repository for your
     * FSx for Lustre file system, for example <code>s3://import-bucket/optional-prefix</code>. If a prefix is specified
     * after the Amazon S3 bucket name, only object keys with that prefix are loaded into the file system.
     * </p>
     */
    private String importPath;
    /**
     * <p>
     * The export path to the Amazon S3 bucket (and prefix) that you are using to store new and changed Lustre file
     * system files in S3.
     * </p>
     */
    private String exportPath;
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
     * Describes the file system's linked S3 data repository's <code>AutoImportPolicy</code>. The AutoImportPolicy
     * configures how Amazon FSx keeps your file and directory listings up to date as you add or modify objects in your
     * linked S3 bucket. <code>AutoImportPolicy</code> can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - (Default) AutoImport is off. Amazon FSx only updates file and directory listings from the
     * linked S3 bucket when the file system is created. FSx does not update file and directory listings for any new or
     * changed objects after choosing this option.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW</code> - AutoImport is on. Amazon FSx automatically imports directory listings of any new objects added
     * to the linked S3 bucket that do not currently exist in the FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_CHANGED</code> - AutoImport is on. Amazon FSx automatically imports file and directory listings of any
     * new objects added to the S3 bucket and any existing objects that are changed in the S3 bucket after you choose
     * this option.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html">Automatically import updates
     * from your S3 bucket</a>.
     * </p>
     */
    private String autoImportPolicy;

    private DataRepositoryFailureDetails failureDetails;

    /**
     * <p>
     * Describes the state of the file system's S3 durable data repository, if it is configured with an S3 repository.
     * The lifecycle can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The data repository configuration between the FSx file system and the linked S3 data
     * repository is being created. The data repository is unavailable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The data repository is available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> - Amazon FSx cannot automatically import updates from the S3 bucket until the data
     * repository configuration is corrected. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/troubleshooting.html#troubleshooting-misconfigured-data-repository"
     * >Troubleshooting a Misconfigured linked S3 bucket</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The data repository is undergoing a customer initiated update and availability may be
     * impacted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lifecycle
     *        Describes the state of the file system's S3 durable data repository, if it is configured with an S3
     *        repository. The lifecycle can have the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The data repository configuration between the FSx file system and the linked S3
     *        data repository is being created. The data repository is unavailable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The data repository is available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MISCONFIGURED</code> - Amazon FSx cannot automatically import updates from the S3 bucket until the
     *        data repository configuration is corrected. For more information, see <a href=
     *        "https://docs.aws.amazon.com/fsx/latest/LustreGuide/troubleshooting.html#troubleshooting-misconfigured-data-repository"
     *        >Troubleshooting a Misconfigured linked S3 bucket</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The data repository is undergoing a customer initiated update and availability may
     *        be impacted.
     *        </p>
     *        </li>
     * @see DataRepositoryLifecycle
     */

    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * Describes the state of the file system's S3 durable data repository, if it is configured with an S3 repository.
     * The lifecycle can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The data repository configuration between the FSx file system and the linked S3 data
     * repository is being created. The data repository is unavailable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The data repository is available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> - Amazon FSx cannot automatically import updates from the S3 bucket until the data
     * repository configuration is corrected. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/troubleshooting.html#troubleshooting-misconfigured-data-repository"
     * >Troubleshooting a Misconfigured linked S3 bucket</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The data repository is undergoing a customer initiated update and availability may be
     * impacted.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Describes the state of the file system's S3 durable data repository, if it is configured with an S3
     *         repository. The lifecycle can have the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - The data repository configuration between the FSx file system and the linked S3
     *         data repository is being created. The data repository is unavailable.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AVAILABLE</code> - The data repository is available for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MISCONFIGURED</code> - Amazon FSx cannot automatically import updates from the S3 bucket until the
     *         data repository configuration is corrected. For more information, see <a href=
     *         "https://docs.aws.amazon.com/fsx/latest/LustreGuide/troubleshooting.html#troubleshooting-misconfigured-data-repository"
     *         >Troubleshooting a Misconfigured linked S3 bucket</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code> - The data repository is undergoing a customer initiated update and availability
     *         may be impacted.
     *         </p>
     *         </li>
     * @see DataRepositoryLifecycle
     */

    public String getLifecycle() {
        return this.lifecycle;
    }

    /**
     * <p>
     * Describes the state of the file system's S3 durable data repository, if it is configured with an S3 repository.
     * The lifecycle can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The data repository configuration between the FSx file system and the linked S3 data
     * repository is being created. The data repository is unavailable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The data repository is available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> - Amazon FSx cannot automatically import updates from the S3 bucket until the data
     * repository configuration is corrected. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/troubleshooting.html#troubleshooting-misconfigured-data-repository"
     * >Troubleshooting a Misconfigured linked S3 bucket</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The data repository is undergoing a customer initiated update and availability may be
     * impacted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lifecycle
     *        Describes the state of the file system's S3 durable data repository, if it is configured with an S3
     *        repository. The lifecycle can have the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The data repository configuration between the FSx file system and the linked S3
     *        data repository is being created. The data repository is unavailable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The data repository is available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MISCONFIGURED</code> - Amazon FSx cannot automatically import updates from the S3 bucket until the
     *        data repository configuration is corrected. For more information, see <a href=
     *        "https://docs.aws.amazon.com/fsx/latest/LustreGuide/troubleshooting.html#troubleshooting-misconfigured-data-repository"
     *        >Troubleshooting a Misconfigured linked S3 bucket</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The data repository is undergoing a customer initiated update and availability may
     *        be impacted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataRepositoryLifecycle
     */

    public DataRepositoryConfiguration withLifecycle(String lifecycle) {
        setLifecycle(lifecycle);
        return this;
    }

    /**
     * <p>
     * Describes the state of the file system's S3 durable data repository, if it is configured with an S3 repository.
     * The lifecycle can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The data repository configuration between the FSx file system and the linked S3 data
     * repository is being created. The data repository is unavailable.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The data repository is available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> - Amazon FSx cannot automatically import updates from the S3 bucket until the data
     * repository configuration is corrected. For more information, see <a href=
     * "https://docs.aws.amazon.com/fsx/latest/LustreGuide/troubleshooting.html#troubleshooting-misconfigured-data-repository"
     * >Troubleshooting a Misconfigured linked S3 bucket</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The data repository is undergoing a customer initiated update and availability may be
     * impacted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lifecycle
     *        Describes the state of the file system's S3 durable data repository, if it is configured with an S3
     *        repository. The lifecycle can have the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The data repository configuration between the FSx file system and the linked S3
     *        data repository is being created. The data repository is unavailable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The data repository is available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MISCONFIGURED</code> - Amazon FSx cannot automatically import updates from the S3 bucket until the
     *        data repository configuration is corrected. For more information, see <a href=
     *        "https://docs.aws.amazon.com/fsx/latest/LustreGuide/troubleshooting.html#troubleshooting-misconfigured-data-repository"
     *        >Troubleshooting a Misconfigured linked S3 bucket</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The data repository is undergoing a customer initiated update and availability may
     *        be impacted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataRepositoryLifecycle
     */

    public DataRepositoryConfiguration withLifecycle(DataRepositoryLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
        return this;
    }

    /**
     * <p>
     * The import path to the Amazon S3 bucket (and optional prefix) that you're using as the data repository for your
     * FSx for Lustre file system, for example <code>s3://import-bucket/optional-prefix</code>. If a prefix is specified
     * after the Amazon S3 bucket name, only object keys with that prefix are loaded into the file system.
     * </p>
     * 
     * @param importPath
     *        The import path to the Amazon S3 bucket (and optional prefix) that you're using as the data repository for
     *        your FSx for Lustre file system, for example <code>s3://import-bucket/optional-prefix</code>. If a prefix
     *        is specified after the Amazon S3 bucket name, only object keys with that prefix are loaded into the file
     *        system.
     */

    public void setImportPath(String importPath) {
        this.importPath = importPath;
    }

    /**
     * <p>
     * The import path to the Amazon S3 bucket (and optional prefix) that you're using as the data repository for your
     * FSx for Lustre file system, for example <code>s3://import-bucket/optional-prefix</code>. If a prefix is specified
     * after the Amazon S3 bucket name, only object keys with that prefix are loaded into the file system.
     * </p>
     * 
     * @return The import path to the Amazon S3 bucket (and optional prefix) that you're using as the data repository
     *         for your FSx for Lustre file system, for example <code>s3://import-bucket/optional-prefix</code>. If a
     *         prefix is specified after the Amazon S3 bucket name, only object keys with that prefix are loaded into
     *         the file system.
     */

    public String getImportPath() {
        return this.importPath;
    }

    /**
     * <p>
     * The import path to the Amazon S3 bucket (and optional prefix) that you're using as the data repository for your
     * FSx for Lustre file system, for example <code>s3://import-bucket/optional-prefix</code>. If a prefix is specified
     * after the Amazon S3 bucket name, only object keys with that prefix are loaded into the file system.
     * </p>
     * 
     * @param importPath
     *        The import path to the Amazon S3 bucket (and optional prefix) that you're using as the data repository for
     *        your FSx for Lustre file system, for example <code>s3://import-bucket/optional-prefix</code>. If a prefix
     *        is specified after the Amazon S3 bucket name, only object keys with that prefix are loaded into the file
     *        system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryConfiguration withImportPath(String importPath) {
        setImportPath(importPath);
        return this;
    }

    /**
     * <p>
     * The export path to the Amazon S3 bucket (and prefix) that you are using to store new and changed Lustre file
     * system files in S3.
     * </p>
     * 
     * @param exportPath
     *        The export path to the Amazon S3 bucket (and prefix) that you are using to store new and changed Lustre
     *        file system files in S3.
     */

    public void setExportPath(String exportPath) {
        this.exportPath = exportPath;
    }

    /**
     * <p>
     * The export path to the Amazon S3 bucket (and prefix) that you are using to store new and changed Lustre file
     * system files in S3.
     * </p>
     * 
     * @return The export path to the Amazon S3 bucket (and prefix) that you are using to store new and changed Lustre
     *         file system files in S3.
     */

    public String getExportPath() {
        return this.exportPath;
    }

    /**
     * <p>
     * The export path to the Amazon S3 bucket (and prefix) that you are using to store new and changed Lustre file
     * system files in S3.
     * </p>
     * 
     * @param exportPath
     *        The export path to the Amazon S3 bucket (and prefix) that you are using to store new and changed Lustre
     *        file system files in S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataRepositoryConfiguration withExportPath(String exportPath) {
        setExportPath(exportPath);
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

    public DataRepositoryConfiguration withImportedFileChunkSize(Integer importedFileChunkSize) {
        setImportedFileChunkSize(importedFileChunkSize);
        return this;
    }

    /**
     * <p>
     * Describes the file system's linked S3 data repository's <code>AutoImportPolicy</code>. The AutoImportPolicy
     * configures how Amazon FSx keeps your file and directory listings up to date as you add or modify objects in your
     * linked S3 bucket. <code>AutoImportPolicy</code> can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - (Default) AutoImport is off. Amazon FSx only updates file and directory listings from the
     * linked S3 bucket when the file system is created. FSx does not update file and directory listings for any new or
     * changed objects after choosing this option.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW</code> - AutoImport is on. Amazon FSx automatically imports directory listings of any new objects added
     * to the linked S3 bucket that do not currently exist in the FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_CHANGED</code> - AutoImport is on. Amazon FSx automatically imports file and directory listings of any
     * new objects added to the S3 bucket and any existing objects that are changed in the S3 bucket after you choose
     * this option.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html">Automatically import updates
     * from your S3 bucket</a>.
     * </p>
     * 
     * @param autoImportPolicy
     *        Describes the file system's linked S3 data repository's <code>AutoImportPolicy</code>. The
     *        AutoImportPolicy configures how Amazon FSx keeps your file and directory listings up to date as you add or
     *        modify objects in your linked S3 bucket. <code>AutoImportPolicy</code> can have the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - (Default) AutoImport is off. Amazon FSx only updates file and directory listings from
     *        the linked S3 bucket when the file system is created. FSx does not update file and directory listings for
     *        any new or changed objects after choosing this option.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW</code> - AutoImport is on. Amazon FSx automatically imports directory listings of any new
     *        objects added to the linked S3 bucket that do not currently exist in the FSx file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_CHANGED</code> - AutoImport is on. Amazon FSx automatically imports file and directory listings
     *        of any new objects added to the S3 bucket and any existing objects that are changed in the S3 bucket after
     *        you choose this option.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html">Automatically import
     *        updates from your S3 bucket</a>.
     * @see AutoImportPolicyType
     */

    public void setAutoImportPolicy(String autoImportPolicy) {
        this.autoImportPolicy = autoImportPolicy;
    }

    /**
     * <p>
     * Describes the file system's linked S3 data repository's <code>AutoImportPolicy</code>. The AutoImportPolicy
     * configures how Amazon FSx keeps your file and directory listings up to date as you add or modify objects in your
     * linked S3 bucket. <code>AutoImportPolicy</code> can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - (Default) AutoImport is off. Amazon FSx only updates file and directory listings from the
     * linked S3 bucket when the file system is created. FSx does not update file and directory listings for any new or
     * changed objects after choosing this option.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW</code> - AutoImport is on. Amazon FSx automatically imports directory listings of any new objects added
     * to the linked S3 bucket that do not currently exist in the FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_CHANGED</code> - AutoImport is on. Amazon FSx automatically imports file and directory listings of any
     * new objects added to the S3 bucket and any existing objects that are changed in the S3 bucket after you choose
     * this option.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html">Automatically import updates
     * from your S3 bucket</a>.
     * </p>
     * 
     * @return Describes the file system's linked S3 data repository's <code>AutoImportPolicy</code>. The
     *         AutoImportPolicy configures how Amazon FSx keeps your file and directory listings up to date as you add
     *         or modify objects in your linked S3 bucket. <code>AutoImportPolicy</code> can have the following
     *         values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code> - (Default) AutoImport is off. Amazon FSx only updates file and directory listings from
     *         the linked S3 bucket when the file system is created. FSx does not update file and directory listings for
     *         any new or changed objects after choosing this option.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NEW</code> - AutoImport is on. Amazon FSx automatically imports directory listings of any new
     *         objects added to the linked S3 bucket that do not currently exist in the FSx file system.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NEW_CHANGED</code> - AutoImport is on. Amazon FSx automatically imports file and directory listings
     *         of any new objects added to the S3 bucket and any existing objects that are changed in the S3 bucket
     *         after you choose this option.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html">Automatically import
     *         updates from your S3 bucket</a>.
     * @see AutoImportPolicyType
     */

    public String getAutoImportPolicy() {
        return this.autoImportPolicy;
    }

    /**
     * <p>
     * Describes the file system's linked S3 data repository's <code>AutoImportPolicy</code>. The AutoImportPolicy
     * configures how Amazon FSx keeps your file and directory listings up to date as you add or modify objects in your
     * linked S3 bucket. <code>AutoImportPolicy</code> can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - (Default) AutoImport is off. Amazon FSx only updates file and directory listings from the
     * linked S3 bucket when the file system is created. FSx does not update file and directory listings for any new or
     * changed objects after choosing this option.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW</code> - AutoImport is on. Amazon FSx automatically imports directory listings of any new objects added
     * to the linked S3 bucket that do not currently exist in the FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_CHANGED</code> - AutoImport is on. Amazon FSx automatically imports file and directory listings of any
     * new objects added to the S3 bucket and any existing objects that are changed in the S3 bucket after you choose
     * this option.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html">Automatically import updates
     * from your S3 bucket</a>.
     * </p>
     * 
     * @param autoImportPolicy
     *        Describes the file system's linked S3 data repository's <code>AutoImportPolicy</code>. The
     *        AutoImportPolicy configures how Amazon FSx keeps your file and directory listings up to date as you add or
     *        modify objects in your linked S3 bucket. <code>AutoImportPolicy</code> can have the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - (Default) AutoImport is off. Amazon FSx only updates file and directory listings from
     *        the linked S3 bucket when the file system is created. FSx does not update file and directory listings for
     *        any new or changed objects after choosing this option.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW</code> - AutoImport is on. Amazon FSx automatically imports directory listings of any new
     *        objects added to the linked S3 bucket that do not currently exist in the FSx file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_CHANGED</code> - AutoImport is on. Amazon FSx automatically imports file and directory listings
     *        of any new objects added to the S3 bucket and any existing objects that are changed in the S3 bucket after
     *        you choose this option.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html">Automatically import
     *        updates from your S3 bucket</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoImportPolicyType
     */

    public DataRepositoryConfiguration withAutoImportPolicy(String autoImportPolicy) {
        setAutoImportPolicy(autoImportPolicy);
        return this;
    }

    /**
     * <p>
     * Describes the file system's linked S3 data repository's <code>AutoImportPolicy</code>. The AutoImportPolicy
     * configures how Amazon FSx keeps your file and directory listings up to date as you add or modify objects in your
     * linked S3 bucket. <code>AutoImportPolicy</code> can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code> - (Default) AutoImport is off. Amazon FSx only updates file and directory listings from the
     * linked S3 bucket when the file system is created. FSx does not update file and directory listings for any new or
     * changed objects after choosing this option.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW</code> - AutoImport is on. Amazon FSx automatically imports directory listings of any new objects added
     * to the linked S3 bucket that do not currently exist in the FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_CHANGED</code> - AutoImport is on. Amazon FSx automatically imports file and directory listings of any
     * new objects added to the S3 bucket and any existing objects that are changed in the S3 bucket after you choose
     * this option.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html">Automatically import updates
     * from your S3 bucket</a>.
     * </p>
     * 
     * @param autoImportPolicy
     *        Describes the file system's linked S3 data repository's <code>AutoImportPolicy</code>. The
     *        AutoImportPolicy configures how Amazon FSx keeps your file and directory listings up to date as you add or
     *        modify objects in your linked S3 bucket. <code>AutoImportPolicy</code> can have the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code> - (Default) AutoImport is off. Amazon FSx only updates file and directory listings from
     *        the linked S3 bucket when the file system is created. FSx does not update file and directory listings for
     *        any new or changed objects after choosing this option.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW</code> - AutoImport is on. Amazon FSx automatically imports directory listings of any new
     *        objects added to the linked S3 bucket that do not currently exist in the FSx file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_CHANGED</code> - AutoImport is on. Amazon FSx automatically imports file and directory listings
     *        of any new objects added to the S3 bucket and any existing objects that are changed in the S3 bucket after
     *        you choose this option.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html">Automatically import
     *        updates from your S3 bucket</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoImportPolicyType
     */

    public DataRepositoryConfiguration withAutoImportPolicy(AutoImportPolicyType autoImportPolicy) {
        this.autoImportPolicy = autoImportPolicy.toString();
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

    public DataRepositoryConfiguration withFailureDetails(DataRepositoryFailureDetails failureDetails) {
        setFailureDetails(failureDetails);
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
        if (getLifecycle() != null)
            sb.append("Lifecycle: ").append(getLifecycle()).append(",");
        if (getImportPath() != null)
            sb.append("ImportPath: ").append(getImportPath()).append(",");
        if (getExportPath() != null)
            sb.append("ExportPath: ").append(getExportPath()).append(",");
        if (getImportedFileChunkSize() != null)
            sb.append("ImportedFileChunkSize: ").append(getImportedFileChunkSize()).append(",");
        if (getAutoImportPolicy() != null)
            sb.append("AutoImportPolicy: ").append(getAutoImportPolicy()).append(",");
        if (getFailureDetails() != null)
            sb.append("FailureDetails: ").append(getFailureDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataRepositoryConfiguration == false)
            return false;
        DataRepositoryConfiguration other = (DataRepositoryConfiguration) obj;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getImportPath() == null ^ this.getImportPath() == null)
            return false;
        if (other.getImportPath() != null && other.getImportPath().equals(this.getImportPath()) == false)
            return false;
        if (other.getExportPath() == null ^ this.getExportPath() == null)
            return false;
        if (other.getExportPath() != null && other.getExportPath().equals(this.getExportPath()) == false)
            return false;
        if (other.getImportedFileChunkSize() == null ^ this.getImportedFileChunkSize() == null)
            return false;
        if (other.getImportedFileChunkSize() != null && other.getImportedFileChunkSize().equals(this.getImportedFileChunkSize()) == false)
            return false;
        if (other.getAutoImportPolicy() == null ^ this.getAutoImportPolicy() == null)
            return false;
        if (other.getAutoImportPolicy() != null && other.getAutoImportPolicy().equals(this.getAutoImportPolicy()) == false)
            return false;
        if (other.getFailureDetails() == null ^ this.getFailureDetails() == null)
            return false;
        if (other.getFailureDetails() != null && other.getFailureDetails().equals(this.getFailureDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode + ((getImportPath() == null) ? 0 : getImportPath().hashCode());
        hashCode = prime * hashCode + ((getExportPath() == null) ? 0 : getExportPath().hashCode());
        hashCode = prime * hashCode + ((getImportedFileChunkSize() == null) ? 0 : getImportedFileChunkSize().hashCode());
        hashCode = prime * hashCode + ((getAutoImportPolicy() == null) ? 0 : getAutoImportPolicy().hashCode());
        hashCode = prime * hashCode + ((getFailureDetails() == null) ? 0 : getFailureDetails().hashCode());
        return hashCode;
    }

    @Override
    public DataRepositoryConfiguration clone() {
        try {
            return (DataRepositoryConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.DataRepositoryConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
