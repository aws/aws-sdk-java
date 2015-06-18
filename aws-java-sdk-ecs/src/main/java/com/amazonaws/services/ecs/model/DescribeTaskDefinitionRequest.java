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
 * Container for the parameters to the {@link com.amazonaws.services.ecs.AmazonECS#describeTaskDefinition(DescribeTaskDefinitionRequest) DescribeTaskDefinition operation}.
 * <p>
 * Describes a task definition. You can specify a <code>family</code> and
 * <code>revision</code> to find information on a specific task
 * definition, or you can simply specify the family to find the latest
 * <code>ACTIVE</code> revision in that family.
 * </p>
 * <p>
 * <b>NOTE:</b> You can only describe INACTIVE task definitions while an
 * active task or service references them.
 * </p>
 *
 * @see com.amazonaws.services.ecs.AmazonECS#describeTaskDefinition(DescribeTaskDefinitionRequest)
 */
public class DescribeTaskDefinitionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The <code>family</code> for the latest <code>ACTIVE</code> revision,
     * <code>family</code> and <code>revision</code>
     * (<code>family:revision</code>) for a specific revision in the family,
     * or full Amazon Resource Name (ARN) of the task definition that you
     * want to describe.
     */
    private String taskDefinition;

    /**
     * The <code>family</code> for the latest <code>ACTIVE</code> revision,
     * <code>family</code> and <code>revision</code>
     * (<code>family:revision</code>) for a specific revision in the family,
     * or full Amazon Resource Name (ARN) of the task definition that you
     * want to describe.
     *
     * @return The <code>family</code> for the latest <code>ACTIVE</code> revision,
     *         <code>family</code> and <code>revision</code>
     *         (<code>family:revision</code>) for a specific revision in the family,
     *         or full Amazon Resource Name (ARN) of the task definition that you
     *         want to describe.
     */
    public String getTaskDefinition() {
        return taskDefinition;
    }
    
    /**
     * The <code>family</code> for the latest <code>ACTIVE</code> revision,
     * <code>family</code> and <code>revision</code>
     * (<code>family:revision</code>) for a specific revision in the family,
     * or full Amazon Resource Name (ARN) of the task definition that you
     * want to describe.
     *
     * @param taskDefinition The <code>family</code> for the latest <code>ACTIVE</code> revision,
     *         <code>family</code> and <code>revision</code>
     *         (<code>family:revision</code>) for a specific revision in the family,
     *         or full Amazon Resource Name (ARN) of the task definition that you
     *         want to describe.
     */
    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }
    
    /**
     * The <code>family</code> for the latest <code>ACTIVE</code> revision,
     * <code>family</code> and <code>revision</code>
     * (<code>family:revision</code>) for a specific revision in the family,
     * or full Amazon Resource Name (ARN) of the task definition that you
     * want to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taskDefinition The <code>family</code> for the latest <code>ACTIVE</code> revision,
     *         <code>family</code> and <code>revision</code>
     *         (<code>family:revision</code>) for a specific revision in the family,
     *         or full Amazon Resource Name (ARN) of the task definition that you
     *         want to describe.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTaskDefinitionRequest withTaskDefinition(String taskDefinition) {
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

        if (obj instanceof DescribeTaskDefinitionRequest == false) return false;
        DescribeTaskDefinitionRequest other = (DescribeTaskDefinitionRequest)obj;
        
        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null) return false;
        if (other.getTaskDefinition() != null && other.getTaskDefinition().equals(this.getTaskDefinition()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeTaskDefinitionRequest clone() {
        
            return (DescribeTaskDefinitionRequest) super.clone();
    }

}
    