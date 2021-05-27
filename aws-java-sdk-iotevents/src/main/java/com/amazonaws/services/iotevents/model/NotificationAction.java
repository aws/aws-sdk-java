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
 * Contains the notification settings of an alarm model. The settings apply to all alarms that were created based on
 * this alarm model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/NotificationAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotificationAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies an AWS Lambda function to manage alarm notifications. You can create one or use the <a
     * href="https://docs.aws.amazon.com/iotevents/latest/developerguide/lambda-support.html">AWS Lambda function
     * provided by AWS IoT Events</a>.
     * </p>
     */
    private NotificationTargetActions action;
    /**
     * <p>
     * Contains the configuration information of SMS notifications.
     * </p>
     */
    private java.util.List<SMSConfiguration> smsConfigurations;
    /**
     * <p>
     * Contains the configuration information of email notifications.
     * </p>
     */
    private java.util.List<EmailConfiguration> emailConfigurations;

    /**
     * <p>
     * Specifies an AWS Lambda function to manage alarm notifications. You can create one or use the <a
     * href="https://docs.aws.amazon.com/iotevents/latest/developerguide/lambda-support.html">AWS Lambda function
     * provided by AWS IoT Events</a>.
     * </p>
     * 
     * @param action
     *        Specifies an AWS Lambda function to manage alarm notifications. You can create one or use the <a
     *        href="https://docs.aws.amazon.com/iotevents/latest/developerguide/lambda-support.html">AWS Lambda function
     *        provided by AWS IoT Events</a>.
     */

    public void setAction(NotificationTargetActions action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies an AWS Lambda function to manage alarm notifications. You can create one or use the <a
     * href="https://docs.aws.amazon.com/iotevents/latest/developerguide/lambda-support.html">AWS Lambda function
     * provided by AWS IoT Events</a>.
     * </p>
     * 
     * @return Specifies an AWS Lambda function to manage alarm notifications. You can create one or use the <a
     *         href="https://docs.aws.amazon.com/iotevents/latest/developerguide/lambda-support.html">AWS Lambda
     *         function provided by AWS IoT Events</a>.
     */

    public NotificationTargetActions getAction() {
        return this.action;
    }

    /**
     * <p>
     * Specifies an AWS Lambda function to manage alarm notifications. You can create one or use the <a
     * href="https://docs.aws.amazon.com/iotevents/latest/developerguide/lambda-support.html">AWS Lambda function
     * provided by AWS IoT Events</a>.
     * </p>
     * 
     * @param action
     *        Specifies an AWS Lambda function to manage alarm notifications. You can create one or use the <a
     *        href="https://docs.aws.amazon.com/iotevents/latest/developerguide/lambda-support.html">AWS Lambda function
     *        provided by AWS IoT Events</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationAction withAction(NotificationTargetActions action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Contains the configuration information of SMS notifications.
     * </p>
     * 
     * @return Contains the configuration information of SMS notifications.
     */

    public java.util.List<SMSConfiguration> getSmsConfigurations() {
        return smsConfigurations;
    }

    /**
     * <p>
     * Contains the configuration information of SMS notifications.
     * </p>
     * 
     * @param smsConfigurations
     *        Contains the configuration information of SMS notifications.
     */

    public void setSmsConfigurations(java.util.Collection<SMSConfiguration> smsConfigurations) {
        if (smsConfigurations == null) {
            this.smsConfigurations = null;
            return;
        }

        this.smsConfigurations = new java.util.ArrayList<SMSConfiguration>(smsConfigurations);
    }

    /**
     * <p>
     * Contains the configuration information of SMS notifications.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSmsConfigurations(java.util.Collection)} or {@link #withSmsConfigurations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param smsConfigurations
     *        Contains the configuration information of SMS notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationAction withSmsConfigurations(SMSConfiguration... smsConfigurations) {
        if (this.smsConfigurations == null) {
            setSmsConfigurations(new java.util.ArrayList<SMSConfiguration>(smsConfigurations.length));
        }
        for (SMSConfiguration ele : smsConfigurations) {
            this.smsConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains the configuration information of SMS notifications.
     * </p>
     * 
     * @param smsConfigurations
     *        Contains the configuration information of SMS notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationAction withSmsConfigurations(java.util.Collection<SMSConfiguration> smsConfigurations) {
        setSmsConfigurations(smsConfigurations);
        return this;
    }

    /**
     * <p>
     * Contains the configuration information of email notifications.
     * </p>
     * 
     * @return Contains the configuration information of email notifications.
     */

    public java.util.List<EmailConfiguration> getEmailConfigurations() {
        return emailConfigurations;
    }

    /**
     * <p>
     * Contains the configuration information of email notifications.
     * </p>
     * 
     * @param emailConfigurations
     *        Contains the configuration information of email notifications.
     */

    public void setEmailConfigurations(java.util.Collection<EmailConfiguration> emailConfigurations) {
        if (emailConfigurations == null) {
            this.emailConfigurations = null;
            return;
        }

        this.emailConfigurations = new java.util.ArrayList<EmailConfiguration>(emailConfigurations);
    }

    /**
     * <p>
     * Contains the configuration information of email notifications.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEmailConfigurations(java.util.Collection)} or {@link #withEmailConfigurations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param emailConfigurations
     *        Contains the configuration information of email notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationAction withEmailConfigurations(EmailConfiguration... emailConfigurations) {
        if (this.emailConfigurations == null) {
            setEmailConfigurations(new java.util.ArrayList<EmailConfiguration>(emailConfigurations.length));
        }
        for (EmailConfiguration ele : emailConfigurations) {
            this.emailConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains the configuration information of email notifications.
     * </p>
     * 
     * @param emailConfigurations
     *        Contains the configuration information of email notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationAction withEmailConfigurations(java.util.Collection<EmailConfiguration> emailConfigurations) {
        setEmailConfigurations(emailConfigurations);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getSmsConfigurations() != null)
            sb.append("SmsConfigurations: ").append(getSmsConfigurations()).append(",");
        if (getEmailConfigurations() != null)
            sb.append("EmailConfigurations: ").append(getEmailConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationAction == false)
            return false;
        NotificationAction other = (NotificationAction) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getSmsConfigurations() == null ^ this.getSmsConfigurations() == null)
            return false;
        if (other.getSmsConfigurations() != null && other.getSmsConfigurations().equals(this.getSmsConfigurations()) == false)
            return false;
        if (other.getEmailConfigurations() == null ^ this.getEmailConfigurations() == null)
            return false;
        if (other.getEmailConfigurations() != null && other.getEmailConfigurations().equals(this.getEmailConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getSmsConfigurations() == null) ? 0 : getSmsConfigurations().hashCode());
        hashCode = prime * hashCode + ((getEmailConfigurations() == null) ? 0 : getEmailConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public NotificationAction clone() {
        try {
            return (NotificationAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.NotificationActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
