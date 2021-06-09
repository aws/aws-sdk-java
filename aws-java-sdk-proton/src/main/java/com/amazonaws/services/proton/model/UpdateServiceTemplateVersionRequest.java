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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateServiceTemplateVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServiceTemplateVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of compatible environment names for a service template major or minor version to update.
     * </p>
     */
    private java.util.List<CompatibleEnvironmentTemplateInput> compatibleEnvironmentTemplates;
    /**
     * <p>
     * A description of a service template version to update.
     * </p>
     */
    private String description;
    /**
     * <p>
     * To update a major version of a service template, include <code>majorVersion</code>.
     * </p>
     */
    private String majorVersion;
    /**
     * <p>
     * To update a minor version of a service template, include <code>minorVersion</code>.
     * </p>
     */
    private String minorVersion;
    /**
     * <p>
     * The status of the service template minor version to update.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The name of the service template.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * An array of compatible environment names for a service template major or minor version to update.
     * </p>
     * 
     * @return An array of compatible environment names for a service template major or minor version to update.
     */

    public java.util.List<CompatibleEnvironmentTemplateInput> getCompatibleEnvironmentTemplates() {
        return compatibleEnvironmentTemplates;
    }

    /**
     * <p>
     * An array of compatible environment names for a service template major or minor version to update.
     * </p>
     * 
     * @param compatibleEnvironmentTemplates
     *        An array of compatible environment names for a service template major or minor version to update.
     */

    public void setCompatibleEnvironmentTemplates(java.util.Collection<CompatibleEnvironmentTemplateInput> compatibleEnvironmentTemplates) {
        if (compatibleEnvironmentTemplates == null) {
            this.compatibleEnvironmentTemplates = null;
            return;
        }

        this.compatibleEnvironmentTemplates = new java.util.ArrayList<CompatibleEnvironmentTemplateInput>(compatibleEnvironmentTemplates);
    }

    /**
     * <p>
     * An array of compatible environment names for a service template major or minor version to update.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCompatibleEnvironmentTemplates(java.util.Collection)} or
     * {@link #withCompatibleEnvironmentTemplates(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param compatibleEnvironmentTemplates
     *        An array of compatible environment names for a service template major or minor version to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceTemplateVersionRequest withCompatibleEnvironmentTemplates(CompatibleEnvironmentTemplateInput... compatibleEnvironmentTemplates) {
        if (this.compatibleEnvironmentTemplates == null) {
            setCompatibleEnvironmentTemplates(new java.util.ArrayList<CompatibleEnvironmentTemplateInput>(compatibleEnvironmentTemplates.length));
        }
        for (CompatibleEnvironmentTemplateInput ele : compatibleEnvironmentTemplates) {
            this.compatibleEnvironmentTemplates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of compatible environment names for a service template major or minor version to update.
     * </p>
     * 
     * @param compatibleEnvironmentTemplates
     *        An array of compatible environment names for a service template major or minor version to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceTemplateVersionRequest withCompatibleEnvironmentTemplates(
            java.util.Collection<CompatibleEnvironmentTemplateInput> compatibleEnvironmentTemplates) {
        setCompatibleEnvironmentTemplates(compatibleEnvironmentTemplates);
        return this;
    }

    /**
     * <p>
     * A description of a service template version to update.
     * </p>
     * 
     * @param description
     *        A description of a service template version to update.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of a service template version to update.
     * </p>
     * 
     * @return A description of a service template version to update.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of a service template version to update.
     * </p>
     * 
     * @param description
     *        A description of a service template version to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceTemplateVersionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * To update a major version of a service template, include <code>majorVersion</code>.
     * </p>
     * 
     * @param majorVersion
     *        To update a major version of a service template, include <code>majorVersion</code>.
     */

    public void setMajorVersion(String majorVersion) {
        this.majorVersion = majorVersion;
    }

    /**
     * <p>
     * To update a major version of a service template, include <code>majorVersion</code>.
     * </p>
     * 
     * @return To update a major version of a service template, include <code>majorVersion</code>.
     */

    public String getMajorVersion() {
        return this.majorVersion;
    }

    /**
     * <p>
     * To update a major version of a service template, include <code>majorVersion</code>.
     * </p>
     * 
     * @param majorVersion
     *        To update a major version of a service template, include <code>majorVersion</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceTemplateVersionRequest withMajorVersion(String majorVersion) {
        setMajorVersion(majorVersion);
        return this;
    }

    /**
     * <p>
     * To update a minor version of a service template, include <code>minorVersion</code>.
     * </p>
     * 
     * @param minorVersion
     *        To update a minor version of a service template, include <code>minorVersion</code>.
     */

    public void setMinorVersion(String minorVersion) {
        this.minorVersion = minorVersion;
    }

    /**
     * <p>
     * To update a minor version of a service template, include <code>minorVersion</code>.
     * </p>
     * 
     * @return To update a minor version of a service template, include <code>minorVersion</code>.
     */

    public String getMinorVersion() {
        return this.minorVersion;
    }

    /**
     * <p>
     * To update a minor version of a service template, include <code>minorVersion</code>.
     * </p>
     * 
     * @param minorVersion
     *        To update a minor version of a service template, include <code>minorVersion</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceTemplateVersionRequest withMinorVersion(String minorVersion) {
        setMinorVersion(minorVersion);
        return this;
    }

    /**
     * <p>
     * The status of the service template minor version to update.
     * </p>
     * 
     * @param status
     *        The status of the service template minor version to update.
     * @see TemplateVersionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the service template minor version to update.
     * </p>
     * 
     * @return The status of the service template minor version to update.
     * @see TemplateVersionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the service template minor version to update.
     * </p>
     * 
     * @param status
     *        The status of the service template minor version to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateVersionStatus
     */

    public UpdateServiceTemplateVersionRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the service template minor version to update.
     * </p>
     * 
     * @param status
     *        The status of the service template minor version to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateVersionStatus
     */

    public UpdateServiceTemplateVersionRequest withStatus(TemplateVersionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The name of the service template.
     * </p>
     * 
     * @param templateName
     *        The name of the service template.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the service template.
     * </p>
     * 
     * @return The name of the service template.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the service template.
     * </p>
     * 
     * @param templateName
     *        The name of the service template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceTemplateVersionRequest withTemplateName(String templateName) {
        setTemplateName(templateName);
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
        if (getCompatibleEnvironmentTemplates() != null)
            sb.append("CompatibleEnvironmentTemplates: ").append(getCompatibleEnvironmentTemplates()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getMajorVersion() != null)
            sb.append("MajorVersion: ").append(getMajorVersion()).append(",");
        if (getMinorVersion() != null)
            sb.append("MinorVersion: ").append(getMinorVersion()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServiceTemplateVersionRequest == false)
            return false;
        UpdateServiceTemplateVersionRequest other = (UpdateServiceTemplateVersionRequest) obj;
        if (other.getCompatibleEnvironmentTemplates() == null ^ this.getCompatibleEnvironmentTemplates() == null)
            return false;
        if (other.getCompatibleEnvironmentTemplates() != null
                && other.getCompatibleEnvironmentTemplates().equals(this.getCompatibleEnvironmentTemplates()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getMajorVersion() == null ^ this.getMajorVersion() == null)
            return false;
        if (other.getMajorVersion() != null && other.getMajorVersion().equals(this.getMajorVersion()) == false)
            return false;
        if (other.getMinorVersion() == null ^ this.getMinorVersion() == null)
            return false;
        if (other.getMinorVersion() != null && other.getMinorVersion().equals(this.getMinorVersion()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompatibleEnvironmentTemplates() == null) ? 0 : getCompatibleEnvironmentTemplates().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getMajorVersion() == null) ? 0 : getMajorVersion().hashCode());
        hashCode = prime * hashCode + ((getMinorVersion() == null) ? 0 : getMinorVersion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateServiceTemplateVersionRequest clone() {
        return (UpdateServiceTemplateVersionRequest) super.clone();
    }

}
