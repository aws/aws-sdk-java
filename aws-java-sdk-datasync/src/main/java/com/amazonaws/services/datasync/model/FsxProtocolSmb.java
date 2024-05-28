/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * <p>
     * If you have multiple domains in your environment, configuring this setting makes sure that DataSync connects to
     * the right SVM.
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
     * Specifies a user that can mount and access the files, folders, and metadata in your SVM.
     * </p>
     * <p>
     * For information about choosing a user with the right level of access for your transfer, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-ontap-location.html#create-ontap-location-smb"
     * >Using the SMB protocol</a>.
     * </p>
     */
    private String user;

    /**
     * <p>
     * Specifies the fully qualified domain name (FQDN) of the Microsoft Active Directory that your storage virtual
     * machine (SVM) belongs to.
     * </p>
     * <p>
     * If you have multiple domains in your environment, configuring this setting makes sure that DataSync connects to
     * the right SVM.
     * </p>
     * 
     * @param domain
     *        Specifies the fully qualified domain name (FQDN) of the Microsoft Active Directory that your storage
     *        virtual machine (SVM) belongs to.</p>
     *        <p>
     *        If you have multiple domains in your environment, configuring this setting makes sure that DataSync
     *        connects to the right SVM.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * Specifies the fully qualified domain name (FQDN) of the Microsoft Active Directory that your storage virtual
     * machine (SVM) belongs to.
     * </p>
     * <p>
     * If you have multiple domains in your environment, configuring this setting makes sure that DataSync connects to
     * the right SVM.
     * </p>
     * 
     * @return Specifies the fully qualified domain name (FQDN) of the Microsoft Active Directory that your storage
     *         virtual machine (SVM) belongs to.</p>
     *         <p>
     *         If you have multiple domains in your environment, configuring this setting makes sure that DataSync
     *         connects to the right SVM.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * Specifies the fully qualified domain name (FQDN) of the Microsoft Active Directory that your storage virtual
     * machine (SVM) belongs to.
     * </p>
     * <p>
     * If you have multiple domains in your environment, configuring this setting makes sure that DataSync connects to
     * the right SVM.
     * </p>
     * 
     * @param domain
     *        Specifies the fully qualified domain name (FQDN) of the Microsoft Active Directory that your storage
     *        virtual machine (SVM) belongs to.</p>
     *        <p>
     *        If you have multiple domains in your environment, configuring this setting makes sure that DataSync
     *        connects to the right SVM.
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
     * Specifies a user that can mount and access the files, folders, and metadata in your SVM.
     * </p>
     * <p>
     * For information about choosing a user with the right level of access for your transfer, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-ontap-location.html#create-ontap-location-smb"
     * >Using the SMB protocol</a>.
     * </p>
     * 
     * @param user
     *        Specifies a user that can mount and access the files, folders, and metadata in your SVM.</p>
     *        <p>
     *        For information about choosing a user with the right level of access for your transfer, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-ontap-location.html#create-ontap-location-smb"
     *        >Using the SMB protocol</a>.
     */

    public void setUser(String user) {
        this.user = user;
    }

    /**
     * <p>
     * Specifies a user that can mount and access the files, folders, and metadata in your SVM.
     * </p>
     * <p>
     * For information about choosing a user with the right level of access for your transfer, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-ontap-location.html#create-ontap-location-smb"
     * >Using the SMB protocol</a>.
     * </p>
     * 
     * @return Specifies a user that can mount and access the files, folders, and metadata in your SVM.</p>
     *         <p>
     *         For information about choosing a user with the right level of access for your transfer, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/create-ontap-location.html#create-ontap-location-smb"
     *         >Using the SMB protocol</a>.
     */

    public String getUser() {
        return this.user;
    }

    /**
     * <p>
     * Specifies a user that can mount and access the files, folders, and metadata in your SVM.
     * </p>
     * <p>
     * For information about choosing a user with the right level of access for your transfer, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-ontap-location.html#create-ontap-location-smb"
     * >Using the SMB protocol</a>.
     * </p>
     * 
     * @param user
     *        Specifies a user that can mount and access the files, folders, and metadata in your SVM.</p>
     *        <p>
     *        For information about choosing a user with the right level of access for your transfer, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-ontap-location.html#create-ontap-location-smb"
     *        >Using the SMB protocol</a>.
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
