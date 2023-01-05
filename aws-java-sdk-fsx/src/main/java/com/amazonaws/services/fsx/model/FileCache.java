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
 * A description of a specific Amazon File Cache resource, which is a response object from the
 * <code>DescribeFileCaches</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/FileCache" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileCache implements Serializable, Cloneable, StructuredPojo {

    private String ownerId;

    private java.util.Date creationTime;
    /**
     * <p>
     * The system-generated, unique ID of the cache.
     * </p>
     */
    private String fileCacheId;
    /**
     * <p>
     * The type of cache, which must be <code>LUSTRE</code>.
     * </p>
     */
    private String fileCacheType;
    /**
     * <p>
     * The Lustre version of the cache, which must be <code>2.12</code>.
     * </p>
     */
    private String fileCacheTypeVersion;
    /**
     * <p>
     * The lifecycle status of the cache. The following are the possible values and what they mean:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The cache is in a healthy state, and is reachable and available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - The new cache is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - An existing cache is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The cache is undergoing a customer-initiated update.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - An existing cache has experienced an unrecoverable failure. When creating a new cache, the
     * cache was unable to be created.
     * </p>
     * </li>
     * </ul>
     */
    private String lifecycle;
    /**
     * <p>
     * A structure providing details of any failures that occurred.
     * </p>
     */
    private FileCacheFailureDetails failureDetails;
    /**
     * <p>
     * The storage capacity of the cache in gibibytes (GiB).
     * </p>
     */
    private Integer storageCapacity;

    private String vpcId;

    private java.util.List<String> subnetIds;

    private java.util.List<String> networkInterfaceIds;
    /**
     * <p>
     * The Domain Name System (DNS) name for the cache.
     * </p>
     */
    private String dNSName;
    /**
     * <p>
     * Specifies the ID of the Key Management Service (KMS) key to use for encrypting data on an Amazon File Cache. If a
     * <code>KmsKeyId</code> isn't specified, the Amazon FSx-managed KMS key for your account is used. For more
     * information, see <a href="https://docs.aws.amazon.com/kms/latest/APIReference/API_Encrypt.html">Encrypt</a> in
     * the <i>Key Management Service API Reference</i>.
     * </p>
     */
    private String kmsKeyId;

    private String resourceARN;
    /**
     * <p>
     * The configuration for the Amazon File Cache resource.
     * </p>
     */
    private FileCacheLustreConfiguration lustreConfiguration;
    /**
     * <p>
     * A list of IDs of data repository associations that are associated with this cache.
     * </p>
     */
    private java.util.List<String> dataRepositoryAssociationIds;

    /**
     * @param ownerId
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * @return
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @param ownerId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileCache withOwnerId(String ownerId) {
        setOwnerId(ownerId);
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

    public FileCache withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The system-generated, unique ID of the cache.
     * </p>
     * 
     * @param fileCacheId
     *        The system-generated, unique ID of the cache.
     */

    public void setFileCacheId(String fileCacheId) {
        this.fileCacheId = fileCacheId;
    }

    /**
     * <p>
     * The system-generated, unique ID of the cache.
     * </p>
     * 
     * @return The system-generated, unique ID of the cache.
     */

    public String getFileCacheId() {
        return this.fileCacheId;
    }

    /**
     * <p>
     * The system-generated, unique ID of the cache.
     * </p>
     * 
     * @param fileCacheId
     *        The system-generated, unique ID of the cache.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileCache withFileCacheId(String fileCacheId) {
        setFileCacheId(fileCacheId);
        return this;
    }

    /**
     * <p>
     * The type of cache, which must be <code>LUSTRE</code>.
     * </p>
     * 
     * @param fileCacheType
     *        The type of cache, which must be <code>LUSTRE</code>.
     * @see FileCacheType
     */

    public void setFileCacheType(String fileCacheType) {
        this.fileCacheType = fileCacheType;
    }

    /**
     * <p>
     * The type of cache, which must be <code>LUSTRE</code>.
     * </p>
     * 
     * @return The type of cache, which must be <code>LUSTRE</code>.
     * @see FileCacheType
     */

    public String getFileCacheType() {
        return this.fileCacheType;
    }

    /**
     * <p>
     * The type of cache, which must be <code>LUSTRE</code>.
     * </p>
     * 
     * @param fileCacheType
     *        The type of cache, which must be <code>LUSTRE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileCacheType
     */

    public FileCache withFileCacheType(String fileCacheType) {
        setFileCacheType(fileCacheType);
        return this;
    }

    /**
     * <p>
     * The type of cache, which must be <code>LUSTRE</code>.
     * </p>
     * 
     * @param fileCacheType
     *        The type of cache, which must be <code>LUSTRE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileCacheType
     */

    public FileCache withFileCacheType(FileCacheType fileCacheType) {
        this.fileCacheType = fileCacheType.toString();
        return this;
    }

    /**
     * <p>
     * The Lustre version of the cache, which must be <code>2.12</code>.
     * </p>
     * 
     * @param fileCacheTypeVersion
     *        The Lustre version of the cache, which must be <code>2.12</code>.
     */

    public void setFileCacheTypeVersion(String fileCacheTypeVersion) {
        this.fileCacheTypeVersion = fileCacheTypeVersion;
    }

    /**
     * <p>
     * The Lustre version of the cache, which must be <code>2.12</code>.
     * </p>
     * 
     * @return The Lustre version of the cache, which must be <code>2.12</code>.
     */

    public String getFileCacheTypeVersion() {
        return this.fileCacheTypeVersion;
    }

    /**
     * <p>
     * The Lustre version of the cache, which must be <code>2.12</code>.
     * </p>
     * 
     * @param fileCacheTypeVersion
     *        The Lustre version of the cache, which must be <code>2.12</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileCache withFileCacheTypeVersion(String fileCacheTypeVersion) {
        setFileCacheTypeVersion(fileCacheTypeVersion);
        return this;
    }

    /**
     * <p>
     * The lifecycle status of the cache. The following are the possible values and what they mean:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The cache is in a healthy state, and is reachable and available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - The new cache is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - An existing cache is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The cache is undergoing a customer-initiated update.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - An existing cache has experienced an unrecoverable failure. When creating a new cache, the
     * cache was unable to be created.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lifecycle
     *        The lifecycle status of the cache. The following are the possible values and what they mean:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The cache is in a healthy state, and is reachable and available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The new cache is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - An existing cache is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The cache is undergoing a customer-initiated update.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - An existing cache has experienced an unrecoverable failure. When creating a new
     *        cache, the cache was unable to be created.
     *        </p>
     *        </li>
     * @see FileCacheLifecycle
     */

    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * The lifecycle status of the cache. The following are the possible values and what they mean:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The cache is in a healthy state, and is reachable and available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - The new cache is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - An existing cache is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The cache is undergoing a customer-initiated update.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - An existing cache has experienced an unrecoverable failure. When creating a new cache, the
     * cache was unable to be created.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The lifecycle status of the cache. The following are the possible values and what they mean:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AVAILABLE</code> - The cache is in a healthy state, and is reachable and available for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - The new cache is being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - An existing cache is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code> - The cache is undergoing a customer-initiated update.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - An existing cache has experienced an unrecoverable failure. When creating a new
     *         cache, the cache was unable to be created.
     *         </p>
     *         </li>
     * @see FileCacheLifecycle
     */

    public String getLifecycle() {
        return this.lifecycle;
    }

    /**
     * <p>
     * The lifecycle status of the cache. The following are the possible values and what they mean:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The cache is in a healthy state, and is reachable and available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - The new cache is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - An existing cache is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The cache is undergoing a customer-initiated update.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - An existing cache has experienced an unrecoverable failure. When creating a new cache, the
     * cache was unable to be created.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lifecycle
     *        The lifecycle status of the cache. The following are the possible values and what they mean:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The cache is in a healthy state, and is reachable and available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The new cache is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - An existing cache is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The cache is undergoing a customer-initiated update.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - An existing cache has experienced an unrecoverable failure. When creating a new
     *        cache, the cache was unable to be created.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileCacheLifecycle
     */

    public FileCache withLifecycle(String lifecycle) {
        setLifecycle(lifecycle);
        return this;
    }

    /**
     * <p>
     * The lifecycle status of the cache. The following are the possible values and what they mean:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The cache is in a healthy state, and is reachable and available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - The new cache is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - An existing cache is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The cache is undergoing a customer-initiated update.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - An existing cache has experienced an unrecoverable failure. When creating a new cache, the
     * cache was unable to be created.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lifecycle
     *        The lifecycle status of the cache. The following are the possible values and what they mean:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The cache is in a healthy state, and is reachable and available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The new cache is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - An existing cache is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The cache is undergoing a customer-initiated update.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - An existing cache has experienced an unrecoverable failure. When creating a new
     *        cache, the cache was unable to be created.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileCacheLifecycle
     */

    public FileCache withLifecycle(FileCacheLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
        return this;
    }

    /**
     * <p>
     * A structure providing details of any failures that occurred.
     * </p>
     * 
     * @param failureDetails
     *        A structure providing details of any failures that occurred.
     */

    public void setFailureDetails(FileCacheFailureDetails failureDetails) {
        this.failureDetails = failureDetails;
    }

    /**
     * <p>
     * A structure providing details of any failures that occurred.
     * </p>
     * 
     * @return A structure providing details of any failures that occurred.
     */

    public FileCacheFailureDetails getFailureDetails() {
        return this.failureDetails;
    }

    /**
     * <p>
     * A structure providing details of any failures that occurred.
     * </p>
     * 
     * @param failureDetails
     *        A structure providing details of any failures that occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileCache withFailureDetails(FileCacheFailureDetails failureDetails) {
        setFailureDetails(failureDetails);
        return this;
    }

    /**
     * <p>
     * The storage capacity of the cache in gibibytes (GiB).
     * </p>
     * 
     * @param storageCapacity
     *        The storage capacity of the cache in gibibytes (GiB).
     */

    public void setStorageCapacity(Integer storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    /**
     * <p>
     * The storage capacity of the cache in gibibytes (GiB).
     * </p>
     * 
     * @return The storage capacity of the cache in gibibytes (GiB).
     */

    public Integer getStorageCapacity() {
        return this.storageCapacity;
    }

    /**
     * <p>
     * The storage capacity of the cache in gibibytes (GiB).
     * </p>
     * 
     * @param storageCapacity
     *        The storage capacity of the cache in gibibytes (GiB).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileCache withStorageCapacity(Integer storageCapacity) {
        setStorageCapacity(storageCapacity);
        return this;
    }

    /**
     * @param vpcId
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * @return
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @param vpcId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileCache withVpcId(String vpcId) {
        setVpcId(vpcId);
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

    public FileCache withSubnetIds(String... subnetIds) {
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

    public FileCache withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getNetworkInterfaceIds() {
        return networkInterfaceIds;
    }

    /**
     * @param networkInterfaceIds
     */

    public void setNetworkInterfaceIds(java.util.Collection<String> networkInterfaceIds) {
        if (networkInterfaceIds == null) {
            this.networkInterfaceIds = null;
            return;
        }

        this.networkInterfaceIds = new java.util.ArrayList<String>(networkInterfaceIds);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfaceIds(java.util.Collection)} or {@link #withNetworkInterfaceIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param networkInterfaceIds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileCache withNetworkInterfaceIds(String... networkInterfaceIds) {
        if (this.networkInterfaceIds == null) {
            setNetworkInterfaceIds(new java.util.ArrayList<String>(networkInterfaceIds.length));
        }
        for (String ele : networkInterfaceIds) {
            this.networkInterfaceIds.add(ele);
        }
        return this;
    }

    /**
     * @param networkInterfaceIds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileCache withNetworkInterfaceIds(java.util.Collection<String> networkInterfaceIds) {
        setNetworkInterfaceIds(networkInterfaceIds);
        return this;
    }

    /**
     * <p>
     * The Domain Name System (DNS) name for the cache.
     * </p>
     * 
     * @param dNSName
     *        The Domain Name System (DNS) name for the cache.
     */

    public void setDNSName(String dNSName) {
        this.dNSName = dNSName;
    }

    /**
     * <p>
     * The Domain Name System (DNS) name for the cache.
     * </p>
     * 
     * @return The Domain Name System (DNS) name for the cache.
     */

    public String getDNSName() {
        return this.dNSName;
    }

    /**
     * <p>
     * The Domain Name System (DNS) name for the cache.
     * </p>
     * 
     * @param dNSName
     *        The Domain Name System (DNS) name for the cache.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileCache withDNSName(String dNSName) {
        setDNSName(dNSName);
        return this;
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

    public FileCache withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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

    public FileCache withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
        return this;
    }

    /**
     * <p>
     * The configuration for the Amazon File Cache resource.
     * </p>
     * 
     * @param lustreConfiguration
     *        The configuration for the Amazon File Cache resource.
     */

    public void setLustreConfiguration(FileCacheLustreConfiguration lustreConfiguration) {
        this.lustreConfiguration = lustreConfiguration;
    }

    /**
     * <p>
     * The configuration for the Amazon File Cache resource.
     * </p>
     * 
     * @return The configuration for the Amazon File Cache resource.
     */

    public FileCacheLustreConfiguration getLustreConfiguration() {
        return this.lustreConfiguration;
    }

    /**
     * <p>
     * The configuration for the Amazon File Cache resource.
     * </p>
     * 
     * @param lustreConfiguration
     *        The configuration for the Amazon File Cache resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileCache withLustreConfiguration(FileCacheLustreConfiguration lustreConfiguration) {
        setLustreConfiguration(lustreConfiguration);
        return this;
    }

    /**
     * <p>
     * A list of IDs of data repository associations that are associated with this cache.
     * </p>
     * 
     * @return A list of IDs of data repository associations that are associated with this cache.
     */

    public java.util.List<String> getDataRepositoryAssociationIds() {
        return dataRepositoryAssociationIds;
    }

    /**
     * <p>
     * A list of IDs of data repository associations that are associated with this cache.
     * </p>
     * 
     * @param dataRepositoryAssociationIds
     *        A list of IDs of data repository associations that are associated with this cache.
     */

    public void setDataRepositoryAssociationIds(java.util.Collection<String> dataRepositoryAssociationIds) {
        if (dataRepositoryAssociationIds == null) {
            this.dataRepositoryAssociationIds = null;
            return;
        }

        this.dataRepositoryAssociationIds = new java.util.ArrayList<String>(dataRepositoryAssociationIds);
    }

    /**
     * <p>
     * A list of IDs of data repository associations that are associated with this cache.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataRepositoryAssociationIds(java.util.Collection)} or
     * {@link #withDataRepositoryAssociationIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dataRepositoryAssociationIds
     *        A list of IDs of data repository associations that are associated with this cache.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileCache withDataRepositoryAssociationIds(String... dataRepositoryAssociationIds) {
        if (this.dataRepositoryAssociationIds == null) {
            setDataRepositoryAssociationIds(new java.util.ArrayList<String>(dataRepositoryAssociationIds.length));
        }
        for (String ele : dataRepositoryAssociationIds) {
            this.dataRepositoryAssociationIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of IDs of data repository associations that are associated with this cache.
     * </p>
     * 
     * @param dataRepositoryAssociationIds
     *        A list of IDs of data repository associations that are associated with this cache.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileCache withDataRepositoryAssociationIds(java.util.Collection<String> dataRepositoryAssociationIds) {
        setDataRepositoryAssociationIds(dataRepositoryAssociationIds);
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
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getFileCacheId() != null)
            sb.append("FileCacheId: ").append(getFileCacheId()).append(",");
        if (getFileCacheType() != null)
            sb.append("FileCacheType: ").append(getFileCacheType()).append(",");
        if (getFileCacheTypeVersion() != null)
            sb.append("FileCacheTypeVersion: ").append(getFileCacheTypeVersion()).append(",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: ").append(getLifecycle()).append(",");
        if (getFailureDetails() != null)
            sb.append("FailureDetails: ").append(getFailureDetails()).append(",");
        if (getStorageCapacity() != null)
            sb.append("StorageCapacity: ").append(getStorageCapacity()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getNetworkInterfaceIds() != null)
            sb.append("NetworkInterfaceIds: ").append(getNetworkInterfaceIds()).append(",");
        if (getDNSName() != null)
            sb.append("DNSName: ").append(getDNSName()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getResourceARN() != null)
            sb.append("ResourceARN: ").append(getResourceARN()).append(",");
        if (getLustreConfiguration() != null)
            sb.append("LustreConfiguration: ").append(getLustreConfiguration()).append(",");
        if (getDataRepositoryAssociationIds() != null)
            sb.append("DataRepositoryAssociationIds: ").append(getDataRepositoryAssociationIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileCache == false)
            return false;
        FileCache other = (FileCache) obj;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getFileCacheId() == null ^ this.getFileCacheId() == null)
            return false;
        if (other.getFileCacheId() != null && other.getFileCacheId().equals(this.getFileCacheId()) == false)
            return false;
        if (other.getFileCacheType() == null ^ this.getFileCacheType() == null)
            return false;
        if (other.getFileCacheType() != null && other.getFileCacheType().equals(this.getFileCacheType()) == false)
            return false;
        if (other.getFileCacheTypeVersion() == null ^ this.getFileCacheTypeVersion() == null)
            return false;
        if (other.getFileCacheTypeVersion() != null && other.getFileCacheTypeVersion().equals(this.getFileCacheTypeVersion()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getFailureDetails() == null ^ this.getFailureDetails() == null)
            return false;
        if (other.getFailureDetails() != null && other.getFailureDetails().equals(this.getFailureDetails()) == false)
            return false;
        if (other.getStorageCapacity() == null ^ this.getStorageCapacity() == null)
            return false;
        if (other.getStorageCapacity() != null && other.getStorageCapacity().equals(this.getStorageCapacity()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getNetworkInterfaceIds() == null ^ this.getNetworkInterfaceIds() == null)
            return false;
        if (other.getNetworkInterfaceIds() != null && other.getNetworkInterfaceIds().equals(this.getNetworkInterfaceIds()) == false)
            return false;
        if (other.getDNSName() == null ^ this.getDNSName() == null)
            return false;
        if (other.getDNSName() != null && other.getDNSName().equals(this.getDNSName()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null && other.getResourceARN().equals(this.getResourceARN()) == false)
            return false;
        if (other.getLustreConfiguration() == null ^ this.getLustreConfiguration() == null)
            return false;
        if (other.getLustreConfiguration() != null && other.getLustreConfiguration().equals(this.getLustreConfiguration()) == false)
            return false;
        if (other.getDataRepositoryAssociationIds() == null ^ this.getDataRepositoryAssociationIds() == null)
            return false;
        if (other.getDataRepositoryAssociationIds() != null && other.getDataRepositoryAssociationIds().equals(this.getDataRepositoryAssociationIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getFileCacheId() == null) ? 0 : getFileCacheId().hashCode());
        hashCode = prime * hashCode + ((getFileCacheType() == null) ? 0 : getFileCacheType().hashCode());
        hashCode = prime * hashCode + ((getFileCacheTypeVersion() == null) ? 0 : getFileCacheTypeVersion().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode + ((getFailureDetails() == null) ? 0 : getFailureDetails().hashCode());
        hashCode = prime * hashCode + ((getStorageCapacity() == null) ? 0 : getStorageCapacity().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceIds() == null) ? 0 : getNetworkInterfaceIds().hashCode());
        hashCode = prime * hashCode + ((getDNSName() == null) ? 0 : getDNSName().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getLustreConfiguration() == null) ? 0 : getLustreConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDataRepositoryAssociationIds() == null) ? 0 : getDataRepositoryAssociationIds().hashCode());
        return hashCode;
    }

    @Override
    public FileCache clone() {
        try {
            return (FileCache) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.FileCacheMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
