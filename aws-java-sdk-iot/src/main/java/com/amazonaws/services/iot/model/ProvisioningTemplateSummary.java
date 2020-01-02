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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of information about a fleet provisioning template.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisioningTemplateSummary implements Serializable, Cloneable, StructuredPojo {

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
     * The date when the fleet provisioning template summary was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date when the fleet provisioning template summary was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * True if the fleet provision template is enabled, otherwise false.
     * </p>
     */
    private Boolean enabled;

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

    public ProvisioningTemplateSummary withTemplateArn(String templateArn) {
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

    public ProvisioningTemplateSummary withTemplateName(String templateName) {
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

    public ProvisioningTemplateSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date when the fleet provisioning template summary was created.
     * </p>
     * 
     * @param creationDate
     *        The date when the fleet provisioning template summary was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date when the fleet provisioning template summary was created.
     * </p>
     * 
     * @return The date when the fleet provisioning template summary was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date when the fleet provisioning template summary was created.
     * </p>
     * 
     * @param creationDate
     *        The date when the fleet provisioning template summary was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningTemplateSummary withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date when the fleet provisioning template summary was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date when the fleet provisioning template summary was last modified.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date when the fleet provisioning template summary was last modified.
     * </p>
     * 
     * @return The date when the fleet provisioning template summary was last modified.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date when the fleet provisioning template summary was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date when the fleet provisioning template summary was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningTemplateSummary withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * True if the fleet provision template is enabled, otherwise false.
     * </p>
     * 
     * @param enabled
     *        True if the fleet provision template is enabled, otherwise false.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * True if the fleet provision template is enabled, otherwise false.
     * </p>
     * 
     * @return True if the fleet provision template is enabled, otherwise false.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * True if the fleet provision template is enabled, otherwise false.
     * </p>
     * 
     * @param enabled
     *        True if the fleet provision template is enabled, otherwise false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningTemplateSummary withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * True if the fleet provision template is enabled, otherwise false.
     * </p>
     * 
     * @return True if the fleet provision template is enabled, otherwise false.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisioningTemplateSummary == false)
            return false;
        ProvisioningTemplateSummary other = (ProvisioningTemplateSummary) obj;
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
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
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
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public ProvisioningTemplateSummary clone() {
        try {
            return (ProvisioningTemplateSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.ProvisioningTemplateSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
