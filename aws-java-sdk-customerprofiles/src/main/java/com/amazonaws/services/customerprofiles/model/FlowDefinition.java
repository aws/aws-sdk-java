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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/FlowDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlowDefinition implements Serializable, Cloneable, StructuredPojo {

    private String description;

    private String flowName;

    private String kmsArn;

    private SourceFlowConfig sourceFlowConfig;

    private java.util.List<Task> tasks;

    private TriggerConfig triggerConfig;

    /**
     * @param description
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowDefinition withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * @param flowName
     */

    public void setFlowName(String flowName) {
        this.flowName = flowName;
    }

    /**
     * @return
     */

    public String getFlowName() {
        return this.flowName;
    }

    /**
     * @param flowName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowDefinition withFlowName(String flowName) {
        setFlowName(flowName);
        return this;
    }

    /**
     * @param kmsArn
     */

    public void setKmsArn(String kmsArn) {
        this.kmsArn = kmsArn;
    }

    /**
     * @return
     */

    public String getKmsArn() {
        return this.kmsArn;
    }

    /**
     * @param kmsArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowDefinition withKmsArn(String kmsArn) {
        setKmsArn(kmsArn);
        return this;
    }

    /**
     * @param sourceFlowConfig
     */

    public void setSourceFlowConfig(SourceFlowConfig sourceFlowConfig) {
        this.sourceFlowConfig = sourceFlowConfig;
    }

    /**
     * @return
     */

    public SourceFlowConfig getSourceFlowConfig() {
        return this.sourceFlowConfig;
    }

    /**
     * @param sourceFlowConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowDefinition withSourceFlowConfig(SourceFlowConfig sourceFlowConfig) {
        setSourceFlowConfig(sourceFlowConfig);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Task> getTasks() {
        return tasks;
    }

    /**
     * @param tasks
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTasks(java.util.Collection)} or {@link #withTasks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tasks
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
     * @param tasks
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowDefinition withTasks(java.util.Collection<Task> tasks) {
        setTasks(tasks);
        return this;
    }

    /**
     * @param triggerConfig
     */

    public void setTriggerConfig(TriggerConfig triggerConfig) {
        this.triggerConfig = triggerConfig;
    }

    /**
     * @return
     */

    public TriggerConfig getTriggerConfig() {
        return this.triggerConfig;
    }

    /**
     * @param triggerConfig
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
