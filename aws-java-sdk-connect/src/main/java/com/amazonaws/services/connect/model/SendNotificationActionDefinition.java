/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the send notification action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SendNotificationActionDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendNotificationActionDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Notification delivery method.
     * </p>
     */
    private String deliveryMethod;
    /**
     * <p>
     * The subject of the email if the delivery method is <code>EMAIL</code>. Supports variable injection. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html">JSONPath
     * reference</a> in the <i>Amazon Connect Administrators Guide</i>.
     * </p>
     */
    private String subject;
    /**
     * <p>
     * Notification content. Supports variable injection. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html">JSONPath
     * reference</a> in the <i>Amazon Connect Administrators Guide</i>.
     * </p>
     */
    private String content;
    /**
     * <p>
     * Content type format.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * Notification recipient.
     * </p>
     */
    private NotificationRecipientType recipient;

    /**
     * <p>
     * Notification delivery method.
     * </p>
     * 
     * @param deliveryMethod
     *        Notification delivery method.
     * @see NotificationDeliveryType
     */

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    /**
     * <p>
     * Notification delivery method.
     * </p>
     * 
     * @return Notification delivery method.
     * @see NotificationDeliveryType
     */

    public String getDeliveryMethod() {
        return this.deliveryMethod;
    }

    /**
     * <p>
     * Notification delivery method.
     * </p>
     * 
     * @param deliveryMethod
     *        Notification delivery method.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationDeliveryType
     */

    public SendNotificationActionDefinition withDeliveryMethod(String deliveryMethod) {
        setDeliveryMethod(deliveryMethod);
        return this;
    }

    /**
     * <p>
     * Notification delivery method.
     * </p>
     * 
     * @param deliveryMethod
     *        Notification delivery method.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationDeliveryType
     */

    public SendNotificationActionDefinition withDeliveryMethod(NotificationDeliveryType deliveryMethod) {
        this.deliveryMethod = deliveryMethod.toString();
        return this;
    }

    /**
     * <p>
     * The subject of the email if the delivery method is <code>EMAIL</code>. Supports variable injection. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html">JSONPath
     * reference</a> in the <i>Amazon Connect Administrators Guide</i>.
     * </p>
     * 
     * @param subject
     *        The subject of the email if the delivery method is <code>EMAIL</code>. Supports variable injection. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html">JSONPath
     *        reference</a> in the <i>Amazon Connect Administrators Guide</i>.
     */

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The subject of the email if the delivery method is <code>EMAIL</code>. Supports variable injection. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html">JSONPath
     * reference</a> in the <i>Amazon Connect Administrators Guide</i>.
     * </p>
     * 
     * @return The subject of the email if the delivery method is <code>EMAIL</code>. Supports variable injection. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     *         >JSONPath reference</a> in the <i>Amazon Connect Administrators Guide</i>.
     */

    public String getSubject() {
        return this.subject;
    }

    /**
     * <p>
     * The subject of the email if the delivery method is <code>EMAIL</code>. Supports variable injection. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html">JSONPath
     * reference</a> in the <i>Amazon Connect Administrators Guide</i>.
     * </p>
     * 
     * @param subject
     *        The subject of the email if the delivery method is <code>EMAIL</code>. Supports variable injection. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html">JSONPath
     *        reference</a> in the <i>Amazon Connect Administrators Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendNotificationActionDefinition withSubject(String subject) {
        setSubject(subject);
        return this;
    }

    /**
     * <p>
     * Notification content. Supports variable injection. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html">JSONPath
     * reference</a> in the <i>Amazon Connect Administrators Guide</i>.
     * </p>
     * 
     * @param content
     *        Notification content. Supports variable injection. For more information, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html">JSONPath
     *        reference</a> in the <i>Amazon Connect Administrators Guide</i>.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * Notification content. Supports variable injection. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html">JSONPath
     * reference</a> in the <i>Amazon Connect Administrators Guide</i>.
     * </p>
     * 
     * @return Notification content. Supports variable injection. For more information, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     *         >JSONPath reference</a> in the <i>Amazon Connect Administrators Guide</i>.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * Notification content. Supports variable injection. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html">JSONPath
     * reference</a> in the <i>Amazon Connect Administrators Guide</i>.
     * </p>
     * 
     * @param content
     *        Notification content. Supports variable injection. For more information, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html">JSONPath
     *        reference</a> in the <i>Amazon Connect Administrators Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendNotificationActionDefinition withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * Content type format.
     * </p>
     * 
     * @param contentType
     *        Content type format.
     * @see NotificationContentType
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * Content type format.
     * </p>
     * 
     * @return Content type format.
     * @see NotificationContentType
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * Content type format.
     * </p>
     * 
     * @param contentType
     *        Content type format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationContentType
     */

    public SendNotificationActionDefinition withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * Content type format.
     * </p>
     * 
     * @param contentType
     *        Content type format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationContentType
     */

    public SendNotificationActionDefinition withContentType(NotificationContentType contentType) {
        this.contentType = contentType.toString();
        return this;
    }

    /**
     * <p>
     * Notification recipient.
     * </p>
     * 
     * @param recipient
     *        Notification recipient.
     */

    public void setRecipient(NotificationRecipientType recipient) {
        this.recipient = recipient;
    }

    /**
     * <p>
     * Notification recipient.
     * </p>
     * 
     * @return Notification recipient.
     */

    public NotificationRecipientType getRecipient() {
        return this.recipient;
    }

    /**
     * <p>
     * Notification recipient.
     * </p>
     * 
     * @param recipient
     *        Notification recipient.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendNotificationActionDefinition withRecipient(NotificationRecipientType recipient) {
        setRecipient(recipient);
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
        if (getDeliveryMethod() != null)
            sb.append("DeliveryMethod: ").append(getDeliveryMethod()).append(",");
        if (getSubject() != null)
            sb.append("Subject: ").append(getSubject()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getRecipient() != null)
            sb.append("Recipient: ").append(getRecipient());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendNotificationActionDefinition == false)
            return false;
        SendNotificationActionDefinition other = (SendNotificationActionDefinition) obj;
        if (other.getDeliveryMethod() == null ^ this.getDeliveryMethod() == null)
            return false;
        if (other.getDeliveryMethod() != null && other.getDeliveryMethod().equals(this.getDeliveryMethod()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getRecipient() == null ^ this.getRecipient() == null)
            return false;
        if (other.getRecipient() != null && other.getRecipient().equals(this.getRecipient()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeliveryMethod() == null) ? 0 : getDeliveryMethod().hashCode());
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getRecipient() == null) ? 0 : getRecipient().hashCode());
        return hashCode;
    }

    @Override
    public SendNotificationActionDefinition clone() {
        try {
            return (SendNotificationActionDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.SendNotificationActionDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
