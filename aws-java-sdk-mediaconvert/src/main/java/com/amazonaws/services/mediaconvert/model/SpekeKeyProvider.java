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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Settings for use with a SPEKE key provider
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/SpekeKeyProvider" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpekeKeyProvider implements Serializable, Cloneable, StructuredPojo {

    /**
     * Optional AWS Certificate Manager ARN for a certificate to send to the keyprovider. The certificate holds a key
     * used by the keyprovider to encrypt the keys in its response.
     */
    private String certificateArn;
    /** The SPEKE-compliant server uses Resource ID (ResourceId) to identify content. */
    private String resourceId;
    /**
     * Relates to SPEKE implementation. DRM system identifiers. DASH output groups support a max of two system ids.
     * Other group types support one system id.
     */
    private java.util.List<String> systemIds;
    /** Use URL (Url) to specify the SPEKE-compliant server that will provide keys for content. */
    private String url;

    /**
     * Optional AWS Certificate Manager ARN for a certificate to send to the keyprovider. The certificate holds a key
     * used by the keyprovider to encrypt the keys in its response.
     * 
     * @param certificateArn
     *        Optional AWS Certificate Manager ARN for a certificate to send to the keyprovider. The certificate holds a
     *        key used by the keyprovider to encrypt the keys in its response.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * Optional AWS Certificate Manager ARN for a certificate to send to the keyprovider. The certificate holds a key
     * used by the keyprovider to encrypt the keys in its response.
     * 
     * @return Optional AWS Certificate Manager ARN for a certificate to send to the keyprovider. The certificate holds
     *         a key used by the keyprovider to encrypt the keys in its response.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * Optional AWS Certificate Manager ARN for a certificate to send to the keyprovider. The certificate holds a key
     * used by the keyprovider to encrypt the keys in its response.
     * 
     * @param certificateArn
     *        Optional AWS Certificate Manager ARN for a certificate to send to the keyprovider. The certificate holds a
     *        key used by the keyprovider to encrypt the keys in its response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpekeKeyProvider withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * The SPEKE-compliant server uses Resource ID (ResourceId) to identify content.
     * 
     * @param resourceId
     *        The SPEKE-compliant server uses Resource ID (ResourceId) to identify content.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * The SPEKE-compliant server uses Resource ID (ResourceId) to identify content.
     * 
     * @return The SPEKE-compliant server uses Resource ID (ResourceId) to identify content.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * The SPEKE-compliant server uses Resource ID (ResourceId) to identify content.
     * 
     * @param resourceId
     *        The SPEKE-compliant server uses Resource ID (ResourceId) to identify content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpekeKeyProvider withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * Relates to SPEKE implementation. DRM system identifiers. DASH output groups support a max of two system ids.
     * Other group types support one system id.
     * 
     * @return Relates to SPEKE implementation. DRM system identifiers. DASH output groups support a max of two system
     *         ids. Other group types support one system id.
     */

    public java.util.List<String> getSystemIds() {
        return systemIds;
    }

    /**
     * Relates to SPEKE implementation. DRM system identifiers. DASH output groups support a max of two system ids.
     * Other group types support one system id.
     * 
     * @param systemIds
     *        Relates to SPEKE implementation. DRM system identifiers. DASH output groups support a max of two system
     *        ids. Other group types support one system id.
     */

    public void setSystemIds(java.util.Collection<String> systemIds) {
        if (systemIds == null) {
            this.systemIds = null;
            return;
        }

        this.systemIds = new java.util.ArrayList<String>(systemIds);
    }

    /**
     * Relates to SPEKE implementation. DRM system identifiers. DASH output groups support a max of two system ids.
     * Other group types support one system id.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSystemIds(java.util.Collection)} or {@link #withSystemIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param systemIds
     *        Relates to SPEKE implementation. DRM system identifiers. DASH output groups support a max of two system
     *        ids. Other group types support one system id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpekeKeyProvider withSystemIds(String... systemIds) {
        if (this.systemIds == null) {
            setSystemIds(new java.util.ArrayList<String>(systemIds.length));
        }
        for (String ele : systemIds) {
            this.systemIds.add(ele);
        }
        return this;
    }

    /**
     * Relates to SPEKE implementation. DRM system identifiers. DASH output groups support a max of two system ids.
     * Other group types support one system id.
     * 
     * @param systemIds
     *        Relates to SPEKE implementation. DRM system identifiers. DASH output groups support a max of two system
     *        ids. Other group types support one system id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpekeKeyProvider withSystemIds(java.util.Collection<String> systemIds) {
        setSystemIds(systemIds);
        return this;
    }

    /**
     * Use URL (Url) to specify the SPEKE-compliant server that will provide keys for content.
     * 
     * @param url
     *        Use URL (Url) to specify the SPEKE-compliant server that will provide keys for content.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Use URL (Url) to specify the SPEKE-compliant server that will provide keys for content.
     * 
     * @return Use URL (Url) to specify the SPEKE-compliant server that will provide keys for content.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * Use URL (Url) to specify the SPEKE-compliant server that will provide keys for content.
     * 
     * @param url
     *        Use URL (Url) to specify the SPEKE-compliant server that will provide keys for content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpekeKeyProvider withUrl(String url) {
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getSystemIds() != null)
            sb.append("SystemIds: ").append(getSystemIds()).append(",");
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

        if (obj instanceof SpekeKeyProvider == false)
            return false;
        SpekeKeyProvider other = (SpekeKeyProvider) obj;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getSystemIds() == null ^ this.getSystemIds() == null)
            return false;
        if (other.getSystemIds() != null && other.getSystemIds().equals(this.getSystemIds()) == false)
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
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getSystemIds() == null) ? 0 : getSystemIds().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public SpekeKeyProvider clone() {
        try {
            return (SpekeKeyProvider) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.SpekeKeyProviderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
