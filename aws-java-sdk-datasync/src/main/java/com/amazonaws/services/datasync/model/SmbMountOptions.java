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
 * Specifies the version of the Server Message Block (SMB) protocol that DataSync uses to access an SMB file server.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/SmbMountOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SmbMountOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * By default, DataSync automatically chooses an SMB protocol version based on negotiation with your SMB file
     * server. You also can configure DataSync to use a specific SMB version, but we recommend doing this only if
     * DataSync has trouble negotiating with the SMB file server automatically.
     * </p>
     * <p>
     * These are the following options for configuring the SMB version:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AUTOMATIC</code> (default): DataSync and the SMB file server negotiate the highest version of SMB that they
     * mutually support between 2.1 and 3.1.1.
     * </p>
     * <p>
     * This is the recommended option. If you instead choose a specific version that your file server doesn't support,
     * you may get an <code>Operation Not Supported</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMB3</code>: Restricts the protocol negotiation to only SMB version 3.0.2.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMB2</code>: Restricts the protocol negotiation to only SMB version 2.1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMB2_0</code>: Restricts the protocol negotiation to only SMB version 2.0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMB1</code>: Restricts the protocol negotiation to only SMB version 1.0.
     * </p>
     * <note>
     * <p>
     * The <code>SMB1</code> option isn't available when <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateLocationFsxOntap.html">creating an Amazon
     * FSx for NetApp ONTAP location</a>.
     * </p>
     * </note></li>
     * </ul>
     */
    private String version;

    /**
     * <p>
     * By default, DataSync automatically chooses an SMB protocol version based on negotiation with your SMB file
     * server. You also can configure DataSync to use a specific SMB version, but we recommend doing this only if
     * DataSync has trouble negotiating with the SMB file server automatically.
     * </p>
     * <p>
     * These are the following options for configuring the SMB version:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AUTOMATIC</code> (default): DataSync and the SMB file server negotiate the highest version of SMB that they
     * mutually support between 2.1 and 3.1.1.
     * </p>
     * <p>
     * This is the recommended option. If you instead choose a specific version that your file server doesn't support,
     * you may get an <code>Operation Not Supported</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMB3</code>: Restricts the protocol negotiation to only SMB version 3.0.2.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMB2</code>: Restricts the protocol negotiation to only SMB version 2.1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMB2_0</code>: Restricts the protocol negotiation to only SMB version 2.0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMB1</code>: Restricts the protocol negotiation to only SMB version 1.0.
     * </p>
     * <note>
     * <p>
     * The <code>SMB1</code> option isn't available when <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateLocationFsxOntap.html">creating an Amazon
     * FSx for NetApp ONTAP location</a>.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param version
     *        By default, DataSync automatically chooses an SMB protocol version based on negotiation with your SMB file
     *        server. You also can configure DataSync to use a specific SMB version, but we recommend doing this only if
     *        DataSync has trouble negotiating with the SMB file server automatically.</p>
     *        <p>
     *        These are the following options for configuring the SMB version:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AUTOMATIC</code> (default): DataSync and the SMB file server negotiate the highest version of SMB
     *        that they mutually support between 2.1 and 3.1.1.
     *        </p>
     *        <p>
     *        This is the recommended option. If you instead choose a specific version that your file server doesn't
     *        support, you may get an <code>Operation Not Supported</code> error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SMB3</code>: Restricts the protocol negotiation to only SMB version 3.0.2.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SMB2</code>: Restricts the protocol negotiation to only SMB version 2.1.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SMB2_0</code>: Restricts the protocol negotiation to only SMB version 2.0.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SMB1</code>: Restricts the protocol negotiation to only SMB version 1.0.
     *        </p>
     *        <note>
     *        <p>
     *        The <code>SMB1</code> option isn't available when <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateLocationFsxOntap.html">creating an
     *        Amazon FSx for NetApp ONTAP location</a>.
     *        </p>
     *        </note></li>
     * @see SmbVersion
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * By default, DataSync automatically chooses an SMB protocol version based on negotiation with your SMB file
     * server. You also can configure DataSync to use a specific SMB version, but we recommend doing this only if
     * DataSync has trouble negotiating with the SMB file server automatically.
     * </p>
     * <p>
     * These are the following options for configuring the SMB version:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AUTOMATIC</code> (default): DataSync and the SMB file server negotiate the highest version of SMB that they
     * mutually support between 2.1 and 3.1.1.
     * </p>
     * <p>
     * This is the recommended option. If you instead choose a specific version that your file server doesn't support,
     * you may get an <code>Operation Not Supported</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMB3</code>: Restricts the protocol negotiation to only SMB version 3.0.2.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMB2</code>: Restricts the protocol negotiation to only SMB version 2.1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMB2_0</code>: Restricts the protocol negotiation to only SMB version 2.0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMB1</code>: Restricts the protocol negotiation to only SMB version 1.0.
     * </p>
     * <note>
     * <p>
     * The <code>SMB1</code> option isn't available when <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateLocationFsxOntap.html">creating an Amazon
     * FSx for NetApp ONTAP location</a>.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @return By default, DataSync automatically chooses an SMB protocol version based on negotiation with your SMB
     *         file server. You also can configure DataSync to use a specific SMB version, but we recommend doing this
     *         only if DataSync has trouble negotiating with the SMB file server automatically.</p>
     *         <p>
     *         These are the following options for configuring the SMB version:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AUTOMATIC</code> (default): DataSync and the SMB file server negotiate the highest version of SMB
     *         that they mutually support between 2.1 and 3.1.1.
     *         </p>
     *         <p>
     *         This is the recommended option. If you instead choose a specific version that your file server doesn't
     *         support, you may get an <code>Operation Not Supported</code> error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SMB3</code>: Restricts the protocol negotiation to only SMB version 3.0.2.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SMB2</code>: Restricts the protocol negotiation to only SMB version 2.1.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SMB2_0</code>: Restricts the protocol negotiation to only SMB version 2.0.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SMB1</code>: Restricts the protocol negotiation to only SMB version 1.0.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>SMB1</code> option isn't available when <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateLocationFsxOntap.html">creating an
     *         Amazon FSx for NetApp ONTAP location</a>.
     *         </p>
     *         </note></li>
     * @see SmbVersion
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * By default, DataSync automatically chooses an SMB protocol version based on negotiation with your SMB file
     * server. You also can configure DataSync to use a specific SMB version, but we recommend doing this only if
     * DataSync has trouble negotiating with the SMB file server automatically.
     * </p>
     * <p>
     * These are the following options for configuring the SMB version:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AUTOMATIC</code> (default): DataSync and the SMB file server negotiate the highest version of SMB that they
     * mutually support between 2.1 and 3.1.1.
     * </p>
     * <p>
     * This is the recommended option. If you instead choose a specific version that your file server doesn't support,
     * you may get an <code>Operation Not Supported</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMB3</code>: Restricts the protocol negotiation to only SMB version 3.0.2.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMB2</code>: Restricts the protocol negotiation to only SMB version 2.1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMB2_0</code>: Restricts the protocol negotiation to only SMB version 2.0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMB1</code>: Restricts the protocol negotiation to only SMB version 1.0.
     * </p>
     * <note>
     * <p>
     * The <code>SMB1</code> option isn't available when <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateLocationFsxOntap.html">creating an Amazon
     * FSx for NetApp ONTAP location</a>.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param version
     *        By default, DataSync automatically chooses an SMB protocol version based on negotiation with your SMB file
     *        server. You also can configure DataSync to use a specific SMB version, but we recommend doing this only if
     *        DataSync has trouble negotiating with the SMB file server automatically.</p>
     *        <p>
     *        These are the following options for configuring the SMB version:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AUTOMATIC</code> (default): DataSync and the SMB file server negotiate the highest version of SMB
     *        that they mutually support between 2.1 and 3.1.1.
     *        </p>
     *        <p>
     *        This is the recommended option. If you instead choose a specific version that your file server doesn't
     *        support, you may get an <code>Operation Not Supported</code> error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SMB3</code>: Restricts the protocol negotiation to only SMB version 3.0.2.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SMB2</code>: Restricts the protocol negotiation to only SMB version 2.1.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SMB2_0</code>: Restricts the protocol negotiation to only SMB version 2.0.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SMB1</code>: Restricts the protocol negotiation to only SMB version 1.0.
     *        </p>
     *        <note>
     *        <p>
     *        The <code>SMB1</code> option isn't available when <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateLocationFsxOntap.html">creating an
     *        Amazon FSx for NetApp ONTAP location</a>.
     *        </p>
     *        </note></li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SmbVersion
     */

    public SmbMountOptions withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * By default, DataSync automatically chooses an SMB protocol version based on negotiation with your SMB file
     * server. You also can configure DataSync to use a specific SMB version, but we recommend doing this only if
     * DataSync has trouble negotiating with the SMB file server automatically.
     * </p>
     * <p>
     * These are the following options for configuring the SMB version:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AUTOMATIC</code> (default): DataSync and the SMB file server negotiate the highest version of SMB that they
     * mutually support between 2.1 and 3.1.1.
     * </p>
     * <p>
     * This is the recommended option. If you instead choose a specific version that your file server doesn't support,
     * you may get an <code>Operation Not Supported</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMB3</code>: Restricts the protocol negotiation to only SMB version 3.0.2.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMB2</code>: Restricts the protocol negotiation to only SMB version 2.1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMB2_0</code>: Restricts the protocol negotiation to only SMB version 2.0.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMB1</code>: Restricts the protocol negotiation to only SMB version 1.0.
     * </p>
     * <note>
     * <p>
     * The <code>SMB1</code> option isn't available when <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateLocationFsxOntap.html">creating an Amazon
     * FSx for NetApp ONTAP location</a>.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param version
     *        By default, DataSync automatically chooses an SMB protocol version based on negotiation with your SMB file
     *        server. You also can configure DataSync to use a specific SMB version, but we recommend doing this only if
     *        DataSync has trouble negotiating with the SMB file server automatically.</p>
     *        <p>
     *        These are the following options for configuring the SMB version:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AUTOMATIC</code> (default): DataSync and the SMB file server negotiate the highest version of SMB
     *        that they mutually support between 2.1 and 3.1.1.
     *        </p>
     *        <p>
     *        This is the recommended option. If you instead choose a specific version that your file server doesn't
     *        support, you may get an <code>Operation Not Supported</code> error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SMB3</code>: Restricts the protocol negotiation to only SMB version 3.0.2.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SMB2</code>: Restricts the protocol negotiation to only SMB version 2.1.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SMB2_0</code>: Restricts the protocol negotiation to only SMB version 2.0.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SMB1</code>: Restricts the protocol negotiation to only SMB version 1.0.
     *        </p>
     *        <note>
     *        <p>
     *        The <code>SMB1</code> option isn't available when <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateLocationFsxOntap.html">creating an
     *        Amazon FSx for NetApp ONTAP location</a>.
     *        </p>
     *        </note></li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SmbVersion
     */

    public SmbMountOptions withVersion(SmbVersion version) {
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

        if (obj instanceof SmbMountOptions == false)
            return false;
        SmbMountOptions other = (SmbMountOptions) obj;
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
    public SmbMountOptions clone() {
        try {
            return (SmbMountOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.SmbMountOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
