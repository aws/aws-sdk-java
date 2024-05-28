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
 * The properties of a container group that is deployed to a container fleet.
 * </p>
 * <p>
 * <b>Part of:</b> <a>ContainerGroupsAttributes</a>
 * </p>
 * <p>
 * <b>Returned by:</b> <a>DescribeFleetAttributes</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ContainerGroupDefinitionProperty"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerGroupDefinitionProperty implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The method for scheduling and maintaining copies of the container group across a container fleet.
     * </p>
     */
    private String schedulingStrategy;
    /**
     * <p>
     * The unique identifier for the container group definition.
     * </p>
     */
    private String containerGroupDefinitionName;

    /**
     * <p>
     * The method for scheduling and maintaining copies of the container group across a container fleet.
     * </p>
     * 
     * @param schedulingStrategy
     *        The method for scheduling and maintaining copies of the container group across a container fleet.
     * @see ContainerSchedulingStrategy
     */

    public void setSchedulingStrategy(String schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy;
    }

    /**
     * <p>
     * The method for scheduling and maintaining copies of the container group across a container fleet.
     * </p>
     * 
     * @return The method for scheduling and maintaining copies of the container group across a container fleet.
     * @see ContainerSchedulingStrategy
     */

    public String getSchedulingStrategy() {
        return this.schedulingStrategy;
    }

    /**
     * <p>
     * The method for scheduling and maintaining copies of the container group across a container fleet.
     * </p>
     * 
     * @param schedulingStrategy
     *        The method for scheduling and maintaining copies of the container group across a container fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerSchedulingStrategy
     */

    public ContainerGroupDefinitionProperty withSchedulingStrategy(String schedulingStrategy) {
        setSchedulingStrategy(schedulingStrategy);
        return this;
    }

    /**
     * <p>
     * The method for scheduling and maintaining copies of the container group across a container fleet.
     * </p>
     * 
     * @param schedulingStrategy
     *        The method for scheduling and maintaining copies of the container group across a container fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerSchedulingStrategy
     */

    public ContainerGroupDefinitionProperty withSchedulingStrategy(ContainerSchedulingStrategy schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier for the container group definition.
     * </p>
     * 
     * @param containerGroupDefinitionName
     *        The unique identifier for the container group definition.
     */

    public void setContainerGroupDefinitionName(String containerGroupDefinitionName) {
        this.containerGroupDefinitionName = containerGroupDefinitionName;
    }

    /**
     * <p>
     * The unique identifier for the container group definition.
     * </p>
     * 
     * @return The unique identifier for the container group definition.
     */

    public String getContainerGroupDefinitionName() {
        return this.containerGroupDefinitionName;
    }

    /**
     * <p>
     * The unique identifier for the container group definition.
     * </p>
     * 
     * @param containerGroupDefinitionName
     *        The unique identifier for the container group definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerGroupDefinitionProperty withContainerGroupDefinitionName(String containerGroupDefinitionName) {
        setContainerGroupDefinitionName(containerGroupDefinitionName);
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
        if (getSchedulingStrategy() != null)
            sb.append("SchedulingStrategy: ").append(getSchedulingStrategy()).append(",");
        if (getContainerGroupDefinitionName() != null)
            sb.append("ContainerGroupDefinitionName: ").append(getContainerGroupDefinitionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerGroupDefinitionProperty == false)
            return false;
        ContainerGroupDefinitionProperty other = (ContainerGroupDefinitionProperty) obj;
        if (other.getSchedulingStrategy() == null ^ this.getSchedulingStrategy() == null)
            return false;
        if (other.getSchedulingStrategy() != null && other.getSchedulingStrategy().equals(this.getSchedulingStrategy()) == false)
            return false;
        if (other.getContainerGroupDefinitionName() == null ^ this.getContainerGroupDefinitionName() == null)
            return false;
        if (other.getContainerGroupDefinitionName() != null && other.getContainerGroupDefinitionName().equals(this.getContainerGroupDefinitionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchedulingStrategy() == null) ? 0 : getSchedulingStrategy().hashCode());
        hashCode = prime * hashCode + ((getContainerGroupDefinitionName() == null) ? 0 : getContainerGroupDefinitionName().hashCode());
        return hashCode;
    }

    @Override
    public ContainerGroupDefinitionProperty clone() {
        try {
            return (ContainerGroupDefinitionProperty) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.ContainerGroupDefinitionPropertyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
