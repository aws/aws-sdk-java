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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains metadata about the workflow resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/WorkflowSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the workflow resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the workflow.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The version of the workflow.
     * </p>
     */
    private String version;
    /**
     * <p>
     * Describes the workflow.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The change description for the current version of the workflow resource.
     * </p>
     */
    private String changeDescription;
    /**
     * <p>
     * The image creation stage that this workflow applies to. Image Builder currently supports build and test stage
     * workflows.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The owner of the workflow resource.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * Describes the current state of the workflow resource.
     * </p>
     */
    private WorkflowState state;
    /**
     * <p>
     * The original creation date of the workflow resource.
     * </p>
     */
    private String dateCreated;
    /**
     * <p>
     * Contains a list of tags that are defined for the workflow.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the workflow resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the workflow resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the workflow resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the workflow resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the workflow resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the workflow resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the workflow.
     * </p>
     * 
     * @param name
     *        The name of the workflow.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the workflow.
     * </p>
     * 
     * @return The name of the workflow.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the workflow.
     * </p>
     * 
     * @param name
     *        The name of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The version of the workflow.
     * </p>
     * 
     * @param version
     *        The version of the workflow.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the workflow.
     * </p>
     * 
     * @return The version of the workflow.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the workflow.
     * </p>
     * 
     * @param version
     *        The version of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowSummary withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * Describes the workflow.
     * </p>
     * 
     * @param description
     *        Describes the workflow.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Describes the workflow.
     * </p>
     * 
     * @return Describes the workflow.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Describes the workflow.
     * </p>
     * 
     * @param description
     *        Describes the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The change description for the current version of the workflow resource.
     * </p>
     * 
     * @param changeDescription
     *        The change description for the current version of the workflow resource.
     */

    public void setChangeDescription(String changeDescription) {
        this.changeDescription = changeDescription;
    }

    /**
     * <p>
     * The change description for the current version of the workflow resource.
     * </p>
     * 
     * @return The change description for the current version of the workflow resource.
     */

    public String getChangeDescription() {
        return this.changeDescription;
    }

    /**
     * <p>
     * The change description for the current version of the workflow resource.
     * </p>
     * 
     * @param changeDescription
     *        The change description for the current version of the workflow resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowSummary withChangeDescription(String changeDescription) {
        setChangeDescription(changeDescription);
        return this;
    }

    /**
     * <p>
     * The image creation stage that this workflow applies to. Image Builder currently supports build and test stage
     * workflows.
     * </p>
     * 
     * @param type
     *        The image creation stage that this workflow applies to. Image Builder currently supports build and test
     *        stage workflows.
     * @see WorkflowType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The image creation stage that this workflow applies to. Image Builder currently supports build and test stage
     * workflows.
     * </p>
     * 
     * @return The image creation stage that this workflow applies to. Image Builder currently supports build and test
     *         stage workflows.
     * @see WorkflowType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The image creation stage that this workflow applies to. Image Builder currently supports build and test stage
     * workflows.
     * </p>
     * 
     * @param type
     *        The image creation stage that this workflow applies to. Image Builder currently supports build and test
     *        stage workflows.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowType
     */

    public WorkflowSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The image creation stage that this workflow applies to. Image Builder currently supports build and test stage
     * workflows.
     * </p>
     * 
     * @param type
     *        The image creation stage that this workflow applies to. Image Builder currently supports build and test
     *        stage workflows.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowType
     */

    public WorkflowSummary withType(WorkflowType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The owner of the workflow resource.
     * </p>
     * 
     * @param owner
     *        The owner of the workflow resource.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the workflow resource.
     * </p>
     * 
     * @return The owner of the workflow resource.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the workflow resource.
     * </p>
     * 
     * @param owner
     *        The owner of the workflow resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowSummary withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * Describes the current state of the workflow resource.
     * </p>
     * 
     * @param state
     *        Describes the current state of the workflow resource.
     */

    public void setState(WorkflowState state) {
        this.state = state;
    }

    /**
     * <p>
     * Describes the current state of the workflow resource.
     * </p>
     * 
     * @return Describes the current state of the workflow resource.
     */

    public WorkflowState getState() {
        return this.state;
    }

    /**
     * <p>
     * Describes the current state of the workflow resource.
     * </p>
     * 
     * @param state
     *        Describes the current state of the workflow resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowSummary withState(WorkflowState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The original creation date of the workflow resource.
     * </p>
     * 
     * @param dateCreated
     *        The original creation date of the workflow resource.
     */

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The original creation date of the workflow resource.
     * </p>
     * 
     * @return The original creation date of the workflow resource.
     */

    public String getDateCreated() {
        return this.dateCreated;
    }

    /**
     * <p>
     * The original creation date of the workflow resource.
     * </p>
     * 
     * @param dateCreated
     *        The original creation date of the workflow resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowSummary withDateCreated(String dateCreated) {
        setDateCreated(dateCreated);
        return this;
    }

    /**
     * <p>
     * Contains a list of tags that are defined for the workflow.
     * </p>
     * 
     * @return Contains a list of tags that are defined for the workflow.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Contains a list of tags that are defined for the workflow.
     * </p>
     * 
     * @param tags
     *        Contains a list of tags that are defined for the workflow.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Contains a list of tags that are defined for the workflow.
     * </p>
     * 
     * @param tags
     *        Contains a list of tags that are defined for the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowSummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see WorkflowSummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowSummary addTagsEntry(String key, String value) {
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

    public WorkflowSummary clearTagsEntries() {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getChangeDescription() != null)
            sb.append("ChangeDescription: ").append(getChangeDescription()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getDateCreated() != null)
            sb.append("DateCreated: ").append(getDateCreated()).append(",");
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

        if (obj instanceof WorkflowSummary == false)
            return false;
        WorkflowSummary other = (WorkflowSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getChangeDescription() == null ^ this.getChangeDescription() == null)
            return false;
        if (other.getChangeDescription() != null && other.getChangeDescription().equals(this.getChangeDescription()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null && other.getDateCreated().equals(this.getDateCreated()) == false)
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getChangeDescription() == null) ? 0 : getChangeDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowSummary clone() {
        try {
            return (WorkflowSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.WorkflowSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
