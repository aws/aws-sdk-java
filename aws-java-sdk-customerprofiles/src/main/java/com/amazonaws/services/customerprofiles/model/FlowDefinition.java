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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configurations that control how Customer Profiles retrieves data from the source, Amazon AppFlow. Customer
 * Profiles uses this information to create an AppFlow flow on behalf of customers.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/FlowDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlowDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description of the flow you want to create.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The specified name of the flow. Use underscores (_) or hyphens (-) only. Spaces are not allowed.
     * </p>
     */
    private String flowName;
    /**
     * <p>
     * The Amazon Resource Name of the AWS Key Management Service (KMS) key you provide for encryption.
     * </p>
     */
    private String kmsArn;
    /**
     * <p>
     * The configuration that controls how Customer Profiles retrieves data from the source.
     * </p>
     */
    private SourceFlowConfig sourceFlowConfig;
    /**
     * <p>
     * A list of tasks that Customer Profiles performs while transferring the data in the flow run.
     * </p>
     */
    private java.util.List<Task> tasks;
    /**
     * <p>
     * The trigger settings that determine how and when the flow runs.
     * </p>
     */
    private TriggerConfig triggerConfig;

    /**
     * <p>
     * A description of the flow you want to create.
     * </p>
     * 
     * @param description
     *        A description of the flow you want to create.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the flow you want to create.
     * </p>
     * 
     * @return A description of the flow you want to create.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the flow you want to create.
     * </p>
     * 
     * @param description
     *        A description of the flow you want to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowDefinition withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The specified name of the flow. Use underscores (_) or hyphens (-) only. Spaces are not allowed.
     * </p>
     * 
     * @param flowName
     *        The specified name of the flow. Use underscores (_) or hyphens (-) only. Spaces are not allowed.
     */

    public void setFlowName(String flowName) {
        this.flowName = flowName;
    }

    /**
     * <p>
     * The specified name of the flow. Use underscores (_) or hyphens (-) only. Spaces are not allowed.
     * </p>
     * 
     * @return The specified name of the flow. Use underscores (_) or hyphens (-) only. Spaces are not allowed.
     */

    public String getFlowName() {
        return this.flowName;
    }

    /**
     * <p>
     * The specified name of the flow. Use underscores (_) or hyphens (-) only. Spaces are not allowed.
     * </p>
     * 
     * @param flowName
     *        The specified name of the flow. Use underscores (_) or hyphens (-) only. Spaces are not allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowDefinition withFlowName(String flowName) {
        setFlowName(flowName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name of the AWS Key Management Service (KMS) key you provide for encryption.
     * </p>
     * 
     * @param kmsArn
     *        The Amazon Resource Name of the AWS Key Management Service (KMS) key you provide for encryption.
     */

    public void setKmsArn(String kmsArn) {
        this.kmsArn = kmsArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the AWS Key Management Service (KMS) key you provide for encryption.
     * </p>
     * 
     * @return The Amazon Resource Name of the AWS Key Management Service (KMS) key you provide for encryption.
     */

    public String getKmsArn() {
        return this.kmsArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the AWS Key Management Service (KMS) key you provide for encryption.
     * </p>
     * 
     * @param kmsArn
     *        The Amazon Resource Name of the AWS Key Management Service (KMS) key you provide for encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowDefinition withKmsArn(String kmsArn) {
        setKmsArn(kmsArn);
        return this;
    }

    /**
     * <p>
     * The configuration that controls how Customer Profiles retrieves data from the source.
     * </p>
     * 
     * @param sourceFlowConfig
     *        The configuration that controls how Customer Profiles retrieves data from the source.
     */

    public void setSourceFlowConfig(SourceFlowConfig sourceFlowConfig) {
        this.sourceFlowConfig = sourceFlowConfig;
    }

    /**
     * <p>
     * The configuration that controls how Customer Profiles retrieves data from the source.
     * </p>
     * 
     * @return The configuration that controls how Customer Profiles retrieves data from the source.
     */

    public SourceFlowConfig getSourceFlowConfig() {
        return this.sourceFlowConfig;
    }

    /**
     * <p>
     * The configuration that controls how Customer Profiles retrieves data from the source.
     * </p>
     * 
     * @param sourceFlowConfig
     *        The configuration that controls how Customer Profiles retrieves data from the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowDefinition withSourceFlowConfig(SourceFlowConfig sourceFlowConfig) {
        setSourceFlowConfig(sourceFlowConfig);
        return this;
    }

    /**
     * <p>
     * A list of tasks that Customer Profiles performs while transferring the data in the flow run.
     * </p>
     * 
     * @return A list of tasks that Customer Profiles performs while transferring the data in the flow run.
     */

    public java.util.List<Task> getTasks() {
        return tasks;
    }

    /**
     * <p>
     * A list of tasks that Customer Profiles performs while transferring the data in the flow run.
     * </p>
     * 
     * @param tasks
     *        A list of tasks that Customer Profiles performs while transferring the data in the flow run.
     */

    public void setTasks(java.util.Collection<Task> tasks) {
        if (tasks == null) {
            this.tasks = null;
            return;
        }

        this.tasks = new java.util.ArrayList<Task>(tasks);
    }

    /**
     * <p>
     * A list of tasks that Customer Profiles performs while transferring the data in the flow run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTasks(java.util.Collection)} or {@link #withTasks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tasks
     *        A list of tasks that Customer Profiles performs while transferring the data in the flow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowDefinition withTasks(Task... tasks) {
        if (this.tasks == null) {
            setTasks(new java.util.ArrayList<Task>(tasks.length));
        }
        for (Task ele : tasks) {
            this.tasks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tasks that Customer Profiles performs while transferring the data in the flow run.
     * </p>
     * 
     * @param tasks
     *        A list of tasks that Customer Profiles performs while transferring the data in the flow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowDefinition withTasks(java.util.Collection<Task> tasks) {
        setTasks(tasks);
        return this;
    }

    /**
     * <p>
     * The trigger settings that determine how and when the flow runs.
     * </p>
     * 
     * @param triggerConfig
     *        The trigger settings that determine how and when the flow runs.
     */

    public void setTriggerConfig(TriggerConfig triggerConfig) {
        this.triggerConfig = triggerConfig;
    }

    /**
     * <p>
     * The trigger settings that determine how and when the flow runs.
     * </p>
     * 
     * @return The trigger settings that determine how and when the flow runs.
     */

    public TriggerConfig getTriggerConfig() {
        return this.triggerConfig;
    }

    /**
     * <p>
     * The trigger settings that determine how and when the flow runs.
     * </p>
     * 
     * @param triggerConfig
     *        The trigger settings that determine how and when the flow runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowDefinition withTriggerConfig(TriggerConfig triggerConfig) {
        setTriggerConfig(triggerConfig);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFlowName() != null)
            sb.append("FlowName: ").append(getFlowName()).append(",");
        if (getKmsArn() != null)
            sb.append("KmsArn: ").append(getKmsArn()).append(",");
        if (getSourceFlowConfig() != null)
            sb.append("SourceFlowConfig: ").append(getSourceFlowConfig()).append(",");
        if (getTasks() != null)
            sb.append("Tasks: ").append(getTasks()).append(",");
        if (getTriggerConfig() != null)
            sb.append("TriggerConfig: ").append(getTriggerConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FlowDefinition == false)
            return false;
        FlowDefinition other = (FlowDefinition) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFlowName() == null ^ this.getFlowName() == null)
            return false;
        if (other.getFlowName() != null && other.getFlowName().equals(this.getFlowName()) == false)
            return false;
        if (other.getKmsArn() == null ^ this.getKmsArn() == null)
            return false;
        if (other.getKmsArn() != null && other.getKmsArn().equals(this.getKmsArn()) == false)
            return false;
        if (other.getSourceFlowConfig() == null ^ this.getSourceFlowConfig() == null)
            return false;
        if (other.getSourceFlowConfig() != null && other.getSourceFlowConfig().equals(this.getSourceFlowConfig()) == false)
            return false;
        if (other.getTasks() == null ^ this.getTasks() == null)
            return false;
        if (other.getTasks() != null && other.getTasks().equals(this.getTasks()) == false)
            return false;
        if (other.getTriggerConfig() == null ^ this.getTriggerConfig() == null)
            return false;
        if (other.getTriggerConfig() != null && other.getTriggerConfig().equals(this.getTriggerConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFlowName() == null) ? 0 : getFlowName().hashCode());
        hashCode = prime * hashCode + ((getKmsArn() == null) ? 0 : getKmsArn().hashCode());
        hashCode = prime * hashCode + ((getSourceFlowConfig() == null) ? 0 : getSourceFlowConfig().hashCode());
        hashCode = prime * hashCode + ((getTasks() == null) ? 0 : getTasks().hashCode());
        hashCode = prime * hashCode + ((getTriggerConfig() == null) ? 0 : getTriggerConfig().hashCode());
        return hashCode;
    }

    @Override
    public FlowDefinition clone() {
        try {
            return (FlowDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.FlowDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
