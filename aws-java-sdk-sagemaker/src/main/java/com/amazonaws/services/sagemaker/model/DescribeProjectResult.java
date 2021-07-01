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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProjectResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
    /**
     * <p>
     * Information used to provision a service catalog product. For information, see <a
     * href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html">What is Amazon Web Services
     * Service Catalog</a>.
     * </p>
     */
    private ServiceCatalogProvisioningDetails serviceCatalogProvisioningDetails;
    /**
     * <p>
     * Information about a provisioned service catalog product.
     * </p>
     */
    private ServiceCatalogProvisionedProductDetails serviceCatalogProvisionedProductDetails;
    /**
     * <p>
     * The status of the project.
     * </p>
     */
    private String projectStatus;

    private UserContext createdBy;
    /**
     * <p>
     * The time when the project was created.
     * </p>
     */
    private java.util.Date creationTime;

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

    public DescribeProjectResult withProjectArn(String projectArn) {
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

    public DescribeProjectResult withProjectName(String projectName) {
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

    public DescribeProjectResult withProjectId(String projectId) {
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

    public DescribeProjectResult withProjectDescription(String projectDescription) {
        setProjectDescription(projectDescription);
        return this;
    }

    /**
     * <p>
     * Information used to provision a service catalog product. For information, see <a
     * href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html">What is Amazon Web Services
     * Service Catalog</a>.
     * </p>
     * 
     * @param serviceCatalogProvisioningDetails
     *        Information used to provision a service catalog product. For information, see <a
     *        href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html">What is Amazon Web
     *        Services Service Catalog</a>.
     */

    public void setServiceCatalogProvisioningDetails(ServiceCatalogProvisioningDetails serviceCatalogProvisioningDetails) {
        this.serviceCatalogProvisioningDetails = serviceCatalogProvisioningDetails;
    }

    /**
     * <p>
     * Information used to provision a service catalog product. For information, see <a
     * href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html">What is Amazon Web Services
     * Service Catalog</a>.
     * </p>
     * 
     * @return Information used to provision a service catalog product. For information, see <a
     *         href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html">What is Amazon Web
     *         Services Service Catalog</a>.
     */

    public ServiceCatalogProvisioningDetails getServiceCatalogProvisioningDetails() {
        return this.serviceCatalogProvisioningDetails;
    }

    /**
     * <p>
     * Information used to provision a service catalog product. For information, see <a
     * href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html">What is Amazon Web Services
     * Service Catalog</a>.
     * </p>
     * 
     * @param serviceCatalogProvisioningDetails
     *        Information used to provision a service catalog product. For information, see <a
     *        href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html">What is Amazon Web
     *        Services Service Catalog</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withServiceCatalogProvisioningDetails(ServiceCatalogProvisioningDetails serviceCatalogProvisioningDetails) {
        setServiceCatalogProvisioningDetails(serviceCatalogProvisioningDetails);
        return this;
    }

    /**
     * <p>
     * Information about a provisioned service catalog product.
     * </p>
     * 
     * @param serviceCatalogProvisionedProductDetails
     *        Information about a provisioned service catalog product.
     */

    public void setServiceCatalogProvisionedProductDetails(ServiceCatalogProvisionedProductDetails serviceCatalogProvisionedProductDetails) {
        this.serviceCatalogProvisionedProductDetails = serviceCatalogProvisionedProductDetails;
    }

    /**
     * <p>
     * Information about a provisioned service catalog product.
     * </p>
     * 
     * @return Information about a provisioned service catalog product.
     */

    public ServiceCatalogProvisionedProductDetails getServiceCatalogProvisionedProductDetails() {
        return this.serviceCatalogProvisionedProductDetails;
    }

    /**
     * <p>
     * Information about a provisioned service catalog product.
     * </p>
     * 
     * @param serviceCatalogProvisionedProductDetails
     *        Information about a provisioned service catalog product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withServiceCatalogProvisionedProductDetails(ServiceCatalogProvisionedProductDetails serviceCatalogProvisionedProductDetails) {
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

    public DescribeProjectResult withProjectStatus(String projectStatus) {
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

    public DescribeProjectResult withProjectStatus(ProjectStatus projectStatus) {
        this.projectStatus = projectStatus.toString();
        return this;
    }

    /**
     * @param createdBy
     */

    public void setCreatedBy(UserContext createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return
     */

    public UserContext getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @param createdBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withCreatedBy(UserContext createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The time when the project was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the project was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the project was created.
     * </p>
     * 
     * @return The time when the project was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the project was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the project was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProjectResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProjectResult == false)
            return false;
        DescribeProjectResult other = (DescribeProjectResult) obj;
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
        return hashCode;
    }

    @Override
    public DescribeProjectResult clone() {
        try {
            return (DescribeProjectResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
