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
 * A description of a specific Amazon FSx file system.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/FileSystem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileSystem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services account that created the file system. If the file system was created by an Identity and
     * Access Management (IAM) user, the Amazon Web Services account to which the IAM user belongs is the owner.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The time that the file system was created, in seconds (since 1970-01-01T00:00:00Z), also known as Unix time.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The system-generated, unique 17-digit ID of the file system.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * The type of Amazon FSx file system, which can be <code>LUSTRE</code>, <code>WINDOWS</code>, <code>ONTAP</code>,
     * or <code>OPENZFS</code>.
     * </p>
     */
    private String fileSystemType;
    /**
     * <p>
     * The lifecycle status of the file system. The following are the possible values and what they mean:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The file system is in a healthy state, and is reachable and available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon FSx is creating the new file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon FSx is deleting an existing file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - An existing file system has experienced an unrecoverable failure. When creating a new file
     * system, Amazon FSx was unable to create the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> - The file system is in a failed but recoverable state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED_UNAVAILABLE</code> - (Amazon FSx for Windows File Server only) The file system is currently
     * unavailable due to a change in your Active Directory configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The file system is undergoing a customer-initiated update.
     * </p>
     * </li>
     * </ul>
     */
    private String lifecycle;

    private FileSystemFailureDetails failureDetails;
    /**
     * <p>
     * The storage capacity of the file system in gibibytes (GiB).
     * </p>
     */
    private Integer storageCapacity;
    /**
     * <p>
     * The type of storage the file system is using. If set to <code>SSD</code>, the file system uses solid state drive
     * storage. If set to <code>HDD</code>, the file system uses hard disk drive storage.
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * The ID of the primary virtual private cloud (VPC) for the file system.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * Specifies the IDs of the subnets that the file system is accessible from. For the Amazon FSx Windows and ONTAP
     * <code>MULTI_AZ_1</code> file system deployment type, there are two subnet IDs, one for the preferred file server
     * and one for the standby file server. The preferred file server subnet identified in the
     * <code>PreferredSubnetID</code> property. All other file systems have only one subnet ID.
     * </p>
     * <p>
     * For FSx for Lustre file systems, and Single-AZ Windows file systems, this is the ID of the subnet that contains
     * the file system's endpoint. For <code>MULTI_AZ_1</code> Windows and ONTAP file systems, the file system endpoint
     * is available in the <code>PreferredSubnetID</code>.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * The IDs of the elastic network interfaces from which a specific file system is accessible. The elastic network
     * interface is automatically created in the same virtual private cloud (VPC) that the Amazon FSx file system was
     * created in. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html">Elastic Network Interfaces</a> in the
     * <i>Amazon EC2 User Guide.</i>
     * </p>
     * <p>
     * For an Amazon FSx for Windows File Server file system, you can have one network interface ID. For an Amazon FSx
     * for Lustre file system, you can have more than one.
     * </p>
     */
    private java.util.List<String> networkInterfaceIds;
    /**
     * <p>
     * The Domain Name System (DNS) name for the file system.
     * </p>
     */
    private String dNSName;
    /**
     * <p>
     * The ID of the Key Management Service (KMS) key used to encrypt Amazon FSx file system data. Used as follows with
     * Amazon FSx file system types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon FSx for Lustre <code>PERSISTENT_1</code> and <code>PERSISTENT_2</code> deployment types only.
     * </p>
     * <p>
     * <code>SCRATCH_1</code> and <code>SCRATCH_2</code> types are encrypted using the Amazon FSx service KMS key for
     * your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon FSx for NetApp ONTAP
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon FSx for OpenZFS
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon FSx for Windows File Server
     * </p>
     * </li>
     * </ul>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file system resource.
     * </p>
     */
    private String resourceARN;
    /**
     * <p>
     * The tags to associate with the file system. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging your Amazon EC2 resources</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The configuration for this Amazon FSx for Windows File Server file system.
     * </p>
     */
    private WindowsFileSystemConfiguration windowsConfiguration;

    private LustreFileSystemConfiguration lustreConfiguration;
    /**
     * <p>
     * A list of administrative actions for the file system that are in process or waiting to be processed.
     * Administrative actions describe changes to the Amazon FSx system that you have initiated using the
     * <code>UpdateFileSystem</code> operation.
     * </p>
     */
    private java.util.List<AdministrativeAction> administrativeActions;
    /**
     * <p>
     * The configuration for this Amazon FSx for NetApp ONTAP file system.
     * </p>
     */
    private OntapFileSystemConfiguration ontapConfiguration;
    /**
     * <p>
     * The Lustre version of the Amazon FSx for Lustre file system, either <code>2.10</code> or <code>2.12</code>.
     * </p>
     */
    private String fileSystemTypeVersion;
    /**
     * <p>
     * The configuration for this Amazon FSx for OpenZFS file system.
     * </p>
     */
    private OpenZFSFileSystemConfiguration openZFSConfiguration;

    /**
     * <p>
     * The Amazon Web Services account that created the file system. If the file system was created by an Identity and
     * Access Management (IAM) user, the Amazon Web Services account to which the IAM user belongs is the owner.
     * </p>
     * 
     * @param ownerId
     *        The Amazon Web Services account that created the file system. If the file system was created by an
     *        Identity and Access Management (IAM) user, the Amazon Web Services account to which the IAM user belongs
     *        is the owner.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The Amazon Web Services account that created the file system. If the file system was created by an Identity and
     * Access Management (IAM) user, the Amazon Web Services account to which the IAM user belongs is the owner.
     * </p>
     * 
     * @return The Amazon Web Services account that created the file system. If the file system was created by an
     *         Identity and Access Management (IAM) user, the Amazon Web Services account to which the IAM user belongs
     *         is the owner.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The Amazon Web Services account that created the file system. If the file system was created by an Identity and
     * Access Management (IAM) user, the Amazon Web Services account to which the IAM user belongs is the owner.
     * </p>
     * 
     * @param ownerId
     *        The Amazon Web Services account that created the file system. If the file system was created by an
     *        Identity and Access Management (IAM) user, the Amazon Web Services account to which the IAM user belongs
     *        is the owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The time that the file system was created, in seconds (since 1970-01-01T00:00:00Z), also known as Unix time.
     * </p>
     * 
     * @param creationTime
     *        The time that the file system was created, in seconds (since 1970-01-01T00:00:00Z), also known as Unix
     *        time.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the file system was created, in seconds (since 1970-01-01T00:00:00Z), also known as Unix time.
     * </p>
     * 
     * @return The time that the file system was created, in seconds (since 1970-01-01T00:00:00Z), also known as Unix
     *         time.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that the file system was created, in seconds (since 1970-01-01T00:00:00Z), also known as Unix time.
     * </p>
     * 
     * @param creationTime
     *        The time that the file system was created, in seconds (since 1970-01-01T00:00:00Z), also known as Unix
     *        time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The system-generated, unique 17-digit ID of the file system.
     * </p>
     * 
     * @param fileSystemId
     *        The system-generated, unique 17-digit ID of the file system.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The system-generated, unique 17-digit ID of the file system.
     * </p>
     * 
     * @return The system-generated, unique 17-digit ID of the file system.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The system-generated, unique 17-digit ID of the file system.
     * </p>
     * 
     * @param fileSystemId
     *        The system-generated, unique 17-digit ID of the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * The type of Amazon FSx file system, which can be <code>LUSTRE</code>, <code>WINDOWS</code>, <code>ONTAP</code>,
     * or <code>OPENZFS</code>.
     * </p>
     * 
     * @param fileSystemType
     *        The type of Amazon FSx file system, which can be <code>LUSTRE</code>, <code>WINDOWS</code>,
     *        <code>ONTAP</code>, or <code>OPENZFS</code>.
     * @see FileSystemType
     */

    public void setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
    }

    /**
     * <p>
     * The type of Amazon FSx file system, which can be <code>LUSTRE</code>, <code>WINDOWS</code>, <code>ONTAP</code>,
     * or <code>OPENZFS</code>.
     * </p>
     * 
     * @return The type of Amazon FSx file system, which can be <code>LUSTRE</code>, <code>WINDOWS</code>,
     *         <code>ONTAP</code>, or <code>OPENZFS</code>.
     * @see FileSystemType
     */

    public String getFileSystemType() {
        return this.fileSystemType;
    }

    /**
     * <p>
     * The type of Amazon FSx file system, which can be <code>LUSTRE</code>, <code>WINDOWS</code>, <code>ONTAP</code>,
     * or <code>OPENZFS</code>.
     * </p>
     * 
     * @param fileSystemType
     *        The type of Amazon FSx file system, which can be <code>LUSTRE</code>, <code>WINDOWS</code>,
     *        <code>ONTAP</code>, or <code>OPENZFS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSystemType
     */

    public FileSystem withFileSystemType(String fileSystemType) {
        setFileSystemType(fileSystemType);
        return this;
    }

    /**
     * <p>
     * The type of Amazon FSx file system, which can be <code>LUSTRE</code>, <code>WINDOWS</code>, <code>ONTAP</code>,
     * or <code>OPENZFS</code>.
     * </p>
     * 
     * @param fileSystemType
     *        The type of Amazon FSx file system, which can be <code>LUSTRE</code>, <code>WINDOWS</code>,
     *        <code>ONTAP</code>, or <code>OPENZFS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSystemType
     */

    public FileSystem withFileSystemType(FileSystemType fileSystemType) {
        this.fileSystemType = fileSystemType.toString();
        return this;
    }

    /**
     * <p>
     * The lifecycle status of the file system. The following are the possible values and what they mean:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The file system is in a healthy state, and is reachable and available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon FSx is creating the new file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon FSx is deleting an existing file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - An existing file system has experienced an unrecoverable failure. When creating a new file
     * system, Amazon FSx was unable to create the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> - The file system is in a failed but recoverable state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED_UNAVAILABLE</code> - (Amazon FSx for Windows File Server only) The file system is currently
     * unavailable due to a change in your Active Directory configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The file system is undergoing a customer-initiated update.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lifecycle
     *        The lifecycle status of the file system. The following are the possible values and what they mean:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The file system is in a healthy state, and is reachable and available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - Amazon FSx is creating the new file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - Amazon FSx is deleting an existing file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - An existing file system has experienced an unrecoverable failure. When creating a
     *        new file system, Amazon FSx was unable to create the file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MISCONFIGURED</code> - The file system is in a failed but recoverable state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MISCONFIGURED_UNAVAILABLE</code> - (Amazon FSx for Windows File Server only) The file system is
     *        currently unavailable due to a change in your Active Directory configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The file system is undergoing a customer-initiated update.
     *        </p>
     *        </li>
     * @see FileSystemLifecycle
     */

    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * The lifecycle status of the file system. The following are the possible values and what they mean:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The file system is in a healthy state, and is reachable and available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon FSx is creating the new file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon FSx is deleting an existing file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - An existing file system has experienced an unrecoverable failure. When creating a new file
     * system, Amazon FSx was unable to create the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> - The file system is in a failed but recoverable state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED_UNAVAILABLE</code> - (Amazon FSx for Windows File Server only) The file system is currently
     * unavailable due to a change in your Active Directory configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The file system is undergoing a customer-initiated update.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The lifecycle status of the file system. The following are the possible values and what they mean:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AVAILABLE</code> - The file system is in a healthy state, and is reachable and available for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - Amazon FSx is creating the new file system.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - Amazon FSx is deleting an existing file system.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - An existing file system has experienced an unrecoverable failure. When creating a
     *         new file system, Amazon FSx was unable to create the file system.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MISCONFIGURED</code> - The file system is in a failed but recoverable state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MISCONFIGURED_UNAVAILABLE</code> - (Amazon FSx for Windows File Server only) The file system is
     *         currently unavailable due to a change in your Active Directory configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code> - The file system is undergoing a customer-initiated update.
     *         </p>
     *         </li>
     * @see FileSystemLifecycle
     */

    public String getLifecycle() {
        return this.lifecycle;
    }

    /**
     * <p>
     * The lifecycle status of the file system. The following are the possible values and what they mean:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The file system is in a healthy state, and is reachable and available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon FSx is creating the new file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon FSx is deleting an existing file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - An existing file system has experienced an unrecoverable failure. When creating a new file
     * system, Amazon FSx was unable to create the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> - The file system is in a failed but recoverable state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED_UNAVAILABLE</code> - (Amazon FSx for Windows File Server only) The file system is currently
     * unavailable due to a change in your Active Directory configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The file system is undergoing a customer-initiated update.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lifecycle
     *        The lifecycle status of the file system. The following are the possible values and what they mean:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The file system is in a healthy state, and is reachable and available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - Amazon FSx is creating the new file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - Amazon FSx is deleting an existing file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - An existing file system has experienced an unrecoverable failure. When creating a
     *        new file system, Amazon FSx was unable to create the file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MISCONFIGURED</code> - The file system is in a failed but recoverable state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MISCONFIGURED_UNAVAILABLE</code> - (Amazon FSx for Windows File Server only) The file system is
     *        currently unavailable due to a change in your Active Directory configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The file system is undergoing a customer-initiated update.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSystemLifecycle
     */

    public FileSystem withLifecycle(String lifecycle) {
        setLifecycle(lifecycle);
        return this;
    }

    /**
     * <p>
     * The lifecycle status of the file system. The following are the possible values and what they mean:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The file system is in a healthy state, and is reachable and available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon FSx is creating the new file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon FSx is deleting an existing file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - An existing file system has experienced an unrecoverable failure. When creating a new file
     * system, Amazon FSx was unable to create the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> - The file system is in a failed but recoverable state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED_UNAVAILABLE</code> - (Amazon FSx for Windows File Server only) The file system is currently
     * unavailable due to a change in your Active Directory configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The file system is undergoing a customer-initiated update.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lifecycle
     *        The lifecycle status of the file system. The following are the possible values and what they mean:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The file system is in a healthy state, and is reachable and available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - Amazon FSx is creating the new file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - Amazon FSx is deleting an existing file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - An existing file system has experienced an unrecoverable failure. When creating a
     *        new file system, Amazon FSx was unable to create the file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MISCONFIGURED</code> - The file system is in a failed but recoverable state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MISCONFIGURED_UNAVAILABLE</code> - (Amazon FSx for Windows File Server only) The file system is
     *        currently unavailable due to a change in your Active Directory configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The file system is undergoing a customer-initiated update.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSystemLifecycle
     */

    public FileSystem withLifecycle(FileSystemLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
        return this;
    }

    /**
     * @param failureDetails
     */

    public void setFailureDetails(FileSystemFailureDetails failureDetails) {
        this.failureDetails = failureDetails;
    }

    /**
     * @return
     */

    public FileSystemFailureDetails getFailureDetails() {
        return this.failureDetails;
    }

    /**
     * @param failureDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withFailureDetails(FileSystemFailureDetails failureDetails) {
        setFailureDetails(failureDetails);
        return this;
    }

    /**
     * <p>
     * The storage capacity of the file system in gibibytes (GiB).
     * </p>
     * 
     * @param storageCapacity
     *        The storage capacity of the file system in gibibytes (GiB).
     */

    public void setStorageCapacity(Integer storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    /**
     * <p>
     * The storage capacity of the file system in gibibytes (GiB).
     * </p>
     * 
     * @return The storage capacity of the file system in gibibytes (GiB).
     */

    public Integer getStorageCapacity() {
        return this.storageCapacity;
    }

    /**
     * <p>
     * The storage capacity of the file system in gibibytes (GiB).
     * </p>
     * 
     * @param storageCapacity
     *        The storage capacity of the file system in gibibytes (GiB).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withStorageCapacity(Integer storageCapacity) {
        setStorageCapacity(storageCapacity);
        return this;
    }

    /**
     * <p>
     * The type of storage the file system is using. If set to <code>SSD</code>, the file system uses solid state drive
     * storage. If set to <code>HDD</code>, the file system uses hard disk drive storage.
     * </p>
     * 
     * @param storageType
     *        The type of storage the file system is using. If set to <code>SSD</code>, the file system uses solid state
     *        drive storage. If set to <code>HDD</code>, the file system uses hard disk drive storage.
     * @see StorageType
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * The type of storage the file system is using. If set to <code>SSD</code>, the file system uses solid state drive
     * storage. If set to <code>HDD</code>, the file system uses hard disk drive storage.
     * </p>
     * 
     * @return The type of storage the file system is using. If set to <code>SSD</code>, the file system uses solid
     *         state drive storage. If set to <code>HDD</code>, the file system uses hard disk drive storage.
     * @see StorageType
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * The type of storage the file system is using. If set to <code>SSD</code>, the file system uses solid state drive
     * storage. If set to <code>HDD</code>, the file system uses hard disk drive storage.
     * </p>
     * 
     * @param storageType
     *        The type of storage the file system is using. If set to <code>SSD</code>, the file system uses solid state
     *        drive storage. If set to <code>HDD</code>, the file system uses hard disk drive storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageType
     */

    public FileSystem withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * The type of storage the file system is using. If set to <code>SSD</code>, the file system uses solid state drive
     * storage. If set to <code>HDD</code>, the file system uses hard disk drive storage.
     * </p>
     * 
     * @param storageType
     *        The type of storage the file system is using. If set to <code>SSD</code>, the file system uses solid state
     *        drive storage. If set to <code>HDD</code>, the file system uses hard disk drive storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageType
     */

    public FileSystem withStorageType(StorageType storageType) {
        this.storageType = storageType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the primary virtual private cloud (VPC) for the file system.
     * </p>
     * 
     * @param vpcId
     *        The ID of the primary virtual private cloud (VPC) for the file system.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the primary virtual private cloud (VPC) for the file system.
     * </p>
     * 
     * @return The ID of the primary virtual private cloud (VPC) for the file system.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the primary virtual private cloud (VPC) for the file system.
     * </p>
     * 
     * @param vpcId
     *        The ID of the primary virtual private cloud (VPC) for the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * Specifies the IDs of the subnets that the file system is accessible from. For the Amazon FSx Windows and ONTAP
     * <code>MULTI_AZ_1</code> file system deployment type, there are two subnet IDs, one for the preferred file server
     * and one for the standby file server. The preferred file server subnet identified in the
     * <code>PreferredSubnetID</code> property. All other file systems have only one subnet ID.
     * </p>
     * <p>
     * For FSx for Lustre file systems, and Single-AZ Windows file systems, this is the ID of the subnet that contains
     * the file system's endpoint. For <code>MULTI_AZ_1</code> Windows and ONTAP file systems, the file system endpoint
     * is available in the <code>PreferredSubnetID</code>.
     * </p>
     * 
     * @return Specifies the IDs of the subnets that the file system is accessible from. For the Amazon FSx Windows and
     *         ONTAP <code>MULTI_AZ_1</code> file system deployment type, there are two subnet IDs, one for the
     *         preferred file server and one for the standby file server. The preferred file server subnet identified in
     *         the <code>PreferredSubnetID</code> property. All other file systems have only one subnet ID.</p>
     *         <p>
     *         For FSx for Lustre file systems, and Single-AZ Windows file systems, this is the ID of the subnet that
     *         contains the file system's endpoint. For <code>MULTI_AZ_1</code> Windows and ONTAP file systems, the file
     *         system endpoint is available in the <code>PreferredSubnetID</code>.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * Specifies the IDs of the subnets that the file system is accessible from. For the Amazon FSx Windows and ONTAP
     * <code>MULTI_AZ_1</code> file system deployment type, there are two subnet IDs, one for the preferred file server
     * and one for the standby file server. The preferred file server subnet identified in the
     * <code>PreferredSubnetID</code> property. All other file systems have only one subnet ID.
     * </p>
     * <p>
     * For FSx for Lustre file systems, and Single-AZ Windows file systems, this is the ID of the subnet that contains
     * the file system's endpoint. For <code>MULTI_AZ_1</code> Windows and ONTAP file systems, the file system endpoint
     * is available in the <code>PreferredSubnetID</code>.
     * </p>
     * 
     * @param subnetIds
     *        Specifies the IDs of the subnets that the file system is accessible from. For the Amazon FSx Windows and
     *        ONTAP <code>MULTI_AZ_1</code> file system deployment type, there are two subnet IDs, one for the preferred
     *        file server and one for the standby file server. The preferred file server subnet identified in the
     *        <code>PreferredSubnetID</code> property. All other file systems have only one subnet ID.</p>
     *        <p>
     *        For FSx for Lustre file systems, and Single-AZ Windows file systems, this is the ID of the subnet that
     *        contains the file system's endpoint. For <code>MULTI_AZ_1</code> Windows and ONTAP file systems, the file
     *        system endpoint is available in the <code>PreferredSubnetID</code>.
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
     * Specifies the IDs of the subnets that the file system is accessible from. For the Amazon FSx Windows and ONTAP
     * <code>MULTI_AZ_1</code> file system deployment type, there are two subnet IDs, one for the preferred file server
     * and one for the standby file server. The preferred file server subnet identified in the
     * <code>PreferredSubnetID</code> property. All other file systems have only one subnet ID.
     * </p>
     * <p>
     * For FSx for Lustre file systems, and Single-AZ Windows file systems, this is the ID of the subnet that contains
     * the file system's endpoint. For <code>MULTI_AZ_1</code> Windows and ONTAP file systems, the file system endpoint
     * is available in the <code>PreferredSubnetID</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        Specifies the IDs of the subnets that the file system is accessible from. For the Amazon FSx Windows and
     *        ONTAP <code>MULTI_AZ_1</code> file system deployment type, there are two subnet IDs, one for the preferred
     *        file server and one for the standby file server. The preferred file server subnet identified in the
     *        <code>PreferredSubnetID</code> property. All other file systems have only one subnet ID.</p>
     *        <p>
     *        For FSx for Lustre file systems, and Single-AZ Windows file systems, this is the ID of the subnet that
     *        contains the file system's endpoint. For <code>MULTI_AZ_1</code> Windows and ONTAP file systems, the file
     *        system endpoint is available in the <code>PreferredSubnetID</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the IDs of the subnets that the file system is accessible from. For the Amazon FSx Windows and ONTAP
     * <code>MULTI_AZ_1</code> file system deployment type, there are two subnet IDs, one for the preferred file server
     * and one for the standby file server. The preferred file server subnet identified in the
     * <code>PreferredSubnetID</code> property. All other file systems have only one subnet ID.
     * </p>
     * <p>
     * For FSx for Lustre file systems, and Single-AZ Windows file systems, this is the ID of the subnet that contains
     * the file system's endpoint. For <code>MULTI_AZ_1</code> Windows and ONTAP file systems, the file system endpoint
     * is available in the <code>PreferredSubnetID</code>.
     * </p>
     * 
     * @param subnetIds
     *        Specifies the IDs of the subnets that the file system is accessible from. For the Amazon FSx Windows and
     *        ONTAP <code>MULTI_AZ_1</code> file system deployment type, there are two subnet IDs, one for the preferred
     *        file server and one for the standby file server. The preferred file server subnet identified in the
     *        <code>PreferredSubnetID</code> property. All other file systems have only one subnet ID.</p>
     *        <p>
     *        For FSx for Lustre file systems, and Single-AZ Windows file systems, this is the ID of the subnet that
     *        contains the file system's endpoint. For <code>MULTI_AZ_1</code> Windows and ONTAP file systems, the file
     *        system endpoint is available in the <code>PreferredSubnetID</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The IDs of the elastic network interfaces from which a specific file system is accessible. The elastic network
     * interface is automatically created in the same virtual private cloud (VPC) that the Amazon FSx file system was
     * created in. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html">Elastic Network Interfaces</a> in the
     * <i>Amazon EC2 User Guide.</i>
     * </p>
     * <p>
     * For an Amazon FSx for Windows File Server file system, you can have one network interface ID. For an Amazon FSx
     * for Lustre file system, you can have more than one.
     * </p>
     * 
     * @return The IDs of the elastic network interfaces from which a specific file system is accessible. The elastic
     *         network interface is automatically created in the same virtual private cloud (VPC) that the Amazon FSx
     *         file system was created in. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html">Elastic Network Interfaces</a>
     *         in the <i>Amazon EC2 User Guide.</i> </p>
     *         <p>
     *         For an Amazon FSx for Windows File Server file system, you can have one network interface ID. For an
     *         Amazon FSx for Lustre file system, you can have more than one.
     */

    public java.util.List<String> getNetworkInterfaceIds() {
        return networkInterfaceIds;
    }

    /**
     * <p>
     * The IDs of the elastic network interfaces from which a specific file system is accessible. The elastic network
     * interface is automatically created in the same virtual private cloud (VPC) that the Amazon FSx file system was
     * created in. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html">Elastic Network Interfaces</a> in the
     * <i>Amazon EC2 User Guide.</i>
     * </p>
     * <p>
     * For an Amazon FSx for Windows File Server file system, you can have one network interface ID. For an Amazon FSx
     * for Lustre file system, you can have more than one.
     * </p>
     * 
     * @param networkInterfaceIds
     *        The IDs of the elastic network interfaces from which a specific file system is accessible. The elastic
     *        network interface is automatically created in the same virtual private cloud (VPC) that the Amazon FSx
     *        file system was created in. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html">Elastic Network Interfaces</a>
     *        in the <i>Amazon EC2 User Guide.</i> </p>
     *        <p>
     *        For an Amazon FSx for Windows File Server file system, you can have one network interface ID. For an
     *        Amazon FSx for Lustre file system, you can have more than one.
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
     * The IDs of the elastic network interfaces from which a specific file system is accessible. The elastic network
     * interface is automatically created in the same virtual private cloud (VPC) that the Amazon FSx file system was
     * created in. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html">Elastic Network Interfaces</a> in the
     * <i>Amazon EC2 User Guide.</i>
     * </p>
     * <p>
     * For an Amazon FSx for Windows File Server file system, you can have one network interface ID. For an Amazon FSx
     * for Lustre file system, you can have more than one.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfaceIds(java.util.Collection)} or {@link #withNetworkInterfaceIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param networkInterfaceIds
     *        The IDs of the elastic network interfaces from which a specific file system is accessible. The elastic
     *        network interface is automatically created in the same virtual private cloud (VPC) that the Amazon FSx
     *        file system was created in. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html">Elastic Network Interfaces</a>
     *        in the <i>Amazon EC2 User Guide.</i> </p>
     *        <p>
     *        For an Amazon FSx for Windows File Server file system, you can have one network interface ID. For an
     *        Amazon FSx for Lustre file system, you can have more than one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withNetworkInterfaceIds(String... networkInterfaceIds) {
        if (this.networkInterfaceIds == null) {
            setNetworkInterfaceIds(new java.util.ArrayList<String>(networkInterfaceIds.length));
        }
        for (String ele : networkInterfaceIds) {
            this.networkInterfaceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the elastic network interfaces from which a specific file system is accessible. The elastic network
     * interface is automatically created in the same virtual private cloud (VPC) that the Amazon FSx file system was
     * created in. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html">Elastic Network Interfaces</a> in the
     * <i>Amazon EC2 User Guide.</i>
     * </p>
     * <p>
     * For an Amazon FSx for Windows File Server file system, you can have one network interface ID. For an Amazon FSx
     * for Lustre file system, you can have more than one.
     * </p>
     * 
     * @param networkInterfaceIds
     *        The IDs of the elastic network interfaces from which a specific file system is accessible. The elastic
     *        network interface is automatically created in the same virtual private cloud (VPC) that the Amazon FSx
     *        file system was created in. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html">Elastic Network Interfaces</a>
     *        in the <i>Amazon EC2 User Guide.</i> </p>
     *        <p>
     *        For an Amazon FSx for Windows File Server file system, you can have one network interface ID. For an
     *        Amazon FSx for Lustre file system, you can have more than one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withNetworkInterfaceIds(java.util.Collection<String> networkInterfaceIds) {
        setNetworkInterfaceIds(networkInterfaceIds);
        return this;
    }

    /**
     * <p>
     * The Domain Name System (DNS) name for the file system.
     * </p>
     * 
     * @param dNSName
     *        The Domain Name System (DNS) name for the file system.
     */

    public void setDNSName(String dNSName) {
        this.dNSName = dNSName;
    }

    /**
     * <p>
     * The Domain Name System (DNS) name for the file system.
     * </p>
     * 
     * @return The Domain Name System (DNS) name for the file system.
     */

    public String getDNSName() {
        return this.dNSName;
    }

    /**
     * <p>
     * The Domain Name System (DNS) name for the file system.
     * </p>
     * 
     * @param dNSName
     *        The Domain Name System (DNS) name for the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withDNSName(String dNSName) {
        setDNSName(dNSName);
        return this;
    }

    /**
     * <p>
     * The ID of the Key Management Service (KMS) key used to encrypt Amazon FSx file system data. Used as follows with
     * Amazon FSx file system types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon FSx for Lustre <code>PERSISTENT_1</code> and <code>PERSISTENT_2</code> deployment types only.
     * </p>
     * <p>
     * <code>SCRATCH_1</code> and <code>SCRATCH_2</code> types are encrypted using the Amazon FSx service KMS key for
     * your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon FSx for NetApp ONTAP
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon FSx for OpenZFS
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon FSx for Windows File Server
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        The ID of the Key Management Service (KMS) key used to encrypt Amazon FSx file system data. Used as
     *        follows with Amazon FSx file system types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Amazon FSx for Lustre <code>PERSISTENT_1</code> and <code>PERSISTENT_2</code> deployment types only.
     *        </p>
     *        <p>
     *        <code>SCRATCH_1</code> and <code>SCRATCH_2</code> types are encrypted using the Amazon FSx service KMS key
     *        for your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon FSx for NetApp ONTAP
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon FSx for OpenZFS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon FSx for Windows File Server
     *        </p>
     *        </li>
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the Key Management Service (KMS) key used to encrypt Amazon FSx file system data. Used as follows with
     * Amazon FSx file system types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon FSx for Lustre <code>PERSISTENT_1</code> and <code>PERSISTENT_2</code> deployment types only.
     * </p>
     * <p>
     * <code>SCRATCH_1</code> and <code>SCRATCH_2</code> types are encrypted using the Amazon FSx service KMS key for
     * your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon FSx for NetApp ONTAP
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon FSx for OpenZFS
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon FSx for Windows File Server
     * </p>
     * </li>
     * </ul>
     * 
     * @return The ID of the Key Management Service (KMS) key used to encrypt Amazon FSx file system data. Used as
     *         follows with Amazon FSx file system types:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Amazon FSx for Lustre <code>PERSISTENT_1</code> and <code>PERSISTENT_2</code> deployment types only.
     *         </p>
     *         <p>
     *         <code>SCRATCH_1</code> and <code>SCRATCH_2</code> types are encrypted using the Amazon FSx service KMS
     *         key for your account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon FSx for NetApp ONTAP
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon FSx for OpenZFS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon FSx for Windows File Server
     *         </p>
     *         </li>
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ID of the Key Management Service (KMS) key used to encrypt Amazon FSx file system data. Used as follows with
     * Amazon FSx file system types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon FSx for Lustre <code>PERSISTENT_1</code> and <code>PERSISTENT_2</code> deployment types only.
     * </p>
     * <p>
     * <code>SCRATCH_1</code> and <code>SCRATCH_2</code> types are encrypted using the Amazon FSx service KMS key for
     * your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon FSx for NetApp ONTAP
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon FSx for OpenZFS
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon FSx for Windows File Server
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        The ID of the Key Management Service (KMS) key used to encrypt Amazon FSx file system data. Used as
     *        follows with Amazon FSx file system types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Amazon FSx for Lustre <code>PERSISTENT_1</code> and <code>PERSISTENT_2</code> deployment types only.
     *        </p>
     *        <p>
     *        <code>SCRATCH_1</code> and <code>SCRATCH_2</code> types are encrypted using the Amazon FSx service KMS key
     *        for your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon FSx for NetApp ONTAP
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon FSx for OpenZFS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon FSx for Windows File Server
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file system resource.
     * </p>
     * 
     * @param resourceARN
     *        The Amazon Resource Name (ARN) of the file system resource.
     */

    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file system resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the file system resource.
     */

    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file system resource.
     * </p>
     * 
     * @param resourceARN
     *        The Amazon Resource Name (ARN) of the file system resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
        return this;
    }

    /**
     * <p>
     * The tags to associate with the file system. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging your Amazon EC2 resources</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @return The tags to associate with the file system. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging your Amazon EC2
     *         resources</a> in the <i>Amazon EC2 User Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to associate with the file system. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging your Amazon EC2 resources</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param tags
     *        The tags to associate with the file system. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging your Amazon EC2
     *        resources</a> in the <i>Amazon EC2 User Guide</i>.
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
     * The tags to associate with the file system. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging your Amazon EC2 resources</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to associate with the file system. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging your Amazon EC2
     *        resources</a> in the <i>Amazon EC2 User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to associate with the file system. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging your Amazon EC2 resources</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param tags
     *        The tags to associate with the file system. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging your Amazon EC2
     *        resources</a> in the <i>Amazon EC2 User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The configuration for this Amazon FSx for Windows File Server file system.
     * </p>
     * 
     * @param windowsConfiguration
     *        The configuration for this Amazon FSx for Windows File Server file system.
     */

    public void setWindowsConfiguration(WindowsFileSystemConfiguration windowsConfiguration) {
        this.windowsConfiguration = windowsConfiguration;
    }

    /**
     * <p>
     * The configuration for this Amazon FSx for Windows File Server file system.
     * </p>
     * 
     * @return The configuration for this Amazon FSx for Windows File Server file system.
     */

    public WindowsFileSystemConfiguration getWindowsConfiguration() {
        return this.windowsConfiguration;
    }

    /**
     * <p>
     * The configuration for this Amazon FSx for Windows File Server file system.
     * </p>
     * 
     * @param windowsConfiguration
     *        The configuration for this Amazon FSx for Windows File Server file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withWindowsConfiguration(WindowsFileSystemConfiguration windowsConfiguration) {
        setWindowsConfiguration(windowsConfiguration);
        return this;
    }

    /**
     * @param lustreConfiguration
     */

    public void setLustreConfiguration(LustreFileSystemConfiguration lustreConfiguration) {
        this.lustreConfiguration = lustreConfiguration;
    }

    /**
     * @return
     */

    public LustreFileSystemConfiguration getLustreConfiguration() {
        return this.lustreConfiguration;
    }

    /**
     * @param lustreConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withLustreConfiguration(LustreFileSystemConfiguration lustreConfiguration) {
        setLustreConfiguration(lustreConfiguration);
        return this;
    }

    /**
     * <p>
     * A list of administrative actions for the file system that are in process or waiting to be processed.
     * Administrative actions describe changes to the Amazon FSx system that you have initiated using the
     * <code>UpdateFileSystem</code> operation.
     * </p>
     * 
     * @return A list of administrative actions for the file system that are in process or waiting to be processed.
     *         Administrative actions describe changes to the Amazon FSx system that you have initiated using the
     *         <code>UpdateFileSystem</code> operation.
     */

    public java.util.List<AdministrativeAction> getAdministrativeActions() {
        return administrativeActions;
    }

    /**
     * <p>
     * A list of administrative actions for the file system that are in process or waiting to be processed.
     * Administrative actions describe changes to the Amazon FSx system that you have initiated using the
     * <code>UpdateFileSystem</code> operation.
     * </p>
     * 
     * @param administrativeActions
     *        A list of administrative actions for the file system that are in process or waiting to be processed.
     *        Administrative actions describe changes to the Amazon FSx system that you have initiated using the
     *        <code>UpdateFileSystem</code> operation.
     */

    public void setAdministrativeActions(java.util.Collection<AdministrativeAction> administrativeActions) {
        if (administrativeActions == null) {
            this.administrativeActions = null;
            return;
        }

        this.administrativeActions = new java.util.ArrayList<AdministrativeAction>(administrativeActions);
    }

    /**
     * <p>
     * A list of administrative actions for the file system that are in process or waiting to be processed.
     * Administrative actions describe changes to the Amazon FSx system that you have initiated using the
     * <code>UpdateFileSystem</code> operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdministrativeActions(java.util.Collection)} or
     * {@link #withAdministrativeActions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param administrativeActions
     *        A list of administrative actions for the file system that are in process or waiting to be processed.
     *        Administrative actions describe changes to the Amazon FSx system that you have initiated using the
     *        <code>UpdateFileSystem</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withAdministrativeActions(AdministrativeAction... administrativeActions) {
        if (this.administrativeActions == null) {
            setAdministrativeActions(new java.util.ArrayList<AdministrativeAction>(administrativeActions.length));
        }
        for (AdministrativeAction ele : administrativeActions) {
            this.administrativeActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of administrative actions for the file system that are in process or waiting to be processed.
     * Administrative actions describe changes to the Amazon FSx system that you have initiated using the
     * <code>UpdateFileSystem</code> operation.
     * </p>
     * 
     * @param administrativeActions
     *        A list of administrative actions for the file system that are in process or waiting to be processed.
     *        Administrative actions describe changes to the Amazon FSx system that you have initiated using the
     *        <code>UpdateFileSystem</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withAdministrativeActions(java.util.Collection<AdministrativeAction> administrativeActions) {
        setAdministrativeActions(administrativeActions);
        return this;
    }

    /**
     * <p>
     * The configuration for this Amazon FSx for NetApp ONTAP file system.
     * </p>
     * 
     * @param ontapConfiguration
     *        The configuration for this Amazon FSx for NetApp ONTAP file system.
     */

    public void setOntapConfiguration(OntapFileSystemConfiguration ontapConfiguration) {
        this.ontapConfiguration = ontapConfiguration;
    }

    /**
     * <p>
     * The configuration for this Amazon FSx for NetApp ONTAP file system.
     * </p>
     * 
     * @return The configuration for this Amazon FSx for NetApp ONTAP file system.
     */

    public OntapFileSystemConfiguration getOntapConfiguration() {
        return this.ontapConfiguration;
    }

    /**
     * <p>
     * The configuration for this Amazon FSx for NetApp ONTAP file system.
     * </p>
     * 
     * @param ontapConfiguration
     *        The configuration for this Amazon FSx for NetApp ONTAP file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withOntapConfiguration(OntapFileSystemConfiguration ontapConfiguration) {
        setOntapConfiguration(ontapConfiguration);
        return this;
    }

    /**
     * <p>
     * The Lustre version of the Amazon FSx for Lustre file system, either <code>2.10</code> or <code>2.12</code>.
     * </p>
     * 
     * @param fileSystemTypeVersion
     *        The Lustre version of the Amazon FSx for Lustre file system, either <code>2.10</code> or <code>2.12</code>
     *        .
     */

    public void setFileSystemTypeVersion(String fileSystemTypeVersion) {
        this.fileSystemTypeVersion = fileSystemTypeVersion;
    }

    /**
     * <p>
     * The Lustre version of the Amazon FSx for Lustre file system, either <code>2.10</code> or <code>2.12</code>.
     * </p>
     * 
     * @return The Lustre version of the Amazon FSx for Lustre file system, either <code>2.10</code> or
     *         <code>2.12</code>.
     */

    public String getFileSystemTypeVersion() {
        return this.fileSystemTypeVersion;
    }

    /**
     * <p>
     * The Lustre version of the Amazon FSx for Lustre file system, either <code>2.10</code> or <code>2.12</code>.
     * </p>
     * 
     * @param fileSystemTypeVersion
     *        The Lustre version of the Amazon FSx for Lustre file system, either <code>2.10</code> or <code>2.12</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withFileSystemTypeVersion(String fileSystemTypeVersion) {
        setFileSystemTypeVersion(fileSystemTypeVersion);
        return this;
    }

    /**
     * <p>
     * The configuration for this Amazon FSx for OpenZFS file system.
     * </p>
     * 
     * @param openZFSConfiguration
     *        The configuration for this Amazon FSx for OpenZFS file system.
     */

    public void setOpenZFSConfiguration(OpenZFSFileSystemConfiguration openZFSConfiguration) {
        this.openZFSConfiguration = openZFSConfiguration;
    }

    /**
     * <p>
     * The configuration for this Amazon FSx for OpenZFS file system.
     * </p>
     * 
     * @return The configuration for this Amazon FSx for OpenZFS file system.
     */

    public OpenZFSFileSystemConfiguration getOpenZFSConfiguration() {
        return this.openZFSConfiguration;
    }

    /**
     * <p>
     * The configuration for this Amazon FSx for OpenZFS file system.
     * </p>
     * 
     * @param openZFSConfiguration
     *        The configuration for this Amazon FSx for OpenZFS file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withOpenZFSConfiguration(OpenZFSFileSystemConfiguration openZFSConfiguration) {
        setOpenZFSConfiguration(openZFSConfiguration);
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
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
        if (getFileSystemType() != null)
            sb.append("FileSystemType: ").append(getFileSystemType()).append(",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: ").append(getLifecycle()).append(",");
        if (getFailureDetails() != null)
            sb.append("FailureDetails: ").append(getFailureDetails()).append(",");
        if (getStorageCapacity() != null)
            sb.append("StorageCapacity: ").append(getStorageCapacity()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
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
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getWindowsConfiguration() != null)
            sb.append("WindowsConfiguration: ").append(getWindowsConfiguration()).append(",");
        if (getLustreConfiguration() != null)
            sb.append("LustreConfiguration: ").append(getLustreConfiguration()).append(",");
        if (getAdministrativeActions() != null)
            sb.append("AdministrativeActions: ").append(getAdministrativeActions()).append(",");
        if (getOntapConfiguration() != null)
            sb.append("OntapConfiguration: ").append(getOntapConfiguration()).append(",");
        if (getFileSystemTypeVersion() != null)
            sb.append("FileSystemTypeVersion: ").append(getFileSystemTypeVersion()).append(",");
        if (getOpenZFSConfiguration() != null)
            sb.append("OpenZFSConfiguration: ").append(getOpenZFSConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileSystem == false)
            return false;
        FileSystem other = (FileSystem) obj;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getFileSystemType() == null ^ this.getFileSystemType() == null)
            return false;
        if (other.getFileSystemType() != null && other.getFileSystemType().equals(this.getFileSystemType()) == false)
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
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getWindowsConfiguration() == null ^ this.getWindowsConfiguration() == null)
            return false;
        if (other.getWindowsConfiguration() != null && other.getWindowsConfiguration().equals(this.getWindowsConfiguration()) == false)
            return false;
        if (other.getLustreConfiguration() == null ^ this.getLustreConfiguration() == null)
            return false;
        if (other.getLustreConfiguration() != null && other.getLustreConfiguration().equals(this.getLustreConfiguration()) == false)
            return false;
        if (other.getAdministrativeActions() == null ^ this.getAdministrativeActions() == null)
            return false;
        if (other.getAdministrativeActions() != null && other.getAdministrativeActions().equals(this.getAdministrativeActions()) == false)
            return false;
        if (other.getOntapConfiguration() == null ^ this.getOntapConfiguration() == null)
            return false;
        if (other.getOntapConfiguration() != null && other.getOntapConfiguration().equals(this.getOntapConfiguration()) == false)
            return false;
        if (other.getFileSystemTypeVersion() == null ^ this.getFileSystemTypeVersion() == null)
            return false;
        if (other.getFileSystemTypeVersion() != null && other.getFileSystemTypeVersion().equals(this.getFileSystemTypeVersion()) == false)
            return false;
        if (other.getOpenZFSConfiguration() == null ^ this.getOpenZFSConfiguration() == null)
            return false;
        if (other.getOpenZFSConfiguration() != null && other.getOpenZFSConfiguration().equals(this.getOpenZFSConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getFileSystemType() == null) ? 0 : getFileSystemType().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode + ((getFailureDetails() == null) ? 0 : getFailureDetails().hashCode());
        hashCode = prime * hashCode + ((getStorageCapacity() == null) ? 0 : getStorageCapacity().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceIds() == null) ? 0 : getNetworkInterfaceIds().hashCode());
        hashCode = prime * hashCode + ((getDNSName() == null) ? 0 : getDNSName().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getWindowsConfiguration() == null) ? 0 : getWindowsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLustreConfiguration() == null) ? 0 : getLustreConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAdministrativeActions() == null) ? 0 : getAdministrativeActions().hashCode());
        hashCode = prime * hashCode + ((getOntapConfiguration() == null) ? 0 : getOntapConfiguration().hashCode());
        hashCode = prime * hashCode + ((getFileSystemTypeVersion() == null) ? 0 : getFileSystemTypeVersion().hashCode());
        hashCode = prime * hashCode + ((getOpenZFSConfiguration() == null) ? 0 : getOpenZFSConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public FileSystem clone() {
        try {
            return (FileSystem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.FileSystemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
