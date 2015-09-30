/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * Recipient-related information to include in the Delivery Status
 * Notification (DSN) when an email that Amazon SES receives on your
 * behalf bounces.
 * </p>
 * <p>
 * For information about receiving email through Amazon SES, see the
 * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email.html"> Amazon SES Developer Guide </a>
 * .
 * </p>
 */
public class BouncedRecipientInfo implements Serializable, Cloneable {

    /**
     * The email address of the recipient of the bounced email.
     */
    private String recipient;

    /**
     * This parameter is used only for sending authorization. It is the ARN
     * of the identity that is associated with the sending authorization
     * policy that permits you to receive email for the recipient of the
     * bounced email. For more information about sending authorization, see
     * the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon
     * SES Developer Guide</a>.
     */
    private String recipientArn;

    /**
     * The reason for the bounce. You must provide either this parameter or
     * <code>RecipientDsnFields</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DoesNotExist, MessageTooLarge, ExceededQuota, ContentRejected, Undefined, TemporaryFailure
     */
    private String bounceType;

    /**
     * Recipient-related DSN fields, most of which would normally be filled
     * in automatically when provided with a <code>BounceType</code>. You
     * must provide either this parameter or <code>BounceType</code>.
     */
    private RecipientDsnFields recipientDsnFields;

    /**
     * The email address of the recipient of the bounced email.
     *
     * @return The email address of the recipient of the bounced email.
     */
    public String getRecipient() {
        return recipient;
    }
    
    /**
     * The email address of the recipient of the bounced email.
     *
     * @param recipient The email address of the recipient of the bounced email.
     */
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
    
    /**
     * The email address of the recipient of the bounced email.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recipient The email address of the recipient of the bounced email.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public BouncedRecipientInfo withRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    /**
     * This parameter is used only for sending authorization. It is the ARN
     * of the identity that is associated with the sending authorization
     * policy that permits you to receive email for the recipient of the
     * bounced email. For more information about sending authorization, see
     * the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon
     * SES Developer Guide</a>.
     *
     * @return This parameter is used only for sending authorization. It is the ARN
     *         of the identity that is associated with the sending authorization
     *         policy that permits you to receive email for the recipient of the
     *         bounced email. For more information about sending authorization, see
     *         the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon
     *         SES Developer Guide</a>.
     */
    public String getRecipientArn() {
        return recipientArn;
    }
    
    /**
     * This parameter is used only for sending authorization. It is the ARN
     * of the identity that is associated with the sending authorization
     * policy that permits you to receive email for the recipient of the
     * bounced email. For more information about sending authorization, see
     * the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon
     * SES Developer Guide</a>.
     *
     * @param recipientArn This parameter is used only for sending authorization. It is the ARN
     *         of the identity that is associated with the sending authorization
     *         policy that permits you to receive email for the recipient of the
     *         bounced email. For more information about sending authorization, see
     *         the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon
     *         SES Developer Guide</a>.
     */
    public void setRecipientArn(String recipientArn) {
        this.recipientArn = recipientArn;
    }
    
    /**
     * This parameter is used only for sending authorization. It is the ARN
     * of the identity that is associated with the sending authorization
     * policy that permits you to receive email for the recipient of the
     * bounced email. For more information about sending authorization, see
     * the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon
     * SES Developer Guide</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recipientArn This parameter is used only for sending authorization. It is the ARN
     *         of the identity that is associated with the sending authorization
     *         policy that permits you to receive email for the recipient of the
     *         bounced email. For more information about sending authorization, see
     *         the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon
     *         SES Developer Guide</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public BouncedRecipientInfo withRecipientArn(String recipientArn) {
        this.recipientArn = recipientArn;
        return this;
    }

    /**
     * The reason for the bounce. You must provide either this parameter or
     * <code>RecipientDsnFields</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DoesNotExist, MessageTooLarge, ExceededQuota, ContentRejected, Undefined, TemporaryFailure
     *
     * @return The reason for the bounce. You must provide either this parameter or
     *         <code>RecipientDsnFields</code>.
     *
     * @see BounceType
     */
    public String getBounceType() {
        return bounceType;
    }
    
    /**
     * The reason for the bounce. You must provide either this parameter or
     * <code>RecipientDsnFields</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DoesNotExist, MessageTooLarge, ExceededQuota, ContentRejected, Undefined, TemporaryFailure
     *
     * @param bounceType The reason for the bounce. You must provide either this parameter or
     *         <code>RecipientDsnFields</code>.
     *
     * @see BounceType
     */
    public void setBounceType(String bounceType) {
        this.bounceType = bounceType;
    }
    
