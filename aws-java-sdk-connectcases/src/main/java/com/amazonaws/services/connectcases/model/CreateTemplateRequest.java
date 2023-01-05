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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A brief description of the template.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier of the Cases domain.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * Configuration of layouts associated to the template.
     * </p>
     */
    private LayoutConfiguration layoutConfiguration;
    /**
     * <p>
     * A name for the template. It must be unique per domain.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A list of fields that must contain a value for a case to be successfully created with this template.
     * </p>
     */
    private java.util.List<RequiredField> requiredFields;
    /**
     * <p>
     * The status of the template.
     * </p>
     */
    private String status;

    /**
     * <p>
     * A brief description of the template.
     * </p>
     * 
     * @param description
     *        A brief description of the template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the template.
     * </p>
     * 
     * @return A brief description of the template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A brief description of the template.
     * </p>
     * 
     * @param description
     *        A brief description of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the Cases domain.
     * </p>
     * 
     * @param domainId
     *        The unique identifier of the Cases domain.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The unique identifier of the Cases domain.
     * </p>
     * 
     * @return The unique identifier of the Cases domain.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The unique identifier of the Cases domain.
     * </p>
     * 
     * @param domainId
     *        The unique identifier of the Cases domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateRequest withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * Configuration of layouts associated to the template.
     * </p>
     * 
     * @param layoutConfiguration
     *        Configuration of layouts associated to the template.
     */

    public void setLayoutConfiguration(LayoutConfiguration layoutConfiguration) {
        this.layoutConfiguration = layoutConfiguration;
    }

    /**
     * <p>
     * Configuration of layouts associated to the template.
     * </p>
     * 
     * @return Configuration of layouts associated to the template.
     */

    public LayoutConfiguration getLayoutConfiguration() {
        return this.layoutConfiguration;
    }

    /**
     * <p>
     * Configuration of layouts associated to the template.
     * </p>
     * 
     * @param layoutConfiguration
     *        Configuration of layouts associated to the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateRequest withLayoutConfiguration(LayoutConfiguration layoutConfiguration) {
        setLayoutConfiguration(layoutConfiguration);
        return this;
    }

    /**
     * <p>
     * A name for the template. It must be unique per domain.
     * </p>
     * 
     * @param name
     *        A name for the template. It must be unique per domain.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the template. It must be unique per domain.
     * </p>
     * 
     * @return A name for the template. It must be unique per domain.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the template. It must be unique per domain.
     * </p>
     * 
     * @param name
     *        A name for the template. It must be unique per domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A list of fields that must contain a value for a case to be successfully created with this template.
     * </p>
     * 
     * @return A list of fields that must contain a value for a case to be successfully created with this template.
     */

    public java.util.List<RequiredField> getRequiredFields() {
        return requiredFields;
    }

    /**
     * <p>
     * A list of fields that must contain a value for a case to be successfully created with this template.
     * </p>
     * 
     * @param requiredFields
     *        A list of fields that must contain a value for a case to be successfully created with this template.
     */

    public void setRequiredFields(java.util.Collection<RequiredField> requiredFields) {
        if (requiredFields == null) {
            this.requiredFields = null;
            return;
        }

        this.requiredFields = new java.util.ArrayList<RequiredField>(requiredFields);
    }

    /**
     * <p>
     * A list of fields that must contain a value for a case to be successfully created with this template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequiredFields(java.util.Collection)} or {@link #withRequiredFields(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param requiredFields
     *        A list of fields that must contain a value for a case to be successfully created with this template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateRequest withRequiredFields(RequiredField... requiredFields) {
        if (this.requiredFields == null) {
            setRequiredFields(new java.util.ArrayList<RequiredField>(requiredFields.length));
        }
        for (RequiredField ele : requiredFields) {
            this.requiredFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of fields that must contain a value for a case to be successfully created with this template.
     * </p>
     * 
     * @param requiredFields
     *        A list of fields that must contain a value for a case to be successfully created with this template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTemplateRequest withRequiredFields(java.util.Collection<RequiredField> requiredFields) {
        setRequiredFields(requiredFields);
        return this;
    }

    /**
     * <p>
     * The status of the template.
     * </p>
     * 
     * @param status
     *        The status of the template.
     * @see TemplateStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the template.
     * </p>
     * 
     * @return The status of the template.
     * @see TemplateStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the template.
     * </p>
     * 
     * @param status
     *        The status of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateStatus
     */

    public CreateTemplateRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the template.
     * </p>
     * 
     * @param status
     *        The status of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateStatus
     */

    public CreateTemplateRequest withStatus(TemplateStatus status) {
        this.status = status.toString();
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getLayoutConfiguration() != null)
            sb.append("LayoutConfiguration: ").append(getLayoutConfiguration()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRequiredFields() != null)
            sb.append("RequiredFields: ").append(getRequiredFields()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTemplateRequest == false)
            return false;
        CreateTemplateRequest other = (CreateTemplateRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getLayoutConfiguration() == null ^ this.getLayoutConfiguration() == null)
            return false;
        if (other.getLayoutConfiguration() != null && other.getLayoutConfiguration().equals(this.getLayoutConfiguration()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRequiredFields() == null ^ this.getRequiredFields() == null)
            return false;
        if (other.getRequiredFields() != null && other.getRequiredFields().equals(this.getRequiredFields()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getLayoutConfiguration() == null) ? 0 : getLayoutConfiguration().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRequiredFields() == null) ? 0 : getRequiredFields().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateTemplateRequest clone() {
        return (CreateTemplateRequest) super.clone();
    }

}
