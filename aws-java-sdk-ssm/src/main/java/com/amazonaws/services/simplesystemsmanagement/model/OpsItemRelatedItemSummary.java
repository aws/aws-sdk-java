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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about related-item resources for an OpsItem.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/OpsItemRelatedItemSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpsItemRelatedItemSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The OpsItem ID.
     * </p>
     */
    private String opsItemId;
    /**
     * <p>
     * The association ID.
     * </p>
     */
    private String associationId;
    /**
     * <p>
     * The resource type.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The association type.
     * </p>
     */
    private String associationType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the related-item resource.
     * </p>
     */
    private String resourceUri;

    private OpsItemIdentity createdBy;
    /**
     * <p>
     * The time the related-item association was created.
     * </p>
     */
    private java.util.Date createdTime;

    private OpsItemIdentity lastModifiedBy;
    /**
     * <p>
     * The time the related-item association was last updated.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The OpsItem ID.
     * </p>
     * 
     * @param opsItemId
     *        The OpsItem ID.
     */

    public void setOpsItemId(String opsItemId) {
        this.opsItemId = opsItemId;
    }

    /**
     * <p>
     * The OpsItem ID.
     * </p>
     * 
     * @return The OpsItem ID.
     */

    public String getOpsItemId() {
        return this.opsItemId;
    }

    /**
     * <p>
     * The OpsItem ID.
     * </p>
     * 
     * @param opsItemId
     *        The OpsItem ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemRelatedItemSummary withOpsItemId(String opsItemId) {
        setOpsItemId(opsItemId);
        return this;
    }

    /**
     * <p>
     * The association ID.
     * </p>
     * 
     * @param associationId
     *        The association ID.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The association ID.
     * </p>
     * 
     * @return The association ID.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The association ID.
     * </p>
     * 
     * @param associationId
     *        The association ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemRelatedItemSummary withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @return The resource type.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemRelatedItemSummary withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The association type.
     * </p>
     * 
     * @param associationType
     *        The association type.
     */

    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    /**
     * <p>
     * The association type.
     * </p>
     * 
     * @return The association type.
     */

    public String getAssociationType() {
        return this.associationType;
    }

    /**
     * <p>
     * The association type.
     * </p>
     * 
     * @param associationType
     *        The association type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemRelatedItemSummary withAssociationType(String associationType) {
        setAssociationType(associationType);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the related-item resource.
     * </p>
     * 
     * @param resourceUri
     *        The Amazon Resource Name (ARN) of the related-item resource.
     */

    public void setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the related-item resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the related-item resource.
     */

    public String getResourceUri() {
        return this.resourceUri;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the related-item resource.
     * </p>
     * 
     * @param resourceUri
     *        The Amazon Resource Name (ARN) of the related-item resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemRelatedItemSummary withResourceUri(String resourceUri) {
        setResourceUri(resourceUri);
        return this;
    }

    /**
     * @param createdBy
     */

    public void setCreatedBy(OpsItemIdentity createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return
     */

    public OpsItemIdentity getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @param createdBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemRelatedItemSummary withCreatedBy(OpsItemIdentity createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The time the related-item association was created.
     * </p>
     * 
     * @param createdTime
     *        The time the related-item association was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time the related-item association was created.
     * </p>
     * 
     * @return The time the related-item association was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time the related-item association was created.
     * </p>
     * 
     * @param createdTime
     *        The time the related-item association was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemRelatedItemSummary withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * @param lastModifiedBy
     */

    public void setLastModifiedBy(OpsItemIdentity lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * @return
     */

    public OpsItemIdentity getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * @param lastModifiedBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemRelatedItemSummary withLastModifiedBy(OpsItemIdentity lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * <p>
     * The time the related-item association was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time the related-item association was last updated.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The time the related-item association was last updated.
     * </p>
     * 
     * @return The time the related-item association was last updated.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The time the related-item association was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time the related-item association was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemRelatedItemSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getOpsItemId() != null)
            sb.append("OpsItemId: ").append(getOpsItemId()).append(",");
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getAssociationType() != null)
            sb.append("AssociationType: ").append(getAssociationType()).append(",");
        if (getResourceUri() != null)
            sb.append("ResourceUri: ").append(getResourceUri()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpsItemRelatedItemSummary == false)
            return false;
        OpsItemRelatedItemSummary other = (OpsItemRelatedItemSummary) obj;
        if (other.getOpsItemId() == null ^ this.getOpsItemId() == null)
            return false;
        if (other.getOpsItemId() != null && other.getOpsItemId().equals(this.getOpsItemId()) == false)
            return false;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getAssociationType() == null ^ this.getAssociationType() == null)
            return false;
        if (other.getAssociationType() != null && other.getAssociationType().equals(this.getAssociationType()) == false)
            return false;
        if (other.getResourceUri() == null ^ this.getResourceUri() == null)
            return false;
        if (other.getResourceUri() != null && other.getResourceUri().equals(this.getResourceUri()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOpsItemId() == null) ? 0 : getOpsItemId().hashCode());
        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getAssociationType() == null) ? 0 : getAssociationType().hashCode());
        hashCode = prime * hashCode + ((getResourceUri() == null) ? 0 : getResourceUri().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public OpsItemRelatedItemSummary clone() {
        try {
            return (OpsItemRelatedItemSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.OpsItemRelatedItemSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