    /**
     * The reason for the bounce. You must provide either this parameter or
     * <code>RecipientDsnFields</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DoesNotExist, MessageTooLarge, ExceededQuota, ContentRejected, Undefined, TemporaryFailure
     *
     * @param bounceType The reason for the bounce. You must provide either this parameter or
     *         <code>RecipientDsnFields</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see BounceType
     */
    public BouncedRecipientInfo withBounceType(String bounceType) {
        this.bounceType = bounceType;
        return this;
    }

    /**
     * The reason for the bounce. You must provide either this parameter or
     * <code>RecipientDsnFields</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DoesNotExist, MessageTooLarge, ExceededQuota, ContentRejected, Undefined, TemporaryFailure
     *
     * @param bounceType The reason for the bounce. You must provide either this parameter or
     *         <code>RecipientDsnFields</code>.
     *
     * @see BounceType
     */
    public void setBounceType(BounceType bounceType) {
        this.bounceType = bounceType.toString();
    }
    
    /**
     * The reason for the bounce. You must provide either this parameter or
     * <code>RecipientDsnFields</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DoesNotExist, MessageTooLarge, ExceededQuota, ContentRejected, Undefined, TemporaryFailure
     *
     * @param bounceType The reason for the bounce. You must provide either this parameter or
     *         <code>RecipientDsnFields</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see BounceType
     */
    public BouncedRecipientInfo withBounceType(BounceType bounceType) {
        this.bounceType = bounceType.toString();
        return this;
    }

    /**
     * Recipient-related DSN fields, most of which would normally be filled
     * in automatically when provided with a <code>BounceType</code>. You
     * must provide either this parameter or <code>BounceType</code>.
     *
     * @return Recipient-related DSN fields, most of which would normally be filled
     *         in automatically when provided with a <code>BounceType</code>. You
     *         must provide either this parameter or <code>BounceType</code>.
     */
    public RecipientDsnFields getRecipientDsnFields() {
        return recipientDsnFields;
    }
    
    /**
     * Recipient-related DSN fields, most of which would normally be filled
     * in automatically when provided with a <code>BounceType</code>. You
     * must provide either this parameter or <code>BounceType</code>.
     *
     * @param recipientDsnFields Recipient-related DSN fields, most of which would normally be filled
     *         in automatically when provided with a <code>BounceType</code>. You
     *         must provide either this parameter or <code>BounceType</code>.
     */
    public void setRecipientDsnFields(RecipientDsnFields recipientDsnFields) {
        this.recipientDsnFields = recipientDsnFields;
    }
    
    /**
     * Recipient-related DSN fields, most of which would normally be filled
     * in automatically when provided with a <code>BounceType</code>. You
     * must provide either this parameter or <code>BounceType</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recipientDsnFields Recipient-related DSN fields, most of which would normally be filled
     *         in automatically when provided with a <code>BounceType</code>. You
     *         must provide either this parameter or <code>BounceType</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public BouncedRecipientInfo withRecipientDsnFields(RecipientDsnFields recipientDsnFields) {
        this.recipientDsnFields = recipientDsnFields;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRecipient() != null) sb.append("Recipient: " + getRecipient() + ",");
        if (getRecipientArn() != null) sb.append("RecipientArn: " + getRecipientArn() + ",");
        if (getBounceType() != null) sb.append("BounceType: " + getBounceType() + ",");
        if (getRecipientDsnFields() != null) sb.append("RecipientDsnFields: " + getRecipientDsnFields() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof BouncedRecipientInfo == false) return false;
        BouncedRecipientInfo other = (BouncedRecipientInfo)obj;
        
        if (other.getRecipient() == null ^ this.getRecipient() == null) return false;
        if (other.getRecipient() != null && other.getRecipient().equals(this.getRecipient()) == false) return false; 
        if (other.getRecipientArn() == null ^ this.getRecipientArn() == null) return false;
        if (other.getRecipientArn() != null && other.getRecipientArn().equals(this.getRecipientArn()) == false) return false; 
        if (other.getBounceType() == null ^ this.getBounceType() == null) return false;
        if (other.getBounceType() != null && other.getBounceType().equals(this.getBounceType()) == false) return false; 
        if (other.getRecipientDsnFields() == null ^ this.getRecipientDsnFields() == null) return false;
        if (other.getRecipientDsnFields() != null && other.getRecipientDsnFields().equals(this.getRecipientDsnFields()) == false) return false; 
        return true;
    }
    
    @Override
    public BouncedRecipientInfo clone() {
        try {
            return (BouncedRecipientInfo) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    