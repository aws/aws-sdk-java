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
package com.amazonaws.services.amplifybackend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Updates the configuration of the email or SMS message for the auth resource configured for your Amplify project.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/UpdateBackendAuthVerificationMessageConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBackendAuthVerificationMessageConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of verification message to send.
     * </p>
     */
    private String deliveryMethod;
    /**
     * <p>
     * The settings for the email message.
     * </p>
     */
    private EmailSettings emailSettings;
    /**
     * <p>
     * The settings for the SMS message.
     * </p>
     */
    private SmsSettings smsSettings;

    /**
     * <p>
     * The type of verification message to send.
     * </p>
     * 
     * @param deliveryMethod
     *        The type of verification message to send.
     * @see DeliveryMethod
     */

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    /**
     * <p>
     * The type of verification message to send.
     * </p>
     * 
     * @return The type of verification message to send.
     * @see DeliveryMethod
     */

    public String getDeliveryMethod() {
        return this.deliveryMethod;
    }

    /**
     * <p>
     * The type of verification message to send.
     * </p>
     * 
     * @param deliveryMethod
     *        The type of verification message to send.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryMethod
     */

    public UpdateBackendAuthVerificationMessageConfig withDeliveryMethod(String deliveryMethod) {
        setDeliveryMethod(deliveryMethod);
        return this;
    }

    /**
     * <p>
     * The type of verification message to send.
     * </p>
     * 
     * @param deliveryMethod
     *        The type of verification message to send.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryMethod
     */

    public UpdateBackendAuthVerificationMessageConfig withDeliveryMethod(DeliveryMethod deliveryMethod) {
        this.deliveryMethod = deliveryMethod.toString();
        return this;
    }

    /**
     * <p>
     * The settings for the email message.
     * </p>
     * 
     * @param emailSettings
     *        The settings for the email message.
     */

    public void setEmailSettings(EmailSettings emailSettings) {
        this.emailSettings = emailSettings;
    }

    /**
     * <p>
     * The settings for the email message.
     * </p>
     * 
     * @return The settings for the email message.
     */

    public EmailSettings getEmailSettings() {
        return this.emailSettings;
    }

    /**
     * <p>
     * The settings for the email message.
     * </p>
     * 
     * @param emailSettings
     *        The settings for the email message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBackendAuthVerificationMessageConfig withEmailSettings(EmailSettings emailSettings) {
        setEmailSettings(emailSettings);
        return this;
    }

    /**
     * <p>
     * The settings for the SMS message.
     * </p>
     * 
     * @param smsSettings
     *        The settings for the SMS message.
     */

    public void setSmsSettings(SmsSettings smsSettings) {
        this.smsSettings = smsSettings;
    }

    /**
     * <p>
     * The settings for the SMS message.
     * </p>
     * 
     * @return The settings for the SMS message.
     */

    public SmsSettings getSmsSettings() {
        return this.smsSettings;
    }

    /**
     * <p>
     * The settings for the SMS message.
     * </p>
     * 
     * @param smsSettings
     *        The settings for the SMS message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBackendAuthVerificationMessageConfig withSmsSettings(SmsSettings smsSettings) {
        setSmsSettings(smsSettings);
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
        if (getEmailSettings() != null)
            sb.append("EmailSettings: ").append(getEmailSettings()).append(",");
        if (getSmsSettings() != null)
            sb.append("SmsSettings: ").append(getSmsSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBackendAuthVerificationMessageConfig == false)
            return false;
        UpdateBackendAuthVerificationMessageConfig other = (UpdateBackendAuthVerificationMessageConfig) obj;
        if (other.getDeliveryMethod() == null ^ this.getDeliveryMethod() == null)
            return false;
        if (other.getDeliveryMethod() != null && other.getDeliveryMethod().equals(this.getDeliveryMethod()) == false)
            return false;
        if (other.getEmailSettings() == null ^ this.getEmailSettings() == null)
            return false;
        if (other.getEmailSettings() != null && other.getEmailSettings().equals(this.getEmailSettings()) == false)
            return false;
        if (other.getSmsSettings() == null ^ this.getSmsSettings() == null)
            return false;
        if (other.getSmsSettings() != null && other.getSmsSettings().equals(this.getSmsSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeliveryMethod() == null) ? 0 : getDeliveryMethod().hashCode());
        hashCode = prime * hashCode + ((getEmailSettings() == null) ? 0 : getEmailSettings().hashCode());
        hashCode = prime * hashCode + ((getSmsSettings() == null) ? 0 : getSmsSettings().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBackendAuthVerificationMessageConfig clone() {
        try {
            return (UpdateBackendAuthVerificationMessageConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifybackend.model.transform.UpdateBackendAuthVerificationMessageConfigMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
