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
 * An Amazon FSx for NetApp ONTAP file system has the following endpoints that are used to access data or to manage the
 * file system using the NetApp ONTAP CLI, REST API, or NetApp SnapMirror.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/FileSystemEndpoints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileSystemEndpoints implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An endpoint for managing your file system by setting up NetApp SnapMirror with other ONTAP systems.
     * </p>
     */
    private FileSystemEndpoint intercluster;
    /**
     * <p>
     * An endpoint for managing your file system using the NetApp ONTAP CLI and NetApp ONTAP API.
     * </p>
     */
    private FileSystemEndpoint management;

    /**
     * <p>
     * An endpoint for managing your file system by setting up NetApp SnapMirror with other ONTAP systems.
     * </p>
     * 
     * @param intercluster
     *        An endpoint for managing your file system by setting up NetApp SnapMirror with other ONTAP systems.
     */

    public void setIntercluster(FileSystemEndpoint intercluster) {
        this.intercluster = intercluster;
    }

    /**
     * <p>
     * An endpoint for managing your file system by setting up NetApp SnapMirror with other ONTAP systems.
     * </p>
     * 
     * @return An endpoint for managing your file system by setting up NetApp SnapMirror with other ONTAP systems.
     */

    public FileSystemEndpoint getIntercluster() {
        return this.intercluster;
    }

    /**
     * <p>
     * An endpoint for managing your file system by setting up NetApp SnapMirror with other ONTAP systems.
     * </p>
     * 
     * @param intercluster
     *        An endpoint for managing your file system by setting up NetApp SnapMirror with other ONTAP systems.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemEndpoints withIntercluster(FileSystemEndpoint intercluster) {
        setIntercluster(intercluster);
        return this;
    }

    /**
     * <p>
     * An endpoint for managing your file system using the NetApp ONTAP CLI and NetApp ONTAP API.
     * </p>
     * 
     * @param management
     *        An endpoint for managing your file system using the NetApp ONTAP CLI and NetApp ONTAP API.
     */

    public void setManagement(FileSystemEndpoint management) {
        this.management = management;
    }

    /**
     * <p>
     * An endpoint for managing your file system using the NetApp ONTAP CLI and NetApp ONTAP API.
     * </p>
     * 
     * @return An endpoint for managing your file system using the NetApp ONTAP CLI and NetApp ONTAP API.
     */

    public FileSystemEndpoint getManagement() {
        return this.management;
    }

    /**
     * <p>
     * An endpoint for managing your file system using the NetApp ONTAP CLI and NetApp ONTAP API.
     * </p>
     * 
     * @param management
     *        An endpoint for managing your file system using the NetApp ONTAP CLI and NetApp ONTAP API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemEndpoints withManagement(FileSystemEndpoint management) {
        setManagement(management);
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
        if (getIntercluster() != null)
            sb.append("Intercluster: ").append(getIntercluster()).append(",");
        if (getManagement() != null)
            sb.append("Management: ").append(getManagement());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileSystemEndpoints == false)
            return false;
        FileSystemEndpoints other = (FileSystemEndpoints) obj;
        if (other.getIntercluster() == null ^ this.getIntercluster() == null)
            return false;
        if (other.getIntercluster() != null && other.getIntercluster().equals(this.getIntercluster()) == false)
            return false;
        if (other.getManagement() == null ^ this.getManagement() == null)
            return false;
        if (other.getManagement() != null && other.getManagement().equals(this.getManagement()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntercluster() == null) ? 0 : getIntercluster().hashCode());
        hashCode = prime * hashCode + ((getManagement() == null) ? 0 : getManagement().hashCode());
        return hashCode;
    }

    @Override
    public FileSystemEndpoints clone() {
        try {
            return (FileSystemEndpoints) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.FileSystemEndpointsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
