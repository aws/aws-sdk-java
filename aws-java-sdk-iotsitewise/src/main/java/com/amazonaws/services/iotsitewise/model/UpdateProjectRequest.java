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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the project to update.
     * </p>
     */
    private String projectId;
    /**
     * <p>
     * A new friendly name for the project.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * A new description for the project.
     * </p>
     */
    private String projectDescription;
    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of the project to update.
     * </p>
     * 
     * @param projectId
     *        The ID of the project to update.
     */

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * <p>
     * The ID of the project to update.
     * </p>
     * 
     * @return The ID of the project to update.
     */

    public String getProjectId() {
        return this.projectId;
    }

    /**
     * <p>
     * The ID of the project to update.
     * </p>
     * 
     * @param projectId
     *        The ID of the project to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectRequest withProjectId(String projectId) {
        setProjectId(projectId);
        return this;
    }

    /**
     * <p>
     * A new friendly name for the project.
     * </p>
     * 
     * @param projectName
     *        A new friendly name for the project.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * A new friendly name for the project.
     * </p>
     * 
     * @return A new friendly name for the project.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * A new friendly name for the project.
     * </p>
     * 
     * @param projectName
     *        A new friendly name for the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectRequest withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * A new description for the project.
     * </p>
     * 
     * @param projectDescription
     *        A new description for the project.
     */

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    /**
     * <p>
     * A new description for the project.
     * </p>
     * 
     * @return A new description for the project.
     */

    public String getProjectDescription() {
        return this.projectDescription;
    }

    /**
     * <p>
     * A new description for the project.
     * </p>
     * 
     * @param projectDescription
     *        A new description for the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectRequest withProjectDescription(String projectDescription) {
        setProjectDescription(projectDescription);
        return this;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @param clientToken
     *        A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *        reuse this client token if a new idempotent request is required.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @return A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *         reuse this client token if a new idempotent request is required.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @param clientToken
     *        A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *        reuse this client token if a new idempotent request is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId()).append(",");
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getProjectDescription() != null)
            sb.append("ProjectDescription: ").append(getProjectDescription()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
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
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null && other.getProjectId().equals(this.getProjectId()) == false)
            return false;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getProjectDescription() == null ^ this.getProjectDescription() == null)
            return false;
        if (other.getProjectDescription() != null && other.getProjectDescription().equals(this.getProjectDescription()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getProjectDescription() == null) ? 0 : getProjectDescription().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProjectRequest clone() {
        return (UpdateProjectRequest) super.clone();
    }

}
