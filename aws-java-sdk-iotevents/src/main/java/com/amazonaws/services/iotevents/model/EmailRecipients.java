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
 * Contains the information of one or more recipients who receive the emails.
 * </p>
 * <important>
 * <p>
 * You must <a href="https://docs.aws.amazon.com/singlesignon/latest/userguide/addusers.html">add the users that receive
 * emails to your AWS SSO store</a>.
 * </p>
 * </important>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/EmailRecipients" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EmailRecipients implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies one or more recipients who receive the email.
     * </p>
     */
    private java.util.List<RecipientDetail> to;

    /**
     * <p>
     * Specifies one or more recipients who receive the email.
     * </p>
     * 
     * @return Specifies one or more recipients who receive the email.
     */

    public java.util.List<RecipientDetail> getTo() {
        return to;
    }

    /**
     * <p>
     * Specifies one or more recipients who receive the email.
     * </p>
     * 
     * @param to
     *        Specifies one or more recipients who receive the email.
     */

    public void setTo(java.util.Collection<RecipientDetail> to) {
        if (to == null) {
            this.to = null;
            return;
        }

        this.to = new java.util.ArrayList<RecipientDetail>(to);
    }

    /**
     * <p>
     * Specifies one or more recipients who receive the email.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTo(java.util.Collection)} or {@link #withTo(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param to
     *        Specifies one or more recipients who receive the email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailRecipients withTo(RecipientDetail... to) {
        if (this.to == null) {
            setTo(new java.util.ArrayList<RecipientDetail>(to.length));
        }
        for (RecipientDetail ele : to) {
            this.to.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies one or more recipients who receive the email.
     * </p>
     * 
     * @param to
     *        Specifies one or more recipients who receive the email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailRecipients withTo(java.util.Collection<RecipientDetail> to) {
        setTo(to);
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
        if (getTo() != null)
            sb.append("To: ").append(getTo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EmailRecipients == false)
            return false;
        EmailRecipients other = (EmailRecipients) obj;
        if (other.getTo() == null ^ this.getTo() == null)
            return false;
        if (other.getTo() != null && other.getTo().equals(this.getTo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTo() == null) ? 0 : getTo().hashCode());
        return hashCode;
    }

    @Override
    public EmailRecipients clone() {
        try {
            return (EmailRecipients) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.EmailRecipientsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
