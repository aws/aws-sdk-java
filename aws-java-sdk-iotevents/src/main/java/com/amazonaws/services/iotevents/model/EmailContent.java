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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the subject and message of an email.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/EmailContent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EmailContent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The subject of the email.
     * </p>
     */
    private String subject;
    /**
     * <p>
     * The message that you want to send. The message can be up to 200 characters.
     * </p>
     */
    private String additionalMessage;

    /**
     * <p>
     * The subject of the email.
     * </p>
     * 
     * @param subject
     *        The subject of the email.
     */

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The subject of the email.
     * </p>
     * 
     * @return The subject of the email.
     */

    public String getSubject() {
        return this.subject;
    }

    /**
     * <p>
     * The subject of the email.
     * </p>
     * 
     * @param subject
     *        The subject of the email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailContent withSubject(String subject) {
        setSubject(subject);
        return this;
    }

    /**
     * <p>
     * The message that you want to send. The message can be up to 200 characters.
     * </p>
     * 
     * @param additionalMessage
     *        The message that you want to send. The message can be up to 200 characters.
     */

    public void setAdditionalMessage(String additionalMessage) {
        this.additionalMessage = additionalMessage;
    }

    /**
     * <p>
     * The message that you want to send. The message can be up to 200 characters.
     * </p>
     * 
     * @return The message that you want to send. The message can be up to 200 characters.
     */

    public String getAdditionalMessage() {
        return this.additionalMessage;
    }

    /**
     * <p>
     * The message that you want to send. The message can be up to 200 characters.
     * </p>
     * 
     * @param additionalMessage
     *        The message that you want to send. The message can be up to 200 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailContent withAdditionalMessage(String additionalMessage) {
        setAdditionalMessage(additionalMessage);
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
        if (getSubject() != null)
            sb.append("Subject: ").append(getSubject()).append(",");
        if (getAdditionalMessage() != null)
            sb.append("AdditionalMessage: ").append(getAdditionalMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EmailContent == false)
            return false;
        EmailContent other = (EmailContent) obj;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getAdditionalMessage() == null ^ this.getAdditionalMessage() == null)
            return false;
        if (other.getAdditionalMessage() != null && other.getAdditionalMessage().equals(this.getAdditionalMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getAdditionalMessage() == null) ? 0 : getAdditionalMessage().hashCode());
        return hashCode;
    }

    @Override
    public EmailContent clone() {
        try {
            return (EmailContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.EmailContentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
