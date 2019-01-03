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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Used to enable or disable email sending for messages that use this configuration set in the current AWS Region.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/SendingOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendingOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If <code>true</code>, email sending is enabled for the configuration set. If <code>false</code>, email sending is
     * disabled for the configuration set.
     * </p>
     */
    private Boolean sendingEnabled;

    /**
     * <p>
     * If <code>true</code>, email sending is enabled for the configuration set. If <code>false</code>, email sending is
     * disabled for the configuration set.
     * </p>
     * 
     * @param sendingEnabled
     *        If <code>true</code>, email sending is enabled for the configuration set. If <code>false</code>, email
     *        sending is disabled for the configuration set.
     */

    public void setSendingEnabled(Boolean sendingEnabled) {
        this.sendingEnabled = sendingEnabled;
    }

    /**
     * <p>
     * If <code>true</code>, email sending is enabled for the configuration set. If <code>false</code>, email sending is
     * disabled for the configuration set.
     * </p>
     * 
     * @return If <code>true</code>, email sending is enabled for the configuration set. If <code>false</code>, email
     *         sending is disabled for the configuration set.
     */

    public Boolean getSendingEnabled() {
        return this.sendingEnabled;
    }

    /**
     * <p>
     * If <code>true</code>, email sending is enabled for the configuration set. If <code>false</code>, email sending is
     * disabled for the configuration set.
     * </p>
     * 
     * @param sendingEnabled
     *        If <code>true</code>, email sending is enabled for the configuration set. If <code>false</code>, email
     *        sending is disabled for the configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendingOptions withSendingEnabled(Boolean sendingEnabled) {
        setSendingEnabled(sendingEnabled);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, email sending is enabled for the configuration set. If <code>false</code>, email sending is
     * disabled for the configuration set.
     * </p>
     * 
     * @return If <code>true</code>, email sending is enabled for the configuration set. If <code>false</code>, email
     *         sending is disabled for the configuration set.
     */

    public Boolean isSendingEnabled() {
        return this.sendingEnabled;
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
        if (getSendingEnabled() != null)
            sb.append("SendingEnabled: ").append(getSendingEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendingOptions == false)
            return false;
        SendingOptions other = (SendingOptions) obj;
        if (other.getSendingEnabled() == null ^ this.getSendingEnabled() == null)
            return false;
        if (other.getSendingEnabled() != null && other.getSendingEnabled().equals(this.getSendingEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSendingEnabled() == null) ? 0 : getSendingEnabled().hashCode());
        return hashCode;
    }

    @Override
    public SendingOptions clone() {
        try {
            return (SendingOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointemail.model.transform.SendingOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
