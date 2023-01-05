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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetApplicationVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetApplicationVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The specific version of the application.
     * </p>
     */
    private Integer applicationVersion;
    /**
     * <p>
     * The timestamp when the application version was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The content of the application definition. This is a JSON object that contains the resource configuration and
     * definitions that identify an application.
     * </p>
     */
    private String definitionContent;
    /**
     * <p>
     * The application description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the application version.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the application version.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The reason for the reported status.
     * </p>
     */
    private String statusReason;

    /**
     * <p>
     * The specific version of the application.
     * </p>
     * 
     * @param applicationVersion
     *        The specific version of the application.
     */

    public void setApplicationVersion(Integer applicationVersion) {
        this.applicationVersion = applicationVersion;
    }

    /**
     * <p>
     * The specific version of the application.
     * </p>
     * 
     * @return The specific version of the application.
     */

    public Integer getApplicationVersion() {
        return this.applicationVersion;
    }

    /**
     * <p>
     * The specific version of the application.
     * </p>
     * 
     * @param applicationVersion
     *        The specific version of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationVersionResult withApplicationVersion(Integer applicationVersion) {
        setApplicationVersion(applicationVersion);
        return this;
    }

    /**
     * <p>
     * The timestamp when the application version was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp when the application version was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp when the application version was created.
     * </p>
     * 
     * @return The timestamp when the application version was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The timestamp when the application version was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp when the application version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationVersionResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The content of the application definition. This is a JSON object that contains the resource configuration and
     * definitions that identify an application.
     * </p>
     * 
     * @param definitionContent
     *        The content of the application definition. This is a JSON object that contains the resource configuration
     *        and definitions that identify an application.
     */

    public void setDefinitionContent(String definitionContent) {
        this.definitionContent = definitionContent;
    }

    /**
     * <p>
     * The content of the application definition. This is a JSON object that contains the resource configuration and
     * definitions that identify an application.
     * </p>
     * 
     * @return The content of the application definition. This is a JSON object that contains the resource configuration
     *         and definitions that identify an application.
     */

    public String getDefinitionContent() {
        return this.definitionContent;
    }

    /**
     * <p>
     * The content of the application definition. This is a JSON object that contains the resource configuration and
     * definitions that identify an application.
     * </p>
     * 
     * @param definitionContent
     *        The content of the application definition. This is a JSON object that contains the resource configuration
     *        and definitions that identify an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationVersionResult withDefinitionContent(String definitionContent) {
        setDefinitionContent(definitionContent);
        return this;
    }

    /**
     * <p>
     * The application description.
     * </p>
     * 
     * @param description
     *        The application description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The application description.
     * </p>
     * 
     * @return The application description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The application description.
     * </p>
     * 
     * @param description
     *        The application description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationVersionResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the application version.
     * </p>
     * 
     * @param name
     *        The name of the application version.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the application version.
     * </p>
     * 
     * @return The name of the application version.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the application version.
     * </p>
     * 
     * @param name
     *        The name of the application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationVersionResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the application version.
     * </p>
     * 
     * @param status
     *        The status of the application version.
     * @see ApplicationVersionLifecycle
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the application version.
     * </p>
     * 
     * @return The status of the application version.
     * @see ApplicationVersionLifecycle
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the application version.
     * </p>
     * 
     * @param status
     *        The status of the application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationVersionLifecycle
     */

    public GetApplicationVersionResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the application version.
     * </p>
     * 
     * @param status
     *        The status of the application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationVersionLifecycle
     */

    public GetApplicationVersionResult withStatus(ApplicationVersionLifecycle status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the reported status.
     * </p>
     * 
     * @param statusReason
     *        The reason for the reported status.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason for the reported status.
     * </p>
     * 
     * @return The reason for the reported status.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The reason for the reported status.
     * </p>
     * 
     * @param statusReason
     *        The reason for the reported status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationVersionResult withStatusReason(String statusReason) {
        setStatusReason(statusReason);
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
        if (getApplicationVersion() != null)
            sb.append("ApplicationVersion: ").append(getApplicationVersion()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDefinitionContent() != null)
            sb.append("DefinitionContent: ").append(getDefinitionContent()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetApplicationVersionResult == false)
            return false;
        GetApplicationVersionResult other = (GetApplicationVersionResult) obj;
        if (other.getApplicationVersion() == null ^ this.getApplicationVersion() == null)
            return false;
        if (other.getApplicationVersion() != null && other.getApplicationVersion().equals(this.getApplicationVersion()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDefinitionContent() == null ^ this.getDefinitionContent() == null)
            return false;
        if (other.getDefinitionContent() != null && other.getDefinitionContent().equals(this.getDefinitionContent()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationVersion() == null) ? 0 : getApplicationVersion().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDefinitionContent() == null) ? 0 : getDefinitionContent().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        return hashCode;
    }

    @Override
    public GetApplicationVersionResult clone() {
        try {
            return (GetApplicationVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
