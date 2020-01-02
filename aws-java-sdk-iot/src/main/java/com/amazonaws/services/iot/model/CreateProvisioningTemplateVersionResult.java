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
public class CreateProvisioningTemplateVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ARN that identifies the provisioning template.
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
     * The version of the fleet provisioning template.
     * </p>
     */
    private Integer versionId;
    /**
     * <p>
     * True if the fleet provisioning template version is the default version, otherwise false.
     * </p>
     */
    private Boolean isDefaultVersion;

    /**
     * <p>
     * The ARN that identifies the provisioning template.
     * </p>
     * 
     * @param templateArn
     *        The ARN that identifies the provisioning template.
     */

    public void setTemplateArn(String templateArn) {
        this.templateArn = templateArn;
    }

    /**
     * <p>
     * The ARN that identifies the provisioning template.
     * </p>
     * 
     * @return The ARN that identifies the provisioning template.
     */

    public String getTemplateArn() {
        return this.templateArn;
    }

    /**
     * <p>
     * The ARN that identifies the provisioning template.
     * </p>
     * 
     * @param templateArn
     *        The ARN that identifies the provisioning template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisioningTemplateVersionResult withTemplateArn(String templateArn) {
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

    public CreateProvisioningTemplateVersionResult withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * The version of the fleet provisioning template.
     * </p>
     * 
     * @param versionId
     *        The version of the fleet provisioning template.
     */

    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The version of the fleet provisioning template.
     * </p>
     * 
     * @return The version of the fleet provisioning template.
     */

    public Integer getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The version of the fleet provisioning template.
     * </p>
     * 
     * @param versionId
     *        The version of the fleet provisioning template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisioningTemplateVersionResult withVersionId(Integer versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * <p>
     * True if the fleet provisioning template version is the default version, otherwise false.
     * </p>
     * 
     * @param isDefaultVersion
     *        True if the fleet provisioning template version is the default version, otherwise false.
     */

    public void setIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
    }

    /**
     * <p>
     * True if the fleet provisioning template version is the default version, otherwise false.
     * </p>
     * 
     * @return True if the fleet provisioning template version is the default version, otherwise false.
     */

    public Boolean getIsDefaultVersion() {
        return this.isDefaultVersion;
    }

    /**
     * <p>
     * True if the fleet provisioning template version is the default version, otherwise false.
     * </p>
     * 
     * @param isDefaultVersion
     *        True if the fleet provisioning template version is the default version, otherwise false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisioningTemplateVersionResult withIsDefaultVersion(Boolean isDefaultVersion) {
        setIsDefaultVersion(isDefaultVersion);
        return this;
    }

    /**
     * <p>
     * True if the fleet provisioning template version is the default version, otherwise false.
     * </p>
     * 
     * @return True if the fleet provisioning template version is the default version, otherwise false.
     */

    public Boolean isDefaultVersion() {
        return this.isDefaultVersion;
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
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId()).append(",");
        if (getIsDefaultVersion() != null)
            sb.append("IsDefaultVersion: ").append(getIsDefaultVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProvisioningTemplateVersionResult == false)
            return false;
        CreateProvisioningTemplateVersionResult other = (CreateProvisioningTemplateVersionResult) obj;
        if (other.getTemplateArn() == null ^ this.getTemplateArn() == null)
            return false;
        if (other.getTemplateArn() != null && other.getTemplateArn().equals(this.getTemplateArn()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getIsDefaultVersion() == null ^ this.getIsDefaultVersion() == null)
            return false;
        if (other.getIsDefaultVersion() != null && other.getIsDefaultVersion().equals(this.getIsDefaultVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateArn() == null) ? 0 : getTemplateArn().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode + ((getIsDefaultVersion() == null) ? 0 : getIsDefaultVersion().hashCode());
        return hashCode;
    }

    @Override
    public CreateProvisioningTemplateVersionResult clone() {
        try {
            return (CreateProvisioningTemplateVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
