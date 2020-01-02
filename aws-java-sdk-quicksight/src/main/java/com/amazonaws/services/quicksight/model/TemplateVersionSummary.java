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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The template version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TemplateVersionSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateVersionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the template version.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The version number of the template version.
     * </p>
     */
    private Long versionNumber;
    /**
     * <p>
     * The time that this template version was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The status of the template version.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The description of the template version.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ARN of the template version.
     * </p>
     * 
     * @param arn
     *        The ARN of the template version.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the template version.
     * </p>
     * 
     * @return The ARN of the template version.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the template version.
     * </p>
     * 
     * @param arn
     *        The ARN of the template version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateVersionSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The version number of the template version.
     * </p>
     * 
     * @param versionNumber
     *        The version number of the template version.
     */

    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * The version number of the template version.
     * </p>
     * 
     * @return The version number of the template version.
     */

    public Long getVersionNumber() {
        return this.versionNumber;
    }

    /**
     * <p>
     * The version number of the template version.
     * </p>
     * 
     * @param versionNumber
     *        The version number of the template version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateVersionSummary withVersionNumber(Long versionNumber) {
        setVersionNumber(versionNumber);
        return this;
    }

    /**
     * <p>
     * The time that this template version was created.
     * </p>
     * 
     * @param createdTime
     *        The time that this template version was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time that this template version was created.
     * </p>
     * 
     * @return The time that this template version was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time that this template version was created.
     * </p>
     * 
     * @param createdTime
     *        The time that this template version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateVersionSummary withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The status of the template version.
     * </p>
     * 
     * @param status
     *        The status of the template version.
     * @see ResourceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the template version.
     * </p>
     * 
     * @return The status of the template version.
     * @see ResourceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the template version.
     * </p>
     * 
     * @param status
     *        The status of the template version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public TemplateVersionSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the template version.
     * </p>
     * 
     * @param status
     *        The status of the template version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public TemplateVersionSummary withStatus(ResourceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The description of the template version.
     * </p>
     * 
     * @param description
     *        The description of the template version.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the template version.
     * </p>
     * 
     * @return The description of the template version.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the template version.
     * </p>
     * 
     * @param description
     *        The description of the template version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateVersionSummary withDescription(String description) {
        setDescription(description);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getVersionNumber() != null)
            sb.append("VersionNumber: ").append(getVersionNumber()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateVersionSummary == false)
            return false;
        TemplateVersionSummary other = (TemplateVersionSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public TemplateVersionSummary clone() {
        try {
            return (TemplateVersionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TemplateVersionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
