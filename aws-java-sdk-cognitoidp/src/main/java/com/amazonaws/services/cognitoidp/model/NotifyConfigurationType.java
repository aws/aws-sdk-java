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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The notify configuration type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/NotifyConfigurationType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotifyConfigurationType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The email address that is sending the email. It must be either individually verified with Amazon SES, or from a
     * domain that has been verified with Amazon SES.
     * </p>
     */
    private String from;
    /**
     * <p>
     * The destination to which the receiver of an email should reply to.
     * </p>
     */
    private String replyTo;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the identity that is associated with the sending authorization policy. It
     * permits Amazon Cognito to send for the email address specified in the <code>From</code> parameter.
     * </p>
     */
    private String sourceArn;
    /**
     * <p>
     * Email template used when a detected risk event is blocked.
     * </p>
     */
    private NotifyEmailType blockEmail;
    /**
     * <p>
     * The email template used when a detected risk event is allowed.
     * </p>
     */
    private NotifyEmailType noActionEmail;
    /**
     * <p>
     * The MFA email template used when MFA is challenged as part of a detected risk.
     * </p>
     */
    private NotifyEmailType mfaEmail;

    /**
     * <p>
     * The email address that is sending the email. It must be either individually verified with Amazon SES, or from a
     * domain that has been verified with Amazon SES.
     * </p>
     * 
     * @param from
     *        The email address that is sending the email. It must be either individually verified with Amazon SES, or
     *        from a domain that has been verified with Amazon SES.
     */

    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * <p>
     * The email address that is sending the email. It must be either individually verified with Amazon SES, or from a
     * domain that has been verified with Amazon SES.
     * </p>
     * 
     * @return The email address that is sending the email. It must be either individually verified with Amazon SES, or
     *         from a domain that has been verified with Amazon SES.
     */

    public String getFrom() {
        return this.from;
    }

    /**
     * <p>
     * The email address that is sending the email. It must be either individually verified with Amazon SES, or from a
     * domain that has been verified with Amazon SES.
     * </p>
     * 
     * @param from
     *        The email address that is sending the email. It must be either individually verified with Amazon SES, or
     *        from a domain that has been verified with Amazon SES.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyConfigurationType withFrom(String from) {
        setFrom(from);
        return this;
    }

    /**
     * <p>
     * The destination to which the receiver of an email should reply to.
     * </p>
     * 
     * @param replyTo
     *        The destination to which the receiver of an email should reply to.
     */

    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

    /**
     * <p>
     * The destination to which the receiver of an email should reply to.
     * </p>
     * 
     * @return The destination to which the receiver of an email should reply to.
     */

    public String getReplyTo() {
        return this.replyTo;
    }

    /**
     * <p>
     * The destination to which the receiver of an email should reply to.
     * </p>
     * 
     * @param replyTo
     *        The destination to which the receiver of an email should reply to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyConfigurationType withReplyTo(String replyTo) {
        setReplyTo(replyTo);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the identity that is associated with the sending authorization policy. It
     * permits Amazon Cognito to send for the email address specified in the <code>From</code> parameter.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of the identity that is associated with the sending authorization policy.
     *        It permits Amazon Cognito to send for the email address specified in the <code>From</code> parameter.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the identity that is associated with the sending authorization policy. It
     * permits Amazon Cognito to send for the email address specified in the <code>From</code> parameter.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the identity that is associated with the sending authorization policy.
     *         It permits Amazon Cognito to send for the email address specified in the <code>From</code> parameter.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the identity that is associated with the sending authorization policy. It
     * permits Amazon Cognito to send for the email address specified in the <code>From</code> parameter.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of the identity that is associated with the sending authorization policy.
     *        It permits Amazon Cognito to send for the email address specified in the <code>From</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyConfigurationType withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * Email template used when a detected risk event is blocked.
     * </p>
     * 
     * @param blockEmail
     *        Email template used when a detected risk event is blocked.
     */

    public void setBlockEmail(NotifyEmailType blockEmail) {
        this.blockEmail = blockEmail;
    }

    /**
     * <p>
     * Email template used when a detected risk event is blocked.
     * </p>
     * 
     * @return Email template used when a detected risk event is blocked.
     */

    public NotifyEmailType getBlockEmail() {
        return this.blockEmail;
    }

    /**
     * <p>
     * Email template used when a detected risk event is blocked.
     * </p>
     * 
     * @param blockEmail
     *        Email template used when a detected risk event is blocked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyConfigurationType withBlockEmail(NotifyEmailType blockEmail) {
        setBlockEmail(blockEmail);
        return this;
    }

    /**
     * <p>
     * The email template used when a detected risk event is allowed.
     * </p>
     * 
     * @param noActionEmail
     *        The email template used when a detected risk event is allowed.
     */

    public void setNoActionEmail(NotifyEmailType noActionEmail) {
        this.noActionEmail = noActionEmail;
    }

    /**
     * <p>
     * The email template used when a detected risk event is allowed.
     * </p>
     * 
     * @return The email template used when a detected risk event is allowed.
     */

    public NotifyEmailType getNoActionEmail() {
        return this.noActionEmail;
    }

    /**
     * <p>
     * The email template used when a detected risk event is allowed.
     * </p>
     * 
     * @param noActionEmail
     *        The email template used when a detected risk event is allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyConfigurationType withNoActionEmail(NotifyEmailType noActionEmail) {
        setNoActionEmail(noActionEmail);
        return this;
    }

    /**
     * <p>
     * The MFA email template used when MFA is challenged as part of a detected risk.
     * </p>
     * 
     * @param mfaEmail
     *        The MFA email template used when MFA is challenged as part of a detected risk.
     */

    public void setMfaEmail(NotifyEmailType mfaEmail) {
        this.mfaEmail = mfaEmail;
    }

    /**
     * <p>
     * The MFA email template used when MFA is challenged as part of a detected risk.
     * </p>
     * 
     * @return The MFA email template used when MFA is challenged as part of a detected risk.
     */

    public NotifyEmailType getMfaEmail() {
        return this.mfaEmail;
    }

    /**
     * <p>
     * The MFA email template used when MFA is challenged as part of a detected risk.
     * </p>
     * 
     * @param mfaEmail
     *        The MFA email template used when MFA is challenged as part of a detected risk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyConfigurationType withMfaEmail(NotifyEmailType mfaEmail) {
        setMfaEmail(mfaEmail);
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
        if (getFrom() != null)
            sb.append("From: ").append(getFrom()).append(",");
        if (getReplyTo() != null)
            sb.append("ReplyTo: ").append(getReplyTo()).append(",");
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append(getSourceArn()).append(",");
        if (getBlockEmail() != null)
            sb.append("BlockEmail: ").append(getBlockEmail()).append(",");
        if (getNoActionEmail() != null)
            sb.append("NoActionEmail: ").append(getNoActionEmail()).append(",");
        if (getMfaEmail() != null)
            sb.append("MfaEmail: ").append(getMfaEmail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotifyConfigurationType == false)
            return false;
        NotifyConfigurationType other = (NotifyConfigurationType) obj;
        if (other.getFrom() == null ^ this.getFrom() == null)
            return false;
        if (other.getFrom() != null && other.getFrom().equals(this.getFrom()) == false)
            return false;
        if (other.getReplyTo() == null ^ this.getReplyTo() == null)
            return false;
        if (other.getReplyTo() != null && other.getReplyTo().equals(this.getReplyTo()) == false)
            return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getBlockEmail() == null ^ this.getBlockEmail() == null)
            return false;
        if (other.getBlockEmail() != null && other.getBlockEmail().equals(this.getBlockEmail()) == false)
            return false;
        if (other.getNoActionEmail() == null ^ this.getNoActionEmail() == null)
            return false;
        if (other.getNoActionEmail() != null && other.getNoActionEmail().equals(this.getNoActionEmail()) == false)
            return false;
        if (other.getMfaEmail() == null ^ this.getMfaEmail() == null)
            return false;
        if (other.getMfaEmail() != null && other.getMfaEmail().equals(this.getMfaEmail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrom() == null) ? 0 : getFrom().hashCode());
        hashCode = prime * hashCode + ((getReplyTo() == null) ? 0 : getReplyTo().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getBlockEmail() == null) ? 0 : getBlockEmail().hashCode());
        hashCode = prime * hashCode + ((getNoActionEmail() == null) ? 0 : getNoActionEmail().hashCode());
        hashCode = prime * hashCode + ((getMfaEmail() == null) ? 0 : getMfaEmail().hashCode());
        return hashCode;
    }

    @Override
    public NotifyConfigurationType clone() {
        try {
            return (NotifyConfigurationType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.NotifyConfigurationTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
