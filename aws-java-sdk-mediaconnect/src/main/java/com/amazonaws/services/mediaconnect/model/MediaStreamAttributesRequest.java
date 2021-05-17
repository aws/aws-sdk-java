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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Attributes that are related to the media stream.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/MediaStreamAttributesRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaStreamAttributesRequest implements Serializable, Cloneable, StructuredPojo {

    /** The settings that you want to use to define the media stream. */
    private FmtpRequest fmtp;
    /** The audio language, in a format that is recognized by the receiver. */
    private String lang;

    /**
     * The settings that you want to use to define the media stream.
     * 
     * @param fmtp
     *        The settings that you want to use to define the media stream.
     */

    public void setFmtp(FmtpRequest fmtp) {
        this.fmtp = fmtp;
    }

    /**
     * The settings that you want to use to define the media stream.
     * 
     * @return The settings that you want to use to define the media stream.
     */

    public FmtpRequest getFmtp() {
        return this.fmtp;
    }

    /**
     * The settings that you want to use to define the media stream.
     * 
     * @param fmtp
     *        The settings that you want to use to define the media stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaStreamAttributesRequest withFmtp(FmtpRequest fmtp) {
        setFmtp(fmtp);
        return this;
    }

    /**
     * The audio language, in a format that is recognized by the receiver.
     * 
     * @param lang
     *        The audio language, in a format that is recognized by the receiver.
     */

    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * The audio language, in a format that is recognized by the receiver.
     * 
     * @return The audio language, in a format that is recognized by the receiver.
     */

    public String getLang() {
        return this.lang;
    }

    /**
     * The audio language, in a format that is recognized by the receiver.
     * 
     * @param lang
     *        The audio language, in a format that is recognized by the receiver.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaStreamAttributesRequest withLang(String lang) {
        setLang(lang);
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
        if (getFmtp() != null)
            sb.append("Fmtp: ").append(getFmtp()).append(",");
        if (getLang() != null)
            sb.append("Lang: ").append(getLang());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaStreamAttributesRequest == false)
            return false;
        MediaStreamAttributesRequest other = (MediaStreamAttributesRequest) obj;
        if (other.getFmtp() == null ^ this.getFmtp() == null)
            return false;
        if (other.getFmtp() != null && other.getFmtp().equals(this.getFmtp()) == false)
            return false;
        if (other.getLang() == null ^ this.getLang() == null)
            return false;
        if (other.getLang() != null && other.getLang().equals(this.getLang()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFmtp() == null) ? 0 : getFmtp().hashCode());
        hashCode = prime * hashCode + ((getLang() == null) ? 0 : getLang().hashCode());
        return hashCode;
    }

    @Override
    public MediaStreamAttributesRequest clone() {
        try {
            return (MediaStreamAttributesRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.MediaStreamAttributesRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
