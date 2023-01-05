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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetTemplateSyncStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTemplateSyncStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The template name.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * The template type.
     * </p>
     */
    private String templateType;
    /**
     * <p>
     * The template major version.
     * </p>
     */
    private String templateVersion;

    /**
     * <p>
     * The template name.
     * </p>
     * 
     * @param templateName
     *        The template name.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The template name.
     * </p>
     * 
     * @return The template name.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The template name.
     * </p>
     * 
     * @param templateName
     *        The template name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateSyncStatusRequest withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * The template type.
     * </p>
     * 
     * @param templateType
     *        The template type.
     * @see TemplateType
     */

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    /**
     * <p>
     * The template type.
     * </p>
     * 
     * @return The template type.
     * @see TemplateType
     */

    public String getTemplateType() {
        return this.templateType;
    }

    /**
     * <p>
     * The template type.
     * </p>
     * 
     * @param templateType
     *        The template type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateType
     */

    public GetTemplateSyncStatusRequest withTemplateType(String templateType) {
        setTemplateType(templateType);
        return this;
    }

    /**
     * <p>
     * The template type.
     * </p>
     * 
     * @param templateType
     *        The template type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateType
     */

    public GetTemplateSyncStatusRequest withTemplateType(TemplateType templateType) {
        this.templateType = templateType.toString();
        return this;
    }

    /**
     * <p>
     * The template major version.
     * </p>
     * 
     * @param templateVersion
     *        The template major version.
     */

    public void setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
    }

    /**
     * <p>
     * The template major version.
     * </p>
     * 
     * @return The template major version.
     */

    public String getTemplateVersion() {
        return this.templateVersion;
    }

    /**
     * <p>
     * The template major version.
     * </p>
     * 
     * @param templateVersion
     *        The template major version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateSyncStatusRequest withTemplateVersion(String templateVersion) {
        setTemplateVersion(templateVersion);
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
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getTemplateType() != null)
            sb.append("TemplateType: ").append(getTemplateType()).append(",");
        if (getTemplateVersion() != null)
            sb.append("TemplateVersion: ").append(getTemplateVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTemplateSyncStatusRequest == false)
            return false;
        GetTemplateSyncStatusRequest other = (GetTemplateSyncStatusRequest) obj;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getTemplateType() == null ^ this.getTemplateType() == null)
            return false;
        if (other.getTemplateType() != null && other.getTemplateType().equals(this.getTemplateType()) == false)
            return false;
        if (other.getTemplateVersion() == null ^ this.getTemplateVersion() == null)
            return false;
        if (other.getTemplateVersion() != null && other.getTemplateVersion().equals(this.getTemplateVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getTemplateType() == null) ? 0 : getTemplateType().hashCode());
        hashCode = prime * hashCode + ((getTemplateVersion() == null) ? 0 : getTemplateVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetTemplateSyncStatusRequest clone() {
        return (GetTemplateSyncStatusRequest) super.clone();
    }

}
