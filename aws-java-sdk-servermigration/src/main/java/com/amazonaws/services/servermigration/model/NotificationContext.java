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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the status of validating an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/NotificationContext" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotificationContext implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the validation.
     * </p>
     */
    private String validationId;
    /**
     * <p>
     * The status of the validation.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status message.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The ID of the validation.
     * </p>
     * 
     * @param validationId
     *        The ID of the validation.
     */

    public void setValidationId(String validationId) {
        this.validationId = validationId;
    }

    /**
     * <p>
     * The ID of the validation.
     * </p>
     * 
     * @return The ID of the validation.
     */

    public String getValidationId() {
        return this.validationId;
    }

    /**
     * <p>
     * The ID of the validation.
     * </p>
     * 
     * @param validationId
     *        The ID of the validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationContext withValidationId(String validationId) {
        setValidationId(validationId);
        return this;
    }

    /**
     * <p>
     * The status of the validation.
     * </p>
     * 
     * @param status
     *        The status of the validation.
     * @see ValidationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the validation.
     * </p>
     * 
     * @return The status of the validation.
     * @see ValidationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the validation.
     * </p>
     * 
     * @param status
     *        The status of the validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationStatus
     */

    public NotificationContext withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the validation.
     * </p>
     * 
     * @param status
     *        The status of the validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationStatus
     */

    public NotificationContext withStatus(ValidationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @param statusMessage
     *        The status message.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @return The status message.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @param statusMessage
     *        The status message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationContext withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getValidationId() != null)
            sb.append("ValidationId: ").append(getValidationId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationContext == false)
            return false;
        NotificationContext other = (NotificationContext) obj;
        if (other.getValidationId() == null ^ this.getValidationId() == null)
            return false;
        if (other.getValidationId() != null && other.getValidationId().equals(this.getValidationId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValidationId() == null) ? 0 : getValidationId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public NotificationContext clone() {
        try {
            return (NotificationContext) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servermigration.model.transform.NotificationContextMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
