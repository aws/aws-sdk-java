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
 * Information about an email identity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/IdentityInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdentityInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The email identity type. The identity type can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EMAIL_ADDRESS</code> – The identity is an email address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOMAIN</code> – The identity is a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MANAGED_DOMAIN</code> – The identity is a domain that is managed by AWS.
     * </p>
     * </li>
     * </ul>
     */
    private String identityType;
    /**
     * <p>
     * The address or domain of the identity.
     * </p>
     */
    private String identityName;
    /**
     * <p>
     * Indicates whether or not you can send email from the identity.
     * </p>
     * <p>
     * In Amazon Pinpoint, an identity is an email address or domain that you send email from. Before you can send email
     * from an identity, you have to demostrate that you own the identity, and that you authorize Amazon Pinpoint to
     * send email from that identity.
     * </p>
     */
    private Boolean sendingEnabled;

    /**
     * <p>
     * The email identity type. The identity type can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EMAIL_ADDRESS</code> – The identity is an email address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOMAIN</code> – The identity is a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MANAGED_DOMAIN</code> – The identity is a domain that is managed by AWS.
     * </p>
     * </li>
     * </ul>
     * 
     * @param identityType
     *        The email identity type. The identity type can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>EMAIL_ADDRESS</code> – The identity is an email address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DOMAIN</code> – The identity is a domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MANAGED_DOMAIN</code> – The identity is a domain that is managed by AWS.
     *        </p>
     *        </li>
     * @see IdentityType
     */

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    /**
     * <p>
     * The email identity type. The identity type can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EMAIL_ADDRESS</code> – The identity is an email address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOMAIN</code> – The identity is a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MANAGED_DOMAIN</code> – The identity is a domain that is managed by AWS.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The email identity type. The identity type can be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>EMAIL_ADDRESS</code> – The identity is an email address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DOMAIN</code> – The identity is a domain.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MANAGED_DOMAIN</code> – The identity is a domain that is managed by AWS.
     *         </p>
     *         </li>
     * @see IdentityType
     */

    public String getIdentityType() {
        return this.identityType;
    }

    /**
     * <p>
     * The email identity type. The identity type can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EMAIL_ADDRESS</code> – The identity is an email address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOMAIN</code> – The identity is a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MANAGED_DOMAIN</code> – The identity is a domain that is managed by AWS.
     * </p>
     * </li>
     * </ul>
     * 
     * @param identityType
     *        The email identity type. The identity type can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>EMAIL_ADDRESS</code> – The identity is an email address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DOMAIN</code> – The identity is a domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MANAGED_DOMAIN</code> – The identity is a domain that is managed by AWS.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityType
     */

    public IdentityInfo withIdentityType(String identityType) {
        setIdentityType(identityType);
        return this;
    }

    /**
     * <p>
     * The email identity type. The identity type can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EMAIL_ADDRESS</code> – The identity is an email address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOMAIN</code> – The identity is a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MANAGED_DOMAIN</code> – The identity is a domain that is managed by AWS.
     * </p>
     * </li>
     * </ul>
     * 
     * @param identityType
     *        The email identity type. The identity type can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>EMAIL_ADDRESS</code> – The identity is an email address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DOMAIN</code> – The identity is a domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MANAGED_DOMAIN</code> – The identity is a domain that is managed by AWS.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityType
     */

    public IdentityInfo withIdentityType(IdentityType identityType) {
        this.identityType = identityType.toString();
        return this;
    }

    /**
     * <p>
     * The address or domain of the identity.
     * </p>
     * 
     * @param identityName
     *        The address or domain of the identity.
     */

    public void setIdentityName(String identityName) {
        this.identityName = identityName;
    }

    /**
     * <p>
     * The address or domain of the identity.
     * </p>
     * 
     * @return The address or domain of the identity.
     */

    public String getIdentityName() {
        return this.identityName;
    }

    /**
     * <p>
     * The address or domain of the identity.
     * </p>
     * 
     * @param identityName
     *        The address or domain of the identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityInfo withIdentityName(String identityName) {
        setIdentityName(identityName);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not you can send email from the identity.
     * </p>
     * <p>
     * In Amazon Pinpoint, an identity is an email address or domain that you send email from. Before you can send email
     * from an identity, you have to demostrate that you own the identity, and that you authorize Amazon Pinpoint to
     * send email from that identity.
     * </p>
     * 
     * @param sendingEnabled
     *        Indicates whether or not you can send email from the identity.</p>
     *        <p>
     *        In Amazon Pinpoint, an identity is an email address or domain that you send email from. Before you can
     *        send email from an identity, you have to demostrate that you own the identity, and that you authorize
     *        Amazon Pinpoint to send email from that identity.
     */

    public void setSendingEnabled(Boolean sendingEnabled) {
        this.sendingEnabled = sendingEnabled;
    }

    /**
     * <p>
     * Indicates whether or not you can send email from the identity.
     * </p>
     * <p>
     * In Amazon Pinpoint, an identity is an email address or domain that you send email from. Before you can send email
     * from an identity, you have to demostrate that you own the identity, and that you authorize Amazon Pinpoint to
     * send email from that identity.
     * </p>
     * 
     * @return Indicates whether or not you can send email from the identity.</p>
     *         <p>
     *         In Amazon Pinpoint, an identity is an email address or domain that you send email from. Before you can
     *         send email from an identity, you have to demostrate that you own the identity, and that you authorize
     *         Amazon Pinpoint to send email from that identity.
     */

    public Boolean getSendingEnabled() {
        return this.sendingEnabled;
    }

    /**
     * <p>
     * Indicates whether or not you can send email from the identity.
     * </p>
     * <p>
     * In Amazon Pinpoint, an identity is an email address or domain that you send email from. Before you can send email
     * from an identity, you have to demostrate that you own the identity, and that you authorize Amazon Pinpoint to
     * send email from that identity.
     * </p>
     * 
     * @param sendingEnabled
     *        Indicates whether or not you can send email from the identity.</p>
     *        <p>
     *        In Amazon Pinpoint, an identity is an email address or domain that you send email from. Before you can
     *        send email from an identity, you have to demostrate that you own the identity, and that you authorize
     *        Amazon Pinpoint to send email from that identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityInfo withSendingEnabled(Boolean sendingEnabled) {
        setSendingEnabled(sendingEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not you can send email from the identity.
     * </p>
     * <p>
     * In Amazon Pinpoint, an identity is an email address or domain that you send email from. Before you can send email
     * from an identity, you have to demostrate that you own the identity, and that you authorize Amazon Pinpoint to
     * send email from that identity.
     * </p>
     * 
     * @return Indicates whether or not you can send email from the identity.</p>
     *         <p>
     *         In Amazon Pinpoint, an identity is an email address or domain that you send email from. Before you can
     *         send email from an identity, you have to demostrate that you own the identity, and that you authorize
     *         Amazon Pinpoint to send email from that identity.
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
        if (getIdentityType() != null)
            sb.append("IdentityType: ").append(getIdentityType()).append(",");
        if (getIdentityName() != null)
            sb.append("IdentityName: ").append(getIdentityName()).append(",");
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

        if (obj instanceof IdentityInfo == false)
            return false;
        IdentityInfo other = (IdentityInfo) obj;
        if (other.getIdentityType() == null ^ this.getIdentityType() == null)
            return false;
        if (other.getIdentityType() != null && other.getIdentityType().equals(this.getIdentityType()) == false)
            return false;
        if (other.getIdentityName() == null ^ this.getIdentityName() == null)
            return false;
        if (other.getIdentityName() != null && other.getIdentityName().equals(this.getIdentityName()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getIdentityType() == null) ? 0 : getIdentityType().hashCode());
        hashCode = prime * hashCode + ((getIdentityName() == null) ? 0 : getIdentityName().hashCode());
        hashCode = prime * hashCode + ((getSendingEnabled() == null) ? 0 : getSendingEnabled().hashCode());
        return hashCode;
    }

    @Override
    public IdentityInfo clone() {
        try {
            return (IdentityInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointemail.model.transform.IdentityInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
