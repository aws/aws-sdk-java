/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediapackagev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * List the HTTP live streaming (HLS) manifest configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/ListHlsManifestConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHlsManifestConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A short short string that's appended to the endpoint URL. The manifest name creates a unique path to this
     * endpoint. If you don't enter a value, MediaPackage uses the default manifest name, index. MediaPackage
     * automatically inserts the format extension, such as .m3u8. You can't use the same manifest name if you use HLS
     * manifest and low-latency HLS manifest. The manifestName on the HLSManifest object overrides the manifestName you
     * provided on the originEndpoint object.
     * </p>
     */
    private String manifestName;
    /**
     * <p>
     * A short string that's appended to the endpoint URL. The child manifest name creates a unique path to this
     * endpoint. If you don't enter a value, MediaPackage uses the default child manifest name, index_1. The
     * manifestName on the HLSManifest object overrides the manifestName you provided on the originEndpoint object.
     * </p>
     */
    private String childManifestName;
    /**
     * <p>
     * The egress domain URL for stream delivery from MediaPackage.
     * </p>
     */
    private String url;

    /**
     * <p>
     * A short short string that's appended to the endpoint URL. The manifest name creates a unique path to this
     * endpoint. If you don't enter a value, MediaPackage uses the default manifest name, index. MediaPackage
     * automatically inserts the format extension, such as .m3u8. You can't use the same manifest name if you use HLS
     * manifest and low-latency HLS manifest. The manifestName on the HLSManifest object overrides the manifestName you
     * provided on the originEndpoint object.
     * </p>
     * 
     * @param manifestName
     *        A short short string that's appended to the endpoint URL. The manifest name creates a unique path to this
     *        endpoint. If you don't enter a value, MediaPackage uses the default manifest name, index. MediaPackage
     *        automatically inserts the format extension, such as .m3u8. You can't use the same manifest name if you use
     *        HLS manifest and low-latency HLS manifest. The manifestName on the HLSManifest object overrides the
     *        manifestName you provided on the originEndpoint object.
     */

    public void setManifestName(String manifestName) {
        this.manifestName = manifestName;
    }

    /**
     * <p>
     * A short short string that's appended to the endpoint URL. The manifest name creates a unique path to this
     * endpoint. If you don't enter a value, MediaPackage uses the default manifest name, index. MediaPackage
     * automatically inserts the format extension, such as .m3u8. You can't use the same manifest name if you use HLS
     * manifest and low-latency HLS manifest. The manifestName on the HLSManifest object overrides the manifestName you
     * provided on the originEndpoint object.
     * </p>
     * 
     * @return A short short string that's appended to the endpoint URL. The manifest name creates a unique path to this
     *         endpoint. If you don't enter a value, MediaPackage uses the default manifest name, index. MediaPackage
     *         automatically inserts the format extension, such as .m3u8. You can't use the same manifest name if you
     *         use HLS manifest and low-latency HLS manifest. The manifestName on the HLSManifest object overrides the
     *         manifestName you provided on the originEndpoint object.
     */

    public String getManifestName() {
        return this.manifestName;
    }

    /**
     * <p>
     * A short short string that's appended to the endpoint URL. The manifest name creates a unique path to this
     * endpoint. If you don't enter a value, MediaPackage uses the default manifest name, index. MediaPackage
     * automatically inserts the format extension, such as .m3u8. You can't use the same manifest name if you use HLS
     * manifest and low-latency HLS manifest. The manifestName on the HLSManifest object overrides the manifestName you
     * provided on the originEndpoint object.
     * </p>
     * 
     * @param manifestName
     *        A short short string that's appended to the endpoint URL. The manifest name creates a unique path to this
     *        endpoint. If you don't enter a value, MediaPackage uses the default manifest name, index. MediaPackage
     *        automatically inserts the format extension, such as .m3u8. You can't use the same manifest name if you use
     *        HLS manifest and low-latency HLS manifest. The manifestName on the HLSManifest object overrides the
     *        manifestName you provided on the originEndpoint object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHlsManifestConfiguration withManifestName(String manifestName) {
        setManifestName(manifestName);
        return this;
    }

    /**
     * <p>
     * A short string that's appended to the endpoint URL. The child manifest name creates a unique path to this
     * endpoint. If you don't enter a value, MediaPackage uses the default child manifest name, index_1. The
     * manifestName on the HLSManifest object overrides the manifestName you provided on the originEndpoint object.
     * </p>
     * 
     * @param childManifestName
     *        A short string that's appended to the endpoint URL. The child manifest name creates a unique path to this
     *        endpoint. If you don't enter a value, MediaPackage uses the default child manifest name, index_1. The
     *        manifestName on the HLSManifest object overrides the manifestName you provided on the originEndpoint
     *        object.
     */

    public void setChildManifestName(String childManifestName) {
        this.childManifestName = childManifestName;
    }

    /**
     * <p>
     * A short string that's appended to the endpoint URL. The child manifest name creates a unique path to this
     * endpoint. If you don't enter a value, MediaPackage uses the default child manifest name, index_1. The
     * manifestName on the HLSManifest object overrides the manifestName you provided on the originEndpoint object.
     * </p>
     * 
     * @return A short string that's appended to the endpoint URL. The child manifest name creates a unique path to this
     *         endpoint. If you don't enter a value, MediaPackage uses the default child manifest name, index_1. The
     *         manifestName on the HLSManifest object overrides the manifestName you provided on the originEndpoint
     *         object.
     */

    public String getChildManifestName() {
        return this.childManifestName;
    }

    /**
     * <p>
     * A short string that's appended to the endpoint URL. The child manifest name creates a unique path to this
     * endpoint. If you don't enter a value, MediaPackage uses the default child manifest name, index_1. The
     * manifestName on the HLSManifest object overrides the manifestName you provided on the originEndpoint object.
     * </p>
     * 
     * @param childManifestName
     *        A short string that's appended to the endpoint URL. The child manifest name creates a unique path to this
     *        endpoint. If you don't enter a value, MediaPackage uses the default child manifest name, index_1. The
     *        manifestName on the HLSManifest object overrides the manifestName you provided on the originEndpoint
     *        object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHlsManifestConfiguration withChildManifestName(String childManifestName) {
        setChildManifestName(childManifestName);
        return this;
    }

    /**
     * <p>
     * The egress domain URL for stream delivery from MediaPackage.
     * </p>
     * 
     * @param url
     *        The egress domain URL for stream delivery from MediaPackage.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The egress domain URL for stream delivery from MediaPackage.
     * </p>
     * 
     * @return The egress domain URL for stream delivery from MediaPackage.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The egress domain URL for stream delivery from MediaPackage.
     * </p>
     * 
     * @param url
     *        The egress domain URL for stream delivery from MediaPackage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHlsManifestConfiguration withUrl(String url) {
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
        if (getManifestName() != null)
            sb.append("ManifestName: ").append(getManifestName()).append(",");
        if (getChildManifestName() != null)
            sb.append("ChildManifestName: ").append(getChildManifestName()).append(",");
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

        if (obj instanceof ListHlsManifestConfiguration == false)
            return false;
        ListHlsManifestConfiguration other = (ListHlsManifestConfiguration) obj;
        if (other.getManifestName() == null ^ this.getManifestName() == null)
            return false;
        if (other.getManifestName() != null && other.getManifestName().equals(this.getManifestName()) == false)
            return false;
        if (other.getChildManifestName() == null ^ this.getChildManifestName() == null)
            return false;
        if (other.getChildManifestName() != null && other.getChildManifestName().equals(this.getChildManifestName()) == false)
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

        hashCode = prime * hashCode + ((getManifestName() == null) ? 0 : getManifestName().hashCode());
        hashCode = prime * hashCode + ((getChildManifestName() == null) ? 0 : getChildManifestName().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public ListHlsManifestConfiguration clone() {
        try {
            return (ListHlsManifestConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackagev2.model.transform.ListHlsManifestConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
