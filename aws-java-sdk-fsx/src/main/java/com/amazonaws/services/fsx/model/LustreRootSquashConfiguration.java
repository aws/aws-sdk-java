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
 * The configuration for Lustre root squash used to restrict root-level access from clients that try to access your FSx
 * for Lustre file system as root. Use the <code>RootSquash</code> parameter to enable root squash. To learn more about
 * Lustre root squash, see <a href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/root-squash.html">Lustre root
 * squash</a>.
 * </p>
 * <p>
 * You can also use the <code>NoSquashNids</code> parameter to provide an array of clients who are not affected by the
 * root squash setting. These clients will access the file system as root, with unrestricted privileges.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/LustreRootSquashConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LustreRootSquashConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * You enable root squash by setting a user ID (UID) and group ID (GID) for the file system in the format
     * <code>UID:GID</code> (for example, <code>365534:65534</code>). The UID and GID values can range from
     * <code>0</code> to <code>4294967294</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A non-zero value for UID and GID enables root squash. The UID and GID values can be different, but each must be a
     * non-zero value.
     * </p>
     * </li>
     * <li>
     * <p>
     * A value of <code>0</code> (zero) for UID and GID indicates root, and therefore disables root squash.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When root squash is enabled, the user ID and group ID of a root user accessing the file system are re-mapped to
     * the UID and GID you provide.
     * </p>
     */
    private String rootSquash;
    /**
     * <p>
     * When root squash is enabled, you can optionally specify an array of NIDs of clients for which root squash does
     * not apply. A client NID is a Lustre Network Identifier used to uniquely identify a client. You can specify the
     * NID as either a single address or a range of addresses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A single address is described in standard Lustre NID format by specifying the client’s IP address followed by the
     * Lustre network ID (for example, <code>10.0.1.6@tcp</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * An address range is described using a dash to separate the range (for example,
     * <code>10.0.[2-10].[1-255]@tcp</code>).
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> noSquashNids;

    /**
     * <p>
     * You enable root squash by setting a user ID (UID) and group ID (GID) for the file system in the format
     * <code>UID:GID</code> (for example, <code>365534:65534</code>). The UID and GID values can range from
     * <code>0</code> to <code>4294967294</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A non-zero value for UID and GID enables root squash. The UID and GID values can be different, but each must be a
     * non-zero value.
     * </p>
     * </li>
     * <li>
     * <p>
     * A value of <code>0</code> (zero) for UID and GID indicates root, and therefore disables root squash.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When root squash is enabled, the user ID and group ID of a root user accessing the file system are re-mapped to
     * the UID and GID you provide.
     * </p>
     * 
     * @param rootSquash
     *        You enable root squash by setting a user ID (UID) and group ID (GID) for the file system in the format
     *        <code>UID:GID</code> (for example, <code>365534:65534</code>). The UID and GID values can range from
     *        <code>0</code> to <code>4294967294</code>:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        A non-zero value for UID and GID enables root squash. The UID and GID values can be different, but each
     *        must be a non-zero value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A value of <code>0</code> (zero) for UID and GID indicates root, and therefore disables root squash.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When root squash is enabled, the user ID and group ID of a root user accessing the file system are
     *        re-mapped to the UID and GID you provide.
     */

    public void setRootSquash(String rootSquash) {
        this.rootSquash = rootSquash;
    }

    /**
     * <p>
     * You enable root squash by setting a user ID (UID) and group ID (GID) for the file system in the format
     * <code>UID:GID</code> (for example, <code>365534:65534</code>). The UID and GID values can range from
     * <code>0</code> to <code>4294967294</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A non-zero value for UID and GID enables root squash. The UID and GID values can be different, but each must be a
     * non-zero value.
     * </p>
     * </li>
     * <li>
     * <p>
     * A value of <code>0</code> (zero) for UID and GID indicates root, and therefore disables root squash.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When root squash is enabled, the user ID and group ID of a root user accessing the file system are re-mapped to
     * the UID and GID you provide.
     * </p>
     * 
     * @return You enable root squash by setting a user ID (UID) and group ID (GID) for the file system in the format
     *         <code>UID:GID</code> (for example, <code>365534:65534</code>). The UID and GID values can range from
     *         <code>0</code> to <code>4294967294</code>:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         A non-zero value for UID and GID enables root squash. The UID and GID values can be different, but each
     *         must be a non-zero value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A value of <code>0</code> (zero) for UID and GID indicates root, and therefore disables root squash.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When root squash is enabled, the user ID and group ID of a root user accessing the file system are
     *         re-mapped to the UID and GID you provide.
     */

    public String getRootSquash() {
        return this.rootSquash;
    }

    /**
     * <p>
     * You enable root squash by setting a user ID (UID) and group ID (GID) for the file system in the format
     * <code>UID:GID</code> (for example, <code>365534:65534</code>). The UID and GID values can range from
     * <code>0</code> to <code>4294967294</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A non-zero value for UID and GID enables root squash. The UID and GID values can be different, but each must be a
     * non-zero value.
     * </p>
     * </li>
     * <li>
     * <p>
     * A value of <code>0</code> (zero) for UID and GID indicates root, and therefore disables root squash.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When root squash is enabled, the user ID and group ID of a root user accessing the file system are re-mapped to
     * the UID and GID you provide.
     * </p>
     * 
     * @param rootSquash
     *        You enable root squash by setting a user ID (UID) and group ID (GID) for the file system in the format
     *        <code>UID:GID</code> (for example, <code>365534:65534</code>). The UID and GID values can range from
     *        <code>0</code> to <code>4294967294</code>:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        A non-zero value for UID and GID enables root squash. The UID and GID values can be different, but each
     *        must be a non-zero value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A value of <code>0</code> (zero) for UID and GID indicates root, and therefore disables root squash.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When root squash is enabled, the user ID and group ID of a root user accessing the file system are
     *        re-mapped to the UID and GID you provide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LustreRootSquashConfiguration withRootSquash(String rootSquash) {
        setRootSquash(rootSquash);
        return this;
    }

    /**
     * <p>
     * When root squash is enabled, you can optionally specify an array of NIDs of clients for which root squash does
     * not apply. A client NID is a Lustre Network Identifier used to uniquely identify a client. You can specify the
     * NID as either a single address or a range of addresses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A single address is described in standard Lustre NID format by specifying the client’s IP address followed by the
     * Lustre network ID (for example, <code>10.0.1.6@tcp</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * An address range is described using a dash to separate the range (for example,
     * <code>10.0.[2-10].[1-255]@tcp</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @return When root squash is enabled, you can optionally specify an array of NIDs of clients for which root squash
     *         does not apply. A client NID is a Lustre Network Identifier used to uniquely identify a client. You can
     *         specify the NID as either a single address or a range of addresses:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         A single address is described in standard Lustre NID format by specifying the client’s IP address
     *         followed by the Lustre network ID (for example, <code>10.0.1.6@tcp</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An address range is described using a dash to separate the range (for example,
     *         <code>10.0.[2-10].[1-255]@tcp</code>).
     *         </p>
     *         </li>
     */

    public java.util.List<String> getNoSquashNids() {
        return noSquashNids;
    }

    /**
     * <p>
     * When root squash is enabled, you can optionally specify an array of NIDs of clients for which root squash does
     * not apply. A client NID is a Lustre Network Identifier used to uniquely identify a client. You can specify the
     * NID as either a single address or a range of addresses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A single address is described in standard Lustre NID format by specifying the client’s IP address followed by the
     * Lustre network ID (for example, <code>10.0.1.6@tcp</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * An address range is described using a dash to separate the range (for example,
     * <code>10.0.[2-10].[1-255]@tcp</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param noSquashNids
     *        When root squash is enabled, you can optionally specify an array of NIDs of clients for which root squash
     *        does not apply. A client NID is a Lustre Network Identifier used to uniquely identify a client. You can
     *        specify the NID as either a single address or a range of addresses:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        A single address is described in standard Lustre NID format by specifying the client’s IP address followed
     *        by the Lustre network ID (for example, <code>10.0.1.6@tcp</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An address range is described using a dash to separate the range (for example,
     *        <code>10.0.[2-10].[1-255]@tcp</code>).
     *        </p>
     *        </li>
     */

    public void setNoSquashNids(java.util.Collection<String> noSquashNids) {
        if (noSquashNids == null) {
            this.noSquashNids = null;
            return;
        }

        this.noSquashNids = new java.util.ArrayList<String>(noSquashNids);
    }

    /**
     * <p>
     * When root squash is enabled, you can optionally specify an array of NIDs of clients for which root squash does
     * not apply. A client NID is a Lustre Network Identifier used to uniquely identify a client. You can specify the
     * NID as either a single address or a range of addresses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A single address is described in standard Lustre NID format by specifying the client’s IP address followed by the
     * Lustre network ID (for example, <code>10.0.1.6@tcp</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * An address range is described using a dash to separate the range (for example,
     * <code>10.0.[2-10].[1-255]@tcp</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNoSquashNids(java.util.Collection)} or {@link #withNoSquashNids(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param noSquashNids
     *        When root squash is enabled, you can optionally specify an array of NIDs of clients for which root squash
     *        does not apply. A client NID is a Lustre Network Identifier used to uniquely identify a client. You can
     *        specify the NID as either a single address or a range of addresses:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        A single address is described in standard Lustre NID format by specifying the client’s IP address followed
     *        by the Lustre network ID (for example, <code>10.0.1.6@tcp</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An address range is described using a dash to separate the range (for example,
     *        <code>10.0.[2-10].[1-255]@tcp</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LustreRootSquashConfiguration withNoSquashNids(String... noSquashNids) {
        if (this.noSquashNids == null) {
            setNoSquashNids(new java.util.ArrayList<String>(noSquashNids.length));
        }
        for (String ele : noSquashNids) {
            this.noSquashNids.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * When root squash is enabled, you can optionally specify an array of NIDs of clients for which root squash does
     * not apply. A client NID is a Lustre Network Identifier used to uniquely identify a client. You can specify the
     * NID as either a single address or a range of addresses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A single address is described in standard Lustre NID format by specifying the client’s IP address followed by the
     * Lustre network ID (for example, <code>10.0.1.6@tcp</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * An address range is described using a dash to separate the range (for example,
     * <code>10.0.[2-10].[1-255]@tcp</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param noSquashNids
     *        When root squash is enabled, you can optionally specify an array of NIDs of clients for which root squash
     *        does not apply. A client NID is a Lustre Network Identifier used to uniquely identify a client. You can
     *        specify the NID as either a single address or a range of addresses:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        A single address is described in standard Lustre NID format by specifying the client’s IP address followed
     *        by the Lustre network ID (for example, <code>10.0.1.6@tcp</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An address range is described using a dash to separate the range (for example,
     *        <code>10.0.[2-10].[1-255]@tcp</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LustreRootSquashConfiguration withNoSquashNids(java.util.Collection<String> noSquashNids) {
        setNoSquashNids(noSquashNids);
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
        if (getRootSquash() != null)
            sb.append("RootSquash: ").append(getRootSquash()).append(",");
        if (getNoSquashNids() != null)
            sb.append("NoSquashNids: ").append(getNoSquashNids());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LustreRootSquashConfiguration == false)
            return false;
        LustreRootSquashConfiguration other = (LustreRootSquashConfiguration) obj;
        if (other.getRootSquash() == null ^ this.getRootSquash() == null)
            return false;
        if (other.getRootSquash() != null && other.getRootSquash().equals(this.getRootSquash()) == false)
            return false;
        if (other.getNoSquashNids() == null ^ this.getNoSquashNids() == null)
            return false;
        if (other.getNoSquashNids() != null && other.getNoSquashNids().equals(this.getNoSquashNids()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRootSquash() == null) ? 0 : getRootSquash().hashCode());
        hashCode = prime * hashCode + ((getNoSquashNids() == null) ? 0 : getNoSquashNids().hashCode());
        return hashCode;
    }

    @Override
    public LustreRootSquashConfiguration clone() {
        try {
            return (LustreRootSquashConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.LustreRootSquashConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
