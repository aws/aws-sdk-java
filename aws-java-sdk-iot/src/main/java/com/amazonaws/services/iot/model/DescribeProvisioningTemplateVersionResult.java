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
public class DescribeProvisioningTemplateVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The fleet provisioning template version ID.
     * </p>
     */
    private Integer versionId;
    /**
     * <p>
     * The date when the fleet provisioning template version was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The JSON formatted contents of the fleet provisioning template version.
     * </p>
     */
    private String templateBody;
    /**
     * <p>
     * True if the fleet provisioning template version is the default version.
     * </p>
     */
    private Boolean isDefaultVersion;

    /**
     * <p>
     * The fleet provisioning template version ID.
     * </p>
     * 
     * @param versionId
     *        The fleet provisioning template version ID.
     */

    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The fleet provisioning template version ID.
     * </p>
     * 
     * @return The fleet provisioning template version ID.
     */

    public Integer getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The fleet provisioning template version ID.
     * </p>
     * 
     * @param versionId
     *        The fleet provisioning template version ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningTemplateVersionResult withVersionId(Integer versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * <p>
     * The date when the fleet provisioning template version was created.
     * </p>
     * 
     * @param creationDate
     *        The date when the fleet provisioning template version was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date when the fleet provisioning template version was created.
     * </p>
     * 
     * @return The date when the fleet provisioning template version was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date when the fleet provisioning template version was created.
     * </p>
     * 
     * @param creationDate
     *        The date when the fleet provisioning template version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningTemplateVersionResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The JSON formatted contents of the fleet provisioning template version.
     * </p>
     * 
     * @param templateBody
     *        The JSON formatted contents of the fleet provisioning template version.
     */

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * The JSON formatted contents of the fleet provisioning template version.
     * </p>
     * 
     * @return The JSON formatted contents of the fleet provisioning template version.
     */

    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * <p>
     * The JSON formatted contents of the fleet provisioning template version.
     * </p>
     * 
     * @param templateBody
     *        The JSON formatted contents of the fleet provisioning template version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningTemplateVersionResult withTemplateBody(String templateBody) {
        setTemplateBody(templateBody);
        return this;
    }

    /**
     * <p>
     * True if the fleet provisioning template version is the default version.
     * </p>
     * 
     * @param isDefaultVersion
     *        True if the fleet provisioning template version is the default version.
     */

    public void setIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
    }

    /**
     * <p>
     * True if the fleet provisioning template version is the default version.
     * </p>
     * 
     * @return True if the fleet provisioning template version is the default version.
     */

    public Boolean getIsDefaultVersion() {
        return this.isDefaultVersion;
    }

    /**
     * <p>
     * True if the fleet provisioning template version is the default version.
     * </p>
     * 
     * @param isDefaultVersion
     *        True if the fleet provisioning template version is the default version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisioningTemplateVersionResult withIsDefaultVersion(Boolean isDefaultVersion) {
        setIsDefaultVersion(isDefaultVersion);
        return this;
    }

    /**
     * <p>
     * True if the fleet provisioning template version is the default version.
     * </p>
     * 
     * @return True if the fleet provisioning template version is the default version.
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
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getTemplateBody() != null)
            sb.append("TemplateBody: ").append(getTemplateBody()).append(",");
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

        if (obj instanceof DescribeProvisioningTemplateVersionResult == false)
            return false;
        DescribeProvisioningTemplateVersionResult other = (DescribeProvisioningTemplateVersionResult) obj;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null)
            return false;
        if (other.getTemplateBody() != null && other.getTemplateBody().equals(this.getTemplateBody()) == false)
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

        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode + ((getIsDefaultVersion() == null) ? 0 : getIsDefaultVersion().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProvisioningTemplateVersionResult clone() {
        try {
            return (DescribeProvisioningTemplateVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
