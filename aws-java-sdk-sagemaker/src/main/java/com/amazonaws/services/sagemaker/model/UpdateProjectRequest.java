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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the project.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * The description for the project.
     * </p>
     */
    private String projectDescription;
    /**
     * <p>
     * The product ID and provisioning artifact ID to provision a service catalog. The provisioning artifact ID will
     * default to the latest provisioning artifact ID of the product, if you don't provide the provisioning artifact ID.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html">What is Amazon Web Services
     * Service Catalog</a>.
     * </p>
     */
    private ServiceCatalogProvisioningUpdateDetails serviceCatalogProvisioningUpdateDetails;
    /**
     * <p>
     * An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in different ways,
     * for example, by purpose, owner, or environment. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services Resources</a>.
     * In addition, the project must have tag update constraints set in order to include this parameter in the request.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/constraints-resourceupdate.html">Amazon Web
     * Services Service Catalog Tag Update Constraints</a>.
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

    public UpdateProjectRequest withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * The description for the project.
     * </p>
     * 
     * @param projectDescription
     *        The description for the project.
     */

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    /**
     * <p>
     * The description for the project.
     * </p>
     * 
     * @return The description for the project.
     */

    public String getProjectDescription() {
        return this.projectDescription;
    }

    /**
     * <p>
     * The description for the project.
     * </p>
     * 
     * @param projectDescription
     *        The description for the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectRequest withProjectDescription(String projectDescription) {
        setProjectDescription(projectDescription);
        return this;
    }

    /**
     * <p>
     * The product ID and provisioning artifact ID to provision a service catalog. The provisioning artifact ID will
     * default to the latest provisioning artifact ID of the product, if you don't provide the provisioning artifact ID.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html">What is Amazon Web Services
     * Service Catalog</a>.
     * </p>
     * 
     * @param serviceCatalogProvisioningUpdateDetails
     *        The product ID and provisioning artifact ID to provision a service catalog. The provisioning artifact ID
     *        will default to the latest provisioning artifact ID of the product, if you don't provide the provisioning
     *        artifact ID. For more information, see <a
     *        href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html">What is Amazon Web
     *        Services Service Catalog</a>.
     */

    public void setServiceCatalogProvisioningUpdateDetails(ServiceCatalogProvisioningUpdateDetails serviceCatalogProvisioningUpdateDetails) {
        this.serviceCatalogProvisioningUpdateDetails = serviceCatalogProvisioningUpdateDetails;
    }

    /**
     * <p>
     * The product ID and provisioning artifact ID to provision a service catalog. The provisioning artifact ID will
     * default to the latest provisioning artifact ID of the product, if you don't provide the provisioning artifact ID.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html">What is Amazon Web Services
     * Service Catalog</a>.
     * </p>
     * 
     * @return The product ID and provisioning artifact ID to provision a service catalog. The provisioning artifact ID
     *         will default to the latest provisioning artifact ID of the product, if you don't provide the provisioning
     *         artifact ID. For more information, see <a
     *         href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html">What is Amazon Web
     *         Services Service Catalog</a>.
     */

    public ServiceCatalogProvisioningUpdateDetails getServiceCatalogProvisioningUpdateDetails() {
        return this.serviceCatalogProvisioningUpdateDetails;
    }

    /**
     * <p>
     * The product ID and provisioning artifact ID to provision a service catalog. The provisioning artifact ID will
     * default to the latest provisioning artifact ID of the product, if you don't provide the provisioning artifact ID.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html">What is Amazon Web Services
     * Service Catalog</a>.
     * </p>
     * 
     * @param serviceCatalogProvisioningUpdateDetails
     *        The product ID and provisioning artifact ID to provision a service catalog. The provisioning artifact ID
     *        will default to the latest provisioning artifact ID of the product, if you don't provide the provisioning
     *        artifact ID. For more information, see <a
     *        href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/introduction.html">What is Amazon Web
     *        Services Service Catalog</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectRequest withServiceCatalogProvisioningUpdateDetails(ServiceCatalogProvisioningUpdateDetails serviceCatalogProvisioningUpdateDetails) {
        setServiceCatalogProvisioningUpdateDetails(serviceCatalogProvisioningUpdateDetails);
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in different ways,
     * for example, by purpose, owner, or environment. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services Resources</a>.
     * In addition, the project must have tag update constraints set in order to include this parameter in the request.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/constraints-resourceupdate.html">Amazon Web
     * Services Service Catalog Tag Update Constraints</a>.
     * </p>
     * 
     * @return An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in
     *         different ways, for example, by purpose, owner, or environment. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *         Resources</a>. In addition, the project must have tag update constraints set in order to include this
     *         parameter in the request. For more information, see <a
     *         href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/constraints-resourceupdate.html"
     *         >Amazon Web Services Service Catalog Tag Update Constraints</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in different ways,
     * for example, by purpose, owner, or environment. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services Resources</a>.
     * In addition, the project must have tag update constraints set in order to include this parameter in the request.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/constraints-resourceupdate.html">Amazon Web
     * Services Service Catalog Tag Update Constraints</a>.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in
     *        different ways, for example, by purpose, owner, or environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        Resources</a>. In addition, the project must have tag update constraints set in order to include this
     *        parameter in the request. For more information, see <a
     *        href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/constraints-resourceupdate.html">Amazon
     *        Web Services Service Catalog Tag Update Constraints</a>.
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
     * In addition, the project must have tag update constraints set in order to include this parameter in the request.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/constraints-resourceupdate.html">Amazon Web
     * Services Service Catalog Tag Update Constraints</a>.
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
     *        Resources</a>. In addition, the project must have tag update constraints set in order to include this
     *        parameter in the request. For more information, see <a
     *        href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/constraints-resourceupdate.html">Amazon
     *        Web Services Service Catalog Tag Update Constraints</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectRequest withTags(Tag... tags) {
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
     * In addition, the project must have tag update constraints set in order to include this parameter in the request.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/constraints-resourceupdate.html">Amazon Web
     * Services Service Catalog Tag Update Constraints</a>.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in
     *        different ways, for example, by purpose, owner, or environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        Resources</a>. In addition, the project must have tag update constraints set in order to include this
     *        parameter in the request. For more information, see <a
     *        href="https://docs.aws.amazon.com/servicecatalog/latest/adminguide/constraints-resourceupdate.html">Amazon
     *        Web Services Service Catalog Tag Update Constraints</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getServiceCatalogProvisioningUpdateDetails() != null)
            sb.append("ServiceCatalogProvisioningUpdateDetails: ").append(getServiceCatalogProvisioningUpdateDetails()).append(",");
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

        if (obj instanceof UpdateProjectRequest == false)
            return false;
        UpdateProjectRequest other = (UpdateProjectRequest) obj;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getProjectDescription() == null ^ this.getProjectDescription() == null)
            return false;
        if (other.getProjectDescription() != null && other.getProjectDescription().equals(this.getProjectDescription()) == false)
            return false;
        if (other.getServiceCatalogProvisioningUpdateDetails() == null ^ this.getServiceCatalogProvisioningUpdateDetails() == null)
            return false;
        if (other.getServiceCatalogProvisioningUpdateDetails() != null
                && other.getServiceCatalogProvisioningUpdateDetails().equals(this.getServiceCatalogProvisioningUpdateDetails()) == false)
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
        hashCode = prime * hashCode + ((getServiceCatalogProvisioningUpdateDetails() == null) ? 0 : getServiceCatalogProvisioningUpdateDetails().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProjectRequest clone() {
        return (UpdateProjectRequest) super.clone();
    }

}
