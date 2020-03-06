/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.signer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Any overrides that are applied to the signing configuration of a code signing platform.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/SigningPlatformOverrides" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SigningPlatformOverrides implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A signing configuration that overrides the default encryption or hash algorithm of a signing job.
     * </p>
     */
    private SigningConfigurationOverrides signingConfiguration;
    /**
     * <p>
     * A signed image is a JSON object. When overriding the default signing platform configuration, a customer can
     * select either of two signing formats, <code>JSONEmbedded</code> or <code>JSONDetached</code>. (A third format
     * value, <code>JSON</code>, is reserved for future use.) With <code>JSONEmbedded</code>, the signing image has the
     * payload embedded in it. With <code>JSONDetached</code>, the payload is not be embedded in the signing image.
     * </p>
     */
    private String signingImageFormat;

    /**
     * <p>
     * A signing configuration that overrides the default encryption or hash algorithm of a signing job.
     * </p>
     * 
     * @param signingConfiguration
     *        A signing configuration that overrides the default encryption or hash algorithm of a signing job.
     */

    public void setSigningConfiguration(SigningConfigurationOverrides signingConfiguration) {
        this.signingConfiguration = signingConfiguration;
    }

    /**
     * <p>
     * A signing configuration that overrides the default encryption or hash algorithm of a signing job.
     * </p>
     * 
     * @return A signing configuration that overrides the default encryption or hash algorithm of a signing job.
     */

    public SigningConfigurationOverrides getSigningConfiguration() {
        return this.signingConfiguration;
    }

    /**
     * <p>
     * A signing configuration that overrides the default encryption or hash algorithm of a signing job.
     * </p>
     * 
     * @param signingConfiguration
     *        A signing configuration that overrides the default encryption or hash algorithm of a signing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningPlatformOverrides withSigningConfiguration(SigningConfigurationOverrides signingConfiguration) {
        setSigningConfiguration(signingConfiguration);
        return this;
    }

    /**
     * <p>
     * A signed image is a JSON object. When overriding the default signing platform configuration, a customer can
     * select either of two signing formats, <code>JSONEmbedded</code> or <code>JSONDetached</code>. (A third format
     * value, <code>JSON</code>, is reserved for future use.) With <code>JSONEmbedded</code>, the signing image has the
     * payload embedded in it. With <code>JSONDetached</code>, the payload is not be embedded in the signing image.
     * </p>
     * 
     * @param signingImageFormat
     *        A signed image is a JSON object. When overriding the default signing platform configuration, a customer
     *        can select either of two signing formats, <code>JSONEmbedded</code> or <code>JSONDetached</code>. (A third
     *        format value, <code>JSON</code>, is reserved for future use.) With <code>JSONEmbedded</code>, the signing
     *        image has the payload embedded in it. With <code>JSONDetached</code>, the payload is not be embedded in
     *        the signing image.
     * @see ImageFormat
     */

    public void setSigningImageFormat(String signingImageFormat) {
        this.signingImageFormat = signingImageFormat;
    }

    /**
     * <p>
     * A signed image is a JSON object. When overriding the default signing platform configuration, a customer can
     * select either of two signing formats, <code>JSONEmbedded</code> or <code>JSONDetached</code>. (A third format
     * value, <code>JSON</code>, is reserved for future use.) With <code>JSONEmbedded</code>, the signing image has the
     * payload embedded in it. With <code>JSONDetached</code>, the payload is not be embedded in the signing image.
     * </p>
     * 
     * @return A signed image is a JSON object. When overriding the default signing platform configuration, a customer
     *         can select either of two signing formats, <code>JSONEmbedded</code> or <code>JSONDetached</code>. (A
     *         third format value, <code>JSON</code>, is reserved for future use.) With <code>JSONEmbedded</code>, the
     *         signing image has the payload embedded in it. With <code>JSONDetached</code>, the payload is not be
     *         embedded in the signing image.
     * @see ImageFormat
     */

    public String getSigningImageFormat() {
        return this.signingImageFormat;
    }

    /**
     * <p>
     * A signed image is a JSON object. When overriding the default signing platform configuration, a customer can
     * select either of two signing formats, <code>JSONEmbedded</code> or <code>JSONDetached</code>. (A third format
     * value, <code>JSON</code>, is reserved for future use.) With <code>JSONEmbedded</code>, the signing image has the
     * payload embedded in it. With <code>JSONDetached</code>, the payload is not be embedded in the signing image.
     * </p>
     * 
     * @param signingImageFormat
     *        A signed image is a JSON object. When overriding the default signing platform configuration, a customer
     *        can select either of two signing formats, <code>JSONEmbedded</code> or <code>JSONDetached</code>. (A third
     *        format value, <code>JSON</code>, is reserved for future use.) With <code>JSONEmbedded</code>, the signing
     *        image has the payload embedded in it. With <code>JSONDetached</code>, the payload is not be embedded in
     *        the signing image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageFormat
     */

    public SigningPlatformOverrides withSigningImageFormat(String signingImageFormat) {
        setSigningImageFormat(signingImageFormat);
        return this;
    }

    /**
     * <p>
     * A signed image is a JSON object. When overriding the default signing platform configuration, a customer can
     * select either of two signing formats, <code>JSONEmbedded</code> or <code>JSONDetached</code>. (A third format
     * value, <code>JSON</code>, is reserved for future use.) With <code>JSONEmbedded</code>, the signing image has the
     * payload embedded in it. With <code>JSONDetached</code>, the payload is not be embedded in the signing image.
     * </p>
     * 
     * @param signingImageFormat
     *        A signed image is a JSON object. When overriding the default signing platform configuration, a customer
     *        can select either of two signing formats, <code>JSONEmbedded</code> or <code>JSONDetached</code>. (A third
     *        format value, <code>JSON</code>, is reserved for future use.) With <code>JSONEmbedded</code>, the signing
     *        image has the payload embedded in it. With <code>JSONDetached</code>, the payload is not be embedded in
     *        the signing image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageFormat
     */

    public SigningPlatformOverrides withSigningImageFormat(ImageFormat signingImageFormat) {
        this.signingImageFormat = signingImageFormat.toString();
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
        if (getSigningConfiguration() != null)
            sb.append("SigningConfiguration: ").append(getSigningConfiguration()).append(",");
        if (getSigningImageFormat() != null)
            sb.append("SigningImageFormat: ").append(getSigningImageFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SigningPlatformOverrides == false)
            return false;
        SigningPlatformOverrides other = (SigningPlatformOverrides) obj;
        if (other.getSigningConfiguration() == null ^ this.getSigningConfiguration() == null)
            return false;
        if (other.getSigningConfiguration() != null && other.getSigningConfiguration().equals(this.getSigningConfiguration()) == false)
            return false;
        if (other.getSigningImageFormat() == null ^ this.getSigningImageFormat() == null)
            return false;
        if (other.getSigningImageFormat() != null && other.getSigningImageFormat().equals(this.getSigningImageFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSigningConfiguration() == null) ? 0 : getSigningConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSigningImageFormat() == null) ? 0 : getSigningImageFormat().hashCode());
        return hashCode;
    }

    @Override
    public SigningPlatformOverrides clone() {
        try {
            return (SigningPlatformOverrides) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.signer.model.transform.SigningPlatformOverridesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
