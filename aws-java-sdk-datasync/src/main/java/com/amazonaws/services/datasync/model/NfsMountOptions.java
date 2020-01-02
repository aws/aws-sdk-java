/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents the mount options that are available for DataSync to access an NFS location.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/NfsMountOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NfsMountOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The specific NFS version that you want DataSync to use to mount your NFS share. If the server refuses to use the
     * version specified, the sync will fail. If you don't specify a version, DataSync defaults to
     * <code>AUTOMATIC</code>. That is, DataSync automatically selects a version based on negotiation with the NFS
     * server.
     * </p>
     * <p>
     * You can specify the following NFS versions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <a href="https://tools.ietf.org/html/rfc1813">NFSv3</a> </b> - stateless protocol version that allows for
     * asynchronous writes on the server.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <a href="https://tools.ietf.org/html/rfc3530">NFSv4.0</a> </b> - stateful, firewall-friendly protocol version
     * that supports delegations and pseudo filesystems.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <a href="https://tools.ietf.org/html/rfc5661">NFSv4.1</a> </b> - stateful protocol version that supports
     * sessions, directory delegations, and parallel data processing. Version 4.1 also includes all features available
     * in version 4.0.
     * </p>
     * </li>
     * </ul>
     */
    private String version;

    /**
     * <p>
     * The specific NFS version that you want DataSync to use to mount your NFS share. If the server refuses to use the
     * version specified, the sync will fail. If you don't specify a version, DataSync defaults to
     * <code>AUTOMATIC</code>. That is, DataSync automatically selects a version based on negotiation with the NFS
     * server.
     * </p>
     * <p>
     * You can specify the following NFS versions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <a href="https://tools.ietf.org/html/rfc1813">NFSv3</a> </b> - stateless protocol version that allows for
     * asynchronous writes on the server.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <a href="https://tools.ietf.org/html/rfc3530">NFSv4.0</a> </b> - stateful, firewall-friendly protocol version
     * that supports delegations and pseudo filesystems.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <a href="https://tools.ietf.org/html/rfc5661">NFSv4.1</a> </b> - stateful protocol version that supports
     * sessions, directory delegations, and parallel data processing. Version 4.1 also includes all features available
     * in version 4.0.
     * </p>
     * </li>
     * </ul>
     * 
     * @param version
     *        The specific NFS version that you want DataSync to use to mount your NFS share. If the server refuses to
     *        use the version specified, the sync will fail. If you don't specify a version, DataSync defaults to
     *        <code>AUTOMATIC</code>. That is, DataSync automatically selects a version based on negotiation with the
     *        NFS server.</p>
     *        <p>
     *        You can specify the following NFS versions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <a href="https://tools.ietf.org/html/rfc1813">NFSv3</a> </b> - stateless protocol version that allows
     *        for asynchronous writes on the server.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <a href="https://tools.ietf.org/html/rfc3530">NFSv4.0</a> </b> - stateful, firewall-friendly protocol
     *        version that supports delegations and pseudo filesystems.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <a href="https://tools.ietf.org/html/rfc5661">NFSv4.1</a> </b> - stateful protocol version that
     *        supports sessions, directory delegations, and parallel data processing. Version 4.1 also includes all
     *        features available in version 4.0.
     *        </p>
     *        </li>
     * @see NfsVersion
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The specific NFS version that you want DataSync to use to mount your NFS share. If the server refuses to use the
     * version specified, the sync will fail. If you don't specify a version, DataSync defaults to
     * <code>AUTOMATIC</code>. That is, DataSync automatically selects a version based on negotiation with the NFS
     * server.
     * </p>
     * <p>
     * You can specify the following NFS versions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <a href="https://tools.ietf.org/html/rfc1813">NFSv3</a> </b> - stateless protocol version that allows for
     * asynchronous writes on the server.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <a href="https://tools.ietf.org/html/rfc3530">NFSv4.0</a> </b> - stateful, firewall-friendly protocol version
     * that supports delegations and pseudo filesystems.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <a href="https://tools.ietf.org/html/rfc5661">NFSv4.1</a> </b> - stateful protocol version that supports
     * sessions, directory delegations, and parallel data processing. Version 4.1 also includes all features available
     * in version 4.0.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The specific NFS version that you want DataSync to use to mount your NFS share. If the server refuses to
     *         use the version specified, the sync will fail. If you don't specify a version, DataSync defaults to
     *         <code>AUTOMATIC</code>. That is, DataSync automatically selects a version based on negotiation with the
     *         NFS server.</p>
     *         <p>
     *         You can specify the following NFS versions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <a href="https://tools.ietf.org/html/rfc1813">NFSv3</a> </b> - stateless protocol version that allows
     *         for asynchronous writes on the server.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <a href="https://tools.ietf.org/html/rfc3530">NFSv4.0</a> </b> - stateful, firewall-friendly protocol
     *         version that supports delegations and pseudo filesystems.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <a href="https://tools.ietf.org/html/rfc5661">NFSv4.1</a> </b> - stateful protocol version that
     *         supports sessions, directory delegations, and parallel data processing. Version 4.1 also includes all
     *         features available in version 4.0.
     *         </p>
     *         </li>
     * @see NfsVersion
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The specific NFS version that you want DataSync to use to mount your NFS share. If the server refuses to use the
     * version specified, the sync will fail. If you don't specify a version, DataSync defaults to
     * <code>AUTOMATIC</code>. That is, DataSync automatically selects a version based on negotiation with the NFS
     * server.
     * </p>
     * <p>
     * You can specify the following NFS versions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <a href="https://tools.ietf.org/html/rfc1813">NFSv3</a> </b> - stateless protocol version that allows for
     * asynchronous writes on the server.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <a href="https://tools.ietf.org/html/rfc3530">NFSv4.0</a> </b> - stateful, firewall-friendly protocol version
     * that supports delegations and pseudo filesystems.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <a href="https://tools.ietf.org/html/rfc5661">NFSv4.1</a> </b> - stateful protocol version that supports
     * sessions, directory delegations, and parallel data processing. Version 4.1 also includes all features available
     * in version 4.0.
     * </p>
     * </li>
     * </ul>
     * 
     * @param version
     *        The specific NFS version that you want DataSync to use to mount your NFS share. If the server refuses to
     *        use the version specified, the sync will fail. If you don't specify a version, DataSync defaults to
     *        <code>AUTOMATIC</code>. That is, DataSync automatically selects a version based on negotiation with the
     *        NFS server.</p>
     *        <p>
     *        You can specify the following NFS versions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <a href="https://tools.ietf.org/html/rfc1813">NFSv3</a> </b> - stateless protocol version that allows
     *        for asynchronous writes on the server.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <a href="https://tools.ietf.org/html/rfc3530">NFSv4.0</a> </b> - stateful, firewall-friendly protocol
     *        version that supports delegations and pseudo filesystems.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <a href="https://tools.ietf.org/html/rfc5661">NFSv4.1</a> </b> - stateful protocol version that
     *        supports sessions, directory delegations, and parallel data processing. Version 4.1 also includes all
     *        features available in version 4.0.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NfsVersion
     */

    public NfsMountOptions withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The specific NFS version that you want DataSync to use to mount your NFS share. If the server refuses to use the
     * version specified, the sync will fail. If you don't specify a version, DataSync defaults to
     * <code>AUTOMATIC</code>. That is, DataSync automatically selects a version based on negotiation with the NFS
     * server.
     * </p>
     * <p>
     * You can specify the following NFS versions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <a href="https://tools.ietf.org/html/rfc1813">NFSv3</a> </b> - stateless protocol version that allows for
     * asynchronous writes on the server.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <a href="https://tools.ietf.org/html/rfc3530">NFSv4.0</a> </b> - stateful, firewall-friendly protocol version
     * that supports delegations and pseudo filesystems.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <a href="https://tools.ietf.org/html/rfc5661">NFSv4.1</a> </b> - stateful protocol version that supports
     * sessions, directory delegations, and parallel data processing. Version 4.1 also includes all features available
     * in version 4.0.
     * </p>
     * </li>
     * </ul>
     * 
     * @param version
     *        The specific NFS version that you want DataSync to use to mount your NFS share. If the server refuses to
     *        use the version specified, the sync will fail. If you don't specify a version, DataSync defaults to
     *        <code>AUTOMATIC</code>. That is, DataSync automatically selects a version based on negotiation with the
     *        NFS server.</p>
     *        <p>
     *        You can specify the following NFS versions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <a href="https://tools.ietf.org/html/rfc1813">NFSv3</a> </b> - stateless protocol version that allows
     *        for asynchronous writes on the server.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <a href="https://tools.ietf.org/html/rfc3530">NFSv4.0</a> </b> - stateful, firewall-friendly protocol
     *        version that supports delegations and pseudo filesystems.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <a href="https://tools.ietf.org/html/rfc5661">NFSv4.1</a> </b> - stateful protocol version that
     *        supports sessions, directory delegations, and parallel data processing. Version 4.1 also includes all
     *        features available in version 4.0.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NfsVersion
     */

    public NfsMountOptions withVersion(NfsVersion version) {
        this.version = version.toString();
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NfsMountOptions == false)
            return false;
        NfsMountOptions other = (NfsMountOptions) obj;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public NfsMountOptions clone() {
        try {
            return (NfsMountOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.NfsMountOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
