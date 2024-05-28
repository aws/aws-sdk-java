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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An entry that appears when a <code>KeyRegistration</code> update to Amazon QuickSight fails.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/FailedKeyRegistrationEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailedKeyRegistrationEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the KMS key that failed to update.
     * </p>
     */
    private String keyArn;
    /**
     * <p>
     * A message that provides information about why a <code>FailedKeyRegistrationEntry</code> error occurred.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The HTTP status of a <code>FailedKeyRegistrationEntry</code> error.
     * </p>
     */
    private Integer statusCode;
    /**
     * <p>
     * A boolean that indicates whether a <code>FailedKeyRegistrationEntry</code> resulted from user error. If the value
     * of this property is <code>True</code>, the error was caused by user error. If the value of this property is
     * <code>False</code>, the error occurred on the backend. If your job continues fail and with a <code>False</code>
     * <code>SenderFault</code> value, contact Amazon Web Services Support.
     * </p>
     */
    private Boolean senderFault;

    /**
     * <p>
     * The ARN of the KMS key that failed to update.
     * </p>
     * 
     * @param keyArn
     *        The ARN of the KMS key that failed to update.
     */

    public void setKeyArn(String keyArn) {
        this.keyArn = keyArn;
    }

    /**
     * <p>
     * The ARN of the KMS key that failed to update.
     * </p>
     * 
     * @return The ARN of the KMS key that failed to update.
     */

    public String getKeyArn() {
        return this.keyArn;
    }

    /**
     * <p>
     * The ARN of the KMS key that failed to update.
     * </p>
     * 
     * @param keyArn
     *        The ARN of the KMS key that failed to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedKeyRegistrationEntry withKeyArn(String keyArn) {
        setKeyArn(keyArn);
        return this;
    }

    /**
     * <p>
     * A message that provides information about why a <code>FailedKeyRegistrationEntry</code> error occurred.
     * </p>
     * 
     * @param message
     *        A message that provides information about why a <code>FailedKeyRegistrationEntry</code> error occurred.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message that provides information about why a <code>FailedKeyRegistrationEntry</code> error occurred.
     * </p>
     * 
     * @return A message that provides information about why a <code>FailedKeyRegistrationEntry</code> error occurred.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message that provides information about why a <code>FailedKeyRegistrationEntry</code> error occurred.
     * </p>
     * 
     * @param message
     *        A message that provides information about why a <code>FailedKeyRegistrationEntry</code> error occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedKeyRegistrationEntry withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The HTTP status of a <code>FailedKeyRegistrationEntry</code> error.
     * </p>
     * 
     * @param statusCode
     *        The HTTP status of a <code>FailedKeyRegistrationEntry</code> error.
     */

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The HTTP status of a <code>FailedKeyRegistrationEntry</code> error.
     * </p>
     * 
     * @return The HTTP status of a <code>FailedKeyRegistrationEntry</code> error.
     */

    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The HTTP status of a <code>FailedKeyRegistrationEntry</code> error.
     * </p>
     * 
     * @param statusCode
     *        The HTTP status of a <code>FailedKeyRegistrationEntry</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedKeyRegistrationEntry withStatusCode(Integer statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * A boolean that indicates whether a <code>FailedKeyRegistrationEntry</code> resulted from user error. If the value
     * of this property is <code>True</code>, the error was caused by user error. If the value of this property is
     * <code>False</code>, the error occurred on the backend. If your job continues fail and with a <code>False</code>
     * <code>SenderFault</code> value, contact Amazon Web Services Support.
     * </p>
     * 
     * @param senderFault
     *        A boolean that indicates whether a <code>FailedKeyRegistrationEntry</code> resulted from user error. If
     *        the value of this property is <code>True</code>, the error was caused by user error. If the value of this
     *        property is <code>False</code>, the error occurred on the backend. If your job continues fail and with a
     *        <code>False</code> <code>SenderFault</code> value, contact Amazon Web Services Support.
     */

    public void setSenderFault(Boolean senderFault) {
        this.senderFault = senderFault;
    }

    /**
     * <p>
     * A boolean that indicates whether a <code>FailedKeyRegistrationEntry</code> resulted from user error. If the value
     * of this property is <code>True</code>, the error was caused by user error. If the value of this property is
     * <code>False</code>, the error occurred on the backend. If your job continues fail and with a <code>False</code>
     * <code>SenderFault</code> value, contact Amazon Web Services Support.
     * </p>
     * 
     * @return A boolean that indicates whether a <code>FailedKeyRegistrationEntry</code> resulted from user error. If
     *         the value of this property is <code>True</code>, the error was caused by user error. If the value of this
     *         property is <code>False</code>, the error occurred on the backend. If your job continues fail and with a
     *         <code>False</code> <code>SenderFault</code> value, contact Amazon Web Services Support.
     */

    public Boolean getSenderFault() {
        return this.senderFault;
    }

    /**
     * <p>
     * A boolean that indicates whether a <code>FailedKeyRegistrationEntry</code> resulted from user error. If the value
     * of this property is <code>True</code>, the error was caused by user error. If the value of this property is
     * <code>False</code>, the error occurred on the backend. If your job continues fail and with a <code>False</code>
     * <code>SenderFault</code> value, contact Amazon Web Services Support.
     * </p>
     * 
     * @param senderFault
     *        A boolean that indicates whether a <code>FailedKeyRegistrationEntry</code> resulted from user error. If
     *        the value of this property is <code>True</code>, the error was caused by user error. If the value of this
     *        property is <code>False</code>, the error occurred on the backend. If your job continues fail and with a
     *        <code>False</code> <code>SenderFault</code> value, contact Amazon Web Services Support.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedKeyRegistrationEntry withSenderFault(Boolean senderFault) {
        setSenderFault(senderFault);
        return this;
    }

    /**
     * <p>
     * A boolean that indicates whether a <code>FailedKeyRegistrationEntry</code> resulted from user error. If the value
     * of this property is <code>True</code>, the error was caused by user error. If the value of this property is
     * <code>False</code>, the error occurred on the backend. If your job continues fail and with a <code>False</code>
     * <code>SenderFault</code> value, contact Amazon Web Services Support.
     * </p>
     * 
     * @return A boolean that indicates whether a <code>FailedKeyRegistrationEntry</code> resulted from user error. If
     *         the value of this property is <code>True</code>, the error was caused by user error. If the value of this
     *         property is <code>False</code>, the error occurred on the backend. If your job continues fail and with a
     *         <code>False</code> <code>SenderFault</code> value, contact Amazon Web Services Support.
     */

    public Boolean isSenderFault() {
        return this.senderFault;
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
        if (getKeyArn() != null)
            sb.append("KeyArn: ").append(getKeyArn()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getSenderFault() != null)
            sb.append("SenderFault: ").append(getSenderFault());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailedKeyRegistrationEntry == false)
            return false;
        FailedKeyRegistrationEntry other = (FailedKeyRegistrationEntry) obj;
        if (other.getKeyArn() == null ^ this.getKeyArn() == null)
            return false;
        if (other.getKeyArn() != null && other.getKeyArn().equals(this.getKeyArn()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getSenderFault() == null ^ this.getSenderFault() == null)
            return false;
        if (other.getSenderFault() != null && other.getSenderFault().equals(this.getSenderFault()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyArn() == null) ? 0 : getKeyArn().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getSenderFault() == null) ? 0 : getSenderFault().hashCode());
        return hashCode;
    }

    @Override
    public FailedKeyRegistrationEntry clone() {
        try {
            return (FailedKeyRegistrationEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FailedKeyRegistrationEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
