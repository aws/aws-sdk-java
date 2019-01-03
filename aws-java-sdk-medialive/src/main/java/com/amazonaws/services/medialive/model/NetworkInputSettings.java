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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Network source to transcode. Must be accessible to the Elemental Live node that is running the live event through a
 * network connection.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/NetworkInputSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkInputSettings implements Serializable, Cloneable, StructuredPojo {

    /** Specifies HLS input settings when the uri is for a HLS manifest. */
    private HlsInputSettings hlsInputSettings;
    /**
     * Check HTTPS server certificates. When set to checkCryptographyOnly, cryptography in the certificate will be
     * checked, but not the server's name. Certain subdomains (notably S3 buckets that use dots in the bucket name) do
     * not strictly match the corresponding certificate's wildcard pattern and would otherwise cause the event to error.
     * This setting is ignored for protocols that do not use https.
     */
    private String serverValidation;

    /**
     * Specifies HLS input settings when the uri is for a HLS manifest.
     * 
     * @param hlsInputSettings
     *        Specifies HLS input settings when the uri is for a HLS manifest.
     */

    public void setHlsInputSettings(HlsInputSettings hlsInputSettings) {
        this.hlsInputSettings = hlsInputSettings;
    }

    /**
     * Specifies HLS input settings when the uri is for a HLS manifest.
     * 
     * @return Specifies HLS input settings when the uri is for a HLS manifest.
     */

    public HlsInputSettings getHlsInputSettings() {
        return this.hlsInputSettings;
    }

    /**
     * Specifies HLS input settings when the uri is for a HLS manifest.
     * 
     * @param hlsInputSettings
     *        Specifies HLS input settings when the uri is for a HLS manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInputSettings withHlsInputSettings(HlsInputSettings hlsInputSettings) {
        setHlsInputSettings(hlsInputSettings);
        return this;
    }

    /**
     * Check HTTPS server certificates. When set to checkCryptographyOnly, cryptography in the certificate will be
     * checked, but not the server's name. Certain subdomains (notably S3 buckets that use dots in the bucket name) do
     * not strictly match the corresponding certificate's wildcard pattern and would otherwise cause the event to error.
     * This setting is ignored for protocols that do not use https.
     * 
     * @param serverValidation
     *        Check HTTPS server certificates. When set to checkCryptographyOnly, cryptography in the certificate will
     *        be checked, but not the server's name. Certain subdomains (notably S3 buckets that use dots in the bucket
     *        name) do not strictly match the corresponding certificate's wildcard pattern and would otherwise cause the
     *        event to error. This setting is ignored for protocols that do not use https.
     * @see NetworkInputServerValidation
     */

    public void setServerValidation(String serverValidation) {
        this.serverValidation = serverValidation;
    }

    /**
     * Check HTTPS server certificates. When set to checkCryptographyOnly, cryptography in the certificate will be
     * checked, but not the server's name. Certain subdomains (notably S3 buckets that use dots in the bucket name) do
     * not strictly match the corresponding certificate's wildcard pattern and would otherwise cause the event to error.
     * This setting is ignored for protocols that do not use https.
     * 
     * @return Check HTTPS server certificates. When set to checkCryptographyOnly, cryptography in the certificate will
     *         be checked, but not the server's name. Certain subdomains (notably S3 buckets that use dots in the bucket
     *         name) do not strictly match the corresponding certificate's wildcard pattern and would otherwise cause
     *         the event to error. This setting is ignored for protocols that do not use https.
     * @see NetworkInputServerValidation
     */

    public String getServerValidation() {
        return this.serverValidation;
    }

    /**
     * Check HTTPS server certificates. When set to checkCryptographyOnly, cryptography in the certificate will be
     * checked, but not the server's name. Certain subdomains (notably S3 buckets that use dots in the bucket name) do
     * not strictly match the corresponding certificate's wildcard pattern and would otherwise cause the event to error.
     * This setting is ignored for protocols that do not use https.
     * 
     * @param serverValidation
     *        Check HTTPS server certificates. When set to checkCryptographyOnly, cryptography in the certificate will
     *        be checked, but not the server's name. Certain subdomains (notably S3 buckets that use dots in the bucket
     *        name) do not strictly match the corresponding certificate's wildcard pattern and would otherwise cause the
     *        event to error. This setting is ignored for protocols that do not use https.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkInputServerValidation
     */

    public NetworkInputSettings withServerValidation(String serverValidation) {
        setServerValidation(serverValidation);
        return this;
    }

    /**
     * Check HTTPS server certificates. When set to checkCryptographyOnly, cryptography in the certificate will be
     * checked, but not the server's name. Certain subdomains (notably S3 buckets that use dots in the bucket name) do
     * not strictly match the corresponding certificate's wildcard pattern and would otherwise cause the event to error.
     * This setting is ignored for protocols that do not use https.
     * 
     * @param serverValidation
     *        Check HTTPS server certificates. When set to checkCryptographyOnly, cryptography in the certificate will
     *        be checked, but not the server's name. Certain subdomains (notably S3 buckets that use dots in the bucket
     *        name) do not strictly match the corresponding certificate's wildcard pattern and would otherwise cause the
     *        event to error. This setting is ignored for protocols that do not use https.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkInputServerValidation
     */

    public NetworkInputSettings withServerValidation(NetworkInputServerValidation serverValidation) {
        this.serverValidation = serverValidation.toString();
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
        if (getHlsInputSettings() != null)
            sb.append("HlsInputSettings: ").append(getHlsInputSettings()).append(",");
        if (getServerValidation() != null)
            sb.append("ServerValidation: ").append(getServerValidation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkInputSettings == false)
            return false;
        NetworkInputSettings other = (NetworkInputSettings) obj;
        if (other.getHlsInputSettings() == null ^ this.getHlsInputSettings() == null)
            return false;
        if (other.getHlsInputSettings() != null && other.getHlsInputSettings().equals(this.getHlsInputSettings()) == false)
            return false;
        if (other.getServerValidation() == null ^ this.getServerValidation() == null)
            return false;
        if (other.getServerValidation() != null && other.getServerValidation().equals(this.getServerValidation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHlsInputSettings() == null) ? 0 : getHlsInputSettings().hashCode());
        hashCode = prime * hashCode + ((getServerValidation() == null) ? 0 : getServerValidation().hashCode());
        return hashCode;
    }

    @Override
    public NetworkInputSettings clone() {
        try {
            return (NetworkInputSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.NetworkInputSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
