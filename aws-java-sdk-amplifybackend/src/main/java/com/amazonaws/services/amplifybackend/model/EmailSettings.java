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
package com.amazonaws.services.amplifybackend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for the email sent when an app user forgets their password.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/EmailSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EmailSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The body of the email.
     * </p>
     */
    private String emailMessage;
    /**
     * <p>
     * The subject of the email.
     * </p>
     */
    private String emailSubject;

    /**
     * <p>
     * The body of the email.
     * </p>
     * 
     * @param emailMessage
     *        The body of the email.
     */

    public void setEmailMessage(String emailMessage) {
        this.emailMessage = emailMessage;
    }

    /**
     * <p>
     * The body of the email.
     * </p>
     * 
     * @return The body of the email.
     */

    public String getEmailMessage() {
        return this.emailMessage;
    }

    /**
     * <p>
     * The body of the email.
     * </p>
     * 
     * @param emailMessage
     *        The body of the email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailSettings withEmailMessage(String emailMessage) {
        setEmailMessage(emailMessage);
        return this;
    }

    /**
     * <p>
     * The subject of the email.
     * </p>
     * 
     * @param emailSubject
     *        The subject of the email.
     */

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    /**
     * <p>
     * The subject of the email.
     * </p>
     * 
     * @return The subject of the email.
     */

    public String getEmailSubject() {
        return this.emailSubject;
    }

    /**
     * <p>
     * The subject of the email.
     * </p>
     * 
     * @param emailSubject
     *        The subject of the email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailSettings withEmailSubject(String emailSubject) {
        setEmailSubject(emailSubject);
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
        if (getEmailMessage() != null)
            sb.append("EmailMessage: ").append(getEmailMessage()).append(",");
        if (getEmailSubject() != null)
            sb.append("EmailSubject: ").append(getEmailSubject());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EmailSettings == false)
            return false;
        EmailSettings other = (EmailSettings) obj;
        if (other.getEmailMessage() == null ^ this.getEmailMessage() == null)
            return false;
        if (other.getEmailMessage() != null && other.getEmailMessage().equals(this.getEmailMessage()) == false)
            return false;
        if (other.getEmailSubject() == null ^ this.getEmailSubject() == null)
            return false;
        if (other.getEmailSubject() != null && other.getEmailSubject().equals(this.getEmailSubject()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmailMessage() == null) ? 0 : getEmailMessage().hashCode());
        hashCode = prime * hashCode + ((getEmailSubject() == null) ? 0 : getEmailSubject().hashCode());
        return hashCode;
    }

    @Override
    public EmailSettings clone() {
        try {
            return (EmailSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifybackend.model.transform.EmailSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
