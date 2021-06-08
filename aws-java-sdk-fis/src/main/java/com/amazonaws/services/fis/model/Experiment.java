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
 * Describes an experiment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/Experiment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Experiment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the experiment.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ID of the experiment template.
     * </p>
     */
    private String experimentTemplateId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that grants the AWS FIS service permission to perform service
     * actions on your behalf.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The state of the experiment.
     * </p>
     */
    private ExperimentState state;
    /**
     * <p>
     * The targets for the experiment.
     * </p>
     */
    private java.util.Map<String, ExperimentTarget> targets;
    /**
     * <p>
     * The actions for the experiment.
     * </p>
     */
    private java.util.Map<String, ExperimentAction> actions;
    /**
     * <p>
     * The stop conditions for the experiment.
     * </p>
     */
    private java.util.List<ExperimentStopCondition> stopConditions;
    /**
     * <p>
     * The time the experiment was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time that the experiment was started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time that the experiment ended.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The tags for the experiment.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ID of the experiment.
     * </p>
     * 
     * @param id
     *        The ID of the experiment.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the experiment.
     * </p>
     * 
     * @return The ID of the experiment.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the experiment.
     * </p>
     * 
     * @param id
     *        The ID of the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ID of the experiment template.
     * </p>
     * 
     * @param experimentTemplateId
     *        The ID of the experiment template.
     */

    public void setExperimentTemplateId(String experimentTemplateId) {
        this.experimentTemplateId = experimentTemplateId;
    }

    /**
     * <p>
     * The ID of the experiment template.
     * </p>
     * 
     * @return The ID of the experiment template.
     */

    public String getExperimentTemplateId() {
        return this.experimentTemplateId;
    }

    /**
     * <p>
     * The ID of the experiment template.
     * </p>
     * 
     * @param experimentTemplateId
     *        The ID of the experiment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withExperimentTemplateId(String experimentTemplateId) {
        setExperimentTemplateId(experimentTemplateId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that grants the AWS FIS service permission to perform service
     * actions on your behalf.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that grants the AWS FIS service permission to perform
     *        service actions on your behalf.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that grants the AWS FIS service permission to perform service
     * actions on your behalf.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role that grants the AWS FIS service permission to perform
     *         service actions on your behalf.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that grants the AWS FIS service permission to perform service
     * actions on your behalf.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that grants the AWS FIS service permission to perform
     *        service actions on your behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The state of the experiment.
     * </p>
     * 
     * @param state
     *        The state of the experiment.
     */

    public void setState(ExperimentState state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the experiment.
     * </p>
     * 
     * @return The state of the experiment.
     */

    public ExperimentState getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the experiment.
     * </p>
     * 
     * @param state
     *        The state of the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withState(ExperimentState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The targets for the experiment.
     * </p>
     * 
     * @return The targets for the experiment.
     */

    public java.util.Map<String, ExperimentTarget> getTargets() {
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

    public void setTargets(java.util.Map<String, ExperimentTarget> targets) {
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

    public Experiment withTargets(java.util.Map<String, ExperimentTarget> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * Add a single Targets entry
     *
     * @see Experiment#withTargets
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Experiment addTargetsEntry(String key, ExperimentTarget value) {
        if (null == this.targets) {
            this.targets = new java.util.HashMap<String, ExperimentTarget>();
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

    public Experiment clearTargetsEntries() {
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

    public java.util.Map<String, ExperimentAction> getActions() {
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

    public void setActions(java.util.Map<String, ExperimentAction> actions) {
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

    public Experiment withActions(java.util.Map<String, ExperimentAction> actions) {
        setActions(actions);
        return this;
    }

    /**
     * Add a single Actions entry
     *
     * @see Experiment#withActions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Experiment addActionsEntry(String key, ExperimentAction value) {
        if (null == this.actions) {
            this.actions = new java.util.HashMap<String, ExperimentAction>();
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

    public Experiment clearActionsEntries() {
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

    public java.util.List<ExperimentStopCondition> getStopConditions() {
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

    public void setStopConditions(java.util.Collection<ExperimentStopCondition> stopConditions) {
        if (stopConditions == null) {
            this.stopConditions = null;
            return;
        }

        this.stopConditions = new java.util.ArrayList<ExperimentStopCondition>(stopConditions);
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

    public Experiment withStopConditions(ExperimentStopCondition... stopConditions) {
        if (this.stopConditions == null) {
            setStopConditions(new java.util.ArrayList<ExperimentStopCondition>(stopConditions.length));
        }
        for (ExperimentStopCondition ele : stopConditions) {
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

    public Experiment withStopConditions(java.util.Collection<ExperimentStopCondition> stopConditions) {
        setStopConditions(stopConditions);
        return this;
    }

    /**
     * <p>
     * The time the experiment was created.
     * </p>
     * 
     * @param creationTime
     *        The time the experiment was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the experiment was created.
     * </p>
     * 
     * @return The time the experiment was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the experiment was created.
     * </p>
     * 
     * @param creationTime
     *        The time the experiment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time that the experiment was started.
     * </p>
     * 
     * @param startTime
     *        The time that the experiment was started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time that the experiment was started.
     * </p>
     * 
     * @return The time that the experiment was started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time that the experiment was started.
     * </p>
     * 
     * @param startTime
     *        The time that the experiment was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time that the experiment ended.
     * </p>
     * 
     * @param endTime
     *        The time that the experiment ended.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time that the experiment ended.
     * </p>
     * 
     * @return The time that the experiment ended.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time that the experiment ended.
     * </p>
     * 
     * @param endTime
     *        The time that the experiment ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The tags for the experiment.
     * </p>
     * 
     * @return The tags for the experiment.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the experiment.
     * </p>
     * 
     * @param tags
     *        The tags for the experiment.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags for the experiment.
     * </p>
     * 
     * @param tags
     *        The tags for the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Experiment#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Experiment addTagsEntry(String key, String value) {
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

    public Experiment clearTagsEntries() {
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
        if (getExperimentTemplateId() != null)
            sb.append("ExperimentTemplateId: ").append(getExperimentTemplateId()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getStopConditions() != null)
            sb.append("StopConditions: ").append(getStopConditions()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
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

        if (obj instanceof Experiment == false)
            return false;
        Experiment other = (Experiment) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getExperimentTemplateId() == null ^ this.getExperimentTemplateId() == null)
            return false;
        if (other.getExperimentTemplateId() != null && other.getExperimentTemplateId().equals(this.getExperimentTemplateId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
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
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
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
        hashCode = prime * hashCode + ((getExperimentTemplateId() == null) ? 0 : getExperimentTemplateId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getStopConditions() == null) ? 0 : getStopConditions().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Experiment clone() {
        try {
            return (Experiment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fis.model.transform.ExperimentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
