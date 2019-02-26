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
 * The task placement strategy for a task or service. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-placement-strategies.html">Task Placement
 * Strategies</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/PlacementStrategy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlacementStrategy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of placement strategy. The <code>random</code> placement strategy randomly places tasks on available
     * candidates. The <code>spread</code> placement strategy spreads placement across available candidates evenly based
     * on the <code>field</code> parameter. The <code>binpack</code> strategy places tasks on available candidates that
     * have the least available amount of the resource that is specified with the <code>field</code> parameter. For
     * example, if you binpack on memory, a task is placed on the instance with the least amount of remaining memory
     * (but still enough to run the task).
     * </p>
     */
    private String type;
    /**
     * <p>
     * The field to apply the placement strategy against. For the <code>spread</code> placement strategy, valid values
     * are <code>instanceId</code> (or <code>host</code>, which has the same effect), or any platform or custom
     * attribute that is applied to a container instance, such as <code>attribute:ecs.availability-zone</code>. For the
     * <code>binpack</code> placement strategy, valid values are <code>cpu</code> and <code>memory</code>. For the
     * <code>random</code> placement strategy, this field is not used.
     * </p>
     */
    private String field;

    /**
     * <p>
     * The type of placement strategy. The <code>random</code> placement strategy randomly places tasks on available
     * candidates. The <code>spread</code> placement strategy spreads placement across available candidates evenly based
     * on the <code>field</code> parameter. The <code>binpack</code> strategy places tasks on available candidates that
     * have the least available amount of the resource that is specified with the <code>field</code> parameter. For
     * example, if you binpack on memory, a task is placed on the instance with the least amount of remaining memory
     * (but still enough to run the task).
     * </p>
     * 
     * @param type
     *        The type of placement strategy. The <code>random</code> placement strategy randomly places tasks on
     *        available candidates. The <code>spread</code> placement strategy spreads placement across available
     *        candidates evenly based on the <code>field</code> parameter. The <code>binpack</code> strategy places
     *        tasks on available candidates that have the least available amount of the resource that is specified with
     *        the <code>field</code> parameter. For example, if you binpack on memory, a task is placed on the instance
     *        with the least amount of remaining memory (but still enough to run the task).
     * @see PlacementStrategyType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of placement strategy. The <code>random</code> placement strategy randomly places tasks on available
     * candidates. The <code>spread</code> placement strategy spreads placement across available candidates evenly based
     * on the <code>field</code> parameter. The <code>binpack</code> strategy places tasks on available candidates that
     * have the least available amount of the resource that is specified with the <code>field</code> parameter. For
     * example, if you binpack on memory, a task is placed on the instance with the least amount of remaining memory
     * (but still enough to run the task).
     * </p>
     * 
     * @return The type of placement strategy. The <code>random</code> placement strategy randomly places tasks on
     *         available candidates. The <code>spread</code> placement strategy spreads placement across available
     *         candidates evenly based on the <code>field</code> parameter. The <code>binpack</code> strategy places
     *         tasks on available candidates that have the least available amount of the resource that is specified with
     *         the <code>field</code> parameter. For example, if you binpack on memory, a task is placed on the instance
     *         with the least amount of remaining memory (but still enough to run the task).
     * @see PlacementStrategyType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of placement strategy. The <code>random</code> placement strategy randomly places tasks on available
     * candidates. The <code>spread</code> placement strategy spreads placement across available candidates evenly based
     * on the <code>field</code> parameter. The <code>binpack</code> strategy places tasks on available candidates that
     * have the least available amount of the resource that is specified with the <code>field</code> parameter. For
     * example, if you binpack on memory, a task is placed on the instance with the least amount of remaining memory
     * (but still enough to run the task).
     * </p>
     * 
     * @param type
     *        The type of placement strategy. The <code>random</code> placement strategy randomly places tasks on
     *        available candidates. The <code>spread</code> placement strategy spreads placement across available
     *        candidates evenly based on the <code>field</code> parameter. The <code>binpack</code> strategy places
     *        tasks on available candidates that have the least available amount of the resource that is specified with
     *        the <code>field</code> parameter. For example, if you binpack on memory, a task is placed on the instance
     *        with the least amount of remaining memory (but still enough to run the task).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlacementStrategyType
     */

    public PlacementStrategy withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of placement strategy. The <code>random</code> placement strategy randomly places tasks on available
     * candidates. The <code>spread</code> placement strategy spreads placement across available candidates evenly based
     * on the <code>field</code> parameter. The <code>binpack</code> strategy places tasks on available candidates that
     * have the least available amount of the resource that is specified with the <code>field</code> parameter. For
     * example, if you binpack on memory, a task is placed on the instance with the least amount of remaining memory
     * (but still enough to run the task).
     * </p>
     * 
     * @param type
     *        The type of placement strategy. The <code>random</code> placement strategy randomly places tasks on
     *        available candidates. The <code>spread</code> placement strategy spreads placement across available
     *        candidates evenly based on the <code>field</code> parameter. The <code>binpack</code> strategy places
     *        tasks on available candidates that have the least available amount of the resource that is specified with
     *        the <code>field</code> parameter. For example, if you binpack on memory, a task is placed on the instance
     *        with the least amount of remaining memory (but still enough to run the task).
     * @see PlacementStrategyType
     */

    public void setType(PlacementStrategyType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of placement strategy. The <code>random</code> placement strategy randomly places tasks on available
     * candidates. The <code>spread</code> placement strategy spreads placement across available candidates evenly based
     * on the <code>field</code> parameter. The <code>binpack</code> strategy places tasks on available candidates that
     * have the least available amount of the resource that is specified with the <code>field</code> parameter. For
     * example, if you binpack on memory, a task is placed on the instance with the least amount of remaining memory
     * (but still enough to run the task).
     * </p>
     * 
     * @param type
     *        The type of placement strategy. The <code>random</code> placement strategy randomly places tasks on
     *        available candidates. The <code>spread</code> placement strategy spreads placement across available
     *        candidates evenly based on the <code>field</code> parameter. The <code>binpack</code> strategy places
     *        tasks on available candidates that have the least available amount of the resource that is specified with
     *        the <code>field</code> parameter. For example, if you binpack on memory, a task is placed on the instance
     *        with the least amount of remaining memory (but still enough to run the task).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlacementStrategyType
     */

    public PlacementStrategy withType(PlacementStrategyType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The field to apply the placement strategy against. For the <code>spread</code> placement strategy, valid values
     * are <code>instanceId</code> (or <code>host</code>, which has the same effect), or any platform or custom
     * attribute that is applied to a container instance, such as <code>attribute:ecs.availability-zone</code>. For the
     * <code>binpack</code> placement strategy, valid values are <code>cpu</code> and <code>memory</code>. For the
     * <code>random</code> placement strategy, this field is not used.
     * </p>
     * 
     * @param field
     *        The field to apply the placement strategy against. For the <code>spread</code> placement strategy, valid
     *        values are <code>instanceId</code> (or <code>host</code>, which has the same effect), or any platform or
     *        custom attribute that is applied to a container instance, such as
     *        <code>attribute:ecs.availability-zone</code>. For the <code>binpack</code> placement strategy, valid
     *        values are <code>cpu</code> and <code>memory</code>. For the <code>random</code> placement strategy, this
     *        field is not used.
     */

    public void setField(String field) {
        this.field = field;
    }

    /**
     * <p>
     * The field to apply the placement strategy against. For the <code>spread</code> placement strategy, valid values
     * are <code>instanceId</code> (or <code>host</code>, which has the same effect), or any platform or custom
     * attribute that is applied to a container instance, such as <code>attribute:ecs.availability-zone</code>. For the
     * <code>binpack</code> placement strategy, valid values are <code>cpu</code> and <code>memory</code>. For the
     * <code>random</code> placement strategy, this field is not used.
     * </p>
     * 
     * @return The field to apply the placement strategy against. For the <code>spread</code> placement strategy, valid
     *         values are <code>instanceId</code> (or <code>host</code>, which has the same effect), or any platform or
     *         custom attribute that is applied to a container instance, such as
     *         <code>attribute:ecs.availability-zone</code>. For the <code>binpack</code> placement strategy, valid
     *         values are <code>cpu</code> and <code>memory</code>. For the <code>random</code> placement strategy, this
     *         field is not used.
     */

    public String getField() {
        return this.field;
    }

    /**
     * <p>
     * The field to apply the placement strategy against. For the <code>spread</code> placement strategy, valid values
     * are <code>instanceId</code> (or <code>host</code>, which has the same effect), or any platform or custom
     * attribute that is applied to a container instance, such as <code>attribute:ecs.availability-zone</code>. For the
     * <code>binpack</code> placement strategy, valid values are <code>cpu</code> and <code>memory</code>. For the
     * <code>random</code> placement strategy, this field is not used.
     * </p>
     * 
     * @param field
     *        The field to apply the placement strategy against. For the <code>spread</code> placement strategy, valid
     *        values are <code>instanceId</code> (or <code>host</code>, which has the same effect), or any platform or
     *        custom attribute that is applied to a container instance, such as
     *        <code>attribute:ecs.availability-zone</code>. For the <code>binpack</code> placement strategy, valid
     *        values are <code>cpu</code> and <code>memory</code>. For the <code>random</code> placement strategy, this
     *        field is not used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlacementStrategy withField(String field) {
        setField(field);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getField() != null)
            sb.append("Field: ").append(getField());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PlacementStrategy == false)
            return false;
        PlacementStrategy other = (PlacementStrategy) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getField() == null ^ this.getField() == null)
            return false;
        if (other.getField() != null && other.getField().equals(this.getField()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getField() == null) ? 0 : getField().hashCode());
        return hashCode;
    }

    @Override
    public PlacementStrategy clone() {
        try {
            return (PlacementStrategy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.PlacementStrategyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
