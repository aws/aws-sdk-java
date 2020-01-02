/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class DescribeProvisioningTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the fleet provisioning template.
     * </p>
     */
    private String templateArn;
    /**
     * <p>
     * The name of the fleet provisioning template.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * The description of the fleet provisioning template.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The date when the fleet provisioning template was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date when the fleet provisioning template was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * The default fleet template version ID.
     * </p>
     */
    private Integer defaultVersionId;
    /**
     * <p>
     * The JSON formatted contents of the fleet provisioning template.
     * </p>
     */
    private String templateBody;
    /**
     * <p>
     * True if the fleet provisioning template is enabled, otherwise false.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The ARN of the role associated with the provisioning template. This IoT role grants permission to provision a
     * device.
     * </p>
     */
    private String provisioningRoleArn;

    /**
     * <p>
     * The ARN of the fleet provisioning template.
     * </p>
     * 
     * @param templateArn
     *        The ARN of the fleet provisioning template.
     */

    public void setTemplateArn(String templateArn) {
        this.templateArn = templateArn;
    }

    /**
     * <p>
     * The ARN of the fleet provisioning template.
     * </p>
     * 
     * @return The ARN of the fleet provisioning template.
     */

    public String getTemplateArn() {
        return this.templateArn;
    }

    /**
     * <p>
     * The ARN of the fleet provisioning template.
     * </p>
     * 
     * @param templateArn
     *        The ARN of the fleet provisioning template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningTemplateResult withTemplateArn(String templateArn) {
        setTemplateArn(templateArn);
        return this;
    }

    /**
     * <p>
     * The name of the fleet provisioning template.
     * </p>
     * 
     * @param templateName
     *        The name of the fleet provisioning template.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the fleet provisioning template.
     * </p>
     * 
     * @return The name of the fleet provisioning template.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the fleet provisioning template.
     * </p>
     * 
     * @param templateName
     *        The name of the fleet provisioning template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningTemplateResult withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * The description of the fleet provisioning template.
     * </p>
     * 
     * @param description
     *        The description of the fleet provisioning template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the fleet provisioning template.
     * </p>
     * 
     * @return The description of the fleet provisioning template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the fleet provisioning template.
     * </p>
     * 
     * @param description
     *        The description of the fleet provisioning template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningTemplateResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date when the fleet provisioning template was created.
     * </p>
     * 
     * @param creationDate
     *        The date when the fleet provisioning template was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date when the fleet provisioning template was created.
     * </p>
     * 
     * @return The date when the fleet provisioning template was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date when the fleet provisioning template was created.
     * </p>
     * 
     * @param creationDate
     *        The date when the fleet provisioning template was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningTemplateResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date when the fleet provisioning template was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date when the fleet provisioning template was last modified.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date when the fleet provisioning template was last modified.
     * </p>
     * 
     * @return The date when the fleet provisioning template was last modified.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date when the fleet provisioning template was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date when the fleet provisioning template was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningTemplateResult withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The default fleet template version ID.
     * </p>
     * 
     * @param defaultVersionId
     *        The default fleet template version ID.
     */

    public void setDefaultVersionId(Integer defaultVersionId) {
        this.defaultVersionId = defaultVersionId;
    }

    /**
     * <p>
     * The default fleet template version ID.
     * </p>
     * 
     * @return The default fleet template version ID.
     */

    public Integer getDefaultVersionId() {
        return this.defaultVersionId;
    }

    /**
     * <p>
     * The default fleet template version ID.
     * </p>
     * 
     * @param defaultVersionId
     *        The default fleet template version ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningTemplateResult withDefaultVersionId(Integer defaultVersionId) {
        setDefaultVersionId(defaultVersionId);
        return this;
    }

    /**
     * <p>
     * The JSON formatted contents of the fleet provisioning template.
     * </p>
     * 
     * @param templateBody
     *        The JSON formatted contents of the fleet provisioning template.
     */

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * The JSON formatted contents of the fleet provisioning template.
     * </p>
     * 
     * @return The JSON formatted contents of the fleet provisioning template.
     */

    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * <p>
     * The JSON formatted contents of the fleet provisioning template.
     * </p>
     * 
     * @param templateBody
     *        The JSON formatted contents of the fleet provisioning template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningTemplateResult withTemplateBody(String templateBody) {
        setTemplateBody(templateBody);
        return this;
    }

    /**
     * <p>
     * True if the fleet provisioning template is enabled, otherwise false.
     * </p>
     * 
     * @param enabled
     *        True if the fleet provisioning template is enabled, otherwise false.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * True if the fleet provisioning template is enabled, otherwise false.
     * </p>
     * 
     * @return True if the fleet provisioning template is enabled, otherwise false.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * True if the fleet provisioning template is enabled, otherwise false.
     * </p>
     * 
     * @param enabled
     *        True if the fleet provisioning template is enabled, otherwise false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningTemplateResult withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * True if the fleet provisioning template is enabled, otherwise false.
     * </p>
     * 
     * @return True if the fleet provisioning template is enabled, otherwise false.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The ARN of the role associated with the provisioning template. This IoT role grants permission to provision a
     * device.
     * </p>
     * 
     * @param provisioningRoleArn
     *        The ARN of the role associated with the provisioning template. This IoT role grants permission to
     *        provision a device.
     */

    public void setProvisioningRoleArn(String provisioningRoleArn) {
        this.provisioningRoleArn = provisioningRoleArn;
    }

    /**
     * <p>
     * The ARN of the role associated with the provisioning template. This IoT role grants permission to provision a
     * device.
     * </p>
     * 
     * @return The ARN of the role associated with the provisioning template. This IoT role grants permission to
     *         provision a device.
     */

    public String getProvisioningRoleArn() {
        return this.provisioningRoleArn;
    }

    /**
     * <p>
     * The ARN of the role associated with the provisioning template. This IoT role grants permission to provision a
     * device.
     * </p>
     * 
     * @param provisioningRoleArn
     *        The ARN of the role associated with the provisioning template. This IoT role grants permission to
     *        provision a device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningTemplateResult withProvisioningRoleArn(String provisioningRoleArn) {
        setProvisioningRoleArn(provisioningRoleArn);
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
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getDefaultVersionId() != null)
            sb.append("DefaultVersionId: ").append(getDefaultVersionId()).append(",");
        if (getTemplateBody() != null)
            sb.append("TemplateBody: ").append(getTemplateBody()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getProvisioningRoleArn() != null)
            sb.append("ProvisioningRoleArn: ").append(getProvisioningRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProvisioningTemplateResult == false)
            return false;
        DescribeProvisioningTemplateResult other = (DescribeProvisioningTemplateResult) obj;
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
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getDefaultVersionId() == null ^ this.getDefaultVersionId() == null)
            return false;
        if (other.getDefaultVersionId() != null && other.getDefaultVersionId().equals(this.getDefaultVersionId()) == false)
            return false;
        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null)
            return false;
        if (other.getTemplateBody() != null && other.getTemplateBody().equals(this.getTemplateBody()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getProvisioningRoleArn() == null ^ this.getProvisioningRoleArn() == null)
            return false;
        if (other.getProvisioningRoleArn() != null && other.getProvisioningRoleArn().equals(this.getProvisioningRoleArn()) == false)
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
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getDefaultVersionId() == null) ? 0 : getDefaultVersionId().hashCode());
        hashCode = prime * hashCode + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getProvisioningRoleArn() == null) ? 0 : getProvisioningRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProvisioningTemplateResult clone() {
        try {
            return (DescribeProvisioningTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
