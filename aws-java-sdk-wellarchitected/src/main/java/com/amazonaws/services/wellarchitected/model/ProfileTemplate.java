/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The profile template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ProfileTemplate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProfileTemplate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the profile template.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * Profile template questions.
     * </p>
     */
    private java.util.List<ProfileTemplateQuestion> templateQuestions;

    private java.util.Date createdAt;

    private java.util.Date updatedAt;

    /**
     * <p>
     * The name of the profile template.
     * </p>
     * 
     * @param templateName
     *        The name of the profile template.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the profile template.
     * </p>
     * 
     * @return The name of the profile template.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the profile template.
     * </p>
     * 
     * @param templateName
     *        The name of the profile template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileTemplate withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * Profile template questions.
     * </p>
     * 
     * @return Profile template questions.
     */

    public java.util.List<ProfileTemplateQuestion> getTemplateQuestions() {
        return templateQuestions;
    }

    /**
     * <p>
     * Profile template questions.
     * </p>
     * 
     * @param templateQuestions
     *        Profile template questions.
     */

    public void setTemplateQuestions(java.util.Collection<ProfileTemplateQuestion> templateQuestions) {
        if (templateQuestions == null) {
            this.templateQuestions = null;
            return;
        }

        this.templateQuestions = new java.util.ArrayList<ProfileTemplateQuestion>(templateQuestions);
    }

    /**
     * <p>
     * Profile template questions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTemplateQuestions(java.util.Collection)} or {@link #withTemplateQuestions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param templateQuestions
     *        Profile template questions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileTemplate withTemplateQuestions(ProfileTemplateQuestion... templateQuestions) {
        if (this.templateQuestions == null) {
            setTemplateQuestions(new java.util.ArrayList<ProfileTemplateQuestion>(templateQuestions.length));
        }
        for (ProfileTemplateQuestion ele : templateQuestions) {
            this.templateQuestions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Profile template questions.
     * </p>
     * 
     * @param templateQuestions
     *        Profile template questions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileTemplate withTemplateQuestions(java.util.Collection<ProfileTemplateQuestion> templateQuestions) {
        setTemplateQuestions(templateQuestions);
        return this;
    }

    /**
     * @param createdAt
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @param createdAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileTemplate withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * @param updatedAt
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @param updatedAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileTemplate withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getTemplateQuestions() != null)
            sb.append("TemplateQuestions: ").append(getTemplateQuestions()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProfileTemplate == false)
            return false;
        ProfileTemplate other = (ProfileTemplate) obj;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getTemplateQuestions() == null ^ this.getTemplateQuestions() == null)
            return false;
        if (other.getTemplateQuestions() != null && other.getTemplateQuestions().equals(this.getTemplateQuestions()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getTemplateQuestions() == null) ? 0 : getTemplateQuestions().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public ProfileTemplate clone() {
        try {
            return (ProfileTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.ProfileTemplateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
