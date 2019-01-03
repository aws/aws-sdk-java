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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/CreateProject" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the project to create.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * An optional description for the project.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The schema defining the placement to be created. A placement template defines placement default attributes and
     * device templates. You cannot add or remove device templates after the project has been created. However, you can
     * update <code>callbackOverrides</code> for the device templates using the <code>UpdateProject</code> API.
     * </p>
     */
    private PlacementTemplate placementTemplate;

    /**
     * <p>
     * The name of the project to create.
     * </p>
     * 
     * @param projectName
     *        The name of the project to create.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the project to create.
     * </p>
     * 
     * @return The name of the project to create.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the project to create.
     * </p>
     * 
     * @param projectName
     *        The name of the project to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * An optional description for the project.
     * </p>
     * 
     * @param description
     *        An optional description for the project.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description for the project.
     * </p>
     * 
     * @return An optional description for the project.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description for the project.
     * </p>
     * 
     * @param description
     *        An optional description for the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The schema defining the placement to be created. A placement template defines placement default attributes and
     * device templates. You cannot add or remove device templates after the project has been created. However, you can
     * update <code>callbackOverrides</code> for the device templates using the <code>UpdateProject</code> API.
     * </p>
     * 
     * @param placementTemplate
     *        The schema defining the placement to be created. A placement template defines placement default attributes
     *        and device templates. You cannot add or remove device templates after the project has been created.
     *        However, you can update <code>callbackOverrides</code> for the device templates using the
     *        <code>UpdateProject</code> API.
     */

    public void setPlacementTemplate(PlacementTemplate placementTemplate) {
        this.placementTemplate = placementTemplate;
    }

    /**
     * <p>
     * The schema defining the placement to be created. A placement template defines placement default attributes and
     * device templates. You cannot add or remove device templates after the project has been created. However, you can
     * update <code>callbackOverrides</code> for the device templates using the <code>UpdateProject</code> API.
     * </p>
     * 
     * @return The schema defining the placement to be created. A placement template defines placement default
     *         attributes and device templates. You cannot add or remove device templates after the project has been
     *         created. However, you can update <code>callbackOverrides</code> for the device templates using the
     *         <code>UpdateProject</code> API.
     */

    public PlacementTemplate getPlacementTemplate() {
        return this.placementTemplate;
    }

    /**
     * <p>
     * The schema defining the placement to be created. A placement template defines placement default attributes and
     * device templates. You cannot add or remove device templates after the project has been created. However, you can
     * update <code>callbackOverrides</code> for the device templates using the <code>UpdateProject</code> API.
     * </p>
     * 
     * @param placementTemplate
     *        The schema defining the placement to be created. A placement template defines placement default attributes
     *        and device templates. You cannot add or remove device templates after the project has been created.
     *        However, you can update <code>callbackOverrides</code> for the device templates using the
     *        <code>UpdateProject</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withPlacementTemplate(PlacementTemplate placementTemplate) {
        setPlacementTemplate(placementTemplate);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPlacementTemplate() != null)
            sb.append("PlacementTemplate: ").append(getPlacementTemplate());
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
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPlacementTemplate() == null ^ this.getPlacementTemplate() == null)
            return false;
        if (other.getPlacementTemplate() != null && other.getPlacementTemplate().equals(this.getPlacementTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPlacementTemplate() == null) ? 0 : getPlacementTemplate().hashCode());
        return hashCode;
    }

    @Override
    public CreateProjectRequest clone() {
        return (CreateProjectRequest) super.clone();
    }

}
