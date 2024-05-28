/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of an environment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/EnvironmentSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the Amazon Web Services account in which an environment exists.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The Amazon Web Services Region in which an environment exists.
     * </p>
     */
    private String awsAccountRegion;
    /**
     * <p>
     * The timestamp of when the environment was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Amazon DataZone user who created the environment.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The description of the environment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which the environment exists.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The identifier of the environment profile with which the environment was created.
     * </p>
     */
    private String environmentProfileId;
    /**
     * <p>
     * The identifier of the environment.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the environment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The identifier of the project in which the environment exists.
     * </p>
     */
    private String projectId;
    /**
     * <p>
     * The provider of the environment.
     * </p>
     */
    private String provider;
    /**
     * <p>
     * The status of the environment.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The timestamp of when the environment was updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The identifier of the Amazon Web Services account in which an environment exists.
     * </p>
     * 
     * @param awsAccountId
     *        The identifier of the Amazon Web Services account in which an environment exists.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services account in which an environment exists.
     * </p>
     * 
     * @return The identifier of the Amazon Web Services account in which an environment exists.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services account in which an environment exists.
     * </p>
     * 
     * @param awsAccountId
     *        The identifier of the Amazon Web Services account in which an environment exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentSummary withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region in which an environment exists.
     * </p>
     * 
     * @param awsAccountRegion
     *        The Amazon Web Services Region in which an environment exists.
     */

    public void setAwsAccountRegion(String awsAccountRegion) {
        this.awsAccountRegion = awsAccountRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region in which an environment exists.
     * </p>
     * 
     * @return The Amazon Web Services Region in which an environment exists.
     */

    public String getAwsAccountRegion() {
        return this.awsAccountRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region in which an environment exists.
     * </p>
     * 
     * @param awsAccountRegion
     *        The Amazon Web Services Region in which an environment exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentSummary withAwsAccountRegion(String awsAccountRegion) {
        setAwsAccountRegion(awsAccountRegion);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the environment was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the environment was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the environment was created.
     * </p>
     * 
     * @return The timestamp of when the environment was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the environment was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the environment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the environment.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone user who created the environment.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the environment.
     * </p>
     * 
     * @return The Amazon DataZone user who created the environment.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the environment.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone user who created the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentSummary withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The description of the environment.
     * </p>
     * 
     * @param description
     *        The description of the environment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the environment.
     * </p>
     * 
     * @return The description of the environment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the environment.
     * </p>
     * 
     * @param description
     *        The description of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which the environment exists.
     * </p>
     * 
     * @param domainId
     *        The identifier of the Amazon DataZone domain in which the environment exists.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which the environment exists.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain in which the environment exists.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which the environment exists.
     * </p>
     * 
     * @param domainId
     *        The identifier of the Amazon DataZone domain in which the environment exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentSummary withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The identifier of the environment profile with which the environment was created.
     * </p>
     * 
     * @param environmentProfileId
     *        The identifier of the environment profile with which the environment was created.
     */

    public void setEnvironmentProfileId(String environmentProfileId) {
        this.environmentProfileId = environmentProfileId;
    }

    /**
     * <p>
     * The identifier of the environment profile with which the environment was created.
     * </p>
     * 
     * @return The identifier of the environment profile with which the environment was created.
     */

    public String getEnvironmentProfileId() {
        return this.environmentProfileId;
    }

    /**
     * <p>
     * The identifier of the environment profile with which the environment was created.
     * </p>
     * 
     * @param environmentProfileId
     *        The identifier of the environment profile with which the environment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentSummary withEnvironmentProfileId(String environmentProfileId) {
        setEnvironmentProfileId(environmentProfileId);
        return this;
    }

    /**
     * <p>
     * The identifier of the environment.
     * </p>
     * 
     * @param id
     *        The identifier of the environment.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the environment.
     * </p>
     * 
     * @return The identifier of the environment.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the environment.
     * </p>
     * 
     * @param id
     *        The identifier of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @param name
     *        The name of the environment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @return The name of the environment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @param name
     *        The name of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The identifier of the project in which the environment exists.
     * </p>
     * 
     * @param projectId
     *        The identifier of the project in which the environment exists.
     */

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * <p>
     * The identifier of the project in which the environment exists.
     * </p>
     * 
     * @return The identifier of the project in which the environment exists.
     */

    public String getProjectId() {
        return this.projectId;
    }

    /**
     * <p>
     * The identifier of the project in which the environment exists.
     * </p>
     * 
     * @param projectId
     *        The identifier of the project in which the environment exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentSummary withProjectId(String projectId) {
        setProjectId(projectId);
        return this;
    }

    /**
     * <p>
     * The provider of the environment.
     * </p>
     * 
     * @param provider
     *        The provider of the environment.
     */

    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * The provider of the environment.
     * </p>
     * 
     * @return The provider of the environment.
     */

    public String getProvider() {
        return this.provider;
    }

    /**
     * <p>
     * The provider of the environment.
     * </p>
     * 
     * @param provider
     *        The provider of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentSummary withProvider(String provider) {
        setProvider(provider);
        return this;
    }

    /**
     * <p>
     * The status of the environment.
     * </p>
     * 
     * @param status
     *        The status of the environment.
     * @see EnvironmentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the environment.
     * </p>
     * 
     * @return The status of the environment.
     * @see EnvironmentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the environment.
     * </p>
     * 
     * @param status
     *        The status of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentStatus
     */

    public EnvironmentSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the environment.
     * </p>
     * 
     * @param status
     *        The status of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentStatus
     */

    public EnvironmentSummary withStatus(EnvironmentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp of when the environment was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the environment was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the environment was updated.
     * </p>
     * 
     * @return The timestamp of when the environment was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the environment was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the environment was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getAwsAccountRegion() != null)
            sb.append("AwsAccountRegion: ").append(getAwsAccountRegion()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getEnvironmentProfileId() != null)
            sb.append("EnvironmentProfileId: ").append(getEnvironmentProfileId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId()).append(",");
        if (getProvider() != null)
            sb.append("Provider: ").append(getProvider()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentSummary == false)
            return false;
        EnvironmentSummary other = (EnvironmentSummary) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAwsAccountRegion() == null ^ this.getAwsAccountRegion() == null)
            return false;
        if (other.getAwsAccountRegion() != null && other.getAwsAccountRegion().equals(this.getAwsAccountRegion()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getEnvironmentProfileId() == null ^ this.getEnvironmentProfileId() == null)
            return false;
        if (other.getEnvironmentProfileId() != null && other.getEnvironmentProfileId().equals(this.getEnvironmentProfileId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null && other.getProjectId().equals(this.getProjectId()) == false)
            return false;
        if (other.getProvider() == null ^ this.getProvider() == null)
            return false;
        if (other.getProvider() != null && other.getProvider().equals(this.getProvider()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountRegion() == null) ? 0 : getAwsAccountRegion().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentProfileId() == null) ? 0 : getEnvironmentProfileId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public EnvironmentSummary clone() {
        try {
            return (EnvironmentSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.EnvironmentSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
