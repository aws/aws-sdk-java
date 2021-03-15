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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/UpdateExperimentTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateExperimentTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the experiment template.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A description for the template.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The stop conditions for the experiment.
     * </p>
     */
    private java.util.List<UpdateExperimentTemplateStopConditionInput> stopConditions;
    /**
     * <p>
     * The targets for the experiment.
     * </p>
     */
    private java.util.Map<String, UpdateExperimentTemplateTargetInput> targets;
    /**
     * <p>
     * The actions for the experiment.
     * </p>
     */
    private java.util.Map<String, UpdateExperimentTemplateActionInputItem> actions;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that grants the AWS FIS service permission to perform service
     * actions on your behalf.
     * </p>
     */
    private String roleArn;

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

    public UpdateExperimentTemplateRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A description for the template.
     * </p>
     * 
     * @param description
     *        A description for the template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the template.
     * </p>
     * 
     * @return A description for the template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the template.
     * </p>
     * 
     * @param description
     *        A description for the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExperimentTemplateRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The stop conditions for the experiment.
     * </p>
     * 
     * @return The stop conditions for the experiment.
     */

    public java.util.List<UpdateExperimentTemplateStopConditionInput> getStopConditions() {
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

    public void setStopConditions(java.util.Collection<UpdateExperimentTemplateStopConditionInput> stopConditions) {
        if (stopConditions == null) {
            this.stopConditions = null;
            return;
        }

        this.stopConditions = new java.util.ArrayList<UpdateExperimentTemplateStopConditionInput>(stopConditions);
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

    public UpdateExperimentTemplateRequest withStopConditions(UpdateExperimentTemplateStopConditionInput... stopConditions) {
        if (this.stopConditions == null) {
            setStopConditions(new java.util.ArrayList<UpdateExperimentTemplateStopConditionInput>(stopConditions.length));
        }
        for (UpdateExperimentTemplateStopConditionInput ele : stopConditions) {
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

    public UpdateExperimentTemplateRequest withStopConditions(java.util.Collection<UpdateExperimentTemplateStopConditionInput> stopConditions) {
        setStopConditions(stopConditions);
        return this;
    }

    /**
     * <p>
     * The targets for the experiment.
     * </p>
     * 
     * @return The targets for the experiment.
     */

    public java.util.Map<String, UpdateExperimentTemplateTargetInput> getTargets() {
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

    public void setTargets(java.util.Map<String, UpdateExperimentTemplateTargetInput> targets) {
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

    public UpdateExperimentTemplateRequest withTargets(java.util.Map<String, UpdateExperimentTemplateTargetInput> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * Add a single Targets entry
     *
     * @see UpdateExperimentTemplateRequest#withTargets
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExperimentTemplateRequest addTargetsEntry(String key, UpdateExperimentTemplateTargetInput value) {
        if (null == this.targets) {
            this.targets = new java.util.HashMap<String, UpdateExperimentTemplateTargetInput>();
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

    public UpdateExperimentTemplateRequest clearTargetsEntries() {
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

    public java.util.Map<String, UpdateExperimentTemplateActionInputItem> getActions() {
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

    public void setActions(java.util.Map<String, UpdateExperimentTemplateActionInputItem> actions) {
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

    public UpdateExperimentTemplateRequest withActions(java.util.Map<String, UpdateExperimentTemplateActionInputItem> actions) {
        setActions(actions);
        return this;
    }

    /**
     * Add a single Actions entry
     *
     * @see UpdateExperimentTemplateRequest#withActions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExperimentTemplateRequest addActionsEntry(String key, UpdateExperimentTemplateActionInputItem value) {
        if (null == this.actions) {
            this.actions = new java.util.HashMap<String, UpdateExperimentTemplateActionInputItem>();
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

    public UpdateExperimentTemplateRequest clearActionsEntries() {
        this.actions = null;
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

    public UpdateExperimentTemplateRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getStopConditions() != null)
            sb.append("StopConditions: ").append(getStopConditions()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateExperimentTemplateRequest == false)
            return false;
        UpdateExperimentTemplateRequest other = (UpdateExperimentTemplateRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStopConditions() == null ^ this.getStopConditions() == null)
            return false;
        if (other.getStopConditions() != null && other.getStopConditions().equals(this.getStopConditions()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStopConditions() == null) ? 0 : getStopConditions().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateExperimentTemplateRequest clone() {
        return (UpdateExperimentTemplateRequest) super.clone();
    }

}
