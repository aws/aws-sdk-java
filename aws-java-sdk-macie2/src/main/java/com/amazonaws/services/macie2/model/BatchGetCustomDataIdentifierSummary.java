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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a custom data identifier.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/BatchGetCustomDataIdentifierSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetCustomDataIdentifierSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom data identifier.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the custom data identifier was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Specifies whether the custom data identifier was deleted. If you delete a custom data identifier, Amazon Macie
     * doesn't delete it permanently. Instead, it soft deletes the identifier.
     * </p>
     */
    private Boolean deleted;
    /**
     * <p>
     * The custom description of the custom data identifier.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier for the custom data identifier.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The custom name of the custom data identifier.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom data identifier.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the custom data identifier.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom data identifier.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the custom data identifier.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom data identifier.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the custom data identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCustomDataIdentifierSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the custom data identifier was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time, in UTC and extended ISO 8601 format, when the custom data identifier was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the custom data identifier was created.
     * </p>
     * 
     * @return The date and time, in UTC and extended ISO 8601 format, when the custom data identifier was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the custom data identifier was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time, in UTC and extended ISO 8601 format, when the custom data identifier was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCustomDataIdentifierSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Specifies whether the custom data identifier was deleted. If you delete a custom data identifier, Amazon Macie
     * doesn't delete it permanently. Instead, it soft deletes the identifier.
     * </p>
     * 
     * @param deleted
     *        Specifies whether the custom data identifier was deleted. If you delete a custom data identifier, Amazon
     *        Macie doesn't delete it permanently. Instead, it soft deletes the identifier.
     */

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * <p>
     * Specifies whether the custom data identifier was deleted. If you delete a custom data identifier, Amazon Macie
     * doesn't delete it permanently. Instead, it soft deletes the identifier.
     * </p>
     * 
     * @return Specifies whether the custom data identifier was deleted. If you delete a custom data identifier, Amazon
     *         Macie doesn't delete it permanently. Instead, it soft deletes the identifier.
     */

    public Boolean getDeleted() {
        return this.deleted;
    }

    /**
     * <p>
     * Specifies whether the custom data identifier was deleted. If you delete a custom data identifier, Amazon Macie
     * doesn't delete it permanently. Instead, it soft deletes the identifier.
     * </p>
     * 
     * @param deleted
     *        Specifies whether the custom data identifier was deleted. If you delete a custom data identifier, Amazon
     *        Macie doesn't delete it permanently. Instead, it soft deletes the identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCustomDataIdentifierSummary withDeleted(Boolean deleted) {
        setDeleted(deleted);
        return this;
    }

    /**
     * <p>
     * Specifies whether the custom data identifier was deleted. If you delete a custom data identifier, Amazon Macie
     * doesn't delete it permanently. Instead, it soft deletes the identifier.
     * </p>
     * 
     * @return Specifies whether the custom data identifier was deleted. If you delete a custom data identifier, Amazon
     *         Macie doesn't delete it permanently. Instead, it soft deletes the identifier.
     */

    public Boolean isDeleted() {
        return this.deleted;
    }

    /**
     * <p>
     * The custom description of the custom data identifier.
     * </p>
     * 
     * @param description
     *        The custom description of the custom data identifier.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The custom description of the custom data identifier.
     * </p>
     * 
     * @return The custom description of the custom data identifier.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The custom description of the custom data identifier.
     * </p>
     * 
     * @param description
     *        The custom description of the custom data identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCustomDataIdentifierSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the custom data identifier.
     * </p>
     * 
     * @param id
     *        The unique identifier for the custom data identifier.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the custom data identifier.
     * </p>
     * 
     * @return The unique identifier for the custom data identifier.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the custom data identifier.
     * </p>
     * 
     * @param id
     *        The unique identifier for the custom data identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCustomDataIdentifierSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The custom name of the custom data identifier.
     * </p>
     * 
     * @param name
     *        The custom name of the custom data identifier.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The custom name of the custom data identifier.
     * </p>
     * 
     * @return The custom name of the custom data identifier.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The custom name of the custom data identifier.
     * </p>
     * 
     * @param name
     *        The custom name of the custom data identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCustomDataIdentifierSummary withName(String name) {
        setName(name);
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
        if (getDeleted() != null)
            sb.append("Deleted: ").append(getDeleted()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetCustomDataIdentifierSummary == false)
            return false;
        BatchGetCustomDataIdentifierSummary other = (BatchGetCustomDataIdentifierSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDeleted() == null ^ this.getDeleted() == null)
            return false;
        if (other.getDeleted() != null && other.getDeleted().equals(this.getDeleted()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetCustomDataIdentifierSummary clone() {
        try {
            return (BatchGetCustomDataIdentifierSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.BatchGetCustomDataIdentifierSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
