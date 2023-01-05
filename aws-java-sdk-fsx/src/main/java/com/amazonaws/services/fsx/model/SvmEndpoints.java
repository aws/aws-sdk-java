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
 * An Amazon FSx for NetApp ONTAP storage virtual machine (SVM) has the following endpoints that are used to access data
 * or to manage the SVM using the NetApp ONTAP CLI, REST API, or NetApp CloudManager.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/SvmEndpoints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SvmEndpoints implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An endpoint for connecting using the Internet Small Computer Systems Interface (iSCSI) protocol.
     * </p>
     */
    private SvmEndpoint iscsi;
    /**
     * <p>
     * An endpoint for managing SVMs using the NetApp ONTAP CLI, NetApp ONTAP API, or NetApp CloudManager.
     * </p>
     */
    private SvmEndpoint management;
    /**
     * <p>
     * An endpoint for connecting using the Network File System (NFS) protocol.
     * </p>
     */
    private SvmEndpoint nfs;
    /**
     * <p>
     * An endpoint for connecting using the Server Message Block (SMB) protocol.
     * </p>
     */
    private SvmEndpoint smb;

    /**
     * <p>
     * An endpoint for connecting using the Internet Small Computer Systems Interface (iSCSI) protocol.
     * </p>
     * 
     * @param iscsi
     *        An endpoint for connecting using the Internet Small Computer Systems Interface (iSCSI) protocol.
     */

    public void setIscsi(SvmEndpoint iscsi) {
        this.iscsi = iscsi;
    }

    /**
     * <p>
     * An endpoint for connecting using the Internet Small Computer Systems Interface (iSCSI) protocol.
     * </p>
     * 
     * @return An endpoint for connecting using the Internet Small Computer Systems Interface (iSCSI) protocol.
     */

    public SvmEndpoint getIscsi() {
        return this.iscsi;
    }

    /**
     * <p>
     * An endpoint for connecting using the Internet Small Computer Systems Interface (iSCSI) protocol.
     * </p>
     * 
     * @param iscsi
     *        An endpoint for connecting using the Internet Small Computer Systems Interface (iSCSI) protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SvmEndpoints withIscsi(SvmEndpoint iscsi) {
        setIscsi(iscsi);
        return this;
    }

    /**
     * <p>
     * An endpoint for managing SVMs using the NetApp ONTAP CLI, NetApp ONTAP API, or NetApp CloudManager.
     * </p>
     * 
     * @param management
     *        An endpoint for managing SVMs using the NetApp ONTAP CLI, NetApp ONTAP API, or NetApp CloudManager.
     */

    public void setManagement(SvmEndpoint management) {
        this.management = management;
    }

    /**
     * <p>
     * An endpoint for managing SVMs using the NetApp ONTAP CLI, NetApp ONTAP API, or NetApp CloudManager.
     * </p>
     * 
     * @return An endpoint for managing SVMs using the NetApp ONTAP CLI, NetApp ONTAP API, or NetApp CloudManager.
     */

    public SvmEndpoint getManagement() {
        return this.management;
    }

    /**
     * <p>
     * An endpoint for managing SVMs using the NetApp ONTAP CLI, NetApp ONTAP API, or NetApp CloudManager.
     * </p>
     * 
     * @param management
     *        An endpoint for managing SVMs using the NetApp ONTAP CLI, NetApp ONTAP API, or NetApp CloudManager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SvmEndpoints withManagement(SvmEndpoint management) {
        setManagement(management);
        return this;
    }

    /**
     * <p>
     * An endpoint for connecting using the Network File System (NFS) protocol.
     * </p>
     * 
     * @param nfs
     *        An endpoint for connecting using the Network File System (NFS) protocol.
     */

    public void setNfs(SvmEndpoint nfs) {
        this.nfs = nfs;
    }

    /**
     * <p>
     * An endpoint for connecting using the Network File System (NFS) protocol.
     * </p>
     * 
     * @return An endpoint for connecting using the Network File System (NFS) protocol.
     */

    public SvmEndpoint getNfs() {
        return this.nfs;
    }

    /**
     * <p>
     * An endpoint for connecting using the Network File System (NFS) protocol.
     * </p>
     * 
     * @param nfs
     *        An endpoint for connecting using the Network File System (NFS) protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SvmEndpoints withNfs(SvmEndpoint nfs) {
        setNfs(nfs);
        return this;
    }

    /**
     * <p>
     * An endpoint for connecting using the Server Message Block (SMB) protocol.
     * </p>
     * 
     * @param smb
     *        An endpoint for connecting using the Server Message Block (SMB) protocol.
     */

    public void setSmb(SvmEndpoint smb) {
        this.smb = smb;
    }

    /**
     * <p>
     * An endpoint for connecting using the Server Message Block (SMB) protocol.
     * </p>
     * 
     * @return An endpoint for connecting using the Server Message Block (SMB) protocol.
     */

    public SvmEndpoint getSmb() {
        return this.smb;
    }

    /**
     * <p>
     * An endpoint for connecting using the Server Message Block (SMB) protocol.
     * </p>
     * 
     * @param smb
     *        An endpoint for connecting using the Server Message Block (SMB) protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SvmEndpoints withSmb(SvmEndpoint smb) {
        setSmb(smb);
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
        if (getIscsi() != null)
            sb.append("Iscsi: ").append(getIscsi()).append(",");
        if (getManagement() != null)
            sb.append("Management: ").append(getManagement()).append(",");
        if (getNfs() != null)
            sb.append("Nfs: ").append(getNfs()).append(",");
        if (getSmb() != null)
            sb.append("Smb: ").append(getSmb());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SvmEndpoints == false)
            return false;
        SvmEndpoints other = (SvmEndpoints) obj;
        if (other.getIscsi() == null ^ this.getIscsi() == null)
            return false;
        if (other.getIscsi() != null && other.getIscsi().equals(this.getIscsi()) == false)
            return false;
        if (other.getManagement() == null ^ this.getManagement() == null)
            return false;
        if (other.getManagement() != null && other.getManagement().equals(this.getManagement()) == false)
            return false;
        if (other.getNfs() == null ^ this.getNfs() == null)
            return false;
        if (other.getNfs() != null && other.getNfs().equals(this.getNfs()) == false)
            return false;
        if (other.getSmb() == null ^ this.getSmb() == null)
            return false;
        if (other.getSmb() != null && other.getSmb().equals(this.getSmb()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIscsi() == null) ? 0 : getIscsi().hashCode());
        hashCode = prime * hashCode + ((getManagement() == null) ? 0 : getManagement().hashCode());
        hashCode = prime * hashCode + ((getNfs() == null) ? 0 : getNfs().hashCode());
        hashCode = prime * hashCode + ((getSmb() == null) ? 0 : getSmb().hashCode());
        return hashCode;
    }

    @Override
    public SvmEndpoints clone() {
        try {
            return (SvmEndpoints) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.SvmEndpointsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
