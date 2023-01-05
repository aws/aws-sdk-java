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
 * Information on the users or groups in your IAM Identity Center identity source that failed to properly configure with
 * your Amazon Kendra experience.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/FailedEntity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailedEntity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the user or group in your IAM Identity Center identity source. For example, a user ID could be
     * an email.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * The reason the user or group in your IAM Identity Center identity source failed to properly configure with your
     * Amazon Kendra experience.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The identifier of the user or group in your IAM Identity Center identity source. For example, a user ID could be
     * an email.
     * </p>
     * 
     * @param entityId
     *        The identifier of the user or group in your IAM Identity Center identity source. For example, a user ID
     *        could be an email.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The identifier of the user or group in your IAM Identity Center identity source. For example, a user ID could be
     * an email.
     * </p>
     * 
     * @return The identifier of the user or group in your IAM Identity Center identity source. For example, a user ID
     *         could be an email.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The identifier of the user or group in your IAM Identity Center identity source. For example, a user ID could be
     * an email.
     * </p>
     * 
     * @param entityId
     *        The identifier of the user or group in your IAM Identity Center identity source. For example, a user ID
     *        could be an email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedEntity withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The reason the user or group in your IAM Identity Center identity source failed to properly configure with your
     * Amazon Kendra experience.
     * </p>
     * 
     * @param errorMessage
     *        The reason the user or group in your IAM Identity Center identity source failed to properly configure with
     *        your Amazon Kendra experience.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The reason the user or group in your IAM Identity Center identity source failed to properly configure with your
     * Amazon Kendra experience.
     * </p>
     * 
     * @return The reason the user or group in your IAM Identity Center identity source failed to properly configure
     *         with your Amazon Kendra experience.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The reason the user or group in your IAM Identity Center identity source failed to properly configure with your
     * Amazon Kendra experience.
     * </p>
     * 
     * @param errorMessage
     *        The reason the user or group in your IAM Identity Center identity source failed to properly configure with
     *        your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedEntity withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailedEntity == false)
            return false;
        FailedEntity other = (FailedEntity) obj;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public FailedEntity clone() {
        try {
            return (FailedEntity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.FailedEntityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
