/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot1clickprojects.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object providing detailed information for a particular project associated with an AWS account and region.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/ProjectDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the project.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the project for which to obtain information from.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * The description of the project.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The date when the project was originally created, in UNIX epoch time format.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The date when the project was last updated, in UNIX epoch time format. If the project was not updated, then
     * <code>createdDate</code> and <code>updatedDate</code> are the same.
     * </p>
     */
    private java.util.Date updatedDate;
    /**
     * <p>
     * An object describing the project's placement specifications.
     * </p>
     */
    private PlacementTemplate placementTemplate;
    /**
     * <p>
     * The tags (metadata key/value pairs) associated with the project.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ARN of the project.
     * </p>
     * 
     * @param arn
     *        The ARN of the project.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the project.
     * </p>
     * 
     * @return The ARN of the project.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the project.
     * </p>
     * 
     * @param arn
     *        The ARN of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectDescription withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the project for which to obtain information from.
     * </p>
     * 
     * @param projectName
     *        The name of the project for which to obtain information from.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the project for which to obtain information from.
     * </p>
     * 
     * @return The name of the project for which to obtain information from.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the project for which to obtain information from.
     * </p>
     * 
     * @param projectName
     *        The name of the project for which to obtain information from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectDescription withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * The description of the project.
     * </p>
     * 
     * @param description
     *        The description of the project.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the project.
     * </p>
     * 
     * @return The description of the project.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the project.
     * </p>
     * 
     * @param description
     *        The description of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectDescription withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date when the project was originally created, in UNIX epoch time format.
     * </p>
     * 
     * @param createdDate
     *        The date when the project was originally created, in UNIX epoch time format.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date when the project was originally created, in UNIX epoch time format.
     * </p>
     * 
     * @return The date when the project was originally created, in UNIX epoch time format.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date when the project was originally created, in UNIX epoch time format.
     * </p>
     * 
     * @param createdDate
     *        The date when the project was originally created, in UNIX epoch time format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectDescription withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The date when the project was last updated, in UNIX epoch time format. If the project was not updated, then
     * <code>createdDate</code> and <code>updatedDate</code> are the same.
     * </p>
     * 
     * @param updatedDate
     *        The date when the project was last updated, in UNIX epoch time format. If the project was not updated,
     *        then <code>createdDate</code> and <code>updatedDate</code> are the same.
     */

    public void setUpdatedDate(java.util.Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * <p>
     * The date when the project was last updated, in UNIX epoch time format. If the project was not updated, then
     * <code>createdDate</code> and <code>updatedDate</code> are the same.
     * </p>
     * 
     * @return The date when the project was last updated, in UNIX epoch time format. If the project was not updated,
     *         then <code>createdDate</code> and <code>updatedDate</code> are the same.
     */

    public java.util.Date getUpdatedDate() {
        return this.updatedDate;
    }

    /**
     * <p>
     * The date when the project was last updated, in UNIX epoch time format. If the project was not updated, then
     * <code>createdDate</code> and <code>updatedDate</code> are the same.
     * </p>
     * 
     * @param updatedDate
     *        The date when the project was last updated, in UNIX epoch time format. If the project was not updated,
     *        then <code>createdDate</code> and <code>updatedDate</code> are the same.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectDescription withUpdatedDate(java.util.Date updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    /**
     * <p>
     * An object describing the project's placement specifications.
     * </p>
     * 
     * @param placementTemplate
     *        An object describing the project's placement specifications.
     */

    public void setPlacementTemplate(PlacementTemplate placementTemplate) {
        this.placementTemplate = placementTemplate;
    }

    /**
     * <p>
     * An object describing the project's placement specifications.
     * </p>
     * 
     * @return An object describing the project's placement specifications.
     */

    public PlacementTemplate getPlacementTemplate() {
        return this.placementTemplate;
    }

    /**
     * <p>
     * An object describing the project's placement specifications.
     * </p>
     * 
     * @param placementTemplate
     *        An object describing the project's placement specifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectDescription withPlacementTemplate(PlacementTemplate placementTemplate) {
        setPlacementTemplate(placementTemplate);
        return this;
    }

    /**
     * <p>
     * The tags (metadata key/value pairs) associated with the project.
     * </p>
     * 
     * @return The tags (metadata key/value pairs) associated with the project.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags (metadata key/value pairs) associated with the project.
     * </p>
     * 
     * @param tags
     *        The tags (metadata key/value pairs) associated with the project.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags (metadata key/value pairs) associated with the project.
     * </p>
     * 
     * @param tags
     *        The tags (metadata key/value pairs) associated with the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectDescription withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public ProjectDescription addTagsEntry(String key, String value) {
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

    public ProjectDescription clearTagsEntries() {
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
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getUpdatedDate() != null)
            sb.append("UpdatedDate: ").append(getUpdatedDate()).append(",");
        if (getPlacementTemplate() != null)
            sb.append("PlacementTemplate: ").append(getPlacementTemplate()).append(",");
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

        if (obj instanceof ProjectDescription == false)
            return false;
        ProjectDescription other = (ProjectDescription) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getUpdatedDate() == null ^ this.getUpdatedDate() == null)
            return false;
        if (other.getUpdatedDate() != null && other.getUpdatedDate().equals(this.getUpdatedDate()) == false)
            return false;
        if (other.getPlacementTemplate() == null ^ this.getPlacementTemplate() == null)
            return false;
        if (other.getPlacementTemplate() != null && other.getPlacementTemplate().equals(this.getPlacementTemplate()) == false)
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
        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getUpdatedDate() == null) ? 0 : getUpdatedDate().hashCode());
        hashCode = prime * hashCode + ((getPlacementTemplate() == null) ? 0 : getPlacementTemplate().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ProjectDescription clone() {
        try {
            return (ProjectDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot1clickprojects.model.transform.ProjectDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
