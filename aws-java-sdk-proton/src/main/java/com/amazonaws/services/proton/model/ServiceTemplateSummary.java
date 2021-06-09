/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The service template summary data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ServiceTemplateSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceTemplateSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service template.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time when the service template was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * A description of the service template.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The service template name as displayed in the developer interface.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The time when the service template was last modified.
     * </p>
     */
    private java.util.Date lastModifiedAt;
    /**
     * <p>
     * The name of the service template.
     * </p>
     */
    private String name;
    /**
     * <p>
     * If <code>pipelineProvisioning</code> is <code>true</code>, a service pipeline is included in the service
     * template, otherwise a service pipeline <i>isn't</i> included in the service template.
     * </p>
     */
    private String pipelineProvisioning;
    /**
     * <p>
     * The ID of the recommended version of the service template.
     * </p>
     */
    private String recommendedVersion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service template.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the service template.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service template.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the service template.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service template.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the service template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceTemplateSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time when the service template was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the service template was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time when the service template was created.
     * </p>
     * 
     * @return The time when the service template was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time when the service template was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the service template was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceTemplateSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * A description of the service template.
     * </p>
     * 
     * @param description
     *        A description of the service template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the service template.
     * </p>
     * 
     * @return A description of the service template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the service template.
     * </p>
     * 
     * @param description
     *        A description of the service template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceTemplateSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The service template name as displayed in the developer interface.
     * </p>
     * 
     * @param displayName
     *        The service template name as displayed in the developer interface.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The service template name as displayed in the developer interface.
     * </p>
     * 
     * @return The service template name as displayed in the developer interface.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The service template name as displayed in the developer interface.
     * </p>
     * 
     * @param displayName
     *        The service template name as displayed in the developer interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceTemplateSummary withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The time when the service template was last modified.
     * </p>
     * 
     * @param lastModifiedAt
     *        The time when the service template was last modified.
     */

    public void setLastModifiedAt(java.util.Date lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    /**
     * <p>
     * The time when the service template was last modified.
     * </p>
     * 
     * @return The time when the service template was last modified.
     */

    public java.util.Date getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * <p>
     * The time when the service template was last modified.
     * </p>
     * 
     * @param lastModifiedAt
     *        The time when the service template was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceTemplateSummary withLastModifiedAt(java.util.Date lastModifiedAt) {
        setLastModifiedAt(lastModifiedAt);
        return this;
    }

    /**
     * <p>
     * The name of the service template.
     * </p>
     * 
     * @param name
     *        The name of the service template.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the service template.
     * </p>
     * 
     * @return The name of the service template.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the service template.
     * </p>
     * 
     * @param name
     *        The name of the service template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceTemplateSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * If <code>pipelineProvisioning</code> is <code>true</code>, a service pipeline is included in the service
     * template, otherwise a service pipeline <i>isn't</i> included in the service template.
     * </p>
     * 
     * @param pipelineProvisioning
     *        If <code>pipelineProvisioning</code> is <code>true</code>, a service pipeline is included in the service
     *        template, otherwise a service pipeline <i>isn't</i> included in the service template.
     * @see Provisioning
     */

    public void setPipelineProvisioning(String pipelineProvisioning) {
        this.pipelineProvisioning = pipelineProvisioning;
    }

    /**
     * <p>
     * If <code>pipelineProvisioning</code> is <code>true</code>, a service pipeline is included in the service
     * template, otherwise a service pipeline <i>isn't</i> included in the service template.
     * </p>
     * 
     * @return If <code>pipelineProvisioning</code> is <code>true</code>, a service pipeline is included in the service
     *         template, otherwise a service pipeline <i>isn't</i> included in the service template.
     * @see Provisioning
     */

    public String getPipelineProvisioning() {
        return this.pipelineProvisioning;
    }

    /**
     * <p>
     * If <code>pipelineProvisioning</code> is <code>true</code>, a service pipeline is included in the service
     * template, otherwise a service pipeline <i>isn't</i> included in the service template.
     * </p>
     * 
     * @param pipelineProvisioning
     *        If <code>pipelineProvisioning</code> is <code>true</code>, a service pipeline is included in the service
     *        template, otherwise a service pipeline <i>isn't</i> included in the service template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Provisioning
     */

    public ServiceTemplateSummary withPipelineProvisioning(String pipelineProvisioning) {
        setPipelineProvisioning(pipelineProvisioning);
        return this;
    }

    /**
     * <p>
     * If <code>pipelineProvisioning</code> is <code>true</code>, a service pipeline is included in the service
     * template, otherwise a service pipeline <i>isn't</i> included in the service template.
     * </p>
     * 
     * @param pipelineProvisioning
     *        If <code>pipelineProvisioning</code> is <code>true</code>, a service pipeline is included in the service
     *        template, otherwise a service pipeline <i>isn't</i> included in the service template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Provisioning
     */

    public ServiceTemplateSummary withPipelineProvisioning(Provisioning pipelineProvisioning) {
        this.pipelineProvisioning = pipelineProvisioning.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the recommended version of the service template.
     * </p>
     * 
     * @param recommendedVersion
     *        The ID of the recommended version of the service template.
     */

    public void setRecommendedVersion(String recommendedVersion) {
        this.recommendedVersion = recommendedVersion;
    }

    /**
     * <p>
     * The ID of the recommended version of the service template.
     * </p>
     * 
     * @return The ID of the recommended version of the service template.
     */

    public String getRecommendedVersion() {
        return this.recommendedVersion;
    }

    /**
     * <p>
     * The ID of the recommended version of the service template.
     * </p>
     * 
     * @param recommendedVersion
     *        The ID of the recommended version of the service template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceTemplateSummary withRecommendedVersion(String recommendedVersion) {
        setRecommendedVersion(recommendedVersion);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append("***Sensitive Data Redacted***").append(",");
        if (getLastModifiedAt() != null)
            sb.append("LastModifiedAt: ").append(getLastModifiedAt()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPipelineProvisioning() != null)
            sb.append("PipelineProvisioning: ").append(getPipelineProvisioning()).append(",");
        if (getRecommendedVersion() != null)
            sb.append("RecommendedVersion: ").append(getRecommendedVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceTemplateSummary == false)
            return false;
        ServiceTemplateSummary other = (ServiceTemplateSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getLastModifiedAt() == null ^ this.getLastModifiedAt() == null)
            return false;
        if (other.getLastModifiedAt() != null && other.getLastModifiedAt().equals(this.getLastModifiedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPipelineProvisioning() == null ^ this.getPipelineProvisioning() == null)
            return false;
        if (other.getPipelineProvisioning() != null && other.getPipelineProvisioning().equals(this.getPipelineProvisioning()) == false)
            return false;
        if (other.getRecommendedVersion() == null ^ this.getRecommendedVersion() == null)
            return false;
        if (other.getRecommendedVersion() != null && other.getRecommendedVersion().equals(this.getRecommendedVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedAt() == null) ? 0 : getLastModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPipelineProvisioning() == null) ? 0 : getPipelineProvisioning().hashCode());
        hashCode = prime * hashCode + ((getRecommendedVersion() == null) ? 0 : getRecommendedVersion().hashCode());
        return hashCode;
    }

    @Override
    public ServiceTemplateSummary clone() {
        try {
            return (ServiceTemplateSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.proton.model.transform.ServiceTemplateSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
