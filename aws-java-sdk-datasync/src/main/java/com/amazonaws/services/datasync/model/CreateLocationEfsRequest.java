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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * CreateLocationEfsRequest
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationEfs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLocationEfsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies a mount path for your Amazon EFS file system. This is where DataSync reads or writes data (depending on
     * if this is a source or destination location). By default, DataSync uses the root directory, but you can also
     * include subdirectories.
     * </p>
     * <note>
     * <p>
     * You must specify a value with forward slashes (for example, <code>/path/to/folder</code>).
     * </p>
     * </note>
     */
    private String subdirectory;
    /**
     * <p>
     * Specifies the ARN for the Amazon EFS file system.
     * </p>
     */
    private String efsFilesystemArn;
    /**
     * <p>
     * Specifies the subnet and security groups DataSync uses to access your Amazon EFS file system.
     * </p>
     */
    private Ec2Config ec2Config;
    /**
     * <p>
     * Specifies the key-value pair that represents a tag that you want to add to the resource. The value can be an
     * empty string. This value helps you manage, filter, and search for your resources. We recommend that you create a
     * name tag for your location.
     * </p>
     */
    private java.util.List<TagListEntry> tags;
    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the access point that DataSync uses to access the Amazon EFS file
     * system.
     * </p>
     */
    private String accessPointArn;
    /**
     * <p>
     * Specifies an Identity and Access Management (IAM) role that DataSync assumes when mounting the Amazon EFS file
     * system.
     * </p>
     */
    private String fileSystemAccessRoleArn;
    /**
     * <p>
     * Specifies whether you want DataSync to use Transport Layer Security (TLS) 1.2 encryption when it copies data to
     * or from the Amazon EFS file system.
     * </p>
     * <p>
     * If you specify an access point using <code>AccessPointArn</code> or an IAM role using
     * <code>FileSystemAccessRoleArn</code>, you must set this parameter to <code>TLS1_2</code>.
     * </p>
     */
    private String inTransitEncryption;

    /**
     * <p>
     * Specifies a mount path for your Amazon EFS file system. This is where DataSync reads or writes data (depending on
     * if this is a source or destination location). By default, DataSync uses the root directory, but you can also
     * include subdirectories.
     * </p>
     * <note>
     * <p>
     * You must specify a value with forward slashes (for example, <code>/path/to/folder</code>).
     * </p>
     * </note>
     * 
     * @param subdirectory
     *        Specifies a mount path for your Amazon EFS file system. This is where DataSync reads or writes data
     *        (depending on if this is a source or destination location). By default, DataSync uses the root directory,
     *        but you can also include subdirectories.</p> <note>
     *        <p>
     *        You must specify a value with forward slashes (for example, <code>/path/to/folder</code>).
     *        </p>
     */

    public void setSubdirectory(String subdirectory) {
        this.subdirectory = subdirectory;
    }

    /**
     * <p>
     * Specifies a mount path for your Amazon EFS file system. This is where DataSync reads or writes data (depending on
     * if this is a source or destination location). By default, DataSync uses the root directory, but you can also
     * include subdirectories.
     * </p>
     * <note>
     * <p>
     * You must specify a value with forward slashes (for example, <code>/path/to/folder</code>).
     * </p>
     * </note>
     * 
     * @return Specifies a mount path for your Amazon EFS file system. This is where DataSync reads or writes data
     *         (depending on if this is a source or destination location). By default, DataSync uses the root directory,
     *         but you can also include subdirectories.</p> <note>
     *         <p>
     *         You must specify a value with forward slashes (for example, <code>/path/to/folder</code>).
     *         </p>
     */

    public String getSubdirectory() {
        return this.subdirectory;
    }

    /**
     * <p>
     * Specifies a mount path for your Amazon EFS file system. This is where DataSync reads or writes data (depending on
     * if this is a source or destination location). By default, DataSync uses the root directory, but you can also
     * include subdirectories.
     * </p>
     * <note>
     * <p>
     * You must specify a value with forward slashes (for example, <code>/path/to/folder</code>).
     * </p>
     * </note>
     * 
     * @param subdirectory
     *        Specifies a mount path for your Amazon EFS file system. This is where DataSync reads or writes data
     *        (depending on if this is a source or destination location). By default, DataSync uses the root directory,
     *        but you can also include subdirectories.</p> <note>
     *        <p>
     *        You must specify a value with forward slashes (for example, <code>/path/to/folder</code>).
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationEfsRequest withSubdirectory(String subdirectory) {
        setSubdirectory(subdirectory);
        return this;
    }

    /**
     * <p>
     * Specifies the ARN for the Amazon EFS file system.
     * </p>
     * 
     * @param efsFilesystemArn
     *        Specifies the ARN for the Amazon EFS file system.
     */

    public void setEfsFilesystemArn(String efsFilesystemArn) {
        this.efsFilesystemArn = efsFilesystemArn;
    }

    /**
     * <p>
     * Specifies the ARN for the Amazon EFS file system.
     * </p>
     * 
     * @return Specifies the ARN for the Amazon EFS file system.
     */

    public String getEfsFilesystemArn() {
        return this.efsFilesystemArn;
    }

    /**
     * <p>
     * Specifies the ARN for the Amazon EFS file system.
     * </p>
     * 
     * @param efsFilesystemArn
     *        Specifies the ARN for the Amazon EFS file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationEfsRequest withEfsFilesystemArn(String efsFilesystemArn) {
        setEfsFilesystemArn(efsFilesystemArn);
        return this;
    }

    /**
     * <p>
     * Specifies the subnet and security groups DataSync uses to access your Amazon EFS file system.
     * </p>
     * 
     * @param ec2Config
     *        Specifies the subnet and security groups DataSync uses to access your Amazon EFS file system.
     */

    public void setEc2Config(Ec2Config ec2Config) {
        this.ec2Config = ec2Config;
    }

    /**
     * <p>
     * Specifies the subnet and security groups DataSync uses to access your Amazon EFS file system.
     * </p>
     * 
     * @return Specifies the subnet and security groups DataSync uses to access your Amazon EFS file system.
     */

    public Ec2Config getEc2Config() {
        return this.ec2Config;
    }

    /**
     * <p>
     * Specifies the subnet and security groups DataSync uses to access your Amazon EFS file system.
     * </p>
     * 
     * @param ec2Config
     *        Specifies the subnet and security groups DataSync uses to access your Amazon EFS file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationEfsRequest withEc2Config(Ec2Config ec2Config) {
        setEc2Config(ec2Config);
        return this;
    }

    /**
     * <p>
     * Specifies the key-value pair that represents a tag that you want to add to the resource. The value can be an
     * empty string. This value helps you manage, filter, and search for your resources. We recommend that you create a
     * name tag for your location.
     * </p>
     * 
     * @return Specifies the key-value pair that represents a tag that you want to add to the resource. The value can be
     *         an empty string. This value helps you manage, filter, and search for your resources. We recommend that
     *         you create a name tag for your location.
     */

    public java.util.List<TagListEntry> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies the key-value pair that represents a tag that you want to add to the resource. The value can be an
     * empty string. This value helps you manage, filter, and search for your resources. We recommend that you create a
     * name tag for your location.
     * </p>
     * 
     * @param tags
     *        Specifies the key-value pair that represents a tag that you want to add to the resource. The value can be
     *        an empty string. This value helps you manage, filter, and search for your resources. We recommend that you
     *        create a name tag for your location.
     */

    public void setTags(java.util.Collection<TagListEntry> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<TagListEntry>(tags);
    }

    /**
     * <p>
     * Specifies the key-value pair that represents a tag that you want to add to the resource. The value can be an
     * empty string. This value helps you manage, filter, and search for your resources. We recommend that you create a
     * name tag for your location.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Specifies the key-value pair that represents a tag that you want to add to the resource. The value can be
     *        an empty string. This value helps you manage, filter, and search for your resources. We recommend that you
     *        create a name tag for your location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationEfsRequest withTags(TagListEntry... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<TagListEntry>(tags.length));
        }
        for (TagListEntry ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the key-value pair that represents a tag that you want to add to the resource. The value can be an
     * empty string. This value helps you manage, filter, and search for your resources. We recommend that you create a
     * name tag for your location.
     * </p>
     * 
     * @param tags
     *        Specifies the key-value pair that represents a tag that you want to add to the resource. The value can be
     *        an empty string. This value helps you manage, filter, and search for your resources. We recommend that you
     *        create a name tag for your location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationEfsRequest withTags(java.util.Collection<TagListEntry> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the access point that DataSync uses to access the Amazon EFS file
     * system.
     * </p>
     * 
     * @param accessPointArn
     *        Specifies the Amazon Resource Name (ARN) of the access point that DataSync uses to access the Amazon EFS
     *        file system.
     */

    public void setAccessPointArn(String accessPointArn) {
        this.accessPointArn = accessPointArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the access point that DataSync uses to access the Amazon EFS file
     * system.
     * </p>
     * 
     * @return Specifies the Amazon Resource Name (ARN) of the access point that DataSync uses to access the Amazon EFS
     *         file system.
     */

    public String getAccessPointArn() {
        return this.accessPointArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the access point that DataSync uses to access the Amazon EFS file
     * system.
     * </p>
     * 
     * @param accessPointArn
     *        Specifies the Amazon Resource Name (ARN) of the access point that DataSync uses to access the Amazon EFS
     *        file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationEfsRequest withAccessPointArn(String accessPointArn) {
        setAccessPointArn(accessPointArn);
        return this;
    }

    /**
     * <p>
     * Specifies an Identity and Access Management (IAM) role that DataSync assumes when mounting the Amazon EFS file
     * system.
     * </p>
     * 
     * @param fileSystemAccessRoleArn
     *        Specifies an Identity and Access Management (IAM) role that DataSync assumes when mounting the Amazon EFS
     *        file system.
     */

    public void setFileSystemAccessRoleArn(String fileSystemAccessRoleArn) {
        this.fileSystemAccessRoleArn = fileSystemAccessRoleArn;
    }

    /**
     * <p>
     * Specifies an Identity and Access Management (IAM) role that DataSync assumes when mounting the Amazon EFS file
     * system.
     * </p>
     * 
     * @return Specifies an Identity and Access Management (IAM) role that DataSync assumes when mounting the Amazon EFS
     *         file system.
     */

    public String getFileSystemAccessRoleArn() {
        return this.fileSystemAccessRoleArn;
    }

    /**
     * <p>
     * Specifies an Identity and Access Management (IAM) role that DataSync assumes when mounting the Amazon EFS file
     * system.
     * </p>
     * 
     * @param fileSystemAccessRoleArn
     *        Specifies an Identity and Access Management (IAM) role that DataSync assumes when mounting the Amazon EFS
     *        file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationEfsRequest withFileSystemAccessRoleArn(String fileSystemAccessRoleArn) {
        setFileSystemAccessRoleArn(fileSystemAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * Specifies whether you want DataSync to use Transport Layer Security (TLS) 1.2 encryption when it copies data to
     * or from the Amazon EFS file system.
     * </p>
     * <p>
     * If you specify an access point using <code>AccessPointArn</code> or an IAM role using
     * <code>FileSystemAccessRoleArn</code>, you must set this parameter to <code>TLS1_2</code>.
     * </p>
     * 
     * @param inTransitEncryption
     *        Specifies whether you want DataSync to use Transport Layer Security (TLS) 1.2 encryption when it copies
     *        data to or from the Amazon EFS file system.</p>
     *        <p>
     *        If you specify an access point using <code>AccessPointArn</code> or an IAM role using
     *        <code>FileSystemAccessRoleArn</code>, you must set this parameter to <code>TLS1_2</code>.
     * @see EfsInTransitEncryption
     */

    public void setInTransitEncryption(String inTransitEncryption) {
        this.inTransitEncryption = inTransitEncryption;
    }

    /**
     * <p>
     * Specifies whether you want DataSync to use Transport Layer Security (TLS) 1.2 encryption when it copies data to
     * or from the Amazon EFS file system.
     * </p>
     * <p>
     * If you specify an access point using <code>AccessPointArn</code> or an IAM role using
     * <code>FileSystemAccessRoleArn</code>, you must set this parameter to <code>TLS1_2</code>.
     * </p>
     * 
     * @return Specifies whether you want DataSync to use Transport Layer Security (TLS) 1.2 encryption when it copies
     *         data to or from the Amazon EFS file system.</p>
     *         <p>
     *         If you specify an access point using <code>AccessPointArn</code> or an IAM role using
     *         <code>FileSystemAccessRoleArn</code>, you must set this parameter to <code>TLS1_2</code>.
     * @see EfsInTransitEncryption
     */

    public String getInTransitEncryption() {
        return this.inTransitEncryption;
    }

    /**
     * <p>
     * Specifies whether you want DataSync to use Transport Layer Security (TLS) 1.2 encryption when it copies data to
     * or from the Amazon EFS file system.
     * </p>
     * <p>
     * If you specify an access point using <code>AccessPointArn</code> or an IAM role using
     * <code>FileSystemAccessRoleArn</code>, you must set this parameter to <code>TLS1_2</code>.
     * </p>
     * 
     * @param inTransitEncryption
     *        Specifies whether you want DataSync to use Transport Layer Security (TLS) 1.2 encryption when it copies
     *        data to or from the Amazon EFS file system.</p>
     *        <p>
     *        If you specify an access point using <code>AccessPointArn</code> or an IAM role using
     *        <code>FileSystemAccessRoleArn</code>, you must set this parameter to <code>TLS1_2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EfsInTransitEncryption
     */

    public CreateLocationEfsRequest withInTransitEncryption(String inTransitEncryption) {
        setInTransitEncryption(inTransitEncryption);
        return this;
    }

    /**
     * <p>
     * Specifies whether you want DataSync to use Transport Layer Security (TLS) 1.2 encryption when it copies data to
     * or from the Amazon EFS file system.
     * </p>
     * <p>
     * If you specify an access point using <code>AccessPointArn</code> or an IAM role using
     * <code>FileSystemAccessRoleArn</code>, you must set this parameter to <code>TLS1_2</code>.
     * </p>
     * 
     * @param inTransitEncryption
     *        Specifies whether you want DataSync to use Transport Layer Security (TLS) 1.2 encryption when it copies
     *        data to or from the Amazon EFS file system.</p>
     *        <p>
     *        If you specify an access point using <code>AccessPointArn</code> or an IAM role using
     *        <code>FileSystemAccessRoleArn</code>, you must set this parameter to <code>TLS1_2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EfsInTransitEncryption
     */

    public CreateLocationEfsRequest withInTransitEncryption(EfsInTransitEncryption inTransitEncryption) {
        this.inTransitEncryption = inTransitEncryption.toString();
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
        if (getSubdirectory() != null)
            sb.append("Subdirectory: ").append(getSubdirectory()).append(",");
        if (getEfsFilesystemArn() != null)
            sb.append("EfsFilesystemArn: ").append(getEfsFilesystemArn()).append(",");
        if (getEc2Config() != null)
            sb.append("Ec2Config: ").append(getEc2Config()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getAccessPointArn() != null)
            sb.append("AccessPointArn: ").append(getAccessPointArn()).append(",");
        if (getFileSystemAccessRoleArn() != null)
            sb.append("FileSystemAccessRoleArn: ").append(getFileSystemAccessRoleArn()).append(",");
        if (getInTransitEncryption() != null)
            sb.append("InTransitEncryption: ").append(getInTransitEncryption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLocationEfsRequest == false)
            return false;
        CreateLocationEfsRequest other = (CreateLocationEfsRequest) obj;
        if (other.getSubdirectory() == null ^ this.getSubdirectory() == null)
            return false;
        if (other.getSubdirectory() != null && other.getSubdirectory().equals(this.getSubdirectory()) == false)
            return false;
        if (other.getEfsFilesystemArn() == null ^ this.getEfsFilesystemArn() == null)
            return false;
        if (other.getEfsFilesystemArn() != null && other.getEfsFilesystemArn().equals(this.getEfsFilesystemArn()) == false)
            return false;
        if (other.getEc2Config() == null ^ this.getEc2Config() == null)
            return false;
        if (other.getEc2Config() != null && other.getEc2Config().equals(this.getEc2Config()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getAccessPointArn() == null ^ this.getAccessPointArn() == null)
            return false;
        if (other.getAccessPointArn() != null && other.getAccessPointArn().equals(this.getAccessPointArn()) == false)
            return false;
        if (other.getFileSystemAccessRoleArn() == null ^ this.getFileSystemAccessRoleArn() == null)
            return false;
        if (other.getFileSystemAccessRoleArn() != null && other.getFileSystemAccessRoleArn().equals(this.getFileSystemAccessRoleArn()) == false)
            return false;
        if (other.getInTransitEncryption() == null ^ this.getInTransitEncryption() == null)
            return false;
        if (other.getInTransitEncryption() != null && other.getInTransitEncryption().equals(this.getInTransitEncryption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubdirectory() == null) ? 0 : getSubdirectory().hashCode());
        hashCode = prime * hashCode + ((getEfsFilesystemArn() == null) ? 0 : getEfsFilesystemArn().hashCode());
        hashCode = prime * hashCode + ((getEc2Config() == null) ? 0 : getEc2Config().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getAccessPointArn() == null) ? 0 : getAccessPointArn().hashCode());
        hashCode = prime * hashCode + ((getFileSystemAccessRoleArn() == null) ? 0 : getFileSystemAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getInTransitEncryption() == null) ? 0 : getInTransitEncryption().hashCode());
        return hashCode;
    }

    @Override
    public CreateLocationEfsRequest clone() {
        return (CreateLocationEfsRequest) super.clone();
    }

}
