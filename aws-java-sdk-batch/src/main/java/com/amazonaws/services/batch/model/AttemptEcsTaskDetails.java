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
 * An object that represents the details of a task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/AttemptEcsTaskDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttemptEcsTaskDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container instance that hosts the task.
     * </p>
     */
    private String containerInstanceArn;
    /**
     * <p>
     * The ARN of the Amazon ECS task.
     * </p>
     */
    private String taskArn;
    /**
     * <p>
     * A list of containers that are included in the <code>taskProperties</code> list.
     * </p>
     */
    private java.util.List<AttemptTaskContainerDetails> containers;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container instance that hosts the task.
     * </p>
     * 
     * @param containerInstanceArn
     *        The Amazon Resource Name (ARN) of the container instance that hosts the task.
     */

    public void setContainerInstanceArn(String containerInstanceArn) {
        this.containerInstanceArn = containerInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container instance that hosts the task.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the container instance that hosts the task.
     */

    public String getContainerInstanceArn() {
        return this.containerInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container instance that hosts the task.
     * </p>
     * 
     * @param containerInstanceArn
     *        The Amazon Resource Name (ARN) of the container instance that hosts the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttemptEcsTaskDetails withContainerInstanceArn(String containerInstanceArn) {
        setContainerInstanceArn(containerInstanceArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon ECS task.
     * </p>
     * 
     * @param taskArn
     *        The ARN of the Amazon ECS task.
     */

    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * The ARN of the Amazon ECS task.
     * </p>
     * 
     * @return The ARN of the Amazon ECS task.
     */

    public String getTaskArn() {
        return this.taskArn;
    }

    /**
     * <p>
     * The ARN of the Amazon ECS task.
     * </p>
     * 
     * @param taskArn
     *        The ARN of the Amazon ECS task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttemptEcsTaskDetails withTaskArn(String taskArn) {
        setTaskArn(taskArn);
        return this;
    }

    /**
     * <p>
     * A list of containers that are included in the <code>taskProperties</code> list.
     * </p>
     * 
     * @return A list of containers that are included in the <code>taskProperties</code> list.
     */

    public java.util.List<AttemptTaskContainerDetails> getContainers() {
        return containers;
    }

    /**
     * <p>
     * A list of containers that are included in the <code>taskProperties</code> list.
     * </p>
     * 
     * @param containers
     *        A list of containers that are included in the <code>taskProperties</code> list.
     */

    public void setContainers(java.util.Collection<AttemptTaskContainerDetails> containers) {
        if (containers == null) {
            this.containers = null;
            return;
        }

        this.containers = new java.util.ArrayList<AttemptTaskContainerDetails>(containers);
    }

    /**
     * <p>
     * A list of containers that are included in the <code>taskProperties</code> list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainers(java.util.Collection)} or {@link #withContainers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param containers
     *        A list of containers that are included in the <code>taskProperties</code> list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttemptEcsTaskDetails withContainers(AttemptTaskContainerDetails... containers) {
        if (this.containers == null) {
            setContainers(new java.util.ArrayList<AttemptTaskContainerDetails>(containers.length));
        }
        for (AttemptTaskContainerDetails ele : containers) {
            this.containers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of containers that are included in the <code>taskProperties</code> list.
     * </p>
     * 
     * @param containers
     *        A list of containers that are included in the <code>taskProperties</code> list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttemptEcsTaskDetails withContainers(java.util.Collection<AttemptTaskContainerDetails> containers) {
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
        if (getContainerInstanceArn() != null)
            sb.append("ContainerInstanceArn: ").append(getContainerInstanceArn()).append(",");
        if (getTaskArn() != null)
            sb.append("TaskArn: ").append(getTaskArn()).append(",");
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

        if (obj instanceof AttemptEcsTaskDetails == false)
            return false;
        AttemptEcsTaskDetails other = (AttemptEcsTaskDetails) obj;
        if (other.getContainerInstanceArn() == null ^ this.getContainerInstanceArn() == null)
            return false;
        if (other.getContainerInstanceArn() != null && other.getContainerInstanceArn().equals(this.getContainerInstanceArn()) == false)
            return false;
        if (other.getTaskArn() == null ^ this.getTaskArn() == null)
            return false;
        if (other.getTaskArn() != null && other.getTaskArn().equals(this.getTaskArn()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getContainerInstanceArn() == null) ? 0 : getContainerInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode());
        hashCode = prime * hashCode + ((getContainers() == null) ? 0 : getContainers().hashCode());
        return hashCode;
    }

    @Override
    public AttemptEcsTaskDetails clone() {
        try {
            return (AttemptEcsTaskDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.AttemptEcsTaskDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
