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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DeleteTaskDefinitions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTaskDefinitionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full Amazon Resource Name
     * (ARN) of the task definition to delete. You must specify a <code>revision</code>.
     * </p>
     * <p>
     * You can specify up to 10 task definitions as a comma separated list.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> taskDefinitions;

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full Amazon Resource Name
     * (ARN) of the task definition to delete. You must specify a <code>revision</code>.
     * </p>
     * <p>
     * You can specify up to 10 task definitions as a comma separated list.
     * </p>
     * 
     * @return The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full Amazon Resource
     *         Name (ARN) of the task definition to delete. You must specify a <code>revision</code>.</p>
     *         <p>
     *         You can specify up to 10 task definitions as a comma separated list.
     */

    public java.util.List<String> getTaskDefinitions() {
        if (taskDefinitions == null) {
            taskDefinitions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return taskDefinitions;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full Amazon Resource Name
     * (ARN) of the task definition to delete. You must specify a <code>revision</code>.
     * </p>
     * <p>
     * You can specify up to 10 task definitions as a comma separated list.
     * </p>
     * 
     * @param taskDefinitions
     *        The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full Amazon Resource
     *        Name (ARN) of the task definition to delete. You must specify a <code>revision</code>.</p>
     *        <p>
     *        You can specify up to 10 task definitions as a comma separated list.
     */

    public void setTaskDefinitions(java.util.Collection<String> taskDefinitions) {
        if (taskDefinitions == null) {
            this.taskDefinitions = null;
            return;
        }

        this.taskDefinitions = new com.amazonaws.internal.SdkInternalList<String>(taskDefinitions);
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full Amazon Resource Name
     * (ARN) of the task definition to delete. You must specify a <code>revision</code>.
     * </p>
     * <p>
     * You can specify up to 10 task definitions as a comma separated list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTaskDefinitions(java.util.Collection)} or {@link #withTaskDefinitions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param taskDefinitions
     *        The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full Amazon Resource
     *        Name (ARN) of the task definition to delete. You must specify a <code>revision</code>.</p>
     *        <p>
     *        You can specify up to 10 task definitions as a comma separated list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTaskDefinitionsRequest withTaskDefinitions(String... taskDefinitions) {
        if (this.taskDefinitions == null) {
            setTaskDefinitions(new com.amazonaws.internal.SdkInternalList<String>(taskDefinitions.length));
        }
        for (String ele : taskDefinitions) {
            this.taskDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full Amazon Resource Name
     * (ARN) of the task definition to delete. You must specify a <code>revision</code>.
     * </p>
     * <p>
     * You can specify up to 10 task definitions as a comma separated list.
     * </p>
     * 
     * @param taskDefinitions
     *        The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full Amazon Resource
     *        Name (ARN) of the task definition to delete. You must specify a <code>revision</code>.</p>
     *        <p>
     *        You can specify up to 10 task definitions as a comma separated list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTaskDefinitionsRequest withTaskDefinitions(java.util.Collection<String> taskDefinitions) {
        setTaskDefinitions(taskDefinitions);
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
        if (getTaskDefinitions() != null)
            sb.append("TaskDefinitions: ").append(getTaskDefinitions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTaskDefinitionsRequest == false)
            return false;
        DeleteTaskDefinitionsRequest other = (DeleteTaskDefinitionsRequest) obj;
        if (other.getTaskDefinitions() == null ^ this.getTaskDefinitions() == null)
            return false;
        if (other.getTaskDefinitions() != null && other.getTaskDefinitions().equals(this.getTaskDefinitions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskDefinitions() == null) ? 0 : getTaskDefinitions().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTaskDefinitionsRequest clone() {
        return (DeleteTaskDefinitionsRequest) super.clone();
    }

}
