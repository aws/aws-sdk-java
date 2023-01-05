/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The properties of a project as returned by the Search API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/Project" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Project implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project.
     * </p>
     */
    private String projectArn;
    /**
     * <p>
     * The name of the project.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * The ID of the project.
     * </p>
     */
    private String projectId;
    /**
     * <p>
     * The description of the project.
     * </p>
     */
    private String projectDescription;

    private ServiceCatalogProvisioningDetails serviceCatalogProvisioningDetails;

    private ServiceCatalogProvisionedProductDetails serviceCatalogProvisionedProductDetails;
    /**
     * <p>
     * The status of the project.
     * </p>
     */
    private String projectStatus;
    /**
     * <p>
     * Who created the project.
     * </p>
     */
    private UserContext createdBy;
    /**
     * <p>
     * A timestamp specifying when the project was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in different ways,
     * for example, by purpose, owner, or environment. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services Resources</a>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * A timestamp container for when the project was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    private UserContext lastModifiedBy;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project.
     * </p>
     * 
     * @param projectArn
     *        The Amazon Resource Name (ARN) of the project.
     */

    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the project.
     */

    public String getProjectArn() {
        return this.projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project.
     * </p>
     * 
     * @param projectArn
     *        The Amazon Resource Name (ARN) of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withProjectArn(String projectArn) {
        setProjectArn(projectArn);
        return this;
    }

    /**
     * <p>
     * The name of the project.
     * </p>
     * 
     * @param projectName
     *        The name of the project.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the project.
     * </p>
     * 
     * @return The name of the project.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the project.
     * </p>
     * 
     * @param projectName
     *        The name of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * The ID of the project.
     * </p>
     * 
     * @param projectId
     *        The ID of the project.
     */

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * <p>
     * The ID of the project.
     * </p>
     * 
     * @return The ID of the project.
     */

    public String getProjectId() {
        return this.projectId;
    }

    /**
     * <p>
     * The ID of the project.
     * </p>
     * 
     * @param projectId
     *        The ID of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withProjectId(String projectId) {
        setProjectId(projectId);
        return this;
    }

    /**
     * <p>
     * The description of the project.
     * </p>
     * 
     * @param projectDescription
     *        The description of the project.
     */

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    /**
     * <p>
     * The description of the project.
     * </p>
     * 
     * @return The description of the project.
     */

    public String getProjectDescription() {
        return this.projectDescription;
    }

    /**
     * <p>
     * The description of the project.
     * </p>
     * 
     * @param projectDescription
     *        The description of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withProjectDescription(String projectDescription) {
        setProjectDescription(projectDescription);
        return this;
    }

    /**
     * @param serviceCatalogProvisioningDetails
     */

    public void setServiceCatalogProvisioningDetails(ServiceCatalogProvisioningDetails serviceCatalogProvisioningDetails) {
        this.serviceCatalogProvisioningDetails = serviceCatalogProvisioningDetails;
    }

    /**
     * @return
     */

    public ServiceCatalogProvisioningDetails getServiceCatalogProvisioningDetails() {
        return this.serviceCatalogProvisioningDetails;
    }

    /**
     * @param serviceCatalogProvisioningDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withServiceCatalogProvisioningDetails(ServiceCatalogProvisioningDetails serviceCatalogProvisioningDetails) {
        setServiceCatalogProvisioningDetails(serviceCatalogProvisioningDetails);
        return this;
    }

    /**
     * @param serviceCatalogProvisionedProductDetails
     */

    public void setServiceCatalogProvisionedProductDetails(ServiceCatalogProvisionedProductDetails serviceCatalogProvisionedProductDetails) {
        this.serviceCatalogProvisionedProductDetails = serviceCatalogProvisionedProductDetails;
    }

    /**
     * @return
     */

    public ServiceCatalogProvisionedProductDetails getServiceCatalogProvisionedProductDetails() {
        return this.serviceCatalogProvisionedProductDetails;
    }

    /**
     * @param serviceCatalogProvisionedProductDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withServiceCatalogProvisionedProductDetails(ServiceCatalogProvisionedProductDetails serviceCatalogProvisionedProductDetails) {
        setServiceCatalogProvisionedProductDetails(serviceCatalogProvisionedProductDetails);
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

    public Project withProjectStatus(String projectStatus) {
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

    public Project withProjectStatus(ProjectStatus projectStatus) {
        this.projectStatus = projectStatus.toString();
        return this;
    }

    /**
     * <p>
     * Who created the project.
     * </p>
     * 
     * @param createdBy
     *        Who created the project.
     */

    public void setCreatedBy(UserContext createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * Who created the project.
     * </p>
     * 
     * @return Who created the project.
     */

    public UserContext getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * Who created the project.
     * </p>
     * 
     * @param createdBy
     *        Who created the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withCreatedBy(UserContext createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * A timestamp specifying when the project was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp specifying when the project was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp specifying when the project was created.
     * </p>
     * 
     * @return A timestamp specifying when the project was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp specifying when the project was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp specifying when the project was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in different ways,
     * for example, by purpose, owner, or environment. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services Resources</a>.
     * </p>
     * 
     * @return An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in
     *         different ways, for example, by purpose, owner, or environment. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *         Resources</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in different ways,
     * for example, by purpose, owner, or environment. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services Resources</a>.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in
     *        different ways, for example, by purpose, owner, or environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        Resources</a>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in different ways,
     * for example, by purpose, owner, or environment. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services Resources</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in
     *        different ways, for example, by purpose, owner, or environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        Resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in different ways,
     * for example, by purpose, owner, or environment. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services Resources</a>.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in
     *        different ways, for example, by purpose, owner, or environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        Resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A timestamp container for when the project was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp container for when the project was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp container for when the project was last modified.
     * </p>
     * 
     * @return A timestamp container for when the project was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp container for when the project was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp container for when the project was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * @param lastModifiedBy
     */

    public void setLastModifiedBy(UserContext lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * @return
     */

    public UserContext getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * @param lastModifiedBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Project withLastModifiedBy(UserContext lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
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
        if (getProjectArn() != null)
            sb.append("ProjectArn: ").append(getProjectArn()).append(",");
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId()).append(",");
        if (getProjectDescription() != null)
            sb.append("ProjectDescription: ").append(getProjectDescription()).append(",");
        if (getServiceCatalogProvisioningDetails() != null)
            sb.append("ServiceCatalogProvisioningDetails: ").append(getServiceCatalogProvisioningDetails()).append(",");
        if (getServiceCatalogProvisionedProductDetails() != null)
            sb.append("ServiceCatalogProvisionedProductDetails: ").append(getServiceCatalogProvisionedProductDetails()).append(",");
        if (getProjectStatus() != null)
            sb.append("ProjectStatus: ").append(getProjectStatus()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Project == false)
            return false;
        Project other = (Project) obj;
        if (other.getProjectArn() == null ^ this.getProjectArn() == null)
            return false;
        if (other.getProjectArn() != null && other.getProjectArn().equals(this.getProjectArn()) == false)
            return false;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null && other.getProjectId().equals(this.getProjectId()) == false)
            return false;
        if (other.getProjectDescription() == null ^ this.getProjectDescription() == null)
            return false;
        if (other.getProjectDescription() != null && other.getProjectDescription().equals(this.getProjectDescription()) == false)
            return false;
        if (other.getServiceCatalogProvisioningDetails() == null ^ this.getServiceCatalogProvisioningDetails() == null)
            return false;
        if (other.getServiceCatalogProvisioningDetails() != null
                && other.getServiceCatalogProvisioningDetails().equals(this.getServiceCatalogProvisioningDetails()) == false)
            return false;
        if (other.getServiceCatalogProvisionedProductDetails() == null ^ this.getServiceCatalogProvisionedProductDetails() == null)
            return false;
        if (other.getServiceCatalogProvisionedProductDetails() != null
                && other.getServiceCatalogProvisionedProductDetails().equals(this.getServiceCatalogProvisionedProductDetails()) == false)
            return false;
        if (other.getProjectStatus() == null ^ this.getProjectStatus() == null)
            return false;
        if (other.getProjectStatus() != null && other.getProjectStatus().equals(this.getProjectStatus()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        hashCode = prime * hashCode + ((getProjectDescription() == null) ? 0 : getProjectDescription().hashCode());
        hashCode = prime * hashCode + ((getServiceCatalogProvisioningDetails() == null) ? 0 : getServiceCatalogProvisioningDetails().hashCode());
        hashCode = prime * hashCode + ((getServiceCatalogProvisionedProductDetails() == null) ? 0 : getServiceCatalogProvisionedProductDetails().hashCode());
        hashCode = prime * hashCode + ((getProjectStatus() == null) ? 0 : getProjectStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        return hashCode;
    }

    @Override
    public Project clone() {
        try {
            return (Project) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ProjectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
