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
 * A summary of a Amazon DataZone domain.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DomainSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the Amazon DataZone domain.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A timestamp of when a Amazon DataZone domain was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * A description of an Amazon DataZone domain.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the Amazon DataZone domain.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A timestamp of when a Amazon DataZone domain was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The identifier of the Amazon Web Services account that manages the domain.
     * </p>
     */
    private String managedAccountId;
    /**
     * <p>
     * A name of an Amazon DataZone domain.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The data portal URL for the Amazon DataZone domain.
     * </p>
     */
    private String portalUrl;
    /**
     * <p>
     * The status of the Amazon DataZone domain.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The ARN of the Amazon DataZone domain.
     * </p>
     * 
     * @param arn
     *        The ARN of the Amazon DataZone domain.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the Amazon DataZone domain.
     * </p>
     * 
     * @return The ARN of the Amazon DataZone domain.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the Amazon DataZone domain.
     * </p>
     * 
     * @param arn
     *        The ARN of the Amazon DataZone domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A timestamp of when a Amazon DataZone domain was created.
     * </p>
     * 
     * @param createdAt
     *        A timestamp of when a Amazon DataZone domain was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * A timestamp of when a Amazon DataZone domain was created.
     * </p>
     * 
     * @return A timestamp of when a Amazon DataZone domain was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * A timestamp of when a Amazon DataZone domain was created.
     * </p>
     * 
     * @param createdAt
     *        A timestamp of when a Amazon DataZone domain was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * A description of an Amazon DataZone domain.
     * </p>
     * 
     * @param description
     *        A description of an Amazon DataZone domain.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of an Amazon DataZone domain.
     * </p>
     * 
     * @return A description of an Amazon DataZone domain.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of an Amazon DataZone domain.
     * </p>
     * 
     * @param description
     *        A description of an Amazon DataZone domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain.
     * </p>
     * 
     * @param id
     *        The ID of the Amazon DataZone domain.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain.
     * </p>
     * 
     * @param id
     *        The ID of the Amazon DataZone domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A timestamp of when a Amazon DataZone domain was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        A timestamp of when a Amazon DataZone domain was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * A timestamp of when a Amazon DataZone domain was last updated.
     * </p>
     * 
     * @return A timestamp of when a Amazon DataZone domain was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * A timestamp of when a Amazon DataZone domain was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        A timestamp of when a Amazon DataZone domain was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainSummary withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services account that manages the domain.
     * </p>
     * 
     * @param managedAccountId
     *        The identifier of the Amazon Web Services account that manages the domain.
     */

    public void setManagedAccountId(String managedAccountId) {
        this.managedAccountId = managedAccountId;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services account that manages the domain.
     * </p>
     * 
     * @return The identifier of the Amazon Web Services account that manages the domain.
     */

    public String getManagedAccountId() {
        return this.managedAccountId;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services account that manages the domain.
     * </p>
     * 
     * @param managedAccountId
     *        The identifier of the Amazon Web Services account that manages the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainSummary withManagedAccountId(String managedAccountId) {
        setManagedAccountId(managedAccountId);
        return this;
    }

    /**
     * <p>
     * A name of an Amazon DataZone domain.
     * </p>
     * 
     * @param name
     *        A name of an Amazon DataZone domain.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name of an Amazon DataZone domain.
     * </p>
     * 
     * @return A name of an Amazon DataZone domain.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name of an Amazon DataZone domain.
     * </p>
     * 
     * @param name
     *        A name of an Amazon DataZone domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The data portal URL for the Amazon DataZone domain.
     * </p>
     * 
     * @param portalUrl
     *        The data portal URL for the Amazon DataZone domain.
     */

    public void setPortalUrl(String portalUrl) {
        this.portalUrl = portalUrl;
    }

    /**
     * <p>
     * The data portal URL for the Amazon DataZone domain.
     * </p>
     * 
     * @return The data portal URL for the Amazon DataZone domain.
     */

    public String getPortalUrl() {
        return this.portalUrl;
    }

    /**
     * <p>
     * The data portal URL for the Amazon DataZone domain.
     * </p>
     * 
     * @param portalUrl
     *        The data portal URL for the Amazon DataZone domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainSummary withPortalUrl(String portalUrl) {
        setPortalUrl(portalUrl);
        return this;
    }

    /**
     * <p>
     * The status of the Amazon DataZone domain.
     * </p>
     * 
     * @param status
     *        The status of the Amazon DataZone domain.
     * @see DomainStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Amazon DataZone domain.
     * </p>
     * 
     * @return The status of the Amazon DataZone domain.
     * @see DomainStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the Amazon DataZone domain.
     * </p>
     * 
     * @param status
     *        The status of the Amazon DataZone domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainStatus
     */

    public DomainSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the Amazon DataZone domain.
     * </p>
     * 
     * @param status
     *        The status of the Amazon DataZone domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainStatus
     */

    public DomainSummary withStatus(DomainStatus status) {
        this.status = status.toString();
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getManagedAccountId() != null)
            sb.append("ManagedAccountId: ").append(getManagedAccountId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getPortalUrl() != null)
            sb.append("PortalUrl: ").append(getPortalUrl()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainSummary == false)
            return false;
        DomainSummary other = (DomainSummary) obj;
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
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getManagedAccountId() == null ^ this.getManagedAccountId() == null)
            return false;
        if (other.getManagedAccountId() != null && other.getManagedAccountId().equals(this.getManagedAccountId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPortalUrl() == null ^ this.getPortalUrl() == null)
            return false;
        if (other.getPortalUrl() != null && other.getPortalUrl().equals(this.getPortalUrl()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getManagedAccountId() == null) ? 0 : getManagedAccountId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPortalUrl() == null) ? 0 : getPortalUrl().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DomainSummary clone() {
        try {
            return (DomainSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.DomainSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
