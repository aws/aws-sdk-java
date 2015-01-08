/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ecs.AmazonECS#registerTaskDefinition(RegisterTaskDefinitionRequest) RegisterTaskDefinition operation}.
 * <p>
 * Registers a new task definition from the supplied <code>family</code>
 * and <code>containerDefinitions</code> .
 * </p>
 *
 * @see com.amazonaws.services.ecs.AmazonECS#registerTaskDefinition(RegisterTaskDefinitionRequest)
 */
public class RegisterTaskDefinitionRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * You can specify a <code>family</code> for a task definition, which
     * allows you to track multiple versions of the same task definition. You
     * can think of the <code>family</code> as a name for your task
     * definition.
     */
    private String family;

    /**
     * A list of container definitions in JSON format that describe the
     * different containers that make up your task.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ContainerDefinition> containerDefinitions;

    /**
     * You can specify a <code>family</code> for a task definition, which
     * allows you to track multiple versions of the same task definition. You
     * can think of the <code>family</code> as a name for your task
     * definition.
     *
     * @return You can specify a <code>family</code> for a task definition, which
     *         allows you to track multiple versions of the same task definition. You
     *         can think of the <code>family</code> as a name for your task
     *         definition.
     */
    public String getFamily() {
        return family;
    }
    
    /**
     * You can specify a <code>family</code> for a task definition, which
     * allows you to track multiple versions of the same task definition. You
     * can think of the <code>family</code> as a name for your task
     * definition.
     *
     * @param family You can specify a <code>family</code> for a task definition, which
     *         allows you to track multiple versions of the same task definition. You
     *         can think of the <code>family</code> as a name for your task
     *         definition.
     */
    public void setFamily(String family) {
        this.family = family;
    }
    
    /**
     * You can specify a <code>family</code> for a task definition, which
     * allows you to track multiple versions of the same task definition. You
     * can think of the <code>family</code> as a name for your task
     * definition.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param family You can specify a <code>family</code> for a task definition, which
     *         allows you to track multiple versions of the same task definition. You
     *         can think of the <code>family</code> as a name for your task
     *         definition.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterTaskDefinitionRequest withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * A list of container definitions in JSON format that describe the
     * different containers that make up your task.
     *
     * @return A list of container definitions in JSON format that describe the
     *         different containers that make up your task.
     */
    public java.util.List<ContainerDefinition> getContainerDefinitions() {
        if (containerDefinitions == null) {
              containerDefinitions = new com.amazonaws.internal.ListWithAutoConstructFlag<ContainerDefinition>();
              containerDefinitions.setAutoConstruct(true);
        }
        return containerDefinitions;
    }
    
    /**
     * A list of container definitions in JSON format that describe the
     * different containers that make up your task.
     *
     * @param containerDefinitions A list of container definitions in JSON format that describe the
     *         different containers that make up your task.
     */
    public void setContainerDefinitions(java.util.Collection<ContainerDefinition> containerDefinitions) {
        if (containerDefinitions == null) {
            this.containerDefinitions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ContainerDefinition> containerDefinitionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ContainerDefinition>(containerDefinitions.size());
        containerDefinitionsCopy.addAll(containerDefinitions);
        this.containerDefinitions = containerDefinitionsCopy;
    }
    
    /**
     * A list of container definitions in JSON format that describe the
     * different containers that make up your task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param containerDefinitions A list of container definitions in JSON format that describe the
     *         different containers that make up your task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterTaskDefinitionRequest withContainerDefinitions(ContainerDefinition... containerDefinitions) {
        if (getContainerDefinitions() == null) setContainerDefinitions(new java.util.ArrayList<ContainerDefinition>(containerDefinitions.length));
        for (ContainerDefinition value : containerDefinitions) {
            getContainerDefinitions().add(value);
        }
        return this;
    }
    
    /**
     * A list of container definitions in JSON format that describe the
     * different containers that make up your task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param containerDefinitions A list of container definitions in JSON format that describe the
     *         different containers that make up your task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RegisterTaskDefinitionRequest withContainerDefinitions(java.util.Collection<ContainerDefinition> containerDefinitions) {
        if (containerDefinitions == null) {
            this.containerDefinitions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ContainerDefinition> containerDefinitionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ContainerDefinition>(containerDefinitions.size());
            containerDefinitionsCopy.addAll(containerDefinitions);
            this.containerDefinitions = containerDefinitionsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFamily() != null) sb.append("Family: " + getFamily() + ",");
        if (getContainerDefinitions() != null) sb.append("ContainerDefinitions: " + getContainerDefinitions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFamily() == null) ? 0 : getFamily().hashCode()); 
        hashCode = prime * hashCode + ((getContainerDefinitions() == null) ? 0 : getContainerDefinitions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RegisterTaskDefinitionRequest == false) return false;
        RegisterTaskDefinitionRequest other = (RegisterTaskDefinitionRequest)obj;
        
        if (other.getFamily() == null ^ this.getFamily() == null) return false;
        if (other.getFamily() != null && other.getFamily().equals(this.getFamily()) == false) return false; 
        if (other.getContainerDefinitions() == null ^ this.getContainerDefinitions() == null) return false;
        if (other.getContainerDefinitions() != null && other.getContainerDefinitions().equals(this.getContainerDefinitions()) == false) return false; 
        return true;
    }
    
}
    