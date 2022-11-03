/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeManagedJobTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of a managed template, such as <code>AWS-Reboot</code>.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the managed template.
     * </p>
     */
    private String templateArn;
    /**
     * <p>
     * The unique description of a managed template.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The version for a managed template.
     * </p>
     */
    private String templateVersion;
    /**
     * <p>
     * A list of environments that are supported with the managed job template.
     * </p>
     */
    private java.util.List<String> environments;
    /**
     * <p>
     * A map of key-value pairs that you can use as guidance to specify the inputs for creating a job from a managed
     * template.
     * </p>
     * <note>
     * <p>
     * <code>documentParameters</code> can only be used when creating jobs from Amazon Web Services managed templates.
     * This parameter can't be used with custom job templates or to create jobs from them.
     * </p>
     * </note>
     */
    private java.util.List<DocumentParameter> documentParameters;
    /**
     * <p>
     * The document schema for a managed job template.
     * </p>
     */
    private String document;

    /**
     * <p>
     * The unique name of a managed template, such as <code>AWS-Reboot</code>.
     * </p>
     * 
     * @param templateName
     *        The unique name of a managed template, such as <code>AWS-Reboot</code>.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The unique name of a managed template, such as <code>AWS-Reboot</code>.
     * </p>
     * 
     * @return The unique name of a managed template, such as <code>AWS-Reboot</code>.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The unique name of a managed template, such as <code>AWS-Reboot</code>.
     * </p>
     * 
     * @param templateName
     *        The unique name of a managed template, such as <code>AWS-Reboot</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeManagedJobTemplateResult withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the managed template.
     * </p>
     * 
     * @param templateArn
     *        The unique Amazon Resource Name (ARN) of the managed template.
     */

    public void setTemplateArn(String templateArn) {
        this.templateArn = templateArn;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the managed template.
     * </p>
     * 
     * @return The unique Amazon Resource Name (ARN) of the managed template.
     */

    public String getTemplateArn() {
        return this.templateArn;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the managed template.
     * </p>
     * 
     * @param templateArn
     *        The unique Amazon Resource Name (ARN) of the managed template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeManagedJobTemplateResult withTemplateArn(String templateArn) {
        setTemplateArn(templateArn);
        return this;
    }

    /**
     * <p>
     * The unique description of a managed template.
     * </p>
     * 
     * @param description
     *        The unique description of a managed template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The unique description of a managed template.
     * </p>
     * 
     * @return The unique description of a managed template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The unique description of a managed template.
     * </p>
     * 
     * @param description
     *        The unique description of a managed template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeManagedJobTemplateResult withDescription(String description) {
        setDescription(description);
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

    public DescribeManagedJobTemplateResult withTemplateVersion(String templateVersion) {
        setTemplateVersion(templateVersion);
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

    public DescribeManagedJobTemplateResult withEnvironments(String... environments) {
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

    public DescribeManagedJobTemplateResult withEnvironments(java.util.Collection<String> environments) {
        setEnvironments(environments);
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs that you can use as guidance to specify the inputs for creating a job from a managed
     * template.
     * </p>
     * <note>
     * <p>
     * <code>documentParameters</code> can only be used when creating jobs from Amazon Web Services managed templates.
     * This parameter can't be used with custom job templates or to create jobs from them.
     * </p>
     * </note>
     * 
     * @return A map of key-value pairs that you can use as guidance to specify the inputs for creating a job from a
     *         managed template.</p> <note>
     *         <p>
     *         <code>documentParameters</code> can only be used when creating jobs from Amazon Web Services managed
     *         templates. This parameter can't be used with custom job templates or to create jobs from them.
     *         </p>
     */

    public java.util.List<DocumentParameter> getDocumentParameters() {
        return documentParameters;
    }

    /**
     * <p>
     * A map of key-value pairs that you can use as guidance to specify the inputs for creating a job from a managed
     * template.
     * </p>
     * <note>
     * <p>
     * <code>documentParameters</code> can only be used when creating jobs from Amazon Web Services managed templates.
     * This parameter can't be used with custom job templates or to create jobs from them.
     * </p>
     * </note>
     * 
     * @param documentParameters
     *        A map of key-value pairs that you can use as guidance to specify the inputs for creating a job from a
     *        managed template.</p> <note>
     *        <p>
     *        <code>documentParameters</code> can only be used when creating jobs from Amazon Web Services managed
     *        templates. This parameter can't be used with custom job templates or to create jobs from them.
     *        </p>
     */

    public void setDocumentParameters(java.util.Collection<DocumentParameter> documentParameters) {
        if (documentParameters == null) {
            this.documentParameters = null;
            return;
        }

        this.documentParameters = new java.util.ArrayList<DocumentParameter>(documentParameters);
    }

    /**
     * <p>
     * A map of key-value pairs that you can use as guidance to specify the inputs for creating a job from a managed
     * template.
     * </p>
     * <note>
     * <p>
     * <code>documentParameters</code> can only be used when creating jobs from Amazon Web Services managed templates.
     * This parameter can't be used with custom job templates or to create jobs from them.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDocumentParameters(java.util.Collection)} or {@link #withDocumentParameters(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param documentParameters
     *        A map of key-value pairs that you can use as guidance to specify the inputs for creating a job from a
     *        managed template.</p> <note>
     *        <p>
     *        <code>documentParameters</code> can only be used when creating jobs from Amazon Web Services managed
     *        templates. This parameter can't be used with custom job templates or to create jobs from them.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeManagedJobTemplateResult withDocumentParameters(DocumentParameter... documentParameters) {
        if (this.documentParameters == null) {
            setDocumentParameters(new java.util.ArrayList<DocumentParameter>(documentParameters.length));
        }
        for (DocumentParameter ele : documentParameters) {
            this.documentParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs that you can use as guidance to specify the inputs for creating a job from a managed
     * template.
     * </p>
     * <note>
     * <p>
     * <code>documentParameters</code> can only be used when creating jobs from Amazon Web Services managed templates.
     * This parameter can't be used with custom job templates or to create jobs from them.
     * </p>
     * </note>
     * 
     * @param documentParameters
     *        A map of key-value pairs that you can use as guidance to specify the inputs for creating a job from a
     *        managed template.</p> <note>
     *        <p>
     *        <code>documentParameters</code> can only be used when creating jobs from Amazon Web Services managed
     *        templates. This parameter can't be used with custom job templates or to create jobs from them.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeManagedJobTemplateResult withDocumentParameters(java.util.Collection<DocumentParameter> documentParameters) {
        setDocumentParameters(documentParameters);
        return this;
    }

    /**
     * <p>
     * The document schema for a managed job template.
     * </p>
     * 
     * @param document
     *        The document schema for a managed job template.
     */

    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * <p>
     * The document schema for a managed job template.
     * </p>
     * 
     * @return The document schema for a managed job template.
     */

    public String getDocument() {
        return this.document;
    }

    /**
     * <p>
     * The document schema for a managed job template.
     * </p>
     * 
     * @param document
     *        The document schema for a managed job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeManagedJobTemplateResult withDocument(String document) {
        setDocument(document);
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
        if (getTemplateArn() != null)
            sb.append("TemplateArn: ").append(getTemplateArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTemplateVersion() != null)
            sb.append("TemplateVersion: ").append(getTemplateVersion()).append(",");
        if (getEnvironments() != null)
            sb.append("Environments: ").append(getEnvironments()).append(",");
        if (getDocumentParameters() != null)
            sb.append("DocumentParameters: ").append(getDocumentParameters()).append(",");
        if (getDocument() != null)
            sb.append("Document: ").append(getDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeManagedJobTemplateResult == false)
            return false;
        DescribeManagedJobTemplateResult other = (DescribeManagedJobTemplateResult) obj;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getTemplateArn() == null ^ this.getTemplateArn() == null)
            return false;
        if (other.getTemplateArn() != null && other.getTemplateArn().equals(this.getTemplateArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTemplateVersion() == null ^ this.getTemplateVersion() == null)
            return false;
        if (other.getTemplateVersion() != null && other.getTemplateVersion().equals(this.getTemplateVersion()) == false)
            return false;
        if (other.getEnvironments() == null ^ this.getEnvironments() == null)
            return false;
        if (other.getEnvironments() != null && other.getEnvironments().equals(this.getEnvironments()) == false)
            return false;
        if (other.getDocumentParameters() == null ^ this.getDocumentParameters() == null)
            return false;
        if (other.getDocumentParameters() != null && other.getDocumentParameters().equals(this.getDocumentParameters()) == false)
            return false;
        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getTemplateArn() == null) ? 0 : getTemplateArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTemplateVersion() == null) ? 0 : getTemplateVersion().hashCode());
        hashCode = prime * hashCode + ((getEnvironments() == null) ? 0 : getEnvironments().hashCode());
        hashCode = prime * hashCode + ((getDocumentParameters() == null) ? 0 : getDocumentParameters().hashCode());
        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        return hashCode;
    }

    @Override
    public DescribeManagedJobTemplateResult clone() {
        try {
            return (DescribeManagedJobTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
