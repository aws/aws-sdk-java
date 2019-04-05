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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Settings that allow management of telephony permissions for an Amazon Chime user, such as inbound and outbound
 * calling and text messaging.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/TelephonySettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TelephonySettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Allows or denies inbound calling.
     * </p>
     */
    private Boolean inboundCalling;
    /**
     * <p>
     * Allows or denies outbound calling.
     * </p>
     */
    private Boolean outboundCalling;
    /**
     * <p>
     * Allows or denies SMS messaging.
     * </p>
     */
    private Boolean sMS;

    /**
     * <p>
     * Allows or denies inbound calling.
     * </p>
     * 
     * @param inboundCalling
     *        Allows or denies inbound calling.
     */

    public void setInboundCalling(Boolean inboundCalling) {
        this.inboundCalling = inboundCalling;
    }

    /**
     * <p>
     * Allows or denies inbound calling.
     * </p>
     * 
     * @return Allows or denies inbound calling.
     */

    public Boolean getInboundCalling() {
        return this.inboundCalling;
    }

    /**
     * <p>
     * Allows or denies inbound calling.
     * </p>
     * 
     * @param inboundCalling
     *        Allows or denies inbound calling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TelephonySettings withInboundCalling(Boolean inboundCalling) {
        setInboundCalling(inboundCalling);
        return this;
    }

    /**
     * <p>
     * Allows or denies inbound calling.
     * </p>
     * 
     * @return Allows or denies inbound calling.
     */

    public Boolean isInboundCalling() {
        return this.inboundCalling;
    }

    /**
     * <p>
     * Allows or denies outbound calling.
     * </p>
     * 
     * @param outboundCalling
     *        Allows or denies outbound calling.
     */

    public void setOutboundCalling(Boolean outboundCalling) {
        this.outboundCalling = outboundCalling;
    }

    /**
     * <p>
     * Allows or denies outbound calling.
     * </p>
     * 
     * @return Allows or denies outbound calling.
     */

    public Boolean getOutboundCalling() {
        return this.outboundCalling;
    }

    /**
     * <p>
     * Allows or denies outbound calling.
     * </p>
     * 
     * @param outboundCalling
     *        Allows or denies outbound calling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TelephonySettings withOutboundCalling(Boolean outboundCalling) {
        setOutboundCalling(outboundCalling);
        return this;
    }

    /**
     * <p>
     * Allows or denies outbound calling.
     * </p>
     * 
     * @return Allows or denies outbound calling.
     */

    public Boolean isOutboundCalling() {
        return this.outboundCalling;
    }

    /**
     * <p>
     * Allows or denies SMS messaging.
     * </p>
     * 
     * @param sMS
     *        Allows or denies SMS messaging.
     */

    public void setSMS(Boolean sMS) {
        this.sMS = sMS;
    }

    /**
     * <p>
     * Allows or denies SMS messaging.
     * </p>
     * 
     * @return Allows or denies SMS messaging.
     */

    public Boolean getSMS() {
        return this.sMS;
    }

    /**
     * <p>
     * Allows or denies SMS messaging.
     * </p>
     * 
     * @param sMS
     *        Allows or denies SMS messaging.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TelephonySettings withSMS(Boolean sMS) {
        setSMS(sMS);
        return this;
    }

    /**
     * <p>
     * Allows or denies SMS messaging.
     * </p>
     * 
     * @return Allows or denies SMS messaging.
     */

    public Boolean isSMS() {
        return this.sMS;
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
        if (getInboundCalling() != null)
            sb.append("InboundCalling: ").append(getInboundCalling()).append(",");
        if (getOutboundCalling() != null)
            sb.append("OutboundCalling: ").append(getOutboundCalling()).append(",");
        if (getSMS() != null)
            sb.append("SMS: ").append(getSMS());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TelephonySettings == false)
            return false;
        TelephonySettings other = (TelephonySettings) obj;
        if (other.getInboundCalling() == null ^ this.getInboundCalling() == null)
            return false;
        if (other.getInboundCalling() != null && other.getInboundCalling().equals(this.getInboundCalling()) == false)
            return false;
        if (other.getOutboundCalling() == null ^ this.getOutboundCalling() == null)
            return false;
        if (other.getOutboundCalling() != null && other.getOutboundCalling().equals(this.getOutboundCalling()) == false)
            return false;
        if (other.getSMS() == null ^ this.getSMS() == null)
            return false;
        if (other.getSMS() != null && other.getSMS().equals(this.getSMS()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInboundCalling() == null) ? 0 : getInboundCalling().hashCode());
        hashCode = prime * hashCode + ((getOutboundCalling() == null) ? 0 : getOutboundCalling().hashCode());
        hashCode = prime * hashCode + ((getSMS() == null) ? 0 : getSMS().hashCode());
        return hashCode;
    }

    @Override
    public TelephonySettings clone() {
        try {
            return (TelephonySettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.TelephonySettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
