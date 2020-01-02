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
 * A template object. A <i>template</i> is an entity in QuickSight that encapsulates the metadata required to create an
 * analysis and that you can use to create a dashboard. A template adds a layer of abstraction by using placeholders to
 * replace the dataset associated with the analysis. You can use templates to create dashboards by replacing dataset
 * placeholders with datasets that follow the same schema that was used to create the source analysis and template.
 * </p>
 * <p>
 * You can share templates across AWS accounts by allowing users in other AWS accounts to create a template or a
 * dashboard from an existing template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/Template" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Template implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the template.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The display name of the template.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A structure describing the versions of the template.
     * </p>
     */
    private TemplateVersion version;
    /**
     * <p>
     * The ID for the template. This is unique per AWS Region for each AWS account.
     * </p>
     */
    private String templateId;
    /**
     * <p>
     * Time when this was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * Time when this was created.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the template.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the template.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the template.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the template.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the template.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Template withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The display name of the template.
     * </p>
     * 
     * @param name
     *        The display name of the template.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The display name of the template.
     * </p>
     * 
     * @return The display name of the template.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The display name of the template.
     * </p>
     * 
     * @param name
     *        The display name of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Template withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A structure describing the versions of the template.
     * </p>
     * 
     * @param version
     *        A structure describing the versions of the template.
     */

    public void setVersion(TemplateVersion version) {
        this.version = version;
    }

    /**
     * <p>
     * A structure describing the versions of the template.
     * </p>
     * 
     * @return A structure describing the versions of the template.
     */

    public TemplateVersion getVersion() {
        return this.version;
    }

    /**
     * <p>
     * A structure describing the versions of the template.
     * </p>
     * 
     * @param version
     *        A structure describing the versions of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Template withVersion(TemplateVersion version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The ID for the template. This is unique per AWS Region for each AWS account.
     * </p>
     * 
     * @param templateId
     *        The ID for the template. This is unique per AWS Region for each AWS account.
     */

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * <p>
     * The ID for the template. This is unique per AWS Region for each AWS account.
     * </p>
     * 
     * @return The ID for the template. This is unique per AWS Region for each AWS account.
     */

    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * <p>
     * The ID for the template. This is unique per AWS Region for each AWS account.
     * </p>
     * 
     * @param templateId
     *        The ID for the template. This is unique per AWS Region for each AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Template withTemplateId(String templateId) {
        setTemplateId(templateId);
        return this;
    }

    /**
     * <p>
     * Time when this was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        Time when this was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * Time when this was last updated.
     * </p>
     * 
     * @return Time when this was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * Time when this was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        Time when this was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Template withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * Time when this was created.
     * </p>
     * 
     * @param createdTime
     *        Time when this was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * Time when this was created.
     * </p>
     * 
     * @return Time when this was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * Time when this was created.
     * </p>
     * 
     * @param createdTime
     *        Time when this was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Template withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getTemplateId() != null)
            sb.append("TemplateId: ").append(getTemplateId()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Template == false)
            return false;
        Template other = (Template) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getTemplateId() == null ^ this.getTemplateId() == null)
            return false;
        if (other.getTemplateId() != null && other.getTemplateId().equals(this.getTemplateId()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        return hashCode;
    }

    @Override
    public Template clone() {
        try {
            return (Template) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TemplateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
