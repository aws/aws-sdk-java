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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration settings for the task volume that was <code>configuredAtLaunch</code> that weren't set during
 * <code>RegisterTaskDef</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/TaskVolumeConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskVolumeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the volume. This value must match the volume name from the <code>Volume</code> object in the task
     * definition.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The configuration for the Amazon EBS volume that Amazon ECS creates and manages on your behalf. These settings
     * are used to create each Amazon EBS volume, with one volume created for each task. The Amazon EBS volumes are
     * visible in your account in the Amazon EC2 console once they are created.
     * </p>
     */
    private TaskManagedEBSVolumeConfiguration managedEBSVolume;

    /**
     * <p>
     * The name of the volume. This value must match the volume name from the <code>Volume</code> object in the task
     * definition.
     * </p>
     * 
     * @param name
     *        The name of the volume. This value must match the volume name from the <code>Volume</code> object in the
     *        task definition.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the volume. This value must match the volume name from the <code>Volume</code> object in the task
     * definition.
     * </p>
     * 
     * @return The name of the volume. This value must match the volume name from the <code>Volume</code> object in the
     *         task definition.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the volume. This value must match the volume name from the <code>Volume</code> object in the task
     * definition.
     * </p>
     * 
     * @param name
     *        The name of the volume. This value must match the volume name from the <code>Volume</code> object in the
     *        task definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskVolumeConfiguration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The configuration for the Amazon EBS volume that Amazon ECS creates and manages on your behalf. These settings
     * are used to create each Amazon EBS volume, with one volume created for each task. The Amazon EBS volumes are
     * visible in your account in the Amazon EC2 console once they are created.
     * </p>
     * 
     * @param managedEBSVolume
     *        The configuration for the Amazon EBS volume that Amazon ECS creates and manages on your behalf. These
     *        settings are used to create each Amazon EBS volume, with one volume created for each task. The Amazon EBS
     *        volumes are visible in your account in the Amazon EC2 console once they are created.
     */

    public void setManagedEBSVolume(TaskManagedEBSVolumeConfiguration managedEBSVolume) {
        this.managedEBSVolume = managedEBSVolume;
    }

    /**
     * <p>
     * The configuration for the Amazon EBS volume that Amazon ECS creates and manages on your behalf. These settings
     * are used to create each Amazon EBS volume, with one volume created for each task. The Amazon EBS volumes are
     * visible in your account in the Amazon EC2 console once they are created.
     * </p>
     * 
     * @return The configuration for the Amazon EBS volume that Amazon ECS creates and manages on your behalf. These
     *         settings are used to create each Amazon EBS volume, with one volume created for each task. The Amazon EBS
     *         volumes are visible in your account in the Amazon EC2 console once they are created.
     */

    public TaskManagedEBSVolumeConfiguration getManagedEBSVolume() {
        return this.managedEBSVolume;
    }

    /**
     * <p>
     * The configuration for the Amazon EBS volume that Amazon ECS creates and manages on your behalf. These settings
     * are used to create each Amazon EBS volume, with one volume created for each task. The Amazon EBS volumes are
     * visible in your account in the Amazon EC2 console once they are created.
     * </p>
     * 
     * @param managedEBSVolume
     *        The configuration for the Amazon EBS volume that Amazon ECS creates and manages on your behalf. These
     *        settings are used to create each Amazon EBS volume, with one volume created for each task. The Amazon EBS
     *        volumes are visible in your account in the Amazon EC2 console once they are created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskVolumeConfiguration withManagedEBSVolume(TaskManagedEBSVolumeConfiguration managedEBSVolume) {
        setManagedEBSVolume(managedEBSVolume);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getManagedEBSVolume() != null)
            sb.append("ManagedEBSVolume: ").append(getManagedEBSVolume());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskVolumeConfiguration == false)
            return false;
        TaskVolumeConfiguration other = (TaskVolumeConfiguration) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getManagedEBSVolume() == null ^ this.getManagedEBSVolume() == null)
            return false;
        if (other.getManagedEBSVolume() != null && other.getManagedEBSVolume().equals(this.getManagedEBSVolume()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getManagedEBSVolume() == null) ? 0 : getManagedEBSVolume().hashCode());
        return hashCode;
    }

    @Override
    public TaskVolumeConfiguration clone() {
        try {
            return (TaskVolumeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.TaskVolumeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
