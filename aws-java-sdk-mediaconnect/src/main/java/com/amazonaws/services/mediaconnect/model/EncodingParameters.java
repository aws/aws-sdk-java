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
 * A collection of parameters that determine how MediaConnect will convert the content. These fields only apply to
 * outputs on flows that have a CDI source.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/EncodingParameters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncodingParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * A value that is used to calculate compression for an output. The bitrate of the output is calculated as follows:
     * Output bitrate = (1 / compressionFactor) * (source bitrate) This property only applies to outputs that use the ST
     * 2110 JPEG XS protocol, with a flow source that uses the CDI protocol. Valid values are floating point numbers in
     * the range of 3.0 to 10.0, inclusive.
     */
    private Double compressionFactor;
    /**
     * A setting on the encoder that drives compression settings. This property only applies to video media streams
     * associated with outputs that use the ST 2110 JPEG XS protocol, with a flow source that uses the CDI protocol.
     */
    private String encoderProfile;

    /**
     * A value that is used to calculate compression for an output. The bitrate of the output is calculated as follows:
     * Output bitrate = (1 / compressionFactor) * (source bitrate) This property only applies to outputs that use the ST
     * 2110 JPEG XS protocol, with a flow source that uses the CDI protocol. Valid values are floating point numbers in
     * the range of 3.0 to 10.0, inclusive.
     * 
     * @param compressionFactor
     *        A value that is used to calculate compression for an output. The bitrate of the output is calculated as
     *        follows: Output bitrate = (1 / compressionFactor) * (source bitrate) This property only applies to outputs
     *        that use the ST 2110 JPEG XS protocol, with a flow source that uses the CDI protocol. Valid values are
     *        floating point numbers in the range of 3.0 to 10.0, inclusive.
     */

    public void setCompressionFactor(Double compressionFactor) {
        this.compressionFactor = compressionFactor;
    }

    /**
     * A value that is used to calculate compression for an output. The bitrate of the output is calculated as follows:
     * Output bitrate = (1 / compressionFactor) * (source bitrate) This property only applies to outputs that use the ST
     * 2110 JPEG XS protocol, with a flow source that uses the CDI protocol. Valid values are floating point numbers in
     * the range of 3.0 to 10.0, inclusive.
     * 
     * @return A value that is used to calculate compression for an output. The bitrate of the output is calculated as
     *         follows: Output bitrate = (1 / compressionFactor) * (source bitrate) This property only applies to
     *         outputs that use the ST 2110 JPEG XS protocol, with a flow source that uses the CDI protocol. Valid
     *         values are floating point numbers in the range of 3.0 to 10.0, inclusive.
     */

    public Double getCompressionFactor() {
        return this.compressionFactor;
    }

    /**
     * A value that is used to calculate compression for an output. The bitrate of the output is calculated as follows:
     * Output bitrate = (1 / compressionFactor) * (source bitrate) This property only applies to outputs that use the ST
     * 2110 JPEG XS protocol, with a flow source that uses the CDI protocol. Valid values are floating point numbers in
     * the range of 3.0 to 10.0, inclusive.
     * 
     * @param compressionFactor
     *        A value that is used to calculate compression for an output. The bitrate of the output is calculated as
     *        follows: Output bitrate = (1 / compressionFactor) * (source bitrate) This property only applies to outputs
     *        that use the ST 2110 JPEG XS protocol, with a flow source that uses the CDI protocol. Valid values are
     *        floating point numbers in the range of 3.0 to 10.0, inclusive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncodingParameters withCompressionFactor(Double compressionFactor) {
        setCompressionFactor(compressionFactor);
        return this;
    }

    /**
     * A setting on the encoder that drives compression settings. This property only applies to video media streams
     * associated with outputs that use the ST 2110 JPEG XS protocol, with a flow source that uses the CDI protocol.
     * 
     * @param encoderProfile
     *        A setting on the encoder that drives compression settings. This property only applies to video media
     *        streams associated with outputs that use the ST 2110 JPEG XS protocol, with a flow source that uses the
     *        CDI protocol.
     * @see EncoderProfile
     */

    public void setEncoderProfile(String encoderProfile) {
        this.encoderProfile = encoderProfile;
    }

    /**
     * A setting on the encoder that drives compression settings. This property only applies to video media streams
     * associated with outputs that use the ST 2110 JPEG XS protocol, with a flow source that uses the CDI protocol.
     * 
     * @return A setting on the encoder that drives compression settings. This property only applies to video media
     *         streams associated with outputs that use the ST 2110 JPEG XS protocol, with a flow source that uses the
     *         CDI protocol.
     * @see EncoderProfile
     */

    public String getEncoderProfile() {
        return this.encoderProfile;
    }

    /**
     * A setting on the encoder that drives compression settings. This property only applies to video media streams
     * associated with outputs that use the ST 2110 JPEG XS protocol, with a flow source that uses the CDI protocol.
     * 
     * @param encoderProfile
     *        A setting on the encoder that drives compression settings. This property only applies to video media
     *        streams associated with outputs that use the ST 2110 JPEG XS protocol, with a flow source that uses the
     *        CDI protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncoderProfile
     */

    public EncodingParameters withEncoderProfile(String encoderProfile) {
        setEncoderProfile(encoderProfile);
        return this;
    }

    /**
     * A setting on the encoder that drives compression settings. This property only applies to video media streams
     * associated with outputs that use the ST 2110 JPEG XS protocol, with a flow source that uses the CDI protocol.
     * 
     * @param encoderProfile
     *        A setting on the encoder that drives compression settings. This property only applies to video media
     *        streams associated with outputs that use the ST 2110 JPEG XS protocol, with a flow source that uses the
     *        CDI protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncoderProfile
     */

    public EncodingParameters withEncoderProfile(EncoderProfile encoderProfile) {
        this.encoderProfile = encoderProfile.toString();
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
        if (getCompressionFactor() != null)
            sb.append("CompressionFactor: ").append(getCompressionFactor()).append(",");
        if (getEncoderProfile() != null)
            sb.append("EncoderProfile: ").append(getEncoderProfile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncodingParameters == false)
            return false;
        EncodingParameters other = (EncodingParameters) obj;
        if (other.getCompressionFactor() == null ^ this.getCompressionFactor() == null)
            return false;
        if (other.getCompressionFactor() != null && other.getCompressionFactor().equals(this.getCompressionFactor()) == false)
            return false;
        if (other.getEncoderProfile() == null ^ this.getEncoderProfile() == null)
            return false;
        if (other.getEncoderProfile() != null && other.getEncoderProfile().equals(this.getEncoderProfile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompressionFactor() == null) ? 0 : getCompressionFactor().hashCode());
        hashCode = prime * hashCode + ((getEncoderProfile() == null) ? 0 : getEncoderProfile().hashCode());
        return hashCode;
    }

    @Override
    public EncodingParameters clone() {
        try {
            return (EncodingParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.EncodingParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
