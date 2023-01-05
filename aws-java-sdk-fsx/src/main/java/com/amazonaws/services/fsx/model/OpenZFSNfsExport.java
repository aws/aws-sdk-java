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
 * The Network File System (NFS) configurations for mounting an Amazon FSx for OpenZFS file system.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/OpenZFSNfsExport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpenZFSNfsExport implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of configuration objects that contain the client and options for mounting the OpenZFS file system.
     * </p>
     */
    private java.util.List<OpenZFSClientConfiguration> clientConfigurations;

    /**
     * <p>
     * A list of configuration objects that contain the client and options for mounting the OpenZFS file system.
     * </p>
     * 
     * @return A list of configuration objects that contain the client and options for mounting the OpenZFS file system.
     */

    public java.util.List<OpenZFSClientConfiguration> getClientConfigurations() {
        return clientConfigurations;
    }

    /**
     * <p>
     * A list of configuration objects that contain the client and options for mounting the OpenZFS file system.
     * </p>
     * 
     * @param clientConfigurations
     *        A list of configuration objects that contain the client and options for mounting the OpenZFS file system.
     */

    public void setClientConfigurations(java.util.Collection<OpenZFSClientConfiguration> clientConfigurations) {
        if (clientConfigurations == null) {
            this.clientConfigurations = null;
            return;
        }

        this.clientConfigurations = new java.util.ArrayList<OpenZFSClientConfiguration>(clientConfigurations);
    }

    /**
     * <p>
     * A list of configuration objects that contain the client and options for mounting the OpenZFS file system.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClientConfigurations(java.util.Collection)} or {@link #withClientConfigurations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param clientConfigurations
     *        A list of configuration objects that contain the client and options for mounting the OpenZFS file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenZFSNfsExport withClientConfigurations(OpenZFSClientConfiguration... clientConfigurations) {
        if (this.clientConfigurations == null) {
            setClientConfigurations(new java.util.ArrayList<OpenZFSClientConfiguration>(clientConfigurations.length));
        }
        for (OpenZFSClientConfiguration ele : clientConfigurations) {
            this.clientConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of configuration objects that contain the client and options for mounting the OpenZFS file system.
     * </p>
     * 
     * @param clientConfigurations
     *        A list of configuration objects that contain the client and options for mounting the OpenZFS file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenZFSNfsExport withClientConfigurations(java.util.Collection<OpenZFSClientConfiguration> clientConfigurations) {
        setClientConfigurations(clientConfigurations);
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
        if (getClientConfigurations() != null)
            sb.append("ClientConfigurations: ").append(getClientConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpenZFSNfsExport == false)
            return false;
        OpenZFSNfsExport other = (OpenZFSNfsExport) obj;
        if (other.getClientConfigurations() == null ^ this.getClientConfigurations() == null)
            return false;
        if (other.getClientConfigurations() != null && other.getClientConfigurations().equals(this.getClientConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientConfigurations() == null) ? 0 : getClientConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public OpenZFSNfsExport clone() {
        try {
            return (OpenZFSNfsExport) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.OpenZFSNfsExportMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
