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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateStorageVirtualMachine" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStorageVirtualMachineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Describes the self-managed Microsoft Active Directory to which you want to join the SVM. Joining an Active
     * Directory provides user authentication and access control for SMB clients, including Microsoft Windows and macOS
     * client accessing the file system.
     * </p>
     */
    private CreateSvmActiveDirectoryConfiguration activeDirectoryConfiguration;

    private String clientRequestToken;

    private String fileSystemId;
    /**
     * <p>
     * The name of the SVM.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The password to use when managing the SVM using the NetApp ONTAP CLI or REST API. If you do not specify a
     * password, you can still use the file system's <code>fsxadmin</code> user to manage the SVM.
     * </p>
     */
    private String svmAdminPassword;

    private java.util.List<Tag> tags;
    /**
     * <p>
     * The security style of the root volume of the SVM. Specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UNIX</code> if the file system is managed by a UNIX administrator, the majority of users are NFS clients,
     * and an application accessing the data uses a UNIX user as the service account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NTFS</code> if the file system is managed by a Windows administrator, the majority of users are SMB
     * clients, and an application accessing the data uses a Windows user as the service account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MIXED</code> if the file system is managed by both UNIX and Windows administrators and users consist of
     * both NFS and SMB clients.
     * </p>
     * </li>
     * </ul>
     */
    private String rootVolumeSecurityStyle;

    /**
     * <p>
     * Describes the self-managed Microsoft Active Directory to which you want to join the SVM. Joining an Active
     * Directory provides user authentication and access control for SMB clients, including Microsoft Windows and macOS
     * client accessing the file system.
     * </p>
     * 
     * @param activeDirectoryConfiguration
     *        Describes the self-managed Microsoft Active Directory to which you want to join the SVM. Joining an Active
     *        Directory provides user authentication and access control for SMB clients, including Microsoft Windows and
     *        macOS client accessing the file system.
     */

    public void setActiveDirectoryConfiguration(CreateSvmActiveDirectoryConfiguration activeDirectoryConfiguration) {
        this.activeDirectoryConfiguration = activeDirectoryConfiguration;
    }

    /**
     * <p>
     * Describes the self-managed Microsoft Active Directory to which you want to join the SVM. Joining an Active
     * Directory provides user authentication and access control for SMB clients, including Microsoft Windows and macOS
     * client accessing the file system.
     * </p>
     * 
     * @return Describes the self-managed Microsoft Active Directory to which you want to join the SVM. Joining an
     *         Active Directory provides user authentication and access control for SMB clients, including Microsoft
     *         Windows and macOS client accessing the file system.
     */

    public CreateSvmActiveDirectoryConfiguration getActiveDirectoryConfiguration() {
        return this.activeDirectoryConfiguration;
    }

    /**
     * <p>
     * Describes the self-managed Microsoft Active Directory to which you want to join the SVM. Joining an Active
     * Directory provides user authentication and access control for SMB clients, including Microsoft Windows and macOS
     * client accessing the file system.
     * </p>
     * 
     * @param activeDirectoryConfiguration
     *        Describes the self-managed Microsoft Active Directory to which you want to join the SVM. Joining an Active
     *        Directory provides user authentication and access control for SMB clients, including Microsoft Windows and
     *        macOS client accessing the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStorageVirtualMachineRequest withActiveDirectoryConfiguration(CreateSvmActiveDirectoryConfiguration activeDirectoryConfiguration) {
        setActiveDirectoryConfiguration(activeDirectoryConfiguration);
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

    public CreateStorageVirtualMachineRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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

    public CreateStorageVirtualMachineRequest withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * The name of the SVM.
     * </p>
     * 
     * @param name
     *        The name of the SVM.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the SVM.
     * </p>
     * 
     * @return The name of the SVM.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the SVM.
     * </p>
     * 
     * @param name
     *        The name of the SVM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStorageVirtualMachineRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The password to use when managing the SVM using the NetApp ONTAP CLI or REST API. If you do not specify a
     * password, you can still use the file system's <code>fsxadmin</code> user to manage the SVM.
     * </p>
     * 
     * @param svmAdminPassword
     *        The password to use when managing the SVM using the NetApp ONTAP CLI or REST API. If you do not specify a
     *        password, you can still use the file system's <code>fsxadmin</code> user to manage the SVM.
     */

    public void setSvmAdminPassword(String svmAdminPassword) {
        this.svmAdminPassword = svmAdminPassword;
    }

    /**
     * <p>
     * The password to use when managing the SVM using the NetApp ONTAP CLI or REST API. If you do not specify a
     * password, you can still use the file system's <code>fsxadmin</code> user to manage the SVM.
     * </p>
     * 
     * @return The password to use when managing the SVM using the NetApp ONTAP CLI or REST API. If you do not specify a
     *         password, you can still use the file system's <code>fsxadmin</code> user to manage the SVM.
     */

    public String getSvmAdminPassword() {
        return this.svmAdminPassword;
    }

    /**
     * <p>
     * The password to use when managing the SVM using the NetApp ONTAP CLI or REST API. If you do not specify a
     * password, you can still use the file system's <code>fsxadmin</code> user to manage the SVM.
     * </p>
     * 
     * @param svmAdminPassword
     *        The password to use when managing the SVM using the NetApp ONTAP CLI or REST API. If you do not specify a
     *        password, you can still use the file system's <code>fsxadmin</code> user to manage the SVM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStorageVirtualMachineRequest withSvmAdminPassword(String svmAdminPassword) {
        setSvmAdminPassword(svmAdminPassword);
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

    public CreateStorageVirtualMachineRequest withTags(Tag... tags) {
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

    public CreateStorageVirtualMachineRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The security style of the root volume of the SVM. Specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UNIX</code> if the file system is managed by a UNIX administrator, the majority of users are NFS clients,
     * and an application accessing the data uses a UNIX user as the service account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NTFS</code> if the file system is managed by a Windows administrator, the majority of users are SMB
     * clients, and an application accessing the data uses a Windows user as the service account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MIXED</code> if the file system is managed by both UNIX and Windows administrators and users consist of
     * both NFS and SMB clients.
     * </p>
     * </li>
     * </ul>
     * 
     * @param rootVolumeSecurityStyle
     *        The security style of the root volume of the SVM. Specify one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>UNIX</code> if the file system is managed by a UNIX administrator, the majority of users are NFS
     *        clients, and an application accessing the data uses a UNIX user as the service account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NTFS</code> if the file system is managed by a Windows administrator, the majority of users are SMB
     *        clients, and an application accessing the data uses a Windows user as the service account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MIXED</code> if the file system is managed by both UNIX and Windows administrators and users consist
     *        of both NFS and SMB clients.
     *        </p>
     *        </li>
     * @see StorageVirtualMachineRootVolumeSecurityStyle
     */

    public void setRootVolumeSecurityStyle(String rootVolumeSecurityStyle) {
        this.rootVolumeSecurityStyle = rootVolumeSecurityStyle;
    }

    /**
     * <p>
     * The security style of the root volume of the SVM. Specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UNIX</code> if the file system is managed by a UNIX administrator, the majority of users are NFS clients,
     * and an application accessing the data uses a UNIX user as the service account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NTFS</code> if the file system is managed by a Windows administrator, the majority of users are SMB
     * clients, and an application accessing the data uses a Windows user as the service account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MIXED</code> if the file system is managed by both UNIX and Windows administrators and users consist of
     * both NFS and SMB clients.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The security style of the root volume of the SVM. Specify one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>UNIX</code> if the file system is managed by a UNIX administrator, the majority of users are NFS
     *         clients, and an application accessing the data uses a UNIX user as the service account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NTFS</code> if the file system is managed by a Windows administrator, the majority of users are SMB
     *         clients, and an application accessing the data uses a Windows user as the service account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MIXED</code> if the file system is managed by both UNIX and Windows administrators and users
     *         consist of both NFS and SMB clients.
     *         </p>
     *         </li>
     * @see StorageVirtualMachineRootVolumeSecurityStyle
     */

    public String getRootVolumeSecurityStyle() {
        return this.rootVolumeSecurityStyle;
    }

    /**
     * <p>
     * The security style of the root volume of the SVM. Specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UNIX</code> if the file system is managed by a UNIX administrator, the majority of users are NFS clients,
     * and an application accessing the data uses a UNIX user as the service account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NTFS</code> if the file system is managed by a Windows administrator, the majority of users are SMB
     * clients, and an application accessing the data uses a Windows user as the service account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MIXED</code> if the file system is managed by both UNIX and Windows administrators and users consist of
     * both NFS and SMB clients.
     * </p>
     * </li>
     * </ul>
     * 
     * @param rootVolumeSecurityStyle
     *        The security style of the root volume of the SVM. Specify one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>UNIX</code> if the file system is managed by a UNIX administrator, the majority of users are NFS
     *        clients, and an application accessing the data uses a UNIX user as the service account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NTFS</code> if the file system is managed by a Windows administrator, the majority of users are SMB
     *        clients, and an application accessing the data uses a Windows user as the service account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MIXED</code> if the file system is managed by both UNIX and Windows administrators and users consist
     *        of both NFS and SMB clients.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageVirtualMachineRootVolumeSecurityStyle
     */

    public CreateStorageVirtualMachineRequest withRootVolumeSecurityStyle(String rootVolumeSecurityStyle) {
        setRootVolumeSecurityStyle(rootVolumeSecurityStyle);
        return this;
    }

    /**
     * <p>
     * The security style of the root volume of the SVM. Specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UNIX</code> if the file system is managed by a UNIX administrator, the majority of users are NFS clients,
     * and an application accessing the data uses a UNIX user as the service account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NTFS</code> if the file system is managed by a Windows administrator, the majority of users are SMB
     * clients, and an application accessing the data uses a Windows user as the service account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MIXED</code> if the file system is managed by both UNIX and Windows administrators and users consist of
     * both NFS and SMB clients.
     * </p>
     * </li>
     * </ul>
     * 
     * @param rootVolumeSecurityStyle
     *        The security style of the root volume of the SVM. Specify one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>UNIX</code> if the file system is managed by a UNIX administrator, the majority of users are NFS
     *        clients, and an application accessing the data uses a UNIX user as the service account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NTFS</code> if the file system is managed by a Windows administrator, the majority of users are SMB
     *        clients, and an application accessing the data uses a Windows user as the service account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MIXED</code> if the file system is managed by both UNIX and Windows administrators and users consist
     *        of both NFS and SMB clients.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageVirtualMachineRootVolumeSecurityStyle
     */

    public CreateStorageVirtualMachineRequest withRootVolumeSecurityStyle(StorageVirtualMachineRootVolumeSecurityStyle rootVolumeSecurityStyle) {
        this.rootVolumeSecurityStyle = rootVolumeSecurityStyle.toString();
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
        if (getActiveDirectoryConfiguration() != null)
            sb.append("ActiveDirectoryConfiguration: ").append(getActiveDirectoryConfiguration()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSvmAdminPassword() != null)
            sb.append("SvmAdminPassword: ").append("***Sensitive Data Redacted***").append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getRootVolumeSecurityStyle() != null)
            sb.append("RootVolumeSecurityStyle: ").append(getRootVolumeSecurityStyle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStorageVirtualMachineRequest == false)
            return false;
        CreateStorageVirtualMachineRequest other = (CreateStorageVirtualMachineRequest) obj;
        if (other.getActiveDirectoryConfiguration() == null ^ this.getActiveDirectoryConfiguration() == null)
            return false;
        if (other.getActiveDirectoryConfiguration() != null && other.getActiveDirectoryConfiguration().equals(this.getActiveDirectoryConfiguration()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSvmAdminPassword() == null ^ this.getSvmAdminPassword() == null)
            return false;
        if (other.getSvmAdminPassword() != null && other.getSvmAdminPassword().equals(this.getSvmAdminPassword()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getRootVolumeSecurityStyle() == null ^ this.getRootVolumeSecurityStyle() == null)
            return false;
        if (other.getRootVolumeSecurityStyle() != null && other.getRootVolumeSecurityStyle().equals(this.getRootVolumeSecurityStyle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActiveDirectoryConfiguration() == null) ? 0 : getActiveDirectoryConfiguration().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSvmAdminPassword() == null) ? 0 : getSvmAdminPassword().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getRootVolumeSecurityStyle() == null) ? 0 : getRootVolumeSecurityStyle().hashCode());
        return hashCode;
    }

    @Override
    public CreateStorageVirtualMachineRequest clone() {
        return (CreateStorageVirtualMachineRequest) super.clone();
    }

}
