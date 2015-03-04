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
 * 
 */
public class DescribeTaskDefinitionResult implements Serializable, Cloneable {

    /**
     * The full task definition description.
     */
    private TaskDefinition taskDefinition;

    /**
     * The full task definition description.
     *
     * @return The full task definition description.
     */
    public TaskDefinition getTaskDefinition() {
        return taskDefinition;
    }
    
    /**
     * The full task definition description.
     *
     * @param taskDefinition The full task definition description.
     */
    public void setTaskDefinition(TaskDefinition taskDefinition) {
        this.taskDefinition = taskDefinition;
    }
    
    /**
     * The full task definition description.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taskDefinition The full task definition description.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTaskDefinitionResult withTaskDefinition(TaskDefinition taskDefinition) {
        this.taskDefinition = taskDefinition;
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
        if (getTaskDefinition() != null) sb.append("TaskDefinition: " + getTaskDefinition() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTaskDefinition() == null) ? 0 : getTaskDefinition().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeTaskDefinitionResult == false) return false;
        DescribeTaskDefinitionResult other = (DescribeTaskDefinitionResult)obj;
        
        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null) return false;
        if (other.getTaskDefinition() != null && other.getTaskDefinition().equals(this.getTaskDefinition()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeTaskDefinitionResult clone() {
        try {
            return (DescribeTaskDefinitionResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    