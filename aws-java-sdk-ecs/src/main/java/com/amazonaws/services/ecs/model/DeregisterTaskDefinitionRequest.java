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
 * Container for the parameters to the {@link com.amazonaws.services.ecs.AmazonECS#deregisterTaskDefinition(DeregisterTaskDefinitionRequest) DeregisterTaskDefinition operation}.
 * <p>
 * Deregisters the specified task definition. You will no longer be able
 * to run tasks from this definition after deregistration.
 * </p>
 *
 * @see com.amazonaws.services.ecs.AmazonECS#deregisterTaskDefinition(DeregisterTaskDefinitionRequest)
 */
public class DeregisterTaskDefinitionRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The <code>family</code> and <code>revision</code>
     * (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     * the task definition that you want to deregister.
     */
    private String taskDefinition;

    /**
     * The <code>family</code> and <code>revision</code>
     * (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     * the task definition that you want to deregister.
     *
     * @return The <code>family</code> and <code>revision</code>
     *         (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     *         the task definition that you want to deregister.
     */
    public String getTaskDefinition() {
        return taskDefinition;
    }
    
    /**
     * The <code>family</code> and <code>revision</code>
     * (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     * the task definition that you want to deregister.
     *
     * @param taskDefinition The <code>family</code> and <code>revision</code>
     *         (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     *         the task definition that you want to deregister.
     */
    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }
    
    /**
     * The <code>family</code> and <code>revision</code>
     * (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     * the task definition that you want to deregister.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taskDefinition The <code>family</code> and <code>revision</code>
     *         (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     *         the task definition that you want to deregister.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeregisterTaskDefinitionRequest withTaskDefinition(String taskDefinition) {
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

        if (obj instanceof DeregisterTaskDefinitionRequest == false) return false;
        DeregisterTaskDefinitionRequest other = (DeregisterTaskDefinitionRequest)obj;
        
        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null) return false;
        if (other.getTaskDefinition() != null && other.getTaskDefinition().equals(this.getTaskDefinition()) == false) return false; 
        return true;
    }
    
}
    