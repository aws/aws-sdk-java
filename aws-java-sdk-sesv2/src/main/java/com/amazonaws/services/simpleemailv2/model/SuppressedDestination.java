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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains information about an email address that is on the suppression list for your account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/SuppressedDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuppressedDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The email address that is on the suppression list for your account.
     * </p>
     */
    private String emailAddress;
    /**
     * <p>
     * The reason that the address was added to the suppression list for your account.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The date and time when the suppressed destination was last updated, shown in Unix time format.
     * </p>
     */
    private java.util.Date lastUpdateTime;
    /**
     * <p>
     * An optional value that can contain additional information about the reasons that the address was added to the
     * suppression list for your account.
     * </p>
     */
    private SuppressedDestinationAttributes attributes;

    /**
     * <p>
     * The email address that is on the suppression list for your account.
     * </p>
     * 
     * @param emailAddress
     *        The email address that is on the suppression list for your account.
     */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The email address that is on the suppression list for your account.
     * </p>
     * 
     * @return The email address that is on the suppression list for your account.
     */

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * <p>
     * The email address that is on the suppression list for your account.
     * </p>
     * 
     * @param emailAddress
     *        The email address that is on the suppression list for your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuppressedDestination withEmailAddress(String emailAddress) {
        setEmailAddress(emailAddress);
        return this;
    }

    /**
     * <p>
     * The reason that the address was added to the suppression list for your account.
     * </p>
     * 
     * @param reason
     *        The reason that the address was added to the suppression list for your account.
     * @see SuppressionListReason
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason that the address was added to the suppression list for your account.
     * </p>
     * 
     * @return The reason that the address was added to the suppression list for your account.
     * @see SuppressionListReason
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason that the address was added to the suppression list for your account.
     * </p>
     * 
     * @param reason
     *        The reason that the address was added to the suppression list for your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SuppressionListReason
     */

    public SuppressedDestination withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The reason that the address was added to the suppression list for your account.
     * </p>
     * 
     * @param reason
     *        The reason that the address was added to the suppression list for your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SuppressionListReason
     */

    public SuppressedDestination withReason(SuppressionListReason reason) {
        this.reason = reason.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the suppressed destination was last updated, shown in Unix time format.
     * </p>
     * 
     * @param lastUpdateTime
     *        The date and time when the suppressed destination was last updated, shown in Unix time format.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The date and time when the suppressed destination was last updated, shown in Unix time format.
     * </p>
     * 
     * @return The date and time when the suppressed destination was last updated, shown in Unix time format.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The date and time when the suppressed destination was last updated, shown in Unix time format.
     * </p>
     * 
     * @param lastUpdateTime
     *        The date and time when the suppressed destination was last updated, shown in Unix time format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuppressedDestination withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
        return this;
    }

    /**
     * <p>
     * An optional value that can contain additional information about the reasons that the address was added to the
     * suppression list for your account.
     * </p>
     * 
     * @param attributes
     *        An optional value that can contain additional information about the reasons that the address was added to
     *        the suppression list for your account.
     */

    public void setAttributes(SuppressedDestinationAttributes attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * An optional value that can contain additional information about the reasons that the address was added to the
     * suppression list for your account.
     * </p>
     * 
     * @return An optional value that can contain additional information about the reasons that the address was added to
     *         the suppression list for your account.
     */

    public SuppressedDestinationAttributes getAttributes() {
        return this.attributes;
    }

    /**
     * <p>
     * An optional value that can contain additional information about the reasons that the address was added to the
     * suppression list for your account.
     * </p>
     * 
     * @param attributes
     *        An optional value that can contain additional information about the reasons that the address was added to
     *        the suppression list for your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuppressedDestination withAttributes(SuppressedDestinationAttributes attributes) {
        setAttributes(attributes);
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
        if (getEmailAddress() != null)
            sb.append("EmailAddress: ").append(getEmailAddress()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuppressedDestination == false)
            return false;
        SuppressedDestination other = (SuppressedDestination) obj;
        if (other.getEmailAddress() == null ^ this.getEmailAddress() == null)
            return false;
        if (other.getEmailAddress() != null && other.getEmailAddress().equals(this.getEmailAddress()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public SuppressedDestination clone() {
        try {
            return (SuppressedDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.SuppressedDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
