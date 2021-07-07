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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the portal in which to create the project.
     * </p>
     */
    private String portalId;
    /**
     * <p>
     * A friendly name for the project.
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
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A list of key-value pairs that contain metadata for the project. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT SiteWise
     * resources</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ID of the portal in which to create the project.
     * </p>
     * 
     * @param portalId
     *        The ID of the portal in which to create the project.
     */

    public void setPortalId(String portalId) {
        this.portalId = portalId;
    }

    /**
     * <p>
     * The ID of the portal in which to create the project.
     * </p>
     * 
     * @return The ID of the portal in which to create the project.
     */

    public String getPortalId() {
        return this.portalId;
    }

    /**
     * <p>
     * The ID of the portal in which to create the project.
     * </p>
     * 
     * @param portalId
     *        The ID of the portal in which to create the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withPortalId(String portalId) {
        setPortalId(portalId);
        return this;
    }

    /**
     * <p>
     * A friendly name for the project.
     * </p>
     * 
     * @param projectName
     *        A friendly name for the project.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * A friendly name for the project.
     * </p>
     * 
     * @return A friendly name for the project.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * A friendly name for the project.
     * </p>
     * 
     * @param projectName
     *        A friendly name for the project.
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

    public CreateProjectRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the project. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT SiteWise
     * resources</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return A list of key-value pairs that contain metadata for the project. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT
     *         SiteWise resources</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the project. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT SiteWise
     * resources</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that contain metadata for the project. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT
     *        SiteWise resources</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the project. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT SiteWise
     * resources</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that contain metadata for the project. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT
     *        SiteWise resources</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateProjectRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest addTagsEntry(String key, String value) {
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

    public CreateProjectRequest clearTagsEntries() {
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
        if (getPortalId() != null)
            sb.append("PortalId: ").append(getPortalId()).append(",");
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getProjectDescription() != null)
            sb.append("ProjectDescription: ").append(getProjectDescription()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
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
        if (other.getPortalId() == null ^ this.getPortalId() == null)
            return false;
        if (other.getPortalId() != null && other.getPortalId().equals(this.getPortalId()) == false)
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

        hashCode = prime * hashCode + ((getPortalId() == null) ? 0 : getPortalId().hashCode());
        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getProjectDescription() == null) ? 0 : getProjectDescription().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateProjectRequest clone() {
        return (CreateProjectRequest) super.clone();
    }

}
