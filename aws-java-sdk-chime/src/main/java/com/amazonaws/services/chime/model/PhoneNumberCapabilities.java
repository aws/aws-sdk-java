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
 * The phone number capabilities, such as enabled inbound and outbound calling and text messaging.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PhoneNumberCapabilities" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PhoneNumberCapabilities implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Allows or denies inbound calling for the specified phone number.
     * </p>
     */
    private Boolean inboundCall;
    /**
     * <p>
     * Allows or denies outbound calling for the specified phone number.
     * </p>
     */
    private Boolean outboundCall;
    /**
     * <p>
     * Allows or denies inbound SMS messaging for the specified phone number.
     * </p>
     */
    private Boolean inboundSMS;
    /**
     * <p>
     * Allows or denies outbound SMS messaging for the specified phone number.
     * </p>
     */
    private Boolean outboundSMS;
    /**
     * <p>
     * Allows or denies inbound MMS messaging for the specified phone number.
     * </p>
     */
    private Boolean inboundMMS;
    /**
     * <p>
     * Allows or denies outbound MMS messaging for the specified phone number.
     * </p>
     */
    private Boolean outboundMMS;

    /**
     * <p>
     * Allows or denies inbound calling for the specified phone number.
     * </p>
     * 
     * @param inboundCall
     *        Allows or denies inbound calling for the specified phone number.
     */

    public void setInboundCall(Boolean inboundCall) {
        this.inboundCall = inboundCall;
    }

    /**
     * <p>
     * Allows or denies inbound calling for the specified phone number.
     * </p>
     * 
     * @return Allows or denies inbound calling for the specified phone number.
     */

    public Boolean getInboundCall() {
        return this.inboundCall;
    }

    /**
     * <p>
     * Allows or denies inbound calling for the specified phone number.
     * </p>
     * 
     * @param inboundCall
     *        Allows or denies inbound calling for the specified phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumberCapabilities withInboundCall(Boolean inboundCall) {
        setInboundCall(inboundCall);
        return this;
    }

    /**
     * <p>
     * Allows or denies inbound calling for the specified phone number.
     * </p>
     * 
     * @return Allows or denies inbound calling for the specified phone number.
     */

    public Boolean isInboundCall() {
        return this.inboundCall;
    }

    /**
     * <p>
     * Allows or denies outbound calling for the specified phone number.
     * </p>
     * 
     * @param outboundCall
     *        Allows or denies outbound calling for the specified phone number.
     */

    public void setOutboundCall(Boolean outboundCall) {
        this.outboundCall = outboundCall;
    }

    /**
     * <p>
     * Allows or denies outbound calling for the specified phone number.
     * </p>
     * 
     * @return Allows or denies outbound calling for the specified phone number.
     */

    public Boolean getOutboundCall() {
        return this.outboundCall;
    }

    /**
     * <p>
     * Allows or denies outbound calling for the specified phone number.
     * </p>
     * 
     * @param outboundCall
     *        Allows or denies outbound calling for the specified phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumberCapabilities withOutboundCall(Boolean outboundCall) {
        setOutboundCall(outboundCall);
        return this;
    }

    /**
     * <p>
     * Allows or denies outbound calling for the specified phone number.
     * </p>
     * 
     * @return Allows or denies outbound calling for the specified phone number.
     */

    public Boolean isOutboundCall() {
        return this.outboundCall;
    }

    /**
     * <p>
     * Allows or denies inbound SMS messaging for the specified phone number.
     * </p>
     * 
     * @param inboundSMS
     *        Allows or denies inbound SMS messaging for the specified phone number.
     */

    public void setInboundSMS(Boolean inboundSMS) {
        this.inboundSMS = inboundSMS;
    }

    /**
     * <p>
     * Allows or denies inbound SMS messaging for the specified phone number.
     * </p>
     * 
     * @return Allows or denies inbound SMS messaging for the specified phone number.
     */

    public Boolean getInboundSMS() {
        return this.inboundSMS;
    }

    /**
     * <p>
     * Allows or denies inbound SMS messaging for the specified phone number.
     * </p>
     * 
     * @param inboundSMS
     *        Allows or denies inbound SMS messaging for the specified phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumberCapabilities withInboundSMS(Boolean inboundSMS) {
        setInboundSMS(inboundSMS);
        return this;
    }

    /**
     * <p>
     * Allows or denies inbound SMS messaging for the specified phone number.
     * </p>
     * 
     * @return Allows or denies inbound SMS messaging for the specified phone number.
     */

    public Boolean isInboundSMS() {
        return this.inboundSMS;
    }

    /**
     * <p>
     * Allows or denies outbound SMS messaging for the specified phone number.
     * </p>
     * 
     * @param outboundSMS
     *        Allows or denies outbound SMS messaging for the specified phone number.
     */

    public void setOutboundSMS(Boolean outboundSMS) {
        this.outboundSMS = outboundSMS;
    }

    /**
     * <p>
     * Allows or denies outbound SMS messaging for the specified phone number.
     * </p>
     * 
     * @return Allows or denies outbound SMS messaging for the specified phone number.
     */

    public Boolean getOutboundSMS() {
        return this.outboundSMS;
    }

    /**
     * <p>
     * Allows or denies outbound SMS messaging for the specified phone number.
     * </p>
     * 
     * @param outboundSMS
     *        Allows or denies outbound SMS messaging for the specified phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumberCapabilities withOutboundSMS(Boolean outboundSMS) {
        setOutboundSMS(outboundSMS);
        return this;
    }

    /**
     * <p>
     * Allows or denies outbound SMS messaging for the specified phone number.
     * </p>
     * 
     * @return Allows or denies outbound SMS messaging for the specified phone number.
     */

    public Boolean isOutboundSMS() {
        return this.outboundSMS;
    }

    /**
     * <p>
     * Allows or denies inbound MMS messaging for the specified phone number.
     * </p>
     * 
     * @param inboundMMS
     *        Allows or denies inbound MMS messaging for the specified phone number.
     */

    public void setInboundMMS(Boolean inboundMMS) {
        this.inboundMMS = inboundMMS;
    }

    /**
     * <p>
     * Allows or denies inbound MMS messaging for the specified phone number.
     * </p>
     * 
     * @return Allows or denies inbound MMS messaging for the specified phone number.
     */

    public Boolean getInboundMMS() {
        return this.inboundMMS;
    }

    /**
     * <p>
     * Allows or denies inbound MMS messaging for the specified phone number.
     * </p>
     * 
     * @param inboundMMS
     *        Allows or denies inbound MMS messaging for the specified phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumberCapabilities withInboundMMS(Boolean inboundMMS) {
        setInboundMMS(inboundMMS);
        return this;
    }

    /**
     * <p>
     * Allows or denies inbound MMS messaging for the specified phone number.
     * </p>
     * 
     * @return Allows or denies inbound MMS messaging for the specified phone number.
     */

    public Boolean isInboundMMS() {
        return this.inboundMMS;
    }

    /**
     * <p>
     * Allows or denies outbound MMS messaging for the specified phone number.
     * </p>
     * 
     * @param outboundMMS
     *        Allows or denies outbound MMS messaging for the specified phone number.
     */

    public void setOutboundMMS(Boolean outboundMMS) {
        this.outboundMMS = outboundMMS;
    }

    /**
     * <p>
     * Allows or denies outbound MMS messaging for the specified phone number.
     * </p>
     * 
     * @return Allows or denies outbound MMS messaging for the specified phone number.
     */

    public Boolean getOutboundMMS() {
        return this.outboundMMS;
    }

    /**
     * <p>
     * Allows or denies outbound MMS messaging for the specified phone number.
     * </p>
     * 
     * @param outboundMMS
     *        Allows or denies outbound MMS messaging for the specified phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumberCapabilities withOutboundMMS(Boolean outboundMMS) {
        setOutboundMMS(outboundMMS);
        return this;
    }

    /**
     * <p>
     * Allows or denies outbound MMS messaging for the specified phone number.
     * </p>
     * 
     * @return Allows or denies outbound MMS messaging for the specified phone number.
     */

    public Boolean isOutboundMMS() {
        return this.outboundMMS;
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
        if (getInboundCall() != null)
            sb.append("InboundCall: ").append(getInboundCall()).append(",");
        if (getOutboundCall() != null)
            sb.append("OutboundCall: ").append(getOutboundCall()).append(",");
        if (getInboundSMS() != null)
            sb.append("InboundSMS: ").append(getInboundSMS()).append(",");
        if (getOutboundSMS() != null)
            sb.append("OutboundSMS: ").append(getOutboundSMS()).append(",");
        if (getInboundMMS() != null)
            sb.append("InboundMMS: ").append(getInboundMMS()).append(",");
        if (getOutboundMMS() != null)
            sb.append("OutboundMMS: ").append(getOutboundMMS());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PhoneNumberCapabilities == false)
            return false;
        PhoneNumberCapabilities other = (PhoneNumberCapabilities) obj;
        if (other.getInboundCall() == null ^ this.getInboundCall() == null)
            return false;
        if (other.getInboundCall() != null && other.getInboundCall().equals(this.getInboundCall()) == false)
            return false;
        if (other.getOutboundCall() == null ^ this.getOutboundCall() == null)
            return false;
        if (other.getOutboundCall() != null && other.getOutboundCall().equals(this.getOutboundCall()) == false)
            return false;
        if (other.getInboundSMS() == null ^ this.getInboundSMS() == null)
            return false;
        if (other.getInboundSMS() != null && other.getInboundSMS().equals(this.getInboundSMS()) == false)
            return false;
        if (other.getOutboundSMS() == null ^ this.getOutboundSMS() == null)
            return false;
        if (other.getOutboundSMS() != null && other.getOutboundSMS().equals(this.getOutboundSMS()) == false)
            return false;
        if (other.getInboundMMS() == null ^ this.getInboundMMS() == null)
            return false;
        if (other.getInboundMMS() != null && other.getInboundMMS().equals(this.getInboundMMS()) == false)
            return false;
        if (other.getOutboundMMS() == null ^ this.getOutboundMMS() == null)
            return false;
        if (other.getOutboundMMS() != null && other.getOutboundMMS().equals(this.getOutboundMMS()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInboundCall() == null) ? 0 : getInboundCall().hashCode());
        hashCode = prime * hashCode + ((getOutboundCall() == null) ? 0 : getOutboundCall().hashCode());
        hashCode = prime * hashCode + ((getInboundSMS() == null) ? 0 : getInboundSMS().hashCode());
        hashCode = prime * hashCode + ((getOutboundSMS() == null) ? 0 : getOutboundSMS().hashCode());
        hashCode = prime * hashCode + ((getInboundMMS() == null) ? 0 : getInboundMMS().hashCode());
        hashCode = prime * hashCode + ((getOutboundMMS() == null) ? 0 : getOutboundMMS().hashCode());
        return hashCode;
    }

    @Override
    public PhoneNumberCapabilities clone() {
        try {
            return (PhoneNumberCapabilities) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.PhoneNumberCapabilitiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
