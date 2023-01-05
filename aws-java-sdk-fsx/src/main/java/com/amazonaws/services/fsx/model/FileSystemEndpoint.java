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
 * An Amazon FSx for NetApp ONTAP file system has two endpoints that are used to access data or to manage the file
 * system using the NetApp ONTAP CLI, REST API, or NetApp SnapMirror. They are the <code>Management</code> and
 * <code>Intercluster</code> endpoints.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/FileSystemEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileSystemEndpoint implements Serializable, Cloneable, StructuredPojo {

    private String dNSName;
    /**
     * <p>
     * IP addresses of the file system endpoint.
     * </p>
     */
    private java.util.List<String> ipAddresses;

    /**
     * @param dNSName
     */

    public void setDNSName(String dNSName) {
        this.dNSName = dNSName;
    }

    /**
     * @return
     */

    public String getDNSName() {
        return this.dNSName;
    }

    /**
     * @param dNSName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemEndpoint withDNSName(String dNSName) {
        setDNSName(dNSName);
        return this;
    }

    /**
     * <p>
     * IP addresses of the file system endpoint.
     * </p>
     * 
     * @return IP addresses of the file system endpoint.
     */

    public java.util.List<String> getIpAddresses() {
        return ipAddresses;
    }

    /**
     * <p>
     * IP addresses of the file system endpoint.
     * </p>
     * 
     * @param ipAddresses
     *        IP addresses of the file system endpoint.
     */

    public void setIpAddresses(java.util.Collection<String> ipAddresses) {
        if (ipAddresses == null) {
            this.ipAddresses = null;
            return;
        }

        this.ipAddresses = new java.util.ArrayList<String>(ipAddresses);
    }

    /**
     * <p>
     * IP addresses of the file system endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpAddresses(java.util.Collection)} or {@link #withIpAddresses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ipAddresses
     *        IP addresses of the file system endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemEndpoint withIpAddresses(String... ipAddresses) {
        if (this.ipAddresses == null) {
            setIpAddresses(new java.util.ArrayList<String>(ipAddresses.length));
        }
        for (String ele : ipAddresses) {
            this.ipAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * IP addresses of the file system endpoint.
     * </p>
     * 
     * @param ipAddresses
     *        IP addresses of the file system endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemEndpoint withIpAddresses(java.util.Collection<String> ipAddresses) {
        setIpAddresses(ipAddresses);
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
        if (getDNSName() != null)
            sb.append("DNSName: ").append(getDNSName()).append(",");
        if (getIpAddresses() != null)
            sb.append("IpAddresses: ").append(getIpAddresses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileSystemEndpoint == false)
            return false;
        FileSystemEndpoint other = (FileSystemEndpoint) obj;
        if (other.getDNSName() == null ^ this.getDNSName() == null)
            return false;
        if (other.getDNSName() != null && other.getDNSName().equals(this.getDNSName()) == false)
            return false;
        if (other.getIpAddresses() == null ^ this.getIpAddresses() == null)
            return false;
        if (other.getIpAddresses() != null && other.getIpAddresses().equals(this.getIpAddresses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDNSName() == null) ? 0 : getDNSName().hashCode());
        hashCode = prime * hashCode + ((getIpAddresses() == null) ? 0 : getIpAddresses().hashCode());
        return hashCode;
    }

    @Override
    public FileSystemEndpoint clone() {
        try {
            return (FileSystemEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.FileSystemEndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
