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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * If your output group type is CMAF, use these settings when doing DRM encryption with a SPEKE-compliant key provider.
 * If your output group type is HLS, DASH, or Microsoft Smooth, use the SpekeKeyProvider settings instead.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/SpekeKeyProviderCmaf" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpekeKeyProviderCmaf implements Serializable, Cloneable, StructuredPojo {

    /**
     * If you want your key provider to encrypt the content keys that it provides to MediaConvert, set up a certificate
     * with a master key using AWS Certificate Manager. Specify the certificate's Amazon Resource Name (ARN) here.
     */
    private String certificateArn;
    /**
     * Specify the DRM system IDs that you want signaled in the DASH manifest that MediaConvert creates as part of this
     * CMAF package. The DASH manifest can currently signal up to three system IDs. For more information, see
     * https://dashif.org/identifiers/content_protection/.
     */
    private java.util.List<String> dashSignaledSystemIds;
    /**
     * Specify the DRM system ID that you want signaled in the HLS manifest that MediaConvert creates as part of this
     * CMAF package. The HLS manifest can currently signal only one system ID. For more information, see
     * https://dashif.org/identifiers/content_protection/.
     */
    private java.util.List<String> hlsSignaledSystemIds;
    /** Specify the resource ID that your SPEKE-compliant key provider uses to identify this content. */
    private String resourceId;
    /**
     * Specify the URL to the key server that your SPEKE-compliant DRM key provider uses to provide keys for encrypting
     * your content.
     */
    private String url;

    /**
     * If you want your key provider to encrypt the content keys that it provides to MediaConvert, set up a certificate
     * with a master key using AWS Certificate Manager. Specify the certificate's Amazon Resource Name (ARN) here.
     * 
     * @param certificateArn
     *        If you want your key provider to encrypt the content keys that it provides to MediaConvert, set up a
     *        certificate with a master key using AWS Certificate Manager. Specify the certificate's Amazon Resource
     *        Name (ARN) here.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * If you want your key provider to encrypt the content keys that it provides to MediaConvert, set up a certificate
     * with a master key using AWS Certificate Manager. Specify the certificate's Amazon Resource Name (ARN) here.
     * 
     * @return If you want your key provider to encrypt the content keys that it provides to MediaConvert, set up a
     *         certificate with a master key using AWS Certificate Manager. Specify the certificate's Amazon Resource
     *         Name (ARN) here.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * If you want your key provider to encrypt the content keys that it provides to MediaConvert, set up a certificate
     * with a master key using AWS Certificate Manager. Specify the certificate's Amazon Resource Name (ARN) here.
     * 
     * @param certificateArn
     *        If you want your key provider to encrypt the content keys that it provides to MediaConvert, set up a
     *        certificate with a master key using AWS Certificate Manager. Specify the certificate's Amazon Resource
     *        Name (ARN) here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpekeKeyProviderCmaf withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * Specify the DRM system IDs that you want signaled in the DASH manifest that MediaConvert creates as part of this
     * CMAF package. The DASH manifest can currently signal up to three system IDs. For more information, see
     * https://dashif.org/identifiers/content_protection/.
     * 
     * @return Specify the DRM system IDs that you want signaled in the DASH manifest that MediaConvert creates as part
     *         of this CMAF package. The DASH manifest can currently signal up to three system IDs. For more
     *         information, see https://dashif.org/identifiers/content_protection/.
     */

    public java.util.List<String> getDashSignaledSystemIds() {
        return dashSignaledSystemIds;
    }

    /**
     * Specify the DRM system IDs that you want signaled in the DASH manifest that MediaConvert creates as part of this
     * CMAF package. The DASH manifest can currently signal up to three system IDs. For more information, see
     * https://dashif.org/identifiers/content_protection/.
     * 
     * @param dashSignaledSystemIds
     *        Specify the DRM system IDs that you want signaled in the DASH manifest that MediaConvert creates as part
     *        of this CMAF package. The DASH manifest can currently signal up to three system IDs. For more information,
     *        see https://dashif.org/identifiers/content_protection/.
     */

    public void setDashSignaledSystemIds(java.util.Collection<String> dashSignaledSystemIds) {
        if (dashSignaledSystemIds == null) {
            this.dashSignaledSystemIds = null;
            return;
        }

        this.dashSignaledSystemIds = new java.util.ArrayList<String>(dashSignaledSystemIds);
    }

    /**
     * Specify the DRM system IDs that you want signaled in the DASH manifest that MediaConvert creates as part of this
     * CMAF package. The DASH manifest can currently signal up to three system IDs. For more information, see
     * https://dashif.org/identifiers/content_protection/.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDashSignaledSystemIds(java.util.Collection)} or
     * {@link #withDashSignaledSystemIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dashSignaledSystemIds
     *        Specify the DRM system IDs that you want signaled in the DASH manifest that MediaConvert creates as part
     *        of this CMAF package. The DASH manifest can currently signal up to three system IDs. For more information,
     *        see https://dashif.org/identifiers/content_protection/.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpekeKeyProviderCmaf withDashSignaledSystemIds(String... dashSignaledSystemIds) {
        if (this.dashSignaledSystemIds == null) {
            setDashSignaledSystemIds(new java.util.ArrayList<String>(dashSignaledSystemIds.length));
        }
        for (String ele : dashSignaledSystemIds) {
            this.dashSignaledSystemIds.add(ele);
        }
        return this;
    }

    /**
     * Specify the DRM system IDs that you want signaled in the DASH manifest that MediaConvert creates as part of this
     * CMAF package. The DASH manifest can currently signal up to three system IDs. For more information, see
     * https://dashif.org/identifiers/content_protection/.
     * 
     * @param dashSignaledSystemIds
     *        Specify the DRM system IDs that you want signaled in the DASH manifest that MediaConvert creates as part
     *        of this CMAF package. The DASH manifest can currently signal up to three system IDs. For more information,
     *        see https://dashif.org/identifiers/content_protection/.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpekeKeyProviderCmaf withDashSignaledSystemIds(java.util.Collection<String> dashSignaledSystemIds) {
        setDashSignaledSystemIds(dashSignaledSystemIds);
        return this;
    }

    /**
     * Specify the DRM system ID that you want signaled in the HLS manifest that MediaConvert creates as part of this
     * CMAF package. The HLS manifest can currently signal only one system ID. For more information, see
     * https://dashif.org/identifiers/content_protection/.
     * 
     * @return Specify the DRM system ID that you want signaled in the HLS manifest that MediaConvert creates as part of
     *         this CMAF package. The HLS manifest can currently signal only one system ID. For more information, see
     *         https://dashif.org/identifiers/content_protection/.
     */

    public java.util.List<String> getHlsSignaledSystemIds() {
        return hlsSignaledSystemIds;
    }

    /**
     * Specify the DRM system ID that you want signaled in the HLS manifest that MediaConvert creates as part of this
     * CMAF package. The HLS manifest can currently signal only one system ID. For more information, see
     * https://dashif.org/identifiers/content_protection/.
     * 
     * @param hlsSignaledSystemIds
     *        Specify the DRM system ID that you want signaled in the HLS manifest that MediaConvert creates as part of
     *        this CMAF package. The HLS manifest can currently signal only one system ID. For more information, see
     *        https://dashif.org/identifiers/content_protection/.
     */

    public void setHlsSignaledSystemIds(java.util.Collection<String> hlsSignaledSystemIds) {
        if (hlsSignaledSystemIds == null) {
            this.hlsSignaledSystemIds = null;
            return;
        }

        this.hlsSignaledSystemIds = new java.util.ArrayList<String>(hlsSignaledSystemIds);
    }

    /**
     * Specify the DRM system ID that you want signaled in the HLS manifest that MediaConvert creates as part of this
     * CMAF package. The HLS manifest can currently signal only one system ID. For more information, see
     * https://dashif.org/identifiers/content_protection/.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHlsSignaledSystemIds(java.util.Collection)} or {@link #withHlsSignaledSystemIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param hlsSignaledSystemIds
     *        Specify the DRM system ID that you want signaled in the HLS manifest that MediaConvert creates as part of
     *        this CMAF package. The HLS manifest can currently signal only one system ID. For more information, see
     *        https://dashif.org/identifiers/content_protection/.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpekeKeyProviderCmaf withHlsSignaledSystemIds(String... hlsSignaledSystemIds) {
        if (this.hlsSignaledSystemIds == null) {
            setHlsSignaledSystemIds(new java.util.ArrayList<String>(hlsSignaledSystemIds.length));
        }
        for (String ele : hlsSignaledSystemIds) {
            this.hlsSignaledSystemIds.add(ele);
        }
        return this;
    }

    /**
     * Specify the DRM system ID that you want signaled in the HLS manifest that MediaConvert creates as part of this
     * CMAF package. The HLS manifest can currently signal only one system ID. For more information, see
     * https://dashif.org/identifiers/content_protection/.
     * 
     * @param hlsSignaledSystemIds
     *        Specify the DRM system ID that you want signaled in the HLS manifest that MediaConvert creates as part of
     *        this CMAF package. The HLS manifest can currently signal only one system ID. For more information, see
     *        https://dashif.org/identifiers/content_protection/.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpekeKeyProviderCmaf withHlsSignaledSystemIds(java.util.Collection<String> hlsSignaledSystemIds) {
        setHlsSignaledSystemIds(hlsSignaledSystemIds);
        return this;
    }

    /**
     * Specify the resource ID that your SPEKE-compliant key provider uses to identify this content.
     * 
     * @param resourceId
     *        Specify the resource ID that your SPEKE-compliant key provider uses to identify this content.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * Specify the resource ID that your SPEKE-compliant key provider uses to identify this content.
     * 
     * @return Specify the resource ID that your SPEKE-compliant key provider uses to identify this content.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * Specify the resource ID that your SPEKE-compliant key provider uses to identify this content.
     * 
     * @param resourceId
     *        Specify the resource ID that your SPEKE-compliant key provider uses to identify this content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpekeKeyProviderCmaf withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * Specify the URL to the key server that your SPEKE-compliant DRM key provider uses to provide keys for encrypting
     * your content.
     * 
     * @param url
     *        Specify the URL to the key server that your SPEKE-compliant DRM key provider uses to provide keys for
     *        encrypting your content.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Specify the URL to the key server that your SPEKE-compliant DRM key provider uses to provide keys for encrypting
     * your content.
     * 
     * @return Specify the URL to the key server that your SPEKE-compliant DRM key provider uses to provide keys for
     *         encrypting your content.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * Specify the URL to the key server that your SPEKE-compliant DRM key provider uses to provide keys for encrypting
     * your content.
     * 
     * @param url
     *        Specify the URL to the key server that your SPEKE-compliant DRM key provider uses to provide keys for
     *        encrypting your content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpekeKeyProviderCmaf withUrl(String url) {
        setUrl(url);
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
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getDashSignaledSystemIds() != null)
            sb.append("DashSignaledSystemIds: ").append(getDashSignaledSystemIds()).append(",");
        if (getHlsSignaledSystemIds() != null)
            sb.append("HlsSignaledSystemIds: ").append(getHlsSignaledSystemIds()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpekeKeyProviderCmaf == false)
            return false;
        SpekeKeyProviderCmaf other = (SpekeKeyProviderCmaf) obj;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getDashSignaledSystemIds() == null ^ this.getDashSignaledSystemIds() == null)
            return false;
        if (other.getDashSignaledSystemIds() != null && other.getDashSignaledSystemIds().equals(this.getDashSignaledSystemIds()) == false)
            return false;
        if (other.getHlsSignaledSystemIds() == null ^ this.getHlsSignaledSystemIds() == null)
            return false;
        if (other.getHlsSignaledSystemIds() != null && other.getHlsSignaledSystemIds().equals(this.getHlsSignaledSystemIds()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getDashSignaledSystemIds() == null) ? 0 : getDashSignaledSystemIds().hashCode());
        hashCode = prime * hashCode + ((getHlsSignaledSystemIds() == null) ? 0 : getHlsSignaledSystemIds().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public SpekeKeyProviderCmaf clone() {
        try {
            return (SpekeKeyProviderCmaf) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.SpekeKeyProviderCmafMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
