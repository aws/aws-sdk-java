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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the Server Message Block (SMB) protocol configuration that DataSync uses to access your Amazon FSx for
 * NetApp ONTAP file system. For more information, see <a href=
 * "https://docs.aws.amazon.com/datasync/latest/userguide/create-ontap-location.html#create-ontap-location-access"
 * >Accessing FSx for ONTAP file systems</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/FsxProtocolSmb" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FsxProtocolSmb implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the fully qualified domain name (FQDN) of the Microsoft Active Directory that your storage virtual
     * machine (SVM) belongs to.
     * </p>
     */
    private String domain;

    private SmbMountOptions mountOptions;
    /**
     * <p>
     * Specifies the password of a user who has permission to access your SVM.
     * </p>
     */
    private String password;
    /**
     * <p>
     * Specifies a user name that can mount the location and access the files, folders, and metadata that you need in
     * the SVM.
     * </p>
     * <p>
     * If you provide a user in your Active Directory, note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you're using Directory Service for Microsoft Active Directory, the user must be a member of the Amazon Web
     * Services Delegated FSx Administrators group.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you're using a self-managed Active Directory, the user must be a member of either the Domain Admins group or a
     * custom group that you specified for file system administration when you created your file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Make sure that the user has the permissions it needs to copy the data you want:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SE_TCB_NAME</code>: Required to set object ownership and file metadata. With this privilege, you also can
     * copy NTFS discretionary access lists (DACLs).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SE_SECURITY_NAME</code>: May be needed to copy NTFS system access control lists (SACLs). This operation
     * specifically requires the Windows privilege, which is granted to members of the Domain Admins group. If you
     * configure your task to copy SACLs, make sure that the user has the required privileges. For information about
     * copying SACLs, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-task.html#configure-ownership-and-permissions"
     * >Ownership and permissions-related options</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String user;

    /**
     * <p>
     * Specifies the fully qualified domain name (FQDN) of the Microsoft Active Directory that your storage virtual
     * machine (SVM) belongs to.
     * </p>
     * 
     * @param domain
     *        Specifies the fully qualified domain name (FQDN) of the Microsoft Active Directory that your storage
     *        virtual machine (SVM) belongs to.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * Specifies the fully qualified domain name (FQDN) of the Microsoft Active Directory that your storage virtual
     * machine (SVM) belongs to.
     * </p>
     * 
     * @return Specifies the fully qualified domain name (FQDN) of the Microsoft Active Directory that your storage
     *         virtual machine (SVM) belongs to.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * Specifies the fully qualified domain name (FQDN) of the Microsoft Active Directory that your storage virtual
     * machine (SVM) belongs to.
     * </p>
     * 
     * @param domain
     *        Specifies the fully qualified domain name (FQDN) of the Microsoft Active Directory that your storage
     *        virtual machine (SVM) belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FsxProtocolSmb withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * @param mountOptions
     */

    public void setMountOptions(SmbMountOptions mountOptions) {
        this.mountOptions = mountOptions;
    }

    /**
     * @return
     */

    public SmbMountOptions getMountOptions() {
        return this.mountOptions;
    }

    /**
     * @param mountOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FsxProtocolSmb withMountOptions(SmbMountOptions mountOptions) {
        setMountOptions(mountOptions);
        return this;
    }

    /**
     * <p>
     * Specifies the password of a user who has permission to access your SVM.
     * </p>
     * 
     * @param password
     *        Specifies the password of a user who has permission to access your SVM.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * Specifies the password of a user who has permission to access your SVM.
     * </p>
     * 
     * @return Specifies the password of a user who has permission to access your SVM.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * Specifies the password of a user who has permission to access your SVM.
     * </p>
     * 
     * @param password
     *        Specifies the password of a user who has permission to access your SVM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FsxProtocolSmb withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * Specifies a user name that can mount the location and access the files, folders, and metadata that you need in
     * the SVM.
     * </p>
     * <p>
     * If you provide a user in your Active Directory, note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you're using Directory Service for Microsoft Active Directory, the user must be a member of the Amazon Web
     * Services Delegated FSx Administrators group.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you're using a self-managed Active Directory, the user must be a member of either the Domain Admins group or a
     * custom group that you specified for file system administration when you created your file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Make sure that the user has the permissions it needs to copy the data you want:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SE_TCB_NAME</code>: Required to set object ownership and file metadata. With this privilege, you also can
     * copy NTFS discretionary access lists (DACLs).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SE_SECURITY_NAME</code>: May be needed to copy NTFS system access control lists (SACLs). This operation
     * specifically requires the Windows privilege, which is granted to members of the Domain Admins group. If you
     * configure your task to copy SACLs, make sure that the user has the required privileges. For information about
     * copying SACLs, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-task.html#configure-ownership-and-permissions"
     * >Ownership and permissions-related options</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param user
     *        Specifies a user name that can mount the location and access the files, folders, and metadata that you
     *        need in the SVM.</p>
     *        <p>
     *        If you provide a user in your Active Directory, note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you're using Directory Service for Microsoft Active Directory, the user must be a member of the Amazon
     *        Web Services Delegated FSx Administrators group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you're using a self-managed Active Directory, the user must be a member of either the Domain Admins
     *        group or a custom group that you specified for file system administration when you created your file
     *        system.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Make sure that the user has the permissions it needs to copy the data you want:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SE_TCB_NAME</code>: Required to set object ownership and file metadata. With this privilege, you
     *        also can copy NTFS discretionary access lists (DACLs).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SE_SECURITY_NAME</code>: May be needed to copy NTFS system access control lists (SACLs). This
     *        operation specifically requires the Windows privilege, which is granted to members of the Domain Admins
     *        group. If you configure your task to copy SACLs, make sure that the user has the required privileges. For
     *        information about copying SACLs, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-task.html#configure-ownership-and-permissions"
     *        >Ownership and permissions-related options</a>.
     *        </p>
     *        </li>
     */

    public void setUser(String user) {
        this.user = user;
    }

    /**
     * <p>
     * Specifies a user name that can mount the location and access the files, folders, and metadata that you need in
     * the SVM.
     * </p>
     * <p>
     * If you provide a user in your Active Directory, note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you're using Directory Service for Microsoft Active Directory, the user must be a member of the Amazon Web
     * Services Delegated FSx Administrators group.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you're using a self-managed Active Directory, the user must be a member of either the Domain Admins group or a
     * custom group that you specified for file system administration when you created your file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Make sure that the user has the permissions it needs to copy the data you want:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SE_TCB_NAME</code>: Required to set object ownership and file metadata. With this privilege, you also can
     * copy NTFS discretionary access lists (DACLs).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SE_SECURITY_NAME</code>: May be needed to copy NTFS system access control lists (SACLs). This operation
     * specifically requires the Windows privilege, which is granted to members of the Domain Admins group. If you
     * configure your task to copy SACLs, make sure that the user has the required privileges. For information about
     * copying SACLs, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-task.html#configure-ownership-and-permissions"
     * >Ownership and permissions-related options</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies a user name that can mount the location and access the files, folders, and metadata that you
     *         need in the SVM.</p>
     *         <p>
     *         If you provide a user in your Active Directory, note the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you're using Directory Service for Microsoft Active Directory, the user must be a member of the Amazon
     *         Web Services Delegated FSx Administrators group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you're using a self-managed Active Directory, the user must be a member of either the Domain Admins
     *         group or a custom group that you specified for file system administration when you created your file
     *         system.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Make sure that the user has the permissions it needs to copy the data you want:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SE_TCB_NAME</code>: Required to set object ownership and file metadata. With this privilege, you
     *         also can copy NTFS discretionary access lists (DACLs).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SE_SECURITY_NAME</code>: May be needed to copy NTFS system access control lists (SACLs). This
     *         operation specifically requires the Windows privilege, which is granted to members of the Domain Admins
     *         group. If you configure your task to copy SACLs, make sure that the user has the required privileges. For
     *         information about copying SACLs, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/create-task.html#configure-ownership-and-permissions"
     *         >Ownership and permissions-related options</a>.
     *         </p>
     *         </li>
     */

    public String getUser() {
        return this.user;
    }

    /**
     * <p>
     * Specifies a user name that can mount the location and access the files, folders, and metadata that you need in
     * the SVM.
     * </p>
     * <p>
     * If you provide a user in your Active Directory, note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you're using Directory Service for Microsoft Active Directory, the user must be a member of the Amazon Web
     * Services Delegated FSx Administrators group.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you're using a self-managed Active Directory, the user must be a member of either the Domain Admins group or a
     * custom group that you specified for file system administration when you created your file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Make sure that the user has the permissions it needs to copy the data you want:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SE_TCB_NAME</code>: Required to set object ownership and file metadata. With this privilege, you also can
     * copy NTFS discretionary access lists (DACLs).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SE_SECURITY_NAME</code>: May be needed to copy NTFS system access control lists (SACLs). This operation
     * specifically requires the Windows privilege, which is granted to members of the Domain Admins group. If you
     * configure your task to copy SACLs, make sure that the user has the required privileges. For information about
     * copying SACLs, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-task.html#configure-ownership-and-permissions"
     * >Ownership and permissions-related options</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param user
     *        Specifies a user name that can mount the location and access the files, folders, and metadata that you
     *        need in the SVM.</p>
     *        <p>
     *        If you provide a user in your Active Directory, note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you're using Directory Service for Microsoft Active Directory, the user must be a member of the Amazon
     *        Web Services Delegated FSx Administrators group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you're using a self-managed Active Directory, the user must be a member of either the Domain Admins
     *        group or a custom group that you specified for file system administration when you created your file
     *        system.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Make sure that the user has the permissions it needs to copy the data you want:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SE_TCB_NAME</code>: Required to set object ownership and file metadata. With this privilege, you
     *        also can copy NTFS discretionary access lists (DACLs).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SE_SECURITY_NAME</code>: May be needed to copy NTFS system access control lists (SACLs). This
     *        operation specifically requires the Windows privilege, which is granted to members of the Domain Admins
     *        group. If you configure your task to copy SACLs, make sure that the user has the required privileges. For
     *        information about copying SACLs, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-task.html#configure-ownership-and-permissions"
     *        >Ownership and permissions-related options</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FsxProtocolSmb withUser(String user) {
        setUser(user);
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getMountOptions() != null)
            sb.append("MountOptions: ").append(getMountOptions()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***").append(",");
        if (getUser() != null)
            sb.append("User: ").append(getUser());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FsxProtocolSmb == false)
            return false;
        FsxProtocolSmb other = (FsxProtocolSmb) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getMountOptions() == null ^ this.getMountOptions() == null)
            return false;
        if (other.getMountOptions() != null && other.getMountOptions().equals(this.getMountOptions()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getMountOptions() == null) ? 0 : getMountOptions().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        return hashCode;
    }

    @Override
    public FsxProtocolSmb clone() {
        try {
            return (FsxProtocolSmb) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.FsxProtocolSmbMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
