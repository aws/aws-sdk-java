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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateFileCache" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFileCacheRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An idempotency token for resource creation, in a string of up to 64 ASCII characters. This token is automatically
     * filled on your behalf when you use the Command Line Interface (CLI) or an Amazon Web Services SDK.
     * </p>
     * <p>
     * By using the idempotent operation, you can retry a <code>CreateFileCache</code> operation without the risk of
     * creating an extra cache. This approach can be useful when an initial call fails in a way that makes it unclear
     * whether a cache was created. Examples are if a transport level timeout occurred, or your connection was reset. If
     * you use the same client request token and the initial call created a cache, the client receives success as long
     * as the parameters are the same.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The type of cache that you're creating, which must be <code>LUSTRE</code>.
     * </p>
     */
    private String fileCacheType;
    /**
     * <p>
     * Sets the Lustre version for the cache that you're creating, which must be <code>2.12</code>.
     * </p>
     */
    private String fileCacheTypeVersion;
    /**
     * <p>
     * The storage capacity of the cache in gibibytes (GiB). Valid values are 1200 GiB, 2400 GiB, and increments of 2400
     * GiB.
     * </p>
     */
    private Integer storageCapacity;

    private java.util.List<String> subnetIds;
    /**
     * <p>
     * A list of IDs specifying the security groups to apply to all network interfaces created for Amazon File Cache
     * access. This list isn't returned in later requests to describe the cache.
     * </p>
     */
    private java.util.List<String> securityGroupIds;

    private java.util.List<Tag> tags;
    /**
     * <p>
     * A boolean flag indicating whether tags for the cache should be copied to data repository associations. This value
     * defaults to false.
     * </p>
     */
    private Boolean copyTagsToDataRepositoryAssociations;
    /**
     * <p>
     * Specifies the ID of the Key Management Service (KMS) key to use for encrypting data on an Amazon File Cache. If a
     * <code>KmsKeyId</code> isn't specified, the Amazon FSx-managed KMS key for your account is used. For more
     * information, see <a href="https://docs.aws.amazon.com/kms/latest/APIReference/API_Encrypt.html">Encrypt</a> in
     * the <i>Key Management Service API Reference</i>.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The configuration for the Amazon File Cache resource being created.
     * </p>
     */
    private CreateFileCacheLustreConfiguration lustreConfiguration;
    /**
     * <p>
     * A list of up to 8 configurations for data repository associations (DRAs) to be created during the cache creation.
     * The DRAs link the cache to either an Amazon S3 data repository or a Network File System (NFS) data repository
     * that supports the NFSv3 protocol.
     * </p>
     * <p>
     * The DRA configurations must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * All configurations on the list must be of the same data repository type, either all S3 or all NFS. A cache can't
     * link to different data repository types at the same time.
     * </p>
     * </li>
     * <li>
     * <p>
     * An NFS DRA must link to an NFS file system that supports the NFSv3 protocol.
     * </p>
     * </li>
     * </ul>
     * <p>
     * DRA automatic import and automatic export is not supported.
     * </p>
     */
    private java.util.List<FileCacheDataRepositoryAssociation> dataRepositoryAssociations;

    /**
     * <p>
     * An idempotency token for resource creation, in a string of up to 64 ASCII characters. This token is automatically
     * filled on your behalf when you use the Command Line Interface (CLI) or an Amazon Web Services SDK.
     * </p>
     * <p>
     * By using the idempotent operation, you can retry a <code>CreateFileCache</code> operation without the risk of
     * creating an extra cache. This approach can be useful when an initial call fails in a way that makes it unclear
     * whether a cache was created. Examples are if a transport level timeout occurred, or your connection was reset. If
     * you use the same client request token and the initial call created a cache, the client receives success as long
     * as the parameters are the same.
     * </p>
     * 
     * @param clientRequestToken
     *        An idempotency token for resource creation, in a string of up to 64 ASCII characters. This token is
     *        automatically filled on your behalf when you use the Command Line Interface (CLI) or an Amazon Web
     *        Services SDK.</p>
     *        <p>
     *        By using the idempotent operation, you can retry a <code>CreateFileCache</code> operation without the risk
     *        of creating an extra cache. This approach can be useful when an initial call fails in a way that makes it
     *        unclear whether a cache was created. Examples are if a transport level timeout occurred, or your
     *        connection was reset. If you use the same client request token and the initial call created a cache, the
     *        client receives success as long as the parameters are the same.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * An idempotency token for resource creation, in a string of up to 64 ASCII characters. This token is automatically
     * filled on your behalf when you use the Command Line Interface (CLI) or an Amazon Web Services SDK.
     * </p>
     * <p>
     * By using the idempotent operation, you can retry a <code>CreateFileCache</code> operation without the risk of
     * creating an extra cache. This approach can be useful when an initial call fails in a way that makes it unclear
     * whether a cache was created. Examples are if a transport level timeout occurred, or your connection was reset. If
     * you use the same client request token and the initial call created a cache, the client receives success as long
     * as the parameters are the same.
     * </p>
     * 
     * @return An idempotency token for resource creation, in a string of up to 64 ASCII characters. This token is
     *         automatically filled on your behalf when you use the Command Line Interface (CLI) or an Amazon Web
     *         Services SDK.</p>
     *         <p>
     *         By using the idempotent operation, you can retry a <code>CreateFileCache</code> operation without the
     *         risk of creating an extra cache. This approach can be useful when an initial call fails in a way that
     *         makes it unclear whether a cache was created. Examples are if a transport level timeout occurred, or your
     *         connection was reset. If you use the same client request token and the initial call created a cache, the
     *         client receives success as long as the parameters are the same.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * An idempotency token for resource creation, in a string of up to 64 ASCII characters. This token is automatically
     * filled on your behalf when you use the Command Line Interface (CLI) or an Amazon Web Services SDK.
     * </p>
     * <p>
     * By using the idempotent operation, you can retry a <code>CreateFileCache</code> operation without the risk of
     * creating an extra cache. This approach can be useful when an initial call fails in a way that makes it unclear
     * whether a cache was created. Examples are if a transport level timeout occurred, or your connection was reset. If
     * you use the same client request token and the initial call created a cache, the client receives success as long
     * as the parameters are the same.
     * </p>
     * 
     * @param clientRequestToken
     *        An idempotency token for resource creation, in a string of up to 64 ASCII characters. This token is
     *        automatically filled on your behalf when you use the Command Line Interface (CLI) or an Amazon Web
     *        Services SDK.</p>
     *        <p>
     *        By using the idempotent operation, you can retry a <code>CreateFileCache</code> operation without the risk
     *        of creating an extra cache. This approach can be useful when an initial call fails in a way that makes it
     *        unclear whether a cache was created. Examples are if a transport level timeout occurred, or your
     *        connection was reset. If you use the same client request token and the initial call created a cache, the
     *        client receives success as long as the parameters are the same.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileCacheRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The type of cache that you're creating, which must be <code>LUSTRE</code>.
     * </p>
     * 
     * @param fileCacheType
     *        The type of cache that you're creating, which must be <code>LUSTRE</code>.
     * @see FileCacheType
     */

    public void setFileCacheType(String fileCacheType) {
        this.fileCacheType = fileCacheType;
    }

    /**
     * <p>
     * The type of cache that you're creating, which must be <code>LUSTRE</code>.
     * </p>
     * 
     * @return The type of cache that you're creating, which must be <code>LUSTRE</code>.
     * @see FileCacheType
     */

    public String getFileCacheType() {
        return this.fileCacheType;
    }

    /**
     * <p>
     * The type of cache that you're creating, which must be <code>LUSTRE</code>.
     * </p>
     * 
     * @param fileCacheType
     *        The type of cache that you're creating, which must be <code>LUSTRE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileCacheType
     */

    public CreateFileCacheRequest withFileCacheType(String fileCacheType) {
        setFileCacheType(fileCacheType);
        return this;
    }

    /**
     * <p>
     * The type of cache that you're creating, which must be <code>LUSTRE</code>.
     * </p>
     * 
     * @param fileCacheType
     *        The type of cache that you're creating, which must be <code>LUSTRE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileCacheType
     */

    public CreateFileCacheRequest withFileCacheType(FileCacheType fileCacheType) {
        this.fileCacheType = fileCacheType.toString();
        return this;
    }

    /**
     * <p>
     * Sets the Lustre version for the cache that you're creating, which must be <code>2.12</code>.
     * </p>
     * 
     * @param fileCacheTypeVersion
     *        Sets the Lustre version for the cache that you're creating, which must be <code>2.12</code>.
     */

    public void setFileCacheTypeVersion(String fileCacheTypeVersion) {
        this.fileCacheTypeVersion = fileCacheTypeVersion;
    }

    /**
     * <p>
     * Sets the Lustre version for the cache that you're creating, which must be <code>2.12</code>.
     * </p>
     * 
     * @return Sets the Lustre version for the cache that you're creating, which must be <code>2.12</code>.
     */

    public String getFileCacheTypeVersion() {
        return this.fileCacheTypeVersion;
    }

    /**
     * <p>
     * Sets the Lustre version for the cache that you're creating, which must be <code>2.12</code>.
     * </p>
     * 
     * @param fileCacheTypeVersion
     *        Sets the Lustre version for the cache that you're creating, which must be <code>2.12</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileCacheRequest withFileCacheTypeVersion(String fileCacheTypeVersion) {
        setFileCacheTypeVersion(fileCacheTypeVersion);
        return this;
    }

    /**
     * <p>
     * The storage capacity of the cache in gibibytes (GiB). Valid values are 1200 GiB, 2400 GiB, and increments of 2400
     * GiB.
     * </p>
     * 
     * @param storageCapacity
     *        The storage capacity of the cache in gibibytes (GiB). Valid values are 1200 GiB, 2400 GiB, and increments
     *        of 2400 GiB.
     */

    public void setStorageCapacity(Integer storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    /**
     * <p>
     * The storage capacity of the cache in gibibytes (GiB). Valid values are 1200 GiB, 2400 GiB, and increments of 2400
     * GiB.
     * </p>
     * 
     * @return The storage capacity of the cache in gibibytes (GiB). Valid values are 1200 GiB, 2400 GiB, and increments
     *         of 2400 GiB.
     */

    public Integer getStorageCapacity() {
        return this.storageCapacity;
    }

    /**
     * <p>
     * The storage capacity of the cache in gibibytes (GiB). Valid values are 1200 GiB, 2400 GiB, and increments of 2400
     * GiB.
     * </p>
     * 
     * @param storageCapacity
     *        The storage capacity of the cache in gibibytes (GiB). Valid values are 1200 GiB, 2400 GiB, and increments
     *        of 2400 GiB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileCacheRequest withStorageCapacity(Integer storageCapacity) {
        setStorageCapacity(storageCapacity);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * @param subnetIds
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileCacheRequest withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * @param subnetIds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileCacheRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * A list of IDs specifying the security groups to apply to all network interfaces created for Amazon File Cache
     * access. This list isn't returned in later requests to describe the cache.
     * </p>
     * 
     * @return A list of IDs specifying the security groups to apply to all network interfaces created for Amazon File
     *         Cache access. This list isn't returned in later requests to describe the cache.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * A list of IDs specifying the security groups to apply to all network interfaces created for Amazon File Cache
     * access. This list isn't returned in later requests to describe the cache.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of IDs specifying the security groups to apply to all network interfaces created for Amazon File
     *        Cache access. This list isn't returned in later requests to describe the cache.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * A list of IDs specifying the security groups to apply to all network interfaces created for Amazon File Cache
     * access. This list isn't returned in later requests to describe the cache.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of IDs specifying the security groups to apply to all network interfaces created for Amazon File
     *        Cache access. This list isn't returned in later requests to describe the cache.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileCacheRequest withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of IDs specifying the security groups to apply to all network interfaces created for Amazon File Cache
     * access. This list isn't returned in later requests to describe the cache.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of IDs specifying the security groups to apply to all network interfaces created for Amazon File
     *        Cache access. This list isn't returned in later requests to describe the cache.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileCacheRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
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

    public CreateFileCacheRequest withTags(Tag... tags) {
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

    public CreateFileCacheRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags for the cache should be copied to data repository associations. This value
     * defaults to false.
     * </p>
     * 
     * @param copyTagsToDataRepositoryAssociations
     *        A boolean flag indicating whether tags for the cache should be copied to data repository associations.
     *        This value defaults to false.
     */

    public void setCopyTagsToDataRepositoryAssociations(Boolean copyTagsToDataRepositoryAssociations) {
        this.copyTagsToDataRepositoryAssociations = copyTagsToDataRepositoryAssociations;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags for the cache should be copied to data repository associations. This value
     * defaults to false.
     * </p>
     * 
     * @return A boolean flag indicating whether tags for the cache should be copied to data repository associations.
     *         This value defaults to false.
     */

    public Boolean getCopyTagsToDataRepositoryAssociations() {
        return this.copyTagsToDataRepositoryAssociations;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags for the cache should be copied to data repository associations. This value
     * defaults to false.
     * </p>
     * 
     * @param copyTagsToDataRepositoryAssociations
     *        A boolean flag indicating whether tags for the cache should be copied to data repository associations.
     *        This value defaults to false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileCacheRequest withCopyTagsToDataRepositoryAssociations(Boolean copyTagsToDataRepositoryAssociations) {
        setCopyTagsToDataRepositoryAssociations(copyTagsToDataRepositoryAssociations);
        return this;
    }

    /**
     * <p>
     * A boolean flag indicating whether tags for the cache should be copied to data repository associations. This value
     * defaults to false.
     * </p>
     * 
     * @return A boolean flag indicating whether tags for the cache should be copied to data repository associations.
     *         This value defaults to false.
     */

    public Boolean isCopyTagsToDataRepositoryAssociations() {
        return this.copyTagsToDataRepositoryAssociations;
    }

    /**
     * <p>
     * Specifies the ID of the Key Management Service (KMS) key to use for encrypting data on an Amazon File Cache. If a
     * <code>KmsKeyId</code> isn't specified, the Amazon FSx-managed KMS key for your account is used. For more
     * information, see <a href="https://docs.aws.amazon.com/kms/latest/APIReference/API_Encrypt.html">Encrypt</a> in
     * the <i>Key Management Service API Reference</i>.
     * </p>
     * 
     * @param kmsKeyId
     *        Specifies the ID of the Key Management Service (KMS) key to use for encrypting data on an Amazon File
     *        Cache. If a <code>KmsKeyId</code> isn't specified, the Amazon FSx-managed KMS key for your account is
     *        used. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/APIReference/API_Encrypt.html">Encrypt</a> in the <i>Key
     *        Management Service API Reference</i>.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * Specifies the ID of the Key Management Service (KMS) key to use for encrypting data on an Amazon File Cache. If a
     * <code>KmsKeyId</code> isn't specified, the Amazon FSx-managed KMS key for your account is used. For more
     * information, see <a href="https://docs.aws.amazon.com/kms/latest/APIReference/API_Encrypt.html">Encrypt</a> in
     * the <i>Key Management Service API Reference</i>.
     * </p>
     * 
     * @return Specifies the ID of the Key Management Service (KMS) key to use for encrypting data on an Amazon File
     *         Cache. If a <code>KmsKeyId</code> isn't specified, the Amazon FSx-managed KMS key for your account is
     *         used. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/APIReference/API_Encrypt.html">Encrypt</a> in the <i>Key
     *         Management Service API Reference</i>.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * Specifies the ID of the Key Management Service (KMS) key to use for encrypting data on an Amazon File Cache. If a
     * <code>KmsKeyId</code> isn't specified, the Amazon FSx-managed KMS key for your account is used. For more
     * information, see <a href="https://docs.aws.amazon.com/kms/latest/APIReference/API_Encrypt.html">Encrypt</a> in
     * the <i>Key Management Service API Reference</i>.
     * </p>
     * 
     * @param kmsKeyId
     *        Specifies the ID of the Key Management Service (KMS) key to use for encrypting data on an Amazon File
     *        Cache. If a <code>KmsKeyId</code> isn't specified, the Amazon FSx-managed KMS key for your account is
     *        used. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/APIReference/API_Encrypt.html">Encrypt</a> in the <i>Key
     *        Management Service API Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileCacheRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The configuration for the Amazon File Cache resource being created.
     * </p>
     * 
     * @param lustreConfiguration
     *        The configuration for the Amazon File Cache resource being created.
     */

    public void setLustreConfiguration(CreateFileCacheLustreConfiguration lustreConfiguration) {
        this.lustreConfiguration = lustreConfiguration;
    }

    /**
     * <p>
     * The configuration for the Amazon File Cache resource being created.
     * </p>
     * 
     * @return The configuration for the Amazon File Cache resource being created.
     */

    public CreateFileCacheLustreConfiguration getLustreConfiguration() {
        return this.lustreConfiguration;
    }

    /**
     * <p>
     * The configuration for the Amazon File Cache resource being created.
     * </p>
     * 
     * @param lustreConfiguration
     *        The configuration for the Amazon File Cache resource being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileCacheRequest withLustreConfiguration(CreateFileCacheLustreConfiguration lustreConfiguration) {
        setLustreConfiguration(lustreConfiguration);
        return this;
    }

    /**
     * <p>
     * A list of up to 8 configurations for data repository associations (DRAs) to be created during the cache creation.
     * The DRAs link the cache to either an Amazon S3 data repository or a Network File System (NFS) data repository
     * that supports the NFSv3 protocol.
     * </p>
     * <p>
     * The DRA configurations must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * All configurations on the list must be of the same data repository type, either all S3 or all NFS. A cache can't
     * link to different data repository types at the same time.
     * </p>
     * </li>
     * <li>
     * <p>
     * An NFS DRA must link to an NFS file system that supports the NFSv3 protocol.
     * </p>
     * </li>
     * </ul>
     * <p>
     * DRA automatic import and automatic export is not supported.
     * </p>
     * 
     * @return A list of up to 8 configurations for data repository associations (DRAs) to be created during the cache
     *         creation. The DRAs link the cache to either an Amazon S3 data repository or a Network File System (NFS)
     *         data repository that supports the NFSv3 protocol.</p>
     *         <p>
     *         The DRA configurations must meet the following requirements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         All configurations on the list must be of the same data repository type, either all S3 or all NFS. A
     *         cache can't link to different data repository types at the same time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An NFS DRA must link to an NFS file system that supports the NFSv3 protocol.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         DRA automatic import and automatic export is not supported.
     */

    public java.util.List<FileCacheDataRepositoryAssociation> getDataRepositoryAssociations() {
        return dataRepositoryAssociations;
    }

    /**
     * <p>
     * A list of up to 8 configurations for data repository associations (DRAs) to be created during the cache creation.
     * The DRAs link the cache to either an Amazon S3 data repository or a Network File System (NFS) data repository
     * that supports the NFSv3 protocol.
     * </p>
     * <p>
     * The DRA configurations must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * All configurations on the list must be of the same data repository type, either all S3 or all NFS. A cache can't
     * link to different data repository types at the same time.
     * </p>
     * </li>
     * <li>
     * <p>
     * An NFS DRA must link to an NFS file system that supports the NFSv3 protocol.
     * </p>
     * </li>
     * </ul>
     * <p>
     * DRA automatic import and automatic export is not supported.
     * </p>
     * 
     * @param dataRepositoryAssociations
     *        A list of up to 8 configurations for data repository associations (DRAs) to be created during the cache
     *        creation. The DRAs link the cache to either an Amazon S3 data repository or a Network File System (NFS)
     *        data repository that supports the NFSv3 protocol.</p>
     *        <p>
     *        The DRA configurations must meet the following requirements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        All configurations on the list must be of the same data repository type, either all S3 or all NFS. A cache
     *        can't link to different data repository types at the same time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An NFS DRA must link to an NFS file system that supports the NFSv3 protocol.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        DRA automatic import and automatic export is not supported.
     */

    public void setDataRepositoryAssociations(java.util.Collection<FileCacheDataRepositoryAssociation> dataRepositoryAssociations) {
        if (dataRepositoryAssociations == null) {
            this.dataRepositoryAssociations = null;
            return;
        }

        this.dataRepositoryAssociations = new java.util.ArrayList<FileCacheDataRepositoryAssociation>(dataRepositoryAssociations);
    }

    /**
     * <p>
     * A list of up to 8 configurations for data repository associations (DRAs) to be created during the cache creation.
     * The DRAs link the cache to either an Amazon S3 data repository or a Network File System (NFS) data repository
     * that supports the NFSv3 protocol.
     * </p>
     * <p>
     * The DRA configurations must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * All configurations on the list must be of the same data repository type, either all S3 or all NFS. A cache can't
     * link to different data repository types at the same time.
     * </p>
     * </li>
     * <li>
     * <p>
     * An NFS DRA must link to an NFS file system that supports the NFSv3 protocol.
     * </p>
     * </li>
     * </ul>
     * <p>
     * DRA automatic import and automatic export is not supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataRepositoryAssociations(java.util.Collection)} or
     * {@link #withDataRepositoryAssociations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dataRepositoryAssociations
     *        A list of up to 8 configurations for data repository associations (DRAs) to be created during the cache
     *        creation. The DRAs link the cache to either an Amazon S3 data repository or a Network File System (NFS)
     *        data repository that supports the NFSv3 protocol.</p>
     *        <p>
     *        The DRA configurations must meet the following requirements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        All configurations on the list must be of the same data repository type, either all S3 or all NFS. A cache
     *        can't link to different data repository types at the same time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An NFS DRA must link to an NFS file system that supports the NFSv3 protocol.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        DRA automatic import and automatic export is not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileCacheRequest withDataRepositoryAssociations(FileCacheDataRepositoryAssociation... dataRepositoryAssociations) {
        if (this.dataRepositoryAssociations == null) {
            setDataRepositoryAssociations(new java.util.ArrayList<FileCacheDataRepositoryAssociation>(dataRepositoryAssociations.length));
        }
        for (FileCacheDataRepositoryAssociation ele : dataRepositoryAssociations) {
            this.dataRepositoryAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 8 configurations for data repository associations (DRAs) to be created during the cache creation.
     * The DRAs link the cache to either an Amazon S3 data repository or a Network File System (NFS) data repository
     * that supports the NFSv3 protocol.
     * </p>
     * <p>
     * The DRA configurations must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * All configurations on the list must be of the same data repository type, either all S3 or all NFS. A cache can't
     * link to different data repository types at the same time.
     * </p>
     * </li>
     * <li>
     * <p>
     * An NFS DRA must link to an NFS file system that supports the NFSv3 protocol.
     * </p>
     * </li>
     * </ul>
     * <p>
     * DRA automatic import and automatic export is not supported.
     * </p>
     * 
     * @param dataRepositoryAssociations
     *        A list of up to 8 configurations for data repository associations (DRAs) to be created during the cache
     *        creation. The DRAs link the cache to either an Amazon S3 data repository or a Network File System (NFS)
     *        data repository that supports the NFSv3 protocol.</p>
     *        <p>
     *        The DRA configurations must meet the following requirements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        All configurations on the list must be of the same data repository type, either all S3 or all NFS. A cache
     *        can't link to different data repository types at the same time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An NFS DRA must link to an NFS file system that supports the NFSv3 protocol.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        DRA automatic import and automatic export is not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileCacheRequest withDataRepositoryAssociations(java.util.Collection<FileCacheDataRepositoryAssociation> dataRepositoryAssociations) {
        setDataRepositoryAssociations(dataRepositoryAssociations);
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getFileCacheType() != null)
            sb.append("FileCacheType: ").append(getFileCacheType()).append(",");
        if (getFileCacheTypeVersion() != null)
            sb.append("FileCacheTypeVersion: ").append(getFileCacheTypeVersion()).append(",");
        if (getStorageCapacity() != null)
            sb.append("StorageCapacity: ").append(getStorageCapacity()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getCopyTagsToDataRepositoryAssociations() != null)
            sb.append("CopyTagsToDataRepositoryAssociations: ").append(getCopyTagsToDataRepositoryAssociations()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getLustreConfiguration() != null)
            sb.append("LustreConfiguration: ").append(getLustreConfiguration()).append(",");
        if (getDataRepositoryAssociations() != null)
            sb.append("DataRepositoryAssociations: ").append(getDataRepositoryAssociations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFileCacheRequest == false)
            return false;
        CreateFileCacheRequest other = (CreateFileCacheRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getFileCacheType() == null ^ this.getFileCacheType() == null)
            return false;
        if (other.getFileCacheType() != null && other.getFileCacheType().equals(this.getFileCacheType()) == false)
            return false;
        if (other.getFileCacheTypeVersion() == null ^ this.getFileCacheTypeVersion() == null)
            return false;
        if (other.getFileCacheTypeVersion() != null && other.getFileCacheTypeVersion().equals(this.getFileCacheTypeVersion()) == false)
            return false;
        if (other.getStorageCapacity() == null ^ this.getStorageCapacity() == null)
            return false;
        if (other.getStorageCapacity() != null && other.getStorageCapacity().equals(this.getStorageCapacity()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCopyTagsToDataRepositoryAssociations() == null ^ this.getCopyTagsToDataRepositoryAssociations() == null)
            return false;
        if (other.getCopyTagsToDataRepositoryAssociations() != null
                && other.getCopyTagsToDataRepositoryAssociations().equals(this.getCopyTagsToDataRepositoryAssociations()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getLustreConfiguration() == null ^ this.getLustreConfiguration() == null)
            return false;
        if (other.getLustreConfiguration() != null && other.getLustreConfiguration().equals(this.getLustreConfiguration()) == false)
            return false;
        if (other.getDataRepositoryAssociations() == null ^ this.getDataRepositoryAssociations() == null)
            return false;
        if (other.getDataRepositoryAssociations() != null && other.getDataRepositoryAssociations().equals(this.getDataRepositoryAssociations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getFileCacheType() == null) ? 0 : getFileCacheType().hashCode());
        hashCode = prime * hashCode + ((getFileCacheTypeVersion() == null) ? 0 : getFileCacheTypeVersion().hashCode());
        hashCode = prime * hashCode + ((getStorageCapacity() == null) ? 0 : getStorageCapacity().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToDataRepositoryAssociations() == null) ? 0 : getCopyTagsToDataRepositoryAssociations().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getLustreConfiguration() == null) ? 0 : getLustreConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDataRepositoryAssociations() == null) ? 0 : getDataRepositoryAssociations().hashCode());
        return hashCode;
    }

    @Override
    public CreateFileCacheRequest clone() {
        return (CreateFileCacheRequest) super.clone();
    }

}
