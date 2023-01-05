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
 * Specifies the data transfer protocol that DataSync uses to access your Amazon FSx file system.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/FsxProtocol" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FsxProtocol implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the Network File System (NFS) protocol configuration that DataSync uses to access your FSx for OpenZFS
     * file system or FSx for ONTAP file system's storage virtual machine (SVM).
     * </p>
     */
    private FsxProtocolNfs nFS;
    /**
     * <p>
     * Specifies the Server Message Block (SMB) protocol configuration that DataSync uses to access your FSx for ONTAP
     * file system's SVM.
     * </p>
     */
    private FsxProtocolSmb sMB;

    /**
     * <p>
     * Specifies the Network File System (NFS) protocol configuration that DataSync uses to access your FSx for OpenZFS
     * file system or FSx for ONTAP file system's storage virtual machine (SVM).
     * </p>
     * 
     * @param nFS
     *        Specifies the Network File System (NFS) protocol configuration that DataSync uses to access your FSx for
     *        OpenZFS file system or FSx for ONTAP file system's storage virtual machine (SVM).
     */

    public void setNFS(FsxProtocolNfs nFS) {
        this.nFS = nFS;
    }

    /**
     * <p>
     * Specifies the Network File System (NFS) protocol configuration that DataSync uses to access your FSx for OpenZFS
     * file system or FSx for ONTAP file system's storage virtual machine (SVM).
     * </p>
     * 
     * @return Specifies the Network File System (NFS) protocol configuration that DataSync uses to access your FSx for
     *         OpenZFS file system or FSx for ONTAP file system's storage virtual machine (SVM).
     */

    public FsxProtocolNfs getNFS() {
        return this.nFS;
    }

    /**
     * <p>
     * Specifies the Network File System (NFS) protocol configuration that DataSync uses to access your FSx for OpenZFS
     * file system or FSx for ONTAP file system's storage virtual machine (SVM).
     * </p>
     * 
     * @param nFS
     *        Specifies the Network File System (NFS) protocol configuration that DataSync uses to access your FSx for
     *        OpenZFS file system or FSx for ONTAP file system's storage virtual machine (SVM).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FsxProtocol withNFS(FsxProtocolNfs nFS) {
        setNFS(nFS);
        return this;
    }

    /**
     * <p>
     * Specifies the Server Message Block (SMB) protocol configuration that DataSync uses to access your FSx for ONTAP
     * file system's SVM.
     * </p>
     * 
     * @param sMB
     *        Specifies the Server Message Block (SMB) protocol configuration that DataSync uses to access your FSx for
     *        ONTAP file system's SVM.
     */

    public void setSMB(FsxProtocolSmb sMB) {
        this.sMB = sMB;
    }

    /**
     * <p>
     * Specifies the Server Message Block (SMB) protocol configuration that DataSync uses to access your FSx for ONTAP
     * file system's SVM.
     * </p>
     * 
     * @return Specifies the Server Message Block (SMB) protocol configuration that DataSync uses to access your FSx for
     *         ONTAP file system's SVM.
     */

    public FsxProtocolSmb getSMB() {
        return this.sMB;
    }

    /**
     * <p>
     * Specifies the Server Message Block (SMB) protocol configuration that DataSync uses to access your FSx for ONTAP
     * file system's SVM.
     * </p>
     * 
     * @param sMB
     *        Specifies the Server Message Block (SMB) protocol configuration that DataSync uses to access your FSx for
     *        ONTAP file system's SVM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FsxProtocol withSMB(FsxProtocolSmb sMB) {
        setSMB(sMB);
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
        if (getNFS() != null)
            sb.append("NFS: ").append(getNFS()).append(",");
        if (getSMB() != null)
            sb.append("SMB: ").append(getSMB());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FsxProtocol == false)
            return false;
        FsxProtocol other = (FsxProtocol) obj;
        if (other.getNFS() == null ^ this.getNFS() == null)
            return false;
        if (other.getNFS() != null && other.getNFS().equals(this.getNFS()) == false)
            return false;
        if (other.getSMB() == null ^ this.getSMB() == null)
            return false;
        if (other.getSMB() != null && other.getSMB().equals(this.getSMB()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNFS() == null) ? 0 : getNFS().hashCode());
        hashCode = prime * hashCode + ((getSMB() == null) ? 0 : getSMB().hashCode());
        return hashCode;
    }

    @Override
    public FsxProtocol clone() {
        try {
            return (FsxProtocol) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.FsxProtocolMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
