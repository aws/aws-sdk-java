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
 * Specifies how DataSync can access a location using the NFS protocol.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/NfsMountOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NfsMountOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the NFS version that you want DataSync to use when mounting your NFS share. If the server refuses to
     * use the version specified, the task fails.
     * </p>
     * <p>
     * You can specify the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AUTOMATIC</code> (default): DataSync chooses NFS version 4.1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NFS3</code>: Stateless protocol version that allows for asynchronous writes on the server.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NFSv4_0</code>: Stateful, firewall-friendly protocol version that supports delegations and pseudo file
     * systems.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NFSv4_1</code>: Stateful protocol version that supports sessions, directory delegations, and parallel data
     * processing. NFS version 4.1 also includes all features available in version 4.0.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * DataSync currently only supports NFS version 3 with Amazon FSx for NetApp ONTAP locations.
     * </p>
     * </note>
     */
    private String version;

    /**
     * <p>
     * Specifies the NFS version that you want DataSync to use when mounting your NFS share. If the server refuses to
     * use the version specified, the task fails.
     * </p>
     * <p>
     * You can specify the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AUTOMATIC</code> (default): DataSync chooses NFS version 4.1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NFS3</code>: Stateless protocol version that allows for asynchronous writes on the server.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NFSv4_0</code>: Stateful, firewall-friendly protocol version that supports delegations and pseudo file
     * systems.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NFSv4_1</code>: Stateful protocol version that supports sessions, directory delegations, and parallel data
     * processing. NFS version 4.1 also includes all features available in version 4.0.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * DataSync currently only supports NFS version 3 with Amazon FSx for NetApp ONTAP locations.
     * </p>
     * </note>
     * 
     * @param version
     *        Specifies the NFS version that you want DataSync to use when mounting your NFS share. If the server
     *        refuses to use the version specified, the task fails.</p>
     *        <p>
     *        You can specify the following options:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AUTOMATIC</code> (default): DataSync chooses NFS version 4.1.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NFS3</code>: Stateless protocol version that allows for asynchronous writes on the server.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NFSv4_0</code>: Stateful, firewall-friendly protocol version that supports delegations and pseudo
     *        file systems.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NFSv4_1</code>: Stateful protocol version that supports sessions, directory delegations, and
     *        parallel data processing. NFS version 4.1 also includes all features available in version 4.0.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        DataSync currently only supports NFS version 3 with Amazon FSx for NetApp ONTAP locations.
     *        </p>
     * @see NfsVersion
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * Specifies the NFS version that you want DataSync to use when mounting your NFS share. If the server refuses to
     * use the version specified, the task fails.
     * </p>
     * <p>
     * You can specify the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AUTOMATIC</code> (default): DataSync chooses NFS version 4.1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NFS3</code>: Stateless protocol version that allows for asynchronous writes on the server.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NFSv4_0</code>: Stateful, firewall-friendly protocol version that supports delegations and pseudo file
     * systems.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NFSv4_1</code>: Stateful protocol version that supports sessions, directory delegations, and parallel data
     * processing. NFS version 4.1 also includes all features available in version 4.0.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * DataSync currently only supports NFS version 3 with Amazon FSx for NetApp ONTAP locations.
     * </p>
     * </note>
     * 
     * @return Specifies the NFS version that you want DataSync to use when mounting your NFS share. If the server
     *         refuses to use the version specified, the task fails.</p>
     *         <p>
     *         You can specify the following options:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AUTOMATIC</code> (default): DataSync chooses NFS version 4.1.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NFS3</code>: Stateless protocol version that allows for asynchronous writes on the server.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NFSv4_0</code>: Stateful, firewall-friendly protocol version that supports delegations and pseudo
     *         file systems.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NFSv4_1</code>: Stateful protocol version that supports sessions, directory delegations, and
     *         parallel data processing. NFS version 4.1 also includes all features available in version 4.0.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         DataSync currently only supports NFS version 3 with Amazon FSx for NetApp ONTAP locations.
     *         </p>
     * @see NfsVersion
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * Specifies the NFS version that you want DataSync to use when mounting your NFS share. If the server refuses to
     * use the version specified, the task fails.
     * </p>
     * <p>
     * You can specify the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AUTOMATIC</code> (default): DataSync chooses NFS version 4.1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NFS3</code>: Stateless protocol version that allows for asynchronous writes on the server.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NFSv4_0</code>: Stateful, firewall-friendly protocol version that supports delegations and pseudo file
     * systems.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NFSv4_1</code>: Stateful protocol version that supports sessions, directory delegations, and parallel data
     * processing. NFS version 4.1 also includes all features available in version 4.0.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * DataSync currently only supports NFS version 3 with Amazon FSx for NetApp ONTAP locations.
     * </p>
     * </note>
     * 
     * @param version
     *        Specifies the NFS version that you want DataSync to use when mounting your NFS share. If the server
     *        refuses to use the version specified, the task fails.</p>
     *        <p>
     *        You can specify the following options:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AUTOMATIC</code> (default): DataSync chooses NFS version 4.1.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NFS3</code>: Stateless protocol version that allows for asynchronous writes on the server.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NFSv4_0</code>: Stateful, firewall-friendly protocol version that supports delegations and pseudo
     *        file systems.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NFSv4_1</code>: Stateful protocol version that supports sessions, directory delegations, and
     *        parallel data processing. NFS version 4.1 also includes all features available in version 4.0.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        DataSync currently only supports NFS version 3 with Amazon FSx for NetApp ONTAP locations.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NfsVersion
     */

    public NfsMountOptions withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * Specifies the NFS version that you want DataSync to use when mounting your NFS share. If the server refuses to
     * use the version specified, the task fails.
     * </p>
     * <p>
     * You can specify the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AUTOMATIC</code> (default): DataSync chooses NFS version 4.1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NFS3</code>: Stateless protocol version that allows for asynchronous writes on the server.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NFSv4_0</code>: Stateful, firewall-friendly protocol version that supports delegations and pseudo file
     * systems.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NFSv4_1</code>: Stateful protocol version that supports sessions, directory delegations, and parallel data
     * processing. NFS version 4.1 also includes all features available in version 4.0.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * DataSync currently only supports NFS version 3 with Amazon FSx for NetApp ONTAP locations.
     * </p>
     * </note>
     * 
     * @param version
     *        Specifies the NFS version that you want DataSync to use when mounting your NFS share. If the server
     *        refuses to use the version specified, the task fails.</p>
     *        <p>
     *        You can specify the following options:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AUTOMATIC</code> (default): DataSync chooses NFS version 4.1.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NFS3</code>: Stateless protocol version that allows for asynchronous writes on the server.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NFSv4_0</code>: Stateful, firewall-friendly protocol version that supports delegations and pseudo
     *        file systems.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NFSv4_1</code>: Stateful protocol version that supports sessions, directory delegations, and
     *        parallel data processing. NFS version 4.1 also includes all features available in version 4.0.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        DataSync currently only supports NFS version 3 with Amazon FSx for NetApp ONTAP locations.
     *        </p>
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
