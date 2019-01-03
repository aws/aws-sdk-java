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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Set of options which defines notification preferences of given action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/NotificationOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotificationOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Boolean value to indicate an email notification should be sent to the receipients.
     * </p>
     */
    private Boolean sendEmail;
    /**
     * <p>
     * Text value to be included in the email body.
     * </p>
     */
    private String emailMessage;

    /**
     * <p>
     * Boolean value to indicate an email notification should be sent to the receipients.
     * </p>
     * 
     * @param sendEmail
     *        Boolean value to indicate an email notification should be sent to the receipients.
     */

    public void setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    /**
     * <p>
     * Boolean value to indicate an email notification should be sent to the receipients.
     * </p>
     * 
     * @return Boolean value to indicate an email notification should be sent to the receipients.
     */

    public Boolean getSendEmail() {
        return this.sendEmail;
    }

    /**
     * <p>
     * Boolean value to indicate an email notification should be sent to the receipients.
     * </p>
     * 
     * @param sendEmail
     *        Boolean value to indicate an email notification should be sent to the receipients.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationOptions withSendEmail(Boolean sendEmail) {
        setSendEmail(sendEmail);
        return this;
    }

    /**
     * <p>
     * Boolean value to indicate an email notification should be sent to the receipients.
     * </p>
     * 
     * @return Boolean value to indicate an email notification should be sent to the receipients.
     */

    public Boolean isSendEmail() {
        return this.sendEmail;
    }

    /**
     * <p>
     * Text value to be included in the email body.
     * </p>
     * 
     * @param emailMessage
     *        Text value to be included in the email body.
     */

    public void setEmailMessage(String emailMessage) {
        this.emailMessage = emailMessage;
    }

    /**
     * <p>
     * Text value to be included in the email body.
     * </p>
     * 
     * @return Text value to be included in the email body.
     */

    public String getEmailMessage() {
        return this.emailMessage;
    }

    /**
     * <p>
     * Text value to be included in the email body.
     * </p>
     * 
     * @param emailMessage
     *        Text value to be included in the email body.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationOptions withEmailMessage(String emailMessage) {
        setEmailMessage(emailMessage);
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
        if (getSendEmail() != null)
            sb.append("SendEmail: ").append(getSendEmail()).append(",");
        if (getEmailMessage() != null)
            sb.append("EmailMessage: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationOptions == false)
            return false;
        NotificationOptions other = (NotificationOptions) obj;
        if (other.getSendEmail() == null ^ this.getSendEmail() == null)
            return false;
        if (other.getSendEmail() != null && other.getSendEmail().equals(this.getSendEmail()) == false)
            return false;
        if (other.getEmailMessage() == null ^ this.getEmailMessage() == null)
            return false;
        if (other.getEmailMessage() != null && other.getEmailMessage().equals(this.getEmailMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSendEmail() == null) ? 0 : getSendEmail().hashCode());
        hashCode = prime * hashCode + ((getEmailMessage() == null) ? 0 : getEmailMessage().hashCode());
        return hashCode;
    }

    @Override
    public NotificationOptions clone() {
        try {
            return (NotificationOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workdocs.model.transform.NotificationOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
