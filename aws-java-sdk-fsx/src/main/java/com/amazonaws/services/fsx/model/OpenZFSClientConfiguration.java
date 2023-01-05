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
 * Specifies who can mount an OpenZFS file system and the options available while mounting the file system.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/OpenZFSClientConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpenZFSClientConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A value that specifies who can mount the file system. You can provide a wildcard character (<code>*</code>), an
     * IP address (<code>0.0.0.0</code>), or a CIDR address (<code>192.0.2.0/24</code>). By default, Amazon FSx uses the
     * wildcard character when specifying the client.
     * </p>
     */
    private String clients;
    /**
     * <p>
     * The options to use when mounting the file system. For a list of options that you can use with Network File System
     * (NFS), see the <a href="https://linux.die.net/man/5/exports">exports(5) - Linux man page</a>. When choosing your
     * options, consider the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>crossmnt</code> is used by default. If you don't specify <code>crossmnt</code> when changing the client
     * configuration, you won't be able to see or access snapshots in your file system's snapshot directory.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sync</code> is used by default. If you instead specify <code>async</code>, the system acknowledges writes
     * before writing to disk. If the system crashes before the writes are finished, you lose the unwritten data.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> options;

    /**
     * <p>
     * A value that specifies who can mount the file system. You can provide a wildcard character (<code>*</code>), an
     * IP address (<code>0.0.0.0</code>), or a CIDR address (<code>192.0.2.0/24</code>). By default, Amazon FSx uses the
     * wildcard character when specifying the client.
     * </p>
     * 
     * @param clients
     *        A value that specifies who can mount the file system. You can provide a wildcard character (<code>*</code>
     *        ), an IP address (<code>0.0.0.0</code>), or a CIDR address (<code>192.0.2.0/24</code>). By default, Amazon
     *        FSx uses the wildcard character when specifying the client.
     */

    public void setClients(String clients) {
        this.clients = clients;
    }

    /**
     * <p>
     * A value that specifies who can mount the file system. You can provide a wildcard character (<code>*</code>), an
     * IP address (<code>0.0.0.0</code>), or a CIDR address (<code>192.0.2.0/24</code>). By default, Amazon FSx uses the
     * wildcard character when specifying the client.
     * </p>
     * 
     * @return A value that specifies who can mount the file system. You can provide a wildcard character (
     *         <code>*</code>), an IP address (<code>0.0.0.0</code>), or a CIDR address (<code>192.0.2.0/24</code>). By
     *         default, Amazon FSx uses the wildcard character when specifying the client.
     */

    public String getClients() {
        return this.clients;
    }

    /**
     * <p>
     * A value that specifies who can mount the file system. You can provide a wildcard character (<code>*</code>), an
     * IP address (<code>0.0.0.0</code>), or a CIDR address (<code>192.0.2.0/24</code>). By default, Amazon FSx uses the
     * wildcard character when specifying the client.
     * </p>
     * 
     * @param clients
     *        A value that specifies who can mount the file system. You can provide a wildcard character (<code>*</code>
     *        ), an IP address (<code>0.0.0.0</code>), or a CIDR address (<code>192.0.2.0/24</code>). By default, Amazon
     *        FSx uses the wildcard character when specifying the client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenZFSClientConfiguration withClients(String clients) {
        setClients(clients);
        return this;
    }

    /**
     * <p>
     * The options to use when mounting the file system. For a list of options that you can use with Network File System
     * (NFS), see the <a href="https://linux.die.net/man/5/exports">exports(5) - Linux man page</a>. When choosing your
     * options, consider the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>crossmnt</code> is used by default. If you don't specify <code>crossmnt</code> when changing the client
     * configuration, you won't be able to see or access snapshots in your file system's snapshot directory.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sync</code> is used by default. If you instead specify <code>async</code>, the system acknowledges writes
     * before writing to disk. If the system crashes before the writes are finished, you lose the unwritten data.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The options to use when mounting the file system. For a list of options that you can use with Network
     *         File System (NFS), see the <a href="https://linux.die.net/man/5/exports">exports(5) - Linux man page</a>.
     *         When choosing your options, consider the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>crossmnt</code> is used by default. If you don't specify <code>crossmnt</code> when changing the
     *         client configuration, you won't be able to see or access snapshots in your file system's snapshot
     *         directory.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sync</code> is used by default. If you instead specify <code>async</code>, the system acknowledges
     *         writes before writing to disk. If the system crashes before the writes are finished, you lose the
     *         unwritten data.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getOptions() {
        return options;
    }

    /**
     * <p>
     * The options to use when mounting the file system. For a list of options that you can use with Network File System
     * (NFS), see the <a href="https://linux.die.net/man/5/exports">exports(5) - Linux man page</a>. When choosing your
     * options, consider the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>crossmnt</code> is used by default. If you don't specify <code>crossmnt</code> when changing the client
     * configuration, you won't be able to see or access snapshots in your file system's snapshot directory.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sync</code> is used by default. If you instead specify <code>async</code>, the system acknowledges writes
     * before writing to disk. If the system crashes before the writes are finished, you lose the unwritten data.
     * </p>
     * </li>
     * </ul>
     * 
     * @param options
     *        The options to use when mounting the file system. For a list of options that you can use with Network File
     *        System (NFS), see the <a href="https://linux.die.net/man/5/exports">exports(5) - Linux man page</a>. When
     *        choosing your options, consider the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>crossmnt</code> is used by default. If you don't specify <code>crossmnt</code> when changing the
     *        client configuration, you won't be able to see or access snapshots in your file system's snapshot
     *        directory.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sync</code> is used by default. If you instead specify <code>async</code>, the system acknowledges
     *        writes before writing to disk. If the system crashes before the writes are finished, you lose the
     *        unwritten data.
     *        </p>
     *        </li>
     */

    public void setOptions(java.util.Collection<String> options) {
        if (options == null) {
            this.options = null;
            return;
        }

        this.options = new java.util.ArrayList<String>(options);
    }

    /**
     * <p>
     * The options to use when mounting the file system. For a list of options that you can use with Network File System
     * (NFS), see the <a href="https://linux.die.net/man/5/exports">exports(5) - Linux man page</a>. When choosing your
     * options, consider the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>crossmnt</code> is used by default. If you don't specify <code>crossmnt</code> when changing the client
     * configuration, you won't be able to see or access snapshots in your file system's snapshot directory.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sync</code> is used by default. If you instead specify <code>async</code>, the system acknowledges writes
     * before writing to disk. If the system crashes before the writes are finished, you lose the unwritten data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptions(java.util.Collection)} or {@link #withOptions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param options
     *        The options to use when mounting the file system. For a list of options that you can use with Network File
     *        System (NFS), see the <a href="https://linux.die.net/man/5/exports">exports(5) - Linux man page</a>. When
     *        choosing your options, consider the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>crossmnt</code> is used by default. If you don't specify <code>crossmnt</code> when changing the
     *        client configuration, you won't be able to see or access snapshots in your file system's snapshot
     *        directory.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sync</code> is used by default. If you instead specify <code>async</code>, the system acknowledges
     *        writes before writing to disk. If the system crashes before the writes are finished, you lose the
     *        unwritten data.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenZFSClientConfiguration withOptions(String... options) {
        if (this.options == null) {
            setOptions(new java.util.ArrayList<String>(options.length));
        }
        for (String ele : options) {
            this.options.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The options to use when mounting the file system. For a list of options that you can use with Network File System
     * (NFS), see the <a href="https://linux.die.net/man/5/exports">exports(5) - Linux man page</a>. When choosing your
     * options, consider the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>crossmnt</code> is used by default. If you don't specify <code>crossmnt</code> when changing the client
     * configuration, you won't be able to see or access snapshots in your file system's snapshot directory.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sync</code> is used by default. If you instead specify <code>async</code>, the system acknowledges writes
     * before writing to disk. If the system crashes before the writes are finished, you lose the unwritten data.
     * </p>
     * </li>
     * </ul>
     * 
     * @param options
     *        The options to use when mounting the file system. For a list of options that you can use with Network File
     *        System (NFS), see the <a href="https://linux.die.net/man/5/exports">exports(5) - Linux man page</a>. When
     *        choosing your options, consider the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>crossmnt</code> is used by default. If you don't specify <code>crossmnt</code> when changing the
     *        client configuration, you won't be able to see or access snapshots in your file system's snapshot
     *        directory.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sync</code> is used by default. If you instead specify <code>async</code>, the system acknowledges
     *        writes before writing to disk. If the system crashes before the writes are finished, you lose the
     *        unwritten data.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenZFSClientConfiguration withOptions(java.util.Collection<String> options) {
        setOptions(options);
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
        if (getClients() != null)
            sb.append("Clients: ").append(getClients()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpenZFSClientConfiguration == false)
            return false;
        OpenZFSClientConfiguration other = (OpenZFSClientConfiguration) obj;
        if (other.getClients() == null ^ this.getClients() == null)
            return false;
        if (other.getClients() != null && other.getClients().equals(this.getClients()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClients() == null) ? 0 : getClients().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        return hashCode;
    }

    @Override
    public OpenZFSClientConfiguration clone() {
        try {
            return (OpenZFSClientConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.OpenZFSClientConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
