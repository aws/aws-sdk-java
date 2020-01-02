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
public class DeleteProvisioningTemplateVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the fleet provisioning template version to delete.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * The fleet provisioning template version ID to delete.
     * </p>
     */
    private Integer versionId;

    /**
     * <p>
     * The name of the fleet provisioning template version to delete.
     * </p>
     * 
     * @param templateName
     *        The name of the fleet provisioning template version to delete.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the fleet provisioning template version to delete.
     * </p>
     * 
     * @return The name of the fleet provisioning template version to delete.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the fleet provisioning template version to delete.
     * </p>
     * 
     * @param templateName
     *        The name of the fleet provisioning template version to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProvisioningTemplateVersionRequest withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * The fleet provisioning template version ID to delete.
     * </p>
     * 
     * @param versionId
     *        The fleet provisioning template version ID to delete.
     */

    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The fleet provisioning template version ID to delete.
     * </p>
     * 
     * @return The fleet provisioning template version ID to delete.
     */

    public Integer getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The fleet provisioning template version ID to delete.
     * </p>
     * 
     * @param versionId
     *        The fleet provisioning template version ID to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProvisioningTemplateVersionRequest withVersionId(Integer versionId) {
        setVersionId(versionId);
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
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteProvisioningTemplateVersionRequest == false)
            return false;
        DeleteProvisioningTemplateVersionRequest other = (DeleteProvisioningTemplateVersionRequest) obj;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteProvisioningTemplateVersionRequest clone() {
        return (DeleteProvisioningTemplateVersionRequest) super.clone();
    }

}
