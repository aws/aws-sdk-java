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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/CreateExperimentTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateExperimentTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A description for the experiment template. Can contain up to 64 letters (A-Z and a-z).
     * </p>
     */
    private String description;
    /**
     * <p>
     * The stop conditions.
     * </p>
     */
    private java.util.List<CreateExperimentTemplateStopConditionInput> stopConditions;
    /**
     * <p>
     * The targets for the experiment.
     * </p>
     */
    private java.util.Map<String, CreateExperimentTemplateTargetInput> targets;
    /**
     * <p>
     * The actions for the experiment.
     * </p>
     */
    private java.util.Map<String, CreateExperimentTemplateActionInput> actions;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that grants the AWS FIS service permission to perform service
     * actions on your behalf.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The tags to apply to the experiment template.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentTemplateRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A description for the experiment template. Can contain up to 64 letters (A-Z and a-z).
     * </p>
     * 
     * @param description
     *        A description for the experiment template. Can contain up to 64 letters (A-Z and a-z).
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the experiment template. Can contain up to 64 letters (A-Z and a-z).
     * </p>
     * 
     * @return A description for the experiment template. Can contain up to 64 letters (A-Z and a-z).
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the experiment template. Can contain up to 64 letters (A-Z and a-z).
     * </p>
     * 
     * @param description
     *        A description for the experiment template. Can contain up to 64 letters (A-Z and a-z).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentTemplateRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The stop conditions.
     * </p>
     * 
     * @return The stop conditions.
     */

    public java.util.List<CreateExperimentTemplateStopConditionInput> getStopConditions() {
        return stopConditions;
    }

    /**
     * <p>
     * The stop conditions.
     * </p>
     * 
     * @param stopConditions
     *        The stop conditions.
     */

    public void setStopConditions(java.util.Collection<CreateExperimentTemplateStopConditionInput> stopConditions) {
        if (stopConditions == null) {
            this.stopConditions = null;
            return;
        }

        this.stopConditions = new java.util.ArrayList<CreateExperimentTemplateStopConditionInput>(stopConditions);
    }

    /**
     * <p>
     * The stop conditions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStopConditions(java.util.Collection)} or {@link #withStopConditions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param stopConditions
     *        The stop conditions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentTemplateRequest withStopConditions(CreateExperimentTemplateStopConditionInput... stopConditions) {
        if (this.stopConditions == null) {
            setStopConditions(new java.util.ArrayList<CreateExperimentTemplateStopConditionInput>(stopConditions.length));
        }
        for (CreateExperimentTemplateStopConditionInput ele : stopConditions) {
            this.stopConditions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The stop conditions.
     * </p>
     * 
     * @param stopConditions
     *        The stop conditions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentTemplateRequest withStopConditions(java.util.Collection<CreateExperimentTemplateStopConditionInput> stopConditions) {
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

    public java.util.Map<String, CreateExperimentTemplateTargetInput> getTargets() {
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

    public void setTargets(java.util.Map<String, CreateExperimentTemplateTargetInput> targets) {
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

    public CreateExperimentTemplateRequest withTargets(java.util.Map<String, CreateExperimentTemplateTargetInput> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * Add a single Targets entry
     *
     * @see CreateExperimentTemplateRequest#withTargets
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentTemplateRequest addTargetsEntry(String key, CreateExperimentTemplateTargetInput value) {
        if (null == this.targets) {
            this.targets = new java.util.HashMap<String, CreateExperimentTemplateTargetInput>();
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

    public CreateExperimentTemplateRequest clearTargetsEntries() {
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

    public java.util.Map<String, CreateExperimentTemplateActionInput> getActions() {
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

    public void setActions(java.util.Map<String, CreateExperimentTemplateActionInput> actions) {
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

    public CreateExperimentTemplateRequest withActions(java.util.Map<String, CreateExperimentTemplateActionInput> actions) {
        setActions(actions);
        return this;
    }

    /**
     * Add a single Actions entry
     *
     * @see CreateExperimentTemplateRequest#withActions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentTemplateRequest addActionsEntry(String key, CreateExperimentTemplateActionInput value) {
        if (null == this.actions) {
            this.actions = new java.util.HashMap<String, CreateExperimentTemplateActionInput>();
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

    public CreateExperimentTemplateRequest clearActionsEntries() {
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

    public CreateExperimentTemplateRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the experiment template.
     * </p>
     * 
     * @return The tags to apply to the experiment template.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to apply to the experiment template.
     * </p>
     * 
     * @param tags
     *        The tags to apply to the experiment template.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to apply to the experiment template.
     * </p>
     * 
     * @param tags
     *        The tags to apply to the experiment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentTemplateRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateExperimentTemplateRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentTemplateRequest addTagsEntry(String key, String value) {
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

    public CreateExperimentTemplateRequest clearTagsEntries() {
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStopConditions() != null)
            sb.append("StopConditions: ").append(getStopConditions()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
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

        if (obj instanceof CreateExperimentTemplateRequest == false)
            return false;
        CreateExperimentTemplateRequest other = (CreateExperimentTemplateRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
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

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStopConditions() == null) ? 0 : getStopConditions().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateExperimentTemplateRequest clone() {
        return (CreateExperimentTemplateRequest) super.clone();
    }

}
