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

/**
 * <p>
 * A list of container overrides in JSON format that specify the name of
 * a container in a task definition and the command it should run instead
 * of its default.
 * </p>
 */
public class TaskOverride implements Serializable, Cloneable {

    /**
     * One or more container overrides sent to a task.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ContainerOverride> containerOverrides;

    /**
     * One or more container overrides sent to a task.
     *
     * @return One or more container overrides sent to a task.
     */
    public java.util.List<ContainerOverride> getContainerOverrides() {
        if (containerOverrides == null) {
              containerOverrides = new com.amazonaws.internal.ListWithAutoConstructFlag<ContainerOverride>();
              containerOverrides.setAutoConstruct(true);
        }
        return containerOverrides;
    }
    
    /**
     * One or more container overrides sent to a task.
     *
     * @param containerOverrides One or more container overrides sent to a task.
     */
    public void setContainerOverrides(java.util.Collection<ContainerOverride> containerOverrides) {
        if (containerOverrides == null) {
            this.containerOverrides = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ContainerOverride> containerOverridesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ContainerOverride>(containerOverrides.size());
        containerOverridesCopy.addAll(containerOverrides);
        this.containerOverrides = containerOverridesCopy;
    }
    
    /**
     * One or more container overrides sent to a task.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setContainerOverrides(java.util.Collection)} or
     * {@link #withContainerOverrides(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param containerOverrides One or more container overrides sent to a task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TaskOverride withContainerOverrides(ContainerOverride... containerOverrides) {
        if (getContainerOverrides() == null) setContainerOverrides(new java.util.ArrayList<ContainerOverride>(containerOverrides.length));
        for (ContainerOverride value : containerOverrides) {
            getContainerOverrides().add(value);
        }
        return this;
    }
    
    /**
     * One or more container overrides sent to a task.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param containerOverrides One or more container overrides sent to a task.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TaskOverride withContainerOverrides(java.util.Collection<ContainerOverride> containerOverrides) {
        if (containerOverrides == null) {
            this.containerOverrides = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ContainerOverride> containerOverridesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ContainerOverride>(containerOverrides.size());
            containerOverridesCopy.addAll(containerOverrides);
            this.containerOverrides = containerOverridesCopy;
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
        if (getContainerOverrides() != null) sb.append("ContainerOverrides: " + getContainerOverrides() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getContainerOverrides() == null) ? 0 : getContainerOverrides().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TaskOverride == false) return false;
        TaskOverride other = (TaskOverride)obj;
        
        if (other.getContainerOverrides() == null ^ this.getContainerOverrides() == null) return false;
        if (other.getContainerOverrides() != null && other.getContainerOverrides().equals(this.getContainerOverrides()) == false) return false; 
        return true;
    }
    
    @Override
    public TaskOverride clone() {
        try {
            return (TaskOverride) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    