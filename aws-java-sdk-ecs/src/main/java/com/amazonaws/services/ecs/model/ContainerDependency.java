/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The dependencies defined for container startup. A container can contain multiple dependencies.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ContainerDependency" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerDependency implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a container.
     * </p>
     */
    private String containerName;
    /**
     * <p>
     * The dependency condition of the container. The following are the available conditions and their behavior:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>START</code> - This condition emulates the behavior of links and volumes today. It validates that a
     * dependent container is started before permitting other containers to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETE</code> - This condition validates that a dependent container runs to completion (exits) before
     * permitting other containers to start. This can be useful for non-essential containers that run a script and then
     * subsequently exit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> - This condition is the same as <code>COMPLETE</code>, but it will also require that the
     * container exits with a <code>zero</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HEALTHY</code> - This condition validates that the dependent container passes its Docker health check
     * before permitting other containers to start. This requires that the dependent container has health checks
     * configured. This condition will only be confirmed at task startup.
     * </p>
     * </li>
     * </ul>
     */
    private String condition;

    /**
     * <p>
     * The name of a container.
     * </p>
     * 
     * @param containerName
     *        The name of a container.
     */

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * <p>
     * The name of a container.
     * </p>
     * 
     * @return The name of a container.
     */

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * <p>
     * The name of a container.
     * </p>
     * 
     * @param containerName
     *        The name of a container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDependency withContainerName(String containerName) {
        setContainerName(containerName);
        return this;
    }

    /**
     * <p>
     * The dependency condition of the container. The following are the available conditions and their behavior:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>START</code> - This condition emulates the behavior of links and volumes today. It validates that a
     * dependent container is started before permitting other containers to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETE</code> - This condition validates that a dependent container runs to completion (exits) before
     * permitting other containers to start. This can be useful for non-essential containers that run a script and then
     * subsequently exit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> - This condition is the same as <code>COMPLETE</code>, but it will also require that the
     * container exits with a <code>zero</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HEALTHY</code> - This condition validates that the dependent container passes its Docker health check
     * before permitting other containers to start. This requires that the dependent container has health checks
     * configured. This condition will only be confirmed at task startup.
     * </p>
     * </li>
     * </ul>
     * 
     * @param condition
     *        The dependency condition of the container. The following are the available conditions and their
     *        behavior:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>START</code> - This condition emulates the behavior of links and volumes today. It validates that a
     *        dependent container is started before permitting other containers to start.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETE</code> - This condition validates that a dependent container runs to completion (exits)
     *        before permitting other containers to start. This can be useful for non-essential containers that run a
     *        script and then subsequently exit.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS</code> - This condition is the same as <code>COMPLETE</code>, but it will also require that
     *        the container exits with a <code>zero</code> status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HEALTHY</code> - This condition validates that the dependent container passes its Docker health
     *        check before permitting other containers to start. This requires that the dependent container has health
     *        checks configured. This condition will only be confirmed at task startup.
     *        </p>
     *        </li>
     * @see ContainerCondition
     */

    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * The dependency condition of the container. The following are the available conditions and their behavior:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>START</code> - This condition emulates the behavior of links and volumes today. It validates that a
     * dependent container is started before permitting other containers to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETE</code> - This condition validates that a dependent container runs to completion (exits) before
     * permitting other containers to start. This can be useful for non-essential containers that run a script and then
     * subsequently exit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> - This condition is the same as <code>COMPLETE</code>, but it will also require that the
     * container exits with a <code>zero</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HEALTHY</code> - This condition validates that the dependent container passes its Docker health check
     * before permitting other containers to start. This requires that the dependent container has health checks
     * configured. This condition will only be confirmed at task startup.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The dependency condition of the container. The following are the available conditions and their
     *         behavior:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>START</code> - This condition emulates the behavior of links and volumes today. It validates that a
     *         dependent container is started before permitting other containers to start.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COMPLETE</code> - This condition validates that a dependent container runs to completion (exits)
     *         before permitting other containers to start. This can be useful for non-essential containers that run a
     *         script and then subsequently exit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUCCESS</code> - This condition is the same as <code>COMPLETE</code>, but it will also require that
     *         the container exits with a <code>zero</code> status.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HEALTHY</code> - This condition validates that the dependent container passes its Docker health
     *         check before permitting other containers to start. This requires that the dependent container has health
     *         checks configured. This condition will only be confirmed at task startup.
     *         </p>
     *         </li>
     * @see ContainerCondition
     */

    public String getCondition() {
        return this.condition;
    }

    /**
     * <p>
     * The dependency condition of the container. The following are the available conditions and their behavior:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>START</code> - This condition emulates the behavior of links and volumes today. It validates that a
     * dependent container is started before permitting other containers to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETE</code> - This condition validates that a dependent container runs to completion (exits) before
     * permitting other containers to start. This can be useful for non-essential containers that run a script and then
     * subsequently exit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> - This condition is the same as <code>COMPLETE</code>, but it will also require that the
     * container exits with a <code>zero</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HEALTHY</code> - This condition validates that the dependent container passes its Docker health check
     * before permitting other containers to start. This requires that the dependent container has health checks
     * configured. This condition will only be confirmed at task startup.
     * </p>
     * </li>
     * </ul>
     * 
     * @param condition
     *        The dependency condition of the container. The following are the available conditions and their
     *        behavior:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>START</code> - This condition emulates the behavior of links and volumes today. It validates that a
     *        dependent container is started before permitting other containers to start.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETE</code> - This condition validates that a dependent container runs to completion (exits)
     *        before permitting other containers to start. This can be useful for non-essential containers that run a
     *        script and then subsequently exit.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS</code> - This condition is the same as <code>COMPLETE</code>, but it will also require that
     *        the container exits with a <code>zero</code> status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HEALTHY</code> - This condition validates that the dependent container passes its Docker health
     *        check before permitting other containers to start. This requires that the dependent container has health
     *        checks configured. This condition will only be confirmed at task startup.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerCondition
     */

    public ContainerDependency withCondition(String condition) {
        setCondition(condition);
        return this;
    }

    /**
     * <p>
     * The dependency condition of the container. The following are the available conditions and their behavior:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>START</code> - This condition emulates the behavior of links and volumes today. It validates that a
     * dependent container is started before permitting other containers to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETE</code> - This condition validates that a dependent container runs to completion (exits) before
     * permitting other containers to start. This can be useful for non-essential containers that run a script and then
     * subsequently exit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> - This condition is the same as <code>COMPLETE</code>, but it will also require that the
     * container exits with a <code>zero</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HEALTHY</code> - This condition validates that the dependent container passes its Docker health check
     * before permitting other containers to start. This requires that the dependent container has health checks
     * configured. This condition will only be confirmed at task startup.
     * </p>
     * </li>
     * </ul>
     * 
     * @param condition
     *        The dependency condition of the container. The following are the available conditions and their
     *        behavior:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>START</code> - This condition emulates the behavior of links and volumes today. It validates that a
     *        dependent container is started before permitting other containers to start.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETE</code> - This condition validates that a dependent container runs to completion (exits)
     *        before permitting other containers to start. This can be useful for non-essential containers that run a
     *        script and then subsequently exit.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS</code> - This condition is the same as <code>COMPLETE</code>, but it will also require that
     *        the container exits with a <code>zero</code> status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HEALTHY</code> - This condition validates that the dependent container passes its Docker health
     *        check before permitting other containers to start. This requires that the dependent container has health
     *        checks configured. This condition will only be confirmed at task startup.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerCondition
     */

    public ContainerDependency withCondition(ContainerCondition condition) {
        this.condition = condition.toString();
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
        if (getContainerName() != null)
            sb.append("ContainerName: ").append(getContainerName()).append(",");
        if (getCondition() != null)
            sb.append("Condition: ").append(getCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerDependency == false)
            return false;
        ContainerDependency other = (ContainerDependency) obj;
        if (other.getContainerName() == null ^ this.getContainerName() == null)
            return false;
        if (other.getContainerName() != null && other.getContainerName().equals(this.getContainerName()) == false)
            return false;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null && other.getCondition().equals(this.getCondition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerName() == null) ? 0 : getContainerName().hashCode());
        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        return hashCode;
    }

    @Override
    public ContainerDependency clone() {
        try {
            return (ContainerDependency) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.ContainerDependencyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
