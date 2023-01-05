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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The alphanumeric sender ID in a specific country that you want to describe. For more information on sender IDs see <a
 * href="https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-awssupport-sender-id.html">Requesting sender
 * IDs for SMS messaging with Amazon Pinpoint </a> in the <i>Amazon Pinpoint User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/SenderIdAndCountry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SenderIdAndCountry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the sender.
     * </p>
     */
    private String senderId;
    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * </p>
     */
    private String isoCountryCode;

    /**
     * <p>
     * The unique identifier of the sender.
     * </p>
     * 
     * @param senderId
     *        The unique identifier of the sender.
     */

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    /**
     * <p>
     * The unique identifier of the sender.
     * </p>
     * 
     * @return The unique identifier of the sender.
     */

    public String getSenderId() {
        return this.senderId;
    }

    /**
     * <p>
     * The unique identifier of the sender.
     * </p>
     * 
     * @param senderId
     *        The unique identifier of the sender.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SenderIdAndCountry withSenderId(String senderId) {
        setSenderId(senderId);
        return this;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * </p>
     * 
     * @param isoCountryCode
     *        The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     */

    public void setIsoCountryCode(String isoCountryCode) {
        this.isoCountryCode = isoCountryCode;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * </p>
     * 
     * @return The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     */

    public String getIsoCountryCode() {
        return this.isoCountryCode;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * </p>
     * 
     * @param isoCountryCode
     *        The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SenderIdAndCountry withIsoCountryCode(String isoCountryCode) {
        setIsoCountryCode(isoCountryCode);
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
        if (getSenderId() != null)
            sb.append("SenderId: ").append(getSenderId()).append(",");
        if (getIsoCountryCode() != null)
            sb.append("IsoCountryCode: ").append(getIsoCountryCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SenderIdAndCountry == false)
            return false;
        SenderIdAndCountry other = (SenderIdAndCountry) obj;
        if (other.getSenderId() == null ^ this.getSenderId() == null)
            return false;
        if (other.getSenderId() != null && other.getSenderId().equals(this.getSenderId()) == false)
            return false;
        if (other.getIsoCountryCode() == null ^ this.getIsoCountryCode() == null)
            return false;
        if (other.getIsoCountryCode() != null && other.getIsoCountryCode().equals(this.getIsoCountryCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSenderId() == null) ? 0 : getSenderId().hashCode());
        hashCode = prime * hashCode + ((getIsoCountryCode() == null) ? 0 : getIsoCountryCode().hashCode());
        return hashCode;
    }

    @Override
    public SenderIdAndCountry clone() {
        try {
            return (SenderIdAndCountry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointsmsvoicev2.model.transform.SenderIdAndCountryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
