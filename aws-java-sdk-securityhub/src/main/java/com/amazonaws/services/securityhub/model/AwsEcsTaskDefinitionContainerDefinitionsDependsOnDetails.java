/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A dependency that is defined for container startup and shutdown.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The dependency condition of the dependent container. Indicates the required status of the dependent container
     * before the current container can start.
     * </p>
     */
    private String condition;
    /**
     * <p>
     * The name of the dependent container.
     * </p>
     */
    private String containerName;

    /**
     * <p>
     * The dependency condition of the dependent container. Indicates the required status of the dependent container
     * before the current container can start.
     * </p>
     * 
     * @param condition
     *        The dependency condition of the dependent container. Indicates the required status of the dependent
     *        container before the current container can start.
     */

    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * The dependency condition of the dependent container. Indicates the required status of the dependent container
     * before the current container can start.
     * </p>
     * 
     * @return The dependency condition of the dependent container. Indicates the required status of the dependent
     *         container before the current container can start.
     */

    public String getCondition() {
        return this.condition;
    }

    /**
     * <p>
     * The dependency condition of the dependent container. Indicates the required status of the dependent container
     * before the current container can start.
     * </p>
     * 
     * @param condition
     *        The dependency condition of the dependent container. Indicates the required status of the dependent
     *        container before the current container can start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails withCondition(String condition) {
        setCondition(condition);
        return this;
    }

    /**
     * <p>
     * The name of the dependent container.
     * </p>
     * 
     * @param containerName
     *        The name of the dependent container.
     */

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * <p>
     * The name of the dependent container.
     * </p>
     * 
     * @return The name of the dependent container.
     */

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * <p>
     * The name of the dependent container.
     * </p>
     * 
     * @param containerName
     *        The name of the dependent container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails withContainerName(String containerName) {
        setContainerName(containerName);
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
        if (getCondition() != null)
            sb.append("Condition: ").append(getCondition()).append(",");
        if (getContainerName() != null)
            sb.append("ContainerName: ").append(getContainerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails == false)
            return false;
        AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails other = (AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails) obj;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null && other.getCondition().equals(this.getCondition()) == false)
            return false;
        if (other.getContainerName() == null ^ this.getContainerName() == null)
            return false;
        if (other.getContainerName() != null && other.getContainerName().equals(this.getContainerName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        hashCode = prime * hashCode + ((getContainerName() == null) ? 0 : getContainerName().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails clone() {
        try {
            return (AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
