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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains information about the managed template.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedJobTemplateSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a managed template.
     * </p>
     */
    private String templateArn;
    /**
     * <p>
     * The unique Name for a managed template.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * The description for a managed template.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of environments that are supported with the managed job template.
     * </p>
     */
    private java.util.List<String> environments;
    /**
     * <p>
     * The version for a managed template.
     * </p>
     */
    private String templateVersion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a managed template.
     * </p>
     * 
     * @param templateArn
     *        The Amazon Resource Name (ARN) for a managed template.
     */

    public void setTemplateArn(String templateArn) {
        this.templateArn = templateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a managed template.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for a managed template.
     */

    public String getTemplateArn() {
        return this.templateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a managed template.
     * </p>
     * 
     * @param templateArn
     *        The Amazon Resource Name (ARN) for a managed template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedJobTemplateSummary withTemplateArn(String templateArn) {
        setTemplateArn(templateArn);
        return this;
    }

    /**
     * <p>
     * The unique Name for a managed template.
     * </p>
     * 
     * @param templateName
     *        The unique Name for a managed template.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The unique Name for a managed template.
     * </p>
     * 
     * @return The unique Name for a managed template.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The unique Name for a managed template.
     * </p>
     * 
     * @param templateName
     *        The unique Name for a managed template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedJobTemplateSummary withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * The description for a managed template.
     * </p>
     * 
     * @param description
     *        The description for a managed template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for a managed template.
     * </p>
     * 
     * @return The description for a managed template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for a managed template.
     * </p>
     * 
     * @param description
     *        The description for a managed template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedJobTemplateSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of environments that are supported with the managed job template.
     * </p>
     * 
     * @return A list of environments that are supported with the managed job template.
     */

    public java.util.List<String> getEnvironments() {
        return environments;
    }

    /**
     * <p>
     * A list of environments that are supported with the managed job template.
     * </p>
     * 
     * @param environments
     *        A list of environments that are supported with the managed job template.
     */

    public void setEnvironments(java.util.Collection<String> environments) {
        if (environments == null) {
            this.environments = null;
            return;
        }

        this.environments = new java.util.ArrayList<String>(environments);
    }

    /**
     * <p>
     * A list of environments that are supported with the managed job template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironments(java.util.Collection)} or {@link #withEnvironments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param environments
     *        A list of environments that are supported with the managed job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedJobTemplateSummary withEnvironments(String... environments) {
        if (this.environments == null) {
            setEnvironments(new java.util.ArrayList<String>(environments.length));
        }
        for (String ele : environments) {
            this.environments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of environments that are supported with the managed job template.
     * </p>
     * 
     * @param environments
     *        A list of environments that are supported with the managed job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedJobTemplateSummary withEnvironments(java.util.Collection<String> environments) {
        setEnvironments(environments);
        return this;
    }

    /**
     * <p>
     * The version for a managed template.
     * </p>
     * 
     * @param templateVersion
     *        The version for a managed template.
     */

    public void setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
    }

    /**
     * <p>
     * The version for a managed template.
     * </p>
     * 
     * @return The version for a managed template.
     */

    public String getTemplateVersion() {
        return this.templateVersion;
    }

    /**
     * <p>
     * The version for a managed template.
     * </p>
     * 
     * @param templateVersion
     *        The version for a managed template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedJobTemplateSummary withTemplateVersion(String templateVersion) {
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
        if (getTemplateArn() != null)
            sb.append("TemplateArn: ").append(getTemplateArn()).append(",");
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEnvironments() != null)
            sb.append("Environments: ").append(getEnvironments()).append(",");
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

        if (obj instanceof ManagedJobTemplateSummary == false)
            return false;
        ManagedJobTemplateSummary other = (ManagedJobTemplateSummary) obj;
        if (other.getTemplateArn() == null ^ this.getTemplateArn() == null)
            return false;
        if (other.getTemplateArn() != null && other.getTemplateArn().equals(this.getTemplateArn()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEnvironments() == null ^ this.getEnvironments() == null)
            return false;
        if (other.getEnvironments() != null && other.getEnvironments().equals(this.getEnvironments()) == false)
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

        hashCode = prime * hashCode + ((getTemplateArn() == null) ? 0 : getTemplateArn().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEnvironments() == null) ? 0 : getEnvironments().hashCode());
        hashCode = prime * hashCode + ((getTemplateVersion() == null) ? 0 : getTemplateVersion().hashCode());
        return hashCode;
    }

    @Override
    public ManagedJobTemplateSummary clone() {
        try {
            return (ManagedJobTemplateSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.ManagedJobTemplateSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
