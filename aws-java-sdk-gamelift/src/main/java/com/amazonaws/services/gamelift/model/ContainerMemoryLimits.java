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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies how much memory is available to a container. You can't change this value after you create this object.
 * </p>
 * <p>
 * <b>Part of: </b> <a>ContainerDefinition$MemoryLimits</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ContainerMemoryLimits" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerMemoryLimits implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of memory that is reserved for a container. When the container group's shared memory is under
     * contention, the system attempts to maintain the container memory usage at this soft limit. However, the container
     * can use more memory when needed, if available. This property is similar to the Amazon ECS container definition
     * parameter <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#ContainerDefinition-memoryReservation"
     * >memoryreservation</a> (<i>Amazon Elastic Container Service Developer Guide</i>).
     * </p>
     */
    private Integer softLimit;
    /**
     * <p>
     * The maximum amount of memory that the container can use. If a container attempts to exceed this limit, the
     * container is stopped. This property is similar to the Amazon ECS container definition parameter <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#container_definition_memory"
     * >memory</a> in the <i>Amazon Elastic Container Service Developer Guide.</i>
     * </p>
     */
    private Integer hardLimit;

    /**
     * <p>
     * The amount of memory that is reserved for a container. When the container group's shared memory is under
     * contention, the system attempts to maintain the container memory usage at this soft limit. However, the container
     * can use more memory when needed, if available. This property is similar to the Amazon ECS container definition
     * parameter <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#ContainerDefinition-memoryReservation"
     * >memoryreservation</a> (<i>Amazon Elastic Container Service Developer Guide</i>).
     * </p>
     * 
     * @param softLimit
     *        The amount of memory that is reserved for a container. When the container group's shared memory is under
     *        contention, the system attempts to maintain the container memory usage at this soft limit. However, the
     *        container can use more memory when needed, if available. This property is similar to the Amazon ECS
     *        container definition parameter <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#ContainerDefinition-memoryReservation"
     *        >memoryreservation</a> (<i>Amazon Elastic Container Service Developer Guide</i>).
     */

    public void setSoftLimit(Integer softLimit) {
        this.softLimit = softLimit;
    }

    /**
     * <p>
     * The amount of memory that is reserved for a container. When the container group's shared memory is under
     * contention, the system attempts to maintain the container memory usage at this soft limit. However, the container
     * can use more memory when needed, if available. This property is similar to the Amazon ECS container definition
     * parameter <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#ContainerDefinition-memoryReservation"
     * >memoryreservation</a> (<i>Amazon Elastic Container Service Developer Guide</i>).
     * </p>
     * 
     * @return The amount of memory that is reserved for a container. When the container group's shared memory is under
     *         contention, the system attempts to maintain the container memory usage at this soft limit. However, the
     *         container can use more memory when needed, if available. This property is similar to the Amazon ECS
     *         container definition parameter <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#ContainerDefinition-memoryReservation"
     *         >memoryreservation</a> (<i>Amazon Elastic Container Service Developer Guide</i>).
     */

    public Integer getSoftLimit() {
        return this.softLimit;
    }

    /**
     * <p>
     * The amount of memory that is reserved for a container. When the container group's shared memory is under
     * contention, the system attempts to maintain the container memory usage at this soft limit. However, the container
     * can use more memory when needed, if available. This property is similar to the Amazon ECS container definition
     * parameter <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#ContainerDefinition-memoryReservation"
     * >memoryreservation</a> (<i>Amazon Elastic Container Service Developer Guide</i>).
     * </p>
     * 
     * @param softLimit
     *        The amount of memory that is reserved for a container. When the container group's shared memory is under
     *        contention, the system attempts to maintain the container memory usage at this soft limit. However, the
     *        container can use more memory when needed, if available. This property is similar to the Amazon ECS
     *        container definition parameter <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#ContainerDefinition-memoryReservation"
     *        >memoryreservation</a> (<i>Amazon Elastic Container Service Developer Guide</i>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerMemoryLimits withSoftLimit(Integer softLimit) {
        setSoftLimit(softLimit);
        return this;
    }

    /**
     * <p>
     * The maximum amount of memory that the container can use. If a container attempts to exceed this limit, the
     * container is stopped. This property is similar to the Amazon ECS container definition parameter <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#container_definition_memory"
     * >memory</a> in the <i>Amazon Elastic Container Service Developer Guide.</i>
     * </p>
     * 
     * @param hardLimit
     *        The maximum amount of memory that the container can use. If a container attempts to exceed this limit, the
     *        container is stopped. This property is similar to the Amazon ECS container definition parameter <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#container_definition_memory"
     *        >memory</a> in the <i>Amazon Elastic Container Service Developer Guide.</i>
     */

    public void setHardLimit(Integer hardLimit) {
        this.hardLimit = hardLimit;
    }

    /**
     * <p>
     * The maximum amount of memory that the container can use. If a container attempts to exceed this limit, the
     * container is stopped. This property is similar to the Amazon ECS container definition parameter <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#container_definition_memory"
     * >memory</a> in the <i>Amazon Elastic Container Service Developer Guide.</i>
     * </p>
     * 
     * @return The maximum amount of memory that the container can use. If a container attempts to exceed this limit,
     *         the container is stopped. This property is similar to the Amazon ECS container definition parameter <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#container_definition_memory"
     *         >memory</a> in the <i>Amazon Elastic Container Service Developer Guide.</i>
     */

    public Integer getHardLimit() {
        return this.hardLimit;
    }

    /**
     * <p>
     * The maximum amount of memory that the container can use. If a container attempts to exceed this limit, the
     * container is stopped. This property is similar to the Amazon ECS container definition parameter <a href=
     * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#container_definition_memory"
     * >memory</a> in the <i>Amazon Elastic Container Service Developer Guide.</i>
     * </p>
     * 
     * @param hardLimit
     *        The maximum amount of memory that the container can use. If a container attempts to exceed this limit, the
     *        container is stopped. This property is similar to the Amazon ECS container definition parameter <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#container_definition_memory"
     *        >memory</a> in the <i>Amazon Elastic Container Service Developer Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerMemoryLimits withHardLimit(Integer hardLimit) {
        setHardLimit(hardLimit);
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
        if (getSoftLimit() != null)
            sb.append("SoftLimit: ").append(getSoftLimit()).append(",");
        if (getHardLimit() != null)
            sb.append("HardLimit: ").append(getHardLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerMemoryLimits == false)
            return false;
        ContainerMemoryLimits other = (ContainerMemoryLimits) obj;
        if (other.getSoftLimit() == null ^ this.getSoftLimit() == null)
            return false;
        if (other.getSoftLimit() != null && other.getSoftLimit().equals(this.getSoftLimit()) == false)
            return false;
        if (other.getHardLimit() == null ^ this.getHardLimit() == null)
            return false;
        if (other.getHardLimit() != null && other.getHardLimit().equals(this.getHardLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSoftLimit() == null) ? 0 : getSoftLimit().hashCode());
        hashCode = prime * hashCode + ((getHardLimit() == null) ? 0 : getHardLimit().hashCode());
        return hashCode;
    }

    @Override
    public ContainerMemoryLimits clone() {
        try {
            return (ContainerMemoryLimits) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.ContainerMemoryLimitsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
