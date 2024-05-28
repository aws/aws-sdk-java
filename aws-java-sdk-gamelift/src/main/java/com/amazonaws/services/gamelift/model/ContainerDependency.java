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
 * <b>This data type is used with the Amazon GameLift containers feature, which is currently in public preview.</b>
 * </p>
 * <p>
 * A container's dependency on another container in the same container group. The dependency impacts how the dependent
 * container is able to start or shut down based the status of the other container.
 * </p>
 * <p>
 * For example, ContainerA is configured with the following dependency: a <code>START</code> dependency on ContainerB.
 * This means that ContainerA can't start until ContainerB has started. It also means that ContainerA must shut down
 * before ContainerB.
 * </p>
 * <p>
 * <b>Part of:</b> <a>ContainerDefinition</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ContainerDependency" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerDependency implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A descriptive label for the container definition that this container depends on.
     * </p>
     */
    private String containerName;
    /**
     * <p>
     * The condition that the dependency container must reach before the dependent container can start. Valid conditions
     * include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * START - The dependency container must have started.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETE - The dependency container has run to completion (exits). Use this condition with nonessential
     * containers, such as those that run a script and then exit. The dependency container can't be an essential
     * container.
     * </p>
     * </li>
     * <li>
     * <p>
     * SUCCESS - The dependency container has run to completion and exited with a zero status. The dependency container
     * can't be an essential container.
     * </p>
     * </li>
     * <li>
     * <p>
     * HEALTHY - The dependency container has passed its Docker health check. Use this condition with dependency
     * containers that have health checks configured. This condition is confirmed at container group startup only.
     * </p>
     * </li>
     * </ul>
     */
    private String condition;

    /**
     * <p>
     * A descriptive label for the container definition that this container depends on.
     * </p>
     * 
     * @param containerName
     *        A descriptive label for the container definition that this container depends on.
     */

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * <p>
     * A descriptive label for the container definition that this container depends on.
     * </p>
     * 
     * @return A descriptive label for the container definition that this container depends on.
     */

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * <p>
     * A descriptive label for the container definition that this container depends on.
     * </p>
     * 
     * @param containerName
     *        A descriptive label for the container definition that this container depends on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDependency withContainerName(String containerName) {
        setContainerName(containerName);
        return this;
    }

    /**
     * <p>
     * The condition that the dependency container must reach before the dependent container can start. Valid conditions
     * include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * START - The dependency container must have started.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETE - The dependency container has run to completion (exits). Use this condition with nonessential
     * containers, such as those that run a script and then exit. The dependency container can't be an essential
     * container.
     * </p>
     * </li>
     * <li>
     * <p>
     * SUCCESS - The dependency container has run to completion and exited with a zero status. The dependency container
     * can't be an essential container.
     * </p>
     * </li>
     * <li>
     * <p>
     * HEALTHY - The dependency container has passed its Docker health check. Use this condition with dependency
     * containers that have health checks configured. This condition is confirmed at container group startup only.
     * </p>
     * </li>
     * </ul>
     * 
     * @param condition
     *        The condition that the dependency container must reach before the dependent container can start. Valid
     *        conditions include: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        START - The dependency container must have started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPLETE - The dependency container has run to completion (exits). Use this condition with nonessential
     *        containers, such as those that run a script and then exit. The dependency container can't be an essential
     *        container.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SUCCESS - The dependency container has run to completion and exited with a zero status. The dependency
     *        container can't be an essential container.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        HEALTHY - The dependency container has passed its Docker health check. Use this condition with dependency
     *        containers that have health checks configured. This condition is confirmed at container group startup
     *        only.
     *        </p>
     *        </li>
     * @see ContainerDependencyCondition
     */

    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * The condition that the dependency container must reach before the dependent container can start. Valid conditions
     * include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * START - The dependency container must have started.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETE - The dependency container has run to completion (exits). Use this condition with nonessential
     * containers, such as those that run a script and then exit. The dependency container can't be an essential
     * container.
     * </p>
     * </li>
     * <li>
     * <p>
     * SUCCESS - The dependency container has run to completion and exited with a zero status. The dependency container
     * can't be an essential container.
     * </p>
     * </li>
     * <li>
     * <p>
     * HEALTHY - The dependency container has passed its Docker health check. Use this condition with dependency
     * containers that have health checks configured. This condition is confirmed at container group startup only.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The condition that the dependency container must reach before the dependent container can start. Valid
     *         conditions include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         START - The dependency container must have started.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         COMPLETE - The dependency container has run to completion (exits). Use this condition with nonessential
     *         containers, such as those that run a script and then exit. The dependency container can't be an essential
     *         container.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SUCCESS - The dependency container has run to completion and exited with a zero status. The dependency
     *         container can't be an essential container.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HEALTHY - The dependency container has passed its Docker health check. Use this condition with dependency
     *         containers that have health checks configured. This condition is confirmed at container group startup
     *         only.
     *         </p>
     *         </li>
     * @see ContainerDependencyCondition
     */

    public String getCondition() {
        return this.condition;
    }

    /**
     * <p>
     * The condition that the dependency container must reach before the dependent container can start. Valid conditions
     * include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * START - The dependency container must have started.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETE - The dependency container has run to completion (exits). Use this condition with nonessential
     * containers, such as those that run a script and then exit. The dependency container can't be an essential
     * container.
     * </p>
     * </li>
     * <li>
     * <p>
     * SUCCESS - The dependency container has run to completion and exited with a zero status. The dependency container
     * can't be an essential container.
     * </p>
     * </li>
     * <li>
     * <p>
     * HEALTHY - The dependency container has passed its Docker health check. Use this condition with dependency
     * containers that have health checks configured. This condition is confirmed at container group startup only.
     * </p>
     * </li>
     * </ul>
     * 
     * @param condition
     *        The condition that the dependency container must reach before the dependent container can start. Valid
     *        conditions include: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        START - The dependency container must have started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPLETE - The dependency container has run to completion (exits). Use this condition with nonessential
     *        containers, such as those that run a script and then exit. The dependency container can't be an essential
     *        container.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SUCCESS - The dependency container has run to completion and exited with a zero status. The dependency
     *        container can't be an essential container.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        HEALTHY - The dependency container has passed its Docker health check. Use this condition with dependency
     *        containers that have health checks configured. This condition is confirmed at container group startup
     *        only.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerDependencyCondition
     */

    public ContainerDependency withCondition(String condition) {
        setCondition(condition);
        return this;
    }

    /**
     * <p>
     * The condition that the dependency container must reach before the dependent container can start. Valid conditions
     * include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * START - The dependency container must have started.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETE - The dependency container has run to completion (exits). Use this condition with nonessential
     * containers, such as those that run a script and then exit. The dependency container can't be an essential
     * container.
     * </p>
     * </li>
     * <li>
     * <p>
     * SUCCESS - The dependency container has run to completion and exited with a zero status. The dependency container
     * can't be an essential container.
     * </p>
     * </li>
     * <li>
     * <p>
     * HEALTHY - The dependency container has passed its Docker health check. Use this condition with dependency
     * containers that have health checks configured. This condition is confirmed at container group startup only.
     * </p>
     * </li>
     * </ul>
     * 
     * @param condition
     *        The condition that the dependency container must reach before the dependent container can start. Valid
     *        conditions include: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        START - The dependency container must have started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPLETE - The dependency container has run to completion (exits). Use this condition with nonessential
     *        containers, such as those that run a script and then exit. The dependency container can't be an essential
     *        container.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SUCCESS - The dependency container has run to completion and exited with a zero status. The dependency
     *        container can't be an essential container.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        HEALTHY - The dependency container has passed its Docker health check. Use this condition with dependency
     *        containers that have health checks configured. This condition is confirmed at container group startup
     *        only.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerDependencyCondition
     */

    public ContainerDependency withCondition(ContainerDependencyCondition condition) {
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
        com.amazonaws.services.gamelift.model.transform.ContainerDependencyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
