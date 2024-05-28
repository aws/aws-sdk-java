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
 * A list of containers that this task depends on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/TaskContainerDependency" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskContainerDependency implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the container.
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
     * permitting other containers to start. This can be useful for nonessential containers that run a script and then
     * exit. This condition can't be set on an essential container.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> - This condition is the same as <code>COMPLETE</code>, but it also requires that the
     * container exits with a zero status. This condition can't be set on an essential container.
     * </p>
     * </li>
     * </ul>
     */
    private String condition;

    /**
     * <p>
     * A unique identifier for the container.
     * </p>
     * 
     * @param containerName
     *        A unique identifier for the container.
     */

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * <p>
     * A unique identifier for the container.
     * </p>
     * 
     * @return A unique identifier for the container.
     */

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * <p>
     * A unique identifier for the container.
     * </p>
     * 
     * @param containerName
     *        A unique identifier for the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerDependency withContainerName(String containerName) {
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
     * permitting other containers to start. This can be useful for nonessential containers that run a script and then
     * exit. This condition can't be set on an essential container.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> - This condition is the same as <code>COMPLETE</code>, but it also requires that the
     * container exits with a zero status. This condition can't be set on an essential container.
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
     *        before permitting other containers to start. This can be useful for nonessential containers that run a
     *        script and then exit. This condition can't be set on an essential container.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS</code> - This condition is the same as <code>COMPLETE</code>, but it also requires that the
     *        container exits with a zero status. This condition can't be set on an essential container.
     *        </p>
     *        </li>
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
     * permitting other containers to start. This can be useful for nonessential containers that run a script and then
     * exit. This condition can't be set on an essential container.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> - This condition is the same as <code>COMPLETE</code>, but it also requires that the
     * container exits with a zero status. This condition can't be set on an essential container.
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
     *         before permitting other containers to start. This can be useful for nonessential containers that run a
     *         script and then exit. This condition can't be set on an essential container.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUCCESS</code> - This condition is the same as <code>COMPLETE</code>, but it also requires that the
     *         container exits with a zero status. This condition can't be set on an essential container.
     *         </p>
     *         </li>
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
     * permitting other containers to start. This can be useful for nonessential containers that run a script and then
     * exit. This condition can't be set on an essential container.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> - This condition is the same as <code>COMPLETE</code>, but it also requires that the
     * container exits with a zero status. This condition can't be set on an essential container.
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
     *        before permitting other containers to start. This can be useful for nonessential containers that run a
     *        script and then exit. This condition can't be set on an essential container.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS</code> - This condition is the same as <code>COMPLETE</code>, but it also requires that the
     *        container exits with a zero status. This condition can't be set on an essential container.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskContainerDependency withCondition(String condition) {
        setCondition(condition);
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

        if (obj instanceof TaskContainerDependency == false)
            return false;
        TaskContainerDependency other = (TaskContainerDependency) obj;
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
    public TaskContainerDependency clone() {
        try {
            return (TaskContainerDependency) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.TaskContainerDependencyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
