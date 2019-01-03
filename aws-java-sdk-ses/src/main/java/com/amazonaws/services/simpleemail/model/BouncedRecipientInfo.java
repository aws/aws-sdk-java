/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Recipient-related information to include in the Delivery Status Notification (DSN) when an email that Amazon SES
 * receives on your behalf bounces.
 * </p>
 * <p>
 * For information about receiving email through Amazon SES, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html">Amazon SES Developer Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/BouncedRecipientInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BouncedRecipientInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The email address of the recipient of the bounced email.
     * </p>
     */
    private String recipient;
    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the
     * sending authorization policy that permits you to receive email for the recipient of the bounced email. For more
     * information about sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     */
    private String recipientArn;
    /**
     * <p>
     * The reason for the bounce. You must provide either this parameter or <code>RecipientDsnFields</code>.
     * </p>
     */
    private String bounceType;
    /**
     * <p>
     * Recipient-related DSN fields, most of which would normally be filled in automatically when provided with a
     * <code>BounceType</code>. You must provide either this parameter or <code>BounceType</code>.
     * </p>
     */
    private RecipientDsnFields recipientDsnFields;

    /**
     * <p>
     * The email address of the recipient of the bounced email.
     * </p>
     * 
     * @param recipient
     *        The email address of the recipient of the bounced email.
     */

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    /**
     * <p>
     * The email address of the recipient of the bounced email.
     * </p>
     * 
     * @return The email address of the recipient of the bounced email.
     */

    public String getRecipient() {
        return this.recipient;
    }

    /**
     * <p>
     * The email address of the recipient of the bounced email.
     * </p>
     * 
     * @param recipient
     *        The email address of the recipient of the bounced email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BouncedRecipientInfo withRecipient(String recipient) {
        setRecipient(recipient);
        return this;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the
     * sending authorization policy that permits you to receive email for the recipient of the bounced email. For more
     * information about sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * 
     * @param recipientArn
     *        This parameter is used only for sending authorization. It is the ARN of the identity that is associated
     *        with the sending authorization policy that permits you to receive email for the recipient of the bounced
     *        email. For more information about sending authorization, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *        Developer Guide</a>.
     */

    public void setRecipientArn(String recipientArn) {
        this.recipientArn = recipientArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the
     * sending authorization policy that permits you to receive email for the recipient of the bounced email. For more
     * information about sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * 
     * @return This parameter is used only for sending authorization. It is the ARN of the identity that is associated
     *         with the sending authorization policy that permits you to receive email for the recipient of the bounced
     *         email. For more information about sending authorization, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *         Developer Guide</a>.
     */

    public String getRecipientArn() {
        return this.recipientArn;
    }

    /**
     * <p>
     * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the
     * sending authorization policy that permits you to receive email for the recipient of the bounced email. For more
     * information about sending authorization, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
     * Guide</a>.
     * </p>
     * 
     * @param recipientArn
     *        This parameter is used only for sending authorization. It is the ARN of the identity that is associated
     *        with the sending authorization policy that permits you to receive email for the recipient of the bounced
     *        email. For more information about sending authorization, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES
     *        Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BouncedRecipientInfo withRecipientArn(String recipientArn) {
        setRecipientArn(recipientArn);
        return this;
    }

    /**
     * <p>
     * The reason for the bounce. You must provide either this parameter or <code>RecipientDsnFields</code>.
     * </p>
     * 
     * @param bounceType
     *        The reason for the bounce. You must provide either this parameter or <code>RecipientDsnFields</code>.
     * @see BounceType
     */

    public void setBounceType(String bounceType) {
        this.bounceType = bounceType;
    }

    /**
     * <p>
     * The reason for the bounce. You must provide either this parameter or <code>RecipientDsnFields</code>.
     * </p>
     * 
     * @return The reason for the bounce. You must provide either this parameter or <code>RecipientDsnFields</code>.
     * @see BounceType
     */

    public String getBounceType() {
        return this.bounceType;
    }

    /**
     * <p>
     * The reason for the bounce. You must provide either this parameter or <code>RecipientDsnFields</code>.
     * </p>
     * 
     * @param bounceType
     *        The reason for the bounce. You must provide either this parameter or <code>RecipientDsnFields</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BounceType
     */

    public BouncedRecipientInfo withBounceType(String bounceType) {
        setBounceType(bounceType);
        return this;
    }

    /**
     * <p>
     * The reason for the bounce. You must provide either this parameter or <code>RecipientDsnFields</code>.
     * </p>
     * 
     * @param bounceType
     *        The reason for the bounce. You must provide either this parameter or <code>RecipientDsnFields</code>.
     * @see BounceType
     */

    public void setBounceType(BounceType bounceType) {
        withBounceType(bounceType);
    }

    /**
     * <p>
     * The reason for the bounce. You must provide either this parameter or <code>RecipientDsnFields</code>.
     * </p>
     * 
     * @param bounceType
     *        The reason for the bounce. You must provide either this parameter or <code>RecipientDsnFields</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BounceType
     */

    public BouncedRecipientInfo withBounceType(BounceType bounceType) {
        this.bounceType = bounceType.toString();
        return this;
    }

    /**
     * <p>
     * Recipient-related DSN fields, most of which would normally be filled in automatically when provided with a
     * <code>BounceType</code>. You must provide either this parameter or <code>BounceType</code>.
     * </p>
     * 
     * @param recipientDsnFields
     *        Recipient-related DSN fields, most of which would normally be filled in automatically when provided with a
     *        <code>BounceType</code>. You must provide either this parameter or <code>BounceType</code>.
     */

    public void setRecipientDsnFields(RecipientDsnFields recipientDsnFields) {
        this.recipientDsnFields = recipientDsnFields;
    }

    /**
     * <p>
     * Recipient-related DSN fields, most of which would normally be filled in automatically when provided with a
     * <code>BounceType</code>. You must provide either this parameter or <code>BounceType</code>.
     * </p>
     * 
     * @return Recipient-related DSN fields, most of which would normally be filled in automatically when provided with
     *         a <code>BounceType</code>. You must provide either this parameter or <code>BounceType</code>.
     */

    public RecipientDsnFields getRecipientDsnFields() {
        return this.recipientDsnFields;
    }

    /**
     * <p>
     * Recipient-related DSN fields, most of which would normally be filled in automatically when provided with a
     * <code>BounceType</code>. You must provide either this parameter or <code>BounceType</code>.
     * </p>
     * 
     * @param recipientDsnFields
     *        Recipient-related DSN fields, most of which would normally be filled in automatically when provided with a
     *        <code>BounceType</code>. You must provide either this parameter or <code>BounceType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BouncedRecipientInfo withRecipientDsnFields(RecipientDsnFields recipientDsnFields) {
        setRecipientDsnFields(recipientDsnFields);
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
        if (getRecipient() != null)
            sb.append("Recipient: ").append(getRecipient()).append(",");
        if (getRecipientArn() != null)
            sb.append("RecipientArn: ").append(getRecipientArn()).append(",");
        if (getBounceType() != null)
            sb.append("BounceType: ").append(getBounceType()).append(",");
        if (getRecipientDsnFields() != null)
            sb.append("RecipientDsnFields: ").append(getRecipientDsnFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BouncedRecipientInfo == false)
            return false;
        BouncedRecipientInfo other = (BouncedRecipientInfo) obj;
        if (other.getRecipient() == null ^ this.getRecipient() == null)
            return false;
        if (other.getRecipient() != null && other.getRecipient().equals(this.getRecipient()) == false)
            return false;
        if (other.getRecipientArn() == null ^ this.getRecipientArn() == null)
            return false;
        if (other.getRecipientArn() != null && other.getRecipientArn().equals(this.getRecipientArn()) == false)
            return false;
        if (other.getBounceType() == null ^ this.getBounceType() == null)
            return false;
        if (other.getBounceType() != null && other.getBounceType().equals(this.getBounceType()) == false)
            return false;
        if (other.getRecipientDsnFields() == null ^ this.getRecipientDsnFields() == null)
            return false;
        if (other.getRecipientDsnFields() != null && other.getRecipientDsnFields().equals(this.getRecipientDsnFields()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecipient() == null) ? 0 : getRecipient().hashCode());
        hashCode = prime * hashCode + ((getRecipientArn() == null) ? 0 : getRecipientArn().hashCode());
        hashCode = prime * hashCode + ((getBounceType() == null) ? 0 : getBounceType().hashCode());
        hashCode = prime * hashCode + ((getRecipientDsnFields() == null) ? 0 : getRecipientDsnFields().hashCode());
        return hashCode;
    }

    @Override
    public BouncedRecipientInfo clone() {
        try {
            return (BouncedRecipientInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
