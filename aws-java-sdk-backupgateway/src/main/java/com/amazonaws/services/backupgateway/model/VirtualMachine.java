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
package com.amazonaws.services.backupgateway.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A virtual machine that is on a hypervisor.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/VirtualMachine" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VirtualMachine implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The host name of the virtual machine.
     * </p>
     */
    private String hostName;
    /**
     * <p>
     * The ID of the virtual machine's hypervisor.
     * </p>
     */
    private String hypervisorId;
    /**
     * <p>
     * The most recent date a virtual machine was backed up, in Unix format and UTC time.
     * </p>
     */
    private java.util.Date lastBackupDate;
    /**
     * <p>
     * The name of the virtual machine.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The path of the virtual machine.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the virtual machine. For example,
     * <code>arn:aws:backup-gateway:us-west-1:0000000000000:vm/vm-0000ABCDEFGIJKL</code>.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The host name of the virtual machine.
     * </p>
     * 
     * @param hostName
     *        The host name of the virtual machine.
     */

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    /**
     * <p>
     * The host name of the virtual machine.
     * </p>
     * 
     * @return The host name of the virtual machine.
     */

    public String getHostName() {
        return this.hostName;
    }

    /**
     * <p>
     * The host name of the virtual machine.
     * </p>
     * 
     * @param hostName
     *        The host name of the virtual machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualMachine withHostName(String hostName) {
        setHostName(hostName);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual machine's hypervisor.
     * </p>
     * 
     * @param hypervisorId
     *        The ID of the virtual machine's hypervisor.
     */

    public void setHypervisorId(String hypervisorId) {
        this.hypervisorId = hypervisorId;
    }

    /**
     * <p>
     * The ID of the virtual machine's hypervisor.
     * </p>
     * 
     * @return The ID of the virtual machine's hypervisor.
     */

    public String getHypervisorId() {
        return this.hypervisorId;
    }

    /**
     * <p>
     * The ID of the virtual machine's hypervisor.
     * </p>
     * 
     * @param hypervisorId
     *        The ID of the virtual machine's hypervisor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualMachine withHypervisorId(String hypervisorId) {
        setHypervisorId(hypervisorId);
        return this;
    }

    /**
     * <p>
     * The most recent date a virtual machine was backed up, in Unix format and UTC time.
     * </p>
     * 
     * @param lastBackupDate
     *        The most recent date a virtual machine was backed up, in Unix format and UTC time.
     */

    public void setLastBackupDate(java.util.Date lastBackupDate) {
        this.lastBackupDate = lastBackupDate;
    }

    /**
     * <p>
     * The most recent date a virtual machine was backed up, in Unix format and UTC time.
     * </p>
     * 
     * @return The most recent date a virtual machine was backed up, in Unix format and UTC time.
     */

    public java.util.Date getLastBackupDate() {
        return this.lastBackupDate;
    }

    /**
     * <p>
     * The most recent date a virtual machine was backed up, in Unix format and UTC time.
     * </p>
     * 
     * @param lastBackupDate
     *        The most recent date a virtual machine was backed up, in Unix format and UTC time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualMachine withLastBackupDate(java.util.Date lastBackupDate) {
        setLastBackupDate(lastBackupDate);
        return this;
    }

    /**
     * <p>
     * The name of the virtual machine.
     * </p>
     * 
     * @param name
     *        The name of the virtual machine.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the virtual machine.
     * </p>
     * 
     * @return The name of the virtual machine.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the virtual machine.
     * </p>
     * 
     * @param name
     *        The name of the virtual machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualMachine withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The path of the virtual machine.
     * </p>
     * 
     * @param path
     *        The path of the virtual machine.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path of the virtual machine.
     * </p>
     * 
     * @return The path of the virtual machine.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path of the virtual machine.
     * </p>
     * 
     * @param path
     *        The path of the virtual machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualMachine withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the virtual machine. For example,
     * <code>arn:aws:backup-gateway:us-west-1:0000000000000:vm/vm-0000ABCDEFGIJKL</code>.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the virtual machine. For example,
     *        <code>arn:aws:backup-gateway:us-west-1:0000000000000:vm/vm-0000ABCDEFGIJKL</code>.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the virtual machine. For example,
     * <code>arn:aws:backup-gateway:us-west-1:0000000000000:vm/vm-0000ABCDEFGIJKL</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the virtual machine. For example,
     *         <code>arn:aws:backup-gateway:us-west-1:0000000000000:vm/vm-0000ABCDEFGIJKL</code>.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the virtual machine. For example,
     * <code>arn:aws:backup-gateway:us-west-1:0000000000000:vm/vm-0000ABCDEFGIJKL</code>.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the virtual machine. For example,
     *        <code>arn:aws:backup-gateway:us-west-1:0000000000000:vm/vm-0000ABCDEFGIJKL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualMachine withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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
        if (getHostName() != null)
            sb.append("HostName: ").append(getHostName()).append(",");
        if (getHypervisorId() != null)
            sb.append("HypervisorId: ").append(getHypervisorId()).append(",");
        if (getLastBackupDate() != null)
            sb.append("LastBackupDate: ").append(getLastBackupDate()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualMachine == false)
            return false;
        VirtualMachine other = (VirtualMachine) obj;
        if (other.getHostName() == null ^ this.getHostName() == null)
            return false;
        if (other.getHostName() != null && other.getHostName().equals(this.getHostName()) == false)
            return false;
        if (other.getHypervisorId() == null ^ this.getHypervisorId() == null)
            return false;
        if (other.getHypervisorId() != null && other.getHypervisorId().equals(this.getHypervisorId()) == false)
            return false;
        if (other.getLastBackupDate() == null ^ this.getLastBackupDate() == null)
            return false;
        if (other.getLastBackupDate() != null && other.getLastBackupDate().equals(this.getLastBackupDate()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostName() == null) ? 0 : getHostName().hashCode());
        hashCode = prime * hashCode + ((getHypervisorId() == null) ? 0 : getHypervisorId().hashCode());
        hashCode = prime * hashCode + ((getLastBackupDate() == null) ? 0 : getLastBackupDate().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public VirtualMachine clone() {
        try {
            return (VirtualMachine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backupgateway.model.transform.VirtualMachineMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
