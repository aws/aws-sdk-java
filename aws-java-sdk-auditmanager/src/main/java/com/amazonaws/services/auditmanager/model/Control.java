/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A control in AWS Audit Manager.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/Control" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Control implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified control.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The unique identifier for the control.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The type of control, such as custom or standard.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the specified control.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the specified control.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The steps to follow to determine if the control has been satisfied.
     * </p>
     */
    private String testingInformation;
    /**
     * <p>
     * The title of the action plan for remediating the control.
     * </p>
     */
    private String actionPlanTitle;
    /**
     * <p>
     * The recommended actions to carry out if the control is not fulfilled.
     * </p>
     */
    private String actionPlanInstructions;
    /**
     * <p>
     * The data mapping sources for the specified control.
     * </p>
     */
    private String controlSources;
    /**
     * <p>
     * The data mapping sources for the specified control.
     * </p>
     */
    private java.util.List<ControlMappingSource> controlMappingSources;
    /**
     * <p>
     * Specifies when the control was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Specifies when the control was most recently updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The IAM user or role that created the control.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The IAM user or role that most recently updated the control.
     * </p>
     */
    private String lastUpdatedBy;
    /**
     * <p>
     * The tags associated with the control.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified control.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the specified control.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified control.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the specified control.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified control.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the specified control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Control withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the control.
     * </p>
     * 
     * @param id
     *        The unique identifier for the control.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the control.
     * </p>
     * 
     * @return The unique identifier for the control.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the control.
     * </p>
     * 
     * @param id
     *        The unique identifier for the control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Control withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The type of control, such as custom or standard.
     * </p>
     * 
     * @param type
     *        The type of control, such as custom or standard.
     * @see ControlType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of control, such as custom or standard.
     * </p>
     * 
     * @return The type of control, such as custom or standard.
     * @see ControlType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of control, such as custom or standard.
     * </p>
     * 
     * @param type
     *        The type of control, such as custom or standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlType
     */

    public Control withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of control, such as custom or standard.
     * </p>
     * 
     * @param type
     *        The type of control, such as custom or standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlType
     */

    public Control withType(ControlType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the specified control.
     * </p>
     * 
     * @param name
     *        The name of the specified control.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the specified control.
     * </p>
     * 
     * @return The name of the specified control.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the specified control.
     * </p>
     * 
     * @param name
     *        The name of the specified control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Control withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the specified control.
     * </p>
     * 
     * @param description
     *        The description of the specified control.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the specified control.
     * </p>
     * 
     * @return The description of the specified control.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the specified control.
     * </p>
     * 
     * @param description
     *        The description of the specified control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Control withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The steps to follow to determine if the control has been satisfied.
     * </p>
     * 
     * @param testingInformation
     *        The steps to follow to determine if the control has been satisfied.
     */

    public void setTestingInformation(String testingInformation) {
        this.testingInformation = testingInformation;
    }

    /**
     * <p>
     * The steps to follow to determine if the control has been satisfied.
     * </p>
     * 
     * @return The steps to follow to determine if the control has been satisfied.
     */

    public String getTestingInformation() {
        return this.testingInformation;
    }

    /**
     * <p>
     * The steps to follow to determine if the control has been satisfied.
     * </p>
     * 
     * @param testingInformation
     *        The steps to follow to determine if the control has been satisfied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Control withTestingInformation(String testingInformation) {
        setTestingInformation(testingInformation);
        return this;
    }

    /**
     * <p>
     * The title of the action plan for remediating the control.
     * </p>
     * 
     * @param actionPlanTitle
     *        The title of the action plan for remediating the control.
     */

    public void setActionPlanTitle(String actionPlanTitle) {
        this.actionPlanTitle = actionPlanTitle;
    }

    /**
     * <p>
     * The title of the action plan for remediating the control.
     * </p>
     * 
     * @return The title of the action plan for remediating the control.
     */

    public String getActionPlanTitle() {
        return this.actionPlanTitle;
    }

    /**
     * <p>
     * The title of the action plan for remediating the control.
     * </p>
     * 
     * @param actionPlanTitle
     *        The title of the action plan for remediating the control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Control withActionPlanTitle(String actionPlanTitle) {
        setActionPlanTitle(actionPlanTitle);
        return this;
    }

    /**
     * <p>
     * The recommended actions to carry out if the control is not fulfilled.
     * </p>
     * 
     * @param actionPlanInstructions
     *        The recommended actions to carry out if the control is not fulfilled.
     */

    public void setActionPlanInstructions(String actionPlanInstructions) {
        this.actionPlanInstructions = actionPlanInstructions;
    }

    /**
     * <p>
     * The recommended actions to carry out if the control is not fulfilled.
     * </p>
     * 
     * @return The recommended actions to carry out if the control is not fulfilled.
     */

    public String getActionPlanInstructions() {
        return this.actionPlanInstructions;
    }

    /**
     * <p>
     * The recommended actions to carry out if the control is not fulfilled.
     * </p>
     * 
     * @param actionPlanInstructions
     *        The recommended actions to carry out if the control is not fulfilled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Control withActionPlanInstructions(String actionPlanInstructions) {
        setActionPlanInstructions(actionPlanInstructions);
        return this;
    }

    /**
     * <p>
     * The data mapping sources for the specified control.
     * </p>
     * 
     * @param controlSources
     *        The data mapping sources for the specified control.
     */

    public void setControlSources(String controlSources) {
        this.controlSources = controlSources;
    }

    /**
     * <p>
     * The data mapping sources for the specified control.
     * </p>
     * 
     * @return The data mapping sources for the specified control.
     */

    public String getControlSources() {
        return this.controlSources;
    }

    /**
     * <p>
     * The data mapping sources for the specified control.
     * </p>
     * 
     * @param controlSources
     *        The data mapping sources for the specified control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Control withControlSources(String controlSources) {
        setControlSources(controlSources);
        return this;
    }

    /**
     * <p>
     * The data mapping sources for the specified control.
     * </p>
     * 
     * @return The data mapping sources for the specified control.
     */

    public java.util.List<ControlMappingSource> getControlMappingSources() {
        return controlMappingSources;
    }

    /**
     * <p>
     * The data mapping sources for the specified control.
     * </p>
     * 
     * @param controlMappingSources
     *        The data mapping sources for the specified control.
     */

    public void setControlMappingSources(java.util.Collection<ControlMappingSource> controlMappingSources) {
        if (controlMappingSources == null) {
            this.controlMappingSources = null;
            return;
        }

        this.controlMappingSources = new java.util.ArrayList<ControlMappingSource>(controlMappingSources);
    }

    /**
     * <p>
     * The data mapping sources for the specified control.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setControlMappingSources(java.util.Collection)} or
     * {@link #withControlMappingSources(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param controlMappingSources
     *        The data mapping sources for the specified control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Control withControlMappingSources(ControlMappingSource... controlMappingSources) {
        if (this.controlMappingSources == null) {
            setControlMappingSources(new java.util.ArrayList<ControlMappingSource>(controlMappingSources.length));
        }
        for (ControlMappingSource ele : controlMappingSources) {
            this.controlMappingSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data mapping sources for the specified control.
     * </p>
     * 
     * @param controlMappingSources
     *        The data mapping sources for the specified control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Control withControlMappingSources(java.util.Collection<ControlMappingSource> controlMappingSources) {
        setControlMappingSources(controlMappingSources);
        return this;
    }

    /**
     * <p>
     * Specifies when the control was created.
     * </p>
     * 
     * @param createdAt
     *        Specifies when the control was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Specifies when the control was created.
     * </p>
     * 
     * @return Specifies when the control was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Specifies when the control was created.
     * </p>
     * 
     * @param createdAt
     *        Specifies when the control was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Control withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Specifies when the control was most recently updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        Specifies when the control was most recently updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * Specifies when the control was most recently updated.
     * </p>
     * 
     * @return Specifies when the control was most recently updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * Specifies when the control was most recently updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        Specifies when the control was most recently updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Control withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The IAM user or role that created the control.
     * </p>
     * 
     * @param createdBy
     *        The IAM user or role that created the control.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The IAM user or role that created the control.
     * </p>
     * 
     * @return The IAM user or role that created the control.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The IAM user or role that created the control.
     * </p>
     * 
     * @param createdBy
     *        The IAM user or role that created the control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Control withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The IAM user or role that most recently updated the control.
     * </p>
     * 
     * @param lastUpdatedBy
     *        The IAM user or role that most recently updated the control.
     */

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * <p>
     * The IAM user or role that most recently updated the control.
     * </p>
     * 
     * @return The IAM user or role that most recently updated the control.
     */

    public String getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    /**
     * <p>
     * The IAM user or role that most recently updated the control.
     * </p>
     * 
     * @param lastUpdatedBy
     *        The IAM user or role that most recently updated the control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Control withLastUpdatedBy(String lastUpdatedBy) {
        setLastUpdatedBy(lastUpdatedBy);
        return this;
    }

    /**
     * <p>
     * The tags associated with the control.
     * </p>
     * 
     * @return The tags associated with the control.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the control.
     * </p>
     * 
     * @param tags
     *        The tags associated with the control.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags associated with the control.
     * </p>
     * 
     * @param tags
     *        The tags associated with the control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Control withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Control#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Control addTagsEntry(String key, String value) {
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

    public Control clearTagsEntries() {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTestingInformation() != null)
            sb.append("TestingInformation: ").append(getTestingInformation()).append(",");
        if (getActionPlanTitle() != null)
            sb.append("ActionPlanTitle: ").append(getActionPlanTitle()).append(",");
        if (getActionPlanInstructions() != null)
            sb.append("ActionPlanInstructions: ").append(getActionPlanInstructions()).append(",");
        if (getControlSources() != null)
            sb.append("ControlSources: ").append(getControlSources()).append(",");
        if (getControlMappingSources() != null)
            sb.append("ControlMappingSources: ").append(getControlMappingSources()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getLastUpdatedBy() != null)
            sb.append("LastUpdatedBy: ").append(getLastUpdatedBy()).append(",");
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

        if (obj instanceof Control == false)
            return false;
        Control other = (Control) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTestingInformation() == null ^ this.getTestingInformation() == null)
            return false;
        if (other.getTestingInformation() != null && other.getTestingInformation().equals(this.getTestingInformation()) == false)
            return false;
        if (other.getActionPlanTitle() == null ^ this.getActionPlanTitle() == null)
            return false;
        if (other.getActionPlanTitle() != null && other.getActionPlanTitle().equals(this.getActionPlanTitle()) == false)
            return false;
        if (other.getActionPlanInstructions() == null ^ this.getActionPlanInstructions() == null)
            return false;
        if (other.getActionPlanInstructions() != null && other.getActionPlanInstructions().equals(this.getActionPlanInstructions()) == false)
            return false;
        if (other.getControlSources() == null ^ this.getControlSources() == null)
            return false;
        if (other.getControlSources() != null && other.getControlSources().equals(this.getControlSources()) == false)
            return false;
        if (other.getControlMappingSources() == null ^ this.getControlMappingSources() == null)
            return false;
        if (other.getControlMappingSources() != null && other.getControlMappingSources().equals(this.getControlMappingSources()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getLastUpdatedBy() == null ^ this.getLastUpdatedBy() == null)
            return false;
        if (other.getLastUpdatedBy() != null && other.getLastUpdatedBy().equals(this.getLastUpdatedBy()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTestingInformation() == null) ? 0 : getTestingInformation().hashCode());
        hashCode = prime * hashCode + ((getActionPlanTitle() == null) ? 0 : getActionPlanTitle().hashCode());
        hashCode = prime * hashCode + ((getActionPlanInstructions() == null) ? 0 : getActionPlanInstructions().hashCode());
        hashCode = prime * hashCode + ((getControlSources() == null) ? 0 : getControlSources().hashCode());
        hashCode = prime * hashCode + ((getControlMappingSources() == null) ? 0 : getControlMappingSources().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedBy() == null) ? 0 : getLastUpdatedBy().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Control clone() {
        try {
            return (Control) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.ControlMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
