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
package com.amazonaws.services.marketplacecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/DescribeEntity" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEntityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The named type of the entity, in the format of <code>EntityType@Version</code>.
     * </p>
     */
    private String entityType;
    /**
     * <p>
     * The identifier of the entity, in the format of <code>EntityId@RevisionId</code>.
     * </p>
     */
    private String entityIdentifier;
    /**
     * <p>
     * The ARN associated to the unique identifier for the change set referenced in this request.
     * </p>
     */
    private String entityArn;
    /**
     * <p>
     * The last modified date of the entity, in ISO 8601 format (2018-02-27T13:45:22Z).
     * </p>
     */
    private String lastModifiedDate;
    /**
     * <p>
     * This stringified JSON object includes the details of the entity.
     * </p>
     */
    private String details;

    /**
     * <p>
     * The named type of the entity, in the format of <code>EntityType@Version</code>.
     * </p>
     * 
     * @param entityType
     *        The named type of the entity, in the format of <code>EntityType@Version</code>.
     */

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * <p>
     * The named type of the entity, in the format of <code>EntityType@Version</code>.
     * </p>
     * 
     * @return The named type of the entity, in the format of <code>EntityType@Version</code>.
     */

    public String getEntityType() {
        return this.entityType;
    }

    /**
     * <p>
     * The named type of the entity, in the format of <code>EntityType@Version</code>.
     * </p>
     * 
     * @param entityType
     *        The named type of the entity, in the format of <code>EntityType@Version</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEntityResult withEntityType(String entityType) {
        setEntityType(entityType);
        return this;
    }

    /**
     * <p>
     * The identifier of the entity, in the format of <code>EntityId@RevisionId</code>.
     * </p>
     * 
     * @param entityIdentifier
     *        The identifier of the entity, in the format of <code>EntityId@RevisionId</code>.
     */

    public void setEntityIdentifier(String entityIdentifier) {
        this.entityIdentifier = entityIdentifier;
    }

    /**
     * <p>
     * The identifier of the entity, in the format of <code>EntityId@RevisionId</code>.
     * </p>
     * 
     * @return The identifier of the entity, in the format of <code>EntityId@RevisionId</code>.
     */

    public String getEntityIdentifier() {
        return this.entityIdentifier;
    }

    /**
     * <p>
     * The identifier of the entity, in the format of <code>EntityId@RevisionId</code>.
     * </p>
     * 
     * @param entityIdentifier
     *        The identifier of the entity, in the format of <code>EntityId@RevisionId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEntityResult withEntityIdentifier(String entityIdentifier) {
        setEntityIdentifier(entityIdentifier);
        return this;
    }

    /**
     * <p>
     * The ARN associated to the unique identifier for the change set referenced in this request.
     * </p>
     * 
     * @param entityArn
     *        The ARN associated to the unique identifier for the change set referenced in this request.
     */

    public void setEntityArn(String entityArn) {
        this.entityArn = entityArn;
    }

    /**
     * <p>
     * The ARN associated to the unique identifier for the change set referenced in this request.
     * </p>
     * 
     * @return The ARN associated to the unique identifier for the change set referenced in this request.
     */

    public String getEntityArn() {
        return this.entityArn;
    }

    /**
     * <p>
     * The ARN associated to the unique identifier for the change set referenced in this request.
     * </p>
     * 
     * @param entityArn
     *        The ARN associated to the unique identifier for the change set referenced in this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEntityResult withEntityArn(String entityArn) {
        setEntityArn(entityArn);
        return this;
    }

    /**
     * <p>
     * The last modified date of the entity, in ISO 8601 format (2018-02-27T13:45:22Z).
     * </p>
     * 
     * @param lastModifiedDate
     *        The last modified date of the entity, in ISO 8601 format (2018-02-27T13:45:22Z).
     */

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The last modified date of the entity, in ISO 8601 format (2018-02-27T13:45:22Z).
     * </p>
     * 
     * @return The last modified date of the entity, in ISO 8601 format (2018-02-27T13:45:22Z).
     */

    public String getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The last modified date of the entity, in ISO 8601 format (2018-02-27T13:45:22Z).
     * </p>
     * 
     * @param lastModifiedDate
     *        The last modified date of the entity, in ISO 8601 format (2018-02-27T13:45:22Z).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEntityResult withLastModifiedDate(String lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * This stringified JSON object includes the details of the entity.
     * </p>
     * 
     * @param details
     *        This stringified JSON object includes the details of the entity.
     */

    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * <p>
     * This stringified JSON object includes the details of the entity.
     * </p>
     * 
     * @return This stringified JSON object includes the details of the entity.
     */

    public String getDetails() {
        return this.details;
    }

    /**
     * <p>
     * This stringified JSON object includes the details of the entity.
     * </p>
     * 
     * @param details
     *        This stringified JSON object includes the details of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEntityResult withDetails(String details) {
        setDetails(details);
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
        if (getEntityType() != null)
            sb.append("EntityType: ").append(getEntityType()).append(",");
        if (getEntityIdentifier() != null)
            sb.append("EntityIdentifier: ").append(getEntityIdentifier()).append(",");
        if (getEntityArn() != null)
            sb.append("EntityArn: ").append(getEntityArn()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEntityResult == false)
            return false;
        DescribeEntityResult other = (DescribeEntityResult) obj;
        if (other.getEntityType() == null ^ this.getEntityType() == null)
            return false;
        if (other.getEntityType() != null && other.getEntityType().equals(this.getEntityType()) == false)
            return false;
        if (other.getEntityIdentifier() == null ^ this.getEntityIdentifier() == null)
            return false;
        if (other.getEntityIdentifier() != null && other.getEntityIdentifier().equals(this.getEntityIdentifier()) == false)
            return false;
        if (other.getEntityArn() == null ^ this.getEntityArn() == null)
            return false;
        if (other.getEntityArn() != null && other.getEntityArn().equals(this.getEntityArn()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityType() == null) ? 0 : getEntityType().hashCode());
        hashCode = prime * hashCode + ((getEntityIdentifier() == null) ? 0 : getEntityIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEntityArn() == null) ? 0 : getEntityArn().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEntityResult clone() {
        try {
            return (DescribeEntityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
