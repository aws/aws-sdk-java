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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the project.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * A description for the project.
     * </p>
     */
    private String projectDescription;
    /**
     * <p>
     * The product ID and provisioning artifact ID to provision a service catalog. For information, see <a
     * href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html">What is AWS Service
     * Catalog</a>.
     * </p>
     */
    private ServiceCatalogProvisioningDetails serviceCatalogProvisioningDetails;
    /**
     * <p>
     * An array of key-value pairs that you want to use to organize and track your AWS resource costs. For more
     * information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS
     * resources</a> in the <i>AWS General Reference Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

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

    public CreateProjectRequest withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * A description for the project.
     * </p>
     * 
     * @param projectDescription
     *        A description for the project.
     */

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    /**
     * <p>
     * A description for the project.
     * </p>
     * 
     * @return A description for the project.
     */

    public String getProjectDescription() {
        return this.projectDescription;
    }

    /**
     * <p>
     * A description for the project.
     * </p>
     * 
     * @param projectDescription
     *        A description for the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withProjectDescription(String projectDescription) {
        setProjectDescription(projectDescription);
        return this;
    }

    /**
     * <p>
     * The product ID and provisioning artifact ID to provision a service catalog. For information, see <a
     * href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html">What is AWS Service
     * Catalog</a>.
     * </p>
     * 
     * @param serviceCatalogProvisioningDetails
     *        The product ID and provisioning artifact ID to provision a service catalog. For information, see <a
     *        href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html">What is AWS Service
     *        Catalog</a>.
     */

    public void setServiceCatalogProvisioningDetails(ServiceCatalogProvisioningDetails serviceCatalogProvisioningDetails) {
        this.serviceCatalogProvisioningDetails = serviceCatalogProvisioningDetails;
    }

    /**
     * <p>
     * The product ID and provisioning artifact ID to provision a service catalog. For information, see <a
     * href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html">What is AWS Service
     * Catalog</a>.
     * </p>
     * 
     * @return The product ID and provisioning artifact ID to provision a service catalog. For information, see <a
     *         href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html">What is AWS Service
     *         Catalog</a>.
     */

    public ServiceCatalogProvisioningDetails getServiceCatalogProvisioningDetails() {
        return this.serviceCatalogProvisioningDetails;
    }

    /**
     * <p>
     * The product ID and provisioning artifact ID to provision a service catalog. For information, see <a
     * href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html">What is AWS Service
     * Catalog</a>.
     * </p>
     * 
     * @param serviceCatalogProvisioningDetails
     *        The product ID and provisioning artifact ID to provision a service catalog. For information, see <a
     *        href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html">What is AWS Service
     *        Catalog</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withServiceCatalogProvisioningDetails(ServiceCatalogProvisioningDetails serviceCatalogProvisioningDetails) {
        setServiceCatalogProvisioningDetails(serviceCatalogProvisioningDetails);
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs that you want to use to organize and track your AWS resource costs. For more
     * information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS
     * resources</a> in the <i>AWS General Reference Guide</i>.
     * </p>
     * 
     * @return An array of key-value pairs that you want to use to organize and track your AWS resource costs. For more
     *         information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS
     *         resources</a> in the <i>AWS General Reference Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of key-value pairs that you want to use to organize and track your AWS resource costs. For more
     * information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS
     * resources</a> in the <i>AWS General Reference Guide</i>.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs that you want to use to organize and track your AWS resource costs. For more
     *        information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS
     *        resources</a> in the <i>AWS General Reference Guide</i>.
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
     * An array of key-value pairs that you want to use to organize and track your AWS resource costs. For more
     * information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS
     * resources</a> in the <i>AWS General Reference Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs that you want to use to organize and track your AWS resource costs. For more
     *        information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS
     *        resources</a> in the <i>AWS General Reference Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withTags(Tag... tags) {
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
     * An array of key-value pairs that you want to use to organize and track your AWS resource costs. For more
     * information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS
     * resources</a> in the <i>AWS General Reference Guide</i>.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs that you want to use to organize and track your AWS resource costs. For more
     *        information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS
     *        resources</a> in the <i>AWS General Reference Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getProjectDescription() != null)
            sb.append("ProjectDescription: ").append(getProjectDescription()).append(",");
        if (getServiceCatalogProvisioningDetails() != null)
            sb.append("ServiceCatalogProvisioningDetails: ").append(getServiceCatalogProvisioningDetails()).append(",");
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

        if (obj instanceof CreateProjectRequest == false)
            return false;
        CreateProjectRequest other = (CreateProjectRequest) obj;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
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

        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getProjectDescription() == null) ? 0 : getProjectDescription().hashCode());
        hashCode = prime * hashCode + ((getServiceCatalogProvisioningDetails() == null) ? 0 : getServiceCatalogProvisioningDetails().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateProjectRequest clone() {
        return (CreateProjectRequest) super.clone();
    }

}
