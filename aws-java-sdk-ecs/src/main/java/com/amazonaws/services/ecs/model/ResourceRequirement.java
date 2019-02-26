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
 * The type and amount of a resource to assign to a container. The only supported resource is a GPU. For more
 * information, see <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-gpu.html">Working with GPUs
 * on Amazon ECS</a> in the <i>Amazon Elastic Container Service Developer Guide</i>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ResourceRequirement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceRequirement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of physical <code>GPUs</code> the Amazon ECS container agent will reserve for the container. The
     * number of GPUs reserved for all containers in a task should not exceed the number of available GPUs on the
     * container instance the task is launched on.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The type of resource to assign to a container. The only supported value is <code>GPU</code>.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The number of physical <code>GPUs</code> the Amazon ECS container agent will reserve for the container. The
     * number of GPUs reserved for all containers in a task should not exceed the number of available GPUs on the
     * container instance the task is launched on.
     * </p>
     * 
     * @param value
     *        The number of physical <code>GPUs</code> the Amazon ECS container agent will reserve for the container.
     *        The number of GPUs reserved for all containers in a task should not exceed the number of available GPUs on
     *        the container instance the task is launched on.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The number of physical <code>GPUs</code> the Amazon ECS container agent will reserve for the container. The
     * number of GPUs reserved for all containers in a task should not exceed the number of available GPUs on the
     * container instance the task is launched on.
     * </p>
     * 
     * @return The number of physical <code>GPUs</code> the Amazon ECS container agent will reserve for the container.
     *         The number of GPUs reserved for all containers in a task should not exceed the number of available GPUs
     *         on the container instance the task is launched on.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The number of physical <code>GPUs</code> the Amazon ECS container agent will reserve for the container. The
     * number of GPUs reserved for all containers in a task should not exceed the number of available GPUs on the
     * container instance the task is launched on.
     * </p>
     * 
     * @param value
     *        The number of physical <code>GPUs</code> the Amazon ECS container agent will reserve for the container.
     *        The number of GPUs reserved for all containers in a task should not exceed the number of available GPUs on
     *        the container instance the task is launched on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceRequirement withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The type of resource to assign to a container. The only supported value is <code>GPU</code>.
     * </p>
     * 
     * @param type
     *        The type of resource to assign to a container. The only supported value is <code>GPU</code>.
     * @see ResourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of resource to assign to a container. The only supported value is <code>GPU</code>.
     * </p>
     * 
     * @return The type of resource to assign to a container. The only supported value is <code>GPU</code>.
     * @see ResourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of resource to assign to a container. The only supported value is <code>GPU</code>.
     * </p>
     * 
     * @param type
     *        The type of resource to assign to a container. The only supported value is <code>GPU</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ResourceRequirement withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of resource to assign to a container. The only supported value is <code>GPU</code>.
     * </p>
     * 
     * @param type
     *        The type of resource to assign to a container. The only supported value is <code>GPU</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ResourceRequirement withType(ResourceType type) {
        this.type = type.toString();
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceRequirement == false)
            return false;
        ResourceRequirement other = (ResourceRequirement) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ResourceRequirement clone() {
        try {
            return (ResourceRequirement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.ResourceRequirementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
