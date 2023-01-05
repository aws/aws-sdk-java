/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pipes.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The overrides that are associated with a task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/EcsTaskOverride" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EcsTaskOverride implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * One or more container overrides that are sent to a task.
     * </p>
     */
    private java.util.List<EcsContainerOverride> containerOverrides;
    /**
     * <p>
     * The cpu override for the task.
     * </p>
     */
    private String cpu;
    /**
     * <p>
     * The ephemeral storage setting override for the task.
     * </p>
     * <note>
     * <p>
     * This parameter is only supported for tasks hosted on Fargate that use the following platform versions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Linux platform version <code>1.4.0</code> or later.
     * </p>
     * </li>
     * <li>
     * <p>
     * Windows platform version <code>1.0.0</code> or later.
     * </p>
     * </li>
     * </ul>
     * </note>
     */
    private EcsEphemeralStorage ephemeralStorage;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution IAM role override for the task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html">Amazon ECS task
     * execution IAM role</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * The Elastic Inference accelerator override for the task.
     * </p>
     */
    private java.util.List<EcsInferenceAcceleratorOverride> inferenceAcceleratorOverrides;
    /**
     * <p>
     * The memory override for the task.
     * </p>
     */
    private String memory;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in this
     * task are granted the permissions that are specified in this role. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Role for Tasks</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String taskRoleArn;

    /**
     * <p>
     * One or more container overrides that are sent to a task.
     * </p>
     * 
     * @return One or more container overrides that are sent to a task.
     */

    public java.util.List<EcsContainerOverride> getContainerOverrides() {
        return containerOverrides;
    }

    /**
     * <p>
     * One or more container overrides that are sent to a task.
     * </p>
     * 
     * @param containerOverrides
     *        One or more container overrides that are sent to a task.
     */

    public void setContainerOverrides(java.util.Collection<EcsContainerOverride> containerOverrides) {
        if (containerOverrides == null) {
            this.containerOverrides = null;
            return;
        }

        this.containerOverrides = new java.util.ArrayList<EcsContainerOverride>(containerOverrides);
    }

    /**
     * <p>
     * One or more container overrides that are sent to a task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerOverrides(java.util.Collection)} or {@link #withContainerOverrides(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param containerOverrides
     *        One or more container overrides that are sent to a task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskOverride withContainerOverrides(EcsContainerOverride... containerOverrides) {
        if (this.containerOverrides == null) {
            setContainerOverrides(new java.util.ArrayList<EcsContainerOverride>(containerOverrides.length));
        }
        for (EcsContainerOverride ele : containerOverrides) {
            this.containerOverrides.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more container overrides that are sent to a task.
     * </p>
     * 
     * @param containerOverrides
     *        One or more container overrides that are sent to a task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskOverride withContainerOverrides(java.util.Collection<EcsContainerOverride> containerOverrides) {
        setContainerOverrides(containerOverrides);
        return this;
    }

    /**
     * <p>
     * The cpu override for the task.
     * </p>
     * 
     * @param cpu
     *        The cpu override for the task.
     */

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * <p>
     * The cpu override for the task.
     * </p>
     * 
     * @return The cpu override for the task.
     */

    public String getCpu() {
        return this.cpu;
    }

    /**
     * <p>
     * The cpu override for the task.
     * </p>
     * 
     * @param cpu
     *        The cpu override for the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskOverride withCpu(String cpu) {
        setCpu(cpu);
        return this;
    }

    /**
     * <p>
     * The ephemeral storage setting override for the task.
     * </p>
     * <note>
     * <p>
     * This parameter is only supported for tasks hosted on Fargate that use the following platform versions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Linux platform version <code>1.4.0</code> or later.
     * </p>
     * </li>
     * <li>
     * <p>
     * Windows platform version <code>1.0.0</code> or later.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param ephemeralStorage
     *        The ephemeral storage setting override for the task.</p> <note>
     *        <p>
     *        This parameter is only supported for tasks hosted on Fargate that use the following platform versions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Linux platform version <code>1.4.0</code> or later.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Windows platform version <code>1.0.0</code> or later.
     *        </p>
     *        </li>
     *        </ul>
     */

    public void setEphemeralStorage(EcsEphemeralStorage ephemeralStorage) {
        this.ephemeralStorage = ephemeralStorage;
    }

    /**
     * <p>
     * The ephemeral storage setting override for the task.
     * </p>
     * <note>
     * <p>
     * This parameter is only supported for tasks hosted on Fargate that use the following platform versions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Linux platform version <code>1.4.0</code> or later.
     * </p>
     * </li>
     * <li>
     * <p>
     * Windows platform version <code>1.0.0</code> or later.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @return The ephemeral storage setting override for the task.</p> <note>
     *         <p>
     *         This parameter is only supported for tasks hosted on Fargate that use the following platform versions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Linux platform version <code>1.4.0</code> or later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Windows platform version <code>1.0.0</code> or later.
     *         </p>
     *         </li>
     *         </ul>
     */

    public EcsEphemeralStorage getEphemeralStorage() {
        return this.ephemeralStorage;
    }

    /**
     * <p>
     * The ephemeral storage setting override for the task.
     * </p>
     * <note>
     * <p>
     * This parameter is only supported for tasks hosted on Fargate that use the following platform versions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Linux platform version <code>1.4.0</code> or later.
     * </p>
     * </li>
     * <li>
     * <p>
     * Windows platform version <code>1.0.0</code> or later.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param ephemeralStorage
     *        The ephemeral storage setting override for the task.</p> <note>
     *        <p>
     *        This parameter is only supported for tasks hosted on Fargate that use the following platform versions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Linux platform version <code>1.4.0</code> or later.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Windows platform version <code>1.0.0</code> or later.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskOverride withEphemeralStorage(EcsEphemeralStorage ephemeralStorage) {
        setEphemeralStorage(ephemeralStorage);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution IAM role override for the task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html">Amazon ECS task
     * execution IAM role</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the task execution IAM role override for the task. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html">Amazon ECS
     *        task execution IAM role</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution IAM role override for the task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html">Amazon ECS task
     * execution IAM role</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the task execution IAM role override for the task. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html">Amazon
     *         ECS task execution IAM role</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution IAM role override for the task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html">Amazon ECS task
     * execution IAM role</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the task execution IAM role override for the task. For more information,
     *        see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_execution_IAM_role.html">Amazon ECS
     *        task execution IAM role</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskOverride withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * The Elastic Inference accelerator override for the task.
     * </p>
     * 
     * @return The Elastic Inference accelerator override for the task.
     */

    public java.util.List<EcsInferenceAcceleratorOverride> getInferenceAcceleratorOverrides() {
        return inferenceAcceleratorOverrides;
    }

    /**
     * <p>
     * The Elastic Inference accelerator override for the task.
     * </p>
     * 
     * @param inferenceAcceleratorOverrides
     *        The Elastic Inference accelerator override for the task.
     */

    public void setInferenceAcceleratorOverrides(java.util.Collection<EcsInferenceAcceleratorOverride> inferenceAcceleratorOverrides) {
        if (inferenceAcceleratorOverrides == null) {
            this.inferenceAcceleratorOverrides = null;
            return;
        }

        this.inferenceAcceleratorOverrides = new java.util.ArrayList<EcsInferenceAcceleratorOverride>(inferenceAcceleratorOverrides);
    }

    /**
     * <p>
     * The Elastic Inference accelerator override for the task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInferenceAcceleratorOverrides(java.util.Collection)} or
     * {@link #withInferenceAcceleratorOverrides(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param inferenceAcceleratorOverrides
     *        The Elastic Inference accelerator override for the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskOverride withInferenceAcceleratorOverrides(EcsInferenceAcceleratorOverride... inferenceAcceleratorOverrides) {
        if (this.inferenceAcceleratorOverrides == null) {
            setInferenceAcceleratorOverrides(new java.util.ArrayList<EcsInferenceAcceleratorOverride>(inferenceAcceleratorOverrides.length));
        }
        for (EcsInferenceAcceleratorOverride ele : inferenceAcceleratorOverrides) {
            this.inferenceAcceleratorOverrides.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Elastic Inference accelerator override for the task.
     * </p>
     * 
     * @param inferenceAcceleratorOverrides
     *        The Elastic Inference accelerator override for the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskOverride withInferenceAcceleratorOverrides(java.util.Collection<EcsInferenceAcceleratorOverride> inferenceAcceleratorOverrides) {
        setInferenceAcceleratorOverrides(inferenceAcceleratorOverrides);
        return this;
    }

    /**
     * <p>
     * The memory override for the task.
     * </p>
     * 
     * @param memory
     *        The memory override for the task.
     */

    public void setMemory(String memory) {
        this.memory = memory;
    }

    /**
     * <p>
     * The memory override for the task.
     * </p>
     * 
     * @return The memory override for the task.
     */

    public String getMemory() {
        return this.memory;
    }

    /**
     * <p>
     * The memory override for the task.
     * </p>
     * 
     * @param memory
     *        The memory override for the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskOverride withMemory(String memory) {
        setMemory(memory);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in this
     * task are granted the permissions that are specified in this role. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Role for Tasks</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param taskRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in
     *        this task are granted the permissions that are specified in this role. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Role for
     *        Tasks</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setTaskRoleArn(String taskRoleArn) {
        this.taskRoleArn = taskRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in this
     * task are granted the permissions that are specified in this role. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Role for Tasks</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in
     *         this task are granted the permissions that are specified in this role. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Role for
     *         Tasks</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public String getTaskRoleArn() {
        return this.taskRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in this
     * task are granted the permissions that are specified in this role. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Role for Tasks</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param taskRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that containers in this task can assume. All containers in
     *        this task are granted the permissions that are specified in this role. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-iam-roles.html">IAM Role for
     *        Tasks</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsTaskOverride withTaskRoleArn(String taskRoleArn) {
        setTaskRoleArn(taskRoleArn);
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
        if (getContainerOverrides() != null)
            sb.append("ContainerOverrides: ").append(getContainerOverrides()).append(",");
        if (getCpu() != null)
            sb.append("Cpu: ").append(getCpu()).append(",");
        if (getEphemeralStorage() != null)
            sb.append("EphemeralStorage: ").append(getEphemeralStorage()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getInferenceAcceleratorOverrides() != null)
            sb.append("InferenceAcceleratorOverrides: ").append(getInferenceAcceleratorOverrides()).append(",");
        if (getMemory() != null)
            sb.append("Memory: ").append(getMemory()).append(",");
        if (getTaskRoleArn() != null)
            sb.append("TaskRoleArn: ").append(getTaskRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EcsTaskOverride == false)
            return false;
        EcsTaskOverride other = (EcsTaskOverride) obj;
        if (other.getContainerOverrides() == null ^ this.getContainerOverrides() == null)
            return false;
        if (other.getContainerOverrides() != null && other.getContainerOverrides().equals(this.getContainerOverrides()) == false)
            return false;
        if (other.getCpu() == null ^ this.getCpu() == null)
            return false;
        if (other.getCpu() != null && other.getCpu().equals(this.getCpu()) == false)
            return false;
        if (other.getEphemeralStorage() == null ^ this.getEphemeralStorage() == null)
            return false;
        if (other.getEphemeralStorage() != null && other.getEphemeralStorage().equals(this.getEphemeralStorage()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getInferenceAcceleratorOverrides() == null ^ this.getInferenceAcceleratorOverrides() == null)
            return false;
        if (other.getInferenceAcceleratorOverrides() != null
                && other.getInferenceAcceleratorOverrides().equals(this.getInferenceAcceleratorOverrides()) == false)
            return false;
        if (other.getMemory() == null ^ this.getMemory() == null)
            return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false)
            return false;
        if (other.getTaskRoleArn() == null ^ this.getTaskRoleArn() == null)
            return false;
        if (other.getTaskRoleArn() != null && other.getTaskRoleArn().equals(this.getTaskRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerOverrides() == null) ? 0 : getContainerOverrides().hashCode());
        hashCode = prime * hashCode + ((getCpu() == null) ? 0 : getCpu().hashCode());
        hashCode = prime * hashCode + ((getEphemeralStorage() == null) ? 0 : getEphemeralStorage().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getInferenceAcceleratorOverrides() == null) ? 0 : getInferenceAcceleratorOverrides().hashCode());
        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        hashCode = prime * hashCode + ((getTaskRoleArn() == null) ? 0 : getTaskRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public EcsTaskOverride clone() {
        try {
            return (EcsTaskOverride) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pipes.model.transform.EcsTaskOverrideMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
