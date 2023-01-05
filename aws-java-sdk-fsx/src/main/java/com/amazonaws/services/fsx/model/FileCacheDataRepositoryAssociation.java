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
 * The configuration for a data repository association (DRA) to be created during the Amazon File Cache resource
 * creation. The DRA links the cache to either an Amazon S3 bucket or prefix, or a Network File System (NFS) data
 * repository that supports the NFSv3 protocol.
 * </p>
 * <p>
 * The DRA does not support automatic import or automatic export.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/FileCacheDataRepositoryAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileCacheDataRepositoryAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A path on the cache that points to a high-level directory (such as <code>/ns1/</code>) or subdirectory (such as
     * <code>/ns1/subdir/</code>) that will be mapped 1-1 with <code>DataRepositoryPath</code>. The leading forward
     * slash in the name is required. Two data repository associations cannot have overlapping cache paths. For example,
     * if a data repository is associated with cache path <code>/ns1/</code>, then you cannot link another data
     * repository with cache path <code>/ns1/ns2</code>.
     * </p>
     * <p>
     * This path specifies where in your cache files will be exported from. This cache directory can be linked to only
     * one data repository, and no data repository other can be linked to the directory.
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
     * The path to the S3 or NFS data repository that links to the cache. You must provide one of the following paths:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The path can be an NFS data repository that links to the cache. The path can be in one of two formats:
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
     * The path can be an S3 bucket or prefix in the format <code>s3://myBucket/myPrefix/</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String dataRepositoryPath;
    /**
     * <p>
     * A list of NFS Exports that will be linked with this data repository association. The Export paths are in the
     * format <code>/exportpath1</code>. To use this parameter, you must configure <code>DataRepositoryPath</code> as
     * the domain name of the NFS file system. The NFS file system domain name in effect is the root of the
     * subdirectories. Note that <code>DataRepositorySubdirectories</code> is not supported for S3 data repositories.
     * </p>
     */
    private java.util.List<String> dataRepositorySubdirectories;
    /**
     * <p>
     * The configuration for a data repository association that links an Amazon File Cache resource to an NFS data
     * repository.
     * </p>
     */
    private FileCacheNFSConfiguration nFS;

    /**
     * <p>
     * A path on the cache that points to a high-level directory (such as <code>/ns1/</code>) or subdirectory (such as
     * <code>/ns1/subdir/</code>) that will be mapped 1-1 with <code>DataRepositoryPath</code>. The leading forward
     * slash in the name is required. Two data repository associations cannot have overlapping cache paths. For example,
     * if a data repository is associated with cache path <code>/ns1/</code>, then you cannot link another data
     * repository with cache path <code>/ns1/ns2</code>.
     * </p>
     * <p>
     * This path specifies where in your cache files will be exported from. This cache directory can be linked to only
     * one data repository, and no data repository other can be linked to the directory.
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
     *        A path on the cache that points to a high-level directory (such as <code>/ns1/</code>) or subdirectory
     *        (such as <code>/ns1/subdir/</code>) that will be mapped 1-1 with <code>DataRepositoryPath</code>. The
     *        leading forward slash in the name is required. Two data repository associations cannot have overlapping
     *        cache paths. For example, if a data repository is associated with cache path <code>/ns1/</code>, then you
     *        cannot link another data repository with cache path <code>/ns1/ns2</code>.</p>
     *        <p>
     *        This path specifies where in your cache files will be exported from. This cache directory can be linked to
     *        only one data repository, and no data repository other can be linked to the directory.
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
     * A path on the cache that points to a high-level directory (such as <code>/ns1/</code>) or subdirectory (such as
     * <code>/ns1/subdir/</code>) that will be mapped 1-1 with <code>DataRepositoryPath</code>. The leading forward
     * slash in the name is required. Two data repository associations cannot have overlapping cache paths. For example,
     * if a data repository is associated with cache path <code>/ns1/</code>, then you cannot link another data
     * repository with cache path <code>/ns1/ns2</code>.
     * </p>
     * <p>
     * This path specifies where in your cache files will be exported from. This cache directory can be linked to only
     * one data repository, and no data repository other can be linked to the directory.
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
     * @return A path on the cache that points to a high-level directory (such as <code>/ns1/</code>) or subdirectory
     *         (such as <code>/ns1/subdir/</code>) that will be mapped 1-1 with <code>DataRepositoryPath</code>. The
     *         leading forward slash in the name is required. Two data repository associations cannot have overlapping
     *         cache paths. For example, if a data repository is associated with cache path <code>/ns1/</code>, then you
     *         cannot link another data repository with cache path <code>/ns1/ns2</code>.</p>
     *         <p>
     *         This path specifies where in your cache files will be exported from. This cache directory can be linked
     *         to only one data repository, and no data repository other can be linked to the directory.
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
     * A path on the cache that points to a high-level directory (such as <code>/ns1/</code>) or subdirectory (such as
     * <code>/ns1/subdir/</code>) that will be mapped 1-1 with <code>DataRepositoryPath</code>. The leading forward
     * slash in the name is required. Two data repository associations cannot have overlapping cache paths. For example,
     * if a data repository is associated with cache path <code>/ns1/</code>, then you cannot link another data
     * repository with cache path <code>/ns1/ns2</code>.
     * </p>
     * <p>
     * This path specifies where in your cache files will be exported from. This cache directory can be linked to only
     * one data repository, and no data repository other can be linked to the directory.
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
     *        A path on the cache that points to a high-level directory (such as <code>/ns1/</code>) or subdirectory
     *        (such as <code>/ns1/subdir/</code>) that will be mapped 1-1 with <code>DataRepositoryPath</code>. The
     *        leading forward slash in the name is required. Two data repository associations cannot have overlapping
     *        cache paths. For example, if a data repository is associated with cache path <code>/ns1/</code>, then you
     *        cannot link another data repository with cache path <code>/ns1/ns2</code>.</p>
     *        <p>
     *        This path specifies where in your cache files will be exported from. This cache directory can be linked to
     *        only one data repository, and no data repository other can be linked to the directory.
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

    public FileCacheDataRepositoryAssociation withFileCachePath(String fileCachePath) {
        setFileCachePath(fileCachePath);
        return this;
    }

    /**
     * <p>
     * The path to the S3 or NFS data repository that links to the cache. You must provide one of the following paths:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The path can be an NFS data repository that links to the cache. The path can be in one of two formats:
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
     * The path can be an S3 bucket or prefix in the format <code>s3://myBucket/myPrefix/</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataRepositoryPath
     *        The path to the S3 or NFS data repository that links to the cache. You must provide one of the following
     *        paths:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The path can be an NFS data repository that links to the cache. The path can be in one of two formats:
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
     *        The path can be an S3 bucket or prefix in the format <code>s3://myBucket/myPrefix/</code>.
     *        </p>
     *        </li>
     */

    public void setDataRepositoryPath(String dataRepositoryPath) {
        this.dataRepositoryPath = dataRepositoryPath;
    }

    /**
     * <p>
     * The path to the S3 or NFS data repository that links to the cache. You must provide one of the following paths:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The path can be an NFS data repository that links to the cache. The path can be in one of two formats:
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
     * The path can be an S3 bucket or prefix in the format <code>s3://myBucket/myPrefix/</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The path to the S3 or NFS data repository that links to the cache. You must provide one of the following
     *         paths:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The path can be an NFS data repository that links to the cache. The path can be in one of two formats:
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
     *         The path can be an S3 bucket or prefix in the format <code>s3://myBucket/myPrefix/</code>.
     *         </p>
     *         </li>
     */

    public String getDataRepositoryPath() {
        return this.dataRepositoryPath;
    }

    /**
     * <p>
     * The path to the S3 or NFS data repository that links to the cache. You must provide one of the following paths:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The path can be an NFS data repository that links to the cache. The path can be in one of two formats:
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
     * The path can be an S3 bucket or prefix in the format <code>s3://myBucket/myPrefix/</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataRepositoryPath
     *        The path to the S3 or NFS data repository that links to the cache. You must provide one of the following
     *        paths:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The path can be an NFS data repository that links to the cache. The path can be in one of two formats:
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
     *        The path can be an S3 bucket or prefix in the format <code>s3://myBucket/myPrefix/</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileCacheDataRepositoryAssociation withDataRepositoryPath(String dataRepositoryPath) {
        setDataRepositoryPath(dataRepositoryPath);
        return this;
    }

    /**
     * <p>
     * A list of NFS Exports that will be linked with this data repository association. The Export paths are in the
     * format <code>/exportpath1</code>. To use this parameter, you must configure <code>DataRepositoryPath</code> as
     * the domain name of the NFS file system. The NFS file system domain name in effect is the root of the
     * subdirectories. Note that <code>DataRepositorySubdirectories</code> is not supported for S3 data repositories.
     * </p>
     * 
     * @return A list of NFS Exports that will be linked with this data repository association. The Export paths are in
     *         the format <code>/exportpath1</code>. To use this parameter, you must configure
     *         <code>DataRepositoryPath</code> as the domain name of the NFS file system. The NFS file system domain
     *         name in effect is the root of the subdirectories. Note that <code>DataRepositorySubdirectories</code> is
     *         not supported for S3 data repositories.
     */

    public java.util.List<String> getDataRepositorySubdirectories() {
        return dataRepositorySubdirectories;
    }

    /**
     * <p>
     * A list of NFS Exports that will be linked with this data repository association. The Export paths are in the
     * format <code>/exportpath1</code>. To use this parameter, you must configure <code>DataRepositoryPath</code> as
     * the domain name of the NFS file system. The NFS file system domain name in effect is the root of the
     * subdirectories. Note that <code>DataRepositorySubdirectories</code> is not supported for S3 data repositories.
     * </p>
     * 
     * @param dataRepositorySubdirectories
     *        A list of NFS Exports that will be linked with this data repository association. The Export paths are in
     *        the format <code>/exportpath1</code>. To use this parameter, you must configure
     *        <code>DataRepositoryPath</code> as the domain name of the NFS file system. The NFS file system domain name
     *        in effect is the root of the subdirectories. Note that <code>DataRepositorySubdirectories</code> is not
     *        supported for S3 data repositories.
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
     * A list of NFS Exports that will be linked with this data repository association. The Export paths are in the
     * format <code>/exportpath1</code>. To use this parameter, you must configure <code>DataRepositoryPath</code> as
     * the domain name of the NFS file system. The NFS file system domain name in effect is the root of the
     * subdirectories. Note that <code>DataRepositorySubdirectories</code> is not supported for S3 data repositories.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataRepositorySubdirectories(java.util.Collection)} or
     * {@link #withDataRepositorySubdirectories(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dataRepositorySubdirectories
     *        A list of NFS Exports that will be linked with this data repository association. The Export paths are in
     *        the format <code>/exportpath1</code>. To use this parameter, you must configure
     *        <code>DataRepositoryPath</code> as the domain name of the NFS file system. The NFS file system domain name
     *        in effect is the root of the subdirectories. Note that <code>DataRepositorySubdirectories</code> is not
     *        supported for S3 data repositories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileCacheDataRepositoryAssociation withDataRepositorySubdirectories(String... dataRepositorySubdirectories) {
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
     * A list of NFS Exports that will be linked with this data repository association. The Export paths are in the
     * format <code>/exportpath1</code>. To use this parameter, you must configure <code>DataRepositoryPath</code> as
     * the domain name of the NFS file system. The NFS file system domain name in effect is the root of the
     * subdirectories. Note that <code>DataRepositorySubdirectories</code> is not supported for S3 data repositories.
     * </p>
     * 
     * @param dataRepositorySubdirectories
     *        A list of NFS Exports that will be linked with this data repository association. The Export paths are in
     *        the format <code>/exportpath1</code>. To use this parameter, you must configure
     *        <code>DataRepositoryPath</code> as the domain name of the NFS file system. The NFS file system domain name
     *        in effect is the root of the subdirectories. Note that <code>DataRepositorySubdirectories</code> is not
     *        supported for S3 data repositories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileCacheDataRepositoryAssociation withDataRepositorySubdirectories(java.util.Collection<String> dataRepositorySubdirectories) {
        setDataRepositorySubdirectories(dataRepositorySubdirectories);
        return this;
    }

    /**
     * <p>
     * The configuration for a data repository association that links an Amazon File Cache resource to an NFS data
     * repository.
     * </p>
     * 
     * @param nFS
     *        The configuration for a data repository association that links an Amazon File Cache resource to an NFS
     *        data repository.
     */

    public void setNFS(FileCacheNFSConfiguration nFS) {
        this.nFS = nFS;
    }

    /**
     * <p>
     * The configuration for a data repository association that links an Amazon File Cache resource to an NFS data
     * repository.
     * </p>
     * 
     * @return The configuration for a data repository association that links an Amazon File Cache resource to an NFS
     *         data repository.
     */

    public FileCacheNFSConfiguration getNFS() {
        return this.nFS;
    }

    /**
     * <p>
     * The configuration for a data repository association that links an Amazon File Cache resource to an NFS data
     * repository.
     * </p>
     * 
     * @param nFS
     *        The configuration for a data repository association that links an Amazon File Cache resource to an NFS
     *        data repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileCacheDataRepositoryAssociation withNFS(FileCacheNFSConfiguration nFS) {
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
        if (getFileCachePath() != null)
            sb.append("FileCachePath: ").append(getFileCachePath()).append(",");
        if (getDataRepositoryPath() != null)
            sb.append("DataRepositoryPath: ").append(getDataRepositoryPath()).append(",");
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

        if (obj instanceof FileCacheDataRepositoryAssociation == false)
            return false;
        FileCacheDataRepositoryAssociation other = (FileCacheDataRepositoryAssociation) obj;
        if (other.getFileCachePath() == null ^ this.getFileCachePath() == null)
            return false;
        if (other.getFileCachePath() != null && other.getFileCachePath().equals(this.getFileCachePath()) == false)
            return false;
        if (other.getDataRepositoryPath() == null ^ this.getDataRepositoryPath() == null)
            return false;
        if (other.getDataRepositoryPath() != null && other.getDataRepositoryPath().equals(this.getDataRepositoryPath()) == false)
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

        hashCode = prime * hashCode + ((getFileCachePath() == null) ? 0 : getFileCachePath().hashCode());
        hashCode = prime * hashCode + ((getDataRepositoryPath() == null) ? 0 : getDataRepositoryPath().hashCode());
        hashCode = prime * hashCode + ((getDataRepositorySubdirectories() == null) ? 0 : getDataRepositorySubdirectories().hashCode());
        hashCode = prime * hashCode + ((getNFS() == null) ? 0 : getNFS().hashCode());
        return hashCode;
    }

    @Override
    public FileCacheDataRepositoryAssociation clone() {
        try {
            return (FileCacheDataRepositoryAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.FileCacheDataRepositoryAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
