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
 * The template summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TemplateSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A summary of a template.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ID of the template. This ID is unique per AWS Region for each AWS account.
     * </p>
     */
    private String templateId;
    /**
     * <p>
     * A display name for the template.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A structure containing a list of version numbers for the template summary.
     * </p>
     */
    private Long latestVersionNumber;
    /**
     * <p>
     * The last time that this template was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The last time that this template was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * A summary of a template.
     * </p>
     * 
     * @param arn
     *        A summary of a template.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * A summary of a template.
     * </p>
     * 
     * @return A summary of a template.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * A summary of a template.
     * </p>
     * 
     * @param arn
     *        A summary of a template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ID of the template. This ID is unique per AWS Region for each AWS account.
     * </p>
     * 
     * @param templateId
     *        The ID of the template. This ID is unique per AWS Region for each AWS account.
     */

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * <p>
     * The ID of the template. This ID is unique per AWS Region for each AWS account.
     * </p>
     * 
     * @return The ID of the template. This ID is unique per AWS Region for each AWS account.
     */

    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * <p>
     * The ID of the template. This ID is unique per AWS Region for each AWS account.
     * </p>
     * 
     * @param templateId
     *        The ID of the template. This ID is unique per AWS Region for each AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSummary withTemplateId(String templateId) {
        setTemplateId(templateId);
        return this;
    }

    /**
     * <p>
     * A display name for the template.
     * </p>
     * 
     * @param name
     *        A display name for the template.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A display name for the template.
     * </p>
     * 
     * @return A display name for the template.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A display name for the template.
     * </p>
     * 
     * @param name
     *        A display name for the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A structure containing a list of version numbers for the template summary.
     * </p>
     * 
     * @param latestVersionNumber
     *        A structure containing a list of version numbers for the template summary.
     */

    public void setLatestVersionNumber(Long latestVersionNumber) {
        this.latestVersionNumber = latestVersionNumber;
    }

    /**
     * <p>
     * A structure containing a list of version numbers for the template summary.
     * </p>
     * 
     * @return A structure containing a list of version numbers for the template summary.
     */

    public Long getLatestVersionNumber() {
        return this.latestVersionNumber;
    }

    /**
     * <p>
     * A structure containing a list of version numbers for the template summary.
     * </p>
     * 
     * @param latestVersionNumber
     *        A structure containing a list of version numbers for the template summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSummary withLatestVersionNumber(Long latestVersionNumber) {
        setLatestVersionNumber(latestVersionNumber);
        return this;
    }

    /**
     * <p>
     * The last time that this template was created.
     * </p>
     * 
     * @param createdTime
     *        The last time that this template was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The last time that this template was created.
     * </p>
     * 
     * @return The last time that this template was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The last time that this template was created.
     * </p>
     * 
     * @param createdTime
     *        The last time that this template was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSummary withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The last time that this template was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last time that this template was updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The last time that this template was updated.
     * </p>
     * 
     * @return The last time that this template was updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The last time that this template was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last time that this template was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSummary withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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
        if (getTemplateId() != null)
            sb.append("TemplateId: ").append(getTemplateId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getLatestVersionNumber() != null)
            sb.append("LatestVersionNumber: ").append(getLatestVersionNumber()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateSummary == false)
            return false;
        TemplateSummary other = (TemplateSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getTemplateId() == null ^ this.getTemplateId() == null)
            return false;
        if (other.getTemplateId() != null && other.getTemplateId().equals(this.getTemplateId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLatestVersionNumber() == null ^ this.getLatestVersionNumber() == null)
            return false;
        if (other.getLatestVersionNumber() != null && other.getLatestVersionNumber().equals(this.getLatestVersionNumber()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLatestVersionNumber() == null) ? 0 : getLatestVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public TemplateSummary clone() {
        try {
            return (TemplateSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TemplateSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
