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
package com.amazonaws.services.fis.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an experiment template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ExperimentTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExperimentTemplate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the experiment template.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The description for the experiment template.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The targets for the experiment.
     * </p>
     */
    private java.util.Map<String, ExperimentTemplateTarget> targets;
    /**
     * <p>
     * The actions for the experiment.
     * </p>
     */
    private java.util.Map<String, ExperimentTemplateAction> actions;
    /**
     * <p>
     * The stop conditions for the experiment.
     * </p>
     */
    private java.util.List<ExperimentTemplateStopCondition> stopConditions;
    /**
     * <p>
     * The time the experiment template was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time the experiment template was last updated.
     * </p>
     */
    private java.util.Date lastUpdateTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The tags for the experiment template.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ID of the experiment template.
     * </p>
     * 
     * @param id
     *        The ID of the experiment template.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the experiment template.
     * </p>
     * 
     * @return The ID of the experiment template.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the experiment template.
     * </p>
     * 
     * @param id
     *        The ID of the experiment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplate withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The description for the experiment template.
     * </p>
     * 
     * @param description
     *        The description for the experiment template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the experiment template.
     * </p>
     * 
     * @return The description for the experiment template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the experiment template.
     * </p>
     * 
     * @param description
     *        The description for the experiment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplate withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The targets for the experiment.
     * </p>
     * 
     * @return The targets for the experiment.
     */

    public java.util.Map<String, ExperimentTemplateTarget> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The targets for the experiment.
     * </p>
     * 
     * @param targets
     *        The targets for the experiment.
     */

    public void setTargets(java.util.Map<String, ExperimentTemplateTarget> targets) {
        this.targets = targets;
    }

    /**
     * <p>
     * The targets for the experiment.
     * </p>
     * 
     * @param targets
     *        The targets for the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplate withTargets(java.util.Map<String, ExperimentTemplateTarget> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * Add a single Targets entry
     *
     * @see ExperimentTemplate#withTargets
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplate addTargetsEntry(String key, ExperimentTemplateTarget value) {
        if (null == this.targets) {
            this.targets = new java.util.HashMap<String, ExperimentTemplateTarget>();
        }
        if (this.targets.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.targets.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Targets.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplate clearTargetsEntries() {
        this.targets = null;
        return this;
    }

    /**
     * <p>
     * The actions for the experiment.
     * </p>
     * 
     * @return The actions for the experiment.
     */

    public java.util.Map<String, ExperimentTemplateAction> getActions() {
        return actions;
    }

    /**
     * <p>
     * The actions for the experiment.
     * </p>
     * 
     * @param actions
     *        The actions for the experiment.
     */

    public void setActions(java.util.Map<String, ExperimentTemplateAction> actions) {
        this.actions = actions;
    }

    /**
     * <p>
     * The actions for the experiment.
     * </p>
     * 
     * @param actions
     *        The actions for the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplate withActions(java.util.Map<String, ExperimentTemplateAction> actions) {
        setActions(actions);
        return this;
    }

    /**
     * Add a single Actions entry
     *
     * @see ExperimentTemplate#withActions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplate addActionsEntry(String key, ExperimentTemplateAction value) {
        if (null == this.actions) {
            this.actions = new java.util.HashMap<String, ExperimentTemplateAction>();
        }
        if (this.actions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.actions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Actions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplate clearActionsEntries() {
        this.actions = null;
        return this;
    }

    /**
     * <p>
     * The stop conditions for the experiment.
     * </p>
     * 
     * @return The stop conditions for the experiment.
     */

    public java.util.List<ExperimentTemplateStopCondition> getStopConditions() {
        return stopConditions;
    }

    /**
     * <p>
     * The stop conditions for the experiment.
     * </p>
     * 
     * @param stopConditions
     *        The stop conditions for the experiment.
     */

    public void setStopConditions(java.util.Collection<ExperimentTemplateStopCondition> stopConditions) {
        if (stopConditions == null) {
            this.stopConditions = null;
            return;
        }

        this.stopConditions = new java.util.ArrayList<ExperimentTemplateStopCondition>(stopConditions);
    }

    /**
     * <p>
     * The stop conditions for the experiment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStopConditions(java.util.Collection)} or {@link #withStopConditions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param stopConditions
     *        The stop conditions for the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplate withStopConditions(ExperimentTemplateStopCondition... stopConditions) {
        if (this.stopConditions == null) {
            setStopConditions(new java.util.ArrayList<ExperimentTemplateStopCondition>(stopConditions.length));
        }
        for (ExperimentTemplateStopCondition ele : stopConditions) {
            this.stopConditions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The stop conditions for the experiment.
     * </p>
     * 
     * @param stopConditions
     *        The stop conditions for the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplate withStopConditions(java.util.Collection<ExperimentTemplateStopCondition> stopConditions) {
        setStopConditions(stopConditions);
        return this;
    }

    /**
     * <p>
     * The time the experiment template was created.
     * </p>
     * 
     * @param creationTime
     *        The time the experiment template was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the experiment template was created.
     * </p>
     * 
     * @return The time the experiment template was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the experiment template was created.
     * </p>
     * 
     * @param creationTime
     *        The time the experiment template was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplate withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time the experiment template was last updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The time the experiment template was last updated.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The time the experiment template was last updated.
     * </p>
     * 
     * @return The time the experiment template was last updated.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The time the experiment template was last updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The time the experiment template was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplate withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplate withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The tags for the experiment template.
     * </p>
     * 
     * @return The tags for the experiment template.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the experiment template.
     * </p>
     * 
     * @param tags
     *        The tags for the experiment template.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags for the experiment template.
     * </p>
     * 
     * @param tags
     *        The tags for the experiment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplate withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ExperimentTemplate#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplate addTagsEntry(String key, String value) {
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

    public ExperimentTemplate clearTagsEntries() {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getStopConditions() != null)
            sb.append("StopConditions: ").append(getStopConditions()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
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

        if (obj instanceof ExperimentTemplate == false)
            return false;
        ExperimentTemplate other = (ExperimentTemplate) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getStopConditions() == null ^ this.getStopConditions() == null)
            return false;
        if (other.getStopConditions() != null && other.getStopConditions().equals(this.getStopConditions()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getStopConditions() == null) ? 0 : getStopConditions().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ExperimentTemplate clone() {
        try {
            return (ExperimentTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fis.model.transform.ExperimentTemplateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
