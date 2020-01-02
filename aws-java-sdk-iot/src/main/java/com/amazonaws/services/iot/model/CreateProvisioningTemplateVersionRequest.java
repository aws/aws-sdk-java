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
public class CreateProvisioningTemplateVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the fleet provisioning template.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * The JSON formatted contents of the fleet provisioning template.
     * </p>
     */
    private String templateBody;
    /**
     * <p>
     * Sets a fleet provision template version as the default version.
     * </p>
     */
    private Boolean setAsDefault;

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

    public CreateProvisioningTemplateVersionRequest withTemplateName(String templateName) {
        setTemplateName(templateName);
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

    public CreateProvisioningTemplateVersionRequest withTemplateBody(String templateBody) {
        setTemplateBody(templateBody);
        return this;
    }

    /**
     * <p>
     * Sets a fleet provision template version as the default version.
     * </p>
     * 
     * @param setAsDefault
     *        Sets a fleet provision template version as the default version.
     */

    public void setSetAsDefault(Boolean setAsDefault) {
        this.setAsDefault = setAsDefault;
    }

    /**
     * <p>
     * Sets a fleet provision template version as the default version.
     * </p>
     * 
     * @return Sets a fleet provision template version as the default version.
     */

    public Boolean getSetAsDefault() {
        return this.setAsDefault;
    }

    /**
     * <p>
     * Sets a fleet provision template version as the default version.
     * </p>
     * 
     * @param setAsDefault
     *        Sets a fleet provision template version as the default version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisioningTemplateVersionRequest withSetAsDefault(Boolean setAsDefault) {
        setSetAsDefault(setAsDefault);
        return this;
    }

    /**
     * <p>
     * Sets a fleet provision template version as the default version.
     * </p>
     * 
     * @return Sets a fleet provision template version as the default version.
     */

    public Boolean isSetAsDefault() {
        return this.setAsDefault;
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
        if (getTemplateBody() != null)
            sb.append("TemplateBody: ").append(getTemplateBody()).append(",");
        if (getSetAsDefault() != null)
            sb.append("SetAsDefault: ").append(getSetAsDefault());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProvisioningTemplateVersionRequest == false)
            return false;
        CreateProvisioningTemplateVersionRequest other = (CreateProvisioningTemplateVersionRequest) obj;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null)
            return false;
        if (other.getTemplateBody() != null && other.getTemplateBody().equals(this.getTemplateBody()) == false)
            return false;
        if (other.getSetAsDefault() == null ^ this.getSetAsDefault() == null)
            return false;
        if (other.getSetAsDefault() != null && other.getSetAsDefault().equals(this.getSetAsDefault()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode + ((getSetAsDefault() == null) ? 0 : getSetAsDefault().hashCode());
        return hashCode;
    }

    @Override
    public CreateProvisioningTemplateVersionRequest clone() {
        return (CreateProvisioningTemplateVersionRequest) super.clone();
    }

}
