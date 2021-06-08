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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/CreateFlow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFlowRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     * </p>
     */
    private String flowName;
    /**
     * <p>
     * A description of the flow you want to create.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is
     * required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon
     * AppFlow uses the Amazon AppFlow-managed KMS key.
     * </p>
     */
    private String kmsArn;
    /**
     * <p>
     * The trigger settings that determine how and when the flow runs.
     * </p>
     */
    private TriggerConfig triggerConfig;
    /**
     * <p>
     * The configuration that controls how Amazon AppFlow retrieves data from the source connector.
     * </p>
     */
    private SourceFlowConfig sourceFlowConfig;
    /**
     * <p>
     * The configuration that controls how Amazon AppFlow places data in the destination connector.
     * </p>
     */
    private java.util.List<DestinationFlowConfig> destinationFlowConfigList;
    /**
     * <p>
     * A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
     * </p>
     */
    private java.util.List<Task> tasks;
    /**
     * <p>
     * The tags used to organize, track, or control access for your flow.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     * </p>
     * 
     * @param flowName
     *        The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     */

    public void setFlowName(String flowName) {
        this.flowName = flowName;
    }

    /**
     * <p>
     * The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     * </p>
     * 
     * @return The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     */

    public String getFlowName() {
        return this.flowName;
    }

    /**
     * <p>
     * The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     * </p>
     * 
     * @param flowName
     *        The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withFlowName(String flowName) {
        setFlowName(flowName);
        return this;
    }

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

    public CreateFlowRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is
     * required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon
     * AppFlow uses the Amazon AppFlow-managed KMS key.
     * </p>
     * 
     * @param kmsArn
     *        The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is
     *        required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here,
     *        Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     */

    public void setKmsArn(String kmsArn) {
        this.kmsArn = kmsArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is
     * required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon
     * AppFlow uses the Amazon AppFlow-managed KMS key.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This
     *         is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything
     *         here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     */

    public String getKmsArn() {
        return this.kmsArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is
     * required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon
     * AppFlow uses the Amazon AppFlow-managed KMS key.
     * </p>
     * 
     * @param kmsArn
     *        The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is
     *        required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here,
     *        Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withKmsArn(String kmsArn) {
        setKmsArn(kmsArn);
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

    public CreateFlowRequest withTriggerConfig(TriggerConfig triggerConfig) {
        setTriggerConfig(triggerConfig);
        return this;
    }

    /**
     * <p>
     * The configuration that controls how Amazon AppFlow retrieves data from the source connector.
     * </p>
     * 
     * @param sourceFlowConfig
     *        The configuration that controls how Amazon AppFlow retrieves data from the source connector.
     */

    public void setSourceFlowConfig(SourceFlowConfig sourceFlowConfig) {
        this.sourceFlowConfig = sourceFlowConfig;
    }

    /**
     * <p>
     * The configuration that controls how Amazon AppFlow retrieves data from the source connector.
     * </p>
     * 
     * @return The configuration that controls how Amazon AppFlow retrieves data from the source connector.
     */

    public SourceFlowConfig getSourceFlowConfig() {
        return this.sourceFlowConfig;
    }

    /**
     * <p>
     * The configuration that controls how Amazon AppFlow retrieves data from the source connector.
     * </p>
     * 
     * @param sourceFlowConfig
     *        The configuration that controls how Amazon AppFlow retrieves data from the source connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withSourceFlowConfig(SourceFlowConfig sourceFlowConfig) {
        setSourceFlowConfig(sourceFlowConfig);
        return this;
    }

    /**
     * <p>
     * The configuration that controls how Amazon AppFlow places data in the destination connector.
     * </p>
     * 
     * @return The configuration that controls how Amazon AppFlow places data in the destination connector.
     */

    public java.util.List<DestinationFlowConfig> getDestinationFlowConfigList() {
        return destinationFlowConfigList;
    }

    /**
     * <p>
     * The configuration that controls how Amazon AppFlow places data in the destination connector.
     * </p>
     * 
     * @param destinationFlowConfigList
     *        The configuration that controls how Amazon AppFlow places data in the destination connector.
     */

    public void setDestinationFlowConfigList(java.util.Collection<DestinationFlowConfig> destinationFlowConfigList) {
        if (destinationFlowConfigList == null) {
            this.destinationFlowConfigList = null;
            return;
        }

        this.destinationFlowConfigList = new java.util.ArrayList<DestinationFlowConfig>(destinationFlowConfigList);
    }

    /**
     * <p>
     * The configuration that controls how Amazon AppFlow places data in the destination connector.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinationFlowConfigList(java.util.Collection)} or
     * {@link #withDestinationFlowConfigList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param destinationFlowConfigList
     *        The configuration that controls how Amazon AppFlow places data in the destination connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withDestinationFlowConfigList(DestinationFlowConfig... destinationFlowConfigList) {
        if (this.destinationFlowConfigList == null) {
            setDestinationFlowConfigList(new java.util.ArrayList<DestinationFlowConfig>(destinationFlowConfigList.length));
        }
        for (DestinationFlowConfig ele : destinationFlowConfigList) {
            this.destinationFlowConfigList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configuration that controls how Amazon AppFlow places data in the destination connector.
     * </p>
     * 
     * @param destinationFlowConfigList
     *        The configuration that controls how Amazon AppFlow places data in the destination connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withDestinationFlowConfigList(java.util.Collection<DestinationFlowConfig> destinationFlowConfigList) {
        setDestinationFlowConfigList(destinationFlowConfigList);
        return this;
    }

    /**
     * <p>
     * A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
     * </p>
     * 
     * @return A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
     */

    public java.util.List<Task> getTasks() {
        return tasks;
    }

    /**
     * <p>
     * A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
     * </p>
     * 
     * @param tasks
     *        A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
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
     * A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTasks(java.util.Collection)} or {@link #withTasks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tasks
     *        A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withTasks(Task... tasks) {
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
     * A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
     * </p>
     * 
     * @param tasks
     *        A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withTasks(java.util.Collection<Task> tasks) {
        setTasks(tasks);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for your flow.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for your flow.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for your flow.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for your flow.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for your flow.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for your flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateFlowRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest clearTagsEntries() {
        this.tags = null;
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
        if (getFlowName() != null)
            sb.append("FlowName: ").append(getFlowName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getKmsArn() != null)
            sb.append("KmsArn: ").append(getKmsArn()).append(",");
        if (getTriggerConfig() != null)
            sb.append("TriggerConfig: ").append(getTriggerConfig()).append(",");
        if (getSourceFlowConfig() != null)
            sb.append("SourceFlowConfig: ").append(getSourceFlowConfig()).append(",");
        if (getDestinationFlowConfigList() != null)
            sb.append("DestinationFlowConfigList: ").append(getDestinationFlowConfigList()).append(",");
        if (getTasks() != null)
            sb.append("Tasks: ").append(getTasks()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFlowRequest == false)
            return false;
        CreateFlowRequest other = (CreateFlowRequest) obj;
        if (other.getFlowName() == null ^ this.getFlowName() == null)
            return false;
        if (other.getFlowName() != null && other.getFlowName().equals(this.getFlowName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKmsArn() == null ^ this.getKmsArn() == null)
            return false;
        if (other.getKmsArn() != null && other.getKmsArn().equals(this.getKmsArn()) == false)
            return false;
        if (other.getTriggerConfig() == null ^ this.getTriggerConfig() == null)
            return false;
        if (other.getTriggerConfig() != null && other.getTriggerConfig().equals(this.getTriggerConfig()) == false)
            return false;
        if (other.getSourceFlowConfig() == null ^ this.getSourceFlowConfig() == null)
            return false;
        if (other.getSourceFlowConfig() != null && other.getSourceFlowConfig().equals(this.getSourceFlowConfig()) == false)
            return false;
        if (other.getDestinationFlowConfigList() == null ^ this.getDestinationFlowConfigList() == null)
            return false;
        if (other.getDestinationFlowConfigList() != null && other.getDestinationFlowConfigList().equals(this.getDestinationFlowConfigList()) == false)
            return false;
        if (other.getTasks() == null ^ this.getTasks() == null)
            return false;
        if (other.getTasks() != null && other.getTasks().equals(this.getTasks()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowName() == null) ? 0 : getFlowName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKmsArn() == null) ? 0 : getKmsArn().hashCode());
        hashCode = prime * hashCode + ((getTriggerConfig() == null) ? 0 : getTriggerConfig().hashCode());
        hashCode = prime * hashCode + ((getSourceFlowConfig() == null) ? 0 : getSourceFlowConfig().hashCode());
        hashCode = prime * hashCode + ((getDestinationFlowConfigList() == null) ? 0 : getDestinationFlowConfigList().hashCode());
        hashCode = prime * hashCode + ((getTasks() == null) ? 0 : getTasks().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateFlowRequest clone() {
        return (CreateFlowRequest) super.clone();
    }

}
