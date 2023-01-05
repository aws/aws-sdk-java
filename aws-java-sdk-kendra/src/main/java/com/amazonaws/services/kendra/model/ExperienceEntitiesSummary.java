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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information for users or groups in your IAM Identity Center identity source with granted access to your
 * Amazon Kendra experience. You can create an Amazon Kendra experience such as a search application. For more
 * information on creating a search application experience, see <a
 * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
 * experience with no code</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ExperienceEntitiesSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExperienceEntitiesSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of a user or group in your IAM Identity Center identity source. For example, a user ID could be an
     * email.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * Shows the type as <code>User</code> or <code>Group</code>.
     * </p>
     */
    private String entityType;
    /**
     * <p>
     * Information about the user entity.
     * </p>
     */
    private EntityDisplayData displayData;

    /**
     * <p>
     * The identifier of a user or group in your IAM Identity Center identity source. For example, a user ID could be an
     * email.
     * </p>
     * 
     * @param entityId
     *        The identifier of a user or group in your IAM Identity Center identity source. For example, a user ID
     *        could be an email.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The identifier of a user or group in your IAM Identity Center identity source. For example, a user ID could be an
     * email.
     * </p>
     * 
     * @return The identifier of a user or group in your IAM Identity Center identity source. For example, a user ID
     *         could be an email.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The identifier of a user or group in your IAM Identity Center identity source. For example, a user ID could be an
     * email.
     * </p>
     * 
     * @param entityId
     *        The identifier of a user or group in your IAM Identity Center identity source. For example, a user ID
     *        could be an email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperienceEntitiesSummary withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * Shows the type as <code>User</code> or <code>Group</code>.
     * </p>
     * 
     * @param entityType
     *        Shows the type as <code>User</code> or <code>Group</code>.
     * @see EntityType
     */

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * <p>
     * Shows the type as <code>User</code> or <code>Group</code>.
     * </p>
     * 
     * @return Shows the type as <code>User</code> or <code>Group</code>.
     * @see EntityType
     */

    public String getEntityType() {
        return this.entityType;
    }

    /**
     * <p>
     * Shows the type as <code>User</code> or <code>Group</code>.
     * </p>
     * 
     * @param entityType
     *        Shows the type as <code>User</code> or <code>Group</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityType
     */

    public ExperienceEntitiesSummary withEntityType(String entityType) {
        setEntityType(entityType);
        return this;
    }

    /**
     * <p>
     * Shows the type as <code>User</code> or <code>Group</code>.
     * </p>
     * 
     * @param entityType
     *        Shows the type as <code>User</code> or <code>Group</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityType
     */

    public ExperienceEntitiesSummary withEntityType(EntityType entityType) {
        this.entityType = entityType.toString();
        return this;
    }

    /**
     * <p>
     * Information about the user entity.
     * </p>
     * 
     * @param displayData
     *        Information about the user entity.
     */

    public void setDisplayData(EntityDisplayData displayData) {
        this.displayData = displayData;
    }

    /**
     * <p>
     * Information about the user entity.
     * </p>
     * 
     * @return Information about the user entity.
     */

    public EntityDisplayData getDisplayData() {
        return this.displayData;
    }

    /**
     * <p>
     * Information about the user entity.
     * </p>
     * 
     * @param displayData
     *        Information about the user entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperienceEntitiesSummary withDisplayData(EntityDisplayData displayData) {
        setDisplayData(displayData);
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
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
        if (getEntityType() != null)
            sb.append("EntityType: ").append(getEntityType()).append(",");
        if (getDisplayData() != null)
            sb.append("DisplayData: ").append(getDisplayData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExperienceEntitiesSummary == false)
            return false;
        ExperienceEntitiesSummary other = (ExperienceEntitiesSummary) obj;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getEntityType() == null ^ this.getEntityType() == null)
            return false;
        if (other.getEntityType() != null && other.getEntityType().equals(this.getEntityType()) == false)
            return false;
        if (other.getDisplayData() == null ^ this.getDisplayData() == null)
            return false;
        if (other.getDisplayData() != null && other.getDisplayData().equals(this.getDisplayData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getEntityType() == null) ? 0 : getEntityType().hashCode());
        hashCode = prime * hashCode + ((getDisplayData() == null) ? 0 : getDisplayData().hashCode());
        return hashCode;
    }

    @Override
    public ExperienceEntitiesSummary clone() {
        try {
            return (ExperienceEntitiesSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.ExperienceEntitiesSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
