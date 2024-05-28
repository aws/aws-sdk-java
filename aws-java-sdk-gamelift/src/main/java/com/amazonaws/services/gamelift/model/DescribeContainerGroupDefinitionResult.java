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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeContainerGroupDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeContainerGroupDefinitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The properties of the requested container group definition resource.
     * </p>
     */
    private ContainerGroupDefinition containerGroupDefinition;

    /**
     * <p>
     * The properties of the requested container group definition resource.
     * </p>
     * 
     * @param containerGroupDefinition
     *        The properties of the requested container group definition resource.
     */

    public void setContainerGroupDefinition(ContainerGroupDefinition containerGroupDefinition) {
        this.containerGroupDefinition = containerGroupDefinition;
    }

    /**
     * <p>
     * The properties of the requested container group definition resource.
     * </p>
     * 
     * @return The properties of the requested container group definition resource.
     */

    public ContainerGroupDefinition getContainerGroupDefinition() {
        return this.containerGroupDefinition;
    }

    /**
     * <p>
     * The properties of the requested container group definition resource.
     * </p>
     * 
     * @param containerGroupDefinition
     *        The properties of the requested container group definition resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContainerGroupDefinitionResult withContainerGroupDefinition(ContainerGroupDefinition containerGroupDefinition) {
        setContainerGroupDefinition(containerGroupDefinition);
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
        if (getContainerGroupDefinition() != null)
            sb.append("ContainerGroupDefinition: ").append(getContainerGroupDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeContainerGroupDefinitionResult == false)
            return false;
        DescribeContainerGroupDefinitionResult other = (DescribeContainerGroupDefinitionResult) obj;
        if (other.getContainerGroupDefinition() == null ^ this.getContainerGroupDefinition() == null)
            return false;
        if (other.getContainerGroupDefinition() != null && other.getContainerGroupDefinition().equals(this.getContainerGroupDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerGroupDefinition() == null) ? 0 : getContainerGroupDefinition().hashCode());
        return hashCode;
    }

    @Override
    public DescribeContainerGroupDefinitionResult clone() {
        try {
            return (DescribeContainerGroupDefinitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
