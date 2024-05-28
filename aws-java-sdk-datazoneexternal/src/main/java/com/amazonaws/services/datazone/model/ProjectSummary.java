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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a Amazon DataZone project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ProjectSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp of when a project was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Amazon DataZone user who created the project.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The description of a project.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier of a Amazon DataZone domain where the project exists.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * Specifies the error message that is returned if the operation cannot be successfully completed.
     * </p>
     */
    private java.util.List<ProjectDeletionError> failureReasons;
    /**
     * <p>
     * The identifier of a project.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of a project.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the project.
     * </p>
     */
    private String projectStatus;
    /**
     * <p>
     * The timestamp of when the project was updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The timestamp of when a project was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when a project was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when a project was created.
     * </p>
     * 
     * @return The timestamp of when a project was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when a project was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when a project was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the project.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone user who created the project.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the project.
     * </p>
     * 
     * @return The Amazon DataZone user who created the project.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the project.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone user who created the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSummary withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The description of a project.
     * </p>
     * 
     * @param description
     *        The description of a project.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of a project.
     * </p>
     * 
     * @return The description of a project.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of a project.
     * </p>
     * 
     * @param description
     *        The description of a project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier of a Amazon DataZone domain where the project exists.
     * </p>
     * 
     * @param domainId
     *        The identifier of a Amazon DataZone domain where the project exists.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The identifier of a Amazon DataZone domain where the project exists.
     * </p>
     * 
     * @return The identifier of a Amazon DataZone domain where the project exists.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The identifier of a Amazon DataZone domain where the project exists.
     * </p>
     * 
     * @param domainId
     *        The identifier of a Amazon DataZone domain where the project exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSummary withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * Specifies the error message that is returned if the operation cannot be successfully completed.
     * </p>
     * 
     * @return Specifies the error message that is returned if the operation cannot be successfully completed.
     */

    public java.util.List<ProjectDeletionError> getFailureReasons() {
        return failureReasons;
    }

    /**
     * <p>
     * Specifies the error message that is returned if the operation cannot be successfully completed.
     * </p>
     * 
     * @param failureReasons
     *        Specifies the error message that is returned if the operation cannot be successfully completed.
     */

    public void setFailureReasons(java.util.Collection<ProjectDeletionError> failureReasons) {
        if (failureReasons == null) {
            this.failureReasons = null;
            return;
        }

        this.failureReasons = new java.util.ArrayList<ProjectDeletionError>(failureReasons);
    }

    /**
     * <p>
     * Specifies the error message that is returned if the operation cannot be successfully completed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureReasons(java.util.Collection)} or {@link #withFailureReasons(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failureReasons
     *        Specifies the error message that is returned if the operation cannot be successfully completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSummary withFailureReasons(ProjectDeletionError... failureReasons) {
        if (this.failureReasons == null) {
            setFailureReasons(new java.util.ArrayList<ProjectDeletionError>(failureReasons.length));
        }
        for (ProjectDeletionError ele : failureReasons) {
            this.failureReasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the error message that is returned if the operation cannot be successfully completed.
     * </p>
     * 
     * @param failureReasons
     *        Specifies the error message that is returned if the operation cannot be successfully completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSummary withFailureReasons(java.util.Collection<ProjectDeletionError> failureReasons) {
        setFailureReasons(failureReasons);
        return this;
    }

    /**
     * <p>
     * The identifier of a project.
     * </p>
     * 
     * @param id
     *        The identifier of a project.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of a project.
     * </p>
     * 
     * @return The identifier of a project.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of a project.
     * </p>
     * 
     * @param id
     *        The identifier of a project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of a project.
     * </p>
     * 
     * @param name
     *        The name of a project.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a project.
     * </p>
     * 
     * @return The name of a project.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a project.
     * </p>
     * 
     * @param name
     *        The name of a project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the project.
     * </p>
     * 
     * @param projectStatus
     *        The status of the project.
     * @see ProjectStatus
     */

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    /**
     * <p>
     * The status of the project.
     * </p>
     * 
     * @return The status of the project.
     * @see ProjectStatus
     */

    public String getProjectStatus() {
        return this.projectStatus;
    }

    /**
     * <p>
     * The status of the project.
     * </p>
     * 
     * @param projectStatus
     *        The status of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProjectStatus
     */

    public ProjectSummary withProjectStatus(String projectStatus) {
        setProjectStatus(projectStatus);
        return this;
    }

    /**
     * <p>
     * The status of the project.
     * </p>
     * 
     * @param projectStatus
     *        The status of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProjectStatus
     */

    public ProjectSummary withProjectStatus(ProjectStatus projectStatus) {
        this.projectStatus = projectStatus.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp of when the project was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the project was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the project was updated.
     * </p>
     * 
     * @return The timestamp of when the project was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the project was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the project was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getFailureReasons() != null)
            sb.append("FailureReasons: ").append(getFailureReasons()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getProjectStatus() != null)
            sb.append("ProjectStatus: ").append(getProjectStatus()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectSummary == false)
            return false;
        ProjectSummary other = (ProjectSummary) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getFailureReasons() == null ^ this.getFailureReasons() == null)
            return false;
        if (other.getFailureReasons() != null && other.getFailureReasons().equals(this.getFailureReasons()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProjectStatus() == null ^ this.getProjectStatus() == null)
            return false;
        if (other.getProjectStatus() != null && other.getProjectStatus().equals(this.getProjectStatus()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getFailureReasons() == null) ? 0 : getFailureReasons().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProjectStatus() == null) ? 0 : getProjectStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public ProjectSummary clone() {
        try {
            return (ProjectSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.ProjectSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
