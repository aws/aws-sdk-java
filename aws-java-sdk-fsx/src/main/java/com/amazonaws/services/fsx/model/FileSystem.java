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
     * The AWS account that created the file system. If the file system was created by an IAM user, the AWS account to
     * which the IAM user belongs is the owner.
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
     * The eight-digit ID of the file system that was automatically assigned by Amazon FSx.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * Type of file system. Currently the only supported type is WINDOWS.
     * </p>
     */
    private String fileSystemType;
    /**
     * <p>
     * The lifecycle status of the file system.
     * </p>
     */
    private String lifecycle;

    private FileSystemFailureDetails failureDetails;
    /**
     * <p>
     * The storage capacity of the file system in gigabytes.
     * </p>
     */
    private Integer storageCapacity;
    /**
     * <p>
     * The ID of the primary VPC for the file system.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The IDs of the subnets to contain the endpoint for the file system. One and only one is supported. The file
     * system is launched in the Availability Zone associated with this subnet.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * The IDs of the elastic network interface from which a specific file system is accessible. The elastic network
     * interface is automatically created in the same VPC that the Amazon FSx file system was created in. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html">Elastic Network
     * Interfaces</a> in the <i>Amazon EC2 User Guide.</i>
     * </p>
     * <p>
     * For an Amazon FSx for Windows File Server file system, you can have one network interface Id. For an Amazon FSx
     * for Lustre file system, you can have more than one.
     * </p>
     */
    private java.util.List<String> networkInterfaceIds;
    /**
     * <p>
     * The DNS name for the file system.
     * </p>
     */
    private String dNSName;
    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt the file system's data for an Amazon FSx
     * for Windows File Server file system.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The resource ARN of the file system.
     * </p>
     */
    private String resourceARN;
    /**
     * <p>
     * The tags to associate with the file system. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging Your Amazon EC2 Resources</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The configuration for this Microsoft Windows file system.
     * </p>
     */
    private WindowsFileSystemConfiguration windowsConfiguration;

    private LustreFileSystemConfiguration lustreConfiguration;

    /**
     * <p>
     * The AWS account that created the file system. If the file system was created by an IAM user, the AWS account to
     * which the IAM user belongs is the owner.
     * </p>
     * 
     * @param ownerId
     *        The AWS account that created the file system. If the file system was created by an IAM user, the AWS
     *        account to which the IAM user belongs is the owner.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The AWS account that created the file system. If the file system was created by an IAM user, the AWS account to
     * which the IAM user belongs is the owner.
     * </p>
     * 
     * @return The AWS account that created the file system. If the file system was created by an IAM user, the AWS
     *         account to which the IAM user belongs is the owner.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The AWS account that created the file system. If the file system was created by an IAM user, the AWS account to
     * which the IAM user belongs is the owner.
     * </p>
     * 
     * @param ownerId
     *        The AWS account that created the file system. If the file system was created by an IAM user, the AWS
     *        account to which the IAM user belongs is the owner.
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
     * The eight-digit ID of the file system that was automatically assigned by Amazon FSx.
     * </p>
     * 
     * @param fileSystemId
     *        The eight-digit ID of the file system that was automatically assigned by Amazon FSx.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The eight-digit ID of the file system that was automatically assigned by Amazon FSx.
     * </p>
     * 
     * @return The eight-digit ID of the file system that was automatically assigned by Amazon FSx.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The eight-digit ID of the file system that was automatically assigned by Amazon FSx.
     * </p>
     * 
     * @param fileSystemId
     *        The eight-digit ID of the file system that was automatically assigned by Amazon FSx.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * Type of file system. Currently the only supported type is WINDOWS.
     * </p>
     * 
     * @param fileSystemType
     *        Type of file system. Currently the only supported type is WINDOWS.
     * @see FileSystemType
     */

    public void setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
    }

    /**
     * <p>
     * Type of file system. Currently the only supported type is WINDOWS.
     * </p>
     * 
     * @return Type of file system. Currently the only supported type is WINDOWS.
     * @see FileSystemType
     */

    public String getFileSystemType() {
        return this.fileSystemType;
    }

    /**
     * <p>
     * Type of file system. Currently the only supported type is WINDOWS.
     * </p>
     * 
     * @param fileSystemType
     *        Type of file system. Currently the only supported type is WINDOWS.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSystemType
     */

    public FileSystem withFileSystemType(String fileSystemType) {
        setFileSystemType(fileSystemType);
        return this;
    }

    /**
     * <p>
     * Type of file system. Currently the only supported type is WINDOWS.
     * </p>
     * 
     * @param fileSystemType
     *        Type of file system. Currently the only supported type is WINDOWS.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSystemType
     */

    public FileSystem withFileSystemType(FileSystemType fileSystemType) {
        this.fileSystemType = fileSystemType.toString();
        return this;
    }

    /**
     * <p>
     * The lifecycle status of the file system.
     * </p>
     * 
     * @param lifecycle
     *        The lifecycle status of the file system.
     * @see FileSystemLifecycle
     */

    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * The lifecycle status of the file system.
     * </p>
     * 
     * @return The lifecycle status of the file system.
     * @see FileSystemLifecycle
     */

    public String getLifecycle() {
        return this.lifecycle;
    }

    /**
     * <p>
     * The lifecycle status of the file system.
     * </p>
     * 
     * @param lifecycle
     *        The lifecycle status of the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSystemLifecycle
     */

    public FileSystem withLifecycle(String lifecycle) {
        setLifecycle(lifecycle);
        return this;
    }

    /**
     * <p>
     * The lifecycle status of the file system.
     * </p>
     * 
     * @param lifecycle
     *        The lifecycle status of the file system.
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
     * The storage capacity of the file system in gigabytes.
     * </p>
     * 
     * @param storageCapacity
     *        The storage capacity of the file system in gigabytes.
     */

    public void setStorageCapacity(Integer storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    /**
     * <p>
     * The storage capacity of the file system in gigabytes.
     * </p>
     * 
     * @return The storage capacity of the file system in gigabytes.
     */

    public Integer getStorageCapacity() {
        return this.storageCapacity;
    }

    /**
     * <p>
     * The storage capacity of the file system in gigabytes.
     * </p>
     * 
     * @param storageCapacity
     *        The storage capacity of the file system in gigabytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withStorageCapacity(Integer storageCapacity) {
        setStorageCapacity(storageCapacity);
        return this;
    }

    /**
     * <p>
     * The ID of the primary VPC for the file system.
     * </p>
     * 
     * @param vpcId
     *        The ID of the primary VPC for the file system.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the primary VPC for the file system.
     * </p>
     * 
     * @return The ID of the primary VPC for the file system.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the primary VPC for the file system.
     * </p>
     * 
     * @param vpcId
     *        The ID of the primary VPC for the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The IDs of the subnets to contain the endpoint for the file system. One and only one is supported. The file
     * system is launched in the Availability Zone associated with this subnet.
     * </p>
     * 
     * @return The IDs of the subnets to contain the endpoint for the file system. One and only one is supported. The
     *         file system is launched in the Availability Zone associated with this subnet.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The IDs of the subnets to contain the endpoint for the file system. One and only one is supported. The file
     * system is launched in the Availability Zone associated with this subnet.
     * </p>
     * 
     * @param subnetIds
     *        The IDs of the subnets to contain the endpoint for the file system. One and only one is supported. The
     *        file system is launched in the Availability Zone associated with this subnet.
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
     * The IDs of the subnets to contain the endpoint for the file system. One and only one is supported. The file
     * system is launched in the Availability Zone associated with this subnet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The IDs of the subnets to contain the endpoint for the file system. One and only one is supported. The
     *        file system is launched in the Availability Zone associated with this subnet.
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
     * The IDs of the subnets to contain the endpoint for the file system. One and only one is supported. The file
     * system is launched in the Availability Zone associated with this subnet.
     * </p>
     * 
     * @param subnetIds
     *        The IDs of the subnets to contain the endpoint for the file system. One and only one is supported. The
     *        file system is launched in the Availability Zone associated with this subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The IDs of the elastic network interface from which a specific file system is accessible. The elastic network
     * interface is automatically created in the same VPC that the Amazon FSx file system was created in. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html">Elastic Network
     * Interfaces</a> in the <i>Amazon EC2 User Guide.</i>
     * </p>
     * <p>
     * For an Amazon FSx for Windows File Server file system, you can have one network interface Id. For an Amazon FSx
     * for Lustre file system, you can have more than one.
     * </p>
     * 
     * @return The IDs of the elastic network interface from which a specific file system is accessible. The elastic
     *         network interface is automatically created in the same VPC that the Amazon FSx file system was created
     *         in. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html">Elastic Network Interfaces</a>
     *         in the <i>Amazon EC2 User Guide.</i> </p>
     *         <p>
     *         For an Amazon FSx for Windows File Server file system, you can have one network interface Id. For an
     *         Amazon FSx for Lustre file system, you can have more than one.
     */

    public java.util.List<String> getNetworkInterfaceIds() {
        return networkInterfaceIds;
    }

    /**
     * <p>
     * The IDs of the elastic network interface from which a specific file system is accessible. The elastic network
     * interface is automatically created in the same VPC that the Amazon FSx file system was created in. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html">Elastic Network
     * Interfaces</a> in the <i>Amazon EC2 User Guide.</i>
     * </p>
     * <p>
     * For an Amazon FSx for Windows File Server file system, you can have one network interface Id. For an Amazon FSx
     * for Lustre file system, you can have more than one.
     * </p>
     * 
     * @param networkInterfaceIds
     *        The IDs of the elastic network interface from which a specific file system is accessible. The elastic
     *        network interface is automatically created in the same VPC that the Amazon FSx file system was created in.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html">Elastic Network Interfaces</a>
     *        in the <i>Amazon EC2 User Guide.</i> </p>
     *        <p>
     *        For an Amazon FSx for Windows File Server file system, you can have one network interface Id. For an
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
     * The IDs of the elastic network interface from which a specific file system is accessible. The elastic network
     * interface is automatically created in the same VPC that the Amazon FSx file system was created in. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html">Elastic Network
     * Interfaces</a> in the <i>Amazon EC2 User Guide.</i>
     * </p>
     * <p>
     * For an Amazon FSx for Windows File Server file system, you can have one network interface Id. For an Amazon FSx
     * for Lustre file system, you can have more than one.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfaceIds(java.util.Collection)} or {@link #withNetworkInterfaceIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param networkInterfaceIds
     *        The IDs of the elastic network interface from which a specific file system is accessible. The elastic
     *        network interface is automatically created in the same VPC that the Amazon FSx file system was created in.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html">Elastic Network Interfaces</a>
     *        in the <i>Amazon EC2 User Guide.</i> </p>
     *        <p>
     *        For an Amazon FSx for Windows File Server file system, you can have one network interface Id. For an
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
     * The IDs of the elastic network interface from which a specific file system is accessible. The elastic network
     * interface is automatically created in the same VPC that the Amazon FSx file system was created in. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html">Elastic Network
     * Interfaces</a> in the <i>Amazon EC2 User Guide.</i>
     * </p>
     * <p>
     * For an Amazon FSx for Windows File Server file system, you can have one network interface Id. For an Amazon FSx
     * for Lustre file system, you can have more than one.
     * </p>
     * 
     * @param networkInterfaceIds
     *        The IDs of the elastic network interface from which a specific file system is accessible. The elastic
     *        network interface is automatically created in the same VPC that the Amazon FSx file system was created in.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html">Elastic Network Interfaces</a>
     *        in the <i>Amazon EC2 User Guide.</i> </p>
     *        <p>
     *        For an Amazon FSx for Windows File Server file system, you can have one network interface Id. For an
     *        Amazon FSx for Lustre file system, you can have more than one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withNetworkInterfaceIds(java.util.Collection<String> networkInterfaceIds) {
        setNetworkInterfaceIds(networkInterfaceIds);
        return this;
    }

    /**
     * <p>
     * The DNS name for the file system.
     * </p>
     * 
     * @param dNSName
     *        The DNS name for the file system.
     */

    public void setDNSName(String dNSName) {
        this.dNSName = dNSName;
    }

    /**
     * <p>
     * The DNS name for the file system.
     * </p>
     * 
     * @return The DNS name for the file system.
     */

    public String getDNSName() {
        return this.dNSName;
    }

    /**
     * <p>
     * The DNS name for the file system.
     * </p>
     * 
     * @param dNSName
     *        The DNS name for the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withDNSName(String dNSName) {
        setDNSName(dNSName);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt the file system's data for an Amazon FSx
     * for Windows File Server file system.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the AWS Key Management Service (AWS KMS) key used to encrypt the file system's data for an
     *        Amazon FSx for Windows File Server file system.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt the file system's data for an Amazon FSx
     * for Windows File Server file system.
     * </p>
     * 
     * @return The ID of the AWS Key Management Service (AWS KMS) key used to encrypt the file system's data for an
     *         Amazon FSx for Windows File Server file system.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt the file system's data for an Amazon FSx
     * for Windows File Server file system.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the AWS Key Management Service (AWS KMS) key used to encrypt the file system's data for an
     *        Amazon FSx for Windows File Server file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The resource ARN of the file system.
     * </p>
     * 
     * @param resourceARN
     *        The resource ARN of the file system.
     */

    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * The resource ARN of the file system.
     * </p>
     * 
     * @return The resource ARN of the file system.
     */

    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * <p>
     * The resource ARN of the file system.
     * </p>
     * 
     * @param resourceARN
     *        The resource ARN of the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
        return this;
    }

    /**
     * <p>
     * The tags to associate with the file system. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging Your Amazon EC2 Resources</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @return The tags to associate with the file system. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging Your Amazon EC2
     *         Resources</a> in the <i>Amazon EC2 User Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to associate with the file system. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging Your Amazon EC2 Resources</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param tags
     *        The tags to associate with the file system. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging Your Amazon EC2
     *        Resources</a> in the <i>Amazon EC2 User Guide</i>.
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
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging Your Amazon EC2 Resources</a>
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
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging Your Amazon EC2
     *        Resources</a> in the <i>Amazon EC2 User Guide</i>.
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
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging Your Amazon EC2 Resources</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param tags
     *        The tags to associate with the file system. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging Your Amazon EC2
     *        Resources</a> in the <i>Amazon EC2 User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystem withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The configuration for this Microsoft Windows file system.
     * </p>
     * 
     * @param windowsConfiguration
     *        The configuration for this Microsoft Windows file system.
     */

    public void setWindowsConfiguration(WindowsFileSystemConfiguration windowsConfiguration) {
        this.windowsConfiguration = windowsConfiguration;
    }

    /**
     * <p>
     * The configuration for this Microsoft Windows file system.
     * </p>
     * 
     * @return The configuration for this Microsoft Windows file system.
     */

    public WindowsFileSystemConfiguration getWindowsConfiguration() {
        return this.windowsConfiguration;
    }

    /**
     * <p>
     * The configuration for this Microsoft Windows file system.
     * </p>
     * 
     * @param windowsConfiguration
     *        The configuration for this Microsoft Windows file system.
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
            sb.append("LustreConfiguration: ").append(getLustreConfiguration());
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
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceIds() == null) ? 0 : getNetworkInterfaceIds().hashCode());
        hashCode = prime * hashCode + ((getDNSName() == null) ? 0 : getDNSName().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getWindowsConfiguration() == null) ? 0 : getWindowsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLustreConfiguration() == null) ? 0 : getLustreConfiguration().hashCode());
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
