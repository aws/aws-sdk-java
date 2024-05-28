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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains overrides for the task definition of a job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/TaskPropertiesOverride" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskPropertiesOverride implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The overrides for the container definition of a job.
     * </p>
     */
    private java.util.List<TaskContainerOverrides> containers;

    /**
     * <p>
     * The overrides for the container definition of a job.
     * </p>
     * 
     * @return The overrides for the container definition of a job.
     */

    public java.util.List<TaskContainerOverrides> getContainers() {
        return containers;
    }

    /**
     * <p>
     * The overrides for the container definition of a job.
     * </p>
     * 
     * @param containers
     *        The overrides for the container definition of a job.
     */

    public void setContainers(java.util.Collection<TaskContainerOverrides> containers) {
        if (containers == null) {
            this.containers = null;
            return;
        }

        this.containers = new java.util.ArrayList<TaskContainerOverrides>(containers);
    }

    /**
     * <p>
     * The overrides for the container definition of a job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainers(java.util.Collection)} or {@link #withContainers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param containers
     *        The overrides for the container definition of a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskPropertiesOverride withContainers(TaskContainerOverrides... containers) {
        if (this.containers == null) {
            setContainers(new java.util.ArrayList<TaskContainerOverrides>(containers.length));
        }
        for (TaskContainerOverrides ele : containers) {
            this.containers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The overrides for the container definition of a job.
     * </p>
     * 
     * @param containers
     *        The overrides for the container definition of a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskPropertiesOverride withContainers(java.util.Collection<TaskContainerOverrides> containers) {
        setContainers(containers);
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
        if (getContainers() != null)
            sb.append("Containers: ").append(getContainers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskPropertiesOverride == false)
            return false;
        TaskPropertiesOverride other = (TaskPropertiesOverride) obj;
        if (other.getContainers() == null ^ this.getContainers() == null)
            return false;
        if (other.getContainers() != null && other.getContainers().equals(this.getContainers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainers() == null) ? 0 : getContainers().hashCode());
        return hashCode;
    }

    @Override
    public TaskPropertiesOverride clone() {
        try {
            return (TaskPropertiesOverride) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.TaskPropertiesOverrideMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
