/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides a subset of information about an allow list.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/AllowListSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AllowListSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the allow list.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the allow list was created in Amazon Macie.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The custom description of the allow list.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier for the allow list.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The custom name of the allow list.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the allow list's settings were most recently changed
     * in Amazon Macie.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the allow list.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the allow list.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the allow list.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the allow list.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the allow list.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the allow list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowListSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the allow list was created in Amazon Macie.
     * </p>
     * 
     * @param createdAt
     *        The date and time, in UTC and extended ISO 8601 format, when the allow list was created in Amazon Macie.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the allow list was created in Amazon Macie.
     * </p>
     * 
     * @return The date and time, in UTC and extended ISO 8601 format, when the allow list was created in Amazon Macie.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the allow list was created in Amazon Macie.
     * </p>
     * 
     * @param createdAt
     *        The date and time, in UTC and extended ISO 8601 format, when the allow list was created in Amazon Macie.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowListSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The custom description of the allow list.
     * </p>
     * 
     * @param description
     *        The custom description of the allow list.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The custom description of the allow list.
     * </p>
     * 
     * @return The custom description of the allow list.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The custom description of the allow list.
     * </p>
     * 
     * @param description
     *        The custom description of the allow list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowListSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the allow list.
     * </p>
     * 
     * @param id
     *        The unique identifier for the allow list.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the allow list.
     * </p>
     * 
     * @return The unique identifier for the allow list.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the allow list.
     * </p>
     * 
     * @param id
     *        The unique identifier for the allow list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowListSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The custom name of the allow list.
     * </p>
     * 
     * @param name
     *        The custom name of the allow list.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The custom name of the allow list.
     * </p>
     * 
     * @return The custom name of the allow list.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The custom name of the allow list.
     * </p>
     * 
     * @param name
     *        The custom name of the allow list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowListSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the allow list's settings were most recently changed
     * in Amazon Macie.
     * </p>
     * 
     * @param updatedAt
     *        The date and time, in UTC and extended ISO 8601 format, when the allow list's settings were most recently
     *        changed in Amazon Macie.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the allow list's settings were most recently changed
     * in Amazon Macie.
     * </p>
     * 
     * @return The date and time, in UTC and extended ISO 8601 format, when the allow list's settings were most recently
     *         changed in Amazon Macie.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the allow list's settings were most recently changed
     * in Amazon Macie.
     * </p>
     * 
     * @param updatedAt
     *        The date and time, in UTC and extended ISO 8601 format, when the allow list's settings were most recently
     *        changed in Amazon Macie.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowListSummary withUpdatedAt(java.util.Date updatedAt) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof AllowListSummary == false)
            return false;
        AllowListSummary other = (AllowListSummary) obj;
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public AllowListSummary clone() {
        try {
            return (AllowListSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.AllowListSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
