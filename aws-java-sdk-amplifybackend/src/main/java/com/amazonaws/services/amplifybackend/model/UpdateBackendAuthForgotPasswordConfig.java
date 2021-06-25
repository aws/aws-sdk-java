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
 * Describes the forgot password policy for authenticating into the Amplify app.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/UpdateBackendAuthForgotPasswordConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBackendAuthForgotPasswordConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes which mode to use (either SMS or email) to deliver messages to app users that want to recover their
     * password.
     * </p>
     */
    private String deliveryMethod;
    /**
     * <p>
     * The configuration for the email sent when an app user forgets their password.
     * </p>
     */
    private EmailSettings emailSettings;
    /**
     * <p>
     * The configuration for the SMS message sent when an Amplify app user forgets their password.
     * </p>
     */
    private SmsSettings smsSettings;

    /**
     * <p>
     * Describes which mode to use (either SMS or email) to deliver messages to app users that want to recover their
     * password.
     * </p>
     * 
     * @param deliveryMethod
     *        Describes which mode to use (either SMS or email) to deliver messages to app users that want to recover
     *        their password.
     * @see DeliveryMethod
     */

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    /**
     * <p>
     * Describes which mode to use (either SMS or email) to deliver messages to app users that want to recover their
     * password.
     * </p>
     * 
     * @return Describes which mode to use (either SMS or email) to deliver messages to app users that want to recover
     *         their password.
     * @see DeliveryMethod
     */

    public String getDeliveryMethod() {
        return this.deliveryMethod;
    }

    /**
     * <p>
     * Describes which mode to use (either SMS or email) to deliver messages to app users that want to recover their
     * password.
     * </p>
     * 
     * @param deliveryMethod
     *        Describes which mode to use (either SMS or email) to deliver messages to app users that want to recover
     *        their password.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryMethod
     */

    public UpdateBackendAuthForgotPasswordConfig withDeliveryMethod(String deliveryMethod) {
        setDeliveryMethod(deliveryMethod);
        return this;
    }

    /**
     * <p>
     * Describes which mode to use (either SMS or email) to deliver messages to app users that want to recover their
     * password.
     * </p>
     * 
     * @param deliveryMethod
     *        Describes which mode to use (either SMS or email) to deliver messages to app users that want to recover
     *        their password.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryMethod
     */

    public UpdateBackendAuthForgotPasswordConfig withDeliveryMethod(DeliveryMethod deliveryMethod) {
        this.deliveryMethod = deliveryMethod.toString();
        return this;
    }

    /**
     * <p>
     * The configuration for the email sent when an app user forgets their password.
     * </p>
     * 
     * @param emailSettings
     *        The configuration for the email sent when an app user forgets their password.
     */

    public void setEmailSettings(EmailSettings emailSettings) {
        this.emailSettings = emailSettings;
    }

    /**
     * <p>
     * The configuration for the email sent when an app user forgets their password.
     * </p>
     * 
     * @return The configuration for the email sent when an app user forgets their password.
     */

    public EmailSettings getEmailSettings() {
        return this.emailSettings;
    }

    /**
     * <p>
     * The configuration for the email sent when an app user forgets their password.
     * </p>
     * 
     * @param emailSettings
     *        The configuration for the email sent when an app user forgets their password.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBackendAuthForgotPasswordConfig withEmailSettings(EmailSettings emailSettings) {
        setEmailSettings(emailSettings);
        return this;
    }

    /**
     * <p>
     * The configuration for the SMS message sent when an Amplify app user forgets their password.
     * </p>
     * 
     * @param smsSettings
     *        The configuration for the SMS message sent when an Amplify app user forgets their password.
     */

    public void setSmsSettings(SmsSettings smsSettings) {
        this.smsSettings = smsSettings;
    }

    /**
     * <p>
     * The configuration for the SMS message sent when an Amplify app user forgets their password.
     * </p>
     * 
     * @return The configuration for the SMS message sent when an Amplify app user forgets their password.
     */

    public SmsSettings getSmsSettings() {
        return this.smsSettings;
    }

    /**
     * <p>
     * The configuration for the SMS message sent when an Amplify app user forgets their password.
     * </p>
     * 
     * @param smsSettings
     *        The configuration for the SMS message sent when an Amplify app user forgets their password.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBackendAuthForgotPasswordConfig withSmsSettings(SmsSettings smsSettings) {
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

        if (obj instanceof UpdateBackendAuthForgotPasswordConfig == false)
            return false;
        UpdateBackendAuthForgotPasswordConfig other = (UpdateBackendAuthForgotPasswordConfig) obj;
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
    public UpdateBackendAuthForgotPasswordConfig clone() {
        try {
            return (UpdateBackendAuthForgotPasswordConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifybackend.model.transform.UpdateBackendAuthForgotPasswordConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
