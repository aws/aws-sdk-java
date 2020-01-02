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

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProvisioningTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * True to enable the fleet provisioning template, otherwise false.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The ID of the default provisioning template version.
     * </p>
     */
    private Integer defaultVersionId;
    /**
     * <p>
     * The ARN of the role associated with the provisioning template. This IoT role grants permission to provision a
     * device.
     * </p>
     */
    private String provisioningRoleArn;

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

    public UpdateProvisioningTemplateRequest withTemplateName(String templateName) {
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

    public UpdateProvisioningTemplateRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * True to enable the fleet provisioning template, otherwise false.
     * </p>
     * 
     * @param enabled
     *        True to enable the fleet provisioning template, otherwise false.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * True to enable the fleet provisioning template, otherwise false.
     * </p>
     * 
     * @return True to enable the fleet provisioning template, otherwise false.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * True to enable the fleet provisioning template, otherwise false.
     * </p>
     * 
     * @param enabled
     *        True to enable the fleet provisioning template, otherwise false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisioningTemplateRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * True to enable the fleet provisioning template, otherwise false.
     * </p>
     * 
     * @return True to enable the fleet provisioning template, otherwise false.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The ID of the default provisioning template version.
     * </p>
     * 
     * @param defaultVersionId
     *        The ID of the default provisioning template version.
     */

    public void setDefaultVersionId(Integer defaultVersionId) {
        this.defaultVersionId = defaultVersionId;
    }

    /**
     * <p>
     * The ID of the default provisioning template version.
     * </p>
     * 
     * @return The ID of the default provisioning template version.
     */

    public Integer getDefaultVersionId() {
        return this.defaultVersionId;
    }

    /**
     * <p>
     * The ID of the default provisioning template version.
     * </p>
     * 
     * @param defaultVersionId
     *        The ID of the default provisioning template version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisioningTemplateRequest withDefaultVersionId(Integer defaultVersionId) {
        setDefaultVersionId(defaultVersionId);
        return this;
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

    public UpdateProvisioningTemplateRequest withProvisioningRoleArn(String provisioningRoleArn) {
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
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getDefaultVersionId() != null)
            sb.append("DefaultVersionId: ").append(getDefaultVersionId()).append(",");
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

        if (obj instanceof UpdateProvisioningTemplateRequest == false)
            return false;
        UpdateProvisioningTemplateRequest other = (UpdateProvisioningTemplateRequest) obj;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getDefaultVersionId() == null ^ this.getDefaultVersionId() == null)
            return false;
        if (other.getDefaultVersionId() != null && other.getDefaultVersionId().equals(this.getDefaultVersionId()) == false)
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

        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getDefaultVersionId() == null) ? 0 : getDefaultVersionId().hashCode());
        hashCode = prime * hashCode + ((getProvisioningRoleArn() == null) ? 0 : getProvisioningRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProvisioningTemplateRequest clone() {
        return (UpdateProvisioningTemplateRequest) super.clone();
    }

}
