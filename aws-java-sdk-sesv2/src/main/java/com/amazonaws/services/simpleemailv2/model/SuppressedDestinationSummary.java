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
 * A summary that describes the suppressed email address.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/SuppressedDestinationSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuppressedDestinationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The email address that's on the suppression list for your account.
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
     * The email address that's on the suppression list for your account.
     * </p>
     * 
     * @param emailAddress
     *        The email address that's on the suppression list for your account.
     */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The email address that's on the suppression list for your account.
     * </p>
     * 
     * @return The email address that's on the suppression list for your account.
     */

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * <p>
     * The email address that's on the suppression list for your account.
     * </p>
     * 
     * @param emailAddress
     *        The email address that's on the suppression list for your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuppressedDestinationSummary withEmailAddress(String emailAddress) {
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

    public SuppressedDestinationSummary withReason(String reason) {
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

    public SuppressedDestinationSummary withReason(SuppressionListReason reason) {
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

    public SuppressedDestinationSummary withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
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
            sb.append("LastUpdateTime: ").append(getLastUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuppressedDestinationSummary == false)
            return false;
        SuppressedDestinationSummary other = (SuppressedDestinationSummary) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public SuppressedDestinationSummary clone() {
        try {
            return (SuppressedDestinationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.SuppressedDestinationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
